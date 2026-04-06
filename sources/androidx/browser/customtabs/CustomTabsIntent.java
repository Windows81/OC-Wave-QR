package androidx.browser.customtabs;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.browser.customtabs.CustomTabColorSchemeParams;
import androidx.core.content.ContextCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Locale;

public final class CustomTabsIntent {

    /* renamed from: a  reason: collision with root package name */
    public final Intent f1636a;

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f1637b;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ActivityHeightResizeBehavior {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ActivitySideSheetDecorationType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ActivitySideSheetPosition {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ActivitySideSheetRoundedCornersPosition {
    }

    public static class Api21Impl {
        public static Locale a(Intent intent) {
            String stringExtra = intent.getStringExtra("androidx.browser.customtabs.extra.TRANSLATE_LANGUAGE_TAG");
            if (stringExtra != null) {
                return Locale.forLanguageTag(stringExtra);
            }
            return null;
        }

        public static void b(Intent intent, Locale locale) {
            intent.putExtra("androidx.browser.customtabs.extra.TRANSLATE_LANGUAGE_TAG", locale.toLanguageTag());
        }
    }

    public static class Api23Impl {
        public static ActivityOptions a() {
            return ActivityOptions.makeBasic();
        }
    }

    public static class Api24Impl {
        public static String a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    public static class Api34Impl {
        public static void a(ActivityOptions activityOptions, boolean z2) {
            activityOptions.setShareIdentityEnabled(z2);
        }
    }

    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public final Intent f1638a = new Intent("android.intent.action.VIEW");

        /* renamed from: b  reason: collision with root package name */
        public final CustomTabColorSchemeParams.Builder f1639b = new CustomTabColorSchemeParams.Builder();

        /* renamed from: c  reason: collision with root package name */
        public ArrayList f1640c;

        /* renamed from: d  reason: collision with root package name */
        public ActivityOptions f1641d;

        /* renamed from: e  reason: collision with root package name */
        public ArrayList f1642e;

        /* renamed from: f  reason: collision with root package name */
        public SparseArray f1643f;

        /* renamed from: g  reason: collision with root package name */
        public Bundle f1644g;

        /* renamed from: h  reason: collision with root package name */
        public int f1645h = 0;

        /* renamed from: i  reason: collision with root package name */
        public boolean f1646i = true;

        /* renamed from: j  reason: collision with root package name */
        public boolean f1647j;

        public CustomTabsIntent a() {
            Bundle bundle = null;
            if (!this.f1638a.hasExtra("android.support.customtabs.extra.SESSION")) {
                c((IBinder) null, (PendingIntent) null);
            }
            ArrayList arrayList = this.f1640c;
            if (arrayList != null) {
                this.f1638a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList arrayList2 = this.f1642e;
            if (arrayList2 != null) {
                this.f1638a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f1638a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f1646i);
            this.f1638a.putExtras(this.f1639b.a().a());
            Bundle bundle2 = this.f1644g;
            if (bundle2 != null) {
                this.f1638a.putExtras(bundle2);
            }
            if (this.f1643f != null) {
                Bundle bundle3 = new Bundle();
                bundle3.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f1643f);
                this.f1638a.putExtras(bundle3);
            }
            this.f1638a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f1645h);
            int i2 = Build.VERSION.SDK_INT;
            b();
            if (i2 >= 34) {
                d();
            }
            ActivityOptions activityOptions = this.f1641d;
            if (activityOptions != null) {
                bundle = activityOptions.toBundle();
            }
            return new CustomTabsIntent(this.f1638a, bundle);
        }

        public final void b() {
            String a2 = Api24Impl.a();
            if (!TextUtils.isEmpty(a2)) {
                Bundle bundleExtra = this.f1638a.hasExtra("com.android.browser.headers") ? this.f1638a.getBundleExtra("com.android.browser.headers") : new Bundle();
                if (!bundleExtra.containsKey("Accept-Language")) {
                    bundleExtra.putString("Accept-Language", a2);
                    this.f1638a.putExtra("com.android.browser.headers", bundleExtra);
                }
            }
        }

        public final void c(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f1638a.putExtras(bundle);
        }

        public final void d() {
            if (this.f1641d == null) {
                this.f1641d = Api23Impl.a();
            }
            Api34Impl.a(this.f1641d, this.f1647j);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface CloseButtonPosition {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ColorScheme {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ShareState {
    }

    public CustomTabsIntent(Intent intent, Bundle bundle) {
        this.f1636a = intent;
        this.f1637b = bundle;
    }

    public void a(Context context, Uri uri) {
        this.f1636a.setData(uri);
        ContextCompat.m(context, this.f1636a, this.f1637b);
    }
}
