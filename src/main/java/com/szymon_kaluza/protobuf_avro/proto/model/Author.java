// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: library.proto

package com.szymon_kaluza.protobuf_avro.proto.model;

/**
 * Protobuf type {@code protobuf.Author}
 */
public final class Author extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protobuf.Author)
    AuthorOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Author.newBuilder() to construct.
  private Author(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Author() {
    name_ = "";
    surname_ = "";
    nationality_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Author();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.szymon_kaluza.protobuf_avro.proto.model.LibraryProtos.internal_static_protobuf_Author_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.szymon_kaluza.protobuf_avro.proto.model.LibraryProtos.internal_static_protobuf_Author_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.szymon_kaluza.protobuf_avro.proto.model.Author.class, com.szymon_kaluza.protobuf_avro.proto.model.Author.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <code>optional string name = 1;</code>
   * @return Whether the name field is set.
   */
  @java.lang.Override
  public boolean hasName() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>optional string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SURNAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object surname_ = "";
  /**
   * <code>optional string surname = 2;</code>
   * @return Whether the surname field is set.
   */
  @java.lang.Override
  public boolean hasSurname() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional string surname = 2;</code>
   * @return The surname.
   */
  @java.lang.Override
  public java.lang.String getSurname() {
    java.lang.Object ref = surname_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      surname_ = s;
      return s;
    }
  }
  /**
   * <code>optional string surname = 2;</code>
   * @return The bytes for surname.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSurnameBytes() {
    java.lang.Object ref = surname_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      surname_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NATIONALITY_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nationality_ = "";
  /**
   * <code>optional string nationality = 3;</code>
   * @return Whether the nationality field is set.
   */
  @java.lang.Override
  public boolean hasNationality() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional string nationality = 3;</code>
   * @return The nationality.
   */
  @java.lang.Override
  public java.lang.String getNationality() {
    java.lang.Object ref = nationality_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nationality_ = s;
      return s;
    }
  }
  /**
   * <code>optional string nationality = 3;</code>
   * @return The bytes for nationality.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNationalityBytes() {
    java.lang.Object ref = nationality_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nationality_ = b;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, surname_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, nationality_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, surname_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, nationality_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.szymon_kaluza.protobuf_avro.proto.model.Author)) {
      return super.equals(obj);
    }
    com.szymon_kaluza.protobuf_avro.proto.model.Author other = (com.szymon_kaluza.protobuf_avro.proto.model.Author) obj;

    if (hasName() != other.hasName()) return false;
    if (hasName()) {
      if (!getName()
          .equals(other.getName())) return false;
    }
    if (hasSurname() != other.hasSurname()) return false;
    if (hasSurname()) {
      if (!getSurname()
          .equals(other.getSurname())) return false;
    }
    if (hasNationality() != other.hasNationality()) return false;
    if (hasNationality()) {
      if (!getNationality()
          .equals(other.getNationality())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasName()) {
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
    }
    if (hasSurname()) {
      hash = (37 * hash) + SURNAME_FIELD_NUMBER;
      hash = (53 * hash) + getSurname().hashCode();
    }
    if (hasNationality()) {
      hash = (37 * hash) + NATIONALITY_FIELD_NUMBER;
      hash = (53 * hash) + getNationality().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.szymon_kaluza.protobuf_avro.proto.model.Author parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.szymon_kaluza.protobuf_avro.proto.model.Author parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.szymon_kaluza.protobuf_avro.proto.model.Author parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.szymon_kaluza.protobuf_avro.proto.model.Author parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.szymon_kaluza.protobuf_avro.proto.model.Author parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.szymon_kaluza.protobuf_avro.proto.model.Author parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.szymon_kaluza.protobuf_avro.proto.model.Author parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.szymon_kaluza.protobuf_avro.proto.model.Author parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.szymon_kaluza.protobuf_avro.proto.model.Author parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.szymon_kaluza.protobuf_avro.proto.model.Author parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.szymon_kaluza.protobuf_avro.proto.model.Author parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.szymon_kaluza.protobuf_avro.proto.model.Author parseFrom(
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
  public static Builder newBuilder(com.szymon_kaluza.protobuf_avro.proto.model.Author prototype) {
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
   * Protobuf type {@code protobuf.Author}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protobuf.Author)
      com.szymon_kaluza.protobuf_avro.proto.model.AuthorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.szymon_kaluza.protobuf_avro.proto.model.LibraryProtos.internal_static_protobuf_Author_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.szymon_kaluza.protobuf_avro.proto.model.LibraryProtos.internal_static_protobuf_Author_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.szymon_kaluza.protobuf_avro.proto.model.Author.class, com.szymon_kaluza.protobuf_avro.proto.model.Author.Builder.class);
    }

    // Construct using com.szymon_kaluza.protobuf.proto.model.Author.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      surname_ = "";
      nationality_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.szymon_kaluza.protobuf_avro.proto.model.LibraryProtos.internal_static_protobuf_Author_descriptor;
    }

    @java.lang.Override
    public com.szymon_kaluza.protobuf_avro.proto.model.Author getDefaultInstanceForType() {
      return com.szymon_kaluza.protobuf_avro.proto.model.Author.getDefaultInstance();
    }

    @java.lang.Override
    public com.szymon_kaluza.protobuf_avro.proto.model.Author build() {
      com.szymon_kaluza.protobuf_avro.proto.model.Author result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.szymon_kaluza.protobuf_avro.proto.model.Author buildPartial() {
      com.szymon_kaluza.protobuf_avro.proto.model.Author result = new com.szymon_kaluza.protobuf_avro.proto.model.Author(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.szymon_kaluza.protobuf_avro.proto.model.Author result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.surname_ = surname_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.nationality_ = nationality_;
        to_bitField0_ |= 0x00000004;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.szymon_kaluza.protobuf_avro.proto.model.Author) {
        return mergeFrom((com.szymon_kaluza.protobuf_avro.proto.model.Author)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.szymon_kaluza.protobuf_avro.proto.model.Author other) {
      if (other == com.szymon_kaluza.protobuf_avro.proto.model.Author.getDefaultInstance()) return this;
      if (other.hasName()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasSurname()) {
        surname_ = other.surname_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasNationality()) {
        nationality_ = other.nationality_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              surname_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              nationality_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     * <code>optional string name = 1;</code>
     * @return Whether the name field is set.
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string name = 1;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object surname_ = "";
    /**
     * <code>optional string surname = 2;</code>
     * @return Whether the surname field is set.
     */
    public boolean hasSurname() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional string surname = 2;</code>
     * @return The surname.
     */
    public java.lang.String getSurname() {
      java.lang.Object ref = surname_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        surname_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string surname = 2;</code>
     * @return The bytes for surname.
     */
    public com.google.protobuf.ByteString
        getSurnameBytes() {
      java.lang.Object ref = surname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        surname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string surname = 2;</code>
     * @param value The surname to set.
     * @return This builder for chaining.
     */
    public Builder setSurname(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      surname_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional string surname = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSurname() {
      surname_ = getDefaultInstance().getSurname();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>optional string surname = 2;</code>
     * @param value The bytes for surname to set.
     * @return This builder for chaining.
     */
    public Builder setSurnameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      surname_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object nationality_ = "";
    /**
     * <code>optional string nationality = 3;</code>
     * @return Whether the nationality field is set.
     */
    public boolean hasNationality() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional string nationality = 3;</code>
     * @return The nationality.
     */
    public java.lang.String getNationality() {
      java.lang.Object ref = nationality_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nationality_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string nationality = 3;</code>
     * @return The bytes for nationality.
     */
    public com.google.protobuf.ByteString
        getNationalityBytes() {
      java.lang.Object ref = nationality_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nationality_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string nationality = 3;</code>
     * @param value The nationality to set.
     * @return This builder for chaining.
     */
    public Builder setNationality(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      nationality_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>optional string nationality = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNationality() {
      nationality_ = getDefaultInstance().getNationality();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>optional string nationality = 3;</code>
     * @param value The bytes for nationality to set.
     * @return This builder for chaining.
     */
    public Builder setNationalityBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      nationality_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:protobuf.Author)
  }

  // @@protoc_insertion_point(class_scope:protobuf.Author)
  private static final com.szymon_kaluza.protobuf_avro.proto.model.Author DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.szymon_kaluza.protobuf_avro.proto.model.Author();
  }

  public static com.szymon_kaluza.protobuf_avro.proto.model.Author getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Author>
      PARSER = new com.google.protobuf.AbstractParser<Author>() {
    @java.lang.Override
    public Author parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Author> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Author> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.szymon_kaluza.protobuf_avro.proto.model.Author getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

