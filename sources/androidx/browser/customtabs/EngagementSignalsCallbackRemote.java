package androidx.browser.customtabs;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.IEngagementSignalsCallback;
import android.util.Log;

final class EngagementSignalsCallbackRemote implements EngagementSignalsCallback {

    /* renamed from: a  reason: collision with root package name */
    public final IEngagementSignalsCallback f1661a;

    public EngagementSignalsCallbackRemote(IEngagementSignalsCallback iEngagementSignalsCallback) {
        this.f1661a = iEngagementSignalsCallback;
    }

    public static EngagementSignalsCallbackRemote a(IBinder iBinder) {
        return new EngagementSignalsCallbackRemote(IEngagementSignalsCallback.Stub.J(iBinder));
    }

    public void E(boolean z2, Bundle bundle) {
        try {
            this.f1661a.E(z2, bundle);
        } catch (RemoteException unused) {
            Log.e("EngagementSigsCallbkRmt", "RemoteException during IEngagementSignalsCallback transaction");
        }
    }

    public void F(boolean z2, Bundle bundle) {
        try {
            this.f1661a.F(z2, bundle);
        } catch (RemoteException unused) {
            Log.e("EngagementSigsCallbkRmt", "RemoteException during IEngagementSignalsCallback transaction");
        }
    }

    public void M(int i2, Bundle bundle) {
        try {
            this.f1661a.M(i2, bundle);
        } catch (RemoteException unused) {
            Log.e("EngagementSigsCallbkRmt", "RemoteException during IEngagementSignalsCallback transaction");
        }
    }
}
