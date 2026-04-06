package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

public final class zze implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final int f24979a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BaseGmsClient f24980b;

    public zze(BaseGmsClient baseGmsClient, int i2) {
        this.f24980b = baseGmsClient;
        this.f24979a = i2;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        BaseGmsClient baseGmsClient = this.f24980b;
        if (iBinder == null) {
            BaseGmsClient.i0(baseGmsClient, 16);
            return;
        }
        synchronized (baseGmsClient.f24848n) {
            try {
                BaseGmsClient baseGmsClient2 = this.f24980b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                baseGmsClient2.f24849o = (queryLocalInterface == null || !(queryLocalInterface instanceof IGmsServiceBroker)) ? new zzad(iBinder) : (IGmsServiceBroker) queryLocalInterface;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.f24980b.j0(0, (Bundle) null, this.f24979a);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f24980b.f24848n) {
            this.f24980b.f24849o = null;
        }
        BaseGmsClient baseGmsClient = this.f24980b;
        int i2 = this.f24979a;
        Handler handler = baseGmsClient.f24846l;
        handler.sendMessage(handler.obtainMessage(6, i2, 1));
    }
}
