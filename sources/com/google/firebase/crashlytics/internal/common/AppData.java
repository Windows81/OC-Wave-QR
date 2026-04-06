package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;
import java.util.List;

public class AppData {

    /* renamed from: a  reason: collision with root package name */
    public final String f29934a;

    /* renamed from: b  reason: collision with root package name */
    public final String f29935b;

    /* renamed from: c  reason: collision with root package name */
    public final List f29936c;

    /* renamed from: d  reason: collision with root package name */
    public final String f29937d;

    /* renamed from: e  reason: collision with root package name */
    public final String f29938e;

    /* renamed from: f  reason: collision with root package name */
    public final String f29939f;

    /* renamed from: g  reason: collision with root package name */
    public final String f29940g;

    /* renamed from: h  reason: collision with root package name */
    public final DevelopmentPlatformProvider f29941h;

    public AppData(String str, String str2, List list, String str3, String str4, String str5, String str6, DevelopmentPlatformProvider developmentPlatformProvider) {
        this.f29934a = str;
        this.f29935b = str2;
        this.f29936c = list;
        this.f29937d = str3;
        this.f29938e = str4;
        this.f29939f = str5;
        this.f29940g = str6;
        this.f29941h = developmentPlatformProvider;
    }

    public static AppData a(Context context, IdManager idManager, String str, String str2, List list, DevelopmentPlatformProvider developmentPlatformProvider) {
        String packageName = context.getPackageName();
        String g2 = idManager.g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String b2 = b(packageInfo);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new AppData(str, str2, list, g2, packageName, b2, str3, developmentPlatformProvider);
    }

    public static String b(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
    }
}
