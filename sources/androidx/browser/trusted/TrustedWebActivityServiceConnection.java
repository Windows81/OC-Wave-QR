package androidx.browser.trusted;

import android.app.Notification;
import android.content.ComponentName;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.customtabs.trusted.ITrustedWebActivityCallback;
import android.support.customtabs.trusted.ITrustedWebActivityService;

public final class TrustedWebActivityServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final ITrustedWebActivityService f1702a;

    /* renamed from: b  reason: collision with root package name */
    public final ComponentName f1703b;

    /* renamed from: androidx.browser.trusted.TrustedWebActivityServiceConnection$1  reason: invalid class name */
    class AnonymousClass1 extends ITrustedWebActivityCallback.Stub {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ TrustedWebActivityCallback f1704l;

        public void J2(String str, Bundle bundle) {
            this.f1704l.a(str, bundle);
        }
    }

    public static class ActiveNotificationsArgs {

        /* renamed from: a  reason: collision with root package name */
        public final Parcelable[] f1705a;

        public ActiveNotificationsArgs(Parcelable[] parcelableArr) {
            this.f1705a = parcelableArr;
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS", this.f1705a);
            return bundle;
        }
    }

    public static class CancelNotificationArgs {

        /* renamed from: a  reason: collision with root package name */
        public final String f1706a;

        /* renamed from: b  reason: collision with root package name */
        public final int f1707b;

        public CancelNotificationArgs(String str, int i2) {
            this.f1706a = str;
            this.f1707b = i2;
        }

        public static CancelNotificationArgs a(Bundle bundle) {
            TrustedWebActivityServiceConnection.a(bundle, "android.support.customtabs.trusted.PLATFORM_TAG");
            TrustedWebActivityServiceConnection.a(bundle, "android.support.customtabs.trusted.PLATFORM_ID");
            return new CancelNotificationArgs(bundle.getString("android.support.customtabs.trusted.PLATFORM_TAG"), bundle.getInt("android.support.customtabs.trusted.PLATFORM_ID"));
        }
    }

    public static class NotificationsEnabledArgs {

        /* renamed from: a  reason: collision with root package name */
        public final String f1708a;

        public NotificationsEnabledArgs(String str) {
            this.f1708a = str;
        }

        public static NotificationsEnabledArgs a(Bundle bundle) {
            TrustedWebActivityServiceConnection.a(bundle, "android.support.customtabs.trusted.CHANNEL_NAME");
            return new NotificationsEnabledArgs(bundle.getString("android.support.customtabs.trusted.CHANNEL_NAME"));
        }
    }

    public static class NotifyNotificationArgs {

        /* renamed from: a  reason: collision with root package name */
        public final String f1709a;

        /* renamed from: b  reason: collision with root package name */
        public final int f1710b;

        /* renamed from: c  reason: collision with root package name */
        public final Notification f1711c;

        /* renamed from: d  reason: collision with root package name */
        public final String f1712d;

        public NotifyNotificationArgs(String str, int i2, Notification notification, String str2) {
            this.f1709a = str;
            this.f1710b = i2;
            this.f1711c = notification;
            this.f1712d = str2;
        }

        public static NotifyNotificationArgs a(Bundle bundle) {
            TrustedWebActivityServiceConnection.a(bundle, "android.support.customtabs.trusted.PLATFORM_TAG");
            TrustedWebActivityServiceConnection.a(bundle, "android.support.customtabs.trusted.PLATFORM_ID");
            TrustedWebActivityServiceConnection.a(bundle, "android.support.customtabs.trusted.NOTIFICATION");
            TrustedWebActivityServiceConnection.a(bundle, "android.support.customtabs.trusted.CHANNEL_NAME");
            return new NotifyNotificationArgs(bundle.getString("android.support.customtabs.trusted.PLATFORM_TAG"), bundle.getInt("android.support.customtabs.trusted.PLATFORM_ID"), (Notification) bundle.getParcelable("android.support.customtabs.trusted.NOTIFICATION"), bundle.getString("android.support.customtabs.trusted.CHANNEL_NAME"));
        }
    }

    public static class ResultArgs {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f1713a;

        public ResultArgs(boolean z2) {
            this.f1713a = z2;
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS", this.f1713a);
            return bundle;
        }
    }

    public TrustedWebActivityServiceConnection(ITrustedWebActivityService iTrustedWebActivityService, ComponentName componentName) {
        this.f1702a = iTrustedWebActivityService;
        this.f1703b = componentName;
    }

    public static void a(Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            throw new IllegalArgumentException("Bundle must contain " + str);
        }
    }
}
