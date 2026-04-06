package com.google.gson.internal;

public final class JavaVersion {

    /* renamed from: a  reason: collision with root package name */
    public static final int f31731a = a();

    public static int a() {
        return c(System.getProperty("java.version"));
    }

    public static int b(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < str.length(); i2++) {
                char charAt = str.charAt(i2);
                if (!Character.isDigit(charAt)) {
                    break;
                }
                sb.append(charAt);
            }
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static int c(String str) {
        int e2 = e(str);
        if (e2 == -1) {
            e2 = b(str);
        }
        if (e2 == -1) {
            return 6;
        }
        return e2;
    }

    public static boolean d() {
        return f31731a >= 9;
    }

    public static int e(String str) {
        try {
            String[] split = str.split("[._]");
            int parseInt = Integer.parseInt(split[0]);
            return (parseInt != 1 || split.length <= 1) ? parseInt : Integer.parseInt(split[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
