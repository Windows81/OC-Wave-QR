package com.google.android.gms.wallet.button;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;

public final class zzf {
    public static final View a(Context context, ButtonOptions buttonOptions) {
        zze zze;
        DynamiteModule b2 = b(context);
        try {
            IBinder d2 = b2.d("com.google.android.gms.wallet.dynamite.PayButtonCreatorChimeraImpl");
            if (d2 == null) {
                zze = null;
            } else {
                IInterface queryLocalInterface = d2.queryLocalInterface("com.google.android.gms.wallet.button.IPayButtonCreator");
                zze = queryLocalInterface instanceof zze ? (zze) queryLocalInterface : new zze(d2);
            }
            if (zze != null) {
                return (View) ObjectWrapper.P(zze.u1(ObjectWrapper.u1(new Context[]{b2.b(), context}), buttonOptions));
            }
            Log.e("PayButtonProxy", "Failed to get the actual PayButtonCreatorChimeraImpl.");
            return null;
        } catch (RemoteException e2) {
            e = e2;
            Log.e("PayButtonProxy", "Failed to create PayButton using dynamite package", e);
            return null;
        } catch (DynamiteModule.LoadingException e3) {
            e = e3;
            Log.e("PayButtonProxy", "Failed to create PayButton using dynamite package", e);
            return null;
        }
    }

    public static final DynamiteModule b(Context context) {
        try {
            return DynamiteModule.e(context, DynamiteModule.f25219b, "com.google.android.gms.wallet_dynamite");
        } catch (DynamiteModule.LoadingException e2) {
            throw new IllegalStateException(e2);
        }
    }
}
