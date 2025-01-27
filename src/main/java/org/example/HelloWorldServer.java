package org.example;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;


/**
 * Main class to start the gRPC server.
 */
public class HelloWorldServer {

  public static void main(String[] args) throws IOException, InterruptedException {
    // Create a gRPC server and bind the HelloWorldService
    Server server = ServerBuilder
        .forPort(50051) // Server will run on port 50051
        .addService(new HelloWorldService()) // Add the service implementation
        .build();

    System.out.println("Server started on port 50051");
    server.start(); // Start the server
    server.awaitTermination(); // Keep the server running
  }
}

