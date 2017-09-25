// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ImResponse.proto

package im.common.protof;

public final class ResponseModel {
  private ResponseModel() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ImResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ImResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 handler = 1;</code>
     */
    int getHandler();

    /**
     * <code>optional int32 code = 2;</code>
     */
    int getCode();

    /**
     * <code>optional string uniqueOne = 3;</code>
     */
    String getUniqueOne();
    /**
     * <code>optional string uniqueOne = 3;</code>
     */
    com.google.protobuf.ByteString
        getUniqueOneBytes();

    /**
     * <code>optional string uniqueTwo = 4;</code>
     */
    String getUniqueTwo();
    /**
     * <code>optional string uniqueTwo = 4;</code>
     */
    com.google.protobuf.ByteString
        getUniqueTwoBytes();

    /**
     * <code>optional string time = 5;</code>
     */
    String getTime();
    /**
     * <code>optional string time = 5;</code>
     */
    com.google.protobuf.ByteString
        getTimeBytes();

    /**
     * <code>optional string objectJson = 6;</code>
     */
    String getObjectJson();
    /**
     * <code>optional string objectJson = 6;</code>
     */
    com.google.protobuf.ByteString
        getObjectJsonBytes();
  }
  /**
   * Protobuf type {@code ImResponse}
   */
  public  static final class ImResponse extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:ImResponse)
      ImResponseOrBuilder {
    // Use ImResponse.newBuilder() to construct.
    private ImResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private ImResponse() {
      handler_ = 0;
      code_ = 0;
      uniqueOne_ = "";
      uniqueTwo_ = "";
      time_ = "";
      objectJson_ = "";
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private ImResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 8: {

              handler_ = input.readInt32();
              break;
            }
            case 16: {

              code_ = input.readInt32();
              break;
            }
            case 26: {
              String s = input.readStringRequireUtf8();

              uniqueOne_ = s;
              break;
            }
            case 34: {
              String s = input.readStringRequireUtf8();

              uniqueTwo_ = s;
              break;
            }
            case 42: {
              String s = input.readStringRequireUtf8();

              time_ = s;
              break;
            }
            case 50: {
              String s = input.readStringRequireUtf8();

              objectJson_ = s;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw new RuntimeException(e.setUnfinishedMessage(this));
      } catch (java.io.IOException e) {
        throw new RuntimeException(
            new com.google.protobuf.InvalidProtocolBufferException(
                e.getMessage()).setUnfinishedMessage(this));
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ResponseModel.internal_static_ImResponse_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ResponseModel.internal_static_ImResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ImResponse.class, Builder.class);
    }

    public static final int HANDLER_FIELD_NUMBER = 1;
    private int handler_;
    /**
     * <code>optional int32 handler = 1;</code>
     */
    public int getHandler() {
      return handler_;
    }

    public static final int CODE_FIELD_NUMBER = 2;
    private int code_;
    /**
     * <code>optional int32 code = 2;</code>
     */
    public int getCode() {
      return code_;
    }

    public static final int UNIQUEONE_FIELD_NUMBER = 3;
    private volatile Object uniqueOne_;
    /**
     * <code>optional string uniqueOne = 3;</code>
     */
    public String getUniqueOne() {
      Object ref = uniqueOne_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        uniqueOne_ = s;
        return s;
      }
    }
    /**
     * <code>optional string uniqueOne = 3;</code>
     */
    public com.google.protobuf.ByteString
        getUniqueOneBytes() {
      Object ref = uniqueOne_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        uniqueOne_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int UNIQUETWO_FIELD_NUMBER = 4;
    private volatile Object uniqueTwo_;
    /**
     * <code>optional string uniqueTwo = 4;</code>
     */
    public String getUniqueTwo() {
      Object ref = uniqueTwo_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        uniqueTwo_ = s;
        return s;
      }
    }
    /**
     * <code>optional string uniqueTwo = 4;</code>
     */
    public com.google.protobuf.ByteString
        getUniqueTwoBytes() {
      Object ref = uniqueTwo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        uniqueTwo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TIME_FIELD_NUMBER = 5;
    private volatile Object time_;
    /**
     * <code>optional string time = 5;</code>
     */
    public String getTime() {
      Object ref = time_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        time_ = s;
        return s;
      }
    }
    /**
     * <code>optional string time = 5;</code>
     */
    public com.google.protobuf.ByteString
        getTimeBytes() {
      Object ref = time_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        time_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int OBJECTJSON_FIELD_NUMBER = 6;
    private volatile Object objectJson_;
    /**
     * <code>optional string objectJson = 6;</code>
     */
    public String getObjectJson() {
      Object ref = objectJson_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        objectJson_ = s;
        return s;
      }
    }
    /**
     * <code>optional string objectJson = 6;</code>
     */
    public com.google.protobuf.ByteString
        getObjectJsonBytes() {
      Object ref = objectJson_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        objectJson_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (handler_ != 0) {
        output.writeInt32(1, handler_);
      }
      if (code_ != 0) {
        output.writeInt32(2, code_);
      }
      if (!getUniqueOneBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessage.writeString(output, 3, uniqueOne_);
      }
      if (!getUniqueTwoBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessage.writeString(output, 4, uniqueTwo_);
      }
      if (!getTimeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessage.writeString(output, 5, time_);
      }
      if (!getObjectJsonBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessage.writeString(output, 6, objectJson_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (handler_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, handler_);
      }
      if (code_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, code_);
      }
      if (!getUniqueOneBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(3, uniqueOne_);
      }
      if (!getUniqueTwoBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(4, uniqueTwo_);
      }
      if (!getTimeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(5, time_);
      }
      if (!getObjectJsonBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(6, objectJson_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    public static ImResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ImResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ImResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ImResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ImResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ImResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static ImResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static ImResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static ImResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ImResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ImResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code ImResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ImResponse)
        ImResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ResponseModel.internal_static_ImResponse_descriptor;
      }

      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ResponseModel.internal_static_ImResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ImResponse.class, Builder.class);
      }

      // Construct using com.base.im.common.protof.ResponseModel.ImResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        handler_ = 0;

        code_ = 0;

        uniqueOne_ = "";

        uniqueTwo_ = "";

        time_ = "";

        objectJson_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ResponseModel.internal_static_ImResponse_descriptor;
      }

      public ImResponse getDefaultInstanceForType() {
        return ImResponse.getDefaultInstance();
      }

      public ImResponse build() {
        ImResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public ImResponse buildPartial() {
        ImResponse result = new ImResponse(this);
        result.handler_ = handler_;
        result.code_ = code_;
        result.uniqueOne_ = uniqueOne_;
        result.uniqueTwo_ = uniqueTwo_;
        result.time_ = time_;
        result.objectJson_ = objectJson_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ImResponse) {
          return mergeFrom((ImResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ImResponse other) {
        if (other == ImResponse.getDefaultInstance()) return this;
        if (other.getHandler() != 0) {
          setHandler(other.getHandler());
        }
        if (other.getCode() != 0) {
          setCode(other.getCode());
        }
        if (!other.getUniqueOne().isEmpty()) {
          uniqueOne_ = other.uniqueOne_;
          onChanged();
        }
        if (!other.getUniqueTwo().isEmpty()) {
          uniqueTwo_ = other.uniqueTwo_;
          onChanged();
        }
        if (!other.getTime().isEmpty()) {
          time_ = other.time_;
          onChanged();
        }
        if (!other.getObjectJson().isEmpty()) {
          objectJson_ = other.objectJson_;
          onChanged();
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ImResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ImResponse) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int handler_ ;
      /**
       * <code>optional int32 handler = 1;</code>
       */
      public int getHandler() {
        return handler_;
      }
      /**
       * <code>optional int32 handler = 1;</code>
       */
      public Builder setHandler(int value) {
        
        handler_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 handler = 1;</code>
       */
      public Builder clearHandler() {
        
        handler_ = 0;
        onChanged();
        return this;
      }

      private int code_ ;
      /**
       * <code>optional int32 code = 2;</code>
       */
      public int getCode() {
        return code_;
      }
      /**
       * <code>optional int32 code = 2;</code>
       */
      public Builder setCode(int value) {
        
        code_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 code = 2;</code>
       */
      public Builder clearCode() {
        
        code_ = 0;
        onChanged();
        return this;
      }

      private Object uniqueOne_ = "";
      /**
       * <code>optional string uniqueOne = 3;</code>
       */
      public String getUniqueOne() {
        Object ref = uniqueOne_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          uniqueOne_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>optional string uniqueOne = 3;</code>
       */
      public com.google.protobuf.ByteString
          getUniqueOneBytes() {
        Object ref = uniqueOne_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          uniqueOne_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string uniqueOne = 3;</code>
       */
      public Builder setUniqueOne(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        uniqueOne_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string uniqueOne = 3;</code>
       */
      public Builder clearUniqueOne() {
        
        uniqueOne_ = getDefaultInstance().getUniqueOne();
        onChanged();
        return this;
      }
      /**
       * <code>optional string uniqueOne = 3;</code>
       */
      public Builder setUniqueOneBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        uniqueOne_ = value;
        onChanged();
        return this;
      }

      private Object uniqueTwo_ = "";
      /**
       * <code>optional string uniqueTwo = 4;</code>
       */
      public String getUniqueTwo() {
        Object ref = uniqueTwo_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          uniqueTwo_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>optional string uniqueTwo = 4;</code>
       */
      public com.google.protobuf.ByteString
          getUniqueTwoBytes() {
        Object ref = uniqueTwo_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          uniqueTwo_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string uniqueTwo = 4;</code>
       */
      public Builder setUniqueTwo(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        uniqueTwo_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string uniqueTwo = 4;</code>
       */
      public Builder clearUniqueTwo() {
        
        uniqueTwo_ = getDefaultInstance().getUniqueTwo();
        onChanged();
        return this;
      }
      /**
       * <code>optional string uniqueTwo = 4;</code>
       */
      public Builder setUniqueTwoBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        uniqueTwo_ = value;
        onChanged();
        return this;
      }

      private Object time_ = "";
      /**
       * <code>optional string time = 5;</code>
       */
      public String getTime() {
        Object ref = time_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          time_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>optional string time = 5;</code>
       */
      public com.google.protobuf.ByteString
          getTimeBytes() {
        Object ref = time_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          time_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string time = 5;</code>
       */
      public Builder setTime(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        time_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string time = 5;</code>
       */
      public Builder clearTime() {
        
        time_ = getDefaultInstance().getTime();
        onChanged();
        return this;
      }
      /**
       * <code>optional string time = 5;</code>
       */
      public Builder setTimeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        time_ = value;
        onChanged();
        return this;
      }

      private Object objectJson_ = "";
      /**
       * <code>optional string objectJson = 6;</code>
       */
      public String getObjectJson() {
        Object ref = objectJson_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          objectJson_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>optional string objectJson = 6;</code>
       */
      public com.google.protobuf.ByteString
          getObjectJsonBytes() {
        Object ref = objectJson_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          objectJson_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string objectJson = 6;</code>
       */
      public Builder setObjectJson(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        objectJson_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string objectJson = 6;</code>
       */
      public Builder clearObjectJson() {
        
        objectJson_ = getDefaultInstance().getObjectJson();
        onChanged();
        return this;
      }
      /**
       * <code>optional string objectJson = 6;</code>
       */
      public Builder setObjectJsonBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        objectJson_ = value;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:ImResponse)
    }

    // @@protoc_insertion_point(class_scope:ImResponse)
    private static final ImResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ImResponse();
    }

    public static ImResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ImResponse>
        PARSER = new com.google.protobuf.AbstractParser<ImResponse>() {
      public ImResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        try {
          return new ImResponse(input, extensionRegistry);
        } catch (RuntimeException e) {
          if (e.getCause() instanceof
              com.google.protobuf.InvalidProtocolBufferException) {
            throw (com.google.protobuf.InvalidProtocolBufferException)
                e.getCause();
          }
          throw e;
        }
      }
    };

    public static com.google.protobuf.Parser<ImResponse> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<ImResponse> getParserForType() {
      return PARSER;
    }

    public ImResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_ImResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ImResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\020ImResponse.proto\"s\n\nImResponse\022\017\n\007hand" +
      "ler\030\001 \001(\005\022\014\n\004code\030\002 \001(\005\022\021\n\tuniqueOne\030\003 \001" +
      "(\t\022\021\n\tuniqueTwo\030\004 \001(\t\022\014\n\004time\030\005 \001(\t\022\022\n\no" +
      "bjectJson\030\006 \001(\tB*\n\031com.base.im.common.pr" +
      "otofB\rResponseModelb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_ImResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ImResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_ImResponse_descriptor,
        new String[] { "Handler", "Code", "UniqueOne", "UniqueTwo", "Time", "ObjectJson", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
