package com.google.zxing.client.result;

import java.util.regex.Pattern;

public final class VCardResultParser extends ResultParser {

    /* renamed from: f  reason: collision with root package name */
    public static final Pattern f32581f = Pattern.compile("BEGIN:VCARD", 2);

    /* renamed from: g  reason: collision with root package name */
    public static final Pattern f32582g = Pattern.compile("\\d{4}-?\\d{2}-?\\d{2}");

    /* renamed from: h  reason: collision with root package name */
    public static final Pattern f32583h = Pattern.compile("\r\n[ \t]");

    /* renamed from: i  reason: collision with root package name */
    public static final Pattern f32584i = Pattern.compile("\\\\[nN]");

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f32585j = Pattern.compile("\\\\([,;\\\\])");

    /* renamed from: k  reason: collision with root package name */
    public static final Pattern f32586k = Pattern.compile("=");

    /* renamed from: l  reason: collision with root package name */
    public static final Pattern f32587l = Pattern.compile(";");

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f32588m = Pattern.compile("(?<!\\\\);+");

    /* renamed from: n  reason: collision with root package name */
    public static final Pattern f32589n = Pattern.compile(",");

    /* renamed from: o  reason: collision with root package name */
    public static final Pattern f32590o = Pattern.compile("[;,]");
}
