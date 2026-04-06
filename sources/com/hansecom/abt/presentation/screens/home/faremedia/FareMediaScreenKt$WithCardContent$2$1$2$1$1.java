package com.hansecom.abt.presentation.screens.home.faremedia;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.pager.PagerState;
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
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.faremedia.FareMediaScreenKt$WithCardContent$2$1$2$1$1", f = "FareMediaScreen.kt", l = {347}, m = "invokeSuspend")
public final class FareMediaScreenKt$WithCardContent$2$1$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ PagerState E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FareMediaScreenKt$WithCardContent$2$1$2$1$1(PagerState pagerState, Continuation continuation) {
        super(2, continuation);
        this.E = pagerState;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((FareMediaScreenKt$WithCardContent$2$1$2$1$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new FareMediaScreenKt$WithCardContent$2$1$2$1$1(this.E, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            PagerState pagerState = this.E;
            this.D = 1;
            if (PagerState.n(pagerState, pagerState.v() - 1, 0.0f, (AnimationSpec) null, this, 6, (Object) null) == f2) {
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
