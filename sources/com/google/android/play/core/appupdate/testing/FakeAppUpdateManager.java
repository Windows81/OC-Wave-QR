package com.google.android.play.core.appupdate.testing;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateOptions;
import com.google.android.play.core.appupdate.zzc;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import java.util.HashMap;
import java.util.List;

public class FakeAppUpdateManager implements AppUpdateManager {

    /* renamed from: a  reason: collision with root package name */
    public final zzc f27458a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f27459b;

    /* renamed from: c  reason: collision with root package name */
    public final List f27460c;

    /* renamed from: d  reason: collision with root package name */
    public int f27461d;

    /* renamed from: e  reason: collision with root package name */
    public int f27462e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f27463f;

    /* renamed from: g  reason: collision with root package name */
    public int f27464g;

    /* renamed from: h  reason: collision with root package name */
    public Integer f27465h;

    /* renamed from: i  reason: collision with root package name */
    public int f27466i;

    /* renamed from: j  reason: collision with root package name */
    public long f27467j;

    /* renamed from: k  reason: collision with root package name */
    public long f27468k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f27469l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f27470m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f27471n;

    /* renamed from: o  reason: collision with root package name */
    public Integer f27472o;

    public static int f() {
        return 67108864;
    }

    public boolean a(AppUpdateInfo appUpdateInfo, ActivityResultLauncher activityResultLauncher, AppUpdateOptions appUpdateOptions) {
        return i(appUpdateInfo, appUpdateOptions);
    }

    public Task b() {
        if (this.f27462e != 0) {
            return Tasks.d(new InstallException(this.f27462e));
        }
        int i2 = this.f27461d;
        if (i2 != 11) {
            return i2 == 3 ? Tasks.d(new InstallException(-8)) : Tasks.d(new InstallException(-7));
        }
        this.f27461d = 3;
        this.f27471n = true;
        Integer num = 0;
        if (num.equals(this.f27472o)) {
            h();
        }
        return Tasks.e((Object) null);
    }

    public Task c() {
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        PendingIntent pendingIntent3;
        PendingIntent pendingIntent4;
        PendingIntent pendingIntent5;
        PendingIntent pendingIntent6;
        if (this.f27462e != 0) {
            return Tasks.d(new InstallException(this.f27462e));
        }
        if (g() == 2) {
            if (this.f27460c.contains(0)) {
                pendingIntent6 = PendingIntent.getBroadcast(this.f27459b, 0, new Intent(), f());
                pendingIntent5 = PendingIntent.getBroadcast(this.f27459b, 0, new Intent(), f());
            } else {
                pendingIntent6 = null;
                pendingIntent5 = null;
            }
            if (this.f27460c.contains(1)) {
                PendingIntent broadcast = PendingIntent.getBroadcast(this.f27459b, 0, new Intent(), f());
                pendingIntent3 = pendingIntent6;
                pendingIntent2 = PendingIntent.getBroadcast(this.f27459b, 0, new Intent(), f());
                pendingIntent4 = broadcast;
            } else {
                pendingIntent3 = pendingIntent6;
                pendingIntent4 = null;
                pendingIntent2 = null;
            }
            pendingIntent = pendingIntent5;
        } else {
            pendingIntent4 = null;
            pendingIntent3 = null;
            pendingIntent2 = null;
            pendingIntent = null;
        }
        String packageName = this.f27459b.getPackageName();
        int i2 = this.f27464g;
        int g2 = g();
        int i3 = this.f27461d;
        Integer num = this.f27465h;
        int i4 = this.f27466i;
        long j2 = this.f27467j;
        long j3 = this.f27468k;
        HashMap hashMap = r1;
        HashMap hashMap2 = new HashMap();
        return Tasks.e(AppUpdateInfo.e(packageName, i2, g2, i3, num, i4, j2, j3, 0, 0, pendingIntent4, pendingIntent3, pendingIntent2, pendingIntent, hashMap));
    }

    public void d(InstallStateUpdatedListener installStateUpdatedListener) {
        this.f27458a.b(installStateUpdatedListener);
    }

    public final Task e(AppUpdateInfo appUpdateInfo, Activity activity, AppUpdateOptions appUpdateOptions) {
        return i(appUpdateInfo, appUpdateOptions) ? Tasks.e(-1) : Tasks.d(new InstallException(-6));
    }

    public final int g() {
        if (!this.f27463f) {
            return 1;
        }
        int i2 = this.f27461d;
        return (i2 == 0 || i2 == 4 || i2 == 5 || i2 == 6) ? 2 : 3;
    }

    public final void h() {
        this.f27458a.c(InstallState.f(this.f27461d, this.f27467j, this.f27468k, this.f27462e, this.f27459b.getPackageName()));
    }

    public final boolean i(AppUpdateInfo appUpdateInfo, AppUpdateOptions appUpdateOptions) {
        if (!appUpdateInfo.b(appUpdateOptions) && (!AppUpdateOptions.c(appUpdateOptions.b()).equals(appUpdateOptions) || !appUpdateInfo.a(appUpdateOptions.b()))) {
            return false;
        }
        if (appUpdateOptions.b() == 1) {
            this.f27470m = true;
            this.f27472o = 1;
        } else {
            this.f27469l = true;
            this.f27472o = 0;
        }
        return true;
    }
}
