package org.bson.diagnostics;

import org.bson.assertions.Assertions;

public final class Loggers {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f43881a = b();

    public static Logger a(String str) {
        Assertions.d("suffix", str);
        if (str.startsWith(".") || str.endsWith(".")) {
            throw new IllegalArgumentException("The suffix can not start or end with a '.'");
        }
        String str2 = "org.bson." + str;
        return f43881a ? new SLF4JLogger(str2) : new JULLogger(str2);
    }

    public static boolean b() {
        return true;
    }
}
