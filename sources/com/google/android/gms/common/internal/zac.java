package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import androidx.core.os.ConfigurationCompat;
import com.google.android.gms.base.R;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Locale;

public final class zac {

    /* renamed from: a  reason: collision with root package name */
    public static final SimpleArrayMap f24927a = new SimpleArrayMap();

    /* renamed from: b  reason: collision with root package name */
    public static Locale f24928b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return Wrappers.a(context).c(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i2) {
        Resources resources = context.getResources();
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? resources.getString(17039370) : resources.getString(R.string.f24355a) : resources.getString(R.string.f24364j) : resources.getString(R.string.f24358d);
    }

    public static String c(Context context, int i2) {
        Resources resources = context.getResources();
        String a2 = a(context);
        if (i2 == 1) {
            return resources.getString(R.string.f24359e, new Object[]{a2});
        }
        if (i2 == 2) {
            return DeviceProperties.d(context) ? resources.getString(R.string.f24368n) : resources.getString(R.string.f24365k, new Object[]{a2});
        }
        if (i2 == 3) {
            return resources.getString(R.string.f24356b, new Object[]{a2});
        }
        if (i2 == 5) {
            return g(context, "common_google_play_services_invalid_account_text", a2);
        }
        if (i2 == 7) {
            return g(context, "common_google_play_services_network_error_text", a2);
        }
        if (i2 == 9) {
            return resources.getString(R.string.f24363i, new Object[]{a2});
        }
        if (i2 == 20) {
            return g(context, "common_google_play_services_restricted_profile_text", a2);
        }
        switch (i2) {
            case 16:
                return g(context, "common_google_play_services_api_unavailable_text", a2);
            case 17:
                return g(context, "common_google_play_services_sign_in_failed_text", a2);
            case 18:
                return resources.getString(R.string.f24367m, new Object[]{a2});
            default:
                return resources.getString(com.google.android.gms.common.R.string.f24406a, new Object[]{a2});
        }
    }

    public static String d(Context context, int i2) {
        return (i2 == 6 || i2 == 19) ? g(context, "common_google_play_services_resolution_required_text", a(context)) : c(context, i2);
    }

    public static String e(Context context, int i2) {
        String h2 = i2 == 6 ? h(context, "common_google_play_services_resolution_required_title") : f(context, i2);
        return h2 == null ? context.getResources().getString(R.string.f24362h) : h2;
    }

    public static String f(Context context, int i2) {
        Resources resources = context.getResources();
        switch (i2) {
            case 1:
                return resources.getString(R.string.f24360f);
            case 2:
                return resources.getString(R.string.f24366l);
            case 3:
                return resources.getString(R.string.f24357c);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return h(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return h(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return h(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return h(context, "common_google_play_services_restricted_profile_title");
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i2);
                return null;
        }
    }

    public static String g(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String h2 = h(context, str);
        if (h2 == null) {
            h2 = resources.getString(com.google.android.gms.common.R.string.f24406a);
        }
        return String.format(resources.getConfiguration().locale, h2, new Object[]{str2});
    }

    public static String h(Context context, String str) {
        SimpleArrayMap simpleArrayMap = f24927a;
        synchronized (simpleArrayMap) {
            try {
                Locale d2 = ConfigurationCompat.a(context.getResources().getConfiguration()).d(0);
                if (!d2.equals(f24928b)) {
                    simpleArrayMap.clear();
                    f24928b = d2;
                }
                String str2 = (String) simpleArrayMap.get(str);
                if (str2 != null) {
                    return str2;
                }
                Resources f2 = GooglePlayServicesUtil.f(context);
                if (f2 == null) {
                    return null;
                }
                int identifier = f2.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    Log.w("GoogleApiAvailability", "Missing resource: " + str);
                    return null;
                }
                String string = f2.getString(identifier);
                if (TextUtils.isEmpty(string)) {
                    Log.w("GoogleApiAvailability", "Got empty resource: " + str);
                    return null;
                }
                simpleArrayMap.put(str, string);
                return string;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
