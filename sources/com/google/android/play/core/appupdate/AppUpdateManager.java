package com.google.android.play.core.appupdate;

import android.app.Activity;
import androidx.activity.result.ActivityResultLauncher;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.install.InstallStateUpdatedListener;

public interface AppUpdateManager {
    boolean a(AppUpdateInfo appUpdateInfo, ActivityResultLauncher activityResultLauncher, AppUpdateOptions appUpdateOptions);

    Task b();

    Task c();

    void d(InstallStateUpdatedListener installStateUpdatedListener);

    Task e(AppUpdateInfo appUpdateInfo, Activity activity, AppUpdateOptions appUpdateOptions);
}
