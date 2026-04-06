package io.realm.internal.coroutines;

import io.realm.DynamicRealm;
import io.realm.DynamicRealmObject;
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
@DebugMetadata(c = "io.realm.internal.coroutines.InternalFlowFactory$from$8", f = "InternalFlowFactory.kt", l = {622, 650}, m = "invokeSuspend")
final class InternalFlowFactory$from$8 extends SuspendLambda implements Function2<ProducerScope<? super DynamicRealmObject>, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ DynamicRealm F;
    public final /* synthetic */ RealmConfiguration G;
    public final /* synthetic */ DynamicRealmObject H;
    public final /* synthetic */ InternalFlowFactory I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InternalFlowFactory$from$8(DynamicRealm dynamicRealm, RealmConfiguration realmConfiguration, DynamicRealmObject dynamicRealmObject, InternalFlowFactory internalFlowFactory, Continuation continuation) {
        super(2, continuation);
        this.F = dynamicRealm;
        this.G = realmConfiguration;
        this.H = dynamicRealmObject;
        this.I = internalFlowFactory;
    }

    public static final void C(ProducerScope producerScope, InternalFlowFactory internalFlowFactory, DynamicRealmObject dynamicRealmObject) {
        if (!CoroutineScopeKt.h(producerScope)) {
            return;
        }
        if (internalFlowFactory.f40261a) {
            RealmModel freeze = dynamicRealmObject.freeze();
            Intrinsics.h(freeze, "listenerObj.freeze()");
            producerScope.L(freeze);
            return;
        }
        producerScope.L(dynamicRealmObject);
    }

    /* renamed from: B */
    public final Object m(ProducerScope producerScope, Continuation continuation) {
        return ((InternalFlowFactory$from$8) s(producerScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        InternalFlowFactory$from$8 internalFlowFactory$from$8 = new InternalFlowFactory$from$8(this.F, this.G, this.H, this.I, continuation);
        internalFlowFactory$from$8.E = obj;
        return internalFlowFactory$from$8;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            ProducerScope producerScope = (ProducerScope) this.E;
            if (this.F.isClosed()) {
                AnonymousClass1 r1 = AnonymousClass1.f40310z;
                this.D = 1;
                if (ProduceKt.a(producerScope, r1, this) == f2) {
                    return f2;
                }
            } else {
                final DynamicRealm f0 = DynamicRealm.f0(this.G);
                final n nVar = new n(producerScope, this.I);
                this.H.addChangeListener(nVar);
                if (RealmObject.isLoaded(this.H)) {
                    if (this.I.f40261a) {
                        RealmModel freeze = RealmObject.freeze(this.H);
                        Intrinsics.h(freeze, "freeze(dynamicRealmObject)");
                        producerScope.L(freeze);
                    } else {
                        producerScope.L(this.H);
                    }
                }
                final DynamicRealmObject dynamicRealmObject = this.H;
                AnonymousClass2 r3 = new Function0<Unit>() {
                    public final void invoke() {
                        if (!f0.isClosed()) {
                            dynamicRealmObject.removeChangeListener(nVar);
                            f0.close();
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
