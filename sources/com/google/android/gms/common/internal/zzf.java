package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

public final class zzf extends zza {

    /* renamed from: g  reason: collision with root package name */
    public final IBinder f24981g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ BaseGmsClient f24982h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzf(BaseGmsClient baseGmsClient, int i2, IBinder iBinder, Bundle bundle) {
        super(baseGmsClient, i2, bundle);
        this.f24982h = baseGmsClient;
        this.f24981g = iBinder;
    }

    public final void f(ConnectionResult connectionResult) {
        if (this.f24982h.f24856v != null) {
            this.f24982h.f24856v.N(connectionResult);
        }
        this.f24982h.Q(connectionResult);
    }

    public final boolean g() {
        try {
            IBinder iBinder = this.f24981g;
            Preconditions.m(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f24982h.J().equals(interfaceDescriptor)) {
                String J = this.f24982h.J();
                Log.w("GmsClient", "service descriptor mismatch: " + J + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface x2 = this.f24982h.x(this.f24981g);
            if (x2 == null || (!BaseGmsClient.l0(this.f24982h, 2, 4, x2) && !BaseGmsClient.l0(this.f24982h, 3, 4, x2))) {
                return false;
            }
            this.f24982h.f24860z = null;
            BaseGmsClient baseGmsClient = this.f24982h;
            Bundle C = baseGmsClient.C();
            if (baseGmsClient.f24855u == null) {
                return true;
            }
            this.f24982h.f24855u.P(C);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
