package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import java.util.concurrent.TimeUnit;

public final class OptionalPendingResultImpl<R extends Result> extends OptionalPendingResult<R> {

    /* renamed from: a  reason: collision with root package name */
    public final BasePendingResult f24519a;

    public final void b(PendingResult.StatusListener statusListener) {
        this.f24519a.b(statusListener);
    }

    public final Result c(long j2, TimeUnit timeUnit) {
        return this.f24519a.c(j2, timeUnit);
    }

    public final void d() {
        this.f24519a.d();
    }

    public final void e(ResultCallback resultCallback) {
        this.f24519a.e(resultCallback);
    }
}
