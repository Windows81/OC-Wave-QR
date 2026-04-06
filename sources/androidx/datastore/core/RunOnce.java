package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

@Metadata
public abstract class RunOnce {

    /* renamed from: a  reason: collision with root package name */
    public final Mutex f20624a = MutexKt.b(false, 1, (Object) null);

    /* renamed from: b  reason: collision with root package name */
    public final CompletableDeferred f20625b = CompletableDeferredKt.b((Job) null, 1, (Object) null);

    public final Object a(Continuation continuation) {
        Object G = this.f20625b.G(continuation);
        return G == IntrinsicsKt.f() ? G : Unit.f40552a;
    }

    public abstract Object b(Continuation continuation);

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0072 A[Catch:{ all -> 0x0078 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007c A[SYNTHETIC, Splitter:B:33:0x007c] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.datastore.core.RunOnce$runIfNeeded$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            androidx.datastore.core.RunOnce$runIfNeeded$1 r0 = (androidx.datastore.core.RunOnce$runIfNeeded$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            androidx.datastore.core.RunOnce$runIfNeeded$1 r0 = new androidx.datastore.core.RunOnce$runIfNeeded$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.E
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.G
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x004c
            if (r2 == r4) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r1 = r0.D
            kotlinx.coroutines.sync.Mutex r1 = (kotlinx.coroutines.sync.Mutex) r1
            java.lang.Object r0 = r0.C
            androidx.datastore.core.RunOnce r0 = (androidx.datastore.core.RunOnce) r0
            kotlin.ResultKt.b(r7)     // Catch:{ all -> 0x0035 }
            goto L_0x008b
        L_0x0035:
            r7 = move-exception
            goto L_0x0096
        L_0x0037:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x003f:
            java.lang.Object r2 = r0.D
            kotlinx.coroutines.sync.Mutex r2 = (kotlinx.coroutines.sync.Mutex) r2
            java.lang.Object r4 = r0.C
            androidx.datastore.core.RunOnce r4 = (androidx.datastore.core.RunOnce) r4
            kotlin.ResultKt.b(r7)
            r7 = r2
            goto L_0x006a
        L_0x004c:
            kotlin.ResultKt.b(r7)
            kotlinx.coroutines.CompletableDeferred r7 = r6.f20625b
            boolean r7 = r7.t()
            if (r7 == 0) goto L_0x005a
            kotlin.Unit r7 = kotlin.Unit.f40552a
            return r7
        L_0x005a:
            kotlinx.coroutines.sync.Mutex r7 = r6.f20624a
            r0.C = r6
            r0.D = r7
            r0.G = r4
            java.lang.Object r2 = r7.d(r5, r0)
            if (r2 != r1) goto L_0x0069
            return r1
        L_0x0069:
            r4 = r6
        L_0x006a:
            kotlinx.coroutines.CompletableDeferred r2 = r4.f20625b     // Catch:{ all -> 0x0078 }
            boolean r2 = r2.t()     // Catch:{ all -> 0x0078 }
            if (r2 == 0) goto L_0x007c
            kotlin.Unit r0 = kotlin.Unit.f40552a     // Catch:{ all -> 0x0078 }
            r7.e(r5)
            return r0
        L_0x0078:
            r0 = move-exception
            r1 = r7
            r7 = r0
            goto L_0x0096
        L_0x007c:
            r0.C = r4     // Catch:{ all -> 0x0078 }
            r0.D = r7     // Catch:{ all -> 0x0078 }
            r0.G = r3     // Catch:{ all -> 0x0078 }
            java.lang.Object r0 = r4.b(r0)     // Catch:{ all -> 0x0078 }
            if (r0 != r1) goto L_0x0089
            return r1
        L_0x0089:
            r1 = r7
            r0 = r4
        L_0x008b:
            kotlinx.coroutines.CompletableDeferred r7 = r0.f20625b     // Catch:{ all -> 0x0035 }
            kotlin.Unit r0 = kotlin.Unit.f40552a     // Catch:{ all -> 0x0035 }
            r7.c0(r0)     // Catch:{ all -> 0x0035 }
            r1.e(r5)
            return r0
        L_0x0096:
            r1.e(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.RunOnce.c(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
