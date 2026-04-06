package io.realm.internal.coroutines;

import io.realm.ObjectChangeSet;
import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmModel;
import io.realm.RealmObject;
import io.realm.rx.ObjectChange;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;

@Metadata
@DebugMetadata(c = "io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$5", f = "InternalFlowFactory.kt", l = {569, 597}, m = "invokeSuspend")
final class InternalFlowFactory$changesetFrom$5 extends SuspendLambda implements Function2<ProducerScope<? super ObjectChange<RealmModel>>, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Realm F;
    public final /* synthetic */ RealmConfiguration G;
    public final /* synthetic */ RealmModel H;
    public final /* synthetic */ InternalFlowFactory I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InternalFlowFactory$changesetFrom$5(Realm realm, RealmConfiguration realmConfiguration, RealmModel realmModel, InternalFlowFactory internalFlowFactory, Continuation continuation) {
        super(2, continuation);
        this.F = realm;
        this.G = realmConfiguration;
        this.H = realmModel;
        this.I = internalFlowFactory;
    }

    public static final void C(ProducerScope producerScope, InternalFlowFactory internalFlowFactory, RealmModel realmModel, ObjectChangeSet objectChangeSet) {
        if (!CoroutineScopeKt.h(producerScope)) {
            return;
        }
        if (internalFlowFactory.f40261a) {
            producerScope.L(new ObjectChange(RealmObject.freeze(realmModel), objectChangeSet));
        } else {
            producerScope.L(new ObjectChange(realmModel, objectChangeSet));
        }
    }

    /* renamed from: B */
    public final Object m(ProducerScope producerScope, Continuation continuation) {
        return ((InternalFlowFactory$changesetFrom$5) s(producerScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        InternalFlowFactory$changesetFrom$5 internalFlowFactory$changesetFrom$5 = new InternalFlowFactory$changesetFrom$5(this.F, this.G, this.H, this.I, continuation);
        internalFlowFactory$changesetFrom$5.E = obj;
        return internalFlowFactory$changesetFrom$5;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            ProducerScope producerScope = (ProducerScope) this.E;
            if (this.F.isClosed()) {
                AnonymousClass1 r1 = AnonymousClass1.f40278z;
                this.D = 1;
                if (ProduceKt.a(producerScope, r1, this) == f2) {
                    return f2;
                }
            } else {
                final Realm G0 = Realm.G0(this.G);
                final e eVar = new e(producerScope, this.I);
                RealmObject.addChangeListener(this.H, eVar);
                if (RealmObject.isLoaded(this.H)) {
                    if (this.I.f40261a) {
                        producerScope.L(new ObjectChange(RealmObject.freeze(this.H), (ObjectChangeSet) null));
                    } else {
                        producerScope.L(new ObjectChange(this.H, (ObjectChangeSet) null));
                    }
                }
                final RealmModel realmModel = this.H;
                AnonymousClass2 r3 = new Function0<Unit>() {
                    public final void invoke() {
                        if (!G0.isClosed()) {
                            RealmObject.removeChangeListener(realmModel, eVar);
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
