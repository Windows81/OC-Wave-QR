package com.google.android.gms.internal.pay;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;

public final class zzz extends zzy {

    /* renamed from: l  reason: collision with root package name */
    public final WeakReference f25923l;

    /* renamed from: m  reason: collision with root package name */
    public final int f25924m;

    public zzz(Activity activity, int i2) {
        this.f25923l = new WeakReference(activity);
        this.f25924m = i2;
    }

    public final void t1(Status status) {
        Activity activity = (Activity) this.f25923l.get();
        if (activity == null) {
            Log.d("PayClientImpl", "Ignoring onPendingIntent, Activity is gone");
            return;
        }
        if (status.f0()) {
            try {
                status.A0(activity, this.f25924m);
                return;
            } catch (IntentSender.SendIntentException e2) {
                Log.w("PayClientImpl", "Exception starting pending intent", e2);
            }
        }
        PendingIntent createPendingResult = activity.createPendingResult(this.f25924m, new Intent(), 1073741824);
        if (createPendingResult == null) {
            Log.w("PayClientImpl", "Null pending result returned for onPendingIntent");
            return;
        }
        try {
            createPendingResult.send(status.o0() ? -1 : status.S());
        } catch (PendingIntent.CanceledException e3) {
            Log.w("PayClientImpl", "Exception setting pending result", e3);
        }
    }
}
