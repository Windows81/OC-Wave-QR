package com.hansecom.abt.impl;

import com.hansecom.abt.GooglePayConfig;
import com.hansecom.abt.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum Realm {
    MAPI_CI("https://mapi.ci.mvticketing.com/", "https://mapi.ci.mvticketing.com/realms/octa/protocol/openid-connect/token/", "octa", OctaTestGooglePayConfig.f34097a, Integer.valueOf(R.raw.f33036b), (GooglePayConfig) null, false, 32, (boolean) null),
    MAPI_PROD("https://mapi.production.mvticketing.com/", "https://mapi.production.mvticketing.com/realms/octa/protocol/openid-connect/token/", "octa", OctaProdGooglePayConfig.f34087a, Integer.valueOf(R.raw.f33037c), (GooglePayConfig) null, true, 32, (boolean) null);
    

    /* renamed from: A  reason: collision with root package name */
    public final String f34107A;

    /* renamed from: B  reason: collision with root package name */
    public final String f34108B;
    public final GooglePayConfig C;
    public final Integer D;
    public final String E;
    public final boolean F;

    /* renamed from: z  reason: collision with root package name */
    public final String f34109z;

    static {
        Realm[] d2;
        J = EnumEntriesKt.a(d2);
    }

    /* access modifiers changed from: public */
    Realm(String str, String str2, String str3, GooglePayConfig googlePayConfig, Integer num, String str4, boolean z2) {
        this.f34109z = str;
        this.f34107A = str2;
        this.f34108B = str3;
        this.C = googlePayConfig;
        this.D = num;
        this.E = str4;
        this.F = z2;
    }

    public static EnumEntries k() {
        return J;
    }

    public final String f() {
        return this.f34109z;
    }

    public final String h() {
        return this.E;
    }

    public final boolean j() {
        return this.F;
    }

    public final GooglePayConfig l() {
        return this.C;
    }

    public final Integer m() {
        return this.D;
    }

    public final String n() {
        return this.f34107A;
    }

    public final String o() {
        return this.f34108B;
    }
}
