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
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;

@Metadata
@DebugMetadata(c = "androidx.lifecycle.LifecycleKt$eventFlow$1", f = "Lifecycle.kt", l = {373}, m = "invokeSuspend")
final class LifecycleKt$eventFlow$1 extends SuspendLambda implements Function2<ProducerScope<? super Lifecycle.Event>, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Lifecycle F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LifecycleKt$eventFlow$1(Lifecycle lifecycle, Continuation continuation) {
        super(2, continuation);
        this.F = lifecycle;
    }

    public static final void D(ProducerScope producerScope, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        producerScope.L(event);
        if (event == Lifecycle.Event.ON_DESTROY) {
            SendChannel.DefaultImpls.a(producerScope, (Throwable) null, 1, (Object) null);
        }
    }

    public static final Unit E(Lifecycle lifecycle, LifecycleEventObserver lifecycleEventObserver) {
        lifecycle.d(lifecycleEventObserver);
        return Unit.f40552a;
    }

    /* renamed from: C */
    public final Object m(ProducerScope producerScope, Continuation continuation) {
        return ((LifecycleKt$eventFlow$1) s(producerScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        LifecycleKt$eventFlow$1 lifecycleKt$eventFlow$1 = new LifecycleKt$eventFlow$1(this.F, continuation);
        lifecycleKt$eventFlow$1.E = obj;
        return lifecycleKt$eventFlow$1;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            ProducerScope producerScope = (ProducerScope) this.E;
            e eVar = new e(producerScope);
            this.F.a(eVar);
            f fVar = new f(this.F, eVar);
            this.D = 1;
            if (ProduceKt.a(producerScope, fVar, this) == f2) {
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
