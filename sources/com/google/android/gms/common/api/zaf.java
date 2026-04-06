package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BasePendingResult;

final class zaf<R extends Result> extends BasePendingResult<R> {

    /* renamed from: q  reason: collision with root package name */
    public final Result f24779q;

    public final Result f(Status status) {
        if (status.S() == this.f24779q.A().S()) {
            return this.f24779q;
        }
        throw new UnsupportedOperationException("Creating failed results is not supported");
    }
}
