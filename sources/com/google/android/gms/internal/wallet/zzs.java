package com.google.android.gms.internal.wallet;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import java.lang.ref.WeakReference;

final class zzs extends zzt {

    /* renamed from: l  reason: collision with root package name */
    public final WeakReference f25942l;

    /* renamed from: m  reason: collision with root package name */
    public final int f25943m;

    public zzs(Activity activity, int i2) {
        this.f25942l = new WeakReference(activity);
        this.f25943m = i2;
    }

    public final void A0(int i2, boolean z2, Bundle bundle) {
        Activity activity = (Activity) this.f25942l.get();
        if (activity == null) {
            Log.d("WalletClientImpl", "Ignoring onPreAuthorizationDetermined, Activity has gone");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("com.google.android.gm.wallet.EXTRA_IS_USER_PREAUTHORIZED", z2);
        PendingIntent createPendingResult = activity.createPendingResult(this.f25943m, intent, 1073741824);
        if (createPendingResult == null) {
            Log.w("WalletClientImpl", "Null pending result returned for onPreAuthorizationDetermined");
            return;
        }
        try {
            createPendingResult.send(-1);
        } catch (PendingIntent.CanceledException e2) {
            Log.w("WalletClientImpl", "Exception setting pending result", e2);
        }
    }

    public final void K2(int i2, FullWallet fullWallet, Bundle bundle) {
        int i3;
        Activity activity = (Activity) this.f25942l.get();
        if (activity == null) {
            Log.d("WalletClientImpl", "Ignoring onFullWalletLoaded, Activity has gone");
            return;
        }
        ConnectionResult connectionResult = new ConnectionResult(i2, bundle != null ? (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT") : null);
        if (connectionResult.X()) {
            try {
                connectionResult.m0(activity, this.f25943m);
            } catch (IntentSender.SendIntentException e2) {
                Log.w("WalletClientImpl", "Exception starting pending intent", e2);
            }
        } else {
            Intent intent = new Intent();
            if (connectionResult.f0()) {
                intent.putExtra("com.google.android.gms.wallet.EXTRA_FULL_WALLET", fullWallet);
                i3 = -1;
            } else {
                int i4 = i2 == 408 ? 0 : 1;
                intent.putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", i2);
                i3 = i4;
            }
            PendingIntent createPendingResult = activity.createPendingResult(this.f25943m, intent, 1073741824);
            if (createPendingResult == null) {
                Log.w("WalletClientImpl", "Null pending result returned for onFullWalletLoaded");
                return;
            }
            try {
                createPendingResult.send(i3);
            } catch (PendingIntent.CanceledException e3) {
                Log.w("WalletClientImpl", "Exception setting pending result", e3);
            }
        }
    }

    public final void h1(int i2, MaskedWallet maskedWallet, Bundle bundle) {
        int i3;
        Activity activity = (Activity) this.f25942l.get();
        if (activity == null) {
            Log.d("WalletClientImpl", "Ignoring onMaskedWalletLoaded, Activity has gone");
            return;
        }
        ConnectionResult connectionResult = new ConnectionResult(i2, bundle != null ? (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT") : null);
        if (connectionResult.X()) {
            try {
                connectionResult.m0(activity, this.f25943m);
            } catch (IntentSender.SendIntentException e2) {
                Log.w("WalletClientImpl", "Exception starting pending intent", e2);
            }
        } else {
            Intent intent = new Intent();
            if (connectionResult.f0()) {
                intent.putExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET", maskedWallet);
                i3 = -1;
            } else {
                int i4 = i2 == 408 ? 0 : 1;
                intent.putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", i2);
                i3 = i4;
            }
            PendingIntent createPendingResult = activity.createPendingResult(this.f25943m, intent, 1073741824);
            if (createPendingResult == null) {
                Log.w("WalletClientImpl", "Null pending result returned for onMaskedWalletLoaded");
                return;
            }
            try {
                createPendingResult.send(i3);
            } catch (PendingIntent.CanceledException e3) {
                Log.w("WalletClientImpl", "Exception setting pending result", e3);
            }
        }
    }

    public final void j2(int i2, Bundle bundle) {
        Preconditions.n(bundle, "Bundle should not be null");
        Activity activity = (Activity) this.f25942l.get();
        if (activity == null) {
            Log.d("WalletClientImpl", "Ignoring onWalletObjectsCreated, Activity has gone");
            return;
        }
        ConnectionResult connectionResult = new ConnectionResult(i2, (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT"));
        if (connectionResult.X()) {
            try {
                connectionResult.m0(activity, this.f25943m);
            } catch (IntentSender.SendIntentException e2) {
                Log.w("WalletClientImpl", "Exception starting pending intent", e2);
            }
        } else {
            Log.e("WalletClientImpl", "Create Wallet Objects confirmation UI will not be shown connection result: ".concat(connectionResult.toString()));
            Intent intent = new Intent();
            intent.putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", 413);
            PendingIntent createPendingResult = activity.createPendingResult(this.f25943m, intent, 1073741824);
            if (createPendingResult == null) {
                Log.w("WalletClientImpl", "Null pending result returned for onWalletObjectsCreated");
                return;
            }
            try {
                createPendingResult.send(1);
            } catch (PendingIntent.CanceledException e3) {
                Log.w("WalletClientImpl", "Exception setting pending result", e3);
            }
        }
    }
}
