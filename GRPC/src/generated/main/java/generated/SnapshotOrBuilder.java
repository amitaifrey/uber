// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scheme.proto

package generated;

public interface SnapshotOrBuilder extends
    // @@protoc_insertion_point(interface_extends:uber.Snapshot)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .uber.RideOffer rides = 1;</code>
   */
  java.util.List<generated.RideOffer> 
      getRidesList();
  /**
   * <code>repeated .uber.RideOffer rides = 1;</code>
   */
  generated.RideOffer getRides(int index);
  /**
   * <code>repeated .uber.RideOffer rides = 1;</code>
   */
  int getRidesCount();
  /**
   * <code>repeated .uber.RideOffer rides = 1;</code>
   */
  java.util.List<? extends generated.RideOfferOrBuilder> 
      getRidesOrBuilderList();
  /**
   * <code>repeated .uber.RideOffer rides = 1;</code>
   */
  generated.RideOfferOrBuilder getRidesOrBuilder(
      int index);

  /**
   * <code>repeated .uber.RideRequest requests = 2;</code>
   */
  java.util.List<generated.RideRequest> 
      getRequestsList();
  /**
   * <code>repeated .uber.RideRequest requests = 2;</code>
   */
  generated.RideRequest getRequests(int index);
  /**
   * <code>repeated .uber.RideRequest requests = 2;</code>
   */
  int getRequestsCount();
  /**
   * <code>repeated .uber.RideRequest requests = 2;</code>
   */
  java.util.List<? extends generated.RideRequestOrBuilder> 
      getRequestsOrBuilderList();
  /**
   * <code>repeated .uber.RideRequest requests = 2;</code>
   */
  generated.RideRequestOrBuilder getRequestsOrBuilder(
      int index);
}
