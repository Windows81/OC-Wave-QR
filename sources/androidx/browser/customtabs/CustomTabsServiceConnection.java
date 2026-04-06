package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.customtabs.ICustomTabsService;

public abstract class CustomTabsServiceConnection implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public Context f1651a;

    public abstract void a(ComponentName componentName, CustomTabsClient customTabsClient);

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.f1651a != null) {
            a(componentName, new CustomTabsClient(ICustomTabsService.Stub.J(iBinder), componentName, this.f1651a) {
            });
            return;
        }
        throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
    }
}
