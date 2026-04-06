package com.hansecom.abt.impl;

import com.hansecom.abt.GooglePayConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata
public final class OctaProdGooglePayConfig implements GooglePayConfig {

    /* renamed from: a  reason: collision with root package name */
    public static final OctaProdGooglePayConfig f34087a = new OctaProdGooglePayConfig();

    /* renamed from: b  reason: collision with root package name */
    public static final int f34088b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final String f34089c = "gatewayservices";

    /* renamed from: d  reason: collision with root package name */
    public static final String f34090d = "1176820";

    /* renamed from: e  reason: collision with root package name */
    public static final String f34091e = "OCTA";

    /* renamed from: f  reason: collision with root package name */
    public static final String f34092f = "US";

    /* renamed from: g  reason: collision with root package name */
    public static final String f34093g = "USD";

    /* renamed from: h  reason: collision with root package name */
    public static final List f34094h = CollectionsKt.p("AMEX", "DISCOVER", "MASTERCARD", "VISA");

    /* renamed from: i  reason: collision with root package name */
    public static final List f34095i = CollectionsKt.e("CRYPTOGRAM_3DS");

    /* renamed from: j  reason: collision with root package name */
    public static final int f34096j = 8;

    public String a() {
        return f34090d;
    }

    public List b() {
        return f34094h;
    }

    public String c() {
        return f34092f;
    }

    public String d() {
        return f34093g;
    }

    public int e() {
        return f34088b;
    }

    public List f() {
        return f34095i;
    }

    public String g() {
        return f34091e;
    }

    public String h() {
        return f34089c;
    }
}
