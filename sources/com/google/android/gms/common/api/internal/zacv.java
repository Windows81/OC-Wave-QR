package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zacv extends TaskApiCall {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TaskApiCall.Builder f24719d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zacv(TaskApiCall.Builder builder, Feature[] featureArr, boolean z2, int i2) {
        super(featureArr, z2, i2);
        this.f24719d = builder;
    }

    public final void b(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
        this.f24719d.f24529a.a(anyClient, taskCompletionSource);
    }
}
