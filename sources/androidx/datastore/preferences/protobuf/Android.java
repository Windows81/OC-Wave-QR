package androidx.datastore.preferences.protobuf;

final class Android {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f20724a;

    /* renamed from: b  reason: collision with root package name */
    public static final Class f20725b = a("libcore.io.Memory");

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f20726c = (!f20724a && a("org.robolectric.Robolectric") != null);

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class b() {
        return f20725b;
    }

    public static boolean c() {
        return f20724a || (f20725b != null && !f20726c);
    }
}
