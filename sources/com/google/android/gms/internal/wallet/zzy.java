package com.google.android.gms.internal.wallet;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentCardRecognitionIntentRequest;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.zzk;

public final class zzy extends GmsClient {
    public final Context I;
    public final int J;
    public final String K;
    public final int L;
    public final boolean M;

    public zzy(Context context, Looper looper, ClientSettings clientSettings, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, int i2, int i3, boolean z2) {
        super(context, looper, 4, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.I = context;
        this.J = i2;
        Account a2 = clientSettings.a();
        this.K = a2 != null ? a2.name : null;
        this.L = i3;
        this.M = z2;
    }

    public final Feature[] A() {
        return zzk.f27396i;
    }

    public final String J() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    public final String K() {
        return "com.google.android.gms.wallet.service.BIND";
    }

    public final boolean T() {
        return true;
    }

    public final boolean X() {
        return true;
    }

    public final int o() {
        return 12600000;
    }

    public final void q0(CreateWalletObjectsRequest createWalletObjectsRequest, int i2) {
        zzs zzs = new zzs((Activity) this.I, i2);
        try {
            ((zzo) I()).u1(createWalletObjectsRequest, v0(), zzs);
        } catch (RemoteException e2) {
            Log.e("WalletClientImpl", "RemoteException creating wallet objects", e2);
            zzs.j2(8, Bundle.EMPTY);
        }
    }

    public final void r0(CreateWalletObjectsRequest createWalletObjectsRequest, TaskCompletionSource taskCompletionSource) {
        Bundle v0 = v0();
        v0.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
        zzv zzv = new zzv(taskCompletionSource);
        try {
            ((zzo) I()).u1(createWalletObjectsRequest, v0, zzv);
        } catch (RemoteException e2) {
            Log.e("WalletClientImpl", "RemoteException creating wallet objects", e2);
            zzv.j2(8, Bundle.EMPTY);
        }
    }

    public final void s0(PaymentCardRecognitionIntentRequest paymentCardRecognitionIntentRequest, TaskCompletionSource taskCompletionSource) {
        try {
            ((zzo) I()).W2(paymentCardRecognitionIntentRequest, v0(), new zzw(taskCompletionSource));
        } catch (RemoteException e2) {
            Log.e("WalletClientImpl", "RemoteException during getPaymentCardRecognitionIntent", e2);
            Status status = Status.D;
        }
    }

    public final void t0(IsReadyToPayRequest isReadyToPayRequest, TaskCompletionSource taskCompletionSource) {
        zzu zzu = new zzu(taskCompletionSource);
        try {
            ((zzo) I()).X2(isReadyToPayRequest, v0(), zzu);
        } catch (RemoteException e2) {
            Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e2);
            zzu.p0(Status.G, false, Bundle.EMPTY);
        }
    }

    public final void u0(PaymentDataRequest paymentDataRequest, TaskCompletionSource taskCompletionSource) {
        Bundle v0 = v0();
        v0.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
        zzx zzx = new zzx(taskCompletionSource);
        try {
            ((zzo) I()).Y2(paymentDataRequest, v0, zzx);
        } catch (RemoteException e2) {
            Log.e("WalletClientImpl", "RemoteException getting payment data", e2);
            zzx.W1(Status.G, (PaymentData) null, Bundle.EMPTY);
        }
    }

    public final Bundle v0() {
        String packageName = this.I.getPackageName();
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", this.J);
        bundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", this.M);
        bundle.putString("androidPackageName", packageName);
        String str = this.K;
        if (!TextUtils.isEmpty(str)) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", this.L);
        return bundle;
    }

    public final /* synthetic */ IInterface x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        return queryLocalInterface instanceof zzo ? (zzo) queryLocalInterface : new zzo(iBinder);
    }
}
