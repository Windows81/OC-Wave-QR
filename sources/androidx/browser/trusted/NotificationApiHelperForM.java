package androidx.browser.trusted;

import android.app.NotificationManager;
import android.os.Parcelable;

public class NotificationApiHelperForM {
    public static Parcelable[] a(NotificationManager notificationManager) {
        return notificationManager.getActiveNotifications();
    }
}
