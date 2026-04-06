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
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4", f = "DataStoreImpl.kt", l = {306, 309}, m = "invokeSuspend")
public final class DataStoreImpl$readDataAndUpdateCache$4 extends SuspendLambda implements Function2<Boolean, Continuation<? super Pair<? extends State<T>, ? extends Boolean>>, Object> {
    public Object D;
    public int E;
    public /* synthetic */ boolean F;
    public final /* synthetic */ DataStoreImpl G;
    public final /* synthetic */ int H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$readDataAndUpdateCache$4(DataStoreImpl dataStoreImpl, int i2, Continuation continuation) {
        super(2, continuation);
        this.G = dataStoreImpl;
        this.H = i2;
    }

    public final Object A(boolean z2, Continuation continuation) {
        return ((DataStoreImpl$readDataAndUpdateCache$4) s(Boolean.valueOf(z2), continuation)).x(Unit.f40552a);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return A(((Boolean) obj).booleanValue(), (Continuation) obj2);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        DataStoreImpl$readDataAndUpdateCache$4 dataStoreImpl$readDataAndUpdateCache$4 = new DataStoreImpl$readDataAndUpdateCache$4(this.G, this.H, continuation);
        dataStoreImpl$readDataAndUpdateCache$4.F = ((Boolean) obj).booleanValue();
        return dataStoreImpl$readDataAndUpdateCache$4;
    }

    public final Object x(Object obj) {
        State state;
        boolean z2;
        int i2;
        Throwable th;
        boolean z3;
        Object f2 = IntrinsicsKt.f();
        int i3 = this.E;
        if (i3 == 0) {
            ResultKt.b(obj);
            z2 = this.F;
            DataStoreImpl dataStoreImpl = this.G;
            this.F = z2;
            this.E = 1;
            obj = dataStoreImpl.y(z2, this);
            if (obj == f2) {
                return f2;
            }
        } else if (i3 == 1) {
            z2 = this.F;
            try {
                ResultKt.b(obj);
            } catch (Throwable th2) {
                if (z2) {
                    InterProcessCoordinator c2 = this.G.r();
                    this.D = th2;
                    this.F = z2;
                    this.E = 2;
                    Object a2 = c2.a(this);
                    if (a2 == f2) {
                        return f2;
                    }
                    z3 = z2;
                    th = th2;
                    obj = a2;
                } else {
                    boolean z4 = z2;
                    th = th2;
                    i2 = this.H;
                    z3 = z4;
                }
            }
        } else if (i3 == 2) {
            z3 = this.F;
            th = (Throwable) this.D;
            ResultKt.b(obj);
            i2 = ((Number) obj).intValue();
            ReadException readException = new ReadException(th, i2);
            z2 = z3;
            state = readException;
            return TuplesKt.a(state, Boxing.a(z2));
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        state = (State) obj;
        return TuplesKt.a(state, Boxing.a(z2));
    }
}
