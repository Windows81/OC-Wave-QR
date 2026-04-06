package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

final class zzko implements zzos {

    /* renamed from: a  reason: collision with root package name */
    public final zzkl f25598a;

    public zzko(zzkl zzkl) {
        zzkl zzkl2 = (zzkl) zzle.f(zzkl, "output");
        this.f25598a = zzkl2;
        zzkl2.f25592a = this;
    }

    public static zzko P(zzkl zzkl) {
        zzko zzko = zzkl.f25592a;
        return zzko != null ? zzko : new zzko(zzkl);
    }

    public final void A(int i2, float f2) {
        this.f25598a.N(i2, f2);
    }

    public final void B(int i2, List list, boolean z2) {
        int i3 = 0;
        if (list instanceof zzlw) {
            zzlw zzlw = (zzlw) list;
            if (z2) {
                this.f25598a.a0(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < zzlw.size(); i5++) {
                    i4 += zzkl.X(zzlw.t(i5));
                }
                this.f25598a.Z(i4);
                while (i3 < zzlw.size()) {
                    this.f25598a.u(zzlw.t(i3));
                    i3++;
                }
                return;
            }
            while (i3 < zzlw.size()) {
                this.f25598a.o(i2, zzlw.t(i3));
                i3++;
            }
        } else if (z2) {
            this.f25598a.a0(i2, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzkl.X(((Long) list.get(i7)).longValue());
            }
            this.f25598a.Z(i6);
            while (i3 < list.size()) {
                this.f25598a.u(((Long) list.get(i3)).longValue());
                i3++;
            }
        } else {
            while (i3 < list.size()) {
                this.f25598a.o(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
        }
    }

    public final void C(int i2, zzjs zzjs) {
        this.f25598a.p(i2, zzjs);
    }

    public final void D(int i2, int i3) {
        this.f25598a.g0(i2, i3);
    }

    public final void E(int i2, List list, boolean z2) {
        int i3 = 0;
        if (list instanceof zzlw) {
            zzlw zzlw = (zzlw) list;
            if (z2) {
                this.f25598a.a0(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < zzlw.size(); i5++) {
                    i4 += zzkl.s0(zzlw.t(i5));
                }
                this.f25598a.Z(i4);
                while (i3 < zzlw.size()) {
                    this.f25598a.R(zzlw.t(i3));
                    i3++;
                }
                return;
            }
            while (i3 < zzlw.size()) {
                this.f25598a.P(i2, zzlw.t(i3));
                i3++;
            }
        } else if (z2) {
            this.f25598a.a0(i2, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzkl.s0(((Long) list.get(i7)).longValue());
            }
            this.f25598a.Z(i6);
            while (i3 < list.size()) {
                this.f25598a.R(((Long) list.get(i3)).longValue());
                i3++;
            }
        } else {
            while (i3 < list.size()) {
                this.f25598a.P(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
        }
    }

    public final void F(int i2, List list, boolean z2) {
        int i3 = 0;
        if (list instanceof zzlf) {
            zzlf zzlf = (zzlf) list;
            if (z2) {
                this.f25598a.a0(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < zzlf.size(); i5++) {
                    i4 += zzkl.h0(zzlf.g(i5));
                }
                this.f25598a.Z(i4);
                while (i3 < zzlf.size()) {
                    this.f25598a.m(zzlf.g(i3));
                    i3++;
                }
                return;
            }
            while (i3 < zzlf.size()) {
                this.f25598a.n(i2, zzlf.g(i3));
                i3++;
            }
        } else if (z2) {
            this.f25598a.a0(i2, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzkl.h0(((Integer) list.get(i7)).intValue());
            }
            this.f25598a.Z(i6);
            while (i3 < list.size()) {
                this.f25598a.m(((Integer) list.get(i3)).intValue());
                i3++;
            }
        } else {
            while (i3 < list.size()) {
                this.f25598a.n(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
        }
    }

    public final void G(int i2, List list, boolean z2) {
        int i3 = 0;
        if (list instanceof zzlf) {
            zzlf zzlf = (zzlf) list;
            if (z2) {
                this.f25598a.a0(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < zzlf.size(); i5++) {
                    i4 += zzkl.A0(zzlf.g(i5));
                }
                this.f25598a.Z(i4);
                while (i3 < zzlf.size()) {
                    this.f25598a.Z(zzlf.g(i3));
                    i3++;
                }
                return;
            }
            while (i3 < zzlf.size()) {
                this.f25598a.g0(i2, zzlf.g(i3));
                i3++;
            }
        } else if (z2) {
            this.f25598a.a0(i2, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzkl.A0(((Integer) list.get(i7)).intValue());
            }
            this.f25598a.Z(i6);
            while (i3 < list.size()) {
                this.f25598a.Z(((Integer) list.get(i3)).intValue());
                i3++;
            }
        } else {
            while (i3 < list.size()) {
                this.f25598a.g0(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
        }
    }

    public final void H(int i2, List list, boolean z2) {
        int i3 = 0;
        if (list instanceof zzlf) {
            zzlf zzlf = (zzlf) list;
            if (z2) {
                this.f25598a.a0(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < zzlf.size(); i5++) {
                    i4 += zzkl.l0(zzlf.g(i5));
                }
                this.f25598a.Z(i4);
                while (i3 < zzlf.size()) {
                    this.f25598a.L(zzlf.g(i3));
                    i3++;
                }
                return;
            }
            while (i3 < zzlf.size()) {
                this.f25598a.O(i2, zzlf.g(i3));
                i3++;
            }
        } else if (z2) {
            this.f25598a.a0(i2, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzkl.l0(((Integer) list.get(i7)).intValue());
            }
            this.f25598a.Z(i6);
            while (i3 < list.size()) {
                this.f25598a.L(((Integer) list.get(i3)).intValue());
                i3++;
            }
        } else {
            while (i3 < list.size()) {
                this.f25598a.O(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
        }
    }

    public final void I(int i2, List list) {
        int i3 = 0;
        if (list instanceof zzls) {
            zzls zzls = (zzls) list;
            while (i3 < list.size()) {
                Object j2 = zzls.j(i3);
                if (j2 instanceof String) {
                    this.f25598a.s(i2, (String) j2);
                } else {
                    this.f25598a.p(i2, (zzjs) j2);
                }
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.f25598a.s(i2, (String) list.get(i3));
            i3++;
        }
    }

    public final void J(int i2, int i3) {
        this.f25598a.n(i2, i3);
    }

    public final void K(int i2, long j2) {
        this.f25598a.v0(i2, j2);
    }

    public final void L(int i2, List list, boolean z2) {
        int i3 = 0;
        if (list instanceof zzlb) {
            zzlb zzlb = (zzlb) list;
            if (z2) {
                this.f25598a.a0(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < zzlb.size(); i5++) {
                    i4 += zzkl.d(zzlb.h(i5));
                }
                this.f25598a.Z(i4);
                while (i3 < zzlb.size()) {
                    this.f25598a.K(zzlb.h(i3));
                    i3++;
                }
                return;
            }
            while (i3 < zzlb.size()) {
                this.f25598a.N(i2, zzlb.h(i3));
                i3++;
            }
        } else if (z2) {
            this.f25598a.a0(i2, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzkl.d(((Float) list.get(i7)).floatValue());
            }
            this.f25598a.Z(i6);
            while (i3 < list.size()) {
                this.f25598a.K(((Float) list.get(i3)).floatValue());
                i3++;
            }
        } else {
            while (i3 < list.size()) {
                this.f25598a.N(i2, ((Float) list.get(i3)).floatValue());
                i3++;
            }
        }
    }

    public final void M(int i2, int i3) {
        this.f25598a.D0(i2, i3);
    }

    public final void N(int i2, long j2) {
        this.f25598a.P(i2, j2);
    }

    public final void O(int i2, List list) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.f25598a.p(i2, (zzjs) list.get(i3));
        }
    }

    public final int a() {
        return 1;
    }

    public final void b(int i2, boolean z2) {
        this.f25598a.t(i2, z2);
    }

    public final void c(int i2, Object obj, zznd zznd) {
        this.f25598a.r(i2, (zzml) obj, zznd);
    }

    public final void d(int i2, List list, boolean z2) {
        int i3 = 0;
        if (list instanceof zzlf) {
            zzlf zzlf = (zzlf) list;
            if (z2) {
                this.f25598a.a0(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < zzlf.size(); i5++) {
                    i4 += zzkl.p0(zzlf.g(i5));
                }
                this.f25598a.Z(i4);
                while (i3 < zzlf.size()) {
                    this.f25598a.m(zzlf.g(i3));
                    i3++;
                }
                return;
            }
            while (i3 < zzlf.size()) {
                this.f25598a.n(i2, zzlf.g(i3));
                i3++;
            }
        } else if (z2) {
            this.f25598a.a0(i2, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzkl.p0(((Integer) list.get(i7)).intValue());
            }
            this.f25598a.Z(i6);
            while (i3 < list.size()) {
                this.f25598a.m(((Integer) list.get(i3)).intValue());
                i3++;
            }
        } else {
            while (i3 < list.size()) {
                this.f25598a.n(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
        }
    }

    public final void e(int i2, long j2) {
        this.f25598a.P(i2, j2);
    }

    public final void f(int i2, int i3) {
        this.f25598a.n(i2, i3);
    }

    public final void g(int i2, List list, boolean z2) {
        int i3 = 0;
        if (list instanceof zzjq) {
            zzjq zzjq = (zzjq) list;
            if (z2) {
                this.f25598a.a0(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < zzjq.size(); i5++) {
                    i4 += zzkl.j(zzjq.h(i5));
                }
                this.f25598a.Z(i4);
                while (i3 < zzjq.size()) {
                    this.f25598a.S(zzjq.h(i3));
                    i3++;
                }
                return;
            }
            while (i3 < zzjq.size()) {
                this.f25598a.t(i2, zzjq.h(i3));
                i3++;
            }
        } else if (z2) {
            this.f25598a.a0(i2, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzkl.j(((Boolean) list.get(i7)).booleanValue());
            }
            this.f25598a.Z(i6);
            while (i3 < list.size()) {
                this.f25598a.S(((Boolean) list.get(i3)).booleanValue());
                i3++;
            }
        } else {
            while (i3 < list.size()) {
                this.f25598a.t(i2, ((Boolean) list.get(i3)).booleanValue());
                i3++;
            }
        }
    }

    public final void h(int i2, List list, boolean z2) {
        int i3 = 0;
        if (list instanceof zzlw) {
            zzlw zzlw = (zzlw) list;
            if (z2) {
                this.f25598a.a0(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < zzlw.size(); i5++) {
                    i4 += zzkl.f0(zzlw.t(i5));
                }
                this.f25598a.Z(i4);
                while (i3 < zzlw.size()) {
                    this.f25598a.R(zzlw.t(i3));
                    i3++;
                }
                return;
            }
            while (i3 < zzlw.size()) {
                this.f25598a.P(i2, zzlw.t(i3));
                i3++;
            }
        } else if (z2) {
            this.f25598a.a0(i2, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzkl.f0(((Long) list.get(i7)).longValue());
            }
            this.f25598a.Z(i6);
            while (i3 < list.size()) {
                this.f25598a.R(((Long) list.get(i3)).longValue());
                i3++;
            }
        } else {
            while (i3 < list.size()) {
                this.f25598a.P(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
        }
    }

    public final void i(int i2, int i3) {
        this.f25598a.O(i2, i3);
    }

    public final void j(int i2) {
        this.f25598a.a0(i2, 4);
    }

    public final void k(int i2, long j2) {
        this.f25598a.o(i2, j2);
    }

    public final void l(int i2, Object obj) {
        if (obj instanceof zzjs) {
            this.f25598a.Q(i2, (zzjs) obj);
        } else {
            this.f25598a.q(i2, (zzml) obj);
        }
    }

    public final void m(int i2, List list, boolean z2) {
        int i3 = 0;
        if (list instanceof zzlf) {
            zzlf zzlf = (zzlf) list;
            if (z2) {
                this.f25598a.a0(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < zzlf.size(); i5++) {
                    i4 += zzkl.c0(zzlf.g(i5));
                }
                this.f25598a.Z(i4);
                while (i3 < zzlf.size()) {
                    this.f25598a.L(zzlf.g(i3));
                    i3++;
                }
                return;
            }
            while (i3 < zzlf.size()) {
                this.f25598a.O(i2, zzlf.g(i3));
                i3++;
            }
        } else if (z2) {
            this.f25598a.a0(i2, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzkl.c0(((Integer) list.get(i7)).intValue());
            }
            this.f25598a.Z(i6);
            while (i3 < list.size()) {
                this.f25598a.L(((Integer) list.get(i3)).intValue());
                i3++;
            }
        } else {
            while (i3 < list.size()) {
                this.f25598a.O(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
        }
    }

    public final void n(int i2, List list, boolean z2) {
        int i3 = 0;
        if (list instanceof zzlw) {
            zzlw zzlw = (zzlw) list;
            if (z2) {
                this.f25598a.a0(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < zzlw.size(); i5++) {
                    i4 += zzkl.o0(zzlw.t(i5));
                }
                this.f25598a.Z(i4);
                while (i3 < zzlw.size()) {
                    this.f25598a.w0(zzlw.t(i3));
                    i3++;
                }
                return;
            }
            while (i3 < zzlw.size()) {
                this.f25598a.v0(i2, zzlw.t(i3));
                i3++;
            }
        } else if (z2) {
            this.f25598a.a0(i2, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzkl.o0(((Long) list.get(i7)).longValue());
            }
            this.f25598a.Z(i6);
            while (i3 < list.size()) {
                this.f25598a.w0(((Long) list.get(i3)).longValue());
                i3++;
            }
        } else {
            while (i3 < list.size()) {
                this.f25598a.v0(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
        }
    }

    public final void o(int i2, List list, zznd zznd) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            c(i2, list.get(i3), zznd);
        }
    }

    public final void p(int i2, List list, boolean z2) {
        int i3 = 0;
        if (list instanceof zzkn) {
            zzkn zzkn = (zzkn) list;
            if (z2) {
                this.f25598a.a0(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < zzkn.size(); i5++) {
                    i4 += zzkl.c(zzkn.h(i5));
                }
                this.f25598a.Z(i4);
                while (i3 < zzkn.size()) {
                    this.f25598a.J(zzkn.h(i3));
                    i3++;
                }
                return;
            }
            while (i3 < zzkn.size()) {
                this.f25598a.M(i2, zzkn.h(i3));
                i3++;
            }
        } else if (z2) {
            this.f25598a.a0(i2, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzkl.c(((Double) list.get(i7)).doubleValue());
            }
            this.f25598a.Z(i6);
            while (i3 < list.size()) {
                this.f25598a.J(((Double) list.get(i3)).doubleValue());
                i3++;
            }
        } else {
            while (i3 < list.size()) {
                this.f25598a.M(i2, ((Double) list.get(i3)).doubleValue());
                i3++;
            }
        }
    }

    public final void q(int i2, String str) {
        this.f25598a.s(i2, str);
    }

    public final void r(int i2, List list, boolean z2) {
        int i3 = 0;
        if (list instanceof zzlw) {
            zzlw zzlw = (zzlw) list;
            if (z2) {
                this.f25598a.a0(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < zzlw.size(); i5++) {
                    i4 += zzkl.k0(zzlw.t(i5));
                }
                this.f25598a.Z(i4);
                while (i3 < zzlw.size()) {
                    this.f25598a.u(zzlw.t(i3));
                    i3++;
                }
                return;
            }
            while (i3 < zzlw.size()) {
                this.f25598a.o(i2, zzlw.t(i3));
                i3++;
            }
        } else if (z2) {
            this.f25598a.a0(i2, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzkl.k0(((Long) list.get(i7)).longValue());
            }
            this.f25598a.Z(i6);
            while (i3 < list.size()) {
                this.f25598a.u(((Long) list.get(i3)).longValue());
                i3++;
            }
        } else {
            while (i3 < list.size()) {
                this.f25598a.o(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
        }
    }

    public final void s(int i2, Object obj, zznd zznd) {
        zzkl zzkl = this.f25598a;
        zzkl.a0(i2, 3);
        zznd.i((zzml) obj, zzkl.f25592a);
        zzkl.a0(i2, 4);
    }

    public final void t(int i2) {
        this.f25598a.a0(i2, 3);
    }

    public final void u(int i2, List list, boolean z2) {
        int i3 = 0;
        if (list instanceof zzlf) {
            zzlf zzlf = (zzlf) list;
            if (z2) {
                this.f25598a.a0(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < zzlf.size(); i5++) {
                    i4 += zzkl.t0(zzlf.g(i5));
                }
                this.f25598a.Z(i4);
                while (i3 < zzlf.size()) {
                    this.f25598a.C0(zzlf.g(i3));
                    i3++;
                }
                return;
            }
            while (i3 < zzlf.size()) {
                this.f25598a.D0(i2, zzlf.g(i3));
                i3++;
            }
        } else if (z2) {
            this.f25598a.a0(i2, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzkl.t0(((Integer) list.get(i7)).intValue());
            }
            this.f25598a.Z(i6);
            while (i3 < list.size()) {
                this.f25598a.C0(((Integer) list.get(i3)).intValue());
                i3++;
            }
        } else {
            while (i3 < list.size()) {
                this.f25598a.D0(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
        }
    }

    public final void v(int i2, zzmc zzmc, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f25598a.a0(i2, 2);
            this.f25598a.Z(zzmd.a(zzmc, entry.getKey(), entry.getValue()));
            zzmd.b(this.f25598a, zzmc, entry.getKey(), entry.getValue());
        }
    }

    public final void w(int i2, int i3) {
        this.f25598a.O(i2, i3);
    }

    public final void x(int i2, long j2) {
        this.f25598a.o(i2, j2);
    }

    public final void y(int i2, double d2) {
        this.f25598a.M(i2, d2);
    }

    public final void z(int i2, List list, zznd zznd) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            s(i2, list.get(i3), zznd);
        }
    }
}
