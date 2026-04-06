package com.hansecom.abt.presentation.mvi;

import androidx.compose.runtime.ProduceStateScope;
import androidx.lifecycle.Lifecycle;
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
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.mvi.MviViewModel$subscribe$1$1", f = "MviViewModel.kt", l = {88}, m = "invokeSuspend")
public final class MviViewModel$subscribe$1$1 extends SuspendLambda implements Function2<ProduceStateScope<State>, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Lifecycle F;
    public final /* synthetic */ Lifecycle.State G;
    public final /* synthetic */ MviViewModel H;

    @Metadata
    @DebugMetadata(c = "com.hansecom.abt.presentation.mvi.MviViewModel$subscribe$1$1$1", f = "MviViewModel.kt", l = {92}, m = "invokeSuspend")
    /* renamed from: com.hansecom.abt.presentation.mvi.MviViewModel$subscribe$1$1$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int D;

        /* renamed from: A */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            return new AnonymousClass1(mviViewModel, produceStateScope, continuation);
        }

        public final Object x(Object obj) {
            Object f2 = IntrinsicsKt.f();
            int i2 = this.D;
            if (i2 == 0) {
                ResultKt.b(obj);
                StateFlow n2 = mviViewModel.n();
                final MviViewModel mviViewModel = mviViewModel;
                Flow W = FlowKt.W(n2, new Function2<FlowCollector<? super State>, Continuation<? super Unit>, Object>((Continuation) null) {
                    public int D;

                    /* renamed from: A */
                    public final Object m(FlowCollector flowCollector, Continuation continuation) {
                        return ((AnonymousClass1) s(flowCollector, continuation)).x(Unit.f40552a);
                    }

                    public final Continuation s(Object obj, Continuation continuation) {
                        return 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public MviViewModel$subscribe$1$1(Lifecycle lifecycle, Lifecycle.State state, MviViewModel mviViewModel, Continuation continuation) {
                            super(2, continuation);
                            this.F = lifecycle;
                            this.G = state;
                            this.H = mviViewModel;
                        }

                        /* renamed from: A */
                        public final Object m(ProduceStateScope produceStateScope, Continuation continuation) {
                            return ((MviViewModel$subscribe$1$1) s(produceStateScope, continuation)).x(Unit.f40552a);
                        }

                        public final Continuation s(Object obj, Continuation continuation) {
                            MviViewModel$subscribe$1$1 mviViewModel$subscribe$1$1 = new MviViewModel$subscribe$1$1(this.F, this.G, this.H, continuation);
                            mviViewModel$subscribe$1$1.E = obj;
                            return mviViewModel$subscribe$1$1;
                        }

                        public final Object x(Object obj) {
                            Object f2 = IntrinsicsKt.f();
                            int i2 = this.D;
                            if (i2 == 0) {
                                ResultKt.b(obj);
                                final ProduceStateScope produceStateScope = (ProduceStateScope) this.E;
                                Lifecycle lifecycle = this.F;
                                Lifecycle.State state = this.G;
                                final MviViewModel mviViewModel = this.H;
                                AnonymousClass1 r4 = new AnonymousClass1((Continuation) null);
                                this.D = 1;
                                if (RepeatOnLifecycleKt.a(lifecycle, state, r4, this) == f2) {
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
