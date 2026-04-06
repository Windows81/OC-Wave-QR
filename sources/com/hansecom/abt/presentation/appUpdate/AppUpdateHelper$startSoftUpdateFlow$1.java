package com.hansecom.abt.presentation.appUpdate;

import androidx.activity.result.ActivityResultLauncher;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateOptions;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.tasks.TasksKt;
import timber.log.Timber;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.appUpdate.AppUpdateHelper$startSoftUpdateFlow$1", f = "AppUpdateHelper.kt", l = {41}, m = "invokeSuspend")
public final class AppUpdateHelper$startSoftUpdateFlow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ InstallStateUpdatedListener E;
    public final /* synthetic */ AppUpdateHelper F;
    public final /* synthetic */ ActivityResultLauncher G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppUpdateHelper$startSoftUpdateFlow$1(InstallStateUpdatedListener installStateUpdatedListener, AppUpdateHelper appUpdateHelper, ActivityResultLauncher activityResultLauncher, Continuation continuation) {
        super(2, continuation);
        this.E = installStateUpdatedListener;
        this.F = appUpdateHelper;
        this.G = activityResultLauncher;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AppUpdateHelper$startSoftUpdateFlow$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new AppUpdateHelper$startSoftUpdateFlow$1(this.E, this.F, this.G, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            if (this.E != null) {
                this.F.f34153c.d(this.E);
            }
            Task c2 = this.F.f34153c.c();
            Intrinsics.h(c2, "getAppUpdateInfo(...)");
            this.D = 1;
            obj = TasksKt.a(c2, this);
            if (obj == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            try {
                ResultKt.b(obj);
            } catch (Throwable th) {
                Timber.f44337a.c(th);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AppUpdateInfo appUpdateInfo = (AppUpdateInfo) obj;
        int c3 = appUpdateInfo.c();
        if (c3 != 2) {
            if (c3 != 3) {
                throw new RuntimeException("App update requested from config, but not found in Google Play.");
            }
        }
        this.F.f34153c.a(appUpdateInfo, this.G, AppUpdateOptions.d(0).a());
        return Unit.f40552a;
    }
}
