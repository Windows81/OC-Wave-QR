package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;

public final class zacc extends zap {
    public TaskCompletionSource E;

    public final void g() {
        super.g();
        this.E.d(new CancellationException("Host activity was destroyed before Google Play services could be made available."));
    }

    public final void m(ConnectionResult connectionResult, int i2) {
        String Q = connectionResult.Q();
        if (Q == null) {
            Q = "Error connecting to Google Play services";
        }
        this.E.b(new ApiException(new Status(connectionResult, Q, connectionResult.H())));
    }

    public final void n() {
        Activity e2 = this.f24501z.e();
        if (e2 == null) {
            this.E.d(new ApiException(new Status(8)));
            return;
        }
        int i2 = this.D.i(e2);
        if (i2 == 0) {
            this.E.e((Object) null);
        } else if (!this.E.a().m()) {
            s(new ConnectionResult(i2, (PendingIntent) null), 0);
        }
    }
}
