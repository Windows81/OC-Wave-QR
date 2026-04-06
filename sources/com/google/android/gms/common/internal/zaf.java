package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleFragment;

final class zaf extends zag {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ LifecycleFragment f24935A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Intent f24936z;

    public zaf(Intent intent, LifecycleFragment lifecycleFragment, int i2) {
        this.f24936z = intent;
        this.f24935A = lifecycleFragment;
    }

    public final void a() {
        Intent intent = this.f24936z;
        if (intent != null) {
            this.f24935A.startActivityForResult(intent, 2);
        }
    }
}
