package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

final class zad extends zag {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Activity f24929A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f24930B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Intent f24931z;

    public zad(Intent intent, Activity activity, int i2) {
        this.f24931z = intent;
        this.f24929A = activity;
        this.f24930B = i2;
    }

    public final void a() {
        Intent intent = this.f24931z;
        if (intent != null) {
            this.f24929A.startActivityForResult(intent, this.f24930B);
        }
    }
}
