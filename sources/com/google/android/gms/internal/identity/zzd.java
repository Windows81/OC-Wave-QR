package com.google.android.gms.internal.identity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;

public final class zzd extends zzf {

    /* renamed from: l  reason: collision with root package name */
    public final int f25306l;

    /* renamed from: m  reason: collision with root package name */
    public Activity f25307m;

    public zzd(int i2, Activity activity) {
        this.f25306l = i2;
        this.f25307m = activity;
    }

    public final void t0(int i2, Bundle bundle) {
        PendingIntent createPendingResult;
        if (i2 == 1) {
            Intent intent = new Intent();
            intent.putExtras(bundle);
            Activity activity = this.f25307m;
            if (activity != null && (createPendingResult = activity.createPendingResult(this.f25306l, intent, 1073741824)) != null) {
                try {
                    createPendingResult.send(1);
                } catch (PendingIntent.CanceledException e2) {
                    Log.w("AddressClientImpl", "Exception settng pending result", e2);
                }
            }
        } else {
            ConnectionResult connectionResult = new ConnectionResult(i2, bundle != null ? (PendingIntent) bundle.getParcelable("com.google.android.gms.identity.intents.EXTRA_PENDING_INTENT") : null);
            if (connectionResult.X()) {
                try {
                    connectionResult.m0((Activity) Preconditions.m(this.f25307m), this.f25306l);
                } catch (IntentSender.SendIntentException e3) {
                    Log.w("AddressClientImpl", "Exception starting pending intent", e3);
                }
            } else {
                try {
                    PendingIntent createPendingResult2 = ((Activity) Preconditions.m(this.f25307m)).createPendingResult(this.f25306l, new Intent(), 1073741824);
                    if (createPendingResult2 != null) {
                        createPendingResult2.send(1);
                    }
                } catch (PendingIntent.CanceledException e4) {
                    Log.w("AddressClientImpl", "Exception setting pending result", e4);
                }
            }
        }
    }
}
