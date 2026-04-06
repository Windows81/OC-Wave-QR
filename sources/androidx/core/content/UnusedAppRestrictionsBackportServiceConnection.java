package androidx.core.content;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService;

class UnusedAppRestrictionsBackportServiceConnection implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public IUnusedAppRestrictionsBackportService f19703a;

    /* renamed from: b  reason: collision with root package name */
    public ResolvableFuture f19704b;

    public final IUnusedAppRestrictionsBackportCallback a() {
        return new IUnusedAppRestrictionsBackportCallback.Stub() {
            public void x2(boolean z2, boolean z3) {
                if (!z2) {
                    UnusedAppRestrictionsBackportServiceConnection.this.f19704b.z(0);
                    Log.e("PackageManagerCompat", "Unable to retrieve the permission revocation setting from the backport");
                } else if (z3) {
                    UnusedAppRestrictionsBackportServiceConnection.this.f19704b.z(3);
                } else {
                    UnusedAppRestrictionsBackportServiceConnection.this.f19704b.z(2);
                }
            }
        };
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IUnusedAppRestrictionsBackportService J = IUnusedAppRestrictionsBackportService.Stub.J(iBinder);
        this.f19703a = J;
        try {
            J.J0(a());
        } catch (RemoteException unused) {
            this.f19704b.z(0);
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.f19703a = null;
    }
}
