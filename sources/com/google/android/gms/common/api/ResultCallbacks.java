package com.google.android.gms.common.api;

import android.util.Log;
import com.google.android.gms.common.api.Result;

public abstract class ResultCallbacks<R extends Result> implements ResultCallback<R> {
    public final void a(Result result) {
        Status A2 = result.A();
        if (A2.o0()) {
            c(result);
            return;
        }
        b(A2);
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).g();
            } catch (RuntimeException e2) {
                Log.w("ResultCallbacks", "Unable to release ".concat(String.valueOf(result)), e2);
            }
        }
    }

    public abstract void b(Status status);

    public abstract void c(Result result);
}
