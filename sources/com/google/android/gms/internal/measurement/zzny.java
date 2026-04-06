package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

final class zzny {

    /* renamed from: a  reason: collision with root package name */
    public static final Unsafe f25719a;

    /* renamed from: b  reason: collision with root package name */
    public static final Class f25720b = zzjl.a();

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f25721c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f25722d;

    /* renamed from: e  reason: collision with root package name */
    public static final zzb f25723e;

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f25724f;

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f25725g;

    /* renamed from: h  reason: collision with root package name */
    public static final long f25726h = ((long) o(byte[].class));

    /* renamed from: i  reason: collision with root package name */
    public static final boolean f25727i;

    public static final class zza extends zzb {
        public zza(Unsafe unsafe) {
            super(unsafe);
        }

        public final double a(Object obj, long j2) {
            return Double.longBitsToDouble(m(obj, j2));
        }

        public final void b(Object obj, long j2, byte b2) {
            if (zzny.f25727i) {
                zzny.u(obj, j2, b2);
            } else {
                zzny.y(obj, j2, b2);
            }
        }

        public final void c(Object obj, long j2, double d2) {
            f(obj, j2, Double.doubleToLongBits(d2));
        }

        public final void d(Object obj, long j2, float f2) {
            e(obj, j2, Float.floatToIntBits(f2));
        }

        public final void g(Object obj, long j2, boolean z2) {
            if (zzny.f25727i) {
                zzny.u(obj, j2, r3 ? (byte) 1 : 0);
            } else {
                zzny.y(obj, j2, r3 ? (byte) 1 : 0);
            }
        }

        public final float i(Object obj, long j2) {
            return Float.intBitsToFloat(l(obj, j2));
        }

        public final boolean k(Object obj, long j2) {
            return zzny.f25727i ? zzny.D(obj, j2) : zzny.E(obj, j2);
        }
    }

    public static abstract class zzb {

        /* renamed from: a  reason: collision with root package name */
        public Unsafe f25728a;

        public zzb(Unsafe unsafe) {
            this.f25728a = unsafe;
        }

        public abstract double a(Object obj, long j2);

        public abstract void b(Object obj, long j2, byte b2);

        public abstract void c(Object obj, long j2, double d2);

        public abstract void d(Object obj, long j2, float f2);

        public final void e(Object obj, long j2, int i2) {
            this.f25728a.putInt(obj, j2, i2);
        }

        public final void f(Object obj, long j2, long j3) {
            this.f25728a.putLong(obj, j2, j3);
        }

        public abstract void g(Object obj, long j2, boolean z2);

        public final boolean h() {
            Class<Class> cls = Class.class;
            Class<Object> cls2 = Object.class;
            Unsafe unsafe = this.f25728a;
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
                zzny.l(th);
                return false;
            }
        }

        public abstract float i(Object obj, long j2);

        public final boolean j() {
            Unsafe unsafe = this.f25728a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", new Class[]{Field.class});
                cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
                return zzny.C() != null;
            } catch (Throwable th) {
                zzny.l(th);
                return false;
            }
        }

        public abstract boolean k(Object obj, long j2);

        public final int l(Object obj, long j2) {
            return this.f25728a.getInt(obj, j2);
        }

        public final long m(Object obj, long j2) {
            return this.f25728a.getLong(obj, j2);
        }
    }

    public static final class zzc extends zzb {
        public zzc(Unsafe unsafe) {
            super(unsafe);
        }

        public final double a(Object obj, long j2) {
            return Double.longBitsToDouble(m(obj, j2));
        }

        public final void b(Object obj, long j2, byte b2) {
            if (zzny.f25727i) {
                zzny.u(obj, j2, b2);
            } else {
                zzny.y(obj, j2, b2);
            }
        }

        public final void c(Object obj, long j2, double d2) {
            f(obj, j2, Double.doubleToLongBits(d2));
        }

        public final void d(Object obj, long j2, float f2) {
            e(obj, j2, Float.floatToIntBits(f2));
        }

        public final void g(Object obj, long j2, boolean z2) {
            if (zzny.f25727i) {
                zzny.u(obj, j2, r3 ? (byte) 1 : 0);
            } else {
                zzny.y(obj, j2, r3 ? (byte) 1 : 0);
            }
        }

        public final float i(Object obj, long j2) {
            return Float.intBitsToFloat(l(obj, j2));
        }

        public final boolean k(Object obj, long j2) {
            return zzny.f25727i ? zzny.D(obj, j2) : zzny.E(obj, j2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0034  */
    static {
        /*
            sun.misc.Unsafe r0 = p()
            f25719a = r0
            java.lang.Class r1 = com.google.android.gms.internal.measurement.zzjl.a()
            f25720b = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            boolean r1 = A(r1)
            f25721c = r1
            java.lang.Class r2 = java.lang.Integer.TYPE
            boolean r2 = A(r2)
            f25722d = r2
            if (r0 == 0) goto L_0x002e
            if (r1 == 0) goto L_0x0026
            com.google.android.gms.internal.measurement.zzny$zzc r1 = new com.google.android.gms.internal.measurement.zzny$zzc
            r1.<init>(r0)
            goto L_0x002f
        L_0x0026:
            if (r2 == 0) goto L_0x002e
            com.google.android.gms.internal.measurement.zzny$zza r1 = new com.google.android.gms.internal.measurement.zzny$zza
            r1.<init>(r0)
            goto L_0x002f
        L_0x002e:
            r1 = 0
        L_0x002f:
            f25723e = r1
            r0 = 0
            if (r1 != 0) goto L_0x0036
            r2 = r0
            goto L_0x003a
        L_0x0036:
            boolean r2 = r1.j()
        L_0x003a:
            f25724f = r2
            if (r1 != 0) goto L_0x0040
            r2 = r0
            goto L_0x0044
        L_0x0040:
            boolean r2 = r1.h()
        L_0x0044:
            f25725g = r2
            java.lang.Class<byte[]> r2 = byte[].class
            int r2 = o(r2)
            long r2 = (long) r2
            f25726h = r2
            java.lang.Class<boolean[]> r2 = boolean[].class
            o(r2)
            s(r2)
            java.lang.Class<int[]> r2 = int[].class
            o(r2)
            s(r2)
            java.lang.Class<long[]> r2 = long[].class
            o(r2)
            s(r2)
            java.lang.Class<float[]> r2 = float[].class
            o(r2)
            s(r2)
            java.lang.Class<double[]> r2 = double[].class
            o(r2)
            s(r2)
            java.lang.Class<java.lang.Object[]> r2 = java.lang.Object[].class
            o(r2)
            s(r2)
            java.lang.reflect.Field r2 = C()
            if (r2 == 0) goto L_0x008d
            if (r1 != 0) goto L_0x0088
            goto L_0x008d
        L_0x0088:
            sun.misc.Unsafe r1 = r1.f25728a
            r1.objectFieldOffset(r2)
        L_0x008d:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN
            if (r1 != r2) goto L_0x0096
            r0 = 1
        L_0x0096:
            f25727i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzny.<clinit>():void");
    }

    public static boolean A(Class cls) {
        Class<byte[]> cls2 = byte[].class;
        try {
            Class cls3 = f25720b;
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

    public static Object B(Object obj, long j2) {
        return f25723e.f25728a.getObject(obj, j2);
    }

    public static Field C() {
        Class<Buffer> cls = Buffer.class;
        Field d2 = d(cls, "effectiveDirectAddress");
        if (d2 != null) {
            return d2;
        }
        Field d3 = d(cls, "address");
        if (d3 == null || d3.getType() != Long.TYPE) {
            return null;
        }
        return d3;
    }

    public static /* synthetic */ boolean D(Object obj, long j2) {
        return ((byte) (t(obj, -4 & j2) >>> ((int) (((~j2) & 3) << 3)))) != 0;
    }

    public static /* synthetic */ boolean E(Object obj, long j2) {
        return ((byte) (t(obj, -4 & j2) >>> ((int) ((j2 & 3) << 3)))) != 0;
    }

    public static boolean F(Object obj, long j2) {
        return f25723e.k(obj, j2);
    }

    public static double a(Object obj, long j2) {
        return f25723e.a(obj, j2);
    }

    public static Object b(Class cls) {
        try {
            return f25719a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static Field d(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void f(Object obj, long j2, double d2) {
        f25723e.c(obj, j2, d2);
    }

    public static void g(Object obj, long j2, float f2) {
        f25723e.d(obj, j2, f2);
    }

    public static void h(Object obj, long j2, int i2) {
        f25723e.e(obj, j2, i2);
    }

    public static void i(Object obj, long j2, long j3) {
        f25723e.f(obj, j2, j3);
    }

    public static void j(Object obj, long j2, Object obj2) {
        f25723e.f25728a.putObject(obj, j2, obj2);
    }

    public static /* synthetic */ void l(Throwable th) {
        Logger logger = Logger.getLogger(zzny.class.getName());
        Level level = Level.WARNING;
        String valueOf = String.valueOf(th);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: " + valueOf);
    }

    public static void m(byte[] bArr, long j2, byte b2) {
        f25723e.b(bArr, f25726h + j2, b2);
    }

    public static float n(Object obj, long j2) {
        return f25723e.i(obj, j2);
    }

    public static int o(Class cls) {
        if (f25725g) {
            return f25723e.f25728a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static Unsafe p() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzoa());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int s(Class cls) {
        if (f25725g) {
            return f25723e.f25728a.arrayIndexScale(cls);
        }
        return -1;
    }

    public static int t(Object obj, long j2) {
        return f25723e.l(obj, j2);
    }

    public static void u(Object obj, long j2, byte b2) {
        long j3 = -4 & j2;
        int t2 = t(obj, j3);
        int i2 = ((~((int) j2)) & 3) << 3;
        h(obj, j3, ((255 & b2) << i2) | (t2 & (~(255 << i2))));
    }

    public static void v(Object obj, long j2, boolean z2) {
        f25723e.g(obj, j2, z2);
    }

    public static boolean w() {
        return f25725g;
    }

    public static long x(Object obj, long j2) {
        return f25723e.m(obj, j2);
    }

    public static void y(Object obj, long j2, byte b2) {
        long j3 = -4 & j2;
        int i2 = (((int) j2) & 3) << 3;
        h(obj, j3, ((255 & b2) << i2) | (t(obj, j3) & (~(255 << i2))));
    }

    public static boolean z() {
        return f25724f;
    }
}
