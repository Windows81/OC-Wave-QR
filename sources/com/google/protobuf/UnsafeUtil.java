package com.google.protobuf;

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
    public static final Unsafe f32336a = I();

    /* renamed from: b  reason: collision with root package name */
    public static final Class f32337b = Android.b();

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f32338c = r(Long.TYPE);

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f32339d = r(Integer.TYPE);

    /* renamed from: e  reason: collision with root package name */
    public static final MemoryAccessor f32340e = G();

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f32341f = a0();

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f32342g = Z();

    /* renamed from: h  reason: collision with root package name */
    public static final long f32343h;

    /* renamed from: i  reason: collision with root package name */
    public static final long f32344i;

    /* renamed from: j  reason: collision with root package name */
    public static final long f32345j;

    /* renamed from: k  reason: collision with root package name */
    public static final long f32346k;

    /* renamed from: l  reason: collision with root package name */
    public static final long f32347l;

    /* renamed from: m  reason: collision with root package name */
    public static final long f32348m;

    /* renamed from: n  reason: collision with root package name */
    public static final long f32349n;

    /* renamed from: o  reason: collision with root package name */
    public static final long f32350o;

    /* renamed from: p  reason: collision with root package name */
    public static final long f32351p;

    /* renamed from: q  reason: collision with root package name */
    public static final long f32352q;

    /* renamed from: r  reason: collision with root package name */
    public static final long f32353r;

    /* renamed from: s  reason: collision with root package name */
    public static final long f32354s;

    /* renamed from: t  reason: collision with root package name */
    public static final long f32355t;

    /* renamed from: u  reason: collision with root package name */
    public static final long f32356u = t(o());

    /* renamed from: v  reason: collision with root package name */
    public static final int f32357v;

    /* renamed from: w  reason: collision with root package name */
    public static final boolean f32358w = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

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
            return UnsafeUtil.f32358w ? UnsafeUtil.v(obj, j2) : UnsafeUtil.w(obj, j2);
        }

        public byte f(long j2) {
            throw new UnsupportedOperationException();
        }

        public byte g(Object obj, long j2) {
            return UnsafeUtil.f32358w ? UnsafeUtil.z(obj, j2) : UnsafeUtil.A(obj, j2);
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
            if (UnsafeUtil.f32358w) {
                UnsafeUtil.O(obj, j2, z2);
            } else {
                UnsafeUtil.P(obj, j2, z2);
            }
        }

        public void p(long j2, byte b2) {
            throw new UnsupportedOperationException();
        }

        public void q(Object obj, long j2, byte b2) {
            if (UnsafeUtil.f32358w) {
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
            return UnsafeUtil.f32358w ? UnsafeUtil.v(obj, j2) : UnsafeUtil.w(obj, j2);
        }

        public byte f(long j2) {
            throw new UnsupportedOperationException();
        }

        public byte g(Object obj, long j2) {
            return UnsafeUtil.f32358w ? UnsafeUtil.z(obj, j2) : UnsafeUtil.A(obj, j2);
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
            if (UnsafeUtil.f32358w) {
                UnsafeUtil.O(obj, j2, z2);
            } else {
                UnsafeUtil.P(obj, j2, z2);
            }
        }

        public void p(long j2, byte b2) {
            throw new UnsupportedOperationException();
        }

        public void q(Object obj, long j2, byte b2) {
            if (UnsafeUtil.f32358w) {
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
            this.f32359a.copyMemory((Object) null, j2, bArr, UnsafeUtil.f32343h + j3, j4);
        }

        public void d(byte[] bArr, long j2, long j3, long j4) {
            this.f32359a.copyMemory(bArr, UnsafeUtil.f32343h + j2, (Object) null, j3, j4);
        }

        public boolean e(Object obj, long j2) {
            return this.f32359a.getBoolean(obj, j2);
        }

        public byte f(long j2) {
            return this.f32359a.getByte(j2);
        }

        public byte g(Object obj, long j2) {
            return this.f32359a.getByte(obj, j2);
        }

        public double h(Object obj, long j2) {
            return this.f32359a.getDouble(obj, j2);
        }

        public float i(Object obj, long j2) {
            return this.f32359a.getFloat(obj, j2);
        }

        public long k(long j2) {
            return this.f32359a.getLong(j2);
        }

        public void o(Object obj, long j2, boolean z2) {
            this.f32359a.putBoolean(obj, j2, z2);
        }

        public void p(long j2, byte b2) {
            this.f32359a.putByte(j2, b2);
        }

        public void q(Object obj, long j2, byte b2) {
            this.f32359a.putByte(obj, j2, b2);
        }

        public void r(Object obj, long j2, double d2) {
            this.f32359a.putDouble(obj, j2, d2);
        }

        public void s(Object obj, long j2, float f2) {
            this.f32359a.putFloat(obj, j2, f2);
        }

        public boolean w() {
            Class<Object> cls = Object.class;
            if (!super.w()) {
                return false;
            }
            try {
                Class<?> cls2 = this.f32359a.getClass();
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
                Class<?> cls2 = this.f32359a.getClass();
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
        public Unsafe f32359a;

        public MemoryAccessor(Unsafe unsafe) {
            this.f32359a = unsafe;
        }

        public final int a(Class cls) {
            return this.f32359a.arrayBaseOffset(cls);
        }

        public final int b(Class cls) {
            return this.f32359a.arrayIndexScale(cls);
        }

        public abstract void c(long j2, byte[] bArr, long j3, long j4);

        public abstract void d(byte[] bArr, long j2, long j3, long j4);

        public abstract boolean e(Object obj, long j2);

        public abstract byte f(long j2);

        public abstract byte g(Object obj, long j2);

        public abstract double h(Object obj, long j2);

        public abstract float i(Object obj, long j2);

        public final int j(Object obj, long j2) {
            return this.f32359a.getInt(obj, j2);
        }

        public abstract long k(long j2);

        public final long l(Object obj, long j2) {
            return this.f32359a.getLong(obj, j2);
        }

        public final Object m(Object obj, long j2) {
            return this.f32359a.getObject(obj, j2);
        }

        public final long n(Field field) {
            return this.f32359a.objectFieldOffset(field);
        }

        public abstract void o(Object obj, long j2, boolean z2);

        public abstract void p(long j2, byte b2);

        public abstract void q(Object obj, long j2, byte b2);

        public abstract void r(Object obj, long j2, double d2);

        public abstract void s(Object obj, long j2, float f2);

        public final void t(Object obj, long j2, int i2) {
            this.f32359a.putInt(obj, j2, i2);
        }

        public final void u(Object obj, long j2, long j3) {
            this.f32359a.putLong(obj, j2, j3);
        }

        public final void v(Object obj, long j2, Object obj2) {
            this.f32359a.putObject(obj, j2, obj2);
        }

        public boolean w() {
            Class<Class> cls = Class.class;
            Class<Object> cls2 = Object.class;
            Unsafe unsafe = this.f32359a;
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
            Unsafe unsafe = this.f32359a;
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
        f32343h = m2;
        Class<boolean[]> cls = boolean[].class;
        f32344i = (long) m(cls);
        f32345j = (long) n(cls);
        Class<int[]> cls2 = int[].class;
        f32346k = (long) m(cls2);
        f32347l = (long) n(cls2);
        Class<long[]> cls3 = long[].class;
        f32348m = (long) m(cls3);
        f32349n = (long) n(cls3);
        Class<float[]> cls4 = float[].class;
        f32350o = (long) m(cls4);
        f32351p = (long) n(cls4);
        Class<double[]> cls5 = double[].class;
        f32352q = (long) m(cls5);
        f32353r = (long) n(cls5);
        Class<Object[]> cls6 = Object[].class;
        f32354s = (long) m(cls6);
        f32355t = (long) n(cls6);
        f32357v = (int) (m2 & 7);
    }

    public static byte A(Object obj, long j2) {
        return (byte) ((D(obj, -4 & j2) >>> ((int) ((j2 & 3) << 3))) & 255);
    }

    public static double B(Object obj, long j2) {
        return f32340e.h(obj, j2);
    }

    public static float C(Object obj, long j2) {
        return f32340e.i(obj, j2);
    }

    public static int D(Object obj, long j2) {
        return f32340e.j(obj, j2);
    }

    public static long E(long j2) {
        return f32340e.k(j2);
    }

    public static long F(Object obj, long j2) {
        return f32340e.l(obj, j2);
    }

    public static MemoryAccessor G() {
        Unsafe unsafe = f32336a;
        if (unsafe == null) {
            return null;
        }
        if (!Android.c()) {
            return new JvmMemoryAccessor(unsafe);
        }
        if (f32338c) {
            return new Android64MemoryAccessor(unsafe);
        }
        if (f32339d) {
            return new Android32MemoryAccessor(unsafe);
        }
        return null;
    }

    public static Object H(Object obj, long j2) {
        return f32340e.m(obj, j2);
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
        return f32342g;
    }

    public static boolean K() {
        return f32341f;
    }

    public static void L(Throwable th) {
        Logger logger = Logger.getLogger(UnsafeUtil.class.getName());
        Level level = Level.WARNING;
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static long M(Field field) {
        return f32340e.n(field);
    }

    public static void N(Object obj, long j2, boolean z2) {
        f32340e.o(obj, j2, z2);
    }

    public static void O(Object obj, long j2, boolean z2) {
        S(obj, j2, z2 ? (byte) 1 : 0);
    }

    public static void P(Object obj, long j2, boolean z2) {
        T(obj, j2, z2 ? (byte) 1 : 0);
    }

    public static void Q(long j2, byte b2) {
        f32340e.p(j2, b2);
    }

    public static void R(byte[] bArr, long j2, byte b2) {
        f32340e.q(bArr, f32343h + j2, b2);
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
        f32340e.r(obj, j2, d2);
    }

    public static void V(Object obj, long j2, float f2) {
        f32340e.s(obj, j2, f2);
    }

    public static void W(Object obj, long j2, int i2) {
        f32340e.t(obj, j2, i2);
    }

    public static void X(Object obj, long j2, long j3) {
        f32340e.u(obj, j2, j3);
    }

    public static void Y(Object obj, long j2, Object obj2) {
        f32340e.v(obj, j2, obj2);
    }

    public static boolean Z() {
        MemoryAccessor memoryAccessor = f32340e;
        if (memoryAccessor == null) {
            return false;
        }
        return memoryAccessor.w();
    }

    public static boolean a0() {
        MemoryAccessor memoryAccessor = f32340e;
        if (memoryAccessor == null) {
            return false;
        }
        return memoryAccessor.x();
    }

    public static long k(ByteBuffer byteBuffer) {
        return f32340e.l(byteBuffer, f32356u);
    }

    public static Object l(Class cls) {
        try {
            return f32336a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int m(Class cls) {
        if (f32342g) {
            return f32340e.a(cls);
        }
        return -1;
    }

    public static int n(Class cls) {
        if (f32342g) {
            return f32340e.b(cls);
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
        f32340e.c(j2, bArr, j3, j4);
    }

    public static void q(byte[] bArr, long j2, long j3, long j4) {
        f32340e.d(bArr, j2, j3, j4);
    }

    public static boolean r(Class cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!Android.c()) {
            return false;
        }
        try {
            Class cls3 = f32337b;
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
        if (field == null || (memoryAccessor = f32340e) == null) {
            return -1;
        }
        return memoryAccessor.n(field);
    }

    public static boolean u(Object obj, long j2) {
        return f32340e.e(obj, j2);
    }

    public static boolean v(Object obj, long j2) {
        return z(obj, j2) != 0;
    }

    public static boolean w(Object obj, long j2) {
        return A(obj, j2) != 0;
    }

    public static byte x(long j2) {
        return f32340e.f(j2);
    }

    public static byte y(byte[] bArr, long j2) {
        return f32340e.g(bArr, f32343h + j2);
    }

    public static byte z(Object obj, long j2) {
        return (byte) ((D(obj, -4 & j2) >>> ((int) (((~j2) & 3) << 3))) & 255);
    }
}
