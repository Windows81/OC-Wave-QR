package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.IPostMessageService;

public class PostMessageService extends Service {

    /* renamed from: z  reason: collision with root package name */
    public IPostMessageService.Stub f1662z;

    /* renamed from: androidx.browser.customtabs.PostMessageService$1  reason: invalid class name */
    public class AnonymousClass1 extends IPostMessageService.Stub {
        public void b1(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            iCustomTabsCallback.L2(bundle);
        }

        public void z1(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) {
            iCustomTabsCallback.E2(str, bundle);
        }
    }

    public IBinder onBind(Intent intent) {
        return this.f1662z;
    }
}
