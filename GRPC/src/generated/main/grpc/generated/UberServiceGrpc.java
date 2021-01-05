package generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.0)",
    comments = "Source: scheme.proto")
public final class UberServiceGrpc {

  private UberServiceGrpc() {}

  public static final String SERVICE_NAME = "uber.UberService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.RideOffer,
      generated.RideOfferResponse> getOfferRideMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OfferRide",
      requestType = generated.RideOffer.class,
      responseType = generated.RideOfferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.RideOffer,
      generated.RideOfferResponse> getOfferRideMethod() {
    io.grpc.MethodDescriptor<generated.RideOffer, generated.RideOfferResponse> getOfferRideMethod;
    if ((getOfferRideMethod = UberServiceGrpc.getOfferRideMethod) == null) {
      synchronized (UberServiceGrpc.class) {
        if ((getOfferRideMethod = UberServiceGrpc.getOfferRideMethod) == null) {
          UberServiceGrpc.getOfferRideMethod = getOfferRideMethod =
              io.grpc.MethodDescriptor.<generated.RideOffer, generated.RideOfferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OfferRide"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.RideOffer.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.RideOfferResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UberServiceMethodDescriptorSupplier("OfferRide"))
              .build();
        }
      }
    }
    return getOfferRideMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.RideRequest,
      generated.RideRequestResponse> getRequestRideMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequestRide",
      requestType = generated.RideRequest.class,
      responseType = generated.RideRequestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.RideRequest,
      generated.RideRequestResponse> getRequestRideMethod() {
    io.grpc.MethodDescriptor<generated.RideRequest, generated.RideRequestResponse> getRequestRideMethod;
    if ((getRequestRideMethod = UberServiceGrpc.getRequestRideMethod) == null) {
      synchronized (UberServiceGrpc.class) {
        if ((getRequestRideMethod = UberServiceGrpc.getRequestRideMethod) == null) {
          UberServiceGrpc.getRequestRideMethod = getRequestRideMethod =
              io.grpc.MethodDescriptor.<generated.RideRequest, generated.RideRequestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RequestRide"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.RideRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.RideRequestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UberServiceMethodDescriptorSupplier("RequestRide"))
              .build();
        }
      }
    }
    return getRequestRideMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      generated.Snapshot> getCitySnapshotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CitySnapshot",
      requestType = com.google.protobuf.Empty.class,
      responseType = generated.Snapshot.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      generated.Snapshot> getCitySnapshotMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, generated.Snapshot> getCitySnapshotMethod;
    if ((getCitySnapshotMethod = UberServiceGrpc.getCitySnapshotMethod) == null) {
      synchronized (UberServiceGrpc.class) {
        if ((getCitySnapshotMethod = UberServiceGrpc.getCitySnapshotMethod) == null) {
          UberServiceGrpc.getCitySnapshotMethod = getCitySnapshotMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, generated.Snapshot>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CitySnapshot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Snapshot.getDefaultInstance()))
              .setSchemaDescriptor(new UberServiceMethodDescriptorSupplier("CitySnapshot"))
              .build();
        }
      }
    }
    return getCitySnapshotMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UberServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UberServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UberServiceStub>() {
        @java.lang.Override
        public UberServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UberServiceStub(channel, callOptions);
        }
      };
    return UberServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UberServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UberServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UberServiceBlockingStub>() {
        @java.lang.Override
        public UberServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UberServiceBlockingStub(channel, callOptions);
        }
      };
    return UberServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UberServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UberServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UberServiceFutureStub>() {
        @java.lang.Override
        public UberServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UberServiceFutureStub(channel, callOptions);
        }
      };
    return UberServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UberServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void offerRide(generated.RideOffer request,
        io.grpc.stub.StreamObserver<generated.RideOfferResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getOfferRideMethod(), responseObserver);
    }

    /**
     */
    public void requestRide(generated.RideRequest request,
        io.grpc.stub.StreamObserver<generated.RideRequestResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRequestRideMethod(), responseObserver);
    }

    /**
     */
    public void citySnapshot(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<generated.Snapshot> responseObserver) {
      asyncUnimplementedUnaryCall(getCitySnapshotMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getOfferRideMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.RideOffer,
                generated.RideOfferResponse>(
                  this, METHODID_OFFER_RIDE)))
          .addMethod(
            getRequestRideMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.RideRequest,
                generated.RideRequestResponse>(
                  this, METHODID_REQUEST_RIDE)))
          .addMethod(
            getCitySnapshotMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                generated.Snapshot>(
                  this, METHODID_CITY_SNAPSHOT)))
          .build();
    }
  }

  /**
   */
  public static final class UberServiceStub extends io.grpc.stub.AbstractAsyncStub<UberServiceStub> {
    private UberServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UberServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UberServiceStub(channel, callOptions);
    }

    /**
     */
    public void offerRide(generated.RideOffer request,
        io.grpc.stub.StreamObserver<generated.RideOfferResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOfferRideMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void requestRide(generated.RideRequest request,
        io.grpc.stub.StreamObserver<generated.RideRequestResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRequestRideMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void citySnapshot(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<generated.Snapshot> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCitySnapshotMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UberServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<UberServiceBlockingStub> {
    private UberServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UberServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UberServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public generated.RideOfferResponse offerRide(generated.RideOffer request) {
      return blockingUnaryCall(
          getChannel(), getOfferRideMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.RideRequestResponse requestRide(generated.RideRequest request) {
      return blockingUnaryCall(
          getChannel(), getRequestRideMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.Snapshot citySnapshot(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getCitySnapshotMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UberServiceFutureStub extends io.grpc.stub.AbstractFutureStub<UberServiceFutureStub> {
    private UberServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UberServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UberServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.RideOfferResponse> offerRide(
        generated.RideOffer request) {
      return futureUnaryCall(
          getChannel().newCall(getOfferRideMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.RideRequestResponse> requestRide(
        generated.RideRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRequestRideMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.Snapshot> citySnapshot(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getCitySnapshotMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_OFFER_RIDE = 0;
  private static final int METHODID_REQUEST_RIDE = 1;
  private static final int METHODID_CITY_SNAPSHOT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UberServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UberServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_OFFER_RIDE:
          serviceImpl.offerRide((generated.RideOffer) request,
              (io.grpc.stub.StreamObserver<generated.RideOfferResponse>) responseObserver);
          break;
        case METHODID_REQUEST_RIDE:
          serviceImpl.requestRide((generated.RideRequest) request,
              (io.grpc.stub.StreamObserver<generated.RideRequestResponse>) responseObserver);
          break;
        case METHODID_CITY_SNAPSHOT:
          serviceImpl.citySnapshot((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<generated.Snapshot>) responseObserver);
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

  private static abstract class UberServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UberServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.UberProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UberService");
    }
  }

  private static final class UberServiceFileDescriptorSupplier
      extends UberServiceBaseDescriptorSupplier {
    UberServiceFileDescriptorSupplier() {}
  }

  private static final class UberServiceMethodDescriptorSupplier
      extends UberServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UberServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UberServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UberServiceFileDescriptorSupplier())
              .addMethod(getOfferRideMethod())
              .addMethod(getRequestRideMethod())
              .addMethod(getCitySnapshotMethod())
              .build();
        }
      }
    }
    return result;
  }
}
