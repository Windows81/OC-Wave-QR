package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2", f = "DataStoreImpl.kt", l = {330, 331, 337}, m = "invokeSuspend")
public final class DataStoreImpl$transformAndWrite$2 extends SuspendLambda implements Function1<Continuation<? super T>, Object> {
    public Object D;
    public int E;
    public final /* synthetic */ DataStoreImpl F;
    public final /* synthetic */ CoroutineContext G;
    public final /* synthetic */ Function2 H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$transformAndWrite$2(DataStoreImpl dataStoreImpl, CoroutineContext coroutineContext, Function2 function2, Continuation continuation) {
        super(1, continuation);
        this.F = dataStoreImpl;
        this.G = coroutineContext;
        this.H = function2;
    }

    public final Continuation A(Continuation continuation) {
        return new DataStoreImpl$transformAndWrite$2(this.F, this.G, this.H, continuation);
    }

    /* renamed from: B */
    public final Object invoke(Continuation continuation) {
        return ((DataStoreImpl$transformAndWrite$2) A(continuation)).x(Unit.f40552a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r8.E
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x002b
            if (r1 == r4) goto L_0x0027
            if (r1 == r3) goto L_0x001f
            if (r1 != r2) goto L_0x0017
            java.lang.Object r0 = r8.D
            kotlin.ResultKt.b(r9)
            goto L_0x006c
        L_0x0017:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x001f:
            java.lang.Object r1 = r8.D
            androidx.datastore.core.Data r1 = (androidx.datastore.core.Data) r1
            kotlin.ResultKt.b(r9)
            goto L_0x0051
        L_0x0027:
            kotlin.ResultKt.b(r9)
            goto L_0x0039
        L_0x002b:
            kotlin.ResultKt.b(r9)
            androidx.datastore.core.DataStoreImpl r9 = r8.F
            r8.E = r4
            java.lang.Object r9 = r9.y(r4, r8)
            if (r9 != r0) goto L_0x0039
            return r0
        L_0x0039:
            r1 = r9
            androidx.datastore.core.Data r1 = (androidx.datastore.core.Data) r1
            kotlin.coroutines.CoroutineContext r9 = r8.G
            androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1 r5 = new androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1
            kotlin.jvm.functions.Function2 r6 = r8.H
            r7 = 0
            r5.<init>(r6, r1, r7)
            r8.D = r1
            r8.E = r3
            java.lang.Object r9 = kotlinx.coroutines.BuildersKt.g(r9, r5, r8)
            if (r9 != r0) goto L_0x0051
            return r0
        L_0x0051:
            r1.b()
            java.lang.Object r1 = r1.c()
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r1, r9)
            if (r1 != 0) goto L_0x006d
            androidx.datastore.core.DataStoreImpl r1 = r8.F
            r8.D = r9
            r8.E = r2
            java.lang.Object r1 = r1.B(r9, r4, r8)
            if (r1 != r0) goto L_0x006b
            return r0
        L_0x006b:
            r0 = r9
        L_0x006c:
            r9 = r0
        L_0x006d:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl$transformAndWrite$2.x(java.lang.Object):java.lang.Object");
    }
}
