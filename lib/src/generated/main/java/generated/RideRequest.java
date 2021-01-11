// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scheme.proto

package generated;

/**
 * Protobuf type {@code uber.RideRequest}
 */
public final class RideRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:uber.RideRequest)
    RideRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RideRequest.newBuilder() to construct.
  private RideRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RideRequest() {
    departureDate_ = "";
    cities_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RideRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RideRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            generated.Person.Builder subBuilder = null;
            if (person_ != null) {
              subBuilder = person_.toBuilder();
            }
            person_ = input.readMessage(generated.Person.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(person_);
              person_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            departureDate_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              cities_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            cities_.add(s);
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        cities_ = cities_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return generated.UberProto.internal_static_uber_RideRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return generated.UberProto.internal_static_uber_RideRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            generated.RideRequest.class, generated.RideRequest.Builder.class);
  }

  public static final int PERSON_FIELD_NUMBER = 1;
  private generated.Person person_;
  /**
   * <code>.uber.Person person = 1;</code>
   * @return Whether the person field is set.
   */
  @java.lang.Override
  public boolean hasPerson() {
    return person_ != null;
  }
  /**
   * <code>.uber.Person person = 1;</code>
   * @return The person.
   */
  @java.lang.Override
  public generated.Person getPerson() {
    return person_ == null ? generated.Person.getDefaultInstance() : person_;
  }
  /**
   * <code>.uber.Person person = 1;</code>
   */
  @java.lang.Override
  public generated.PersonOrBuilder getPersonOrBuilder() {
    return getPerson();
  }

  public static final int DEPARTURE_DATE_FIELD_NUMBER = 2;
  private volatile java.lang.Object departureDate_;
  /**
   * <code>string departure_date = 2;</code>
   * @return The departureDate.
   */
  @java.lang.Override
  public java.lang.String getDepartureDate() {
    java.lang.Object ref = departureDate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      departureDate_ = s;
      return s;
    }
  }
  /**
   * <code>string departure_date = 2;</code>
   * @return The bytes for departureDate.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDepartureDateBytes() {
    java.lang.Object ref = departureDate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      departureDate_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CITIES_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList cities_;
  /**
   * <code>repeated string cities = 3;</code>
   * @return A list containing the cities.
   */
  public com.google.protobuf.ProtocolStringList
      getCitiesList() {
    return cities_;
  }
  /**
   * <code>repeated string cities = 3;</code>
   * @return The count of cities.
   */
  public int getCitiesCount() {
    return cities_.size();
  }
  /**
   * <code>repeated string cities = 3;</code>
   * @param index The index of the element to return.
   * @return The cities at the given index.
   */
  public java.lang.String getCities(int index) {
    return cities_.get(index);
  }
  /**
   * <code>repeated string cities = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the cities at the given index.
   */
  public com.google.protobuf.ByteString
      getCitiesBytes(int index) {
    return cities_.getByteString(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (person_ != null) {
      output.writeMessage(1, getPerson());
    }
    if (!getDepartureDateBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, departureDate_);
    }
    for (int i = 0; i < cities_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, cities_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (person_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPerson());
    }
    if (!getDepartureDateBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, departureDate_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < cities_.size(); i++) {
        dataSize += computeStringSizeNoTag(cities_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getCitiesList().size();
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof generated.RideRequest)) {
      return super.equals(obj);
    }
    generated.RideRequest other = (generated.RideRequest) obj;

    if (hasPerson() != other.hasPerson()) return false;
    if (hasPerson()) {
      if (!getPerson()
          .equals(other.getPerson())) return false;
    }
    if (!getDepartureDate()
        .equals(other.getDepartureDate())) return false;
    if (!getCitiesList()
        .equals(other.getCitiesList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasPerson()) {
      hash = (37 * hash) + PERSON_FIELD_NUMBER;
      hash = (53 * hash) + getPerson().hashCode();
    }
    hash = (37 * hash) + DEPARTURE_DATE_FIELD_NUMBER;
    hash = (53 * hash) + getDepartureDate().hashCode();
    if (getCitiesCount() > 0) {
      hash = (37 * hash) + CITIES_FIELD_NUMBER;
      hash = (53 * hash) + getCitiesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static generated.RideRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.RideRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.RideRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.RideRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.RideRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.RideRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.RideRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.RideRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static generated.RideRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static generated.RideRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static generated.RideRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.RideRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(generated.RideRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code uber.RideRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:uber.RideRequest)
      generated.RideRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return generated.UberProto.internal_static_uber_RideRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return generated.UberProto.internal_static_uber_RideRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              generated.RideRequest.class, generated.RideRequest.Builder.class);
    }

    // Construct using generated.RideRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (personBuilder_ == null) {
        person_ = null;
      } else {
        person_ = null;
        personBuilder_ = null;
      }
      departureDate_ = "";

      cities_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return generated.UberProto.internal_static_uber_RideRequest_descriptor;
    }

    @java.lang.Override
    public generated.RideRequest getDefaultInstanceForType() {
      return generated.RideRequest.getDefaultInstance();
    }

    @java.lang.Override
    public generated.RideRequest build() {
      generated.RideRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public generated.RideRequest buildPartial() {
      generated.RideRequest result = new generated.RideRequest(this);
      int from_bitField0_ = bitField0_;
      if (personBuilder_ == null) {
        result.person_ = person_;
      } else {
        result.person_ = personBuilder_.build();
      }
      result.departureDate_ = departureDate_;
      if (((bitField0_ & 0x00000001) != 0)) {
        cities_ = cities_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.cities_ = cities_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof generated.RideRequest) {
        return mergeFrom((generated.RideRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(generated.RideRequest other) {
      if (other == generated.RideRequest.getDefaultInstance()) return this;
      if (other.hasPerson()) {
        mergePerson(other.getPerson());
      }
      if (!other.getDepartureDate().isEmpty()) {
        departureDate_ = other.departureDate_;
        onChanged();
      }
      if (!other.cities_.isEmpty()) {
        if (cities_.isEmpty()) {
          cities_ = other.cities_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureCitiesIsMutable();
          cities_.addAll(other.cities_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      generated.RideRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (generated.RideRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private generated.Person person_;
    private com.google.protobuf.SingleFieldBuilderV3<
        generated.Person, generated.Person.Builder, generated.PersonOrBuilder> personBuilder_;
    /**
     * <code>.uber.Person person = 1;</code>
     * @return Whether the person field is set.
     */
    public boolean hasPerson() {
      return personBuilder_ != null || person_ != null;
    }
    /**
     * <code>.uber.Person person = 1;</code>
     * @return The person.
     */
    public generated.Person getPerson() {
      if (personBuilder_ == null) {
        return person_ == null ? generated.Person.getDefaultInstance() : person_;
      } else {
        return personBuilder_.getMessage();
      }
    }
    /**
     * <code>.uber.Person person = 1;</code>
     */
    public Builder setPerson(generated.Person value) {
      if (personBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        person_ = value;
        onChanged();
      } else {
        personBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.uber.Person person = 1;</code>
     */
    public Builder setPerson(
        generated.Person.Builder builderForValue) {
      if (personBuilder_ == null) {
        person_ = builderForValue.build();
        onChanged();
      } else {
        personBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.uber.Person person = 1;</code>
     */
    public Builder mergePerson(generated.Person value) {
      if (personBuilder_ == null) {
        if (person_ != null) {
          person_ =
            generated.Person.newBuilder(person_).mergeFrom(value).buildPartial();
        } else {
          person_ = value;
        }
        onChanged();
      } else {
        personBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.uber.Person person = 1;</code>
     */
    public Builder clearPerson() {
      if (personBuilder_ == null) {
        person_ = null;
        onChanged();
      } else {
        person_ = null;
        personBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.uber.Person person = 1;</code>
     */
    public generated.Person.Builder getPersonBuilder() {
      
      onChanged();
      return getPersonFieldBuilder().getBuilder();
    }
    /**
     * <code>.uber.Person person = 1;</code>
     */
    public generated.PersonOrBuilder getPersonOrBuilder() {
      if (personBuilder_ != null) {
        return personBuilder_.getMessageOrBuilder();
      } else {
        return person_ == null ?
            generated.Person.getDefaultInstance() : person_;
      }
    }
    /**
     * <code>.uber.Person person = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        generated.Person, generated.Person.Builder, generated.PersonOrBuilder> 
        getPersonFieldBuilder() {
      if (personBuilder_ == null) {
        personBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            generated.Person, generated.Person.Builder, generated.PersonOrBuilder>(
                getPerson(),
                getParentForChildren(),
                isClean());
        person_ = null;
      }
      return personBuilder_;
    }

    private java.lang.Object departureDate_ = "";
    /**
     * <code>string departure_date = 2;</code>
     * @return The departureDate.
     */
    public java.lang.String getDepartureDate() {
      java.lang.Object ref = departureDate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        departureDate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string departure_date = 2;</code>
     * @return The bytes for departureDate.
     */
    public com.google.protobuf.ByteString
        getDepartureDateBytes() {
      java.lang.Object ref = departureDate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        departureDate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string departure_date = 2;</code>
     * @param value The departureDate to set.
     * @return This builder for chaining.
     */
    public Builder setDepartureDate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      departureDate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string departure_date = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDepartureDate() {
      
      departureDate_ = getDefaultInstance().getDepartureDate();
      onChanged();
      return this;
    }
    /**
     * <code>string departure_date = 2;</code>
     * @param value The bytes for departureDate to set.
     * @return This builder for chaining.
     */
    public Builder setDepartureDateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      departureDate_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList cities_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureCitiesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        cities_ = new com.google.protobuf.LazyStringArrayList(cities_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string cities = 3;</code>
     * @return A list containing the cities.
     */
    public com.google.protobuf.ProtocolStringList
        getCitiesList() {
      return cities_.getUnmodifiableView();
    }
    /**
     * <code>repeated string cities = 3;</code>
     * @return The count of cities.
     */
    public int getCitiesCount() {
      return cities_.size();
    }
    /**
     * <code>repeated string cities = 3;</code>
     * @param index The index of the element to return.
     * @return The cities at the given index.
     */
    public java.lang.String getCities(int index) {
      return cities_.get(index);
    }
    /**
     * <code>repeated string cities = 3;</code>
     * @param index The index of the value to return.
     * @return The bytes of the cities at the given index.
     */
    public com.google.protobuf.ByteString
        getCitiesBytes(int index) {
      return cities_.getByteString(index);
    }
    /**
     * <code>repeated string cities = 3;</code>
     * @param index The index to set the value at.
     * @param value The cities to set.
     * @return This builder for chaining.
     */
    public Builder setCities(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureCitiesIsMutable();
      cities_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string cities = 3;</code>
     * @param value The cities to add.
     * @return This builder for chaining.
     */
    public Builder addCities(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureCitiesIsMutable();
      cities_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string cities = 3;</code>
     * @param values The cities to add.
     * @return This builder for chaining.
     */
    public Builder addAllCities(
        java.lang.Iterable<java.lang.String> values) {
      ensureCitiesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, cities_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string cities = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCities() {
      cities_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string cities = 3;</code>
     * @param value The bytes of the cities to add.
     * @return This builder for chaining.
     */
    public Builder addCitiesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureCitiesIsMutable();
      cities_.add(value);
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:uber.RideRequest)
  }

  // @@protoc_insertion_point(class_scope:uber.RideRequest)
  private static final generated.RideRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new generated.RideRequest();
  }

  public static generated.RideRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RideRequest>
      PARSER = new com.google.protobuf.AbstractParser<RideRequest>() {
    @java.lang.Override
    public RideRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RideRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RideRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RideRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public generated.RideRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
