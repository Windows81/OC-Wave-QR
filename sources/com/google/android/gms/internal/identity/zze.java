package com.google.android.gms.internal.identity;

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
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.identity.intents.UserAddressRequest;

public final class zze extends GmsClient<zzh> {
    public final Activity I;
    public zzd J;
    public final String K;
    public final int L;

    public zze(Activity activity, Looper looper, ClientSettings clientSettings, int i2, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super((Context) activity, looper, 12, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.K = clientSettings.b();
        this.I = activity;
        this.L = i2;
    }

    public final String J() {
        return "com.google.android.gms.identity.intents.internal.IAddressService";
    }

    public final String K() {
        return "com.google.android.gms.identity.service.BIND";
    }

    public final boolean T() {
        return true;
    }

    public final void j() {
        super.j();
        zzd zzd = this.J;
        if (zzd != null) {
            zzd.f25307m = null;
            this.J = null;
        }
    }

    public final int o() {
        return GooglePlayServicesUtilLight.f24398a;
    }

    public final void q0(UserAddressRequest userAddressRequest, int i2) {
        super.w();
        this.J = new zzd(i2, this.I);
        try {
            Bundle bundle = new Bundle();
            bundle.putString("com.google.android.gms.identity.intents.EXTRA_CALLING_PACKAGE_NAME", D().getPackageName());
            if (!TextUtils.isEmpty(this.K)) {
                bundle.putParcelable("com.google.android.gms.identity.intents.EXTRA_ACCOUNT", new Account(this.K, "com.google"));
            }
            bundle.putInt("com.google.android.gms.identity.intents.EXTRA_THEME", this.L);
            ((zzh) super.I()).P((zzg) Preconditions.m(this.J), userAddressRequest, bundle);
        } catch (RemoteException e2) {
            Log.e("AddressClientImpl", "Exception requesting user address", e2);
            Bundle bundle2 = new Bundle();
            bundle2.putInt("com.google.android.gms.identity.intents.EXTRA_ERROR_CODE", 555);
            ((zzd) Preconditions.m(this.J)).t0(1, bundle2);
        }
    }

    public final /* bridge */ /* synthetic */ IInterface x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identity.intents.internal.IAddressService");
        return queryLocalInterface instanceof zzh ? (zzh) queryLocalInterface : new zzh(iBinder);
    }
}
