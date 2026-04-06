package com.google.android.play.core.appupdate;

import android.app.PendingIntent;
import java.util.Map;

public class AppUpdateInfo {

    /* renamed from: a  reason: collision with root package name */
    public final String f27397a;

    /* renamed from: b  reason: collision with root package name */
    public final int f27398b;

    /* renamed from: c  reason: collision with root package name */
    public final int f27399c;

    /* renamed from: d  reason: collision with root package name */
    public final int f27400d;

    /* renamed from: e  reason: collision with root package name */
    public final Integer f27401e;

    /* renamed from: f  reason: collision with root package name */
    public final int f27402f;

    /* renamed from: g  reason: collision with root package name */
    public final long f27403g;

    /* renamed from: h  reason: collision with root package name */
    public final long f27404h;

    /* renamed from: i  reason: collision with root package name */
    public final long f27405i;

    /* renamed from: j  reason: collision with root package name */
    public final long f27406j;

    /* renamed from: k  reason: collision with root package name */
    public final PendingIntent f27407k;

    /* renamed from: l  reason: collision with root package name */
    public final PendingIntent f27408l;

    /* renamed from: m  reason: collision with root package name */
    public final PendingIntent f27409m;

    /* renamed from: n  reason: collision with root package name */
    public final PendingIntent f27410n;

    /* renamed from: o  reason: collision with root package name */
    public final Map f27411o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f27412p = false;

    public AppUpdateInfo(String str, int i2, int i3, int i4, Integer num, int i5, long j2, long j3, long j4, long j5, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4, Map map) {
        this.f27397a = str;
        this.f27398b = i2;
        this.f27399c = i3;
        this.f27400d = i4;
        this.f27401e = num;
        this.f27402f = i5;
        this.f27403g = j2;
        this.f27404h = j3;
        this.f27405i = j4;
        this.f27406j = j5;
        this.f27407k = pendingIntent;
        this.f27408l = pendingIntent2;
        this.f27409m = pendingIntent3;
        this.f27410n = pendingIntent4;
        this.f27411o = map;
    }

    public static AppUpdateInfo e(String str, int i2, int i3, int i4, Integer num, int i5, long j2, long j3, long j4, long j5, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4, Map map) {
        return new AppUpdateInfo(str, i2, i3, i4, num, i5, j2, j3, j4, j5, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4, map);
    }

    public boolean a(int i2) {
        return d(AppUpdateOptions.c(i2)) != null;
    }

    public boolean b(AppUpdateOptions appUpdateOptions) {
        return d(appUpdateOptions) != null;
    }

    public int c() {
        return this.f27399c;
    }

    public final PendingIntent d(AppUpdateOptions appUpdateOptions) {
        if (appUpdateOptions.b() == 0) {
            PendingIntent pendingIntent = this.f27408l;
            if (pendingIntent != null) {
                return pendingIntent;
            }
            if (h(appUpdateOptions)) {
                return this.f27410n;
            }
            return null;
        }
        if (appUpdateOptions.b() == 1) {
            PendingIntent pendingIntent2 = this.f27407k;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            if (h(appUpdateOptions)) {
                return this.f27409m;
            }
        }
        return null;
    }

    public final void f() {
        this.f27412p = true;
    }

    public final boolean g() {
        return this.f27412p;
    }

    public final boolean h(AppUpdateOptions appUpdateOptions) {
        return appUpdateOptions.a() && this.f27405i <= this.f27406j;
    }
}
