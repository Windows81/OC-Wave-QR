package com.hansecom.abt.ui.components.fareCapping;

import androidx.compose.runtime.MutableState;
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
@DebugMetadata(c = "com.hansecom.abt.ui.components.fareCapping.FareCappingInProgressCardKt$Progressbar$1$1", f = "FareCappingInProgressCard.kt", l = {}, m = "invokeSuspend")
public final class FareCappingInProgressCardKt$Progressbar$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ float E;
    public final /* synthetic */ MutableState F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FareCappingInProgressCardKt$Progressbar$1$1(float f2, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.E = f2;
        this.F = mutableState;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((FareCappingInProgressCardKt$Progressbar$1$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new FareCappingInProgressCardKt$Progressbar$1$1(this.E, this.F, continuation);
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            FareCappingInProgressCardKt.j(this.F, this.E);
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
