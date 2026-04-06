package com.hansecom.abt.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import timber.log.Timber;

@Metadata
public final class ColorExt {

    /* renamed from: a  reason: collision with root package name */
    public static final ColorExt f39002a = new ColorExt();

    public final Long a(String str) {
        Intrinsics.i(str, "colorString");
        String D0 = StringsKt.D0(str, "#");
        int length = D0.length();
        if (length == 6) {
            D0 = "FF" + D0;
        } else if (length != 8) {
            Timber.f44337a.c(new IllegalArgumentException("Invalid color string " + str));
            D0 = null;
        }
        if (D0 != null) {
            return Long.valueOf(Long.parseLong(D0, CharsKt.a(16)));
        }
        return null;
    }
}
