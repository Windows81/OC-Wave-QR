package com.google.common.base;

@ElementTypesAreNonnullByDefault
public final class Preconditions {
    public static void A(boolean z2, String str, Object obj, Object obj2) {
        if (!z2) {
            throw new IllegalStateException(Strings.b(str, obj, obj2));
        }
    }

    public static String a(int i2, int i3, String str) {
        if (i2 < 0) {
            return Strings.b("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return Strings.b("%s (%s) must be less than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i3);
        throw new IllegalArgumentException(sb.toString());
    }

    public static String b(int i2, int i3, String str) {
        if (i2 < 0) {
            return Strings.b("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return Strings.b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i3);
        throw new IllegalArgumentException(sb.toString());
    }

    public static String c(int i2, int i3, int i4) {
        return (i2 < 0 || i2 > i4) ? b(i2, i4, "start index") : (i3 < 0 || i3 > i4) ? b(i3, i4, "end index") : Strings.b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2));
    }

    public static void d(boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException();
        }
    }

    public static void e(boolean z2, Object obj) {
        if (!z2) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void f(boolean z2, String str, char c2) {
        if (!z2) {
            throw new IllegalArgumentException(Strings.b(str, Character.valueOf(c2)));
        }
    }

    public static void g(boolean z2, String str, int i2) {
        if (!z2) {
            throw new IllegalArgumentException(Strings.b(str, Integer.valueOf(i2)));
        }
    }

    public static void h(boolean z2, String str, int i2, int i3) {
        if (!z2) {
            throw new IllegalArgumentException(Strings.b(str, Integer.valueOf(i2), Integer.valueOf(i3)));
        }
    }

    public static void i(boolean z2, String str, long j2) {
        if (!z2) {
            throw new IllegalArgumentException(Strings.b(str, Long.valueOf(j2)));
        }
    }

    public static void j(boolean z2, String str, Object obj) {
        if (!z2) {
            throw new IllegalArgumentException(Strings.b(str, obj));
        }
    }

    public static void k(boolean z2, String str, Object obj, int i2) {
        if (!z2) {
            throw new IllegalArgumentException(Strings.b(str, obj, Integer.valueOf(i2)));
        }
    }

    public static void l(boolean z2, String str, Object obj, Object obj2) {
        if (!z2) {
            throw new IllegalArgumentException(Strings.b(str, obj, obj2));
        }
    }

    public static void m(boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z2) {
            throw new IllegalArgumentException(Strings.b(str, obj, obj2, obj3));
        }
    }

    public static void n(boolean z2, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (!z2) {
            throw new IllegalArgumentException(Strings.b(str, obj, obj2, obj3, obj4));
        }
    }

    public static int o(int i2, int i3) {
        return p(i2, i3, "index");
    }

    public static int p(int i2, int i3, String str) {
        if (i2 >= 0 && i2 < i3) {
            return i2;
        }
        throw new IndexOutOfBoundsException(a(i2, i3, str));
    }

    public static Object q(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object r(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static Object s(Object obj, String str, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(Strings.b(str, obj2));
    }

    public static int t(int i2, int i3) {
        return u(i2, i3, "index");
    }

    public static int u(int i2, int i3, String str) {
        if (i2 >= 0 && i2 <= i3) {
            return i2;
        }
        throw new IndexOutOfBoundsException(b(i2, i3, str));
    }

    public static void v(int i2, int i3, int i4) {
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            throw new IndexOutOfBoundsException(c(i2, i3, i4));
        }
    }

    public static void w(boolean z2) {
        if (!z2) {
            throw new IllegalStateException();
        }
    }

    public static void x(boolean z2, Object obj) {
        if (!z2) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void y(boolean z2, String str, int i2) {
        if (!z2) {
            throw new IllegalStateException(Strings.b(str, Integer.valueOf(i2)));
        }
    }

    public static void z(boolean z2, String str, Object obj) {
        if (!z2) {
            throw new IllegalStateException(Strings.b(str, obj));
        }
    }
}
