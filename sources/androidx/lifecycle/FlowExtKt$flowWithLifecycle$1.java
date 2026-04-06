package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata
@DebugMetadata(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", f = "FlowExt.kt", l = {90}, m = "invokeSuspend")
final class FlowExtKt$flowWithLifecycle$1 extends SuspendLambda implements Function2<ProducerScope<Object>, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Lifecycle F;
    public final /* synthetic */ Lifecycle.State G;
    public final /* synthetic */ Flow H;

    @Metadata
    @DebugMetadata(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", f = "FlowExt.kt", l = {90}, m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int D;

        /* renamed from: A */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            return new AnonymousClass1(flow, producerScope2, continuation);
        }

        public final Object x(Object obj) {
            Object f2 = IntrinsicsKt.f();
            int i2 = this.D;
            if (i2 == 0) {
                ResultKt.b(obj);
                Flow flow = flow;
                final ProducerScope producerScope = producerScope2;
                AnonymousClass1 r1 = new FlowCollector() {
                    public final Object c(Object obj, Continuation continuation) {
                        Object O = producerScope.O(obj, continuation);
                        return O == IntrinsicsKt.f() ? O : Unit.f40552a;
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
    public FlowExtKt$flowWithLifecycle$1(Lifecycle lifecycle, Lifecycle.State state, Flow flow, Continuation continuation) {
        super(2, continuation);
        this.F = lifecycle;
        this.G = state;
        this.H = flow;
    }

    /* renamed from: A */
    public final Object m(ProducerScope producerScope, Continuation continuation) {
        return ((FlowExtKt$flowWithLifecycle$1) s(producerScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        FlowExtKt$flowWithLifecycle$1 flowExtKt$flowWithLifecycle$1 = new FlowExtKt$flowWithLifecycle$1(this.F, this.G, this.H, continuation);
        flowExtKt$flowWithLifecycle$1.E = obj;
        return flowExtKt$flowWithLifecycle$1;
    }

    public final Object x(Object obj) {
        ProducerScope producerScope;
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            final ProducerScope producerScope2 = (ProducerScope) this.E;
            Lifecycle lifecycle = this.F;
            Lifecycle.State state = this.G;
            final Flow flow = this.H;
            AnonymousClass1 r5 = new AnonymousClass1((Continuation) null);
            this.E = producerScope2;
            this.D = 1;
            if (RepeatOnLifecycleKt.a(lifecycle, state, r5, this) == f2) {
                return f2;
            }
            producerScope = producerScope2;
        } else if (i2 == 1) {
            producerScope = (ProducerScope) this.E;
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        SendChannel.DefaultImpls.a(producerScope, (Throwable) null, 1, (Object) null);
        return Unit.f40552a;
    }
}
