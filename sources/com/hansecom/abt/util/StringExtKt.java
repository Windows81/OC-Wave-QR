package com.hansecom.abt.util;

import androidx.compose.ui.text.AnnotatedString;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

@Metadata
public final class StringExtKt {
    public static final String a(String str) {
        Intrinsics.i(str, "<this>");
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    public static final String b(String str) {
        String str2;
        Intrinsics.i(str, "<this>");
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char charAt = str.charAt(0);
        if (Character.isUpperCase(charAt)) {
            String valueOf = String.valueOf(charAt);
            Intrinsics.g(valueOf, "null cannot be cast to non-null type java.lang.String");
            str2 = valueOf.toLowerCase(Locale.ROOT);
            Intrinsics.h(str2, "toLowerCase(...)");
        } else {
            str2 = String.valueOf(charAt);
        }
        sb.append(str2);
        String substring = str.substring(1);
        Intrinsics.h(substring, "substring(...)");
        sb.append(substring);
        return sb.toString();
    }

    public static final String c(String str) {
        String str2;
        Intrinsics.i(str, "<this>");
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char charAt = str.charAt(0);
        if (Character.isLowerCase(charAt)) {
            Locale locale = Locale.getDefault();
            Intrinsics.h(locale, "getDefault(...)");
            str2 = CharsKt.e(charAt, locale);
        } else {
            str2 = String.valueOf(charAt);
        }
        sb.append(str2);
        String substring = str.substring(1);
        Intrinsics.h(substring, "substring(...)");
        sb.append(substring);
        return sb.toString();
    }

    public static final String d(String str) {
        Intrinsics.i(str, "<this>");
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (' ' <= charAt && charAt < 127) {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    public static final AnnotatedString e(AnnotatedString annotatedString, Function1 function1) {
        Intrinsics.i(annotatedString, "<this>");
        Intrinsics.i(function1, "spanStyleMapper");
        String k2 = annotatedString.k();
        Iterable<AnnotatedString.Range> h2 = annotatedString.h();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(h2, 10));
        for (AnnotatedString.Range range : h2) {
            arrayList.add(AnnotatedString.Range.e(range, function1.invoke(range.g()), 0, 0, (String) null, 14, (Object) null));
        }
        return new AnnotatedString(k2, arrayList, annotatedString.f());
    }
}
