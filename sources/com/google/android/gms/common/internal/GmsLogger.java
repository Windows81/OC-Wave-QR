package com.google.android.gms.common.internal;

public final class GmsLogger {

    /* renamed from: a  reason: collision with root package name */
    public final String f24892a;

    /* renamed from: b  reason: collision with root package name */
    public final String f24893b;

    public GmsLogger(String str, String str2) {
        Preconditions.n(str, "log tag cannot be null");
        Preconditions.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f24892a = str;
        this.f24893b = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
