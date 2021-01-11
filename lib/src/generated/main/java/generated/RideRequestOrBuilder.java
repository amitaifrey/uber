// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scheme.proto

package generated;

public interface RideRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:uber.RideRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.uber.Person person = 1;</code>
   * @return Whether the person field is set.
   */
  boolean hasPerson();
  /**
   * <code>.uber.Person person = 1;</code>
   * @return The person.
   */
  generated.Person getPerson();
  /**
   * <code>.uber.Person person = 1;</code>
   */
  generated.PersonOrBuilder getPersonOrBuilder();

  /**
   * <code>string departure_date = 2;</code>
   * @return The departureDate.
   */
  java.lang.String getDepartureDate();
  /**
   * <code>string departure_date = 2;</code>
   * @return The bytes for departureDate.
   */
  com.google.protobuf.ByteString
      getDepartureDateBytes();

  /**
   * <code>repeated string cities = 3;</code>
   * @return A list containing the cities.
   */
  java.util.List<java.lang.String>
      getCitiesList();
  /**
   * <code>repeated string cities = 3;</code>
   * @return The count of cities.
   */
  int getCitiesCount();
  /**
   * <code>repeated string cities = 3;</code>
   * @param index The index of the element to return.
   * @return The cities at the given index.
   */
  java.lang.String getCities(int index);
  /**
   * <code>repeated string cities = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the cities at the given index.
   */
  com.google.protobuf.ByteString
      getCitiesBytes(int index);
}