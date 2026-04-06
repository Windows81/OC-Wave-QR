package org.bson.assertions;

public final class Assertions {
    public static void a(String str, boolean z2) {
        if (!z2) {
            throw new IllegalStateException("state should be: " + str);
        }
    }

    public static Object b(String str, Object obj, boolean z2) {
        if (z2) {
            return obj;
        }
        throw new IllegalArgumentException("state should be: " + str);
    }

    public static void c(String str, boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException("state should be: " + str);
        }
    }

    public static Object d(String str, Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new IllegalArgumentException(str + " can not be null");
    }
}
