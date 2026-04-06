package com.google.android.gms.internal.measurement;

import java.util.List;

final class zzkk implements zzna {

    /* renamed from: a  reason: collision with root package name */
    public final zzkg f25586a;

    /* renamed from: b  reason: collision with root package name */
    public int f25587b;

    /* renamed from: c  reason: collision with root package name */
    public int f25588c;

    /* renamed from: d  reason: collision with root package name */
    public int f25589d = 0;

    public zzkk(zzkg zzkg) {
        zzkg zzkg2 = (zzkg) zzle.f(zzkg, "input");
        this.f25586a = zzkg2;
        zzkg2.f25584c = this;
    }

    public static zzkk Q(zzkg zzkg) {
        zzkk zzkk = zzkg.f25584c;
        return zzkk != null ? zzkk : new zzkk(zzkg);
    }

    public static void X(int i2) {
        if ((i2 & 3) != 0) {
            throw zzlk.g();
        }
    }

    public static void Z(int i2) {
        if ((i2 & 7) != 0) {
            throw zzlk.g();
        }
    }

    public final void A(List list) {
        int p2;
        int p3;
        if (list instanceof zzlf) {
            zzlf zzlf = (zzlf) list;
            int i2 = this.f25587b & 7;
            if (i2 == 2) {
                int q2 = this.f25586a.q();
                X(q2);
                int g2 = this.f25586a.g() + q2;
                do {
                    zzlf.i(this.f25586a.n());
                } while (this.f25586a.g() < g2);
            } else if (i2 == 5) {
                do {
                    zzlf.i(this.f25586a.n());
                    if (!this.f25586a.A()) {
                        p3 = this.f25586a.p();
                    } else {
                        return;
                    }
                } while (p3 == this.f25587b);
                this.f25589d = p3;
            } else {
                throw zzlk.a();
            }
        } else {
            int i3 = this.f25587b & 7;
            if (i3 == 2) {
                int q3 = this.f25586a.q();
                X(q3);
                int g3 = this.f25586a.g() + q3;
                do {
                    list.add(Integer.valueOf(this.f25586a.n()));
                } while (this.f25586a.g() < g3);
            } else if (i3 == 5) {
                do {
                    list.add(Integer.valueOf(this.f25586a.n()));
                    if (!this.f25586a.A()) {
                        p2 = this.f25586a.p();
                    } else {
                        return;
                    }
                } while (p2 == this.f25587b);
                this.f25589d = p2;
            } else {
                throw zzlk.a();
            }
        }
    }

    public final void B(List list) {
        int p2;
        int p3;
        if (list instanceof zzjq) {
            zzjq zzjq = (zzjq) list;
            int i2 = this.f25587b & 7;
            if (i2 == 0) {
                do {
                    zzjq.g(this.f25586a.B());
                    if (!this.f25586a.A()) {
                        p3 = this.f25586a.p();
                    } else {
                        return;
                    }
                } while (p3 == this.f25587b);
                this.f25589d = p3;
            } else if (i2 == 2) {
                int g2 = this.f25586a.g() + this.f25586a.q();
                do {
                    zzjq.g(this.f25586a.B());
                } while (this.f25586a.g() < g2);
                T(g2);
            } else {
                throw zzlk.a();
            }
        } else {
            int i3 = this.f25587b & 7;
            if (i3 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f25586a.B()));
                    if (!this.f25586a.A()) {
                        p2 = this.f25586a.p();
                    } else {
                        return;
                    }
                } while (p2 == this.f25587b);
                this.f25589d = p2;
            } else if (i3 == 2) {
                int g3 = this.f25586a.g() + this.f25586a.q();
                do {
                    list.add(Boolean.valueOf(this.f25586a.B()));
                } while (this.f25586a.g() < g3);
                T(g3);
            } else {
                throw zzlk.a();
            }
        }
    }

    public final void C(Object obj, zznd zznd, zzkp zzkp) {
        W(2);
        a0(obj, zznd, zzkp);
    }

    public final void D(List list) {
        int p2;
        int p3;
        if (list instanceof zzlw) {
            zzlw zzlw = (zzlw) list;
            int i2 = this.f25587b & 7;
            if (i2 == 0) {
                do {
                    zzlw.g(this.f25586a.s());
                    if (!this.f25586a.A()) {
                        p3 = this.f25586a.p();
                    } else {
                        return;
                    }
                } while (p3 == this.f25587b);
                this.f25589d = p3;
            } else if (i2 == 2) {
                int g2 = this.f25586a.g() + this.f25586a.q();
                do {
                    zzlw.g(this.f25586a.s());
                } while (this.f25586a.g() < g2);
                T(g2);
            } else {
                throw zzlk.a();
            }
        } else {
            int i3 = this.f25587b & 7;
            if (i3 == 0) {
                do {
                    list.add(Long.valueOf(this.f25586a.s()));
                    if (!this.f25586a.A()) {
                        p2 = this.f25586a.p();
                    } else {
                        return;
                    }
                } while (p2 == this.f25587b);
                this.f25589d = p2;
            } else if (i3 == 2) {
                int g3 = this.f25586a.g() + this.f25586a.q();
                do {
                    list.add(Long.valueOf(this.f25586a.s()));
                } while (this.f25586a.g() < g3);
                T(g3);
            } else {
                throw zzlk.a();
            }
        }
    }

    public final void E(List list) {
        int p2;
        int p3;
        if (list instanceof zzlw) {
            zzlw zzlw = (zzlw) list;
            int i2 = this.f25587b & 7;
            if (i2 == 0) {
                do {
                    zzlw.g(this.f25586a.w());
                    if (!this.f25586a.A()) {
                        p3 = this.f25586a.p();
                    } else {
                        return;
                    }
                } while (p3 == this.f25587b);
                this.f25589d = p3;
            } else if (i2 == 2) {
                int g2 = this.f25586a.g() + this.f25586a.q();
                do {
                    zzlw.g(this.f25586a.w());
                } while (this.f25586a.g() < g2);
                T(g2);
            } else {
                throw zzlk.a();
            }
        } else {
            int i3 = this.f25587b & 7;
            if (i3 == 0) {
                do {
                    list.add(Long.valueOf(this.f25586a.w()));
                    if (!this.f25586a.A()) {
                        p2 = this.f25586a.p();
                    } else {
                        return;
                    }
                } while (p2 == this.f25587b);
                this.f25589d = p2;
            } else if (i3 == 2) {
                int g3 = this.f25586a.g() + this.f25586a.q();
                do {
                    list.add(Long.valueOf(this.f25586a.w()));
                } while (this.f25586a.g() < g3);
                T(g3);
            } else {
                throw zzlk.a();
            }
        }
    }

    public final void F(List list) {
        int p2;
        int p3;
        if (list instanceof zzlf) {
            zzlf zzlf = (zzlf) list;
            int i2 = this.f25587b & 7;
            if (i2 == 0) {
                do {
                    zzlf.i(this.f25586a.o());
                    if (!this.f25586a.A()) {
                        p3 = this.f25586a.p();
                    } else {
                        return;
                    }
                } while (p3 == this.f25587b);
                this.f25589d = p3;
            } else if (i2 == 2) {
                int g2 = this.f25586a.g() + this.f25586a.q();
                do {
                    zzlf.i(this.f25586a.o());
                } while (this.f25586a.g() < g2);
                T(g2);
            } else {
                throw zzlk.a();
            }
        } else {
            int i3 = this.f25587b & 7;
            if (i3 == 0) {
                do {
                    list.add(Integer.valueOf(this.f25586a.o()));
                    if (!this.f25586a.A()) {
                        p2 = this.f25586a.p();
                    } else {
                        return;
                    }
                } while (p2 == this.f25587b);
                this.f25589d = p2;
            } else if (i3 == 2) {
                int g3 = this.f25586a.g() + this.f25586a.q();
                do {
                    list.add(Integer.valueOf(this.f25586a.o()));
                } while (this.f25586a.g() < g3);
                T(g3);
            } else {
                throw zzlk.a();
            }
        }
    }

    public final void G(List list) {
        int p2;
        int p3;
        if (list instanceof zzkn) {
            zzkn zzkn = (zzkn) list;
            int i2 = this.f25587b & 7;
            if (i2 == 1) {
                do {
                    zzkn.g(this.f25586a.a());
                    if (!this.f25586a.A()) {
                        p3 = this.f25586a.p();
                    } else {
                        return;
                    }
                } while (p3 == this.f25587b);
                this.f25589d = p3;
            } else if (i2 == 2) {
                int q2 = this.f25586a.q();
                Z(q2);
                int g2 = this.f25586a.g() + q2;
                do {
                    zzkn.g(this.f25586a.a());
                } while (this.f25586a.g() < g2);
            } else {
                throw zzlk.a();
            }
        } else {
            int i3 = this.f25587b & 7;
            if (i3 == 1) {
                do {
                    list.add(Double.valueOf(this.f25586a.a()));
                    if (!this.f25586a.A()) {
                        p2 = this.f25586a.p();
                    } else {
                        return;
                    }
                } while (p2 == this.f25587b);
                this.f25589d = p2;
            } else if (i3 == 2) {
                int q3 = this.f25586a.q();
                Z(q3);
                int g3 = this.f25586a.g() + q3;
                do {
                    list.add(Double.valueOf(this.f25586a.a()));
                } while (this.f25586a.g() < g3);
            } else {
                throw zzlk.a();
            }
        }
    }

    public final void H(List list, zznd zznd, zzkp zzkp) {
        int p2;
        int i2 = this.f25587b;
        if ((i2 & 7) == 3) {
            do {
                list.add(R(zznd, zzkp));
                if (!this.f25586a.A() && this.f25589d == 0) {
                    p2 = this.f25586a.p();
                } else {
                    return;
                }
            } while (p2 == i2);
            this.f25589d = p2;
            return;
        }
        throw zzlk.a();
    }

    public final void I(List list, zznd zznd, zzkp zzkp) {
        int p2;
        int i2 = this.f25587b;
        if ((i2 & 7) == 2) {
            do {
                list.add(V(zznd, zzkp));
                if (!this.f25586a.A() && this.f25589d == 0) {
                    p2 = this.f25586a.p();
                } else {
                    return;
                }
            } while (p2 == i2);
            this.f25589d = p2;
            return;
        }
        throw zzlk.a();
    }

    public final void J(List list) {
        int p2;
        int p3;
        if (list instanceof zzlw) {
            zzlw zzlw = (zzlw) list;
            int i2 = this.f25587b & 7;
            if (i2 == 1) {
                do {
                    zzlw.g(this.f25586a.u());
                    if (!this.f25586a.A()) {
                        p3 = this.f25586a.p();
                    } else {
                        return;
                    }
                } while (p3 == this.f25587b);
                this.f25589d = p3;
            } else if (i2 == 2) {
                int q2 = this.f25586a.q();
                Z(q2);
                int g2 = this.f25586a.g() + q2;
                do {
                    zzlw.g(this.f25586a.u());
                } while (this.f25586a.g() < g2);
            } else {
                throw zzlk.a();
            }
        } else {
            int i3 = this.f25587b & 7;
            if (i3 == 1) {
                do {
                    list.add(Long.valueOf(this.f25586a.u()));
                    if (!this.f25586a.A()) {
                        p2 = this.f25586a.p();
                    } else {
                        return;
                    }
                } while (p2 == this.f25587b);
                this.f25589d = p2;
            } else if (i3 == 2) {
                int q3 = this.f25586a.q();
                Z(q3);
                int g3 = this.f25586a.g() + q3;
                do {
                    list.add(Long.valueOf(this.f25586a.u()));
                } while (this.f25586a.g() < g3);
            } else {
                throw zzlk.a();
            }
        }
    }

    public final void K(List list) {
        int p2;
        if ((this.f25587b & 7) == 2) {
            do {
                list.add(l());
                if (!this.f25586a.A()) {
                    p2 = this.f25586a.p();
                } else {
                    return;
                }
            } while (p2 == this.f25587b);
            this.f25589d = p2;
            return;
        }
        throw zzlk.a();
    }

    public final void L(List list) {
        U(list, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
        if (x() != false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005c, code lost:
        throw new com.google.android.gms.internal.measurement.zzlk(r6);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0050 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void M(java.util.Map r8, com.google.android.gms.internal.measurement.zzmc r9, com.google.android.gms.internal.measurement.zzkp r10) {
        /*
            r7 = this;
            r0 = 2
            r7.W(r0)
            com.google.android.gms.internal.measurement.zzkg r1 = r7.f25586a
            int r1 = r1.q()
            com.google.android.gms.internal.measurement.zzkg r2 = r7.f25586a
            int r1 = r2.b(r1)
            java.lang.Object r2 = r9.f25652b
            java.lang.Object r3 = r9.f25654d
        L_0x0014:
            int r4 = r7.c()     // Catch:{ all -> 0x0039 }
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x005d
            com.google.android.gms.internal.measurement.zzkg r5 = r7.f25586a     // Catch:{ all -> 0x0039 }
            boolean r5 = r5.A()     // Catch:{ all -> 0x0039 }
            if (r5 != 0) goto L_0x005d
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L_0x0048
            if (r4 == r0) goto L_0x003b
            boolean r4 = r7.x()     // Catch:{ zzln -> 0x0050 }
            if (r4 == 0) goto L_0x0033
            goto L_0x0014
        L_0x0033:
            com.google.android.gms.internal.measurement.zzlk r4 = new com.google.android.gms.internal.measurement.zzlk     // Catch:{ zzln -> 0x0050 }
            r4.<init>(r6)     // Catch:{ zzln -> 0x0050 }
            throw r4     // Catch:{ zzln -> 0x0050 }
        L_0x0039:
            r8 = move-exception
            goto L_0x0066
        L_0x003b:
            com.google.android.gms.internal.measurement.zzof r4 = r9.f25653c     // Catch:{ zzln -> 0x0050 }
            java.lang.Object r5 = r9.f25654d     // Catch:{ zzln -> 0x0050 }
            java.lang.Class r5 = r5.getClass()     // Catch:{ zzln -> 0x0050 }
            java.lang.Object r3 = r7.S(r4, r5, r10)     // Catch:{ zzln -> 0x0050 }
            goto L_0x0014
        L_0x0048:
            com.google.android.gms.internal.measurement.zzof r4 = r9.f25651a     // Catch:{ zzln -> 0x0050 }
            r5 = 0
            java.lang.Object r2 = r7.S(r4, r5, r5)     // Catch:{ zzln -> 0x0050 }
            goto L_0x0014
        L_0x0050:
            boolean r4 = r7.x()     // Catch:{ all -> 0x0039 }
            if (r4 == 0) goto L_0x0057
            goto L_0x0014
        L_0x0057:
            com.google.android.gms.internal.measurement.zzlk r8 = new com.google.android.gms.internal.measurement.zzlk     // Catch:{ all -> 0x0039 }
            r8.<init>(r6)     // Catch:{ all -> 0x0039 }
            throw r8     // Catch:{ all -> 0x0039 }
        L_0x005d:
            r8.put(r2, r3)     // Catch:{ all -> 0x0039 }
            com.google.android.gms.internal.measurement.zzkg r8 = r7.f25586a
            r8.h(r1)
            return
        L_0x0066:
            com.google.android.gms.internal.measurement.zzkg r9 = r7.f25586a
            r9.h(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzkk.M(java.util.Map, com.google.android.gms.internal.measurement.zzmc, com.google.android.gms.internal.measurement.zzkp):void");
    }

    public final void N(List list) {
        int p2;
        int p3;
        if (list instanceof zzlf) {
            zzlf zzlf = (zzlf) list;
            int i2 = this.f25587b & 7;
            if (i2 == 2) {
                int q2 = this.f25586a.q();
                X(q2);
                int g2 = this.f25586a.g() + q2;
                do {
                    zzlf.i(this.f25586a.k());
                } while (this.f25586a.g() < g2);
            } else if (i2 == 5) {
                do {
                    zzlf.i(this.f25586a.k());
                    if (!this.f25586a.A()) {
                        p3 = this.f25586a.p();
                    } else {
                        return;
                    }
                } while (p3 == this.f25587b);
                this.f25589d = p3;
            } else {
                throw zzlk.a();
            }
        } else {
            int i3 = this.f25587b & 7;
            if (i3 == 2) {
                int q3 = this.f25586a.q();
                X(q3);
                int g3 = this.f25586a.g() + q3;
                do {
                    list.add(Integer.valueOf(this.f25586a.k()));
                } while (this.f25586a.g() < g3);
            } else if (i3 == 5) {
                do {
                    list.add(Integer.valueOf(this.f25586a.k()));
                    if (!this.f25586a.A()) {
                        p2 = this.f25586a.p();
                    } else {
                        return;
                    }
                } while (p2 == this.f25587b);
                this.f25589d = p2;
            } else {
                throw zzlk.a();
            }
        }
    }

    public final void O(List list) {
        int p2;
        int p3;
        if (list instanceof zzlw) {
            zzlw zzlw = (zzlw) list;
            int i2 = this.f25587b & 7;
            if (i2 == 0) {
                do {
                    zzlw.g(this.f25586a.v());
                    if (!this.f25586a.A()) {
                        p3 = this.f25586a.p();
                    } else {
                        return;
                    }
                } while (p3 == this.f25587b);
                this.f25589d = p3;
            } else if (i2 == 2) {
                int g2 = this.f25586a.g() + this.f25586a.q();
                do {
                    zzlw.g(this.f25586a.v());
                } while (this.f25586a.g() < g2);
                T(g2);
            } else {
                throw zzlk.a();
            }
        } else {
            int i3 = this.f25587b & 7;
            if (i3 == 0) {
                do {
                    list.add(Long.valueOf(this.f25586a.v()));
                    if (!this.f25586a.A()) {
                        p2 = this.f25586a.p();
                    } else {
                        return;
                    }
                } while (p2 == this.f25587b);
                this.f25589d = p2;
            } else if (i3 == 2) {
                int g3 = this.f25586a.g() + this.f25586a.q();
                do {
                    list.add(Long.valueOf(this.f25586a.v()));
                } while (this.f25586a.g() < g3);
                T(g3);
            } else {
                throw zzlk.a();
            }
        }
    }

    public final void P(List list) {
        int p2;
        int p3;
        if (list instanceof zzlf) {
            zzlf zzlf = (zzlf) list;
            int i2 = this.f25587b & 7;
            if (i2 == 0) {
                do {
                    zzlf.i(this.f25586a.i());
                    if (!this.f25586a.A()) {
                        p3 = this.f25586a.p();
                    } else {
                        return;
                    }
                } while (p3 == this.f25587b);
                this.f25589d = p3;
            } else if (i2 == 2) {
                int g2 = this.f25586a.g() + this.f25586a.q();
                do {
                    zzlf.i(this.f25586a.i());
                } while (this.f25586a.g() < g2);
                T(g2);
            } else {
                throw zzlk.a();
            }
        } else {
            int i3 = this.f25587b & 7;
            if (i3 == 0) {
                do {
                    list.add(Integer.valueOf(this.f25586a.i()));
                    if (!this.f25586a.A()) {
                        p2 = this.f25586a.p();
                    } else {
                        return;
                    }
                } while (p2 == this.f25587b);
                this.f25589d = p2;
            } else if (i3 == 2) {
                int g3 = this.f25586a.g() + this.f25586a.q();
                do {
                    list.add(Integer.valueOf(this.f25586a.i()));
                } while (this.f25586a.g() < g3);
                T(g3);
            } else {
                throw zzlk.a();
            }
        }
    }

    public final Object R(zznd zznd, zzkp zzkp) {
        Object a2 = zznd.a();
        Y(a2, zznd, zzkp);
        zznd.d(a2);
        return a2;
    }

    public final Object S(zzof zzof, Class cls, zzkp zzkp) {
        switch (zzkj.f25585a[zzof.ordinal()]) {
            case 1:
                return Boolean.valueOf(v());
            case 2:
                return l();
            case 3:
                return Double.valueOf(a());
            case 4:
                return Integer.valueOf(g());
            case 5:
                return Integer.valueOf(h());
            case 6:
                return Long.valueOf(j());
            case 7:
                return Float.valueOf(b());
            case 8:
                return Integer.valueOf(k());
            case 9:
                return Long.valueOf(f());
            case 10:
                W(2);
                return V(zzmz.a().b(cls), zzkp);
            case 11:
                return Integer.valueOf(i());
            case 12:
                return Long.valueOf(r());
            case 13:
                return Integer.valueOf(d());
            case 14:
                return Long.valueOf(p());
            case 15:
                return o();
            case 16:
                return Integer.valueOf(m());
            case 17:
                return Long.valueOf(q());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    public final void T(int i2) {
        if (this.f25586a.g() != i2) {
            throw zzlk.i();
        }
    }

    public final void U(List list, boolean z2) {
        int p2;
        int p3;
        if ((this.f25587b & 7) != 2) {
            throw zzlk.a();
        } else if (!(list instanceof zzls) || z2) {
            do {
                list.add(z2 ? o() : n());
                if (!this.f25586a.A()) {
                    p2 = this.f25586a.p();
                } else {
                    return;
                }
            } while (p2 == this.f25587b);
            this.f25589d = p2;
        } else {
            zzls zzls = (zzls) list;
            do {
                zzls.J0(l());
                if (!this.f25586a.A()) {
                    p3 = this.f25586a.p();
                } else {
                    return;
                }
            } while (p3 == this.f25587b);
            this.f25589d = p3;
        }
    }

    public final Object V(zznd zznd, zzkp zzkp) {
        Object a2 = zznd.a();
        a0(a2, zznd, zzkp);
        zznd.d(a2);
        return a2;
    }

    public final void W(int i2) {
        if ((this.f25587b & 7) != i2) {
            throw zzlk.a();
        }
    }

    public final void Y(Object obj, zznd zznd, zzkp zzkp) {
        int i2 = this.f25588c;
        this.f25588c = ((this.f25587b >>> 3) << 3) | 4;
        try {
            zznd.g(obj, this, zzkp);
            if (this.f25587b != this.f25588c) {
                throw zzlk.g();
            }
        } finally {
            this.f25588c = i2;
        }
    }

    public final double a() {
        W(1);
        return this.f25586a.a();
    }

    public final void a0(Object obj, zznd zznd, zzkp zzkp) {
        int q2 = this.f25586a.q();
        zzkg zzkg = this.f25586a;
        if (zzkg.f25582a < zzkg.f25583b) {
            int b2 = zzkg.b(q2);
            this.f25586a.f25582a++;
            zznd.g(obj, this, zzkp);
            this.f25586a.f(0);
            zzkg zzkg2 = this.f25586a;
            zzkg2.f25582a--;
            zzkg2.h(b2);
            return;
        }
        throw zzlk.h();
    }

    public final float b() {
        W(5);
        return this.f25586a.e();
    }

    public final int c() {
        int i2 = this.f25589d;
        if (i2 != 0) {
            this.f25587b = i2;
            this.f25589d = 0;
        } else {
            this.f25587b = this.f25586a.p();
        }
        int i3 = this.f25587b;
        if (i3 == 0 || i3 == this.f25588c) {
            return Integer.MAX_VALUE;
        }
        return i3 >>> 3;
    }

    public final int d() {
        W(0);
        return this.f25586a.o();
    }

    public final int e() {
        return this.f25587b;
    }

    public final long f() {
        W(0);
        return this.f25586a.s();
    }

    public final int g() {
        W(0);
        return this.f25586a.i();
    }

    public final int h() {
        W(5);
        return this.f25586a.k();
    }

    public final int i() {
        W(5);
        return this.f25586a.n();
    }

    public final long j() {
        W(1);
        return this.f25586a.r();
    }

    public final int k() {
        W(0);
        return this.f25586a.m();
    }

    public final zzjs l() {
        W(2);
        return this.f25586a.x();
    }

    public final int m() {
        W(0);
        return this.f25586a.q();
    }

    public final String n() {
        W(2);
        return this.f25586a.y();
    }

    public final String o() {
        W(2);
        return this.f25586a.z();
    }

    public final long p() {
        W(0);
        return this.f25586a.v();
    }

    public final long q() {
        W(0);
        return this.f25586a.w();
    }

    public final long r() {
        W(1);
        return this.f25586a.u();
    }

    public final void s(Object obj, zznd zznd, zzkp zzkp) {
        W(3);
        Y(obj, zznd, zzkp);
    }

    public final void t(List list) {
        int p2;
        int p3;
        if (list instanceof zzlf) {
            zzlf zzlf = (zzlf) list;
            int i2 = this.f25587b & 7;
            if (i2 == 0) {
                do {
                    zzlf.i(this.f25586a.m());
                    if (!this.f25586a.A()) {
                        p3 = this.f25586a.p();
                    } else {
                        return;
                    }
                } while (p3 == this.f25587b);
                this.f25589d = p3;
            } else if (i2 == 2) {
                int g2 = this.f25586a.g() + this.f25586a.q();
                do {
                    zzlf.i(this.f25586a.m());
                } while (this.f25586a.g() < g2);
                T(g2);
            } else {
                throw zzlk.a();
            }
        } else {
            int i3 = this.f25587b & 7;
            if (i3 == 0) {
                do {
                    list.add(Integer.valueOf(this.f25586a.m()));
                    if (!this.f25586a.A()) {
                        p2 = this.f25586a.p();
                    } else {
                        return;
                    }
                } while (p2 == this.f25587b);
                this.f25589d = p2;
            } else if (i3 == 2) {
                int g3 = this.f25586a.g() + this.f25586a.q();
                do {
                    list.add(Integer.valueOf(this.f25586a.m()));
                } while (this.f25586a.g() < g3);
                T(g3);
            } else {
                throw zzlk.a();
            }
        }
    }

    public final void u(List list) {
        int p2;
        int p3;
        if (list instanceof zzlb) {
            zzlb zzlb = (zzlb) list;
            int i2 = this.f25587b & 7;
            if (i2 == 2) {
                int q2 = this.f25586a.q();
                X(q2);
                int g2 = this.f25586a.g() + q2;
                do {
                    zzlb.g(this.f25586a.e());
                } while (this.f25586a.g() < g2);
            } else if (i2 == 5) {
                do {
                    zzlb.g(this.f25586a.e());
                    if (!this.f25586a.A()) {
                        p3 = this.f25586a.p();
                    } else {
                        return;
                    }
                } while (p3 == this.f25587b);
                this.f25589d = p3;
            } else {
                throw zzlk.a();
            }
        } else {
            int i3 = this.f25587b & 7;
            if (i3 == 2) {
                int q3 = this.f25586a.q();
                X(q3);
                int g3 = this.f25586a.g() + q3;
                do {
                    list.add(Float.valueOf(this.f25586a.e()));
                } while (this.f25586a.g() < g3);
            } else if (i3 == 5) {
                do {
                    list.add(Float.valueOf(this.f25586a.e()));
                    if (!this.f25586a.A()) {
                        p2 = this.f25586a.p();
                    } else {
                        return;
                    }
                } while (p2 == this.f25587b);
                this.f25589d = p2;
            } else {
                throw zzlk.a();
            }
        }
    }

    public final boolean v() {
        W(0);
        return this.f25586a.B();
    }

    public final void w(List list) {
        int p2;
        int p3;
        if (list instanceof zzlf) {
            zzlf zzlf = (zzlf) list;
            int i2 = this.f25587b & 7;
            if (i2 == 0) {
                do {
                    zzlf.i(this.f25586a.q());
                    if (!this.f25586a.A()) {
                        p3 = this.f25586a.p();
                    } else {
                        return;
                    }
                } while (p3 == this.f25587b);
                this.f25589d = p3;
            } else if (i2 == 2) {
                int g2 = this.f25586a.g() + this.f25586a.q();
                do {
                    zzlf.i(this.f25586a.q());
                } while (this.f25586a.g() < g2);
                T(g2);
            } else {
                throw zzlk.a();
            }
        } else {
            int i3 = this.f25587b & 7;
            if (i3 == 0) {
                do {
                    list.add(Integer.valueOf(this.f25586a.q()));
                    if (!this.f25586a.A()) {
                        p2 = this.f25586a.p();
                    } else {
                        return;
                    }
                } while (p2 == this.f25587b);
                this.f25589d = p2;
            } else if (i3 == 2) {
                int g3 = this.f25586a.g() + this.f25586a.q();
                do {
                    list.add(Integer.valueOf(this.f25586a.q()));
                } while (this.f25586a.g() < g3);
                T(g3);
            } else {
                throw zzlk.a();
            }
        }
    }

    public final boolean x() {
        int i2;
        if (this.f25586a.A() || (i2 = this.f25587b) == this.f25588c) {
            return false;
        }
        return this.f25586a.j(i2);
    }

    public final void y(List list) {
        U(list, true);
    }

    public final void z(List list) {
        int p2;
        int p3;
        if (list instanceof zzlw) {
            zzlw zzlw = (zzlw) list;
            int i2 = this.f25587b & 7;
            if (i2 == 1) {
                do {
                    zzlw.g(this.f25586a.r());
                    if (!this.f25586a.A()) {
                        p3 = this.f25586a.p();
                    } else {
                        return;
                    }
                } while (p3 == this.f25587b);
                this.f25589d = p3;
            } else if (i2 == 2) {
                int q2 = this.f25586a.q();
                Z(q2);
                int g2 = this.f25586a.g() + q2;
                do {
                    zzlw.g(this.f25586a.r());
                } while (this.f25586a.g() < g2);
            } else {
                throw zzlk.a();
            }
        } else {
            int i3 = this.f25587b & 7;
            if (i3 == 1) {
                do {
                    list.add(Long.valueOf(this.f25586a.r()));
                    if (!this.f25586a.A()) {
                        p2 = this.f25586a.p();
                    } else {
                        return;
                    }
                } while (p2 == this.f25587b);
                this.f25589d = p2;
            } else if (i3 == 2) {
                int q3 = this.f25586a.q();
                Z(q3);
                int g3 = this.f25586a.g() + q3;
                do {
                    list.add(Long.valueOf(this.f25586a.r()));
                } while (this.f25586a.g() < g3);
            } else {
                throw zzlk.a();
            }
        }
    }
}
