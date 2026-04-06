package androidx.core.app;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.v4.app.INotificationSideChannel;

public abstract class NotificationCompatSideChannelService extends Service {

    public class NotificationSideChannelStub extends INotificationSideChannel.Stub {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ NotificationCompatSideChannelService f19632l;

        public void I0(String str) {
            this.f19632l.c(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                this.f19632l.b(str);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        public void L1(String str, int i2, String str2) {
            this.f19632l.c(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                this.f19632l.a(str, i2, str2);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        public void M2(String str, int i2, String str2, Notification notification) {
            this.f19632l.c(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                this.f19632l.d(str, i2, str2, notification);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    public abstract void a(String str, int i2, String str2);

    public abstract void b(String str);

    public void c(int i2, String str) {
        String[] packagesForUid = getPackageManager().getPackagesForUid(i2);
        int length = packagesForUid.length;
        int i3 = 0;
        while (i3 < length) {
            if (!packagesForUid[i3].equals(str)) {
                i3++;
            } else {
                return;
            }
        }
        throw new SecurityException("NotificationSideChannelService: Uid " + i2 + " is not authorized for package " + str);
    }

    public abstract void d(String str, int i2, String str2, Notification notification);

    public IBinder onBind(Intent intent) {
        intent.getAction().equals("android.support.BIND_NOTIFICATION_SIDE_CHANNEL");
        return null;
    }
}
