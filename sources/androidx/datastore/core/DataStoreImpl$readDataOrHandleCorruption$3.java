package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

@Metadata
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3", f = "DataStoreImpl.kt", l = {387, 388, 390}, m = "invokeSuspend")
public final class DataStoreImpl$readDataOrHandleCorruption$3 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    public Object D;
    public int E;
    public final /* synthetic */ Ref.ObjectRef F;
    public final /* synthetic */ DataStoreImpl G;
    public final /* synthetic */ Ref.IntRef H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$readDataOrHandleCorruption$3(Ref.ObjectRef objectRef, DataStoreImpl dataStoreImpl, Ref.IntRef intRef, Continuation continuation) {
        super(1, continuation);
        this.F = objectRef;
        this.G = dataStoreImpl;
        this.H = intRef;
    }

    public final Continuation A(Continuation continuation) {
        return new DataStoreImpl$readDataOrHandleCorruption$3(this.F, this.G, this.H, continuation);
    }

    /* renamed from: B */
    public final Object invoke(Continuation continuation) {
        return ((DataStoreImpl$readDataOrHandleCorruption$3) A(continuation)).x(Unit.f40552a);
    }

    public final Object x(Object obj) {
        Ref.IntRef intRef;
        Ref.IntRef intRef2;
        Ref.ObjectRef objectRef;
        Object f2 = IntrinsicsKt.f();
        int i2 = this.E;
        if (i2 == 0) {
            ResultKt.b(obj);
            objectRef = this.F;
            DataStoreImpl dataStoreImpl = this.G;
            this.D = objectRef;
            this.E = 1;
            obj = dataStoreImpl.x(this);
            if (obj == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            objectRef = (Ref.ObjectRef) this.D;
            ResultKt.b(obj);
        } else if (i2 == 2) {
            intRef2 = (Ref.IntRef) this.D;
            try {
                ResultKt.b(obj);
                intRef2.f40906z = ((Number) obj).intValue();
            } catch (CorruptionException unused) {
                Ref.IntRef intRef3 = this.H;
                DataStoreImpl dataStoreImpl2 = this.G;
                Object obj2 = this.F.f40908z;
                this.D = intRef3;
                this.E = 3;
                Object B2 = dataStoreImpl2.B(obj2, true, this);
                if (B2 == f2) {
                    return f2;
                }
                intRef = intRef3;
                obj = B2;
            }
            return Unit.f40552a;
        } else if (i2 == 3) {
            intRef = (Ref.IntRef) this.D;
            ResultKt.b(obj);
            intRef.f40906z = ((Number) obj).intValue();
            return Unit.f40552a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        objectRef.f40908z = obj;
        intRef2 = this.H;
        InterProcessCoordinator c2 = this.G.r();
        this.D = intRef2;
        this.E = 2;
        obj = c2.a(this);
        if (obj == f2) {
            return f2;
        }
        intRef2.f40906z = ((Number) obj).intValue();
        return Unit.f40552a;
    }
}
