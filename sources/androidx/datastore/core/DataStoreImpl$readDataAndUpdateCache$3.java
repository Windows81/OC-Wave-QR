package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

@Metadata
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3", f = "DataStoreImpl.kt", l = {298, 300}, m = "invokeSuspend")
public final class DataStoreImpl$readDataAndUpdateCache$3 extends SuspendLambda implements Function1<Continuation<? super Pair<? extends State<T>, ? extends Boolean>>, Object> {
    public Object D;
    public int E;
    public final /* synthetic */ DataStoreImpl F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$readDataAndUpdateCache$3(DataStoreImpl dataStoreImpl, Continuation continuation) {
        super(1, continuation);
        this.F = dataStoreImpl;
    }

    public final Continuation A(Continuation continuation) {
        return new DataStoreImpl$readDataAndUpdateCache$3(this.F, continuation);
    }

    /* renamed from: B */
    public final Object invoke(Continuation continuation) {
        return ((DataStoreImpl$readDataAndUpdateCache$3) A(continuation)).x(Unit.f40552a);
    }

    public final Object x(Object obj) {
        State state;
        Throwable th;
        Object f2 = IntrinsicsKt.f();
        int i2 = this.E;
        if (i2 == 0) {
            ResultKt.b(obj);
            DataStoreImpl dataStoreImpl = this.F;
            this.E = 1;
            obj = dataStoreImpl.y(true, this);
            if (obj == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            try {
                ResultKt.b(obj);
            } catch (Throwable th2) {
                InterProcessCoordinator c2 = this.F.r();
                this.D = th2;
                this.E = 2;
                Object a2 = c2.a(this);
                if (a2 == f2) {
                    return f2;
                }
                th = th2;
                obj = a2;
            }
        } else if (i2 == 2) {
            th = (Throwable) this.D;
            ResultKt.b(obj);
            state = new ReadException(th, ((Number) obj).intValue());
            return TuplesKt.a(state, Boxing.a(true));
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        state = (State) obj;
        return TuplesKt.a(state, Boxing.a(true));
    }
}
