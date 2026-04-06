package androidx.datastore.preferences.protobuf;

@CheckReturnValue
public interface MessageLite extends MessageLiteOrBuilder {

    public interface Builder extends MessageLiteOrBuilder, Cloneable {
        MessageLite C();

        Builder S(MessageLite messageLite);

        Builder b1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        MessageLite d();
    }

    Builder e();

    ByteString f();

    int g();

    Builder h();

    Parser i();

    void j(CodedOutputStream codedOutputStream);
}
