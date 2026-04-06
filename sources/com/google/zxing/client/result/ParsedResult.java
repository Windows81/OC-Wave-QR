package com.google.zxing.client.result;

public abstract class ParsedResult {
    public static void b(String str, StringBuilder sb) {
        if (str != null && !str.isEmpty()) {
            if (sb.length() > 0) {
                sb.append(10);
            }
            sb.append(str);
        }
    }

    public static void c(String[] strArr, StringBuilder sb) {
        if (strArr != null) {
            for (String b2 : strArr) {
                b(b2, sb);
            }
        }
    }

    public abstract String a();

    public final String toString() {
        return a();
    }
}
