package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class ProduceFrameSignal {

    /* renamed from: a  reason: collision with root package name */
    public Object f14766a;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        r0 = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.c(r5), 1);
        r0.G();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        if (a(r3) != androidx.compose.runtime.RecomposerKt.b()) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        b(r3, androidx.compose.runtime.RecomposerKt.a());
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        b(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        if (r1 == null) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0042, code lost:
        r4 = kotlin.Result.f40519A;
        r1.q(kotlin.Result.b(kotlin.Unit.f40552a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004d, code lost:
        r4 = r0.A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0055, code lost:
        if (r4 != kotlin.coroutines.intrinsics.IntrinsicsKt.f()) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0057, code lost:
        kotlin.coroutines.jvm.internal.DebugProbesKt.c(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005e, code lost:
        if (r4 != kotlin.coroutines.intrinsics.IntrinsicsKt.f()) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0060, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0063, code lost:
        return kotlin.Unit.f40552a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0065, code lost:
        throw r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(java.lang.Object r4, kotlin.coroutines.Continuation r5) {
        /*
            r3 = this;
            monitor-enter(r4)
            java.lang.Object r0 = r3.f14766a     // Catch:{ all -> 0x0013 }
            java.lang.Object r1 = androidx.compose.runtime.RecomposerKt.f14822a     // Catch:{ all -> 0x0013 }
            if (r0 != r1) goto L_0x0015
            java.lang.Object r5 = androidx.compose.runtime.RecomposerKt.f14823b     // Catch:{ all -> 0x0013 }
            r3.f14766a = r5     // Catch:{ all -> 0x0013 }
            kotlin.Unit r5 = kotlin.Unit.f40552a     // Catch:{ all -> 0x0013 }
            monitor-exit(r4)
            return r5
        L_0x0013:
            r5 = move-exception
            goto L_0x0066
        L_0x0015:
            kotlin.Unit r0 = kotlin.Unit.f40552a     // Catch:{ all -> 0x0013 }
            monitor-exit(r4)
            kotlinx.coroutines.CancellableContinuationImpl r0 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.c(r5)
            r2 = 1
            r0.<init>(r1, r2)
            r0.G()
            monitor-enter(r4)
            java.lang.Object r1 = r3.f14766a     // Catch:{ all -> 0x0039 }
            java.lang.Object r2 = androidx.compose.runtime.RecomposerKt.f14822a     // Catch:{ all -> 0x0039 }
            if (r1 != r2) goto L_0x003b
            java.lang.Object r1 = androidx.compose.runtime.RecomposerKt.f14823b     // Catch:{ all -> 0x0039 }
            r3.f14766a = r1     // Catch:{ all -> 0x0039 }
            r1 = r0
            goto L_0x003f
        L_0x0039:
            r5 = move-exception
            goto L_0x0064
        L_0x003b:
            r3.f14766a = r0     // Catch:{ all -> 0x0039 }
            r1 = 0
        L_0x003f:
            monitor-exit(r4)
            if (r1 == 0) goto L_0x004d
            kotlin.Result$Companion r4 = kotlin.Result.f40519A
            kotlin.Unit r4 = kotlin.Unit.f40552a
            java.lang.Object r4 = kotlin.Result.b(r4)
            r1.q(r4)
        L_0x004d:
            java.lang.Object r4 = r0.A()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            if (r4 != r0) goto L_0x005a
            kotlin.coroutines.jvm.internal.DebugProbesKt.c(r5)
        L_0x005a:
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            if (r4 != r5) goto L_0x0061
            return r4
        L_0x0061:
            kotlin.Unit r4 = kotlin.Unit.f40552a
            return r4
        L_0x0064:
            monitor-exit(r4)
            throw r5
        L_0x0066:
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ProduceFrameSignal.c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Continuation d() {
        Object obj = this.f14766a;
        if (obj instanceof Continuation) {
            this.f14766a = RecomposerKt.f14823b;
            return (Continuation) obj;
        }
        if (!Intrinsics.d(obj, RecomposerKt.f14822a) && !Intrinsics.d(obj, RecomposerKt.f14823b)) {
            if (obj == null) {
                this.f14766a = RecomposerKt.f14822a;
            } else {
                throw new IllegalStateException(("invalid pendingFrameContinuation " + obj).toString());
            }
        }
        return null;
    }

    public final void e() {
        if (!(this.f14766a == RecomposerKt.f14823b)) {
            PreconditionsKt.b("frame not pending");
        }
        this.f14766a = null;
    }
}
