// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scheme.proto

package generated;

/**
 * Protobuf type {@code uber.CommitInfo}
 */
public final class CommitInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:uber.CommitInfo)
    CommitInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CommitInfo.newBuilder() to construct.
  private CommitInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CommitInfo() {
    id_ = "";
    startingPosition_ = "";
    endingPosition_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CommitInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CommitInfo(
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
            java.lang.String s = input.readStringRequireUtf8();

            id_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            startingPosition_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            endingPosition_ = s;
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
    return generated.UberProto.internal_static_uber_CommitInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return generated.UberProto.internal_static_uber_CommitInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            generated.CommitInfo.class, generated.CommitInfo.Builder.class);
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

  public static final int ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object id_;
  /**
   * <code>string id = 2;</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 2;</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STARTING_POSITION_FIELD_NUMBER = 3;
  private volatile java.lang.Object startingPosition_;
  /**
   * <code>string starting_position = 3;</code>
   * @return The startingPosition.
   */
  @java.lang.Override
  public java.lang.String getStartingPosition() {
    java.lang.Object ref = startingPosition_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      startingPosition_ = s;
      return s;
    }
  }
  /**
   * <code>string starting_position = 3;</code>
   * @return The bytes for startingPosition.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStartingPositionBytes() {
    java.lang.Object ref = startingPosition_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      startingPosition_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENDING_POSITION_FIELD_NUMBER = 4;
  private volatile java.lang.Object endingPosition_;
  /**
   * <code>string ending_position = 4;</code>
   * @return The endingPosition.
   */
  @java.lang.Override
  public java.lang.String getEndingPosition() {
    java.lang.Object ref = endingPosition_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      endingPosition_ = s;
      return s;
    }
  }
  /**
   * <code>string ending_position = 4;</code>
   * @return The bytes for endingPosition.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEndingPositionBytes() {
    java.lang.Object ref = endingPosition_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      endingPosition_ = b;
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
    if (!getIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, id_);
    }
    if (!getStartingPositionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, startingPosition_);
    }
    if (!getEndingPositionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, endingPosition_);
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
    if (!getIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, id_);
    }
    if (!getStartingPositionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, startingPosition_);
    }
    if (!getEndingPositionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, endingPosition_);
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
    if (!(obj instanceof generated.CommitInfo)) {
      return super.equals(obj);
    }
    generated.CommitInfo other = (generated.CommitInfo) obj;

    if (hasPerson() != other.hasPerson()) return false;
    if (hasPerson()) {
      if (!getPerson()
          .equals(other.getPerson())) return false;
    }
    if (!getId()
        .equals(other.getId())) return false;
    if (!getStartingPosition()
        .equals(other.getStartingPosition())) return false;
    if (!getEndingPosition()
        .equals(other.getEndingPosition())) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + STARTING_POSITION_FIELD_NUMBER;
    hash = (53 * hash) + getStartingPosition().hashCode();
    hash = (37 * hash) + ENDING_POSITION_FIELD_NUMBER;
    hash = (53 * hash) + getEndingPosition().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static generated.CommitInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.CommitInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.CommitInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.CommitInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.CommitInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.CommitInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.CommitInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.CommitInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static generated.CommitInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static generated.CommitInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static generated.CommitInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.CommitInfo parseFrom(
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
  public static Builder newBuilder(generated.CommitInfo prototype) {
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
   * Protobuf type {@code uber.CommitInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:uber.CommitInfo)
      generated.CommitInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return generated.UberProto.internal_static_uber_CommitInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return generated.UberProto.internal_static_uber_CommitInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              generated.CommitInfo.class, generated.CommitInfo.Builder.class);
    }

    // Construct using generated.CommitInfo.newBuilder()
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
      id_ = "";

      startingPosition_ = "";

      endingPosition_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return generated.UberProto.internal_static_uber_CommitInfo_descriptor;
    }

    @java.lang.Override
    public generated.CommitInfo getDefaultInstanceForType() {
      return generated.CommitInfo.getDefaultInstance();
    }

    @java.lang.Override
    public generated.CommitInfo build() {
      generated.CommitInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public generated.CommitInfo buildPartial() {
      generated.CommitInfo result = new generated.CommitInfo(this);
      if (personBuilder_ == null) {
        result.person_ = person_;
      } else {
        result.person_ = personBuilder_.build();
      }
      result.id_ = id_;
      result.startingPosition_ = startingPosition_;
      result.endingPosition_ = endingPosition_;
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
      if (other instanceof generated.CommitInfo) {
        return mergeFrom((generated.CommitInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(generated.CommitInfo other) {
      if (other == generated.CommitInfo.getDefaultInstance()) return this;
      if (other.hasPerson()) {
        mergePerson(other.getPerson());
      }
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (!other.getStartingPosition().isEmpty()) {
        startingPosition_ = other.startingPosition_;
        onChanged();
      }
      if (!other.getEndingPosition().isEmpty()) {
        endingPosition_ = other.endingPosition_;
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
      generated.CommitInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (generated.CommitInfo) e.getUnfinishedMessage();
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

    private java.lang.Object id_ = "";
    /**
     * <code>string id = 2;</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 2;</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 2;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <code>string id = 2;</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object startingPosition_ = "";
    /**
     * <code>string starting_position = 3;</code>
     * @return The startingPosition.
     */
    public java.lang.String getStartingPosition() {
      java.lang.Object ref = startingPosition_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        startingPosition_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string starting_position = 3;</code>
     * @return The bytes for startingPosition.
     */
    public com.google.protobuf.ByteString
        getStartingPositionBytes() {
      java.lang.Object ref = startingPosition_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        startingPosition_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string starting_position = 3;</code>
     * @param value The startingPosition to set.
     * @return This builder for chaining.
     */
    public Builder setStartingPosition(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      startingPosition_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string starting_position = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearStartingPosition() {
      
      startingPosition_ = getDefaultInstance().getStartingPosition();
      onChanged();
      return this;
    }
    /**
     * <code>string starting_position = 3;</code>
     * @param value The bytes for startingPosition to set.
     * @return This builder for chaining.
     */
    public Builder setStartingPositionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      startingPosition_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object endingPosition_ = "";
    /**
     * <code>string ending_position = 4;</code>
     * @return The endingPosition.
     */
    public java.lang.String getEndingPosition() {
      java.lang.Object ref = endingPosition_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        endingPosition_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string ending_position = 4;</code>
     * @return The bytes for endingPosition.
     */
    public com.google.protobuf.ByteString
        getEndingPositionBytes() {
      java.lang.Object ref = endingPosition_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        endingPosition_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ending_position = 4;</code>
     * @param value The endingPosition to set.
     * @return This builder for chaining.
     */
    public Builder setEndingPosition(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      endingPosition_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string ending_position = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearEndingPosition() {
      
      endingPosition_ = getDefaultInstance().getEndingPosition();
      onChanged();
      return this;
    }
    /**
     * <code>string ending_position = 4;</code>
     * @param value The bytes for endingPosition to set.
     * @return This builder for chaining.
     */
    public Builder setEndingPositionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      endingPosition_ = value;
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


    // @@protoc_insertion_point(builder_scope:uber.CommitInfo)
  }

  // @@protoc_insertion_point(class_scope:uber.CommitInfo)
  private static final generated.CommitInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new generated.CommitInfo();
  }

  public static generated.CommitInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CommitInfo>
      PARSER = new com.google.protobuf.AbstractParser<CommitInfo>() {
    @java.lang.Override
    public CommitInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CommitInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CommitInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CommitInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public generated.CommitInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
