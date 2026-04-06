package androidx.browser.trusted;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.BitmapFactory;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.support.customtabs.trusted.ITrustedWebActivityService;
import androidx.browser.trusted.TrustedWebActivityServiceConnection;
import androidx.core.app.NotificationManagerCompat;
import java.util.Locale;

public abstract class TrustedWebActivityService extends Service {

    /* renamed from: A  reason: collision with root package name */
    public int f1698A;

    /* renamed from: B  reason: collision with root package name */
    public final ITrustedWebActivityService.Stub f1699B;

    /* renamed from: z  reason: collision with root package name */
    public NotificationManager f1700z;

    /* renamed from: androidx.browser.trusted.TrustedWebActivityService$1  reason: invalid class name */
    public class AnonymousClass1 extends ITrustedWebActivityService.Stub {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ TrustedWebActivityService f1701l;

        public int I1() {
            N();
            return this.f1701l.i();
        }

        public Bundle K1() {
            N();
            return this.f1701l.h();
        }

        public Bundle M1(Bundle bundle) {
            N();
            return new TrustedWebActivityServiceConnection.ResultArgs(this.f1701l.d(TrustedWebActivityServiceConnection.NotificationsEnabledArgs.a(bundle).f1708a)).a();
        }

        public final void N() {
            TrustedWebActivityService trustedWebActivityService = this.f1701l;
            if (trustedWebActivityService.f1698A == -1) {
                String[] packagesForUid = trustedWebActivityService.getPackageManager().getPackagesForUid(Binder.getCallingUid());
                int i2 = 0;
                if (packagesForUid == null) {
                    packagesForUid = new String[0];
                }
                Token a2 = this.f1701l.c().a();
                PackageManager packageManager = this.f1701l.getPackageManager();
                if (a2 != null) {
                    int length = packagesForUid.length;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (a2.a(packagesForUid[i2], packageManager)) {
                            this.f1701l.f1698A = Binder.getCallingUid();
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
            if (this.f1701l.f1698A != Binder.getCallingUid()) {
                throw new SecurityException("Caller is not verified as Trusted Web Activity provider.");
            }
        }

        public Bundle Z0(String str, Bundle bundle, IBinder iBinder) {
            N();
            return this.f1701l.f(str, bundle, TrustedWebActivityCallbackRemote.a(iBinder));
        }

        public void d2(Bundle bundle) {
            N();
            TrustedWebActivityServiceConnection.CancelNotificationArgs a2 = TrustedWebActivityServiceConnection.CancelNotificationArgs.a(bundle);
            this.f1701l.e(a2.f1706a, a2.f1707b);
        }

        public Bundle h2(Bundle bundle) {
            N();
            TrustedWebActivityServiceConnection.NotifyNotificationArgs a2 = TrustedWebActivityServiceConnection.NotifyNotificationArgs.a(bundle);
            return new TrustedWebActivityServiceConnection.ResultArgs(this.f1701l.j(a2.f1709a, a2.f1710b, a2.f1711c, a2.f1712d)).a();
        }

        public Bundle q0() {
            N();
            return new TrustedWebActivityServiceConnection.ActiveNotificationsArgs(this.f1701l.g()).a();
        }
    }

    public static String a(String str) {
        return str.toLowerCase(Locale.ROOT).replace(' ', '_') + "_channel_id";
    }

    public final void b() {
        if (this.f1700z == null) {
            throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
        }
    }

    public abstract TokenStore c();

    public boolean d(String str) {
        b();
        if (!NotificationManagerCompat.b(this).a()) {
            return false;
        }
        return NotificationApiHelperForO.b(this.f1700z, a(str));
    }

    public void e(String str, int i2) {
        b();
        this.f1700z.cancel(str, i2);
    }

    public Bundle f(String str, Bundle bundle, TrustedWebActivityCallbackRemote trustedWebActivityCallbackRemote) {
        return null;
    }

    public Parcelable[] g() {
        b();
        return NotificationApiHelperForM.a(this.f1700z);
    }

    public Bundle h() {
        int i2 = i();
        Bundle bundle = new Bundle();
        if (i2 == -1) {
            return bundle;
        }
        bundle.putParcelable("android.support.customtabs.trusted.SMALL_ICON_BITMAP", BitmapFactory.decodeResource(getResources(), i2));
        return bundle;
    }

    public int i() {
        try {
            Bundle bundle = getPackageManager().getServiceInfo(new ComponentName(this, getClass()), 128).metaData;
            if (bundle == null) {
                return -1;
            }
            return bundle.getInt("android.support.customtabs.trusted.SMALL_ICON", -1);
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    public boolean j(String str, int i2, Notification notification, String str2) {
        b();
        if (!NotificationManagerCompat.b(this).a()) {
            return false;
        }
        String a2 = a(str2);
        Notification a3 = NotificationApiHelperForO.a(this, this.f1700z, notification, a2, str2);
        if (!NotificationApiHelperForO.b(this.f1700z, a2)) {
            return false;
        }
        this.f1700z.notify(str, i2, a3);
        return true;
    }

    public final IBinder onBind(Intent intent) {
        return this.f1699B;
    }

    public void onCreate() {
        super.onCreate();
        this.f1700z = (NotificationManager) getSystemService("notification");
    }

    public final boolean onUnbind(Intent intent) {
        this.f1698A = -1;
        return super.onUnbind(intent);
    }
}
