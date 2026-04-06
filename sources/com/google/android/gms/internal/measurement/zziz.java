package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.common.base.Function;

public final class zziz {

    /* renamed from: a  reason: collision with root package name */
    public final String f25536a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f25537b;

    /* renamed from: c  reason: collision with root package name */
    public final String f25538c;

    /* renamed from: d  reason: collision with root package name */
    public final String f25539d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f25540e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f25541f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f25542g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f25543h;

    /* renamed from: i  reason: collision with root package name */
    public final Function f25544i;

    public zziz(Uri uri) {
        this((String) null, uri, "", "", false, false, false, false, (Function) null);
    }

    public final zzir a(String str, double d2) {
        return zzir.b(this, str, Double.valueOf(-3.0d), true);
    }

    public final zzir b(String str, long j2) {
        return zzir.c(this, str, Long.valueOf(j2), true);
    }

    public final zzir c(String str, String str2) {
        return zzir.d(this, str, str2, true);
    }

    public final zzir d(String str, boolean z2) {
        return zzir.a(this, str, Boolean.valueOf(z2), true);
    }

    public final zziz e() {
        return new zziz(this.f25536a, this.f25537b, this.f25538c, this.f25539d, this.f25540e, this.f25541f, true, this.f25543h, this.f25544i);
    }

    public final zziz f() {
        if (this.f25538c.isEmpty()) {
            Function function = this.f25544i;
            if (function == null) {
                return new zziz(this.f25536a, this.f25537b, this.f25538c, this.f25539d, true, this.f25541f, this.f25542g, this.f25543h, function);
            }
            throw new IllegalStateException("Cannot skip gservices both always and conditionally");
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public zziz(String str, Uri uri, String str2, String str3, boolean z2, boolean z3, boolean z4, boolean z5, Function function) {
        this.f25536a = str;
        this.f25537b = uri;
        this.f25538c = str2;
        this.f25539d = str3;
        this.f25540e = z2;
        this.f25541f = z3;
        this.f25542g = z4;
        this.f25543h = z5;
        this.f25544i = function;
    }
}
