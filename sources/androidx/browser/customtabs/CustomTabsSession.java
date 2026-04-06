package androidx.browser.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import android.support.customtabs.IEngagementSignalsCallback;
import java.util.List;
import java.util.concurrent.Executor;

public final class CustomTabsSession {

    /* renamed from: androidx.browser.customtabs.CustomTabsSession$1  reason: invalid class name */
    class AnonymousClass1 extends IEngagementSignalsCallback.Stub {

        /* renamed from: l  reason: collision with root package name */
        public final Handler f1653l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ EngagementSignalsCallback f1654m;

        public void E(boolean z2, Bundle bundle) {
            this.f1653l.post(new b(this.f1654m, z2, bundle));
        }

        public void F(boolean z2, Bundle bundle) {
            this.f1653l.post(new d(this.f1654m, z2, bundle));
        }

        public void M(int i2, Bundle bundle) {
            this.f1653l.post(new c(this.f1654m, i2, bundle));
        }
    }

    /* renamed from: androidx.browser.customtabs.CustomTabsSession$2  reason: invalid class name */
    class AnonymousClass2 extends IEngagementSignalsCallback.Stub {

        /* renamed from: l  reason: collision with root package name */
        public final Executor f1655l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ EngagementSignalsCallback f1656m;

        public void E(boolean z2, Bundle bundle) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                this.f1655l.execute(new g(this.f1656m, z2, bundle));
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        public void F(boolean z2, Bundle bundle) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                this.f1655l.execute(new e(this.f1656m, z2, bundle));
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        public void M(int i2, Bundle bundle) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                this.f1655l.execute(new f(this.f1656m, i2, bundle));
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    public static class MockSession extends ICustomTabsService.Stub {
        public int N1(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) {
            return 0;
        }

        public boolean Q2(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            return false;
        }

        public Bundle T0(String str, Bundle bundle) {
            return null;
        }

        public boolean T1(ICustomTabsCallback iCustomTabsCallback) {
            return false;
        }

        public boolean U1(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle) {
            return false;
        }

        public boolean X1(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            return false;
        }

        public boolean g0(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle, List list) {
            return false;
        }

        public boolean g2(ICustomTabsCallback iCustomTabsCallback, IBinder iBinder, Bundle bundle) {
            return false;
        }

        public boolean i1(long j2) {
            return false;
        }

        public boolean l0(ICustomTabsCallback iCustomTabsCallback, int i2, Uri uri, Bundle bundle) {
            return false;
        }

        public boolean l2(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            return false;
        }

        public boolean u2(ICustomTabsCallback iCustomTabsCallback, Uri uri) {
            return false;
        }

        public boolean y0(ICustomTabsCallback iCustomTabsCallback, Uri uri, int i2, Bundle bundle) {
            return false;
        }
    }

    public static class PendingSession {
    }
}
