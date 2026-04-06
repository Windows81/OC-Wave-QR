package com.google.android.gms.signin;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;

public final class zad {

    /* renamed from: a  reason: collision with root package name */
    public static final Api.ClientKey f27156a;

    /* renamed from: b  reason: collision with root package name */
    public static final Api.ClientKey f27157b;

    /* renamed from: c  reason: collision with root package name */
    public static final Api.AbstractClientBuilder f27158c;

    /* renamed from: d  reason: collision with root package name */
    public static final Api.AbstractClientBuilder f27159d;

    /* renamed from: e  reason: collision with root package name */
    public static final Scope f27160e = new Scope("profile");

    /* renamed from: f  reason: collision with root package name */
    public static final Scope f27161f = new Scope("email");

    /* renamed from: g  reason: collision with root package name */
    public static final Api f27162g;

    /* renamed from: h  reason: collision with root package name */
    public static final Api f27163h;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f27156a = clientKey;
        Api.ClientKey clientKey2 = new Api.ClientKey();
        f27157b = clientKey2;
        zaa zaa = new zaa();
        f27158c = zaa;
        zab zab = new zab();
        f27159d = zab;
        f27162g = new Api("SignIn.API", zaa, clientKey);
        f27163h = new Api("SignIn.INTERNAL_API", zab, clientKey2);
    }
}
