package com.google.common.cache;

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
    public volatile transient long f27934A;

    /* renamed from: B  reason: collision with root package name */
    public volatile transient int f27935B;

    /* renamed from: z  reason: collision with root package name */
    public volatile transient Cell[] f27936z;

    public static final class Cell {

        /* renamed from: b  reason: collision with root package name */
        public static final Unsafe f27937b;

        /* renamed from: c  reason: collision with root package name */
        public static final long f27938c;

        /* renamed from: a  reason: collision with root package name */
        public volatile long f27939a;

        static {
            try {
                Unsafe c2 = Striped64.g();
                f27937b = c2;
                f27938c = c2.objectFieldOffset(Cell.class.getDeclaredField("a"));
            } catch (Exception e2) {
                throw new Error(e2);
            }
        }

        public Cell(long j2) {
            this.f27939a = j2;
        }

        public final boolean a(long j2, long j3) {
            return f27937b.compareAndSwapLong(this, f27938c, j2, j3);
        }
    }

    static {
        try {
            Unsafe g2 = g();
            F = g2;
            Class<Striped64> cls = Striped64.class;
            G = g2.objectFieldOffset(cls.getDeclaredField("A"));
            H = g2.objectFieldOffset(cls.getDeclaredField("B"));
        } catch (Exception e2) {
            throw new Error(e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.common.cache.Striped64.AnonymousClass1());
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
    public static sun.misc.Unsafe g() {
        /*
            sun.misc.Unsafe r0 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0005 }
            return r0
        L_0x0005:
            com.google.common.cache.Striped64$1 r0 = new com.google.common.cache.Striped64$1     // Catch:{ PrivilegedActionException -> 0x0011 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.Striped64.g():sun.misc.Unsafe");
    }

    public final boolean d(long j2, long j3) {
        return F.compareAndSwapLong(this, G, j2, j3);
    }

    public final boolean e() {
        return F.compareAndSwapInt(this, H, 0, 1);
    }

    public abstract long f(long j2, long j3);

    /* JADX WARNING: Removed duplicated region for block: B:83:0x00f1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0023 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(long r17, int[] r19, boolean r20) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r0 = 1
            r4 = 0
            if (r19 != 0) goto L_0x001b
            java.lang.ThreadLocal r5 = C
            int[] r6 = new int[r0]
            r5.set(r6)
            java.util.Random r5 = D
            int r5 = r5.nextInt()
            if (r5 != 0) goto L_0x0018
            r5 = r0
        L_0x0018:
            r6[r4] = r5
            goto L_0x001f
        L_0x001b:
            r5 = r19[r4]
            r6 = r19
        L_0x001f:
            r8 = r4
            r7 = r5
            r5 = r20
        L_0x0023:
            com.google.common.cache.Striped64$Cell[] r9 = r1.f27936z
            if (r9 == 0) goto L_0x00b8
            int r10 = r9.length
            if (r10 <= 0) goto L_0x00b8
            int r11 = r10 + -1
            r11 = r11 & r7
            r11 = r9[r11]
            if (r11 != 0) goto L_0x0064
            int r9 = r1.f27935B
            if (r9 != 0) goto L_0x0062
            com.google.common.cache.Striped64$Cell r9 = new com.google.common.cache.Striped64$Cell
            r9.<init>(r2)
            int r10 = r1.f27935B
            if (r10 != 0) goto L_0x0062
            boolean r10 = r16.e()
            if (r10 == 0) goto L_0x0062
            com.google.common.cache.Striped64$Cell[] r10 = r1.f27936z     // Catch:{ all -> 0x0056 }
            if (r10 == 0) goto L_0x0058
            int r11 = r10.length     // Catch:{ all -> 0x0056 }
            if (r11 <= 0) goto L_0x0058
            int r11 = r11 + -1
            r11 = r11 & r7
            r12 = r10[r11]     // Catch:{ all -> 0x0056 }
            if (r12 != 0) goto L_0x0058
            r10[r11] = r9     // Catch:{ all -> 0x0056 }
            r9 = r0
            goto L_0x0059
        L_0x0056:
            r0 = move-exception
            goto L_0x005f
        L_0x0058:
            r9 = r4
        L_0x0059:
            r1.f27935B = r4
            if (r9 == 0) goto L_0x0023
            goto L_0x00f1
        L_0x005f:
            r1.f27935B = r4
            throw r0
        L_0x0062:
            r8 = r4
            goto L_0x00ab
        L_0x0064:
            if (r5 != 0) goto L_0x0068
            r5 = r0
            goto L_0x00ab
        L_0x0068:
            long r12 = r11.f27939a
            long r14 = r1.f(r12, r2)
            boolean r11 = r11.a(r12, r14)
            if (r11 == 0) goto L_0x0076
            goto L_0x00f1
        L_0x0076:
            int r11 = E
            if (r10 >= r11) goto L_0x0062
            com.google.common.cache.Striped64$Cell[] r11 = r1.f27936z
            if (r11 == r9) goto L_0x007f
            goto L_0x0062
        L_0x007f:
            if (r8 != 0) goto L_0x0083
            r8 = r0
            goto L_0x00ab
        L_0x0083:
            int r11 = r1.f27935B
            if (r11 != 0) goto L_0x00ab
            boolean r11 = r16.e()
            if (r11 == 0) goto L_0x00ab
            com.google.common.cache.Striped64$Cell[] r8 = r1.f27936z     // Catch:{ all -> 0x009f }
            if (r8 != r9) goto L_0x00a3
            int r8 = r10 << 1
            com.google.common.cache.Striped64$Cell[] r8 = new com.google.common.cache.Striped64.Cell[r8]     // Catch:{ all -> 0x009f }
            r11 = r4
        L_0x0096:
            if (r11 >= r10) goto L_0x00a1
            r12 = r9[r11]     // Catch:{ all -> 0x009f }
            r8[r11] = r12     // Catch:{ all -> 0x009f }
            int r11 = r11 + 1
            goto L_0x0096
        L_0x009f:
            r0 = move-exception
            goto L_0x00a8
        L_0x00a1:
            r1.f27936z = r8     // Catch:{ all -> 0x009f }
        L_0x00a3:
            r1.f27935B = r4
            r8 = r4
            goto L_0x0023
        L_0x00a8:
            r1.f27935B = r4
            throw r0
        L_0x00ab:
            int r9 = r7 << 13
            r7 = r7 ^ r9
            int r9 = r7 >>> 17
            r7 = r7 ^ r9
            int r9 = r7 << 5
            r7 = r7 ^ r9
            r6[r4] = r7
            goto L_0x0023
        L_0x00b8:
            int r10 = r1.f27935B
            if (r10 != 0) goto L_0x00e5
            com.google.common.cache.Striped64$Cell[] r10 = r1.f27936z
            if (r10 != r9) goto L_0x00e5
            boolean r10 = r16.e()
            if (r10 == 0) goto L_0x00e5
            com.google.common.cache.Striped64$Cell[] r10 = r1.f27936z     // Catch:{ all -> 0x00da }
            if (r10 != r9) goto L_0x00dc
            r9 = 2
            com.google.common.cache.Striped64$Cell[] r9 = new com.google.common.cache.Striped64.Cell[r9]     // Catch:{ all -> 0x00da }
            r10 = r7 & 1
            com.google.common.cache.Striped64$Cell r11 = new com.google.common.cache.Striped64$Cell     // Catch:{ all -> 0x00da }
            r11.<init>(r2)     // Catch:{ all -> 0x00da }
            r9[r10] = r11     // Catch:{ all -> 0x00da }
            r1.f27936z = r9     // Catch:{ all -> 0x00da }
            r9 = r0
            goto L_0x00dd
        L_0x00da:
            r0 = move-exception
            goto L_0x00e2
        L_0x00dc:
            r9 = r4
        L_0x00dd:
            r1.f27935B = r4
            if (r9 == 0) goto L_0x0023
            goto L_0x00f1
        L_0x00e2:
            r1.f27935B = r4
            throw r0
        L_0x00e5:
            long r9 = r1.f27934A
            long r11 = r1.f(r9, r2)
            boolean r9 = r1.d(r9, r11)
            if (r9 == 0) goto L_0x0023
        L_0x00f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.Striped64.h(long, int[], boolean):void");
    }
}
