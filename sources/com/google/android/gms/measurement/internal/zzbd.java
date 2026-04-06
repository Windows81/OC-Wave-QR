package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

final class zzbd {

    /* renamed from: a  reason: collision with root package name */
    public final String f26241a;

    /* renamed from: b  reason: collision with root package name */
    public final String f26242b;

    /* renamed from: c  reason: collision with root package name */
    public final long f26243c;

    /* renamed from: d  reason: collision with root package name */
    public final long f26244d;

    /* renamed from: e  reason: collision with root package name */
    public final long f26245e;

    /* renamed from: f  reason: collision with root package name */
    public final long f26246f;

    /* renamed from: g  reason: collision with root package name */
    public final long f26247g;

    /* renamed from: h  reason: collision with root package name */
    public final Long f26248h;

    /* renamed from: i  reason: collision with root package name */
    public final Long f26249i;

    /* renamed from: j  reason: collision with root package name */
    public final Long f26250j;

    /* renamed from: k  reason: collision with root package name */
    public final Boolean f26251k;

    public zzbd(String str, String str2, long j2, long j3, long j4, long j5, Long l2, Long l3, Long l4, Boolean bool) {
        this(str, str2, 0, 0, 0, j4, 0, (Long) null, (Long) null, (Long) null, (Boolean) null);
    }

    public final zzbd a(long j2) {
        return new zzbd(this.f26241a, this.f26242b, this.f26243c, this.f26244d, this.f26245e, j2, this.f26247g, this.f26248h, this.f26249i, this.f26250j, this.f26251k);
    }

    public final zzbd b(long j2, long j3) {
        return new zzbd(this.f26241a, this.f26242b, this.f26243c, this.f26244d, this.f26245e, this.f26246f, j2, Long.valueOf(j3), this.f26249i, this.f26250j, this.f26251k);
    }

    public final zzbd c(Long l2, Long l3, Boolean bool) {
        return new zzbd(this.f26241a, this.f26242b, this.f26243c, this.f26244d, this.f26245e, this.f26246f, this.f26247g, this.f26248h, l2, l3, (bool == null || bool.booleanValue()) ? bool : null);
    }

    public zzbd(String str, String str2, long j2, long j3, long j4, long j5, long j6, Long l2, Long l3, Long l4, Boolean bool) {
        long j7 = j2;
        long j8 = j3;
        long j9 = j4;
        long j10 = j6;
        Preconditions.g(str);
        Preconditions.g(str2);
        boolean z2 = false;
        Preconditions.a(j7 >= 0);
        Preconditions.a(j8 >= 0);
        Preconditions.a(j9 >= 0);
        Preconditions.a(j10 >= 0 ? true : z2);
        this.f26241a = str;
        this.f26242b = str2;
        this.f26243c = j7;
        this.f26244d = j8;
        this.f26245e = j9;
        this.f26246f = j5;
        this.f26247g = j10;
        this.f26248h = l2;
        this.f26249i = l3;
        this.f26250j = l4;
        this.f26251k = bool;
    }
}
