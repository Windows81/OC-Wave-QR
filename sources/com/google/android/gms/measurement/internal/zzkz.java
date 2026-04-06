package com.google.android.gms.measurement.internal;

import android.net.Uri;

final class zzkz implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Uri f26716A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ String f26717B;
    public final /* synthetic */ String C;
    public final /* synthetic */ zzkw D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f26718z;

    public zzkz(zzkw zzkw, boolean z2, Uri uri, String str, String str2) {
        this.f26718z = z2;
        this.f26716A = uri;
        this.f26717B = str;
        this.C = str2;
        this.D = zzkw;
    }

    public final void run() {
        zzkw.a(this.D, this.f26718z, this.f26716A, this.f26717B, this.C);
    }
}
