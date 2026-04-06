package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.api.Api;

public final class Common {

    /* renamed from: a  reason: collision with root package name */
    public static final Api.ClientKey f24917a;

    /* renamed from: b  reason: collision with root package name */
    public static final Api f24918b;

    /* renamed from: c  reason: collision with root package name */
    public static final Api.AbstractClientBuilder f24919c;

    /* renamed from: d  reason: collision with root package name */
    public static final zae f24920d = new zae();

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f24917a = clientKey;
        zab zab = new zab();
        f24919c = zab;
        f24918b = new Api("Common.API", zab, clientKey);
    }
}
