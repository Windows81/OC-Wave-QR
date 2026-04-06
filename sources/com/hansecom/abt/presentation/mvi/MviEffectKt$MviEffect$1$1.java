package com.hansecom.abt.presentation.mvi;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.mvi.MviEffectKt$MviEffect$1$1", f = "MviEffect.kt", l = {19}, m = "invokeSuspend")
public final class MviEffectKt$MviEffect$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ LifecycleOwner E;
    public final /* synthetic */ Lifecycle.State F;
    public final /* synthetic */ Flow G;
    public final /* synthetic */ Function2 H;

    @Metadata
    @DebugMetadata(c = "com.hansecom.abt.presentation.mvi.MviEffectKt$MviEffect$1$1$1", f = "MviEffect.kt", l = {20}, m = "invokeSuspend")
    /* renamed from: com.hansecom.abt.presentation.mvi.MviEffectKt$MviEffect$1$1$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int D;

        /* renamed from: A */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            return new AnonymousClass1(flow, function2, continuation);
        }

        public final Object x(Object obj) {
            Object f2 = IntrinsicsKt.f();
            int i2 = this.D;
            if (i2 == 0) {
                ResultKt.b(obj);
                Flow flow = flow;
                MviEffectKt$sam$kotlinx_coroutines_flow_FlowCollector$0 mviEffectKt$sam$kotlinx_coroutines_flow_FlowCollector$0 = new MviEffectKt$sam$kotlinx_coroutines_flow_FlowCollector$0(function2);
                this.D = 1;
                if (flow.a(mviEffectKt$sam$kotlinx_coroutines_flow_FlowCollector$0, this) == f2) {
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MviEffectKt$MviEffect$1$1(LifecycleOwner lifecycleOwner, Lifecycle.State state, Flow flow, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.E = lifecycleOwner;
        this.F = state;
        this.G = flow;
        this.H = function2;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((MviEffectKt$MviEffect$1$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new MviEffectKt$MviEffect$1$1(this.E, this.F, this.G, this.H, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            Lifecycle a2 = this.E.a();
            Lifecycle.State state = this.F;
            final Flow flow = this.G;
            final Function2 function2 = this.H;
            AnonymousClass1 r3 = new AnonymousClass1((Continuation) null);
            this.D = 1;
            if (RepeatOnLifecycleKt.a(a2, state, r3, this) == f2) {
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
