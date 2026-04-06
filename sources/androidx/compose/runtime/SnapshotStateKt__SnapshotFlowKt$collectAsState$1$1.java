package androidx.compose.runtime;

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
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata
@DebugMetadata(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1", f = "SnapshotFlow.kt", l = {68, 69}, m = "invokeSuspend")
public final class SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1 extends SuspendLambda implements Function2<ProduceStateScope<Object>, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ CoroutineContext F;
    public final /* synthetic */ Flow G;

    @Metadata
    @DebugMetadata(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1$2", f = "SnapshotFlow.kt", l = {69}, m = "invokeSuspend")
    /* renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1$2  reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int D;

        /* renamed from: A */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass2) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            return new AnonymousClass2(flow2, produceStateScope, continuation);
        }

        public final Object x(Object obj) {
            Object f2 = IntrinsicsKt.f();
            int i2 = this.D;
            if (i2 == 0) {
                ResultKt.b(obj);
                Flow flow = flow2;
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
            } else if (i2 == 1) {
                ResultKt.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.f40552a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1(CoroutineContext coroutineContext, Flow flow, Continuation continuation) {
        super(2, continuation);
        this.F = coroutineContext;
        this.G = flow;
    }

    /* renamed from: A */
    public final Object m(ProduceStateScope produceStateScope, Continuation continuation) {
        return ((SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1) s(produceStateScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1 snapshotStateKt__SnapshotFlowKt$collectAsState$1$1 = new SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1(this.F, this.G, continuation);
        snapshotStateKt__SnapshotFlowKt$collectAsState$1$1.E = obj;
        return snapshotStateKt__SnapshotFlowKt$collectAsState$1$1;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            final ProduceStateScope produceStateScope = (ProduceStateScope) this.E;
            if (Intrinsics.d(this.F, EmptyCoroutineContext.f40721z)) {
                Flow flow = this.G;
                AnonymousClass1 r2 = new FlowCollector() {
                    public final Object c(Object obj, Continuation continuation) {
                        produceStateScope.setValue(obj);
                        return Unit.f40552a;
                    }
                };
                this.D = 1;
                if (flow.a(r2, this) == f2) {
                    return f2;
                }
            } else {
                CoroutineContext coroutineContext = this.F;
                final Flow flow2 = this.G;
                AnonymousClass2 r3 = new AnonymousClass2((Continuation) null);
                this.D = 2;
                if (BuildersKt.g(coroutineContext, r3, this) == f2) {
                    return f2;
                }
            }
        } else if (i2 == 1 || i2 == 2) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f40552a;
    }
}
