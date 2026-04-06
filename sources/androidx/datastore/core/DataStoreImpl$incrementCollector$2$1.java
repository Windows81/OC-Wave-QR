package androidx.datastore.core;

import androidx.datastore.core.DataStoreImpl;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$incrementCollector$2$1", f = "DataStoreImpl.kt", l = {134, 135}, m = "invokeSuspend")
public final class DataStoreImpl$incrementCollector$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ DataStoreImpl E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$incrementCollector$2$1(DataStoreImpl dataStoreImpl, Continuation continuation) {
        super(2, continuation);
        this.E = dataStoreImpl;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((DataStoreImpl$incrementCollector$2$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new DataStoreImpl$incrementCollector$2$1(this.E, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            DataStoreImpl.InitDataStore e2 = this.E.f20557i;
            this.D = 1;
            if (e2.a(this) == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else if (i2 == 2) {
            ResultKt.b(obj);
            return Unit.f40552a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Flow p2 = FlowKt.p(this.E.r().d());
        final DataStoreImpl dataStoreImpl = this.E;
        AnonymousClass1 r1 = new FlowCollector() {
            /* renamed from: a */
            public final Object c(Unit unit, Continuation continuation) {
                if (dataStoreImpl.f20556h.a() instanceof Final) {
                    return Unit.f40552a;
                }
                Object l2 = dataStoreImpl.w(true, continuation);
                return l2 == IntrinsicsKt.f() ? l2 : Unit.f40552a;
            }
        };
        this.D = 2;
        if (p2.a(r1, this) == f2) {
            return f2;
        }
        return Unit.f40552a;
    }
}
