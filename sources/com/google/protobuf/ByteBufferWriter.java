package com.google.protobuf;

final class ByteBufferWriter {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f31980a = new ThreadLocal();

    /* renamed from: b  reason: collision with root package name */
    public static final Class f31981b;

    /* renamed from: c  reason: collision with root package name */
    public static final long f31982c;

    static {
        Class b2 = b("java.io.FileOutputStream");
        f31981b = b2;
        f31982c = a(b2);
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
