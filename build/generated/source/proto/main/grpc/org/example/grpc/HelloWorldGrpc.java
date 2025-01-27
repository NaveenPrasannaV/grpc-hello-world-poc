package org.example.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: hello_world.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HelloWorldGrpc {

  private HelloWorldGrpc() {}

  public static final java.lang.String SERVICE_NAME = "HelloWorld";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.grpc.HelloWorldProto.HelloRequest,
      org.example.grpc.HelloWorldProto.HelloResponse> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = org.example.grpc.HelloWorldProto.HelloRequest.class,
      responseType = org.example.grpc.HelloWorldProto.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.grpc.HelloWorldProto.HelloRequest,
      org.example.grpc.HelloWorldProto.HelloResponse> getSayHelloMethod() {
    io.grpc.MethodDescriptor<org.example.grpc.HelloWorldProto.HelloRequest, org.example.grpc.HelloWorldProto.HelloResponse> getSayHelloMethod;
    if ((getSayHelloMethod = HelloWorldGrpc.getSayHelloMethod) == null) {
      synchronized (HelloWorldGrpc.class) {
        if ((getSayHelloMethod = HelloWorldGrpc.getSayHelloMethod) == null) {
          HelloWorldGrpc.getSayHelloMethod = getSayHelloMethod =
              io.grpc.MethodDescriptor.<org.example.grpc.HelloWorldProto.HelloRequest, org.example.grpc.HelloWorldProto.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.HelloWorldProto.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.HelloWorldProto.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloWorldMethodDescriptorSupplier("SayHello"))
              .build();
        }
      }
    }
    return getSayHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.grpc.HelloWorldProto.HelloRequest,
      org.example.grpc.HelloWorldProto.HelloResponse> getStreamGreetingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamGreetings",
      requestType = org.example.grpc.HelloWorldProto.HelloRequest.class,
      responseType = org.example.grpc.HelloWorldProto.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.grpc.HelloWorldProto.HelloRequest,
      org.example.grpc.HelloWorldProto.HelloResponse> getStreamGreetingsMethod() {
    io.grpc.MethodDescriptor<org.example.grpc.HelloWorldProto.HelloRequest, org.example.grpc.HelloWorldProto.HelloResponse> getStreamGreetingsMethod;
    if ((getStreamGreetingsMethod = HelloWorldGrpc.getStreamGreetingsMethod) == null) {
      synchronized (HelloWorldGrpc.class) {
        if ((getStreamGreetingsMethod = HelloWorldGrpc.getStreamGreetingsMethod) == null) {
          HelloWorldGrpc.getStreamGreetingsMethod = getStreamGreetingsMethod =
              io.grpc.MethodDescriptor.<org.example.grpc.HelloWorldProto.HelloRequest, org.example.grpc.HelloWorldProto.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamGreetings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.HelloWorldProto.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.HelloWorldProto.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloWorldMethodDescriptorSupplier("StreamGreetings"))
              .build();
        }
      }
    }
    return getStreamGreetingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.grpc.HelloWorldProto.HelloRequest,
      org.example.grpc.HelloWorldProto.HelloResponse> getSendGreetingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendGreetings",
      requestType = org.example.grpc.HelloWorldProto.HelloRequest.class,
      responseType = org.example.grpc.HelloWorldProto.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.grpc.HelloWorldProto.HelloRequest,
      org.example.grpc.HelloWorldProto.HelloResponse> getSendGreetingsMethod() {
    io.grpc.MethodDescriptor<org.example.grpc.HelloWorldProto.HelloRequest, org.example.grpc.HelloWorldProto.HelloResponse> getSendGreetingsMethod;
    if ((getSendGreetingsMethod = HelloWorldGrpc.getSendGreetingsMethod) == null) {
      synchronized (HelloWorldGrpc.class) {
        if ((getSendGreetingsMethod = HelloWorldGrpc.getSendGreetingsMethod) == null) {
          HelloWorldGrpc.getSendGreetingsMethod = getSendGreetingsMethod =
              io.grpc.MethodDescriptor.<org.example.grpc.HelloWorldProto.HelloRequest, org.example.grpc.HelloWorldProto.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendGreetings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.HelloWorldProto.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.HelloWorldProto.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloWorldMethodDescriptorSupplier("SendGreetings"))
              .build();
        }
      }
    }
    return getSendGreetingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.grpc.HelloWorldProto.HelloRequest,
      org.example.grpc.HelloWorldProto.HelloResponse> getChatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Chat",
      requestType = org.example.grpc.HelloWorldProto.HelloRequest.class,
      responseType = org.example.grpc.HelloWorldProto.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.grpc.HelloWorldProto.HelloRequest,
      org.example.grpc.HelloWorldProto.HelloResponse> getChatMethod() {
    io.grpc.MethodDescriptor<org.example.grpc.HelloWorldProto.HelloRequest, org.example.grpc.HelloWorldProto.HelloResponse> getChatMethod;
    if ((getChatMethod = HelloWorldGrpc.getChatMethod) == null) {
      synchronized (HelloWorldGrpc.class) {
        if ((getChatMethod = HelloWorldGrpc.getChatMethod) == null) {
          HelloWorldGrpc.getChatMethod = getChatMethod =
              io.grpc.MethodDescriptor.<org.example.grpc.HelloWorldProto.HelloRequest, org.example.grpc.HelloWorldProto.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Chat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.HelloWorldProto.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.HelloWorldProto.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloWorldMethodDescriptorSupplier("Chat"))
              .build();
        }
      }
    }
    return getChatMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HelloWorldStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloWorldStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloWorldStub>() {
        @java.lang.Override
        public HelloWorldStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloWorldStub(channel, callOptions);
        }
      };
    return HelloWorldStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HelloWorldBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloWorldBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloWorldBlockingStub>() {
        @java.lang.Override
        public HelloWorldBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloWorldBlockingStub(channel, callOptions);
        }
      };
    return HelloWorldBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HelloWorldFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloWorldFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloWorldFutureStub>() {
        @java.lang.Override
        public HelloWorldFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloWorldFutureStub(channel, callOptions);
        }
      };
    return HelloWorldFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Unary RPC
     * </pre>
     */
    default void sayHello(org.example.grpc.HelloWorldProto.HelloRequest request,
        io.grpc.stub.StreamObserver<org.example.grpc.HelloWorldProto.HelloResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    /**
     * <pre>
     * Server Streaming RPC
     * </pre>
     */
    default void streamGreetings(org.example.grpc.HelloWorldProto.HelloRequest request,
        io.grpc.stub.StreamObserver<org.example.grpc.HelloWorldProto.HelloResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamGreetingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Client Streaming RPC
     * </pre>
     */
    default io.grpc.stub.StreamObserver<org.example.grpc.HelloWorldProto.HelloRequest> sendGreetings(
        io.grpc.stub.StreamObserver<org.example.grpc.HelloWorldProto.HelloResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSendGreetingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bidirectional Streaming RPC
     * </pre>
     */
    default io.grpc.stub.StreamObserver<org.example.grpc.HelloWorldProto.HelloRequest> chat(
        io.grpc.stub.StreamObserver<org.example.grpc.HelloWorldProto.HelloResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getChatMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service HelloWorld.
   */
  public static abstract class HelloWorldImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return HelloWorldGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service HelloWorld.
   */
  public static final class HelloWorldStub
      extends io.grpc.stub.AbstractAsyncStub<HelloWorldStub> {
    private HelloWorldStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloWorldStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloWorldStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary RPC
     * </pre>
     */
    public void sayHello(org.example.grpc.HelloWorldProto.HelloRequest request,
        io.grpc.stub.StreamObserver<org.example.grpc.HelloWorldProto.HelloResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Server Streaming RPC
     * </pre>
     */
    public void streamGreetings(org.example.grpc.HelloWorldProto.HelloRequest request,
        io.grpc.stub.StreamObserver<org.example.grpc.HelloWorldProto.HelloResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamGreetingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Client Streaming RPC
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.example.grpc.HelloWorldProto.HelloRequest> sendGreetings(
        io.grpc.stub.StreamObserver<org.example.grpc.HelloWorldProto.HelloResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getSendGreetingsMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Bidirectional Streaming RPC
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.example.grpc.HelloWorldProto.HelloRequest> chat(
        io.grpc.stub.StreamObserver<org.example.grpc.HelloWorldProto.HelloResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getChatMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service HelloWorld.
   */
  public static final class HelloWorldBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<HelloWorldBlockingStub> {
    private HelloWorldBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloWorldBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloWorldBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary RPC
     * </pre>
     */
    public org.example.grpc.HelloWorldProto.HelloResponse sayHello(org.example.grpc.HelloWorldProto.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Server Streaming RPC
     * </pre>
     */
    public java.util.Iterator<org.example.grpc.HelloWorldProto.HelloResponse> streamGreetings(
        org.example.grpc.HelloWorldProto.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamGreetingsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service HelloWorld.
   */
  public static final class HelloWorldFutureStub
      extends io.grpc.stub.AbstractFutureStub<HelloWorldFutureStub> {
    private HelloWorldFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloWorldFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloWorldFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary RPC
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.grpc.HelloWorldProto.HelloResponse> sayHello(
        org.example.grpc.HelloWorldProto.HelloRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;
  private static final int METHODID_STREAM_GREETINGS = 1;
  private static final int METHODID_SEND_GREETINGS = 2;
  private static final int METHODID_CHAT = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((org.example.grpc.HelloWorldProto.HelloRequest) request,
              (io.grpc.stub.StreamObserver<org.example.grpc.HelloWorldProto.HelloResponse>) responseObserver);
          break;
        case METHODID_STREAM_GREETINGS:
          serviceImpl.streamGreetings((org.example.grpc.HelloWorldProto.HelloRequest) request,
              (io.grpc.stub.StreamObserver<org.example.grpc.HelloWorldProto.HelloResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_GREETINGS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sendGreetings(
              (io.grpc.stub.StreamObserver<org.example.grpc.HelloWorldProto.HelloResponse>) responseObserver);
        case METHODID_CHAT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.chat(
              (io.grpc.stub.StreamObserver<org.example.grpc.HelloWorldProto.HelloResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getSayHelloMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.grpc.HelloWorldProto.HelloRequest,
              org.example.grpc.HelloWorldProto.HelloResponse>(
                service, METHODID_SAY_HELLO)))
        .addMethod(
          getStreamGreetingsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              org.example.grpc.HelloWorldProto.HelloRequest,
              org.example.grpc.HelloWorldProto.HelloResponse>(
                service, METHODID_STREAM_GREETINGS)))
        .addMethod(
          getSendGreetingsMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              org.example.grpc.HelloWorldProto.HelloRequest,
              org.example.grpc.HelloWorldProto.HelloResponse>(
                service, METHODID_SEND_GREETINGS)))
        .addMethod(
          getChatMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              org.example.grpc.HelloWorldProto.HelloRequest,
              org.example.grpc.HelloWorldProto.HelloResponse>(
                service, METHODID_CHAT)))
        .build();
  }

  private static abstract class HelloWorldBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HelloWorldBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.grpc.HelloWorldProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HelloWorld");
    }
  }

  private static final class HelloWorldFileDescriptorSupplier
      extends HelloWorldBaseDescriptorSupplier {
    HelloWorldFileDescriptorSupplier() {}
  }

  private static final class HelloWorldMethodDescriptorSupplier
      extends HelloWorldBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    HelloWorldMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (HelloWorldGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HelloWorldFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .addMethod(getStreamGreetingsMethod())
              .addMethod(getSendGreetingsMethod())
              .addMethod(getChatMethod())
              .build();
        }
      }
    }
    return result;
  }
}
