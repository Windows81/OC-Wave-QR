package com.google.android.gms.internal.pay;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.pay.zzn;

public final class zzab extends GmsClient {
    public zzab(Context context, Looper looper, ClientSettings clientSettings, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 198, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }

    public final Feature[] A() {
        return new Feature[]{zzn.f27111g, zzn.f27104B, zzn.C, zzn.E, zzn.j0, zzn.t0, zzn.w0, zzn.y0, zzn.z0, zzn.A0};
    }

    public final String J() {
        return "com.google.android.gms.pay.internal.IThirdPartyPayService";
    }

    public final String K() {
        return "com.google.android.gms.pay.service.THIRD_PARTY";
    }

    public final boolean N() {
        return true;
    }

    public final boolean X() {
        return true;
    }

    public final int o() {
        return 17895000;
    }

    public final /* synthetic */ IInterface x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.pay.internal.IThirdPartyPayService");
        return queryLocalInterface instanceof zzg ? (zzg) queryLocalInterface : new zzg(iBinder);
    }
}
