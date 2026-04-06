package androidx.lifecycle.compose;

import androidx.compose.runtime.ProduceStateScope;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata
@DebugMetadata(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1", f = "FlowExt.kt", l = {177}, m = "invokeSuspend")
final class FlowExtKt$collectAsStateWithLifecycle$1$1 extends SuspendLambda implements Function2<ProduceStateScope<Object>, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Lifecycle F;
    public final /* synthetic */ Lifecycle.State G;
    public final /* synthetic */ CoroutineContext H;
    public final /* synthetic */ Flow I;

    @Metadata
    @DebugMetadata(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1", f = "FlowExt.kt", l = {179, 181}, m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int D;

        /* renamed from: A */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            return new AnonymousClass1(coroutineContext, flow, produceStateScope, continuation);
        }

        public final Object x(Object obj) {
            Object f2 = IntrinsicsKt.f();
            int i2 = this.D;
            if (i2 == 0) {
                ResultKt.b(obj);
                if (Intrinsics.d(coroutineContext, EmptyCoroutineContext.f40721z)) {
                    Flow flow = flow;
                    final ProduceStateScope produceStateScope = produceStateScope;
                    AnonymousClass1 r1 = new FlowCollector() {
                        public final Object c(Object obj, Continuation continuation) {
                            produceStateScope.setValue(obj);
                            return Unit.f40552a;
                        }
                    };
                    this.D = 1;
                    if (flow.a(r1, this) == f2) {
                        return f2;
                    }
                } else {
                    CoroutineContext coroutineContext = coroutineContext;
                    final Flow flow2 = flow;
                    final ProduceStateScope produceStateScope2 = produceStateScope;
                    AnonymousClass2 r12 = new Function2<CoroutineScope, Continuation<? super Unit>, Object>((Continuation) null) {
                        public int D;

                        /* renamed from: A */
                        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
                            return ((AnonymousClass2) s(coroutineScope, continuation)).x(Unit.f40552a);
                        }

                        public final Continuation s(Object obj, Continuation continuation) {
                            return 

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            public FlowExtKt$collectAsStateWithLifecycle$1$1(Lifecycle lifecycle, Lifecycle.State state, CoroutineContext coroutineContext, Flow flow, Continuation continuation) {
                                super(2, continuation);
                                this.F = lifecycle;
                                this.G = state;
                                this.H = coroutineContext;
                                this.I = flow;
                            }

                            /* renamed from: A */
                            public final Object m(ProduceStateScope produceStateScope, Continuation continuation) {
                                return ((FlowExtKt$collectAsStateWithLifecycle$1$1) s(produceStateScope, continuation)).x(Unit.f40552a);
                            }

                            public final Continuation s(Object obj, Continuation continuation) {
                                FlowExtKt$collectAsStateWithLifecycle$1$1 flowExtKt$collectAsStateWithLifecycle$1$1 = new FlowExtKt$collectAsStateWithLifecycle$1$1(this.F, this.G, this.H, this.I, continuation);
                                flowExtKt$collectAsStateWithLifecycle$1$1.E = obj;
                                return flowExtKt$collectAsStateWithLifecycle$1$1;
                            }

                            public final Object x(Object obj) {
                                Object f2 = IntrinsicsKt.f();
                                int i2 = this.D;
                                if (i2 == 0) {
                                    ResultKt.b(obj);
                                    final ProduceStateScope produceStateScope = (ProduceStateScope) this.E;
                                    Lifecycle lifecycle = this.F;
                                    Lifecycle.State state = this.G;
                                    final CoroutineContext coroutineContext = this.H;
                                    final Flow flow = this.I;
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
