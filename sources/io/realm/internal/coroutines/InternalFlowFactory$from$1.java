package io.realm.internal.coroutines;

import io.realm.Realm;
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
@DebugMetadata(c = "io.realm.internal.coroutines.InternalFlowFactory$from$1", f = "InternalFlowFactory.kt", l = {64}, m = "invokeSuspend")
final class InternalFlowFactory$from$1 extends SuspendLambda implements Function2<ProducerScope<? super Realm>, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Realm F;
    public final /* synthetic */ InternalFlowFactory G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InternalFlowFactory$from$1(Realm realm, InternalFlowFactory internalFlowFactory, Continuation continuation) {
        super(2, continuation);
        this.F = realm;
        this.G = internalFlowFactory;
    }

    public static final void C(ProducerScope producerScope, InternalFlowFactory internalFlowFactory, Realm realm, Realm realm2) {
        if (!CoroutineScopeKt.h(producerScope)) {
            return;
        }
        if (internalFlowFactory.f40261a) {
            Realm A0 = realm.y();
            Intrinsics.h(A0, "realm.freeze()");
            producerScope.L(A0);
            return;
        }
        producerScope.L(realm2);
    }

    /* renamed from: B */
    public final Object m(ProducerScope producerScope, Continuation continuation) {
        return ((InternalFlowFactory$from$1) s(producerScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        InternalFlowFactory$from$1 internalFlowFactory$from$1 = new InternalFlowFactory$from$1(this.F, this.G, continuation);
        internalFlowFactory$from$1.E = obj;
        return internalFlowFactory$from$1;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            ProducerScope producerScope = (ProducerScope) this.E;
            final Realm G0 = Realm.G0(this.F.E());
            final g gVar = new g(producerScope, this.G, this.F);
            G0.T(gVar);
            if (this.G.f40261a) {
                Realm A0 = G0.y();
                Intrinsics.h(A0, "flowRealm.freeze()");
                producerScope.L(A0);
            } else {
                Intrinsics.h(G0, "flowRealm");
                producerScope.L(G0);
            }
            AnonymousClass1 r3 = new Function0<Unit>() {
                public final void invoke() {
                    G0.q1(gVar);
                    G0.close();
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
