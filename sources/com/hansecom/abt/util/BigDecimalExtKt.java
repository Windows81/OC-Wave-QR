package com.hansecom.abt.util;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata
public final class BigDecimalExtKt {

    /* renamed from: a  reason: collision with root package name */
    public static final BigDecimal f39001a;

    static {
        BigDecimal valueOf = BigDecimal.valueOf((long) 100);
        Intrinsics.h(valueOf, "valueOf(...)");
        f39001a = valueOf;
    }

    public static final BigDecimal a(int i2) {
        BigDecimal valueOf = BigDecimal.valueOf((long) i2);
        Intrinsics.h(valueOf, "valueOf(...)");
        BigDecimal divide = valueOf.divide(f39001a);
        Intrinsics.h(divide, "divide(...)");
        return divide;
    }

    public static final BigDecimal b(long j2) {
        BigDecimal valueOf = BigDecimal.valueOf(j2);
        Intrinsics.h(valueOf, "valueOf(...)");
        BigDecimal divide = valueOf.divide(f39001a);
        Intrinsics.h(divide, "divide(...)");
        return divide;
    }

    public static final BigDecimal c(Integer num) {
        BigDecimal a2;
        if (num != null && (a2 = a(num.intValue())) != null) {
            return a2;
        }
        BigDecimal bigDecimal = BigDecimal.ZERO;
        Intrinsics.h(bigDecimal, "ZERO");
        return bigDecimal;
    }

    public static final BigDecimal d(Long l2) {
        BigDecimal b2;
        if (l2 != null && (b2 = b(l2.longValue())) != null) {
            return b2;
        }
        BigDecimal bigDecimal = BigDecimal.ZERO;
        Intrinsics.h(bigDecimal, "ZERO");
        return bigDecimal;
    }

    public static final BigDecimal e(String str) {
        Intrinsics.i(str, "<this>");
        BigDecimal m2 = StringsKt.m(str);
        if (m2 != null) {
            return m2;
        }
        BigDecimal bigDecimal = BigDecimal.ZERO;
        Intrinsics.h(bigDecimal, "ZERO");
        return bigDecimal;
    }

    public static final BigDecimal f(BigDecimal bigDecimal) {
        Intrinsics.i(bigDecimal, "<this>");
        BigDecimal multiply = bigDecimal.multiply(f39001a);
        Intrinsics.h(multiply, "multiply(...)");
        return multiply;
    }
}
