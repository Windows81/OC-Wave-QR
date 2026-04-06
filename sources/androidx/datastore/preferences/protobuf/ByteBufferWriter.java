package androidx.datastore.preferences.protobuf;

final class ByteBufferWriter {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f20767a = new ThreadLocal();

    /* renamed from: b  reason: collision with root package name */
    public static final Class f20768b;

    /* renamed from: c  reason: collision with root package name */
    public static final long f20769c;

    static {
        Class b2 = b("java.io.FileOutputStream");
        f20768b = b2;
        f20769c = a(b2);
    }

    public static long a(Class cls) {
        if (cls == null) {
            return -1;
        }
        try {
            if (UnsafeUtil.J()) {
                return UnsafeUtil.M(cls.getDeclaredField("channel"));
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static Class b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
