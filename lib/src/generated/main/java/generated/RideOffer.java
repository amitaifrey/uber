// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scheme.proto

package generated;

/**
 * Protobuf type {@code uber.RideOffer}
 */
public final class RideOffer extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:uber.RideOffer)
    RideOfferOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RideOffer.newBuilder() to construct.
  private RideOffer(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RideOffer() {
    uuid_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RideOffer();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RideOffer(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            generated.Ride.Builder subBuilder = null;
            if (ride_ != null) {
              subBuilder = ride_.toBuilder();
            }
            ride_ = input.readMessage(generated.Ride.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(ride_);
              ride_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            generated.RideOfferInfo.Builder subBuilder = null;
            if (info_ != null) {
              subBuilder = info_.toBuilder();
            }
            info_ = input.readMessage(generated.RideOfferInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(info_);
              info_ = subBuilder.buildPartial();
            }

            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            uuid_ = s;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return generated.UberProto.internal_static_uber_RideOffer_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return generated.UberProto.internal_static_uber_RideOffer_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            generated.RideOffer.class, generated.RideOffer.Builder.class);
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

  public static final int RIDE_FIELD_NUMBER = 2;
  private generated.Ride ride_;
  /**
   * <code>.uber.Ride ride = 2;</code>
   * @return Whether the ride field is set.
   */
  @java.lang.Override
  public boolean hasRide() {
    return ride_ != null;
  }
  /**
   * <code>.uber.Ride ride = 2;</code>
   * @return The ride.
   */
  @java.lang.Override
  public generated.Ride getRide() {
    return ride_ == null ? generated.Ride.getDefaultInstance() : ride_;
  }
  /**
   * <code>.uber.Ride ride = 2;</code>
   */
  @java.lang.Override
  public generated.RideOrBuilder getRideOrBuilder() {
    return getRide();
  }

  public static final int INFO_FIELD_NUMBER = 3;
  private generated.RideOfferInfo info_;
  /**
   * <code>.uber.RideOfferInfo info = 3;</code>
   * @return Whether the info field is set.
   */
  @java.lang.Override
  public boolean hasInfo() {
    return info_ != null;
  }
  /**
   * <code>.uber.RideOfferInfo info = 3;</code>
   * @return The info.
   */
  @java.lang.Override
  public generated.RideOfferInfo getInfo() {
    return info_ == null ? generated.RideOfferInfo.getDefaultInstance() : info_;
  }
  /**
   * <code>.uber.RideOfferInfo info = 3;</code>
   */
  @java.lang.Override
  public generated.RideOfferInfoOrBuilder getInfoOrBuilder() {
    return getInfo();
  }

  public static final int UUID_FIELD_NUMBER = 4;
  private volatile java.lang.Object uuid_;
  /**
   * <code>string uuid = 4;</code>
   * @return The uuid.
   */
  @java.lang.Override
  public java.lang.String getUuid() {
    java.lang.Object ref = uuid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uuid_ = s;
      return s;
    }
  }
  /**
   * <code>string uuid = 4;</code>
   * @return The bytes for uuid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUuidBytes() {
    java.lang.Object ref = uuid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      uuid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (ride_ != null) {
      output.writeMessage(2, getRide());
    }
    if (info_ != null) {
      output.writeMessage(3, getInfo());
    }
    if (!getUuidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, uuid_);
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
    if (ride_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getRide());
    }
    if (info_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getInfo());
    }
    if (!getUuidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, uuid_);
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
    if (!(obj instanceof generated.RideOffer)) {
      return super.equals(obj);
    }
    generated.RideOffer other = (generated.RideOffer) obj;

    if (hasPerson() != other.hasPerson()) return false;
    if (hasPerson()) {
      if (!getPerson()
          .equals(other.getPerson())) return false;
    }
    if (hasRide() != other.hasRide()) return false;
    if (hasRide()) {
      if (!getRide()
          .equals(other.getRide())) return false;
    }
    if (hasInfo() != other.hasInfo()) return false;
    if (hasInfo()) {
      if (!getInfo()
          .equals(other.getInfo())) return false;
    }
    if (!getUuid()
        .equals(other.getUuid())) return false;
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
    if (hasRide()) {
      hash = (37 * hash) + RIDE_FIELD_NUMBER;
      hash = (53 * hash) + getRide().hashCode();
    }
    if (hasInfo()) {
      hash = (37 * hash) + INFO_FIELD_NUMBER;
      hash = (53 * hash) + getInfo().hashCode();
    }
    hash = (37 * hash) + UUID_FIELD_NUMBER;
    hash = (53 * hash) + getUuid().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static generated.RideOffer parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.RideOffer parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.RideOffer parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.RideOffer parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.RideOffer parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.RideOffer parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.RideOffer parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.RideOffer parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static generated.RideOffer parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static generated.RideOffer parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static generated.RideOffer parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.RideOffer parseFrom(
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
  public static Builder newBuilder(generated.RideOffer prototype) {
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
   * Protobuf type {@code uber.RideOffer}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:uber.RideOffer)
      generated.RideOfferOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return generated.UberProto.internal_static_uber_RideOffer_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return generated.UberProto.internal_static_uber_RideOffer_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              generated.RideOffer.class, generated.RideOffer.Builder.class);
    }

    // Construct using generated.RideOffer.newBuilder()
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
      if (rideBuilder_ == null) {
        ride_ = null;
      } else {
        ride_ = null;
        rideBuilder_ = null;
      }
      if (infoBuilder_ == null) {
        info_ = null;
      } else {
        info_ = null;
        infoBuilder_ = null;
      }
      uuid_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return generated.UberProto.internal_static_uber_RideOffer_descriptor;
    }

    @java.lang.Override
    public generated.RideOffer getDefaultInstanceForType() {
      return generated.RideOffer.getDefaultInstance();
    }

    @java.lang.Override
    public generated.RideOffer build() {
      generated.RideOffer result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public generated.RideOffer buildPartial() {
      generated.RideOffer result = new generated.RideOffer(this);
      if (personBuilder_ == null) {
        result.person_ = person_;
      } else {
        result.person_ = personBuilder_.build();
      }
      if (rideBuilder_ == null) {
        result.ride_ = ride_;
      } else {
        result.ride_ = rideBuilder_.build();
      }
      if (infoBuilder_ == null) {
        result.info_ = info_;
      } else {
        result.info_ = infoBuilder_.build();
      }
      result.uuid_ = uuid_;
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
      if (other instanceof generated.RideOffer) {
        return mergeFrom((generated.RideOffer)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(generated.RideOffer other) {
      if (other == generated.RideOffer.getDefaultInstance()) return this;
      if (other.hasPerson()) {
        mergePerson(other.getPerson());
      }
      if (other.hasRide()) {
        mergeRide(other.getRide());
      }
      if (other.hasInfo()) {
        mergeInfo(other.getInfo());
      }
      if (!other.getUuid().isEmpty()) {
        uuid_ = other.uuid_;
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
      generated.RideOffer parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (generated.RideOffer) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

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

    private generated.Ride ride_;
    private com.google.protobuf.SingleFieldBuilderV3<
        generated.Ride, generated.Ride.Builder, generated.RideOrBuilder> rideBuilder_;
    /**
     * <code>.uber.Ride ride = 2;</code>
     * @return Whether the ride field is set.
     */
    public boolean hasRide() {
      return rideBuilder_ != null || ride_ != null;
    }
    /**
     * <code>.uber.Ride ride = 2;</code>
     * @return The ride.
     */
    public generated.Ride getRide() {
      if (rideBuilder_ == null) {
        return ride_ == null ? generated.Ride.getDefaultInstance() : ride_;
      } else {
        return rideBuilder_.getMessage();
      }
    }
    /**
     * <code>.uber.Ride ride = 2;</code>
     */
    public Builder setRide(generated.Ride value) {
      if (rideBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ride_ = value;
        onChanged();
      } else {
        rideBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.uber.Ride ride = 2;</code>
     */
    public Builder setRide(
        generated.Ride.Builder builderForValue) {
      if (rideBuilder_ == null) {
        ride_ = builderForValue.build();
        onChanged();
      } else {
        rideBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.uber.Ride ride = 2;</code>
     */
    public Builder mergeRide(generated.Ride value) {
      if (rideBuilder_ == null) {
        if (ride_ != null) {
          ride_ =
            generated.Ride.newBuilder(ride_).mergeFrom(value).buildPartial();
        } else {
          ride_ = value;
        }
        onChanged();
      } else {
        rideBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.uber.Ride ride = 2;</code>
     */
    public Builder clearRide() {
      if (rideBuilder_ == null) {
        ride_ = null;
        onChanged();
      } else {
        ride_ = null;
        rideBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.uber.Ride ride = 2;</code>
     */
    public generated.Ride.Builder getRideBuilder() {
      
      onChanged();
      return getRideFieldBuilder().getBuilder();
    }
    /**
     * <code>.uber.Ride ride = 2;</code>
     */
    public generated.RideOrBuilder getRideOrBuilder() {
      if (rideBuilder_ != null) {
        return rideBuilder_.getMessageOrBuilder();
      } else {
        return ride_ == null ?
            generated.Ride.getDefaultInstance() : ride_;
      }
    }
    /**
     * <code>.uber.Ride ride = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        generated.Ride, generated.Ride.Builder, generated.RideOrBuilder> 
        getRideFieldBuilder() {
      if (rideBuilder_ == null) {
        rideBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            generated.Ride, generated.Ride.Builder, generated.RideOrBuilder>(
                getRide(),
                getParentForChildren(),
                isClean());
        ride_ = null;
      }
      return rideBuilder_;
    }

    private generated.RideOfferInfo info_;
    private com.google.protobuf.SingleFieldBuilderV3<
        generated.RideOfferInfo, generated.RideOfferInfo.Builder, generated.RideOfferInfoOrBuilder> infoBuilder_;
    /**
     * <code>.uber.RideOfferInfo info = 3;</code>
     * @return Whether the info field is set.
     */
    public boolean hasInfo() {
      return infoBuilder_ != null || info_ != null;
    }
    /**
     * <code>.uber.RideOfferInfo info = 3;</code>
     * @return The info.
     */
    public generated.RideOfferInfo getInfo() {
      if (infoBuilder_ == null) {
        return info_ == null ? generated.RideOfferInfo.getDefaultInstance() : info_;
      } else {
        return infoBuilder_.getMessage();
      }
    }
    /**
     * <code>.uber.RideOfferInfo info = 3;</code>
     */
    public Builder setInfo(generated.RideOfferInfo value) {
      if (infoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        info_ = value;
        onChanged();
      } else {
        infoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.uber.RideOfferInfo info = 3;</code>
     */
    public Builder setInfo(
        generated.RideOfferInfo.Builder builderForValue) {
      if (infoBuilder_ == null) {
        info_ = builderForValue.build();
        onChanged();
      } else {
        infoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.uber.RideOfferInfo info = 3;</code>
     */
    public Builder mergeInfo(generated.RideOfferInfo value) {
      if (infoBuilder_ == null) {
        if (info_ != null) {
          info_ =
            generated.RideOfferInfo.newBuilder(info_).mergeFrom(value).buildPartial();
        } else {
          info_ = value;
        }
        onChanged();
      } else {
        infoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.uber.RideOfferInfo info = 3;</code>
     */
    public Builder clearInfo() {
      if (infoBuilder_ == null) {
        info_ = null;
        onChanged();
      } else {
        info_ = null;
        infoBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.uber.RideOfferInfo info = 3;</code>
     */
    public generated.RideOfferInfo.Builder getInfoBuilder() {
      
      onChanged();
      return getInfoFieldBuilder().getBuilder();
    }
    /**
     * <code>.uber.RideOfferInfo info = 3;</code>
     */
    public generated.RideOfferInfoOrBuilder getInfoOrBuilder() {
      if (infoBuilder_ != null) {
        return infoBuilder_.getMessageOrBuilder();
      } else {
        return info_ == null ?
            generated.RideOfferInfo.getDefaultInstance() : info_;
      }
    }
    /**
     * <code>.uber.RideOfferInfo info = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        generated.RideOfferInfo, generated.RideOfferInfo.Builder, generated.RideOfferInfoOrBuilder> 
        getInfoFieldBuilder() {
      if (infoBuilder_ == null) {
        infoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            generated.RideOfferInfo, generated.RideOfferInfo.Builder, generated.RideOfferInfoOrBuilder>(
                getInfo(),
                getParentForChildren(),
                isClean());
        info_ = null;
      }
      return infoBuilder_;
    }

    private java.lang.Object uuid_ = "";
    /**
     * <code>string uuid = 4;</code>
     * @return The uuid.
     */
    public java.lang.String getUuid() {
      java.lang.Object ref = uuid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uuid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string uuid = 4;</code>
     * @return The bytes for uuid.
     */
    public com.google.protobuf.ByteString
        getUuidBytes() {
      java.lang.Object ref = uuid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        uuid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string uuid = 4;</code>
     * @param value The uuid to set.
     * @return This builder for chaining.
     */
    public Builder setUuid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      uuid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string uuid = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearUuid() {
      
      uuid_ = getDefaultInstance().getUuid();
      onChanged();
      return this;
    }
    /**
     * <code>string uuid = 4;</code>
     * @param value The bytes for uuid to set.
     * @return This builder for chaining.
     */
    public Builder setUuidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      uuid_ = value;
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


    // @@protoc_insertion_point(builder_scope:uber.RideOffer)
  }

  // @@protoc_insertion_point(class_scope:uber.RideOffer)
  private static final generated.RideOffer DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new generated.RideOffer();
  }

  public static generated.RideOffer getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RideOffer>
      PARSER = new com.google.protobuf.AbstractParser<RideOffer>() {
    @java.lang.Override
    public RideOffer parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RideOffer(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RideOffer> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RideOffer> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public generated.RideOffer getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

