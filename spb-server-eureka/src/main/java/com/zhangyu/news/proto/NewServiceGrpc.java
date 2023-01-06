package com.zhangyu.news.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.0)",
    comments = "Source: news.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class NewServiceGrpc {

  private NewServiceGrpc() {}

  public static final String SERVICE_NAME = "news.NewService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.zhangyu.news.proto.NewProto.NewsRequest,
      com.zhangyu.news.proto.NewProto.NewsResponse> getListNewsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listNews",
      requestType = com.zhangyu.news.proto.NewProto.NewsRequest.class,
      responseType = com.zhangyu.news.proto.NewProto.NewsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zhangyu.news.proto.NewProto.NewsRequest,
      com.zhangyu.news.proto.NewProto.NewsResponse> getListNewsMethod() {
    io.grpc.MethodDescriptor<com.zhangyu.news.proto.NewProto.NewsRequest, com.zhangyu.news.proto.NewProto.NewsResponse> getListNewsMethod;
    if ((getListNewsMethod = NewServiceGrpc.getListNewsMethod) == null) {
      synchronized (NewServiceGrpc.class) {
        if ((getListNewsMethod = NewServiceGrpc.getListNewsMethod) == null) {
          NewServiceGrpc.getListNewsMethod = getListNewsMethod =
              io.grpc.MethodDescriptor.<com.zhangyu.news.proto.NewProto.NewsRequest, com.zhangyu.news.proto.NewProto.NewsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listNews"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zhangyu.news.proto.NewProto.NewsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zhangyu.news.proto.NewProto.NewsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NewServiceMethodDescriptorSupplier("listNews"))
              .build();
        }
      }
    }
    return getListNewsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NewServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NewServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NewServiceStub>() {
        @java.lang.Override
        public NewServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NewServiceStub(channel, callOptions);
        }
      };
    return NewServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NewServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NewServiceBlockingStub>() {
        @java.lang.Override
        public NewServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NewServiceBlockingStub(channel, callOptions);
        }
      };
    return NewServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NewServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NewServiceFutureStub>() {
        @java.lang.Override
        public NewServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NewServiceFutureStub(channel, callOptions);
        }
      };
    return NewServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class NewServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void listNews(com.zhangyu.news.proto.NewProto.NewsRequest request,
        io.grpc.stub.StreamObserver<com.zhangyu.news.proto.NewProto.NewsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListNewsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListNewsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.zhangyu.news.proto.NewProto.NewsRequest,
                com.zhangyu.news.proto.NewProto.NewsResponse>(
                  this, METHODID_LIST_NEWS)))
          .build();
    }
  }

  /**
   */
  public static final class NewServiceStub extends io.grpc.stub.AbstractAsyncStub<NewServiceStub> {
    private NewServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NewServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NewServiceStub(channel, callOptions);
    }

    /**
     */
    public void listNews(com.zhangyu.news.proto.NewProto.NewsRequest request,
        io.grpc.stub.StreamObserver<com.zhangyu.news.proto.NewProto.NewsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListNewsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class NewServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<NewServiceBlockingStub> {
    private NewServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NewServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NewServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.zhangyu.news.proto.NewProto.NewsResponse listNews(com.zhangyu.news.proto.NewProto.NewsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListNewsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class NewServiceFutureStub extends io.grpc.stub.AbstractFutureStub<NewServiceFutureStub> {
    private NewServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NewServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NewServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zhangyu.news.proto.NewProto.NewsResponse> listNews(
        com.zhangyu.news.proto.NewProto.NewsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListNewsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_NEWS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NewServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NewServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_NEWS:
          serviceImpl.listNews((com.zhangyu.news.proto.NewProto.NewsRequest) request,
              (io.grpc.stub.StreamObserver<com.zhangyu.news.proto.NewProto.NewsResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class NewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NewServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.zhangyu.news.proto.NewProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NewService");
    }
  }

  private static final class NewServiceFileDescriptorSupplier
      extends NewServiceBaseDescriptorSupplier {
    NewServiceFileDescriptorSupplier() {}
  }

  private static final class NewServiceMethodDescriptorSupplier
      extends NewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NewServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (NewServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NewServiceFileDescriptorSupplier())
              .addMethod(getListNewsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
