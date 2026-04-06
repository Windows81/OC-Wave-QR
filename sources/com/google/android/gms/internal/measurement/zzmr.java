package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

final class zzmr<T> implements zznd<T> {

    /* renamed from: a  reason: collision with root package name */
    public final zzml f25678a;

    /* renamed from: b  reason: collision with root package name */
    public final zznx f25679b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f25680c;

    /* renamed from: d  reason: collision with root package name */
    public final zzkr f25681d;

    public zzmr(zznx zznx, zzkr zzkr, zzml zzml) {
        this.f25679b = zznx;
        this.f25680c = zzkr.h(zzml);
        this.f25681d = zzkr;
        this.f25678a = zzml;
    }

    public static zzmr k(zznx zznx, zzkr zzkr, zzml zzml) {
        return new zzmr(zznx, zzkr, zzml);
    }

    public final Object a() {
        zzml zzml = this.f25678a;
        return zzml instanceof zzlc ? ((zzlc) zzml).A() : zzml.g().E();
    }

    public final int b(Object obj) {
        zznx zznx = this.f25679b;
        int k2 = zznx.k(zznx.q(obj));
        return this.f25680c ? k2 + this.f25681d.b(obj).a() : k2;
    }

    public final boolean c(Object obj) {
        return this.f25681d.b(obj).s();
    }

    public final void d(Object obj) {
        this.f25679b.s(obj);
        this.f25681d.j(obj);
    }

    public final int e(Object obj) {
        int hashCode = this.f25679b.q(obj).hashCode();
        return this.f25680c ? (hashCode * 53) + this.f25681d.b(obj).hashCode() : hashCode;
    }

    public final void f(Object obj, Object obj2) {
        zznf.n(this.f25679b, obj, obj2);
        if (this.f25680c) {
            zznf.l(this.f25681d, obj, obj2);
        }
    }

    public final void g(Object obj, zzna zzna, zzkp zzkp) {
        boolean z2;
        zznx zznx = this.f25679b;
        zzkr zzkr = this.f25681d;
        Object o2 = zznx.o(obj);
        zzkv i2 = zzkr.i(obj);
        do {
            try {
                if (zzna.c() == Integer.MAX_VALUE) {
                    zznx.n(obj, o2);
                    return;
                }
                int e2 = zzna.e();
                int i3 = 0;
                if (e2 == 11) {
                    Object obj2 = null;
                    zzjs zzjs = null;
                    while (zzna.c() != Integer.MAX_VALUE) {
                        int e3 = zzna.e();
                        if (e3 == 16) {
                            i3 = zzna.m();
                            obj2 = zzkr.c(zzkp, this.f25678a, i3);
                        } else if (e3 == 26) {
                            if (obj2 != null) {
                                zzkr.f(zzna, obj2, zzkp, i2);
                            } else {
                                zzjs = zzna.l();
                            }
                        } else if (!zzna.x()) {
                            break;
                        }
                    }
                    if (zzna.e() != 12) {
                        throw zzlk.b();
                    } else if (zzjs != null) {
                        if (obj2 != null) {
                            zzkr.e(zzjs, obj2, zzkp, i2);
                        } else {
                            zznx.f(o2, i3, zzjs);
                        }
                    }
                } else if ((e2 & 7) == 2) {
                    Object c2 = zzkr.c(zzkp, this.f25678a, e2 >>> 3);
                    if (c2 != null) {
                        zzkr.f(zzna, c2, zzkp, i2);
                    } else {
                        z2 = zznx.j(o2, zzna, 0);
                        continue;
                    }
                } else {
                    z2 = zzna.x();
                    continue;
                }
                z2 = true;
                continue;
            } catch (Throwable th) {
                zznx.n(obj, o2);
                throw th;
            }
        } while (z2);
        zznx.n(obj, o2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.google.android.gms.internal.measurement.zzlc$zzf} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(java.lang.Object r10, byte[] r11, int r12, int r13, com.google.android.gms.internal.measurement.zzjn r14) {
        /*
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.measurement.zzlc r0 = (com.google.android.gms.internal.measurement.zzlc) r0
            com.google.android.gms.internal.measurement.zznw r1 = r0.zzb
            com.google.android.gms.internal.measurement.zznw r2 = com.google.android.gms.internal.measurement.zznw.k()
            if (r1 != r2) goto L_0x0011
            com.google.android.gms.internal.measurement.zznw r1 = com.google.android.gms.internal.measurement.zznw.l()
            r0.zzb = r1
        L_0x0011:
            com.google.android.gms.internal.measurement.zzlc$zzd r10 = (com.google.android.gms.internal.measurement.zzlc.zzd) r10
            r10.J()
            r10 = 0
            r0 = r10
        L_0x0018:
            if (r12 >= r13) goto L_0x00a4
            int r4 = com.google.android.gms.internal.measurement.zzjo.s(r11, r12, r14)
            int r2 = r14.f25557a
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L_0x0051
            r12 = r2 & 7
            if (r12 != r3) goto L_0x004c
            com.google.android.gms.internal.measurement.zzkr r12 = r9.f25681d
            com.google.android.gms.internal.measurement.zzkp r0 = r14.f25560d
            com.google.android.gms.internal.measurement.zzml r3 = r9.f25678a
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.c(r0, r3, r5)
            r0 = r12
            com.google.android.gms.internal.measurement.zzlc$zzf r0 = (com.google.android.gms.internal.measurement.zzlc.zzf) r0
            if (r0 != 0) goto L_0x0043
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.gms.internal.measurement.zzjo.d(r2, r3, r4, r5, r6, r7)
            goto L_0x0018
        L_0x0043:
            com.google.android.gms.internal.measurement.zzmz.a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L_0x004c:
            int r12 = com.google.android.gms.internal.measurement.zzjo.b(r2, r11, r4, r13, r14)
            goto L_0x0018
        L_0x0051:
            r12 = 0
            r2 = r10
        L_0x0053:
            if (r4 >= r13) goto L_0x0099
            int r4 = com.google.android.gms.internal.measurement.zzjo.s(r11, r4, r14)
            int r5 = r14.f25557a
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L_0x007b
            r8 = 3
            if (r6 == r8) goto L_0x0065
            goto L_0x0090
        L_0x0065:
            if (r0 != 0) goto L_0x0072
            if (r7 != r3) goto L_0x0090
            int r4 = com.google.android.gms.internal.measurement.zzjo.l(r11, r4, r14)
            java.lang.Object r2 = r14.f25559c
            com.google.android.gms.internal.measurement.zzjs r2 = (com.google.android.gms.internal.measurement.zzjs) r2
            goto L_0x0053
        L_0x0072:
            com.google.android.gms.internal.measurement.zzmz.a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L_0x007b:
            if (r7 != 0) goto L_0x0090
            int r4 = com.google.android.gms.internal.measurement.zzjo.s(r11, r4, r14)
            int r12 = r14.f25557a
            com.google.android.gms.internal.measurement.zzkr r0 = r9.f25681d
            com.google.android.gms.internal.measurement.zzkp r5 = r14.f25560d
            com.google.android.gms.internal.measurement.zzml r6 = r9.f25678a
            java.lang.Object r0 = r0.c(r5, r6, r12)
            com.google.android.gms.internal.measurement.zzlc$zzf r0 = (com.google.android.gms.internal.measurement.zzlc.zzf) r0
            goto L_0x0053
        L_0x0090:
            r6 = 12
            if (r5 == r6) goto L_0x0099
            int r4 = com.google.android.gms.internal.measurement.zzjo.b(r5, r11, r4, r13, r14)
            goto L_0x0053
        L_0x0099:
            if (r2 == 0) goto L_0x00a1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.e(r12, r2)
        L_0x00a1:
            r12 = r4
            goto L_0x0018
        L_0x00a4:
            if (r12 != r13) goto L_0x00a7
            return
        L_0x00a7:
            com.google.android.gms.internal.measurement.zzlk r10 = com.google.android.gms.internal.measurement.zzlk.g()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzmr.h(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.zzjn):void");
    }

    public final void i(Object obj, zzos zzos) {
        Iterator p2 = this.f25681d.b(obj).p();
        while (p2.hasNext()) {
            Map.Entry entry = (Map.Entry) p2.next();
            zzkx zzkx = (zzkx) entry.getKey();
            if (zzkx.c() != zzop.MESSAGE || zzkx.g() || zzkx.e()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (entry instanceof zzlo) {
                zzos.l(zzkx.a(), ((zzlo) entry).a().c());
            } else {
                zzos.l(zzkx.a(), entry.getValue());
            }
        }
        zznx zznx = this.f25679b;
        zznx.h(zznx.q(obj), zzos);
    }

    public final boolean j(Object obj, Object obj2) {
        if (!this.f25679b.q(obj).equals(this.f25679b.q(obj2))) {
            return false;
        }
        if (this.f25680c) {
            return this.f25681d.b(obj).equals(this.f25681d.b(obj2));
        }
        return true;
    }
}
