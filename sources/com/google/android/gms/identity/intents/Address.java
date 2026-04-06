package com.google.android.gms.identity.intents;

import com.google.android.gms.common.api.Api;

public final class Address {

    /* renamed from: a  reason: collision with root package name */
    public static final Api f25244a;

    /* renamed from: b  reason: collision with root package name */
    public static final Api.ClientKey f25245b;

    /* renamed from: c  reason: collision with root package name */
    public static final Api.AbstractClientBuilder f25246c;

    public static final class AddressOptions implements Api.ApiOptions.HasOptions {

        /* renamed from: z  reason: collision with root package name */
        public final int f25247z = 0;
    }

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f25245b = clientKey;
        zza zza = new zza();
        f25246c = zza;
        f25244a = new Api("Address.API", zza, clientKey);
    }
}
