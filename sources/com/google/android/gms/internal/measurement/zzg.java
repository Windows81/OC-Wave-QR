package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class zzg {
    public static double a(double d2) {
        int i2;
        if (Double.isNaN(d2)) {
            return 0.0d;
        }
        if (Double.isInfinite(d2) || d2 == 0.0d || d2 == -0.0d) {
            return d2;
        }
        return ((double) (i2 > 0 ? 1 : -1)) * Math.floor(Math.abs(d2));
    }

    public static int b(zzh zzh) {
        int i2 = i(zzh.c("runtime.counter").g().doubleValue() + 1.0d);
        if (i2 <= 1000000) {
            zzh.h("runtime.counter", new zzai(Double.valueOf((double) i2)));
            return i2;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    public static zzbv c(String str) {
        zzbv d2 = (str == null || str.isEmpty()) ? null : zzbv.d(Integer.parseInt(str));
        if (d2 != null) {
            return d2;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", new Object[]{str}));
    }

    public static Object d(zzaq zzaq) {
        if (zzaq.f25337n.equals(zzaq)) {
            return null;
        }
        if (zzaq.f25336m.equals(zzaq)) {
            return "";
        }
        if (zzaq instanceof zzap) {
            return e((zzap) zzaq);
        }
        if (!(zzaq instanceof zzaf)) {
            return !zzaq.g().isNaN() ? zzaq.g() : zzaq.h();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((zzaf) zzaq).iterator();
        while (it.hasNext()) {
            Object d2 = d((zzaq) it.next());
            if (d2 != null) {
                arrayList.add(d2);
            }
        }
        return arrayList;
    }

    public static Map e(zzap zzap) {
        HashMap hashMap = new HashMap();
        for (String str : zzap.a()) {
            Object d2 = d(zzap.m(str));
            if (d2 != null) {
                hashMap.put(str, d2);
            }
        }
        return hashMap;
    }

    public static void f(zzbv zzbv, int i2, List list) {
        g(zzbv.name(), i2, list);
    }

    public static void g(String str, int i2, List list) {
        if (list.size() != i2) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(list.size())}));
        }
    }

    public static boolean h(zzaq zzaq, zzaq zzaq2) {
        if (!zzaq.getClass().equals(zzaq2.getClass())) {
            return false;
        }
        if ((zzaq instanceof zzax) || (zzaq instanceof zzao)) {
            return true;
        }
        if (!(zzaq instanceof zzai)) {
            return zzaq instanceof zzas ? zzaq.h().equals(zzaq2.h()) : zzaq instanceof zzag ? zzaq.e().equals(zzaq2.e()) : zzaq == zzaq2;
        }
        if (Double.isNaN(zzaq.g().doubleValue()) || Double.isNaN(zzaq2.g().doubleValue())) {
            return false;
        }
        return zzaq.g().equals(zzaq2.g());
    }

    public static int i(double d2) {
        int i2;
        if (Double.isNaN(d2) || Double.isInfinite(d2) || d2 == 0.0d) {
            return 0;
        }
        return (int) ((long) ((((double) (i2 > 0 ? 1 : -1)) * Math.floor(Math.abs(d2))) % 4.294967296E9d));
    }

    public static void j(zzbv zzbv, int i2, List list) {
        k(zzbv.name(), i2, list);
    }

    public static void k(String str, int i2, List list) {
        if (list.size() < i2) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(list.size())}));
        }
    }

    public static boolean l(zzaq zzaq) {
        if (zzaq == null) {
            return false;
        }
        Double g2 = zzaq.g();
        return !g2.isNaN() && g2.doubleValue() >= 0.0d && g2.equals(Double.valueOf(Math.floor(g2.doubleValue())));
    }

    public static long m(double d2) {
        return ((long) i(d2)) & 4294967295L;
    }

    public static void n(String str, int i2, List list) {
        if (list.size() > i2) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(list.size())}));
        }
    }
}
