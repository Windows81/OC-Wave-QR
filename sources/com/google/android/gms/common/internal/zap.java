package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

final class zap implements PendingResult.StatusListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PendingResult f24950a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f24951b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ PendingResultUtil.ResultConverter f24952c;

    public final void a(Status status) {
        if (status.o0()) {
            this.f24951b.c(this.f24952c.a(this.f24950a.c(0, TimeUnit.MILLISECONDS)));
            return;
        }
        this.f24951b.b(ApiExceptionUtil.a(status));
    }
}
