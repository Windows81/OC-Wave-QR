package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import androidx.collection.SimpleArrayMap;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.NoSuchElementException;

public abstract class CustomTabsService extends Service {

    /* renamed from: A  reason: collision with root package name */
    public ICustomTabsService.Stub f1648A;

    /* renamed from: z  reason: collision with root package name */
    public final SimpleArrayMap f1649z;

    /* renamed from: androidx.browser.customtabs.CustomTabsService$1  reason: invalid class name */
    public class AnonymousClass1 extends ICustomTabsService.Stub {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ CustomTabsService f1650l;

        public int N1(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) {
            return this.f1650l.f(new CustomTabsSessionToken(iCustomTabsCallback, P(bundle)), str, bundle);
        }

        public final PendingIntent P(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("android.support.customtabs.extra.SESSION_ID");
            bundle.remove("android.support.customtabs.extra.SESSION_ID");
            return pendingIntent;
        }

        public boolean Q2(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            return this.f1650l.c(new CustomTabsSessionToken(iCustomTabsCallback, P(bundle)), bundle);
        }

        public Bundle T0(String str, Bundle bundle) {
            return this.f1650l.b(str, bundle);
        }

        public boolean T1(ICustomTabsCallback iCustomTabsCallback) {
            return X2(iCustomTabsCallback, (PendingIntent) null);
        }

        public boolean U1(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle) {
            return this.f1650l.i(new CustomTabsSessionToken(iCustomTabsCallback, P(bundle)), uri, u1(bundle), bundle);
        }

        public final /* synthetic */ void W2(CustomTabsSessionToken customTabsSessionToken) {
            this.f1650l.a(customTabsSessionToken);
        }

        public boolean X1(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            return X2(iCustomTabsCallback, P(bundle));
        }

        public final boolean X2(ICustomTabsCallback iCustomTabsCallback, PendingIntent pendingIntent) {
            CustomTabsSessionToken customTabsSessionToken = new CustomTabsSessionToken(iCustomTabsCallback, pendingIntent);
            try {
                a aVar = new a(this, customTabsSessionToken);
                synchronized (this.f1650l.f1649z) {
                    iCustomTabsCallback.asBinder().linkToDeath(aVar, 0);
                    this.f1650l.f1649z.put(iCustomTabsCallback.asBinder(), aVar);
                }
                return this.f1650l.e(customTabsSessionToken);
            } catch (RemoteException unused) {
                return false;
            }
        }

        public boolean g0(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle, List list) {
            return this.f1650l.d(new CustomTabsSessionToken(iCustomTabsCallback, P(bundle)), uri, bundle, list);
        }

        public boolean g2(ICustomTabsCallback iCustomTabsCallback, IBinder iBinder, Bundle bundle) {
            return this.f1650l.j(new CustomTabsSessionToken(iCustomTabsCallback, P(bundle)), EngagementSignalsCallbackRemote.a(iBinder), bundle);
        }

        public boolean i1(long j2) {
            return this.f1650l.m(j2);
        }

        public boolean l0(ICustomTabsCallback iCustomTabsCallback, int i2, Uri uri, Bundle bundle) {
            return this.f1650l.l(new CustomTabsSessionToken(iCustomTabsCallback, P(bundle)), i2, uri, bundle);
        }

        public boolean l2(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            return this.f1650l.k(new CustomTabsSessionToken(iCustomTabsCallback, P(bundle)), bundle);
        }

        public final Uri u1(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            return Build.VERSION.SDK_INT >= 33 ? (Uri) Api33Impl.a(bundle, "target_origin", Uri.class) : (Uri) bundle.getParcelable("target_origin");
        }

        public boolean u2(ICustomTabsCallback iCustomTabsCallback, Uri uri) {
            return this.f1650l.i(new CustomTabsSessionToken(iCustomTabsCallback, (PendingIntent) null), uri, (Uri) null, new Bundle());
        }

        public boolean y0(ICustomTabsCallback iCustomTabsCallback, Uri uri, int i2, Bundle bundle) {
            return this.f1650l.g(new CustomTabsSessionToken(iCustomTabsCallback, P(bundle)), uri, i2, bundle);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FilePurpose {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Relation {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Result {
    }

    public boolean a(CustomTabsSessionToken customTabsSessionToken) {
        try {
            synchronized (this.f1649z) {
                IBinder a2 = customTabsSessionToken.a();
                if (a2 == null) {
                    return false;
                }
                a2.unlinkToDeath((IBinder.DeathRecipient) this.f1649z.get(a2), 0);
                this.f1649z.remove(a2);
                return true;
            }
        } catch (NoSuchElementException unused) {
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract Bundle b(String str, Bundle bundle);

    public boolean c(CustomTabsSessionToken customTabsSessionToken, Bundle bundle) {
        return false;
    }

    public abstract boolean d(CustomTabsSessionToken customTabsSessionToken, Uri uri, Bundle bundle, List list);

    public abstract boolean e(CustomTabsSessionToken customTabsSessionToken);

    public abstract int f(CustomTabsSessionToken customTabsSessionToken, String str, Bundle bundle);

    public abstract boolean g(CustomTabsSessionToken customTabsSessionToken, Uri uri, int i2, Bundle bundle);

    public abstract boolean h(CustomTabsSessionToken customTabsSessionToken, Uri uri);

    public boolean i(CustomTabsSessionToken customTabsSessionToken, Uri uri, Uri uri2, Bundle bundle) {
        return h(customTabsSessionToken, uri);
    }

    public boolean j(CustomTabsSessionToken customTabsSessionToken, EngagementSignalsCallback engagementSignalsCallback, Bundle bundle) {
        return false;
    }

    public abstract boolean k(CustomTabsSessionToken customTabsSessionToken, Bundle bundle);

    public abstract boolean l(CustomTabsSessionToken customTabsSessionToken, int i2, Uri uri, Bundle bundle);

    public abstract boolean m(long j2);

    public IBinder onBind(Intent intent) {
        return this.f1648A;
    }
}
