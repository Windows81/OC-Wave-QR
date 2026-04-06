package com.google.common.hash;

import java.util.Random;
import sun.misc.Unsafe;

@ElementTypesAreNonnullByDefault
abstract class Striped64 extends Number {
    public static final ThreadLocal C = new ThreadLocal();
    public static final Random D = new Random();
    public static final int E = Runtime.getRuntime().availableProcessors();
    public static final Unsafe F;
    public static final long G;
    public static final long H;

    /* renamed from: A  reason: collision with root package name */
    public volatile transient long f28930A;

    /* renamed from: B  reason: collision with root package name */
    public volatile transient int f28931B;

    /* renamed from: z  reason: collision with root package name */
    public volatile transient Cell[] f28932z;

    public static final class Cell {

        /* renamed from: b  reason: collision with root package name */
        public static final Unsafe f28933b;

        /* renamed from: c  reason: collision with root package name */
        public static final long f28934c;

        /* renamed from: a  reason: collision with root package name */
        public volatile long f28935a;

        static {
            try {
                Unsafe a2 = Striped64.b();
                f28933b = a2;
                f28934c = a2.objectFieldOffset(Cell.class.getDeclaredField("a"));
            } catch (Exception e2) {
                throw new Error(e2);
            }
        }
    }

    static {
        try {
            Unsafe b2 = b();
            F = b2;
            Class<Striped64> cls = Striped64.class;
            G = b2.objectFieldOffset(cls.getDeclaredField("A"));
            H = b2.objectFieldOffset(cls.getDeclaredField("B"));
        } catch (Exception e2) {
            throw new Error(e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.common.hash.Striped64.AnonymousClass1());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0005 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static sun.misc.Unsafe b() {
        /*
            sun.misc.Unsafe r0 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0005 }
            return r0
        L_0x0005:
            com.google.common.hash.Striped64$1 r0 = new com.google.common.hash.Striped64$1     // Catch:{ PrivilegedActionException -> 0x0011 }
            r0.<init>()     // Catch:{ PrivilegedActionException -> 0x0011 }
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch:{ PrivilegedActionException -> 0x0011 }
            sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0     // Catch:{ PrivilegedActionException -> 0x0011 }
            return r0
        L_0x0011:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Could not initialize intrinsics"
            java.lang.Throwable r0 = r0.getCause()
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.hash.Striped64.b():sun.misc.Unsafe");
    }
}
