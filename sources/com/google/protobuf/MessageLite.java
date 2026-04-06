package com.google.protobuf;

public interface MessageLite extends MessageLiteOrBuilder {

    public interface Builder extends MessageLiteOrBuilder, Cloneable {
        MessageLite C();

        Builder U0(MessageLite messageLite);

        Builder W0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        MessageLite d();
    }

    Builder e();

    ByteString f();

    int g();

    Builder h();

    Parser i();

    void k(CodedOutputStream codedOutputStream);
}
