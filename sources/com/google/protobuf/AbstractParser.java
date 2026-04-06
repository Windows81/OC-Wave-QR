package com.google.protobuf;

import com.google.protobuf.MessageLite;

public abstract class AbstractParser<MessageType extends MessageLite> implements Parser<MessageType> {

    /* renamed from: a  reason: collision with root package name */
    public static final ExtensionRegistryLite f31930a = ExtensionRegistryLite.b();

    public final MessageLite c(MessageLite messageLite) {
        if (messageLite == null || messageLite.b()) {
            return messageLite;
        }
        throw d(messageLite).a().k(messageLite);
    }

    public final UninitializedMessageException d(MessageLite messageLite) {
        return messageLite instanceof AbstractMessageLite ? ((AbstractMessageLite) messageLite).t() : new UninitializedMessageException(messageLite);
    }

    /* renamed from: e */
    public MessageLite a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return c(f(byteString, extensionRegistryLite));
    }

    public MessageLite f(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        CodedInputStream F = byteString.F();
        MessageLite messageLite = (MessageLite) b(F, extensionRegistryLite);
        try {
            F.a(0);
            return messageLite;
        } catch (InvalidProtocolBufferException e2) {
            throw e2.k(messageLite);
        }
    }
}
