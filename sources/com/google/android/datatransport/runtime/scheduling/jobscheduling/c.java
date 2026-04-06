package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.TransportContext;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TransportContext f24210A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f24211B;
    public final /* synthetic */ Runnable C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Uploader f24212z;

    public /* synthetic */ c(Uploader uploader, TransportContext transportContext, int i2, Runnable runnable) {
        this.f24212z = uploader;
        this.f24210A = transportContext;
        this.f24211B = i2;
        this.C = runnable;
    }

    public final void run() {
        this.f24212z.t(this.f24210A, this.f24211B, this.C);
    }
}
