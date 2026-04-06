package com.google.android.gms.pay;

import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.pay.zzx;

public class Pay {

    /* renamed from: a  reason: collision with root package name */
    public static final Api.ClientKey f27005a;

    /* renamed from: b  reason: collision with root package name */
    public static final Api.ClientKey f27006b;

    /* renamed from: c  reason: collision with root package name */
    public static final Api.AbstractClientBuilder f27007c;

    /* renamed from: d  reason: collision with root package name */
    public static final Api.AbstractClientBuilder f27008d;

    /* renamed from: e  reason: collision with root package name */
    public static final Api f27009e;

    /* renamed from: f  reason: collision with root package name */
    public static final Api f27010f;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f27005a = clientKey;
        Api.ClientKey clientKey2 = new Api.ClientKey();
        f27006b = clientKey2;
        zzbk zzbk = new zzbk();
        f27007c = zzbk;
        zzbl zzbl = new zzbl();
        f27008d = zzbl;
        f27009e = new Api("Pay.API", zzbk, clientKey);
        f27010f = new Api("Pay.THIRD_PARTY_API", zzbl, clientKey2);
    }

    public static PayClient a(Context context) {
        return new zzx(context);
    }
}
