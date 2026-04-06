package androidx.datastore.preferences.protobuf;

final class ExtensionRegistryFactory {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f20942a = c();

    public static ExtensionRegistryLite a() {
        ExtensionRegistryLite b2 = b("getEmptyRegistry");
        return b2 != null ? b2 : ExtensionRegistryLite.f20944c;
    }

    public static final ExtensionRegistryLite b(String str) {
        Class cls = f20942a;
        if (cls == null) {
            return null;
        }
        try {
            return (ExtensionRegistryLite) cls.getDeclaredMethod(str, (Class[]) null).invoke((Object) null, (Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Class c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
