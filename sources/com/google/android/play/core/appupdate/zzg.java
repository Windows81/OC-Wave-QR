package com.google.android.play.core.appupdate;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.IntentSenderRequest;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.install.InstallStateUpdatedListener;

final class zzg implements AppUpdateManager {

    /* renamed from: a  reason: collision with root package name */
    public final zzr f27477a;

    /* renamed from: b  reason: collision with root package name */
    public final zzc f27478b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f27479c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f27480d = new Handler(Looper.getMainLooper());

    public zzg(zzr zzr, zzc zzc, Context context) {
        this.f27477a = zzr;
        this.f27478b = zzc;
        this.f27479c = context;
    }

    public final boolean a(AppUpdateInfo appUpdateInfo, ActivityResultLauncher activityResultLauncher, AppUpdateOptions appUpdateOptions) {
        if (appUpdateInfo == null || activityResultLauncher == null || appUpdateOptions == null || !appUpdateInfo.b(appUpdateOptions) || appUpdateInfo.g()) {
            return false;
        }
        appUpdateInfo.f();
        activityResultLauncher.a(new IntentSenderRequest.Builder(appUpdateInfo.d(appUpdateOptions).getIntentSender()).a());
        return true;
    }

    public final Task b() {
        return this.f27477a.d(this.f27479c.getPackageName());
    }

    public final Task c() {
        return this.f27477a.e(this.f27479c.getPackageName());
    }

    public final synchronized void d(InstallStateUpdatedListener installStateUpdatedListener) {
        this.f27478b.b(installStateUpdatedListener);
    }

    public final Task e(AppUpdateInfo appUpdateInfo, Activity activity, AppUpdateOptions appUpdateOptions) {
        if (appUpdateInfo == null || activity == null || appUpdateOptions == null || appUpdateInfo.g()) {
            return Tasks.d(new InstallException(-4));
        }
        if (!appUpdateInfo.b(appUpdateOptions)) {
            return Tasks.d(new InstallException(-6));
        }
        appUpdateInfo.f();
        Intent intent = new Intent(activity, PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", appUpdateInfo.d(appUpdateOptions));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        intent.putExtra("result_receiver", new zze(this, this.f27480d, taskCompletionSource));
        activity.startActivity(intent);
        return taskCompletionSource.a();
    }
}
