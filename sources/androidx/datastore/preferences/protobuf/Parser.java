package androidx.datastore.preferences.protobuf;

public interface Parser<MessageType> {
    Object a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite);

    Object b(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
}
