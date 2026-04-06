package com.google.firebase.perf.config;

import android.content.Context;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Context f30948A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DeviceCacheManager f30949z;

    public /* synthetic */ a(DeviceCacheManager deviceCacheManager, Context context) {
        this.f30949z = deviceCacheManager;
        this.f30948A = context;
    }

    public final void run() {
        this.f30949z.h(this.f30948A);
    }
}
