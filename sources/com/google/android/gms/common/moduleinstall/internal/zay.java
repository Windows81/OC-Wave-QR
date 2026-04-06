package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.moduleinstall.ModuleInstallClient;

public final class zay extends GoogleApi implements ModuleInstallClient {

    /* renamed from: k  reason: collision with root package name */
    public static final Api.ClientKey f25059k;

    /* renamed from: l  reason: collision with root package name */
    public static final Api.AbstractClientBuilder f25060l;

    /* renamed from: m  reason: collision with root package name */
    public static final Api f25061m;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f25059k = clientKey;
        zaq zaq = new zaq();
        f25060l = zaq;
        f25061m = new Api("ModuleInstall.API", zaq, clientKey);
    }
}
