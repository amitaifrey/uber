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
      com.google.protobuf.Empty> getAddRideOfferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddRideOffer",
      requestType = generated.RideOffer.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.RideOffer,
      com.google.protobuf.Empty> getAddRideOfferMethod() {
    io.grpc.MethodDescriptor<generated.RideOffer, com.google.protobuf.Empty> getAddRideOfferMethod;
    if ((getAddRideOfferMethod = UberServiceGrpc.getAddRideOfferMethod) == null) {
      synchronized (UberServiceGrpc.class) {
        if ((getAddRideOfferMethod = UberServiceGrpc.getAddRideOfferMethod) == null) {
          UberServiceGrpc.getAddRideOfferMethod = getAddRideOfferMethod =
              io.grpc.MethodDescriptor.<generated.RideOffer, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddRideOffer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.RideOffer.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UberServiceMethodDescriptorSupplier("AddRideOffer"))
              .build();
        }
      }
    }
    return getAddRideOfferMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.RideOffer,
      generated.Result> getLockRideMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LockRide",
      requestType = generated.RideOffer.class,
      responseType = generated.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.RideOffer,
      generated.Result> getLockRideMethod() {
    io.grpc.MethodDescriptor<generated.RideOffer, generated.Result> getLockRideMethod;
    if ((getLockRideMethod = UberServiceGrpc.getLockRideMethod) == null) {
      synchronized (UberServiceGrpc.class) {
        if ((getLockRideMethod = UberServiceGrpc.getLockRideMethod) == null) {
          UberServiceGrpc.getLockRideMethod = getLockRideMethod =
              io.grpc.MethodDescriptor.<generated.RideOffer, generated.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LockRide"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.RideOffer.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Result.getDefaultInstance()))
              .setSchemaDescriptor(new UberServiceMethodDescriptorSupplier("LockRide"))
              .build();
        }
      }
    }
    return getLockRideMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.CommitRequest,
      generated.Result> getCommitRideMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CommitRide",
      requestType = generated.CommitRequest.class,
      responseType = generated.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.CommitRequest,
      generated.Result> getCommitRideMethod() {
    io.grpc.MethodDescriptor<generated.CommitRequest, generated.Result> getCommitRideMethod;
    if ((getCommitRideMethod = UberServiceGrpc.getCommitRideMethod) == null) {
      synchronized (UberServiceGrpc.class) {
        if ((getCommitRideMethod = UberServiceGrpc.getCommitRideMethod) == null) {
          UberServiceGrpc.getCommitRideMethod = getCommitRideMethod =
              io.grpc.MethodDescriptor.<generated.CommitRequest, generated.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CommitRide"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.CommitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Result.getDefaultInstance()))
              .setSchemaDescriptor(new UberServiceMethodDescriptorSupplier("CommitRide"))
              .build();
        }
      }
    }
    return getCommitRideMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.RideOffer,
      generated.RideOffer> getAddRemoteRideMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddRemoteRide",
      requestType = generated.RideOffer.class,
      responseType = generated.RideOffer.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.RideOffer,
      generated.RideOffer> getAddRemoteRideMethod() {
    io.grpc.MethodDescriptor<generated.RideOffer, generated.RideOffer> getAddRemoteRideMethod;
    if ((getAddRemoteRideMethod = UberServiceGrpc.getAddRemoteRideMethod) == null) {
      synchronized (UberServiceGrpc.class) {
        if ((getAddRemoteRideMethod = UberServiceGrpc.getAddRemoteRideMethod) == null) {
          UberServiceGrpc.getAddRemoteRideMethod = getAddRemoteRideMethod =
              io.grpc.MethodDescriptor.<generated.RideOffer, generated.RideOffer>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddRemoteRide"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.RideOffer.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.RideOffer.getDefaultInstance()))
              .setSchemaDescriptor(new UberServiceMethodDescriptorSupplier("AddRemoteRide"))
              .build();
        }
      }
    }
    return getAddRemoteRideMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.RidePlanRequest,
      generated.PlanRideOffers> getRequestRideMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequestRide",
      requestType = generated.RidePlanRequest.class,
      responseType = generated.PlanRideOffers.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.RidePlanRequest,
      generated.PlanRideOffers> getRequestRideMethod() {
    io.grpc.MethodDescriptor<generated.RidePlanRequest, generated.PlanRideOffers> getRequestRideMethod;
    if ((getRequestRideMethod = UberServiceGrpc.getRequestRideMethod) == null) {
      synchronized (UberServiceGrpc.class) {
        if ((getRequestRideMethod = UberServiceGrpc.getRequestRideMethod) == null) {
          UberServiceGrpc.getRequestRideMethod = getRequestRideMethod =
              io.grpc.MethodDescriptor.<generated.RidePlanRequest, generated.PlanRideOffers>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RequestRide"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.RidePlanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.PlanRideOffers.getDefaultInstance()))
              .setSchemaDescriptor(new UberServiceMethodDescriptorSupplier("RequestRide"))
              .build();
        }
      }
    }
    return getRequestRideMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.City,
      generated.CitySnapshot> getGetCitySnapshotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCitySnapshot",
      requestType = generated.City.class,
      responseType = generated.CitySnapshot.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.City,
      generated.CitySnapshot> getGetCitySnapshotMethod() {
    io.grpc.MethodDescriptor<generated.City, generated.CitySnapshot> getGetCitySnapshotMethod;
    if ((getGetCitySnapshotMethod = UberServiceGrpc.getGetCitySnapshotMethod) == null) {
      synchronized (UberServiceGrpc.class) {
        if ((getGetCitySnapshotMethod = UberServiceGrpc.getGetCitySnapshotMethod) == null) {
          UberServiceGrpc.getGetCitySnapshotMethod = getGetCitySnapshotMethod =
              io.grpc.MethodDescriptor.<generated.City, generated.CitySnapshot>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCitySnapshot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.City.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.CitySnapshot.getDefaultInstance()))
              .setSchemaDescriptor(new UberServiceMethodDescriptorSupplier("GetCitySnapshot"))
              .build();
        }
      }
    }
    return getGetCitySnapshotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.StateRequest,
      com.google.protobuf.Empty> getRequestStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequestState",
      requestType = generated.StateRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.StateRequest,
      com.google.protobuf.Empty> getRequestStateMethod() {
    io.grpc.MethodDescriptor<generated.StateRequest, com.google.protobuf.Empty> getRequestStateMethod;
    if ((getRequestStateMethod = UberServiceGrpc.getRequestStateMethod) == null) {
      synchronized (UberServiceGrpc.class) {
        if ((getRequestStateMethod = UberServiceGrpc.getRequestStateMethod) == null) {
          UberServiceGrpc.getRequestStateMethod = getRequestStateMethod =
              io.grpc.MethodDescriptor.<generated.StateRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RequestState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.StateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UberServiceMethodDescriptorSupplier("RequestState"))
              .build();
        }
      }
    }
    return getRequestStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.State,
      com.google.protobuf.Empty> getSetStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetState",
      requestType = generated.State.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.State,
      com.google.protobuf.Empty> getSetStateMethod() {
    io.grpc.MethodDescriptor<generated.State, com.google.protobuf.Empty> getSetStateMethod;
    if ((getSetStateMethod = UberServiceGrpc.getSetStateMethod) == null) {
      synchronized (UberServiceGrpc.class) {
        if ((getSetStateMethod = UberServiceGrpc.getSetStateMethod) == null) {
          UberServiceGrpc.getSetStateMethod = getSetStateMethod =
              io.grpc.MethodDescriptor.<generated.State, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.State.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UberServiceMethodDescriptorSupplier("SetState"))
              .build();
        }
      }
    }
    return getSetStateMethod;
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
     * <pre>
     * shard ops
     * </pre>
     */
    public void addRideOffer(generated.RideOffer request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getAddRideOfferMethod(), responseObserver);
    }

    /**
     */
    public void lockRide(generated.RideOffer request,
        io.grpc.stub.StreamObserver<generated.Result> responseObserver) {
      asyncUnimplementedUnaryCall(getLockRideMethod(), responseObserver);
    }

    /**
     */
    public void commitRide(generated.CommitRequest request,
        io.grpc.stub.StreamObserver<generated.Result> responseObserver) {
      asyncUnimplementedUnaryCall(getCommitRideMethod(), responseObserver);
    }

    /**
     * <pre>
     * cluster ops
     * </pre>
     */
    public void addRemoteRide(generated.RideOffer request,
        io.grpc.stub.StreamObserver<generated.RideOffer> responseObserver) {
      asyncUnimplementedUnaryCall(getAddRemoteRideMethod(), responseObserver);
    }

    /**
     */
    public void requestRide(generated.RidePlanRequest request,
        io.grpc.stub.StreamObserver<generated.PlanRideOffers> responseObserver) {
      asyncUnimplementedUnaryCall(getRequestRideMethod(), responseObserver);
    }

    /**
     */
    public void getCitySnapshot(generated.City request,
        io.grpc.stub.StreamObserver<generated.CitySnapshot> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCitySnapshotMethod(), responseObserver);
    }

    /**
     */
    public void requestState(generated.StateRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getRequestStateMethod(), responseObserver);
    }

    /**
     */
    public void setState(generated.State request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getSetStateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddRideOfferMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.RideOffer,
                com.google.protobuf.Empty>(
                  this, METHODID_ADD_RIDE_OFFER)))
          .addMethod(
            getLockRideMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.RideOffer,
                generated.Result>(
                  this, METHODID_LOCK_RIDE)))
          .addMethod(
            getCommitRideMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.CommitRequest,
                generated.Result>(
                  this, METHODID_COMMIT_RIDE)))
          .addMethod(
            getAddRemoteRideMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.RideOffer,
                generated.RideOffer>(
                  this, METHODID_ADD_REMOTE_RIDE)))
          .addMethod(
            getRequestRideMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.RidePlanRequest,
                generated.PlanRideOffers>(
                  this, METHODID_REQUEST_RIDE)))
          .addMethod(
            getGetCitySnapshotMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.City,
                generated.CitySnapshot>(
                  this, METHODID_GET_CITY_SNAPSHOT)))
          .addMethod(
            getRequestStateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.StateRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_REQUEST_STATE)))
          .addMethod(
            getSetStateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.State,
                com.google.protobuf.Empty>(
                  this, METHODID_SET_STATE)))
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
     * <pre>
     * shard ops
     * </pre>
     */
    public void addRideOffer(generated.RideOffer request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddRideOfferMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void lockRide(generated.RideOffer request,
        io.grpc.stub.StreamObserver<generated.Result> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLockRideMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void commitRide(generated.CommitRequest request,
        io.grpc.stub.StreamObserver<generated.Result> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCommitRideMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * cluster ops
     * </pre>
     */
    public void addRemoteRide(generated.RideOffer request,
        io.grpc.stub.StreamObserver<generated.RideOffer> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddRemoteRideMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void requestRide(generated.RidePlanRequest request,
        io.grpc.stub.StreamObserver<generated.PlanRideOffers> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRequestRideMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCitySnapshot(generated.City request,
        io.grpc.stub.StreamObserver<generated.CitySnapshot> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCitySnapshotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void requestState(generated.StateRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRequestStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setState(generated.State request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetStateMethod(), getCallOptions()), request, responseObserver);
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
     * <pre>
     * shard ops
     * </pre>
     */
    public com.google.protobuf.Empty addRideOffer(generated.RideOffer request) {
      return blockingUnaryCall(
          getChannel(), getAddRideOfferMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.Result lockRide(generated.RideOffer request) {
      return blockingUnaryCall(
          getChannel(), getLockRideMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.Result commitRide(generated.CommitRequest request) {
      return blockingUnaryCall(
          getChannel(), getCommitRideMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * cluster ops
     * </pre>
     */
    public generated.RideOffer addRemoteRide(generated.RideOffer request) {
      return blockingUnaryCall(
          getChannel(), getAddRemoteRideMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.PlanRideOffers requestRide(generated.RidePlanRequest request) {
      return blockingUnaryCall(
          getChannel(), getRequestRideMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.CitySnapshot getCitySnapshot(generated.City request) {
      return blockingUnaryCall(
          getChannel(), getGetCitySnapshotMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty requestState(generated.StateRequest request) {
      return blockingUnaryCall(
          getChannel(), getRequestStateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty setState(generated.State request) {
      return blockingUnaryCall(
          getChannel(), getSetStateMethod(), getCallOptions(), request);
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
     * <pre>
     * shard ops
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> addRideOffer(
        generated.RideOffer request) {
      return futureUnaryCall(
          getChannel().newCall(getAddRideOfferMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.Result> lockRide(
        generated.RideOffer request) {
      return futureUnaryCall(
          getChannel().newCall(getLockRideMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.Result> commitRide(
        generated.CommitRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCommitRideMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * cluster ops
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.RideOffer> addRemoteRide(
        generated.RideOffer request) {
      return futureUnaryCall(
          getChannel().newCall(getAddRemoteRideMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.PlanRideOffers> requestRide(
        generated.RidePlanRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRequestRideMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.CitySnapshot> getCitySnapshot(
        generated.City request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCitySnapshotMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> requestState(
        generated.StateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRequestStateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> setState(
        generated.State request) {
      return futureUnaryCall(
          getChannel().newCall(getSetStateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_RIDE_OFFER = 0;
  private static final int METHODID_LOCK_RIDE = 1;
  private static final int METHODID_COMMIT_RIDE = 2;
  private static final int METHODID_ADD_REMOTE_RIDE = 3;
  private static final int METHODID_REQUEST_RIDE = 4;
  private static final int METHODID_GET_CITY_SNAPSHOT = 5;
  private static final int METHODID_REQUEST_STATE = 6;
  private static final int METHODID_SET_STATE = 7;

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
        case METHODID_ADD_RIDE_OFFER:
          serviceImpl.addRideOffer((generated.RideOffer) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LOCK_RIDE:
          serviceImpl.lockRide((generated.RideOffer) request,
              (io.grpc.stub.StreamObserver<generated.Result>) responseObserver);
          break;
        case METHODID_COMMIT_RIDE:
          serviceImpl.commitRide((generated.CommitRequest) request,
              (io.grpc.stub.StreamObserver<generated.Result>) responseObserver);
          break;
        case METHODID_ADD_REMOTE_RIDE:
          serviceImpl.addRemoteRide((generated.RideOffer) request,
              (io.grpc.stub.StreamObserver<generated.RideOffer>) responseObserver);
          break;
        case METHODID_REQUEST_RIDE:
          serviceImpl.requestRide((generated.RidePlanRequest) request,
              (io.grpc.stub.StreamObserver<generated.PlanRideOffers>) responseObserver);
          break;
        case METHODID_GET_CITY_SNAPSHOT:
          serviceImpl.getCitySnapshot((generated.City) request,
              (io.grpc.stub.StreamObserver<generated.CitySnapshot>) responseObserver);
          break;
        case METHODID_REQUEST_STATE:
          serviceImpl.requestState((generated.StateRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_SET_STATE:
          serviceImpl.setState((generated.State) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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
              .addMethod(getAddRideOfferMethod())
              .addMethod(getLockRideMethod())
              .addMethod(getCommitRideMethod())
              .addMethod(getAddRemoteRideMethod())
              .addMethod(getRequestRideMethod())
              .addMethod(getGetCitySnapshotMethod())
              .addMethod(getRequestStateMethod())
              .addMethod(getSetStateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
