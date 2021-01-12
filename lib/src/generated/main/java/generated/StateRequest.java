// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scheme.proto

package generated;

/**
 * Protobuf type {@code uber.StateRequest}
 */
public final class StateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:uber.StateRequest)
    StateRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StateRequest.newBuilder() to construct.
  private StateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StateRequest() {
    ip_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StateRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StateRequest(
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
            generated.City.Builder subBuilder = null;
            if (city_ != null) {
              subBuilder = city_.toBuilder();
            }
            city_ = input.readMessage(generated.City.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(city_);
              city_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            ip_ = s;
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
    return generated.UberProto.internal_static_uber_StateRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return generated.UberProto.internal_static_uber_StateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            generated.StateRequest.class, generated.StateRequest.Builder.class);
  }

  public static final int CITY_FIELD_NUMBER = 1;
  private generated.City city_;
  /**
   * <code>.uber.City city = 1;</code>
   * @return Whether the city field is set.
   */
  @java.lang.Override
  public boolean hasCity() {
    return city_ != null;
  }
  /**
   * <code>.uber.City city = 1;</code>
   * @return The city.
   */
  @java.lang.Override
  public generated.City getCity() {
    return city_ == null ? generated.City.getDefaultInstance() : city_;
  }
  /**
   * <code>.uber.City city = 1;</code>
   */
  @java.lang.Override
  public generated.CityOrBuilder getCityOrBuilder() {
    return getCity();
  }

  public static final int IP_FIELD_NUMBER = 2;
  private volatile java.lang.Object ip_;
  /**
   * <code>string ip = 2;</code>
   * @return The ip.
   */
  @java.lang.Override
  public java.lang.String getIp() {
    java.lang.Object ref = ip_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ip_ = s;
      return s;
    }
  }
  /**
   * <code>string ip = 2;</code>
   * @return The bytes for ip.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIpBytes() {
    java.lang.Object ref = ip_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ip_ = b;
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
    if (city_ != null) {
      output.writeMessage(1, getCity());
    }
    if (!getIpBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, ip_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (city_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCity());
    }
    if (!getIpBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, ip_);
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
    if (!(obj instanceof generated.StateRequest)) {
      return super.equals(obj);
    }
    generated.StateRequest other = (generated.StateRequest) obj;

    if (hasCity() != other.hasCity()) return false;
    if (hasCity()) {
      if (!getCity()
          .equals(other.getCity())) return false;
    }
    if (!getIp()
        .equals(other.getIp())) return false;
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
    if (hasCity()) {
      hash = (37 * hash) + CITY_FIELD_NUMBER;
      hash = (53 * hash) + getCity().hashCode();
    }
    hash = (37 * hash) + IP_FIELD_NUMBER;
    hash = (53 * hash) + getIp().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static generated.StateRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.StateRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.StateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.StateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.StateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.StateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.StateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.StateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static generated.StateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static generated.StateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static generated.StateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.StateRequest parseFrom(
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
  public static Builder newBuilder(generated.StateRequest prototype) {
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
   * Protobuf type {@code uber.StateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:uber.StateRequest)
      generated.StateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return generated.UberProto.internal_static_uber_StateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return generated.UberProto.internal_static_uber_StateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              generated.StateRequest.class, generated.StateRequest.Builder.class);
    }

    // Construct using generated.StateRequest.newBuilder()
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
      if (cityBuilder_ == null) {
        city_ = null;
      } else {
        city_ = null;
        cityBuilder_ = null;
      }
      ip_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return generated.UberProto.internal_static_uber_StateRequest_descriptor;
    }

    @java.lang.Override
    public generated.StateRequest getDefaultInstanceForType() {
      return generated.StateRequest.getDefaultInstance();
    }

    @java.lang.Override
    public generated.StateRequest build() {
      generated.StateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public generated.StateRequest buildPartial() {
      generated.StateRequest result = new generated.StateRequest(this);
      if (cityBuilder_ == null) {
        result.city_ = city_;
      } else {
        result.city_ = cityBuilder_.build();
      }
      result.ip_ = ip_;
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
      if (other instanceof generated.StateRequest) {
        return mergeFrom((generated.StateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(generated.StateRequest other) {
      if (other == generated.StateRequest.getDefaultInstance()) return this;
      if (other.hasCity()) {
        mergeCity(other.getCity());
      }
      if (!other.getIp().isEmpty()) {
        ip_ = other.ip_;
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
      generated.StateRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (generated.StateRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private generated.City city_;
    private com.google.protobuf.SingleFieldBuilderV3<
        generated.City, generated.City.Builder, generated.CityOrBuilder> cityBuilder_;
    /**
     * <code>.uber.City city = 1;</code>
     * @return Whether the city field is set.
     */
    public boolean hasCity() {
      return cityBuilder_ != null || city_ != null;
    }
    /**
     * <code>.uber.City city = 1;</code>
     * @return The city.
     */
    public generated.City getCity() {
      if (cityBuilder_ == null) {
        return city_ == null ? generated.City.getDefaultInstance() : city_;
      } else {
        return cityBuilder_.getMessage();
      }
    }
    /**
     * <code>.uber.City city = 1;</code>
     */
    public Builder setCity(generated.City value) {
      if (cityBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        city_ = value;
        onChanged();
      } else {
        cityBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.uber.City city = 1;</code>
     */
    public Builder setCity(
        generated.City.Builder builderForValue) {
      if (cityBuilder_ == null) {
        city_ = builderForValue.build();
        onChanged();
      } else {
        cityBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.uber.City city = 1;</code>
     */
    public Builder mergeCity(generated.City value) {
      if (cityBuilder_ == null) {
        if (city_ != null) {
          city_ =
            generated.City.newBuilder(city_).mergeFrom(value).buildPartial();
        } else {
          city_ = value;
        }
        onChanged();
      } else {
        cityBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.uber.City city = 1;</code>
     */
    public Builder clearCity() {
      if (cityBuilder_ == null) {
        city_ = null;
        onChanged();
      } else {
        city_ = null;
        cityBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.uber.City city = 1;</code>
     */
    public generated.City.Builder getCityBuilder() {
      
      onChanged();
      return getCityFieldBuilder().getBuilder();
    }
    /**
     * <code>.uber.City city = 1;</code>
     */
    public generated.CityOrBuilder getCityOrBuilder() {
      if (cityBuilder_ != null) {
        return cityBuilder_.getMessageOrBuilder();
      } else {
        return city_ == null ?
            generated.City.getDefaultInstance() : city_;
      }
    }
    /**
     * <code>.uber.City city = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        generated.City, generated.City.Builder, generated.CityOrBuilder> 
        getCityFieldBuilder() {
      if (cityBuilder_ == null) {
        cityBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            generated.City, generated.City.Builder, generated.CityOrBuilder>(
                getCity(),
                getParentForChildren(),
                isClean());
        city_ = null;
      }
      return cityBuilder_;
    }

    private java.lang.Object ip_ = "";
    /**
     * <code>string ip = 2;</code>
     * @return The ip.
     */
    public java.lang.String getIp() {
      java.lang.Object ref = ip_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ip_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string ip = 2;</code>
     * @return The bytes for ip.
     */
    public com.google.protobuf.ByteString
        getIpBytes() {
      java.lang.Object ref = ip_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ip_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ip = 2;</code>
     * @param value The ip to set.
     * @return This builder for chaining.
     */
    public Builder setIp(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ip_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string ip = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIp() {
      
      ip_ = getDefaultInstance().getIp();
      onChanged();
      return this;
    }
    /**
     * <code>string ip = 2;</code>
     * @param value The bytes for ip to set.
     * @return This builder for chaining.
     */
    public Builder setIpBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ip_ = value;
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


    // @@protoc_insertion_point(builder_scope:uber.StateRequest)
  }

  // @@protoc_insertion_point(class_scope:uber.StateRequest)
  private static final generated.StateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new generated.StateRequest();
  }

  public static generated.StateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StateRequest>
      PARSER = new com.google.protobuf.AbstractParser<StateRequest>() {
    @java.lang.Override
    public StateRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StateRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StateRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public generated.StateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
