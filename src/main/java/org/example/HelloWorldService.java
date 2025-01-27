package org.example;

import io.grpc.stub.StreamObserver;
import org.example.grpc.HelloWorldGrpc;
import org.example.grpc.HelloWorldProto.HelloRequest;
import org.example.grpc.HelloWorldProto.HelloResponse;

/**
 * Implements the HelloWorld gRPC service with all four types of calls.
 */
public class HelloWorldService extends HelloWorldGrpc.HelloWorldImplBase {

  // Unary Call Implementation
  @Override
  public void sayHello(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
    // Create the response message
    String message = "Hello, " + request.getName() + "!";
    HelloResponse response = HelloResponse.newBuilder().setMessage(message).build();

    // Send the response back to the client
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  // Server Streaming Implementation
  @Override
  public void streamGreetings(HelloRequest request,
      StreamObserver<HelloResponse> responseObserver) {
    // Send multiple responses to the client
    for (int i = 1; i <= 5; i++) {
      String message = "Hello, " + request.getName() + "! (Message " + i + ")";
      HelloResponse response = HelloResponse.newBuilder().setMessage(message).build();
      responseObserver.onNext(response); // Send each response
    }
    responseObserver.onCompleted(); // Signal the end of streaming
  }

  // Client Streaming Implementation
  @Override
  public StreamObserver<HelloRequest> sendGreetings(
      StreamObserver<HelloResponse> responseObserver) {
    // Return a StreamObserver to handle client requests
    return new StreamObserver<>() {
      StringBuilder names = new StringBuilder();

      @Override
      public void onNext(HelloRequest request) {
        // Collect all names sent by the client
        names.append(request.getName()).append(", ");
      }

      @Override
      public void onError(Throwable t) {
        // Handle errors
        t.printStackTrace();
      }

      @Override
      public void onCompleted() {
        // Send a single response after receiving all client messages
        String message = "Hello, " + names.toString() + "!";
        HelloResponse response = HelloResponse.newBuilder().setMessage(message).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
      }
    };
  }

  // Bidirectional Streaming Implementation
  @Override
  public StreamObserver<HelloRequest> chat(StreamObserver<HelloResponse> responseObserver) {
    // Return a StreamObserver to handle bidirectional communication
    return new StreamObserver<>() {
      @Override
      public void onNext(HelloRequest request) {
        // Respond to each message from the client
        String message = "Hello, " + request.getName() + "!";
        HelloResponse response = HelloResponse.newBuilder().setMessage(message).build();
        responseObserver.onNext(response); // Send the response
      }

      @Override
      public void onError(Throwable t) {
        // Handle errors
        t.printStackTrace();
      }

      @Override
      public void onCompleted() {
        // Signal the end of communication
        responseObserver.onCompleted();
      }
    };
  }
}

