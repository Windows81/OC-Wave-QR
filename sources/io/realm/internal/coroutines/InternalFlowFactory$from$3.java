package io.realm.internal.coroutines;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmResults;
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
@DebugMetadata(c = "io.realm.internal.coroutines.InternalFlowFactory$from$3", f = "InternalFlowFactory.kt", l = {116, 142}, m = "invokeSuspend")
final class InternalFlowFactory$from$3 extends SuspendLambda implements Function2<ProducerScope<? super RealmResults<Object>>, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ RealmResults F;
    public final /* synthetic */ RealmConfiguration G;
    public final /* synthetic */ InternalFlowFactory H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InternalFlowFactory$from$3(RealmResults realmResults, RealmConfiguration realmConfiguration, InternalFlowFactory internalFlowFactory, Continuation continuation) {
        super(2, continuation);
        this.F = realmResults;
        this.G = realmConfiguration;
        this.H = internalFlowFactory;
    }

    public static final void C(ProducerScope producerScope, InternalFlowFactory internalFlowFactory, RealmResults realmResults) {
        if (!CoroutineScopeKt.h(producerScope)) {
            return;
        }
        if (internalFlowFactory.f40261a) {
            RealmResults p2 = realmResults.p();
            Intrinsics.h(p2, "listenerResults.freeze()");
            producerScope.L(p2);
            return;
        }
        producerScope.L(realmResults);
    }

    /* renamed from: B */
    public final Object m(ProducerScope producerScope, Continuation continuation) {
        return ((InternalFlowFactory$from$3) s(producerScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        InternalFlowFactory$from$3 internalFlowFactory$from$3 = new InternalFlowFactory$from$3(this.F, this.G, this.H, continuation);
        internalFlowFactory$from$3.E = obj;
        return internalFlowFactory$from$3;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            ProducerScope producerScope = (ProducerScope) this.E;
            if (!this.F.h()) {
                AnonymousClass1 r1 = AnonymousClass1.f40290z;
                this.D = 1;
                if (ProduceKt.a(producerScope, r1, this) == f2) {
                    return f2;
                }
            } else {
                final Realm G0 = Realm.G0(this.G);
                final i iVar = new i(producerScope, this.H);
                this.F.m(iVar);
                if (this.H.f40261a) {
                    RealmResults p2 = this.F.p();
                    Intrinsics.h(p2, "results.freeze()");
                    producerScope.L(p2);
                } else {
                    producerScope.L(this.F);
                }
                final RealmResults realmResults = this.F;
                AnonymousClass2 r3 = new Function0<Unit>() {
                    public final void invoke() {
                        if (!G0.isClosed()) {
                            realmResults.u(iVar);
                            G0.close();
                        }
                    }
                };
                this.D = 2;
                if (ProduceKt.a(producerScope, r3, this) == f2) {
                    return f2;
                }
                return Unit.f40552a;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else if (i2 == 2) {
            ResultKt.b(obj);
            return Unit.f40552a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f40552a;
    }
}
