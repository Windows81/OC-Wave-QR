package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

@Metadata
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$writeData$2", f = "DataStoreImpl.kt", l = {352, 353}, m = "invokeSuspend")
public final class DataStoreImpl$writeData$2 extends SuspendLambda implements Function2<WriteScope<T>, Continuation<? super Unit>, Object> {
    public Object D;
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ Ref.IntRef G;
    public final /* synthetic */ DataStoreImpl H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ boolean J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$writeData$2(Ref.IntRef intRef, DataStoreImpl dataStoreImpl, Object obj, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.G = intRef;
        this.H = dataStoreImpl;
        this.I = obj;
        this.J = z2;
    }

    /* renamed from: A */
    public final Object m(WriteScope writeScope, Continuation continuation) {
        return ((DataStoreImpl$writeData$2) s(writeScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        DataStoreImpl$writeData$2 dataStoreImpl$writeData$2 = new DataStoreImpl$writeData$2(this.G, this.H, this.I, this.J, continuation);
        dataStoreImpl$writeData$2.F = obj;
        return dataStoreImpl$writeData$2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r6.E
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0026
            if (r1 == r3) goto L_0x001a
            if (r1 != r2) goto L_0x0012
            kotlin.ResultKt.b(r7)
            goto L_0x005d
        L_0x0012:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x001a:
            java.lang.Object r1 = r6.D
            kotlin.jvm.internal.Ref$IntRef r1 = (kotlin.jvm.internal.Ref.IntRef) r1
            java.lang.Object r3 = r6.F
            androidx.datastore.core.WriteScope r3 = (androidx.datastore.core.WriteScope) r3
            kotlin.ResultKt.b(r7)
            goto L_0x0045
        L_0x0026:
            kotlin.ResultKt.b(r7)
            java.lang.Object r7 = r6.F
            androidx.datastore.core.WriteScope r7 = (androidx.datastore.core.WriteScope) r7
            kotlin.jvm.internal.Ref$IntRef r1 = r6.G
            androidx.datastore.core.DataStoreImpl r4 = r6.H
            androidx.datastore.core.InterProcessCoordinator r4 = r4.r()
            r6.F = r7
            r6.D = r1
            r6.E = r3
            java.lang.Object r3 = r4.e(r6)
            if (r3 != r0) goto L_0x0042
            return r0
        L_0x0042:
            r5 = r3
            r3 = r7
            r7 = r5
        L_0x0045:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r1.f40906z = r7
            java.lang.Object r7 = r6.I
            r1 = 0
            r6.F = r1
            r6.D = r1
            r6.E = r2
            java.lang.Object r7 = r3.a(r7, r6)
            if (r7 != r0) goto L_0x005d
            return r0
        L_0x005d:
            boolean r7 = r6.J
            if (r7 == 0) goto L_0x007d
            androidx.datastore.core.DataStoreImpl r7 = r6.H
            androidx.datastore.core.DataStoreInMemoryCache r7 = r7.f20556h
            androidx.datastore.core.Data r0 = new androidx.datastore.core.Data
            java.lang.Object r1 = r6.I
            if (r1 == 0) goto L_0x0072
            int r2 = r1.hashCode()
            goto L_0x0073
        L_0x0072:
            r2 = 0
        L_0x0073:
            kotlin.jvm.internal.Ref$IntRef r3 = r6.G
            int r3 = r3.f40906z
            r0.<init>(r1, r2, r3)
            r7.c(r0)
        L_0x007d:
            kotlin.Unit r7 = kotlin.Unit.f40552a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl$writeData$2.x(java.lang.Object):java.lang.Object");
    }
}
