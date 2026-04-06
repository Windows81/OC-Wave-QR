package com.hansecom.abt.ui.components.snackbar;

import androidx.compose.material3.SnackbarDuration;
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
@DebugMetadata(c = "com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState$showSnackbar$1", f = "AbtSnackbarHostState.kt", l = {44}, m = "invokeSuspend")
public final class AbtSnackbarHostState$showSnackbar$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ AbtSnackbarHostState E;
    public final /* synthetic */ CharSequence F;
    public final /* synthetic */ SnackbarType G;
    public final /* synthetic */ String H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ SnackbarDuration J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbtSnackbarHostState$showSnackbar$1(AbtSnackbarHostState abtSnackbarHostState, CharSequence charSequence, SnackbarType snackbarType, String str, boolean z2, SnackbarDuration snackbarDuration, Continuation continuation) {
        super(2, continuation);
        this.E = abtSnackbarHostState;
        this.F = charSequence;
        this.G = snackbarType;
        this.H = str;
        this.I = z2;
        this.J = snackbarDuration;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AbtSnackbarHostState$showSnackbar$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new AbtSnackbarHostState$showSnackbar$1(this.E, this.F, this.G, this.H, this.I, this.J, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            AbtSnackbarHostState abtSnackbarHostState = this.E;
            CharSequence charSequence = this.F;
            SnackbarType snackbarType = this.G;
            String str = this.H;
            boolean z2 = this.I;
            SnackbarDuration snackbarDuration = this.J;
            this.D = 1;
            if (abtSnackbarHostState.f(charSequence, snackbarType, str, z2, snackbarDuration, this) == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f40552a;
    }
}
