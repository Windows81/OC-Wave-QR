package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

final class zznf {

    /* renamed from: a  reason: collision with root package name */
    public static final zznx f25699a = new zznz();

    public static int A(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzkl.U(i2, 0);
    }

    public static int B(List list) {
        return list.size() << 3;
    }

    public static void C(int i2, List list, zzos zzos, boolean z2) {
        if (list != null && !list.isEmpty()) {
            zzos.F(i2, list, z2);
        }
    }

    public static int D(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return E(list) + (size * zzkl.x0(i2));
    }

    public static int E(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlf) {
            zzlf zzlf = (zzlf) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzkl.l0(zzlf.g(i3));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + zzkl.l0(((Integer) list.get(i3)).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static void F(int i2, List list, zzos zzos, boolean z2) {
        if (list != null && !list.isEmpty()) {
            zzos.B(i2, list, z2);
        }
    }

    public static int G(int i2, List list, boolean z2) {
        if (list.size() == 0) {
            return 0;
        }
        return H(list) + (list.size() * zzkl.x0(i2));
    }

    public static int H(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlw) {
            zzlw zzlw = (zzlw) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzkl.f0(zzlw.t(i3));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + zzkl.f0(((Long) list.get(i3)).longValue());
                i3++;
            }
        }
        return i2;
    }

    public static void I(int i2, List list, zzos zzos, boolean z2) {
        if (list != null && !list.isEmpty()) {
            zzos.L(i2, list, z2);
        }
    }

    public static int J(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return K(list) + (size * zzkl.x0(i2));
    }

    public static int K(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlf) {
            zzlf zzlf = (zzlf) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzkl.t0(zzlf.g(i3));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + zzkl.t0(((Integer) list.get(i3)).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static void L(int i2, List list, zzos zzos, boolean z2) {
        if (list != null && !list.isEmpty()) {
            zzos.H(i2, list, z2);
        }
    }

    public static int M(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return N(list) + (size * zzkl.x0(i2));
    }

    public static int N(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlw) {
            zzlw zzlw = (zzlw) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzkl.o0(zzlw.t(i3));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + zzkl.o0(((Long) list.get(i3)).longValue());
                i3++;
            }
        }
        return i2;
    }

    public static void O(int i2, List list, zzos zzos, boolean z2) {
        if (list != null && !list.isEmpty()) {
            zzos.h(i2, list, z2);
        }
    }

    public static int P(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return Q(list) + (size * zzkl.x0(i2));
    }

    public static int Q(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlf) {
            zzlf zzlf = (zzlf) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzkl.A0(zzlf.g(i3));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + zzkl.A0(((Integer) list.get(i3)).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static void R(int i2, List list, zzos zzos, boolean z2) {
        if (list != null && !list.isEmpty()) {
            zzos.d(i2, list, z2);
        }
    }

    public static int S(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return T(list) + (size * zzkl.x0(i2));
    }

    public static int T(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlw) {
            zzlw zzlw = (zzlw) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzkl.s0(zzlw.t(i3));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + zzkl.s0(((Long) list.get(i3)).longValue());
                i3++;
            }
        }
        return i2;
    }

    public static void U(int i2, List list, zzos zzos, boolean z2) {
        if (list != null && !list.isEmpty()) {
            zzos.r(i2, list, z2);
        }
    }

    public static void V(int i2, List list, zzos zzos, boolean z2) {
        if (list != null && !list.isEmpty()) {
            zzos.u(i2, list, z2);
        }
    }

    public static void W(int i2, List list, zzos zzos, boolean z2) {
        if (list != null && !list.isEmpty()) {
            zzos.n(i2, list, z2);
        }
    }

    public static void X(int i2, List list, zzos zzos, boolean z2) {
        if (list != null && !list.isEmpty()) {
            zzos.G(i2, list, z2);
        }
    }

    public static void Y(int i2, List list, zzos zzos, boolean z2) {
        if (list != null && !list.isEmpty()) {
            zzos.E(i2, list, z2);
        }
    }

    public static int a(int i2, Object obj, zznd zznd) {
        return obj instanceof zzlt ? zzkl.z(i2, (zzlt) obj) : zzkl.W(i2, (zzml) obj, zznd);
    }

    public static int b(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int x0 = size * zzkl.x0(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            x0 += zzkl.E((zzjs) list.get(i3));
        }
        return x0;
    }

    public static int c(int i2, List list, zznd zznd) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += zzkl.B(i2, (zzml) list.get(i4), zznd);
        }
        return i3;
    }

    public static int d(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzkl.D(i2, true);
    }

    public static int e(List list) {
        return list.size();
    }

    public static zznx f() {
        return f25699a;
    }

    public static Object g(Object obj, int i2, int i3, Object obj2, zznx zznx) {
        if (obj2 == null) {
            obj2 = zznx.o(obj);
        }
        zznx.l(obj2, i2, (long) i3);
        return obj2;
    }

    public static Object h(Object obj, int i2, List list, zzlg zzlg, Object obj2, zznx zznx) {
        if (zzlg == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                Integer num = (Integer) list.get(i4);
                int intValue = num.intValue();
                if (zzlg.j(intValue)) {
                    if (i4 != i3) {
                        list.set(i3, num);
                    }
                    i3++;
                } else {
                    obj2 = g(obj, i2, intValue, obj2, zznx);
                }
            }
            if (i3 != size) {
                list.subList(i3, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzlg.j(intValue2)) {
                    obj2 = g(obj, i2, intValue2, obj2, zznx);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    public static void i(int i2, List list, zzos zzos) {
        if (list != null && !list.isEmpty()) {
            zzos.O(i2, list);
        }
    }

    public static void j(int i2, List list, zzos zzos, zznd zznd) {
        if (list != null && !list.isEmpty()) {
            zzos.z(i2, list, zznd);
        }
    }

    public static void k(int i2, List list, zzos zzos, boolean z2) {
        if (list != null && !list.isEmpty()) {
            zzos.g(i2, list, z2);
        }
    }

    public static void l(zzkr zzkr, Object obj, Object obj2) {
        zzkv b2 = zzkr.b(obj2);
        if (!b2.f25608a.isEmpty()) {
            zzkr.i(obj).i(b2);
        }
    }

    public static void m(zzme zzme, Object obj, Object obj2, long j2) {
        zzny.j(obj, j2, zzme.f(zzny.B(obj, j2), zzny.B(obj2, j2)));
    }

    public static void n(zznx zznx, Object obj, Object obj2) {
        zznx.p(obj, zznx.c(zznx.q(obj), zznx.q(obj2)));
    }

    public static void o(Class cls) {
        zzlc.class.isAssignableFrom(cls);
    }

    public static boolean p(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int q(int i2, List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        int x0 = zzkl.x0(i2) * size;
        if (list instanceof zzls) {
            zzls zzls = (zzls) list;
            while (i3 < size) {
                Object j2 = zzls.j(i3);
                x0 += j2 instanceof zzjs ? zzkl.E((zzjs) j2) : zzkl.G((String) j2);
                i3++;
            }
        } else {
            while (i3 < size) {
                Object obj = list.get(i3);
                x0 += obj instanceof zzjs ? zzkl.E((zzjs) obj) : zzkl.G((String) obj);
                i3++;
            }
        }
        return x0;
    }

    public static int r(int i2, List list, zznd zznd) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int x0 = zzkl.x0(i2) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            x0 += obj instanceof zzlt ? zzkl.h((zzlt) obj) : zzkl.i((zzml) obj, zznd);
        }
        return x0;
    }

    public static int s(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return t(list) + (size * zzkl.x0(i2));
    }

    public static int t(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlf) {
            zzlf zzlf = (zzlf) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzkl.c0(zzlf.g(i3));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + zzkl.c0(((Integer) list.get(i3)).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static void u(int i2, List list, zzos zzos) {
        if (list != null && !list.isEmpty()) {
            zzos.I(i2, list);
        }
    }

    public static void v(int i2, List list, zzos zzos, zznd zznd) {
        if (list != null && !list.isEmpty()) {
            zzos.o(i2, list, zznd);
        }
    }

    public static void w(int i2, List list, zzos zzos, boolean z2) {
        if (list != null && !list.isEmpty()) {
            zzos.p(i2, list, z2);
        }
    }

    public static int x(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzkl.m0(i2, 0);
    }

    public static int y(List list) {
        return list.size() << 2;
    }

    public static void z(int i2, List list, zzos zzos, boolean z2) {
        if (list != null && !list.isEmpty()) {
            zzos.m(i2, list, z2);
        }
    }
}
