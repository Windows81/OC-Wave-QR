package com.google.zxing.common;

import java.nio.charset.Charset;

public final class StringUtils {

    /* renamed from: a  reason: collision with root package name */
    public static final String f32617a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f32618b;

    static {
        String name = Charset.defaultCharset().name();
        f32617a = name;
        f32618b = "SJIS".equalsIgnoreCase(name) || "EUC_JP".equalsIgnoreCase(name);
    }
}
