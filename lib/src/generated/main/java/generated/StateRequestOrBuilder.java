// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scheme.proto

package generated;

public interface StateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:uber.StateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.uber.City city = 1;</code>
   * @return Whether the city field is set.
   */
  boolean hasCity();
  /**
   * <code>.uber.City city = 1;</code>
   * @return The city.
   */
  generated.City getCity();
  /**
   * <code>.uber.City city = 1;</code>
   */
  generated.CityOrBuilder getCityOrBuilder();

  /**
   * <code>string ip = 2;</code>
   * @return The ip.
   */
  java.lang.String getIp();
  /**
   * <code>string ip = 2;</code>
   * @return The bytes for ip.
   */
  com.google.protobuf.ByteString
      getIpBytes();
}