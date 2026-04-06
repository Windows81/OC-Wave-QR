package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.common.util.BiConsumer;

public final /* synthetic */ class j implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f31388A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ ConfigContainer f31389B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ BiConsumer f31390z;

    public /* synthetic */ j(BiConsumer biConsumer, String str, ConfigContainer configContainer) {
        this.f31390z = biConsumer;
        this.f31388A = str;
        this.f31389B = configContainer;
    }

    public final void run() {
        this.f31390z.a(this.f31388A, this.f31389B);
    }
}
