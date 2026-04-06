package com.hansecom.abt.presentation.appUpdate;

import android.content.Context;
import androidx.activity.result.ActivityResultLauncher;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateManagerFactory;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

@Metadata
public final class AppUpdateHelper {

    /* renamed from: a  reason: collision with root package name */
    public final Context f34151a;

    /* renamed from: b  reason: collision with root package name */
    public final CoroutineScope f34152b = CoroutineScopeKt.a(Dispatchers.c());

    /* renamed from: c  reason: collision with root package name */
    public final AppUpdateManager f34153c;

    public AppUpdateHelper(Context context) {
        Intrinsics.i(context, "context");
        this.f34151a = context;
        AppUpdateManager a2 = AppUpdateManagerFactory.a(context);
        Intrinsics.h(a2, "create(...)");
        this.f34153c = a2;
    }

    public final void c() {
        this.f34153c.b();
    }

    public final void d() {
        Job unused = BuildersKt__Builders_commonKt.d(this.f34152b, (CoroutineContext) null, (CoroutineStart) null, new AppUpdateHelper$startHardUpdateFlow$1(this, (Continuation) null), 3, (Object) null);
    }

    public final void e(ActivityResultLauncher activityResultLauncher, InstallStateUpdatedListener installStateUpdatedListener) {
        Intrinsics.i(activityResultLauncher, "launcher");
        Job unused = BuildersKt__Builders_commonKt.d(this.f34152b, (CoroutineContext) null, (CoroutineStart) null, new AppUpdateHelper$startSoftUpdateFlow$1(installStateUpdatedListener, this, activityResultLauncher, (Continuation) null), 3, (Object) null);
    }
}
