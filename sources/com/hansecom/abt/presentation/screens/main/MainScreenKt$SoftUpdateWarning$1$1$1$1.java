package com.hansecom.abt.presentation.screens.main;

import android.content.Context;
import androidx.compose.material3.SnackbarDuration;
import androidx.compose.material3.SnackbarResult;
import com.hansecom.abt.R;
import com.hansecom.abt.presentation.appUpdate.AppUpdateHelper;
import com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState;
import com.hansecom.abt.ui.components.snackbar.SnackbarType;
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

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.main.MainScreenKt$SoftUpdateWarning$1$1$1$1", f = "MainScreen.kt", l = {124}, m = "invokeSuspend")
public final class MainScreenKt$SoftUpdateWarning$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ Context E;
    public final /* synthetic */ AbtSnackbarHostState F;
    public final /* synthetic */ AppUpdateHelper G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MainScreenKt$SoftUpdateWarning$1$1$1$1(Context context, AbtSnackbarHostState abtSnackbarHostState, AppUpdateHelper appUpdateHelper, Continuation continuation) {
        super(2, continuation);
        this.E = context;
        this.F = abtSnackbarHostState;
        this.G = appUpdateHelper;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((MainScreenKt$SoftUpdateWarning$1$1$1$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new MainScreenKt$SoftUpdateWarning$1$1$1$1(this.E, this.F, this.G, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            SnackbarType snackbarType = SnackbarType.INFO;
            String string = this.E.getString(R.string.y0);
            Intrinsics.h(string, "getString(...)");
            String string2 = this.E.getString(R.string.x0);
            AbtSnackbarHostState abtSnackbarHostState = this.F;
            this.D = 1;
            obj = AbtSnackbarHostState.g(abtSnackbarHostState, string, snackbarType, string2, true, (SnackbarDuration) null, this, 16, (Object) null);
            if (obj == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (((SnackbarResult) obj) == SnackbarResult.ActionPerformed) {
            this.G.c();
        }
        return Unit.f40552a;
    }
}
