package org.example;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.example.grpc.HelloWorldGrpc;
import org.example.grpc.HelloWorldProto.HelloRequest;
import org.example.grpc.HelloWorldProto.HelloResponse;

/**
 * Main class to test all four types of gRPC calls from the client side.
 */
public class HelloWorldClient {

  public static void main(String[] args) throws InterruptedException {
    // Create a channel to connect to the server
    ManagedChannel channel = ManagedChannelBuilder
        .forAddress("localhost", 50051)
        .usePlaintext() // Disable SSL/TLS for simplicity
        .build();

    // Create stubs for synchronous and asynchronous communication
    HelloWorldGrpc.HelloWorldBlockingStub blockingStub = HelloWorldGrpc.newBlockingStub(channel);
    HelloWorldGrpc.HelloWorldStub asyncStub = HelloWorldGrpc.newStub(channel);

    // 1. Unary Call
    System.out.println("Unary Call:");
    HelloResponse unaryResponse = blockingStub.sayHello(
        HelloRequest.newBuilder().setName("World").build());
    System.out.println("Response: " + unaryResponse.getMessage());

    // 2. Server Streaming
    System.out.println("\nServer Streaming:");
    blockingStub.streamGreetings(HelloRequest.newBuilder().setName("Stream").build())
        .forEachRemaining(response -> System.out.println("Response: " + response.getMessage()));

    // 3. Client Streaming
    System.out.println("\nClient Streaming:");
    CountDownLatch latch = new CountDownLatch(1);
    StreamObserver<HelloRequest> clientStreamingObserver = asyncStub.sendGreetings(
        new StreamObserver<>() {
          @Override
          public void onNext(HelloResponse value) {
            System.out.println("Response: " + value.getMessage());
          }

          @Override
          public void onError(Throwable t) {
            t.printStackTrace();
          }

          @Override
          public void onCompleted() {
            latch.countDown();
          }
        });

    // Send multiple messages to the server
    clientStreamingObserver.onNext(HelloRequest.newBuilder().setName("Alice").build());
    clientStreamingObserver.onNext(HelloRequest.newBuilder().setName("Bob").build());
    clientStreamingObserver.onNext(HelloRequest.newBuilder().setName("Charlie").build());
    clientStreamingObserver.onCompleted();
    latch.await(1, TimeUnit.SECONDS);

    // 4. Bidirectional Streaming
    System.out.println("\nBidirectional Streaming:");
    CountDownLatch bidiLatch = new CountDownLatch(1);
    StreamObserver<HelloRequest> bidiStreamingObserver = asyncStub.chat(new StreamObserver<>() {
      @Override
      public void onNext(HelloResponse value) {
        System.out.println("Response: " + value.getMessage());
      }

      @Override
      public void onError(Throwable t) {
        t.printStackTrace();
      }

      @Override
      public void onCompleted() {
        bidiLatch.countDown();
      }
    });

    // Send and receive messages
    bidiStreamingObserver.onNext(HelloRequest.newBuilder().setName("Dave").build());
    bidiStreamingObserver.onNext(HelloRequest.newBuilder().setName("Eve").build());
    bidiStreamingObserver.onCompleted();
    bidiLatch.await(1, TimeUnit.SECONDS);

    // Shutdown the channel
    channel.shutdown();
  }
}

