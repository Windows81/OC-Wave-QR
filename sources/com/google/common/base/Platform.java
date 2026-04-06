package com.google.common.base;

import java.util.Locale;
import java.util.logging.Logger;
import java.util.regex.Pattern;

@ElementTypesAreNonnullByDefault
final class Platform {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f27748a = Logger.getLogger(Platform.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final PatternCompiler f27749b = d();

    public static final class JdkPatternCompiler implements PatternCompiler {
        public JdkPatternCompiler() {
        }

        public CommonPattern a(String str) {
            return new JdkPattern(Pattern.compile(str));
        }
    }

    public static CommonPattern a(String str) {
        Preconditions.q(str);
        return f27749b.a(str);
    }

    public static String b(String str) {
        if (e(str)) {
            return null;
        }
        return str;
    }

    public static String c(double d2) {
        return String.format(Locale.ROOT, "%.4g", new Object[]{Double.valueOf(d2)});
    }

    public static PatternCompiler d() {
        return new JdkPatternCompiler();
    }

    public static boolean e(String str) {
        return str == null || str.isEmpty();
    }

    public static long f() {
        return System.nanoTime();
    }
}
