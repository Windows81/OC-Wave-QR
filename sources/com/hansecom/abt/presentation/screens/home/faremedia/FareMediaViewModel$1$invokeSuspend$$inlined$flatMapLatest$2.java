package com.hansecom.abt.presentation.screens.home.faremedia;

import java.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.faremedia.FareMediaViewModel$1$invokeSuspend$$inlined$flatMapLatest$2", f = "FareMediaViewModel.kt", l = {189}, m = "invokeSuspend")
public final class FareMediaViewModel$1$invokeSuspend$$inlined$flatMapLatest$2 extends SuspendLambda implements Function3<FlowCollector<? super Pair<? extends String, ? extends LocalDateTime>>, String, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public /* synthetic */ Object F;
    public final /* synthetic */ FareMediaViewModel G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FareMediaViewModel$1$invokeSuspend$$inlined$flatMapLatest$2(Continuation continuation, FareMediaViewModel fareMediaViewModel) {
        super(3, continuation);
        this.G = fareMediaViewModel;
    }

    /* renamed from: A */
    public final Object d(FlowCollector flowCollector, Object obj, Continuation continuation) {
        FareMediaViewModel$1$invokeSuspend$$inlined$flatMapLatest$2 fareMediaViewModel$1$invokeSuspend$$inlined$flatMapLatest$2 = new FareMediaViewModel$1$invokeSuspend$$inlined$flatMapLatest$2(continuation, this.G);
        fareMediaViewModel$1$invokeSuspend$$inlined$flatMapLatest$2.E = flowCollector;
        fareMediaViewModel$1$invokeSuspend$$inlined$flatMapLatest$2.F = obj;
        return fareMediaViewModel$1$invokeSuspend$$inlined$flatMapLatest$2.x(Unit.f40552a);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            String str = (String) this.F;
            FareMediaViewModel$1$invokeSuspend$lambda$3$$inlined$map$1 fareMediaViewModel$1$invokeSuspend$lambda$3$$inlined$map$1 = new FareMediaViewModel$1$invokeSuspend$lambda$3$$inlined$map$1(this.G.f35975k.a(str), str);
            this.D = 1;
            if (FlowKt.z((FlowCollector) this.E, fareMediaViewModel$1$invokeSuspend$lambda$3$$inlined$map$1, this) == f2) {
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
