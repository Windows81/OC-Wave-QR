package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

@Metadata
public final class SingleProcessCoordinator implements InterProcessCoordinator {

    /* renamed from: a  reason: collision with root package name */
    public final String f20636a;

    /* renamed from: b  reason: collision with root package name */
    public final Mutex f20637b = MutexKt.b(false, 1, (Object) null);

    /* renamed from: c  reason: collision with root package name */
    public final AtomicInt f20638c = new AtomicInt(0);

    /* renamed from: d  reason: collision with root package name */
    public final Flow f20639d = FlowKt.I(new SingleProcessCoordinator$updateNotifications$1((Continuation) null));

    public SingleProcessCoordinator(String str) {
        Intrinsics.i(str, "filePath");
        this.f20636a = str;
    }

    public Object a(Continuation continuation) {
        return Boxing.c(this.f20638c.b());
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(kotlin.jvm.functions.Function2 r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.datastore.core.SingleProcessCoordinator$tryLock$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.datastore.core.SingleProcessCoordinator$tryLock$1 r0 = (androidx.datastore.core.SingleProcessCoordinator$tryLock$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            androidx.datastore.core.SingleProcessCoordinator$tryLock$1 r0 = new androidx.datastore.core.SingleProcessCoordinator$tryLock$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.E
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.G
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            boolean r7 = r0.D
            java.lang.Object r0 = r0.C
            kotlinx.coroutines.sync.Mutex r0 = (kotlinx.coroutines.sync.Mutex) r0
            kotlin.ResultKt.b(r8)     // Catch:{ all -> 0x0030 }
            goto L_0x0057
        L_0x0030:
            r8 = move-exception
            goto L_0x0061
        L_0x0032:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003a:
            kotlin.ResultKt.b(r8)
            kotlinx.coroutines.sync.Mutex r8 = r6.f20637b
            boolean r2 = r8.a(r4)
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.a(r2)     // Catch:{ all -> 0x005d }
            r0.C = r8     // Catch:{ all -> 0x005d }
            r0.D = r2     // Catch:{ all -> 0x005d }
            r0.G = r3     // Catch:{ all -> 0x005d }
            java.lang.Object r7 = r7.m(r5, r0)     // Catch:{ all -> 0x005d }
            if (r7 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r0 = r8
            r8 = r7
            r7 = r2
        L_0x0057:
            if (r7 == 0) goto L_0x005c
            r0.e(r4)
        L_0x005c:
            return r8
        L_0x005d:
            r7 = move-exception
            r0 = r8
            r8 = r7
            r7 = r2
        L_0x0061:
            if (r7 == 0) goto L_0x0066
            r0.e(r4)
        L_0x0066:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessCoordinator.b(kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0067 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(kotlin.jvm.functions.Function1 r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.datastore.core.SingleProcessCoordinator$lock$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            androidx.datastore.core.SingleProcessCoordinator$lock$1 r0 = (androidx.datastore.core.SingleProcessCoordinator$lock$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            androidx.datastore.core.SingleProcessCoordinator$lock$1 r0 = new androidx.datastore.core.SingleProcessCoordinator$lock$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.E
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.G
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0049
            if (r2 == r4) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r8 = r0.C
            kotlinx.coroutines.sync.Mutex r8 = (kotlinx.coroutines.sync.Mutex) r8
            kotlin.ResultKt.b(r9)     // Catch:{ all -> 0x0031 }
            goto L_0x006b
        L_0x0031:
            r9 = move-exception
            goto L_0x0073
        L_0x0033:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003b:
            java.lang.Object r8 = r0.D
            kotlinx.coroutines.sync.Mutex r8 = (kotlinx.coroutines.sync.Mutex) r8
            java.lang.Object r2 = r0.C
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            kotlin.ResultKt.b(r9)
            r9 = r8
            r8 = r2
            goto L_0x005b
        L_0x0049:
            kotlin.ResultKt.b(r9)
            kotlinx.coroutines.sync.Mutex r9 = r7.f20637b
            r0.C = r8
            r0.D = r9
            r0.G = r4
            java.lang.Object r2 = r9.d(r5, r0)
            if (r2 != r1) goto L_0x005b
            return r1
        L_0x005b:
            r0.C = r9     // Catch:{ all -> 0x006f }
            r0.D = r5     // Catch:{ all -> 0x006f }
            r0.G = r3     // Catch:{ all -> 0x006f }
            java.lang.Object r8 = r8.invoke(r0)     // Catch:{ all -> 0x006f }
            if (r8 != r1) goto L_0x0068
            return r1
        L_0x0068:
            r6 = r9
            r9 = r8
            r8 = r6
        L_0x006b:
            r8.e(r5)
            return r9
        L_0x006f:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L_0x0073:
            r8.e(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessCoordinator.c(kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public Flow d() {
        return this.f20639d;
    }

    public Object e(Continuation continuation) {
        return Boxing.c(this.f20638c.d());
    }
}
