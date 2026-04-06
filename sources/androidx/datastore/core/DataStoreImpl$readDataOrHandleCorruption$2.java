package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2", f = "DataStoreImpl.kt", l = {370, 371}, m = "invokeSuspend")
public final class DataStoreImpl$readDataOrHandleCorruption$2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Data<T>>, Object> {
    public Object D;
    public int E;
    public /* synthetic */ boolean F;
    public final /* synthetic */ DataStoreImpl G;
    public final /* synthetic */ int H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$readDataOrHandleCorruption$2(DataStoreImpl dataStoreImpl, int i2, Continuation continuation) {
        super(2, continuation);
        this.G = dataStoreImpl;
        this.H = i2;
    }

    public final Object A(boolean z2, Continuation continuation) {
        return ((DataStoreImpl$readDataOrHandleCorruption$2) s(Boolean.valueOf(z2), continuation)).x(Unit.f40552a);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return A(((Boolean) obj).booleanValue(), (Continuation) obj2);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        DataStoreImpl$readDataOrHandleCorruption$2 dataStoreImpl$readDataOrHandleCorruption$2 = new DataStoreImpl$readDataOrHandleCorruption$2(this.G, this.H, continuation);
        dataStoreImpl$readDataOrHandleCorruption$2.F = ((Boolean) obj).booleanValue();
        return dataStoreImpl$readDataOrHandleCorruption$2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r5.E
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0022
            if (r1 == r3) goto L_0x001c
            if (r1 != r2) goto L_0x0014
            java.lang.Object r0 = r5.D
            kotlin.ResultKt.b(r6)
            goto L_0x0049
        L_0x0014:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x001c:
            boolean r1 = r5.F
            kotlin.ResultKt.b(r6)
            goto L_0x0034
        L_0x0022:
            kotlin.ResultKt.b(r6)
            boolean r1 = r5.F
            androidx.datastore.core.DataStoreImpl r6 = r5.G
            r5.F = r1
            r5.E = r3
            java.lang.Object r6 = r6.x(r5)
            if (r6 != r0) goto L_0x0034
            return r0
        L_0x0034:
            if (r1 == 0) goto L_0x0050
            androidx.datastore.core.DataStoreImpl r1 = r5.G
            androidx.datastore.core.InterProcessCoordinator r1 = r1.r()
            r5.D = r6
            r5.E = r2
            java.lang.Object r1 = r1.a(r5)
            if (r1 != r0) goto L_0x0047
            return r0
        L_0x0047:
            r0 = r6
            r6 = r1
        L_0x0049:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            goto L_0x0055
        L_0x0050:
            int r0 = r5.H
            r4 = r0
            r0 = r6
            r6 = r4
        L_0x0055:
            androidx.datastore.core.Data r1 = new androidx.datastore.core.Data
            if (r0 == 0) goto L_0x005e
            int r2 = r0.hashCode()
            goto L_0x005f
        L_0x005e:
            r2 = 0
        L_0x005f:
            r1.<init>(r0, r2, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2.x(java.lang.Object):java.lang.Object");
    }
}
