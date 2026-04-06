package androidx.browser.trusted;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.customtabs.trusted.ITrustedWebActivityService;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.List;

class ConnectionHolder implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f1687a;

    /* renamed from: b  reason: collision with root package name */
    public final WrapperFactory f1688b;

    /* renamed from: c  reason: collision with root package name */
    public int f1689c;

    /* renamed from: d  reason: collision with root package name */
    public TrustedWebActivityServiceConnection f1690d;

    /* renamed from: e  reason: collision with root package name */
    public List f1691e;

    /* renamed from: f  reason: collision with root package name */
    public Exception f1692f;

    public static class WrapperFactory {
        public TrustedWebActivityServiceConnection a(ComponentName componentName, IBinder iBinder) {
            return new TrustedWebActivityServiceConnection(ITrustedWebActivityService.Stub.J(iBinder), componentName);
        }
    }

    public void a(Exception exc) {
        for (CallbackToFutureAdapter.Completer e2 : this.f1691e) {
            e2.e(exc);
        }
        this.f1691e.clear();
        this.f1687a.run();
        this.f1689c = 3;
        this.f1692f = exc;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f1690d = this.f1688b.a(componentName, iBinder);
        for (CallbackToFutureAdapter.Completer b2 : this.f1691e) {
            b2.b(this.f1690d);
        }
        this.f1691e.clear();
        this.f1689c = 1;
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.f1690d = null;
        this.f1687a.run();
        this.f1689c = 2;
    }
}
