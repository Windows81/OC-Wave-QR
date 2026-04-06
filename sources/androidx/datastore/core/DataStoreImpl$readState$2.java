package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$readState$2", f = "DataStoreImpl.kt", l = {218, 226}, m = "invokeSuspend")
public final class DataStoreImpl$readState$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super State<T>>, Object> {
    public int D;
    public final /* synthetic */ DataStoreImpl E;
    public final /* synthetic */ boolean F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$readState$2(DataStoreImpl dataStoreImpl, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.E = dataStoreImpl;
        this.F = z2;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((DataStoreImpl$readState$2) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new DataStoreImpl$readState$2(this.E, this.F, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            if (this.E.f20556h.a() instanceof Final) {
                return this.E.f20556h.a();
            }
            DataStoreImpl dataStoreImpl = this.E;
            this.D = 1;
            if (dataStoreImpl.v(this) == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            try {
                ResultKt.b(obj);
            } catch (Throwable th) {
                return new ReadException(th, -1);
            }
        } else if (i2 == 2) {
            ResultKt.b(obj);
            return (State) obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        DataStoreImpl dataStoreImpl2 = this.E;
        boolean z2 = this.F;
        this.D = 2;
        obj = dataStoreImpl2.w(z2, this);
        if (obj == f2) {
            return f2;
        }
        return (State) obj;
    }
}
