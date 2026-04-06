package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.sync.Mutex;

@Metadata
public final class DataStoreImpl$InitDataStore$doRun$initData$1$api$1 implements InitializerApi<T> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Mutex f20565a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f20566b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f20567c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ DataStoreImpl f20568d;

    public DataStoreImpl$InitDataStore$doRun$initData$1$api$1(Mutex mutex, Ref.BooleanRef booleanRef, Ref.ObjectRef objectRef, DataStoreImpl dataStoreImpl) {
        this.f20565a = mutex;
        this.f20566b = booleanRef;
        this.f20567c = objectRef;
        this.f20568d = dataStoreImpl;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009a A[Catch:{ all -> 0x00d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ba A[Catch:{ all -> 0x0056 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d1 A[Catch:{ all -> 0x003b }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(kotlin.jvm.functions.Function2 r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 r0 = (androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) r0
            int r1 = r0.J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.J = r1
            goto L_0x0018
        L_0x0013:
            androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 r0 = new androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.H
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.J
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0076
            if (r2 == r5) goto L_0x005a
            if (r2 == r4) goto L_0x0046
            if (r2 != r3) goto L_0x003e
            java.lang.Object r11 = r0.E
            java.lang.Object r1 = r0.D
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            java.lang.Object r0 = r0.C
            kotlinx.coroutines.sync.Mutex r0 = (kotlinx.coroutines.sync.Mutex) r0
            kotlin.ResultKt.b(r12)     // Catch:{ all -> 0x003b }
            goto L_0x00cd
        L_0x003b:
            r11 = move-exception
            goto L_0x00e3
        L_0x003e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0046:
            java.lang.Object r11 = r0.E
            androidx.datastore.core.DataStoreImpl r11 = (androidx.datastore.core.DataStoreImpl) r11
            java.lang.Object r2 = r0.D
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref.ObjectRef) r2
            java.lang.Object r4 = r0.C
            kotlinx.coroutines.sync.Mutex r4 = (kotlinx.coroutines.sync.Mutex) r4
            kotlin.ResultKt.b(r12)     // Catch:{ all -> 0x0056 }
            goto L_0x00b2
        L_0x0056:
            r11 = move-exception
            r0 = r4
            goto L_0x00e3
        L_0x005a:
            java.lang.Object r11 = r0.G
            androidx.datastore.core.DataStoreImpl r11 = (androidx.datastore.core.DataStoreImpl) r11
            java.lang.Object r2 = r0.F
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref.ObjectRef) r2
            java.lang.Object r5 = r0.E
            kotlin.jvm.internal.Ref$BooleanRef r5 = (kotlin.jvm.internal.Ref.BooleanRef) r5
            java.lang.Object r7 = r0.D
            kotlinx.coroutines.sync.Mutex r7 = (kotlinx.coroutines.sync.Mutex) r7
            java.lang.Object r8 = r0.C
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            kotlin.ResultKt.b(r12)
            r12 = r7
            r9 = r8
            r8 = r11
            r11 = r9
            goto L_0x0096
        L_0x0076:
            kotlin.ResultKt.b(r12)
            kotlinx.coroutines.sync.Mutex r12 = r10.f20565a
            kotlin.jvm.internal.Ref$BooleanRef r2 = r10.f20566b
            kotlin.jvm.internal.Ref$ObjectRef r7 = r10.f20567c
            androidx.datastore.core.DataStoreImpl r8 = r10.f20568d
            r0.C = r11
            r0.D = r12
            r0.E = r2
            r0.F = r7
            r0.G = r8
            r0.J = r5
            java.lang.Object r5 = r12.d(r6, r0)
            if (r5 != r1) goto L_0x0094
            return r1
        L_0x0094:
            r5 = r2
            r2 = r7
        L_0x0096:
            boolean r5 = r5.f40901z     // Catch:{ all -> 0x00d8 }
            if (r5 != 0) goto L_0x00db
            java.lang.Object r5 = r2.f40908z     // Catch:{ all -> 0x00d8 }
            r0.C = r12     // Catch:{ all -> 0x00d8 }
            r0.D = r2     // Catch:{ all -> 0x00d8 }
            r0.E = r8     // Catch:{ all -> 0x00d8 }
            r0.F = r6     // Catch:{ all -> 0x00d8 }
            r0.G = r6     // Catch:{ all -> 0x00d8 }
            r0.J = r4     // Catch:{ all -> 0x00d8 }
            java.lang.Object r11 = r11.m(r5, r0)     // Catch:{ all -> 0x00d8 }
            if (r11 != r1) goto L_0x00af
            return r1
        L_0x00af:
            r4 = r12
            r12 = r11
            r11 = r8
        L_0x00b2:
            java.lang.Object r5 = r2.f40908z     // Catch:{ all -> 0x0056 }
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r12, r5)     // Catch:{ all -> 0x0056 }
            if (r5 != 0) goto L_0x00d1
            r0.C = r4     // Catch:{ all -> 0x0056 }
            r0.D = r2     // Catch:{ all -> 0x0056 }
            r0.E = r12     // Catch:{ all -> 0x0056 }
            r0.J = r3     // Catch:{ all -> 0x0056 }
            r3 = 0
            java.lang.Object r11 = r11.B(r12, r3, r0)     // Catch:{ all -> 0x0056 }
            if (r11 != r1) goto L_0x00ca
            return r1
        L_0x00ca:
            r11 = r12
            r1 = r2
            r0 = r4
        L_0x00cd:
            r1.f40908z = r11     // Catch:{ all -> 0x003b }
            r2 = r1
            goto L_0x00d2
        L_0x00d1:
            r0 = r4
        L_0x00d2:
            java.lang.Object r11 = r2.f40908z     // Catch:{ all -> 0x003b }
            r0.e(r6)
            return r11
        L_0x00d8:
            r11 = move-exception
            r0 = r12
            goto L_0x00e3
        L_0x00db:
            java.lang.String r11 = "InitializerApi.updateData should not be called after initialization is complete."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00d8 }
            r0.<init>(r11)     // Catch:{ all -> 0x00d8 }
            throw r0     // Catch:{ all -> 0x00d8 }
        L_0x00e3:
            r0.e(r6)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1.a(kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
