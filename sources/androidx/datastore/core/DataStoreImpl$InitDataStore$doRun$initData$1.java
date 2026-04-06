package androidx.datastore.core;

import androidx.datastore.core.DataStoreImpl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

@Metadata
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1", f = "DataStoreImpl.kt", l = {437, 458, 546, 468}, m = "invokeSuspend")
public final class DataStoreImpl$InitDataStore$doRun$initData$1 extends SuspendLambda implements Function1<Continuation<? super Data<T>>, Object> {
    public Object D;
    public Object E;
    public Object F;
    public Object G;
    public Object H;
    public int I;
    public int J;
    public final /* synthetic */ DataStoreImpl K;
    public final /* synthetic */ DataStoreImpl.InitDataStore L;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$InitDataStore$doRun$initData$1(DataStoreImpl dataStoreImpl, DataStoreImpl.InitDataStore initDataStore, Continuation continuation) {
        super(1, continuation);
        this.K = dataStoreImpl;
        this.L = initDataStore;
    }

    public final Continuation A(Continuation continuation) {
        return new DataStoreImpl$InitDataStore$doRun$initData$1(this.K, this.L, continuation);
    }

    /* renamed from: B */
    public final Object invoke(Continuation continuation) {
        return ((DataStoreImpl$InitDataStore$doRun$initData$1) A(continuation)).x(Unit.f40552a);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00e6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x010d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x010e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r12.J
            r2 = 0
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r1 == 0) goto L_0x0064
            if (r1 == r6) goto L_0x0050
            if (r1 == r5) goto L_0x0038
            if (r1 == r4) goto L_0x0027
            if (r1 != r3) goto L_0x001f
            int r0 = r12.I
            java.lang.Object r1 = r12.D
            kotlin.ResultKt.b(r13)
            goto L_0x010f
        L_0x001f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0027:
            java.lang.Object r1 = r12.F
            kotlinx.coroutines.sync.Mutex r1 = (kotlinx.coroutines.sync.Mutex) r1
            java.lang.Object r4 = r12.E
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
            java.lang.Object r5 = r12.D
            kotlin.jvm.internal.Ref$BooleanRef r5 = (kotlin.jvm.internal.Ref.BooleanRef) r5
            kotlin.ResultKt.b(r13)
            goto L_0x00e8
        L_0x0038:
            java.lang.Object r1 = r12.H
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r8 = r12.G
            androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1 r8 = (androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1) r8
            java.lang.Object r9 = r12.F
            kotlin.jvm.internal.Ref$ObjectRef r9 = (kotlin.jvm.internal.Ref.ObjectRef) r9
            java.lang.Object r10 = r12.E
            kotlin.jvm.internal.Ref$BooleanRef r10 = (kotlin.jvm.internal.Ref.BooleanRef) r10
            java.lang.Object r11 = r12.D
            kotlinx.coroutines.sync.Mutex r11 = (kotlinx.coroutines.sync.Mutex) r11
            kotlin.ResultKt.b(r13)
            goto L_0x00aa
        L_0x0050:
            java.lang.Object r1 = r12.G
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            java.lang.Object r8 = r12.F
            kotlin.jvm.internal.Ref$ObjectRef r8 = (kotlin.jvm.internal.Ref.ObjectRef) r8
            java.lang.Object r9 = r12.E
            kotlin.jvm.internal.Ref$BooleanRef r9 = (kotlin.jvm.internal.Ref.BooleanRef) r9
            java.lang.Object r10 = r12.D
            kotlinx.coroutines.sync.Mutex r10 = (kotlinx.coroutines.sync.Mutex) r10
            kotlin.ResultKt.b(r13)
            goto L_0x0089
        L_0x0064:
            kotlin.ResultKt.b(r13)
            kotlinx.coroutines.sync.Mutex r10 = kotlinx.coroutines.sync.MutexKt.b(r2, r6, r7)
            kotlin.jvm.internal.Ref$BooleanRef r9 = new kotlin.jvm.internal.Ref$BooleanRef
            r9.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
            r1.<init>()
            androidx.datastore.core.DataStoreImpl r13 = r12.K
            r12.D = r10
            r12.E = r9
            r12.F = r1
            r12.G = r1
            r12.J = r6
            java.lang.Object r13 = r13.y(r6, r12)
            if (r13 != r0) goto L_0x0088
            return r0
        L_0x0088:
            r8 = r1
        L_0x0089:
            androidx.datastore.core.Data r13 = (androidx.datastore.core.Data) r13
            java.lang.Object r13 = r13.c()
            r1.f40908z = r13
            androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1 r13 = new androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1
            androidx.datastore.core.DataStoreImpl r1 = r12.K
            r13.<init>(r10, r9, r8, r1)
            androidx.datastore.core.DataStoreImpl$InitDataStore r1 = r12.L
            java.util.List r1 = r1.f20563c
            if (r1 == 0) goto L_0x00cd
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r13
        L_0x00aa:
            boolean r13 = r1.hasNext()
            if (r13 == 0) goto L_0x00c9
            java.lang.Object r13 = r1.next()
            kotlin.jvm.functions.Function2 r13 = (kotlin.jvm.functions.Function2) r13
            r12.D = r11
            r12.E = r10
            r12.F = r9
            r12.G = r8
            r12.H = r1
            r12.J = r5
            java.lang.Object r13 = r13.m(r8, r12)
            if (r13 != r0) goto L_0x00aa
            return r0
        L_0x00c9:
            r8 = r9
            r5 = r10
            r1 = r11
            goto L_0x00cf
        L_0x00cd:
            r5 = r9
            r1 = r10
        L_0x00cf:
            androidx.datastore.core.DataStoreImpl$InitDataStore r13 = r12.L
            r13.f20563c = r7
            r12.D = r5
            r12.E = r8
            r12.F = r1
            r12.G = r7
            r12.H = r7
            r12.J = r4
            java.lang.Object r13 = r1.d(r7, r12)
            if (r13 != r0) goto L_0x00e7
            return r0
        L_0x00e7:
            r4 = r8
        L_0x00e8:
            r5.f40901z = r6     // Catch:{ all -> 0x011b }
            kotlin.Unit r13 = kotlin.Unit.f40552a     // Catch:{ all -> 0x011b }
            r1.e(r7)
            java.lang.Object r1 = r4.f40908z
            if (r1 == 0) goto L_0x00f7
            int r2 = r1.hashCode()
        L_0x00f7:
            androidx.datastore.core.DataStoreImpl r13 = r12.K
            androidx.datastore.core.InterProcessCoordinator r13 = r13.r()
            r12.D = r1
            r12.E = r7
            r12.F = r7
            r12.I = r2
            r12.J = r3
            java.lang.Object r13 = r13.a(r12)
            if (r13 != r0) goto L_0x010e
            return r0
        L_0x010e:
            r0 = r2
        L_0x010f:
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            androidx.datastore.core.Data r2 = new androidx.datastore.core.Data
            r2.<init>(r1, r0, r13)
            return r2
        L_0x011b:
            r13 = move-exception
            r1.e(r7)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1.x(java.lang.Object):java.lang.Object");
    }
}
