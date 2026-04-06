package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.IPostMessageService;

public abstract class PostMessageServiceConnection implements PostMessageBackend, ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final Object f1663a;

    /* renamed from: b  reason: collision with root package name */
    public final ICustomTabsCallback f1664b;

    /* renamed from: c  reason: collision with root package name */
    public IPostMessageService f1665c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1666d;

    public final boolean a(Bundle bundle) {
        if (this.f1665c == null) {
            return false;
        }
        synchronized (this.f1663a) {
            try {
                this.f1665c.b1(this.f1664b, bundle);
            } catch (RemoteException unused) {
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    public void b() {
        if (this.f1666d) {
            a((Bundle) null);
        }
    }

    public void c() {
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f1665c = IPostMessageService.Stub.J(iBinder);
        b();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f1665c = null;
        c();
    }
}
