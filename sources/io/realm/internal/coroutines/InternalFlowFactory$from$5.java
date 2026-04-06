package io.realm.internal.coroutines;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmList;
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
import kotlinx.coroutines.channels.SendChannel;

@Metadata
@DebugMetadata(c = "io.realm.internal.coroutines.InternalFlowFactory$from$5", f = "InternalFlowFactory.kt", l = {314, 342}, m = "invokeSuspend")
final class InternalFlowFactory$from$5 extends SuspendLambda implements Function2<ProducerScope<? super RealmList<Object>>, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ RealmList F;
    public final /* synthetic */ RealmConfiguration G;
    public final /* synthetic */ InternalFlowFactory H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InternalFlowFactory$from$5(RealmList realmList, RealmConfiguration realmConfiguration, InternalFlowFactory internalFlowFactory, Continuation continuation) {
        super(2, continuation);
        this.F = realmList;
        this.G = realmConfiguration;
        this.H = internalFlowFactory;
    }

    public static final void C(ProducerScope producerScope, InternalFlowFactory internalFlowFactory, RealmList realmList) {
        if (!CoroutineScopeKt.h(producerScope)) {
            return;
        }
        if (!realmList.A()) {
            SendChannel.DefaultImpls.a(producerScope, (Throwable) null, 1, (Object) null);
        } else if (internalFlowFactory.f40261a) {
            RealmList s2 = realmList.s();
            Intrinsics.h(s2, "listenerResults.freeze()");
            producerScope.L(s2);
        } else {
            producerScope.L(realmList);
        }
    }

    /* renamed from: B */
    public final Object m(ProducerScope producerScope, Continuation continuation) {
        return ((InternalFlowFactory$from$5) s(producerScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        InternalFlowFactory$from$5 internalFlowFactory$from$5 = new InternalFlowFactory$from$5(this.F, this.G, this.H, continuation);
        internalFlowFactory$from$5.E = obj;
        return internalFlowFactory$from$5;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            ProducerScope producerScope = (ProducerScope) this.E;
            if (!this.F.A()) {
                AnonymousClass1 r1 = AnonymousClass1.f40298z;
                this.D = 1;
                if (ProduceKt.a(producerScope, r1, this) == f2) {
                    return f2;
                }
            } else {
                final Realm G0 = Realm.G0(this.G);
                final k kVar = new k(producerScope, this.H);
                this.F.p(kVar);
                if (this.H.f40261a) {
                    RealmList s2 = this.F.s();
                    Intrinsics.h(s2, "realmList.freeze()");
                    producerScope.L(s2);
                } else {
                    producerScope.L(this.F);
                }
                final RealmList realmList = this.F;
                AnonymousClass2 r3 = new Function0<Unit>() {
                    public final void invoke() {
                        if (!G0.isClosed()) {
                            realmList.C(kVar);
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
