package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

@Metadata
@DebugMetadata(c = "androidx.datastore.core.StorageConnectionKt$readData$2", f = "StorageConnection.kt", l = {74}, m = "invokeSuspend")
public final class StorageConnectionKt$readData$2 extends SuspendLambda implements Function3<ReadScope<Object>, Boolean, Continuation<Object>, Object> {
    public int D;
    public /* synthetic */ Object E;

    public StorageConnectionKt$readData$2(Continuation continuation) {
        super(3, continuation);
    }

    public final Object A(ReadScope readScope, boolean z2, Continuation continuation) {
        StorageConnectionKt$readData$2 storageConnectionKt$readData$2 = new StorageConnectionKt$readData$2(continuation);
        storageConnectionKt$readData$2.E = readScope;
        return storageConnectionKt$readData$2.x(Unit.f40552a);
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return A((ReadScope) obj, ((Boolean) obj2).booleanValue(), (Continuation) obj3);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            this.D = 1;
            obj = ((ReadScope) this.E).d(this);
            if (obj == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
