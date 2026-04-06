package com.hansecom.abt.presentation.appUpdate;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateOptions;
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
@DebugMetadata(c = "com.hansecom.abt.presentation.appUpdate.AppUpdateHelper$startHardUpdateFlow$1", f = "AppUpdateHelper.kt", l = {69}, m = "invokeSuspend")
public final class AppUpdateHelper$startHardUpdateFlow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ AppUpdateHelper E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppUpdateHelper$startHardUpdateFlow$1(AppUpdateHelper appUpdateHelper, Continuation continuation) {
        super(2, continuation);
        this.E = appUpdateHelper;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AppUpdateHelper$startHardUpdateFlow$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new AppUpdateHelper$startHardUpdateFlow$1(this.E, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            Task c2 = this.E.f34153c.c();
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
                Context b2 = this.E.f34151a;
                String packageName = this.E.f34151a.getPackageName();
                b2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + packageName)));
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
        AppUpdateManager a2 = this.E.f34153c;
        Context b3 = this.E.f34151a;
        Intrinsics.g(b3, "null cannot be cast to non-null type android.app.Activity");
        a2.e(appUpdateInfo, (Activity) b3, AppUpdateOptions.d(1).a());
        return Unit.f40552a;
    }
}
