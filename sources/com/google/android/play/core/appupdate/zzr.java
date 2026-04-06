package com.google.android.play.core.appupdate;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.appupdate.internal.zzab;
import com.google.android.play.core.appupdate.internal.zzi;
import com.google.android.play.core.appupdate.internal.zzm;
import com.google.android.play.core.appupdate.internal.zzs;
import com.google.android.play.core.appupdate.internal.zzx;
import com.google.android.play.core.appupdate.internal.zzz;
import com.google.android.play.core.install.InstallException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

final class zzr {

    /* renamed from: e  reason: collision with root package name */
    public static final zzm f27497e = new zzm("AppUpdateService");

    /* renamed from: f  reason: collision with root package name */
    public static final Intent f27498f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");

    /* renamed from: a  reason: collision with root package name */
    public zzx f27499a;

    /* renamed from: b  reason: collision with root package name */
    public final String f27500b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f27501c;

    /* renamed from: d  reason: collision with root package name */
    public final zzt f27502d;

    public zzr(Context context, zzt zzt) {
        this.f27500b = context.getPackageName();
        this.f27501c = context;
        this.f27502d = zzt;
        if (zzab.a(context)) {
            this.f27499a = new zzx(zzz.a(context), f27497e, "AppUpdateService", f27498f, zzl.f27487a, (zzs) null);
        }
    }

    public static /* bridge */ /* synthetic */ Bundle b(zzr zzr, String str) {
        Integer num;
        Bundle bundle = new Bundle();
        bundle.putAll(i());
        bundle.putString("package.name", str);
        try {
            num = Integer.valueOf(zzr.f27501c.getPackageManager().getPackageInfo(zzr.f27501c.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            f27497e.b("The current version of the app could not be retrieved", new Object[0]);
            num = null;
        }
        if (num != null) {
            bundle.putInt("app.version.code", num.intValue());
        }
        return bundle;
    }

    public static /* bridge */ /* synthetic */ AppUpdateInfo f(zzr zzr, Bundle bundle, String str) {
        Bundle bundle2 = bundle;
        int i2 = bundle2.getInt("version.code", -1);
        int i3 = bundle2.getInt("update.availability");
        int i4 = bundle2.getInt("install.status", 0);
        Integer valueOf = bundle2.getInt("client.version.staleness", -1) == -1 ? null : Integer.valueOf(bundle2.getInt("client.version.staleness"));
        int i5 = bundle2.getInt("in.app.update.priority", 0);
        long j2 = bundle2.getLong("bytes.downloaded");
        HashMap hashMap = r9;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("blocking.destructive.intent", k(bundle2.getIntegerArrayList("update.precondition.failures:blocking.destructive.intent")));
        hashMap2.put("nonblocking.destructive.intent", k(bundle2.getIntegerArrayList("update.precondition.failures:nonblocking.destructive.intent")));
        hashMap2.put("blocking.intent", k(bundle2.getIntegerArrayList("update.precondition.failures:blocking.intent")));
        hashMap2.put("nonblocking.intent", k(bundle2.getIntegerArrayList("update.precondition.failures:nonblocking.intent")));
        return AppUpdateInfo.e(str, i2, i3, i4, valueOf, i5, j2, bundle2.getLong("total.bytes.to.download"), bundle2.getLong("additional.size.required"), zzr.f27502d.a(), (PendingIntent) bundle2.getParcelable("blocking.intent"), (PendingIntent) bundle2.getParcelable("nonblocking.intent"), (PendingIntent) bundle2.getParcelable("blocking.destructive.intent"), (PendingIntent) bundle2.getParcelable("nonblocking.destructive.intent"), hashMap);
    }

    public static Bundle i() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        Map a2 = zzi.a("app_update");
        bundle2.putInt("playcore_version_code", ((Integer) a2.get("java")).intValue());
        if (a2.containsKey("native")) {
            bundle2.putInt("playcore_native_version", ((Integer) a2.get("native")).intValue());
        }
        if (a2.containsKey("unity")) {
            bundle2.putInt("playcore_unity_version", ((Integer) a2.get("unity")).intValue());
        }
        bundle.putAll(bundle2);
        bundle.putInt("playcore.version.code", 11004);
        return bundle;
    }

    public static Task j() {
        f27497e.b("onError(%d)", -9);
        return Tasks.d(new InstallException(-9));
    }

    public static HashSet k(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        if (arrayList != null) {
            hashSet.addAll(arrayList);
        }
        return hashSet;
    }

    public final Task d(String str) {
        if (this.f27499a == null) {
            return j();
        }
        f27497e.d("completeUpdate(%s)", str);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f27499a.s(new zzn(this, taskCompletionSource, taskCompletionSource, str), taskCompletionSource);
        return taskCompletionSource.a();
    }

    public final Task e(String str) {
        if (this.f27499a == null) {
            return j();
        }
        f27497e.d("requestUpdateInfo(%s)", str);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f27499a.s(new zzm(this, taskCompletionSource, str, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.a();
    }
}
