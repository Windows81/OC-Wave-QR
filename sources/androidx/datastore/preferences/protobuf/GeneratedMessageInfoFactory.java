package androidx.datastore.preferences.protobuf;

class GeneratedMessageInfoFactory implements MessageInfoFactory {

    /* renamed from: a  reason: collision with root package name */
    public static final GeneratedMessageInfoFactory f20983a = new GeneratedMessageInfoFactory();

    public static GeneratedMessageInfoFactory c() {
        return f20983a;
    }

    public MessageInfo a(Class cls) {
        Class<GeneratedMessageLite> cls2 = GeneratedMessageLite.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                return (MessageInfo) GeneratedMessageLite.D(cls.asSubclass(cls2)).q();
            } catch (Exception e2) {
                throw new RuntimeException("Unable to get message info for " + cls.getName(), e2);
            }
        } else {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
    }

    public boolean b(Class cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }
}
