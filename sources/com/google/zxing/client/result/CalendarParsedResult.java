package com.google.zxing.client.result;

import java.text.DateFormat;
import java.util.regex.Pattern;

public final class CalendarParsedResult extends ParsedResult {

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f32521j = Pattern.compile("P(?:(\\d+)W)?(?:(\\d+)D)?(?:T(?:(\\d+)H)?(?:(\\d+)M)?(?:(\\d+)S)?)?");

    /* renamed from: k  reason: collision with root package name */
    public static final long[] f32522k = {604800000, 86400000, 3600000, 60000, 1000};

    /* renamed from: l  reason: collision with root package name */
    public static final Pattern f32523l = Pattern.compile("[0-9]{8}(T[0-9]{6}Z?)?");

    /* renamed from: a  reason: collision with root package name */
    public final String f32524a;

    /* renamed from: b  reason: collision with root package name */
    public final long f32525b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f32526c;

    /* renamed from: d  reason: collision with root package name */
    public final long f32527d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f32528e;

    /* renamed from: f  reason: collision with root package name */
    public final String f32529f;

    /* renamed from: g  reason: collision with root package name */
    public final String f32530g;

    /* renamed from: h  reason: collision with root package name */
    public final String[] f32531h;

    /* renamed from: i  reason: collision with root package name */
    public final String f32532i;

    public static String d(boolean z2, long j2) {
        if (j2 < 0) {
            return null;
        }
        return (z2 ? DateFormat.getDateInstance(2) : DateFormat.getDateTimeInstance(2, 2)).format(Long.valueOf(j2));
    }

    public String a() {
        StringBuilder sb = new StringBuilder(100);
        ParsedResult.b(this.f32524a, sb);
        ParsedResult.b(d(this.f32526c, this.f32525b), sb);
        ParsedResult.b(d(this.f32528e, this.f32527d), sb);
        ParsedResult.b(this.f32529f, sb);
        ParsedResult.b(this.f32530g, sb);
        ParsedResult.c(this.f32531h, sb);
        ParsedResult.b(this.f32532i, sb);
        return sb.toString();
    }
}
