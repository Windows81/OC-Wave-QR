package io.realm.internal.coroutines;

import io.realm.DynamicRealm;
import io.realm.OrderedCollectionChangeSet;
import io.realm.RealmConfiguration;
import io.realm.RealmList;
import io.realm.rx.CollectionChange;
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
import kotlinx.coroutines.channels.SendChannel;

@Metadata
@DebugMetadata(c = "io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$4", f = "InternalFlowFactory.kt", l = {467, 495}, m = "invokeSuspend")
final class InternalFlowFactory$changesetFrom$4 extends SuspendLambda implements Function2<ProducerScope<? super CollectionChange<RealmList<Object>>>, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ RealmList F;
    public final /* synthetic */ RealmConfiguration G;
    public final /* synthetic */ InternalFlowFactory H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InternalFlowFactory$changesetFrom$4(RealmList realmList, RealmConfiguration realmConfiguration, InternalFlowFactory internalFlowFactory, Continuation continuation) {
        super(2, continuation);
        this.F = realmList;
        this.G = realmConfiguration;
        this.H = internalFlowFactory;
    }

    /* access modifiers changed from: private */
    public static final void C(ProducerScope producerScope, InternalFlowFactory internalFlowFactory, RealmList realmList, OrderedCollectionChangeSet orderedCollectionChangeSet) {
        if (!CoroutineScopeKt.h(producerScope)) {
            return;
        }
        if (!realmList.A()) {
            SendChannel.DefaultImpls.a(producerScope, (Throwable) null, 1, (Object) null);
        } else if (internalFlowFactory.f40261a) {
            producerScope.L(new CollectionChange(realmList.s(), orderedCollectionChangeSet));
        } else {
            producerScope.L(new CollectionChange(realmList, orderedCollectionChangeSet));
        }
    }

    /* renamed from: B */
    public final Object m(ProducerScope producerScope, Continuation continuation) {
        return ((InternalFlowFactory$changesetFrom$4) s(producerScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        InternalFlowFactory$changesetFrom$4 internalFlowFactory$changesetFrom$4 = new InternalFlowFactory$changesetFrom$4(this.F, this.G, this.H, continuation);
        internalFlowFactory$changesetFrom$4.E = obj;
        return internalFlowFactory$changesetFrom$4;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            ProducerScope producerScope = (ProducerScope) this.E;
            if (!this.F.A()) {
                AnonymousClass1 r1 = AnonymousClass1.f40274z;
                this.D = 1;
                if (ProduceKt.a(producerScope, r1, this) == f2) {
                    return f2;
                }
            } else {
                final DynamicRealm f0 = DynamicRealm.f0(this.G);
                final d dVar = new d(producerScope, this.H);
                this.F.o(dVar);
                if (this.H.f40261a) {
                    producerScope.L(new CollectionChange(this.F.s(), (OrderedCollectionChangeSet) null));
                } else {
                    producerScope.L(new CollectionChange(this.F, (OrderedCollectionChangeSet) null));
                }
                final RealmList realmList = this.F;
                AnonymousClass2 r3 = new Function0<Unit>() {
                    public final void invoke() {
                        if (!f0.isClosed()) {
                            realmList.B(dVar);
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
