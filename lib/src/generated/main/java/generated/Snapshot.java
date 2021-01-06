// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scheme.proto

package generated;

/**
 * Protobuf type {@code uber.Snapshot}
 */
public final class Snapshot extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:uber.Snapshot)
    SnapshotOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Snapshot.newBuilder() to construct.
  private Snapshot(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Snapshot() {
    rides_ = java.util.Collections.emptyList();
    requests_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Snapshot();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Snapshot(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              rides_ = new java.util.ArrayList<generated.RideOffer>();
              mutable_bitField0_ |= 0x00000001;
            }
            rides_.add(
                input.readMessage(generated.RideOffer.parser(), extensionRegistry));
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              requests_ = new java.util.ArrayList<generated.RideRequest>();
              mutable_bitField0_ |= 0x00000002;
            }
            requests_.add(
                input.readMessage(generated.RideRequest.parser(), extensionRegistry));
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
        rides_ = java.util.Collections.unmodifiableList(rides_);
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        requests_ = java.util.Collections.unmodifiableList(requests_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return generated.UberProto.internal_static_uber_Snapshot_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return generated.UberProto.internal_static_uber_Snapshot_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            generated.Snapshot.class, generated.Snapshot.Builder.class);
  }

  public static final int RIDES_FIELD_NUMBER = 1;
  private java.util.List<generated.RideOffer> rides_;
  /**
   * <code>repeated .uber.RideOffer rides = 1;</code>
   */
  @java.lang.Override
  public java.util.List<generated.RideOffer> getRidesList() {
    return rides_;
  }
  /**
   * <code>repeated .uber.RideOffer rides = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends generated.RideOfferOrBuilder> 
      getRidesOrBuilderList() {
    return rides_;
  }
  /**
   * <code>repeated .uber.RideOffer rides = 1;</code>
   */
  @java.lang.Override
  public int getRidesCount() {
    return rides_.size();
  }
  /**
   * <code>repeated .uber.RideOffer rides = 1;</code>
   */
  @java.lang.Override
  public generated.RideOffer getRides(int index) {
    return rides_.get(index);
  }
  /**
   * <code>repeated .uber.RideOffer rides = 1;</code>
   */
  @java.lang.Override
  public generated.RideOfferOrBuilder getRidesOrBuilder(
      int index) {
    return rides_.get(index);
  }

  public static final int REQUESTS_FIELD_NUMBER = 2;
  private java.util.List<generated.RideRequest> requests_;
  /**
   * <code>repeated .uber.RideRequest requests = 2;</code>
   */
  @java.lang.Override
  public java.util.List<generated.RideRequest> getRequestsList() {
    return requests_;
  }
  /**
   * <code>repeated .uber.RideRequest requests = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends generated.RideRequestOrBuilder> 
      getRequestsOrBuilderList() {
    return requests_;
  }
  /**
   * <code>repeated .uber.RideRequest requests = 2;</code>
   */
  @java.lang.Override
  public int getRequestsCount() {
    return requests_.size();
  }
  /**
   * <code>repeated .uber.RideRequest requests = 2;</code>
   */
  @java.lang.Override
  public generated.RideRequest getRequests(int index) {
    return requests_.get(index);
  }
  /**
   * <code>repeated .uber.RideRequest requests = 2;</code>
   */
  @java.lang.Override
  public generated.RideRequestOrBuilder getRequestsOrBuilder(
      int index) {
    return requests_.get(index);
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
    for (int i = 0; i < rides_.size(); i++) {
      output.writeMessage(1, rides_.get(i));
    }
    for (int i = 0; i < requests_.size(); i++) {
      output.writeMessage(2, requests_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < rides_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, rides_.get(i));
    }
    for (int i = 0; i < requests_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, requests_.get(i));
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
    if (!(obj instanceof generated.Snapshot)) {
      return super.equals(obj);
    }
    generated.Snapshot other = (generated.Snapshot) obj;

    if (!getRidesList()
        .equals(other.getRidesList())) return false;
    if (!getRequestsList()
        .equals(other.getRequestsList())) return false;
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
    if (getRidesCount() > 0) {
      hash = (37 * hash) + RIDES_FIELD_NUMBER;
      hash = (53 * hash) + getRidesList().hashCode();
    }
    if (getRequestsCount() > 0) {
      hash = (37 * hash) + REQUESTS_FIELD_NUMBER;
      hash = (53 * hash) + getRequestsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static generated.Snapshot parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.Snapshot parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.Snapshot parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.Snapshot parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.Snapshot parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.Snapshot parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.Snapshot parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.Snapshot parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static generated.Snapshot parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static generated.Snapshot parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static generated.Snapshot parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.Snapshot parseFrom(
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
  public static Builder newBuilder(generated.Snapshot prototype) {
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
   * Protobuf type {@code uber.Snapshot}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:uber.Snapshot)
      generated.SnapshotOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return generated.UberProto.internal_static_uber_Snapshot_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return generated.UberProto.internal_static_uber_Snapshot_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              generated.Snapshot.class, generated.Snapshot.Builder.class);
    }

    // Construct using generated.Snapshot.newBuilder()
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
        getRidesFieldBuilder();
        getRequestsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (ridesBuilder_ == null) {
        rides_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        ridesBuilder_.clear();
      }
      if (requestsBuilder_ == null) {
        requests_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        requestsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return generated.UberProto.internal_static_uber_Snapshot_descriptor;
    }

    @java.lang.Override
    public generated.Snapshot getDefaultInstanceForType() {
      return generated.Snapshot.getDefaultInstance();
    }

    @java.lang.Override
    public generated.Snapshot build() {
      generated.Snapshot result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public generated.Snapshot buildPartial() {
      generated.Snapshot result = new generated.Snapshot(this);
      int from_bitField0_ = bitField0_;
      if (ridesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          rides_ = java.util.Collections.unmodifiableList(rides_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.rides_ = rides_;
      } else {
        result.rides_ = ridesBuilder_.build();
      }
      if (requestsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          requests_ = java.util.Collections.unmodifiableList(requests_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.requests_ = requests_;
      } else {
        result.requests_ = requestsBuilder_.build();
      }
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
      if (other instanceof generated.Snapshot) {
        return mergeFrom((generated.Snapshot)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(generated.Snapshot other) {
      if (other == generated.Snapshot.getDefaultInstance()) return this;
      if (ridesBuilder_ == null) {
        if (!other.rides_.isEmpty()) {
          if (rides_.isEmpty()) {
            rides_ = other.rides_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRidesIsMutable();
            rides_.addAll(other.rides_);
          }
          onChanged();
        }
      } else {
        if (!other.rides_.isEmpty()) {
          if (ridesBuilder_.isEmpty()) {
            ridesBuilder_.dispose();
            ridesBuilder_ = null;
            rides_ = other.rides_;
            bitField0_ = (bitField0_ & ~0x00000001);
            ridesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRidesFieldBuilder() : null;
          } else {
            ridesBuilder_.addAllMessages(other.rides_);
          }
        }
      }
      if (requestsBuilder_ == null) {
        if (!other.requests_.isEmpty()) {
          if (requests_.isEmpty()) {
            requests_ = other.requests_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureRequestsIsMutable();
            requests_.addAll(other.requests_);
          }
          onChanged();
        }
      } else {
        if (!other.requests_.isEmpty()) {
          if (requestsBuilder_.isEmpty()) {
            requestsBuilder_.dispose();
            requestsBuilder_ = null;
            requests_ = other.requests_;
            bitField0_ = (bitField0_ & ~0x00000002);
            requestsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRequestsFieldBuilder() : null;
          } else {
            requestsBuilder_.addAllMessages(other.requests_);
          }
        }
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
      generated.Snapshot parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (generated.Snapshot) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<generated.RideOffer> rides_ =
      java.util.Collections.emptyList();
    private void ensureRidesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        rides_ = new java.util.ArrayList<generated.RideOffer>(rides_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        generated.RideOffer, generated.RideOffer.Builder, generated.RideOfferOrBuilder> ridesBuilder_;

    /**
     * <code>repeated .uber.RideOffer rides = 1;</code>
     */
    public java.util.List<generated.RideOffer> getRidesList() {
      if (ridesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(rides_);
      } else {
        return ridesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .uber.RideOffer rides = 1;</code>
     */
    public int getRidesCount() {
      if (ridesBuilder_ == null) {
        return rides_.size();
      } else {
        return ridesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .uber.RideOffer rides = 1;</code>
     */
    public generated.RideOffer getRides(int index) {
      if (ridesBuilder_ == null) {
        return rides_.get(index);
      } else {
        return ridesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .uber.RideOffer rides = 1;</code>
     */
    public Builder setRides(
        int index, generated.RideOffer value) {
      if (ridesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRidesIsMutable();
        rides_.set(index, value);
        onChanged();
      } else {
        ridesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .uber.RideOffer rides = 1;</code>
     */
    public Builder setRides(
        int index, generated.RideOffer.Builder builderForValue) {
      if (ridesBuilder_ == null) {
        ensureRidesIsMutable();
        rides_.set(index, builderForValue.build());
        onChanged();
      } else {
        ridesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .uber.RideOffer rides = 1;</code>
     */
    public Builder addRides(generated.RideOffer value) {
      if (ridesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRidesIsMutable();
        rides_.add(value);
        onChanged();
      } else {
        ridesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .uber.RideOffer rides = 1;</code>
     */
    public Builder addRides(
        int index, generated.RideOffer value) {
      if (ridesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRidesIsMutable();
        rides_.add(index, value);
        onChanged();
      } else {
        ridesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .uber.RideOffer rides = 1;</code>
     */
    public Builder addRides(
        generated.RideOffer.Builder builderForValue) {
      if (ridesBuilder_ == null) {
        ensureRidesIsMutable();
        rides_.add(builderForValue.build());
        onChanged();
      } else {
        ridesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .uber.RideOffer rides = 1;</code>
     */
    public Builder addRides(
        int index, generated.RideOffer.Builder builderForValue) {
      if (ridesBuilder_ == null) {
        ensureRidesIsMutable();
        rides_.add(index, builderForValue.build());
        onChanged();
      } else {
        ridesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .uber.RideOffer rides = 1;</code>
     */
    public Builder addAllRides(
        java.lang.Iterable<? extends generated.RideOffer> values) {
      if (ridesBuilder_ == null) {
        ensureRidesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, rides_);
        onChanged();
      } else {
        ridesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .uber.RideOffer rides = 1;</code>
     */
    public Builder clearRides() {
      if (ridesBuilder_ == null) {
        rides_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        ridesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .uber.RideOffer rides = 1;</code>
     */
    public Builder removeRides(int index) {
      if (ridesBuilder_ == null) {
        ensureRidesIsMutable();
        rides_.remove(index);
        onChanged();
      } else {
        ridesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .uber.RideOffer rides = 1;</code>
     */
    public generated.RideOffer.Builder getRidesBuilder(
        int index) {
      return getRidesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .uber.RideOffer rides = 1;</code>
     */
    public generated.RideOfferOrBuilder getRidesOrBuilder(
        int index) {
      if (ridesBuilder_ == null) {
        return rides_.get(index);  } else {
        return ridesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .uber.RideOffer rides = 1;</code>
     */
    public java.util.List<? extends generated.RideOfferOrBuilder> 
         getRidesOrBuilderList() {
      if (ridesBuilder_ != null) {
        return ridesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(rides_);
      }
    }
    /**
     * <code>repeated .uber.RideOffer rides = 1;</code>
     */
    public generated.RideOffer.Builder addRidesBuilder() {
      return getRidesFieldBuilder().addBuilder(
          generated.RideOffer.getDefaultInstance());
    }
    /**
     * <code>repeated .uber.RideOffer rides = 1;</code>
     */
    public generated.RideOffer.Builder addRidesBuilder(
        int index) {
      return getRidesFieldBuilder().addBuilder(
          index, generated.RideOffer.getDefaultInstance());
    }
    /**
     * <code>repeated .uber.RideOffer rides = 1;</code>
     */
    public java.util.List<generated.RideOffer.Builder> 
         getRidesBuilderList() {
      return getRidesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        generated.RideOffer, generated.RideOffer.Builder, generated.RideOfferOrBuilder> 
        getRidesFieldBuilder() {
      if (ridesBuilder_ == null) {
        ridesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            generated.RideOffer, generated.RideOffer.Builder, generated.RideOfferOrBuilder>(
                rides_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        rides_ = null;
      }
      return ridesBuilder_;
    }

    private java.util.List<generated.RideRequest> requests_ =
      java.util.Collections.emptyList();
    private void ensureRequestsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        requests_ = new java.util.ArrayList<generated.RideRequest>(requests_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        generated.RideRequest, generated.RideRequest.Builder, generated.RideRequestOrBuilder> requestsBuilder_;

    /**
     * <code>repeated .uber.RideRequest requests = 2;</code>
     */
    public java.util.List<generated.RideRequest> getRequestsList() {
      if (requestsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(requests_);
      } else {
        return requestsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .uber.RideRequest requests = 2;</code>
     */
    public int getRequestsCount() {
      if (requestsBuilder_ == null) {
        return requests_.size();
      } else {
        return requestsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .uber.RideRequest requests = 2;</code>
     */
    public generated.RideRequest getRequests(int index) {
      if (requestsBuilder_ == null) {
        return requests_.get(index);
      } else {
        return requestsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .uber.RideRequest requests = 2;</code>
     */
    public Builder setRequests(
        int index, generated.RideRequest value) {
      if (requestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRequestsIsMutable();
        requests_.set(index, value);
        onChanged();
      } else {
        requestsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .uber.RideRequest requests = 2;</code>
     */
    public Builder setRequests(
        int index, generated.RideRequest.Builder builderForValue) {
      if (requestsBuilder_ == null) {
        ensureRequestsIsMutable();
        requests_.set(index, builderForValue.build());
        onChanged();
      } else {
        requestsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .uber.RideRequest requests = 2;</code>
     */
    public Builder addRequests(generated.RideRequest value) {
      if (requestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRequestsIsMutable();
        requests_.add(value);
        onChanged();
      } else {
        requestsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .uber.RideRequest requests = 2;</code>
     */
    public Builder addRequests(
        int index, generated.RideRequest value) {
      if (requestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRequestsIsMutable();
        requests_.add(index, value);
        onChanged();
      } else {
        requestsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .uber.RideRequest requests = 2;</code>
     */
    public Builder addRequests(
        generated.RideRequest.Builder builderForValue) {
      if (requestsBuilder_ == null) {
        ensureRequestsIsMutable();
        requests_.add(builderForValue.build());
        onChanged();
      } else {
        requestsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .uber.RideRequest requests = 2;</code>
     */
    public Builder addRequests(
        int index, generated.RideRequest.Builder builderForValue) {
      if (requestsBuilder_ == null) {
        ensureRequestsIsMutable();
        requests_.add(index, builderForValue.build());
        onChanged();
      } else {
        requestsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .uber.RideRequest requests = 2;</code>
     */
    public Builder addAllRequests(
        java.lang.Iterable<? extends generated.RideRequest> values) {
      if (requestsBuilder_ == null) {
        ensureRequestsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, requests_);
        onChanged();
      } else {
        requestsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .uber.RideRequest requests = 2;</code>
     */
    public Builder clearRequests() {
      if (requestsBuilder_ == null) {
        requests_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        requestsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .uber.RideRequest requests = 2;</code>
     */
    public Builder removeRequests(int index) {
      if (requestsBuilder_ == null) {
        ensureRequestsIsMutable();
        requests_.remove(index);
        onChanged();
      } else {
        requestsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .uber.RideRequest requests = 2;</code>
     */
    public generated.RideRequest.Builder getRequestsBuilder(
        int index) {
      return getRequestsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .uber.RideRequest requests = 2;</code>
     */
    public generated.RideRequestOrBuilder getRequestsOrBuilder(
        int index) {
      if (requestsBuilder_ == null) {
        return requests_.get(index);  } else {
        return requestsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .uber.RideRequest requests = 2;</code>
     */
    public java.util.List<? extends generated.RideRequestOrBuilder> 
         getRequestsOrBuilderList() {
      if (requestsBuilder_ != null) {
        return requestsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(requests_);
      }
    }
    /**
     * <code>repeated .uber.RideRequest requests = 2;</code>
     */
    public generated.RideRequest.Builder addRequestsBuilder() {
      return getRequestsFieldBuilder().addBuilder(
          generated.RideRequest.getDefaultInstance());
    }
    /**
     * <code>repeated .uber.RideRequest requests = 2;</code>
     */
    public generated.RideRequest.Builder addRequestsBuilder(
        int index) {
      return getRequestsFieldBuilder().addBuilder(
          index, generated.RideRequest.getDefaultInstance());
    }
    /**
     * <code>repeated .uber.RideRequest requests = 2;</code>
     */
    public java.util.List<generated.RideRequest.Builder> 
         getRequestsBuilderList() {
      return getRequestsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        generated.RideRequest, generated.RideRequest.Builder, generated.RideRequestOrBuilder> 
        getRequestsFieldBuilder() {
      if (requestsBuilder_ == null) {
        requestsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            generated.RideRequest, generated.RideRequest.Builder, generated.RideRequestOrBuilder>(
                requests_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        requests_ = null;
      }
      return requestsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:uber.Snapshot)
  }

  // @@protoc_insertion_point(class_scope:uber.Snapshot)
  private static final generated.Snapshot DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new generated.Snapshot();
  }

  public static generated.Snapshot getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Snapshot>
      PARSER = new com.google.protobuf.AbstractParser<Snapshot>() {
    @java.lang.Override
    public Snapshot parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Snapshot(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Snapshot> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Snapshot> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public generated.Snapshot getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
