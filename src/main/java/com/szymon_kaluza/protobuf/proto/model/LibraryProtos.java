// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: library.proto

package com.szymon_kaluza.protobuf.proto.model;

public final class LibraryProtos {
  private LibraryProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protobuf_Author_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protobuf_Author_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protobuf_Book_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protobuf_Book_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protobuf_Library_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protobuf_Library_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rlibrary.proto\022\010protobuf\"p\n\006Author\022\021\n\004n" +
      "ame\030\001 \001(\tH\000\210\001\001\022\024\n\007surname\030\002 \001(\tH\001\210\001\001\022\030\n\013" +
      "nationality\030\003 \001(\tH\002\210\001\001B\007\n\005_nameB\n\n\010_surn" +
      "ameB\016\n\014_nationality\"\232\001\n\004Book\022\022\n\005title\030\001 " +
      "\001(\tH\000\210\001\001\022%\n\006author\030\002 \001(\0132\020.protobuf.Auth" +
      "orH\001\210\001\001\022\022\n\005pages\030\003 \001(\003H\002\210\001\001\022\026\n\tavailable" +
      "\030\004 \001(\010H\003\210\001\001B\010\n\006_titleB\t\n\007_authorB\010\n\006_pag" +
      "esB\014\n\n_available\"J\n\007Library\022\024\n\007address\030\001" +
      " \001(\tH\000\210\001\001\022\035\n\005books\030\002 \003(\0132\016.protobuf.Book" +
      "B\n\n\010_addressB9\n&com.szymon_kaluza.protob" +
      "uf.proto.modelB\rLibraryProtosP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_protobuf_Author_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protobuf_Author_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protobuf_Author_descriptor,
        new java.lang.String[] { "Name", "Surname", "Nationality", "Name", "Surname", "Nationality", });
    internal_static_protobuf_Book_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_protobuf_Book_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protobuf_Book_descriptor,
        new java.lang.String[] { "Title", "Author", "Pages", "Available", "Title", "Author", "Pages", "Available", });
    internal_static_protobuf_Library_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_protobuf_Library_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protobuf_Library_descriptor,
        new java.lang.String[] { "Address", "Books", "Address", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
