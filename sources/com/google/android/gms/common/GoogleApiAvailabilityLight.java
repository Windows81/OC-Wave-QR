package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.common.zzd;

public class GoogleApiAvailabilityLight {

    /* renamed from: a  reason: collision with root package name */
    public static final int f24392a = GooglePlayServicesUtilLight.f24398a;

    /* renamed from: b  reason: collision with root package name */
    public static final GoogleApiAvailabilityLight f24393b = new GoogleApiAvailabilityLight();

    public static GoogleApiAvailabilityLight h() {
        return f24393b;
    }

    public void a(Context context) {
        GooglePlayServicesUtilLight.a(context);
    }

    public int b(Context context) {
        return GooglePlayServicesUtilLight.c(context);
    }

    public Intent c(int i2) {
        return d((Context) null, i2, (String) null);
    }

    public Intent d(Context context, int i2, String str) {
        if (i2 == 1 || i2 == 2) {
            if (context == null || !DeviceProperties.d(context)) {
                StringBuilder sb = new StringBuilder();
                sb.append("gcore_");
                sb.append(f24392a);
                sb.append("-");
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                }
                sb.append("-");
                if (context != null) {
                    sb.append(context.getPackageName());
                }
                sb.append("-");
                if (context != null) {
                    try {
                        sb.append(Wrappers.a(context).d(context.getPackageName(), 0).versionCode);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                String sb2 = sb.toString();
                Intent intent = new Intent("android.intent.action.VIEW");
                Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
                if (!TextUtils.isEmpty(sb2)) {
                    appendQueryParameter.appendQueryParameter("pcampaignid", sb2);
                }
                intent.setData(appendQueryParameter.build());
                intent.setPackage("com.android.vending");
                intent.addFlags(524288);
                return intent;
            }
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        } else if (i2 != 3) {
            return null;
        } else {
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", (String) null);
            Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent3.setData(fromParts);
            return intent3;
        }
    }

    public PendingIntent e(Context context, int i2, int i3) {
        return f(context, i2, i3, (String) null);
    }

    public PendingIntent f(Context context, int i2, int i3, String str) {
        Intent d2 = d(context, i2, str);
        if (d2 == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i3, d2, zzd.f25285a | 134217728);
    }

    public String g(int i2) {
        return GooglePlayServicesUtilLight.d(i2);
    }

    public int i(Context context) {
        return j(context, f24392a);
    }

    public int j(Context context, int i2) {
        int h2 = GooglePlayServicesUtilLight.h(context, i2);
        if (GooglePlayServicesUtilLight.i(context, h2)) {
            return 18;
        }
        return h2;
    }

    public boolean k(Context context, int i2) {
        return GooglePlayServicesUtilLight.i(context, i2);
    }

    public boolean l(Context context, String str) {
        return GooglePlayServicesUtilLight.m(context, str);
    }

    public boolean m(int i2) {
        return GooglePlayServicesUtilLight.k(i2);
    }

    public void n(Context context, int i2) {
        GooglePlayServicesUtilLight.b(context, i2);
    }
}
