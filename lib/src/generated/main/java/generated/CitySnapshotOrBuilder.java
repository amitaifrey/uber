// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scheme.proto

package generated;

public interface CitySnapshotOrBuilder extends
    // @@protoc_insertion_point(interface_extends:uber.CitySnapshot)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>repeated .uber.RideOfferSnapshot rides = 2;</code>
   */
  java.util.List<generated.RideOfferSnapshot> 
      getRidesList();
  /**
   * <code>repeated .uber.RideOfferSnapshot rides = 2;</code>
   */
  generated.RideOfferSnapshot getRides(int index);
  /**
   * <code>repeated .uber.RideOfferSnapshot rides = 2;</code>
   */
  int getRidesCount();
  /**
   * <code>repeated .uber.RideOfferSnapshot rides = 2;</code>
   */
  java.util.List<? extends generated.RideOfferSnapshotOrBuilder> 
      getRidesOrBuilderList();
  /**
   * <code>repeated .uber.RideOfferSnapshot rides = 2;</code>
   */
  generated.RideOfferSnapshotOrBuilder getRidesOrBuilder(
      int index);
}
