package com.hansecom.abt.presentation.screens.main;

import androidx.lifecycle.LifecycleOwnerKt;
import com.hansecom.abt.presentation.biometric.BiometricHelper;
import com.hansecom.abt.presentation.main.MainActivity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.main.MainScreenKt$MainScreen$1$1", f = "MainScreen.kt", l = {}, m = "invokeSuspend")
public final class MainScreenKt$MainScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ MainViewModel E;
    public final /* synthetic */ BiometricHelper F;
    public final /* synthetic */ MainActivity G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MainScreenKt$MainScreen$1$1(MainViewModel mainViewModel, BiometricHelper biometricHelper, MainActivity mainActivity, Continuation continuation) {
        super(2, continuation);
        this.E = mainViewModel;
        this.F = biometricHelper;
        this.G = mainActivity;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((MainScreenKt$MainScreen$1$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new MainScreenKt$MainScreen$1$1(this.E, this.F, this.G, continuation);
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            this.E.C(this.F.c(), LifecycleOwnerKt.a(this.G), this.G.a());
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
