package com.hansecom.abt.presentation.screens.main;

import android.content.Context;
import androidx.activity.compose.ManagedActivityResultLauncher;
import com.google.android.play.core.install.InstallState;
import com.hansecom.abt.data.useCases.appUpdate.AppUpdate;
import com.hansecom.abt.presentation.appUpdate.AppUpdateHelper;
import com.hansecom.abt.presentation.screens.main.Main;
import com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.main.MainScreenKt$SoftUpdateWarning$1$1", f = "MainScreen.kt", l = {}, m = "invokeSuspend")
public final class MainScreenKt$SoftUpdateWarning$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ Main.State E;
    public final /* synthetic */ ManagedActivityResultLauncher F;
    public final /* synthetic */ AppUpdateHelper G;
    public final /* synthetic */ CoroutineScope H;
    public final /* synthetic */ Context I;
    public final /* synthetic */ AbtSnackbarHostState J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MainScreenKt$SoftUpdateWarning$1$1(Main.State state, ManagedActivityResultLauncher managedActivityResultLauncher, AppUpdateHelper appUpdateHelper, CoroutineScope coroutineScope, Context context, AbtSnackbarHostState abtSnackbarHostState, Continuation continuation) {
        super(2, continuation);
        this.E = state;
        this.F = managedActivityResultLauncher;
        this.G = appUpdateHelper;
        this.H = coroutineScope;
        this.I = context;
        this.J = abtSnackbarHostState;
    }

    public static final void C(CoroutineScope coroutineScope, Context context, AbtSnackbarHostState abtSnackbarHostState, AppUpdateHelper appUpdateHelper, InstallState installState) {
        if (installState.c() == 11) {
            Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new MainScreenKt$SoftUpdateWarning$1$1$1$1(context, abtSnackbarHostState, appUpdateHelper, (Continuation) null), 3, (Object) null);
        }
    }

    /* renamed from: B */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((MainScreenKt$SoftUpdateWarning$1$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new MainScreenKt$SoftUpdateWarning$1$1(this.E, this.F, this.G, this.H, this.I, this.J, continuation);
    }

    public final Object x(Object obj) {
        ManagedActivityResultLauncher managedActivityResultLauncher;
        AppUpdateHelper appUpdateHelper;
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            if (!(this.E.c() != AppUpdate.SOFT || (managedActivityResultLauncher = this.F) == null || (appUpdateHelper = this.G) == null)) {
                appUpdateHelper.e(managedActivityResultLauncher, new z(this.H, this.I, this.J, appUpdateHelper));
            }
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
