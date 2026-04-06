package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzkx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class zzkv<T extends zzkx<T>> {

    /* renamed from: d  reason: collision with root package name */
    public static final zzkv f25607d = new zzkv(true);

    /* renamed from: a  reason: collision with root package name */
    public final zzne f25608a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f25609b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f25610c;

    public zzkv() {
        this.f25608a = new zznh();
    }

    public static int b(zzkx zzkx, Object obj) {
        zzof b2 = zzkx.b();
        int a2 = zzkx.a();
        if (!zzkx.g()) {
            return c(b2, a2, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i2 = 0;
        if (!zzkx.e()) {
            int i3 = 0;
            while (i2 < size) {
                i3 += c(b2, a2, list.get(i2));
                i2++;
            }
            return i3;
        } else if (list.isEmpty()) {
            return 0;
        } else {
            int i4 = 0;
            while (i2 < size) {
                i4 += d(b2, list.get(i2));
                i2++;
            }
            return zzkl.x0(a2) + i4 + zzkl.A0(i4);
        }
    }

    public static int c(zzof zzof, int i2, Object obj) {
        int x0 = zzkl.x0(i2);
        if (zzof == zzof.GROUP) {
            zzle.g((zzml) obj);
            x0 <<= 1;
        }
        return x0 + d(zzof, obj);
    }

    public static int d(zzof zzof, Object obj) {
        switch (zzku.f25606b[zzof.ordinal()]) {
            case 1:
                return zzkl.c(((Double) obj).doubleValue());
            case 2:
                return zzkl.d(((Float) obj).floatValue());
            case 3:
                return zzkl.f0(((Long) obj).longValue());
            case 4:
                return zzkl.s0(((Long) obj).longValue());
            case 5:
                return zzkl.l0(((Integer) obj).intValue());
            case 6:
                return zzkl.X(((Long) obj).longValue());
            case 7:
                return zzkl.h0(((Integer) obj).intValue());
            case 8:
                return zzkl.j(((Boolean) obj).booleanValue());
            case 9:
                return zzkl.F((zzml) obj);
            case 10:
                return obj instanceof zzlp ? zzkl.h((zzlp) obj) : zzkl.Y((zzml) obj);
            case 11:
                return obj instanceof zzjs ? zzkl.E((zzjs) obj) : zzkl.G((String) obj);
            case 12:
                return obj instanceof zzjs ? zzkl.E((zzjs) obj) : zzkl.k((byte[]) obj);
            case 13:
                return zzkl.A0(((Integer) obj).intValue());
            case 14:
                return zzkl.p0(((Integer) obj).intValue());
            case 15:
                return zzkl.k0(((Long) obj).longValue());
            case 16:
                return zzkl.t0(((Integer) obj).intValue());
            case 17:
                return zzkl.o0(((Long) obj).longValue());
            case 18:
                return obj instanceof zzlh ? zzkl.c0(((zzlh) obj).a()) : zzkl.c0(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int e(Map.Entry entry) {
        zzkx zzkx = (zzkx) entry.getKey();
        Object value = entry.getValue();
        return (zzkx.c() != zzop.MESSAGE || zzkx.g() || zzkx.e()) ? b(zzkx, value) : value instanceof zzlp ? zzkl.g(((zzkx) entry.getKey()).a(), (zzlp) value) : zzkl.A(((zzkx) entry.getKey()).a(), (zzml) value);
    }

    public static Object g(Object obj) {
        if (obj instanceof zzmq) {
            return ((zzmq) obj).a();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static void h(zzkl zzkl, zzof zzof, int i2, Object obj) {
        if (zzof == zzof.GROUP) {
            zzml zzml = (zzml) obj;
            zzle.g(zzml);
            zzkl.a0(i2, 3);
            zzml.c(zzkl);
            zzkl.a0(i2, 4);
            return;
        }
        zzkl.a0(i2, zzof.a());
        switch (zzku.f25606b[zzof.ordinal()]) {
            case 1:
                zzkl.J(((Double) obj).doubleValue());
                return;
            case 2:
                zzkl.K(((Float) obj).floatValue());
                return;
            case 3:
                zzkl.R(((Long) obj).longValue());
                return;
            case 4:
                zzkl.R(((Long) obj).longValue());
                return;
            case 5:
                zzkl.L(((Integer) obj).intValue());
                return;
            case 6:
                zzkl.u(((Long) obj).longValue());
                return;
            case 7:
                zzkl.m(((Integer) obj).intValue());
                return;
            case 8:
                zzkl.S(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((zzml) obj).c(zzkl);
                return;
            case 10:
                zzkl.w((zzml) obj);
                return;
            case 11:
                if (obj instanceof zzjs) {
                    zzkl.v((zzjs) obj);
                    return;
                } else {
                    zzkl.x((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zzjs) {
                    zzkl.v((zzjs) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zzkl.T(bArr, 0, bArr.length);
                return;
            case 13:
                zzkl.Z(((Integer) obj).intValue());
                return;
            case 14:
                zzkl.m(((Integer) obj).intValue());
                return;
            case 15:
                zzkl.u(((Long) obj).longValue());
                return;
            case 16:
                zzkl.C0(((Integer) obj).intValue());
                return;
            case 17:
                zzkl.w0(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof zzlh) {
                    zzkl.L(((zzlh) obj).a());
                    return;
                } else {
                    zzkl.L(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    public static boolean l(Object obj) {
        if (obj instanceof zzmn) {
            return ((zzmn) obj).b();
        }
        if (obj instanceof zzlp) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        if ((r4 instanceof com.google.android.gms.internal.measurement.zzlh) == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        if ((r4 instanceof byte[]) == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        if ((r4 instanceof com.google.android.gms.internal.measurement.zzlp) == false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void n(com.google.android.gms.internal.measurement.zzkx r3, java.lang.Object r4) {
        /*
            com.google.android.gms.internal.measurement.zzof r0 = r3.b()
            com.google.android.gms.internal.measurement.zzle.e(r4)
            int[] r1 = com.google.android.gms.internal.measurement.zzku.f25605a
            com.google.android.gms.internal.measurement.zzop r0 = r0.d()
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L_0x0044;
                case 2: goto L_0x0041;
                case 3: goto L_0x003e;
                case 4: goto L_0x003b;
                case 5: goto L_0x0038;
                case 6: goto L_0x0035;
                case 7: goto L_0x002c;
                case 8: goto L_0x0023;
                case 9: goto L_0x001a;
                default: goto L_0x0018;
            }
        L_0x0018:
            r1 = r2
            goto L_0x0046
        L_0x001a:
            boolean r0 = r4 instanceof com.google.android.gms.internal.measurement.zzml
            if (r0 != 0) goto L_0x0046
            boolean r0 = r4 instanceof com.google.android.gms.internal.measurement.zzlp
            if (r0 == 0) goto L_0x0018
            goto L_0x0046
        L_0x0023:
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x0046
            boolean r0 = r4 instanceof com.google.android.gms.internal.measurement.zzlh
            if (r0 == 0) goto L_0x0018
            goto L_0x0046
        L_0x002c:
            boolean r0 = r4 instanceof com.google.android.gms.internal.measurement.zzjs
            if (r0 != 0) goto L_0x0046
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto L_0x0018
            goto L_0x0046
        L_0x0035:
            boolean r1 = r4 instanceof java.lang.String
            goto L_0x0046
        L_0x0038:
            boolean r1 = r4 instanceof java.lang.Boolean
            goto L_0x0046
        L_0x003b:
            boolean r1 = r4 instanceof java.lang.Double
            goto L_0x0046
        L_0x003e:
            boolean r1 = r4 instanceof java.lang.Float
            goto L_0x0046
        L_0x0041:
            boolean r1 = r4 instanceof java.lang.Long
            goto L_0x0046
        L_0x0044:
            boolean r1 = r4 instanceof java.lang.Integer
        L_0x0046:
            if (r1 == 0) goto L_0x0049
            return
        L_0x0049:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r3.a()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.internal.measurement.zzof r3 = r3.b()
            com.google.android.gms.internal.measurement.zzop r3 = r3.d()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r3, r4}
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzkv.n(com.google.android.gms.internal.measurement.zzkx, java.lang.Object):void");
    }

    public static boolean o(Map.Entry entry) {
        zzkx zzkx = (zzkx) entry.getKey();
        if (zzkx.c() != zzop.MESSAGE) {
            return true;
        }
        if (!zzkx.g()) {
            return l(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!l(list.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public final int a() {
        int a2 = this.f25608a.a();
        int i2 = 0;
        for (int i3 = 0; i3 < a2; i3++) {
            i2 += e(this.f25608a.g(i3));
        }
        for (Map.Entry e2 : this.f25608a.h()) {
            i2 += e(e2);
        }
        return i2;
    }

    public final /* synthetic */ Object clone() {
        zzkv zzkv = new zzkv();
        int a2 = this.f25608a.a();
        for (int i2 = 0; i2 < a2; i2++) {
            Map.Entry g2 = this.f25608a.g(i2);
            zzkv.j((zzkx) g2.getKey(), g2.getValue());
        }
        for (Map.Entry entry : this.f25608a.h()) {
            zzkv.j((zzkx) entry.getKey(), entry.getValue());
        }
        zzkv.f25610c = this.f25610c;
        return zzkv;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzkv)) {
            return false;
        }
        return this.f25608a.equals(((zzkv) obj).f25608a);
    }

    public final Object f(zzkx zzkx) {
        Object obj = this.f25608a.get(zzkx);
        if (!(obj instanceof zzlp)) {
            return obj;
        }
        throw new NoSuchMethodError();
    }

    public final int hashCode() {
        return this.f25608a.hashCode();
    }

    public final void i(zzkv zzkv) {
        int a2 = zzkv.f25608a.a();
        for (int i2 = 0; i2 < a2; i2++) {
            k(zzkv.f25608a.g(i2));
        }
        for (Map.Entry k2 : zzkv.f25608a.h()) {
            k(k2);
        }
    }

    public final void j(zzkx zzkx, Object obj) {
        if (!zzkx.g()) {
            n(zzkx, obj);
        } else if (obj instanceof List) {
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                Object obj2 = list.get(i2);
                n(zzkx, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof zzlp) {
            this.f25610c = true;
        }
        this.f25608a.put(zzkx, obj);
    }

    public final void k(Map.Entry entry) {
        zzkx zzkx = (zzkx) entry.getKey();
        Object value = entry.getValue();
        boolean z2 = value instanceof zzlp;
        if (zzkx.g()) {
            if (!z2) {
                Object f2 = f(zzkx);
                List list = (List) value;
                int size = list.size();
                if (f2 == null) {
                    f2 = new ArrayList(size);
                }
                List list2 = (List) f2;
                for (int i2 = 0; i2 < size; i2++) {
                    list2.add(g(list.get(i2)));
                }
                this.f25608a.put(zzkx, f2);
                return;
            }
            throw new IllegalStateException("Lazy fields can not be repeated");
        } else if (zzkx.c() == zzop.MESSAGE) {
            Object f3 = f(zzkx);
            if (f3 == null) {
                this.f25608a.put(zzkx, g(value));
                if (z2) {
                    this.f25610c = true;
                }
            } else if (!z2) {
                this.f25608a.put(zzkx, f3 instanceof zzmq ? zzkx.L((zzmq) f3, (zzmq) value) : zzkx.w(((zzml) f3).i(), (zzml) value).F());
            } else {
                throw new NoSuchMethodError();
            }
        } else if (!z2) {
            this.f25608a.put(zzkx, g(value));
        } else {
            throw new IllegalStateException("Lazy fields must be message-valued");
        }
    }

    public final Iterator m() {
        return this.f25608a.isEmpty() ? Collections.emptyIterator() : this.f25610c ? new zzlq(this.f25608a.m().iterator()) : this.f25608a.m().iterator();
    }

    public final Iterator p() {
        return this.f25608a.isEmpty() ? Collections.emptyIterator() : this.f25610c ? new zzlq(this.f25608a.entrySet().iterator()) : this.f25608a.entrySet().iterator();
    }

    public final void q() {
        if (!this.f25609b) {
            int a2 = this.f25608a.a();
            for (int i2 = 0; i2 < a2; i2++) {
                Map.Entry g2 = this.f25608a.g(i2);
                if (g2.getValue() instanceof zzlc) {
                    ((zzlc) g2.getValue()).G();
                }
            }
            this.f25608a.n();
            this.f25609b = true;
        }
    }

    public final boolean r() {
        return this.f25609b;
    }

    public final boolean s() {
        int a2 = this.f25608a.a();
        for (int i2 = 0; i2 < a2; i2++) {
            if (!o(this.f25608a.g(i2))) {
                return false;
            }
        }
        for (Map.Entry o2 : this.f25608a.h()) {
            if (!o(o2)) {
                return false;
            }
        }
        return true;
    }

    public zzkv(zzne zzne) {
        this.f25608a = zzne;
        q();
    }

    public zzkv(boolean z2) {
        this((zzne) new zznh());
        q();
    }
}
