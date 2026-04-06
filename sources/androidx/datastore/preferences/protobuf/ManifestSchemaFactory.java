package androidx.datastore.preferences.protobuf;

@CheckReturnValue
final class ManifestSchemaFactory implements SchemaFactory {

    /* renamed from: b  reason: collision with root package name */
    public static final MessageInfoFactory f21052b = new MessageInfoFactory() {
        public MessageInfo a(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }

        public boolean b(Class cls) {
            return false;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final MessageInfoFactory f21053a;

    /* renamed from: androidx.datastore.preferences.protobuf.ManifestSchemaFactory$2  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21054a;

        static {
            int[] iArr = new int[ProtoSyntax.values().length];
            f21054a = iArr;
            try {
                iArr[ProtoSyntax.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static class CompositeMessageInfoFactory implements MessageInfoFactory {

        /* renamed from: a  reason: collision with root package name */
        public MessageInfoFactory[] f21055a;

        public CompositeMessageInfoFactory(MessageInfoFactory... messageInfoFactoryArr) {
            this.f21055a = messageInfoFactoryArr;
        }

        public MessageInfo a(Class cls) {
            for (MessageInfoFactory messageInfoFactory : this.f21055a) {
                if (messageInfoFactory.b(cls)) {
                    return messageInfoFactory.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        public boolean b(Class cls) {
            for (MessageInfoFactory b2 : this.f21055a) {
                if (b2.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public ManifestSchemaFactory() {
        this(c());
    }

    public static boolean b(MessageInfo messageInfo) {
        return AnonymousClass2.f21054a[messageInfo.c().ordinal()] != 1;
    }

    public static MessageInfoFactory c() {
        return new CompositeMessageInfoFactory(GeneratedMessageInfoFactory.c(), d());
    }

    public static MessageInfoFactory d() {
        if (Protobuf.f21108d) {
            return f21052b;
        }
        try {
            return (MessageInfoFactory) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", (Class[]) null).invoke((Object) null, (Object[]) null);
        } catch (Exception unused) {
            return f21052b;
        }
    }

    public static Schema e(Class cls, MessageInfo messageInfo) {
        ExtensionSchema extensionSchema = null;
        if (f(cls)) {
            NewInstanceSchema b2 = NewInstanceSchemas.b();
            ListFieldSchema b3 = ListFieldSchemas.b();
            UnknownFieldSchema L = SchemaUtil.L();
            if (b(messageInfo)) {
                extensionSchema = ExtensionSchemas.b();
            }
            return MessageSchema.O(cls, messageInfo, b2, b3, L, extensionSchema, MapFieldSchemas.b());
        }
        NewInstanceSchema a2 = NewInstanceSchemas.a();
        ListFieldSchema a3 = ListFieldSchemas.a();
        UnknownFieldSchema K = SchemaUtil.K();
        if (b(messageInfo)) {
            extensionSchema = ExtensionSchemas.a();
        }
        return MessageSchema.O(cls, messageInfo, a2, a3, K, extensionSchema, MapFieldSchemas.a());
    }

    public static boolean f(Class cls) {
        return Protobuf.f21108d || GeneratedMessageLite.class.isAssignableFrom(cls);
    }

    public Schema a(Class cls) {
        SchemaUtil.H(cls);
        MessageInfo a2 = this.f21053a.a(cls);
        return a2.a() ? f(cls) ? MessageSetSchema.l(SchemaUtil.L(), ExtensionSchemas.b(), a2.b()) : MessageSetSchema.l(SchemaUtil.K(), ExtensionSchemas.a(), a2.b()) : e(cls, a2);
    }

    public ManifestSchemaFactory(MessageInfoFactory messageInfoFactory) {
        this.f21053a = (MessageInfoFactory) Internal.b(messageInfoFactory, "messageInfoFactory");
    }
}
