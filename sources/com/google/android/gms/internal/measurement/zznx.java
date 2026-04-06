package com.google.android.gms.internal.measurement;

abstract class zznx<T, B> {

    /* renamed from: a  reason: collision with root package name */
    public static volatile int f25718a = 100;

    public abstract int a(Object obj);

    public abstract Object b();

    public abstract Object c(Object obj, Object obj2);

    public abstract void d(Object obj, int i2, int i3);

    public abstract void e(Object obj, int i2, long j2);

    public abstract void f(Object obj, int i2, zzjs zzjs);

    public abstract void g(Object obj, int i2, Object obj2);

    public abstract void h(Object obj, zzos zzos);

    public abstract boolean i(zzna zzna);

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0034 A[LOOP:0: B:17:0x0034->B:20:0x0041, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean j(java.lang.Object r7, com.google.android.gms.internal.measurement.zzna r8, int r9) {
        /*
            r6 = this;
            int r0 = r8.e()
            int r1 = r0 >>> 3
            r0 = r0 & 7
            r2 = 1
            if (r0 == 0) goto L_0x006b
            if (r0 == r2) goto L_0x0063
            r3 = 2
            if (r0 == r3) goto L_0x005b
            r3 = 4
            r4 = 3
            if (r0 == r4) goto L_0x0028
            if (r0 == r3) goto L_0x0026
            r9 = 5
            if (r0 != r9) goto L_0x0021
            int r8 = r8.h()
            r6.d(r7, r1, r8)
            return r2
        L_0x0021:
            com.google.android.gms.internal.measurement.zzln r7 = com.google.android.gms.internal.measurement.zzlk.a()
            throw r7
        L_0x0026:
            r7 = 0
            return r7
        L_0x0028:
            java.lang.Object r0 = r6.b()
            int r4 = r1 << 3
            r3 = r3 | r4
            int r9 = r9 + r2
            int r4 = f25718a
            if (r9 >= r4) goto L_0x0056
        L_0x0034:
            int r4 = r8.c()
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x0043
            boolean r4 = r6.j(r0, r8, r9)
            if (r4 != 0) goto L_0x0034
        L_0x0043:
            int r8 = r8.e()
            if (r3 != r8) goto L_0x0051
            java.lang.Object r8 = r6.r(r0)
            r6.g(r7, r1, r8)
            return r2
        L_0x0051:
            com.google.android.gms.internal.measurement.zzlk r7 = com.google.android.gms.internal.measurement.zzlk.b()
            throw r7
        L_0x0056:
            com.google.android.gms.internal.measurement.zzlk r7 = com.google.android.gms.internal.measurement.zzlk.h()
            throw r7
        L_0x005b:
            com.google.android.gms.internal.measurement.zzjs r8 = r8.l()
            r6.f(r7, r1, r8)
            return r2
        L_0x0063:
            long r8 = r8.j()
            r6.e(r7, r1, r8)
            return r2
        L_0x006b:
            long r8 = r8.f()
            r6.l(r7, r1, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zznx.j(java.lang.Object, com.google.android.gms.internal.measurement.zzna, int):boolean");
    }

    public abstract int k(Object obj);

    public abstract void l(Object obj, int i2, long j2);

    public abstract void m(Object obj, zzos zzos);

    public abstract void n(Object obj, Object obj2);

    public abstract Object o(Object obj);

    public abstract void p(Object obj, Object obj2);

    public abstract Object q(Object obj);

    public abstract Object r(Object obj);

    public abstract void s(Object obj);
}
