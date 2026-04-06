package io.realm.internal.coroutines;

import io.realm.DynamicRealm;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;

@Metadata
@DebugMetadata(c = "io.realm.internal.coroutines.InternalFlowFactory$from$2", f = "InternalFlowFactory.kt", l = {97}, m = "invokeSuspend")
final class InternalFlowFactory$from$2 extends SuspendLambda implements Function2<ProducerScope<? super DynamicRealm>, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ DynamicRealm F;
    public final /* synthetic */ InternalFlowFactory G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InternalFlowFactory$from$2(DynamicRealm dynamicRealm, InternalFlowFactory internalFlowFactory, Continuation continuation) {
        super(2, continuation);
        this.F = dynamicRealm;
        this.G = internalFlowFactory;
    }

    public static final void C(ProducerScope producerScope, InternalFlowFactory internalFlowFactory, DynamicRealm dynamicRealm, DynamicRealm dynamicRealm2) {
        if (!CoroutineScopeKt.h(producerScope)) {
            return;
        }
        if (internalFlowFactory.f40261a) {
            DynamicRealm e0 = dynamicRealm.y();
            Intrinsics.h(e0, "dynamicRealm.freeze()");
            producerScope.L(e0);
            return;
        }
        producerScope.L(dynamicRealm2);
    }

    /* renamed from: B */
    public final Object m(ProducerScope producerScope, Continuation continuation) {
        return ((InternalFlowFactory$from$2) s(producerScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        InternalFlowFactory$from$2 internalFlowFactory$from$2 = new InternalFlowFactory$from$2(this.F, this.G, continuation);
        internalFlowFactory$from$2.E = obj;
        return internalFlowFactory$from$2;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            ProducerScope producerScope = (ProducerScope) this.E;
            final DynamicRealm f0 = DynamicRealm.f0(this.F.E());
            final h hVar = new h(producerScope, this.G, this.F);
            f0.T(hVar);
            if (this.G.f40261a) {
                DynamicRealm e0 = f0.y();
                Intrinsics.h(e0, "flowRealm.freeze()");
                producerScope.L(e0);
            } else {
                Intrinsics.h(f0, "flowRealm");
                producerScope.L(f0);
            }
            AnonymousClass1 r3 = new Function0<Unit>() {
                public final void invoke() {
                    f0.g0(hVar);
                    f0.close();
                }
            };
            this.D = 1;
            if (ProduceKt.a(producerScope, r3, this) == f2) {
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
