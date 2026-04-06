package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

final class UnsafeUtil {

    /* renamed from: a  reason: collision with root package name */
    public static final Unsafe f21183a = I();

    /* renamed from: b  reason: collision with root package name */
    public static final Class f21184b = Android.b();

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f21185c = r(Long.TYPE);

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f21186d = r(Integer.TYPE);

    /* renamed from: e  reason: collision with root package name */
    public static final MemoryAccessor f21187e = G();

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f21188f = a0();

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f21189g = Z();

    /* renamed from: h  reason: collision with root package name */
    public static final long f21190h;

    /* renamed from: i  reason: collision with root package name */
    public static final long f21191i;

    /* renamed from: j  reason: collision with root package name */
    public static final long f21192j;

    /* renamed from: k  reason: collision with root package name */
    public static final long f21193k;

    /* renamed from: l  reason: collision with root package name */
    public static final long f21194l;

    /* renamed from: m  reason: collision with root package name */
    public static final long f21195m;

    /* renamed from: n  reason: collision with root package name */
    public static final long f21196n;

    /* renamed from: o  reason: collision with root package name */
    public static final long f21197o;

    /* renamed from: p  reason: collision with root package name */
    public static final long f21198p;

    /* renamed from: q  reason: collision with root package name */
    public static final long f21199q;

    /* renamed from: r  reason: collision with root package name */
    public static final long f21200r;

    /* renamed from: s  reason: collision with root package name */
    public static final long f21201s;

    /* renamed from: t  reason: collision with root package name */
    public static final long f21202t;

    /* renamed from: u  reason: collision with root package name */
    public static final long f21203u = t(o());

    /* renamed from: v  reason: collision with root package name */
    public static final int f21204v;

    /* renamed from: w  reason: collision with root package name */
    public static final boolean f21205w = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    public static final class Android32MemoryAccessor extends MemoryAccessor {
        public Android32MemoryAccessor(Unsafe unsafe) {
            super(unsafe);
        }

        public void c(long j2, byte[] bArr, long j3, long j4) {
            throw new UnsupportedOperationException();
        }

        public void d(byte[] bArr, long j2, long j3, long j4) {
            throw new UnsupportedOperationException();
        }

        public boolean e(Object obj, long j2) {
            return UnsafeUtil.f21205w ? UnsafeUtil.v(obj, j2) : UnsafeUtil.w(obj, j2);
        }

        public byte f(long j2) {
            throw new UnsupportedOperationException();
        }

        public byte g(Object obj, long j2) {
            return UnsafeUtil.f21205w ? UnsafeUtil.z(obj, j2) : UnsafeUtil.A(obj, j2);
        }

        public double h(Object obj, long j2) {
            return Double.longBitsToDouble(l(obj, j2));
        }

        public float i(Object obj, long j2) {
            return Float.intBitsToFloat(j(obj, j2));
        }

        public long k(long j2) {
            throw new UnsupportedOperationException();
        }

        public void o(Object obj, long j2, boolean z2) {
            if (UnsafeUtil.f21205w) {
                UnsafeUtil.O(obj, j2, z2);
            } else {
                UnsafeUtil.P(obj, j2, z2);
            }
        }

        public void p(long j2, byte b2) {
            throw new UnsupportedOperationException();
        }

        public void q(Object obj, long j2, byte b2) {
            if (UnsafeUtil.f21205w) {
                UnsafeUtil.S(obj, j2, b2);
            } else {
                UnsafeUtil.T(obj, j2, b2);
            }
        }

        public void r(Object obj, long j2, double d2) {
            u(obj, j2, Double.doubleToLongBits(d2));
        }

        public void s(Object obj, long j2, float f2) {
            t(obj, j2, Float.floatToIntBits(f2));
        }

        public boolean x() {
            return false;
        }
    }

    public static final class Android64MemoryAccessor extends MemoryAccessor {
        public Android64MemoryAccessor(Unsafe unsafe) {
            super(unsafe);
        }

        public void c(long j2, byte[] bArr, long j3, long j4) {
            throw new UnsupportedOperationException();
        }

        public void d(byte[] bArr, long j2, long j3, long j4) {
            throw new UnsupportedOperationException();
        }

        public boolean e(Object obj, long j2) {
            return UnsafeUtil.f21205w ? UnsafeUtil.v(obj, j2) : UnsafeUtil.w(obj, j2);
        }

        public byte f(long j2) {
            throw new UnsupportedOperationException();
        }

        public byte g(Object obj, long j2) {
            return UnsafeUtil.f21205w ? UnsafeUtil.z(obj, j2) : UnsafeUtil.A(obj, j2);
        }

        public double h(Object obj, long j2) {
            return Double.longBitsToDouble(l(obj, j2));
        }

        public float i(Object obj, long j2) {
            return Float.intBitsToFloat(j(obj, j2));
        }

        public long k(long j2) {
            throw new UnsupportedOperationException();
        }

        public void o(Object obj, long j2, boolean z2) {
            if (UnsafeUtil.f21205w) {
                UnsafeUtil.O(obj, j2, z2);
            } else {
                UnsafeUtil.P(obj, j2, z2);
            }
        }

        public void p(long j2, byte b2) {
            throw new UnsupportedOperationException();
        }

        public void q(Object obj, long j2, byte b2) {
            if (UnsafeUtil.f21205w) {
                UnsafeUtil.S(obj, j2, b2);
            } else {
                UnsafeUtil.T(obj, j2, b2);
            }
        }

        public void r(Object obj, long j2, double d2) {
            u(obj, j2, Double.doubleToLongBits(d2));
        }

        public void s(Object obj, long j2, float f2) {
            t(obj, j2, Float.floatToIntBits(f2));
        }

        public boolean x() {
            return false;
        }
    }

    public static final class JvmMemoryAccessor extends MemoryAccessor {
        public JvmMemoryAccessor(Unsafe unsafe) {
            super(unsafe);
        }

        public void c(long j2, byte[] bArr, long j3, long j4) {
            this.f21206a.copyMemory((Object) null, j2, bArr, UnsafeUtil.f21190h + j3, j4);
        }

        public void d(byte[] bArr, long j2, long j3, long j4) {
            this.f21206a.copyMemory(bArr, UnsafeUtil.f21190h + j2, (Object) null, j3, j4);
        }

        public boolean e(Object obj, long j2) {
            return this.f21206a.getBoolean(obj, j2);
        }

        public byte f(long j2) {
            return this.f21206a.getByte(j2);
        }

        public byte g(Object obj, long j2) {
            return this.f21206a.getByte(obj, j2);
        }

        public double h(Object obj, long j2) {
            return this.f21206a.getDouble(obj, j2);
        }

        public float i(Object obj, long j2) {
            return this.f21206a.getFloat(obj, j2);
        }

        public long k(long j2) {
            return this.f21206a.getLong(j2);
        }

        public void o(Object obj, long j2, boolean z2) {
            this.f21206a.putBoolean(obj, j2, z2);
        }

        public void p(long j2, byte b2) {
            this.f21206a.putByte(j2, b2);
        }

        public void q(Object obj, long j2, byte b2) {
            this.f21206a.putByte(obj, j2, b2);
        }

        public void r(Object obj, long j2, double d2) {
            this.f21206a.putDouble(obj, j2, d2);
        }

        public void s(Object obj, long j2, float f2) {
            this.f21206a.putFloat(obj, j2, f2);
        }

        public boolean w() {
            Class<Object> cls = Object.class;
            if (!super.w()) {
                return false;
            }
            try {
                Class<?> cls2 = this.f21206a.getClass();
                Class cls3 = Long.TYPE;
                cls2.getMethod("getByte", new Class[]{cls, cls3});
                cls2.getMethod("putByte", new Class[]{cls, cls3, Byte.TYPE});
                cls2.getMethod("getBoolean", new Class[]{cls, cls3});
                cls2.getMethod("putBoolean", new Class[]{cls, cls3, Boolean.TYPE});
                cls2.getMethod("getFloat", new Class[]{cls, cls3});
                cls2.getMethod("putFloat", new Class[]{cls, cls3, Float.TYPE});
                cls2.getMethod("getDouble", new Class[]{cls, cls3});
                cls2.getMethod("putDouble", new Class[]{cls, cls3, Double.TYPE});
                return true;
            } catch (Throwable th) {
                UnsafeUtil.L(th);
                return false;
            }
        }

        public boolean x() {
            Class<Object> cls = Object.class;
            if (!super.x()) {
                return false;
            }
            try {
                Class<?> cls2 = this.f21206a.getClass();
                Class cls3 = Long.TYPE;
                cls2.getMethod("getByte", new Class[]{cls3});
                cls2.getMethod("putByte", new Class[]{cls3, Byte.TYPE});
                cls2.getMethod("getInt", new Class[]{cls3});
                cls2.getMethod("putInt", new Class[]{cls3, Integer.TYPE});
                cls2.getMethod("getLong", new Class[]{cls3});
                cls2.getMethod("putLong", new Class[]{cls3, cls3});
                cls2.getMethod("copyMemory", new Class[]{cls3, cls3, cls3});
                cls2.getMethod("copyMemory", new Class[]{cls, cls3, cls, cls3, cls3});
                return true;
            } catch (Throwable th) {
                UnsafeUtil.L(th);
                return false;
            }
        }
    }

    public static abstract class MemoryAccessor {

        /* renamed from: a  reason: collision with root package name */
        public Unsafe f21206a;

        public MemoryAccessor(Unsafe unsafe) {
            this.f21206a = unsafe;
        }

        public final int a(Class cls) {
            return this.f21206a.arrayBaseOffset(cls);
        }

        public final int b(Class cls) {
            return this.f21206a.arrayIndexScale(cls);
        }

        public abstract void c(long j2, byte[] bArr, long j3, long j4);

        public abstract void d(byte[] bArr, long j2, long j3, long j4);

        public abstract boolean e(Object obj, long j2);

        public abstract byte f(long j2);

        public abstract byte g(Object obj, long j2);

        public abstract double h(Object obj, long j2);

        public abstract float i(Object obj, long j2);

        public final int j(Object obj, long j2) {
            return this.f21206a.getInt(obj, j2);
        }

        public abstract long k(long j2);

        public final long l(Object obj, long j2) {
            return this.f21206a.getLong(obj, j2);
        }

        public final Object m(Object obj, long j2) {
            return this.f21206a.getObject(obj, j2);
        }

        public final long n(Field field) {
            return this.f21206a.objectFieldOffset(field);
        }

        public abstract void o(Object obj, long j2, boolean z2);

        public abstract void p(long j2, byte b2);

        public abstract void q(Object obj, long j2, byte b2);

        public abstract void r(Object obj, long j2, double d2);

        public abstract void s(Object obj, long j2, float f2);

        public final void t(Object obj, long j2, int i2) {
            this.f21206a.putInt(obj, j2, i2);
        }

        public final void u(Object obj, long j2, long j3) {
            this.f21206a.putLong(obj, j2, j3);
        }

        public final void v(Object obj, long j2, Object obj2) {
            this.f21206a.putObject(obj, j2, obj2);
        }

        public boolean w() {
            Class<Class> cls = Class.class;
            Class<Object> cls2 = Object.class;
            Unsafe unsafe = this.f21206a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls3 = unsafe.getClass();
                cls3.getMethod("objectFieldOffset", new Class[]{Field.class});
                cls3.getMethod("arrayBaseOffset", new Class[]{cls});
                cls3.getMethod("arrayIndexScale", new Class[]{cls});
                Class cls4 = Long.TYPE;
                cls3.getMethod("getInt", new Class[]{cls2, cls4});
                cls3.getMethod("putInt", new Class[]{cls2, cls4, Integer.TYPE});
                cls3.getMethod("getLong", new Class[]{cls2, cls4});
                cls3.getMethod("putLong", new Class[]{cls2, cls4, cls4});
                cls3.getMethod("getObject", new Class[]{cls2, cls4});
                cls3.getMethod("putObject", new Class[]{cls2, cls4, cls2});
                return true;
            } catch (Throwable th) {
                UnsafeUtil.L(th);
                return false;
            }
        }

        public boolean x() {
            Unsafe unsafe = this.f21206a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", new Class[]{Field.class});
                cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
                return UnsafeUtil.o() != null;
            } catch (Throwable th) {
                UnsafeUtil.L(th);
                return false;
            }
        }
    }

    static {
        long m2 = (long) m(byte[].class);
        f21190h = m2;
        Class<boolean[]> cls = boolean[].class;
        f21191i = (long) m(cls);
        f21192j = (long) n(cls);
        Class<int[]> cls2 = int[].class;
        f21193k = (long) m(cls2);
        f21194l = (long) n(cls2);
        Class<long[]> cls3 = long[].class;
        f21195m = (long) m(cls3);
        f21196n = (long) n(cls3);
        Class<float[]> cls4 = float[].class;
        f21197o = (long) m(cls4);
        f21198p = (long) n(cls4);
        Class<double[]> cls5 = double[].class;
        f21199q = (long) m(cls5);
        f21200r = (long) n(cls5);
        Class<Object[]> cls6 = Object[].class;
        f21201s = (long) m(cls6);
        f21202t = (long) n(cls6);
        f21204v = (int) (m2 & 7);
    }

    public static byte A(Object obj, long j2) {
        return (byte) ((D(obj, -4 & j2) >>> ((int) ((j2 & 3) << 3))) & 255);
    }

    public static double B(Object obj, long j2) {
        return f21187e.h(obj, j2);
    }

    public static float C(Object obj, long j2) {
        return f21187e.i(obj, j2);
    }

    public static int D(Object obj, long j2) {
        return f21187e.j(obj, j2);
    }

    public static long E(long j2) {
        return f21187e.k(j2);
    }

    public static long F(Object obj, long j2) {
        return f21187e.l(obj, j2);
    }

    public static MemoryAccessor G() {
        Unsafe unsafe = f21183a;
        if (unsafe == null) {
            return null;
        }
        if (!Android.c()) {
            return new JvmMemoryAccessor(unsafe);
        }
        if (f21185c) {
            return new Android64MemoryAccessor(unsafe);
        }
        if (f21186d) {
            return new Android32MemoryAccessor(unsafe);
        }
        return null;
    }

    public static Object H(Object obj, long j2) {
        return f21187e.m(obj, j2);
    }

    public static Unsafe I() {
        try {
            return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() {
                /* renamed from: a */
                public Unsafe run() {
                    Class<Unsafe> cls = Unsafe.class;
                    for (Field field : cls.getDeclaredFields()) {
                        field.setAccessible(true);
                        Object obj = field.get((Object) null);
                        if (cls.isInstance(obj)) {
                            return cls.cast(obj);
                        }
                    }
                    return null;
                }
            });
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean J() {
        return f21189g;
    }

    public static boolean K() {
        return f21188f;
    }

    public static void L(Throwable th) {
        Logger logger = Logger.getLogger(UnsafeUtil.class.getName());
        Level level = Level.WARNING;
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static long M(Field field) {
        return f21187e.n(field);
    }

    public static void N(Object obj, long j2, boolean z2) {
        f21187e.o(obj, j2, z2);
    }

    public static void O(Object obj, long j2, boolean z2) {
        S(obj, j2, z2 ? (byte) 1 : 0);
    }

    public static void P(Object obj, long j2, boolean z2) {
        T(obj, j2, z2 ? (byte) 1 : 0);
    }

    public static void Q(long j2, byte b2) {
        f21187e.p(j2, b2);
    }

    public static void R(byte[] bArr, long j2, byte b2) {
        f21187e.q(bArr, f21190h + j2, b2);
    }

    public static void S(Object obj, long j2, byte b2) {
        long j3 = -4 & j2;
        int D = D(obj, j3);
        int i2 = ((~((int) j2)) & 3) << 3;
        W(obj, j3, ((255 & b2) << i2) | (D & (~(255 << i2))));
    }

    public static void T(Object obj, long j2, byte b2) {
        long j3 = -4 & j2;
        int i2 = (((int) j2) & 3) << 3;
        W(obj, j3, ((255 & b2) << i2) | (D(obj, j3) & (~(255 << i2))));
    }

    public static void U(Object obj, long j2, double d2) {
        f21187e.r(obj, j2, d2);
    }

    public static void V(Object obj, long j2, float f2) {
        f21187e.s(obj, j2, f2);
    }

    public static void W(Object obj, long j2, int i2) {
        f21187e.t(obj, j2, i2);
    }

    public static void X(Object obj, long j2, long j3) {
        f21187e.u(obj, j2, j3);
    }

    public static void Y(Object obj, long j2, Object obj2) {
        f21187e.v(obj, j2, obj2);
    }

    public static boolean Z() {
        MemoryAccessor memoryAccessor = f21187e;
        if (memoryAccessor == null) {
            return false;
        }
        return memoryAccessor.w();
    }

    public static boolean a0() {
        MemoryAccessor memoryAccessor = f21187e;
        if (memoryAccessor == null) {
            return false;
        }
        return memoryAccessor.x();
    }

    public static long k(ByteBuffer byteBuffer) {
        return f21187e.l(byteBuffer, f21203u);
    }

    public static Object l(Class cls) {
        try {
            return f21183a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int m(Class cls) {
        if (f21189g) {
            return f21187e.a(cls);
        }
        return -1;
    }

    public static int n(Class cls) {
        if (f21189g) {
            return f21187e.b(cls);
        }
        return -1;
    }

    public static Field o() {
        Field s2;
        Class<Buffer> cls = Buffer.class;
        if (Android.c() && (s2 = s(cls, "effectiveDirectAddress")) != null) {
            return s2;
        }
        Field s3 = s(cls, "address");
        if (s3 == null || s3.getType() != Long.TYPE) {
            return null;
        }
        return s3;
    }

    public static void p(long j2, byte[] bArr, long j3, long j4) {
        f21187e.c(j2, bArr, j3, j4);
    }

    public static void q(byte[] bArr, long j2, long j3, long j4) {
        f21187e.d(bArr, j2, j3, j4);
    }

    public static boolean r(Class cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!Android.c()) {
            return false;
        }
        try {
            Class cls3 = f21184b;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", new Class[]{cls, cls4});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, cls4});
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", new Class[]{cls, cls5, cls4});
            cls3.getMethod("peekInt", new Class[]{cls, cls4});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, cls5, cls5});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, cls5, cls5});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Field s(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static long t(Field field) {
        MemoryAccessor memoryAccessor;
        if (field == null || (memoryAccessor = f21187e) == null) {
            return -1;
        }
        return memoryAccessor.n(field);
    }

    public static boolean u(Object obj, long j2) {
        return f21187e.e(obj, j2);
    }

    public static boolean v(Object obj, long j2) {
        return z(obj, j2) != 0;
    }

    public static boolean w(Object obj, long j2) {
        return A(obj, j2) != 0;
    }

    public static byte x(long j2) {
        return f21187e.f(j2);
    }

    public static byte y(byte[] bArr, long j2) {
        return f21187e.g(bArr, f21190h + j2);
    }

    public static byte z(Object obj, long j2) {
        return (byte) ((D(obj, -4 & j2) >>> ((int) (((~j2) & 3) << 3))) & 255);
    }
}
