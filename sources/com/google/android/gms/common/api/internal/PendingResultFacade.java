package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import java.util.concurrent.TimeUnit;

public abstract class PendingResultFacade<A extends Result, B extends Result> extends PendingResult<B> {
    public final void b(PendingResult.StatusListener statusListener) {
        throw null;
    }

    public final Result c(long j2, TimeUnit timeUnit) {
        throw null;
    }

    public final void d() {
        throw null;
    }

    public final void e(ResultCallback resultCallback) {
        throw null;
    }
}
