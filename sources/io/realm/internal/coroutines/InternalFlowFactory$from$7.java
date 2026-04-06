package io.realm.internal.coroutines;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmModel;
import io.realm.RealmObject;
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
@DebugMetadata(c = "io.realm.internal.coroutines.InternalFlowFactory$from$7", f = "InternalFlowFactory.kt", l = {517, 545}, m = "invokeSuspend")
final class InternalFlowFactory$from$7 extends SuspendLambda implements Function2<ProducerScope<RealmModel>, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Realm F;
    public final /* synthetic */ RealmConfiguration G;
    public final /* synthetic */ RealmModel H;
    public final /* synthetic */ InternalFlowFactory I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InternalFlowFactory$from$7(Realm realm, RealmConfiguration realmConfiguration, RealmModel realmModel, InternalFlowFactory internalFlowFactory, Continuation continuation) {
        super(2, continuation);
        this.F = realm;
        this.G = realmConfiguration;
        this.H = realmModel;
        this.I = internalFlowFactory;
    }

    public static final void C(ProducerScope producerScope, InternalFlowFactory internalFlowFactory, RealmModel realmModel) {
        if (!CoroutineScopeKt.h(producerScope)) {
            return;
        }
        if (internalFlowFactory.f40261a) {
            RealmModel freeze = RealmObject.freeze(realmModel);
            if (freeze != null) {
                producerScope.L(freeze);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type T of io.realm.internal.coroutines.InternalFlowFactory.from.<no name provided>.invokeSuspend$lambda-0");
        }
        producerScope.L(realmModel);
    }

    /* renamed from: B */
    public final Object m(ProducerScope producerScope, Continuation continuation) {
        return ((InternalFlowFactory$from$7) s(producerScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        InternalFlowFactory$from$7 internalFlowFactory$from$7 = new InternalFlowFactory$from$7(this.F, this.G, this.H, this.I, continuation);
        internalFlowFactory$from$7.E = obj;
        return internalFlowFactory$from$7;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            ProducerScope producerScope = (ProducerScope) this.E;
            if (this.F.isClosed()) {
                AnonymousClass1 r1 = AnonymousClass1.f40306z;
                this.D = 1;
                if (ProduceKt.a(producerScope, r1, this) == f2) {
                    return f2;
                }
            } else {
                final Realm G0 = Realm.G0(this.G);
                final m mVar = new m(producerScope, this.I);
                RealmObject.addChangeListener(this.H, mVar);
                if (RealmObject.isLoaded(this.H)) {
                    if (this.I.f40261a) {
                        RealmModel freeze = RealmObject.freeze(this.H);
                        Intrinsics.h(freeze, "freeze(realmObject)");
                        producerScope.L(freeze);
                    } else {
                        producerScope.L(this.H);
                    }
                }
                final RealmModel realmModel = this.H;
                AnonymousClass2 r3 = new Function0<Unit>() {
                    public final void invoke() {
                        if (!G0.isClosed()) {
                            RealmObject.removeChangeListener(realmModel, mVar);
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
