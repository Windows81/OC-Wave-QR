package com.hansecom.abt.impl;

import com.hansecom.abt.GooglePayConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata
public final class OctaTestGooglePayConfig implements GooglePayConfig {

    /* renamed from: a  reason: collision with root package name */
    public static final OctaTestGooglePayConfig f34097a = new OctaTestGooglePayConfig();

    /* renamed from: b  reason: collision with root package name */
    public static final int f34098b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final String f34099c = "gatewayservices";

    /* renamed from: d  reason: collision with root package name */
    public static final String f34100d = "1017080";

    /* renamed from: e  reason: collision with root package name */
    public static final String f34101e = "OCTA";

    /* renamed from: f  reason: collision with root package name */
    public static final String f34102f = "US";

    /* renamed from: g  reason: collision with root package name */
    public static final String f34103g = "USD";

    /* renamed from: h  reason: collision with root package name */
    public static final List f34104h = CollectionsKt.p("AMEX", "DISCOVER", "MASTERCARD", "VISA");

    /* renamed from: i  reason: collision with root package name */
    public static final List f34105i = CollectionsKt.e("CRYPTOGRAM_3DS");

    /* renamed from: j  reason: collision with root package name */
    public static final int f34106j = 8;

    public String a() {
        return f34100d;
    }

    public List b() {
        return f34104h;
    }

    public String c() {
        return f34102f;
    }

    public String d() {
        return f34103g;
    }

    public int e() {
        return f34098b;
    }

    public List f() {
        return f34105i;
    }

    public String g() {
        return f34101e;
    }

    public String h() {
        return f34099c;
    }
}
