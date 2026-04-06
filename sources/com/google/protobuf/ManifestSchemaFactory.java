package com.google.protobuf;

@CheckReturnValue
final class ManifestSchemaFactory implements SchemaFactory {

    /* renamed from: b  reason: collision with root package name */
    public static final MessageInfoFactory f32211b = new MessageInfoFactory() {
        public MessageInfo a(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }

        public boolean b(Class cls) {
            return false;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final MessageInfoFactory f32212a;

    public static class CompositeMessageInfoFactory implements MessageInfoFactory {

        /* renamed from: a  reason: collision with root package name */
        public MessageInfoFactory[] f32213a;

        public CompositeMessageInfoFactory(MessageInfoFactory... messageInfoFactoryArr) {
            this.f32213a = messageInfoFactoryArr;
        }

        public MessageInfo a(Class cls) {
            for (MessageInfoFactory messageInfoFactory : this.f32213a) {
                if (messageInfoFactory.b(cls)) {
                    return messageInfoFactory.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        public boolean b(Class cls) {
            for (MessageInfoFactory b2 : this.f32213a) {
                if (b2.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public ManifestSchemaFactory() {
        this(b());
    }

    public static MessageInfoFactory b() {
        return new CompositeMessageInfoFactory(GeneratedMessageInfoFactory.c(), c());
    }

    public static MessageInfoFactory c() {
        try {
            return (MessageInfoFactory) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", (Class[]) null).invoke((Object) null, (Object[]) null);
        } catch (Exception unused) {
            return f32211b;
        }
    }

    public static boolean d(MessageInfo messageInfo) {
        return messageInfo.c() == ProtoSyntax.PROTO2;
    }

    public static Schema e(Class cls, MessageInfo messageInfo) {
        if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            if (d(messageInfo)) {
                return MessageSchema.R(cls, messageInfo, NewInstanceSchemas.b(), ListFieldSchema.b(), SchemaUtil.M(), ExtensionSchemas.b(), MapFieldSchemas.b());
            }
            return MessageSchema.R(cls, messageInfo, NewInstanceSchemas.b(), ListFieldSchema.b(), SchemaUtil.M(), (ExtensionSchema) null, MapFieldSchemas.b());
        } else if (d(messageInfo)) {
            return MessageSchema.R(cls, messageInfo, NewInstanceSchemas.a(), ListFieldSchema.a(), SchemaUtil.H(), ExtensionSchemas.a(), MapFieldSchemas.a());
        } else {
            return MessageSchema.R(cls, messageInfo, NewInstanceSchemas.a(), ListFieldSchema.a(), SchemaUtil.I(), (ExtensionSchema) null, MapFieldSchemas.a());
        }
    }

    public Schema a(Class cls) {
        SchemaUtil.J(cls);
        MessageInfo a2 = this.f32212a.a(cls);
        return a2.a() ? GeneratedMessageLite.class.isAssignableFrom(cls) ? MessageSetSchema.l(SchemaUtil.M(), ExtensionSchemas.b(), a2.b()) : MessageSetSchema.l(SchemaUtil.H(), ExtensionSchemas.a(), a2.b()) : e(cls, a2);
    }

    public ManifestSchemaFactory(MessageInfoFactory messageInfoFactory) {
        this.f32212a = (MessageInfoFactory) Internal.b(messageInfoFactory, "messageInfoFactory");
    }
}
