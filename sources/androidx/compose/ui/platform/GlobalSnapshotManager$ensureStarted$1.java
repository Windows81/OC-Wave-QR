package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;

@Metadata
@DebugMetadata(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", l = {67}, m = "invokeSuspend")
public final class GlobalSnapshotManager$ensureStarted$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public Object D;
    public Object E;
    public int F;
    public final /* synthetic */ Channel G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GlobalSnapshotManager$ensureStarted$1(Channel channel, Continuation continuation) {
        super(2, continuation);
        this.G = channel;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((GlobalSnapshotManager$ensureStarted$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new GlobalSnapshotManager$ensureStarted$1(this.G, continuation);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005f, code lost:
        kotlinx.coroutines.channels.ChannelsKt.b(r3, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0062, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0040 A[Catch:{ all -> 0x005e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r5.F
            r2 = 1
            if (r1 == 0) goto L_0x0021
            if (r1 != r2) goto L_0x0019
            java.lang.Object r1 = r5.E
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r3 = r5.D
            kotlinx.coroutines.channels.ReceiveChannel r3 = (kotlinx.coroutines.channels.ReceiveChannel) r3
            kotlin.ResultKt.b(r6)     // Catch:{ all -> 0x0017 }
            goto L_0x0038
        L_0x0017:
            r6 = move-exception
            goto L_0x005d
        L_0x0019:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0021:
            kotlin.ResultKt.b(r6)
            kotlinx.coroutines.channels.Channel r3 = r5.G
            kotlinx.coroutines.channels.ChannelIterator r6 = r3.iterator()     // Catch:{ all -> 0x0017 }
            r1 = r6
        L_0x002b:
            r5.D = r3     // Catch:{ all -> 0x0017 }
            r5.E = r1     // Catch:{ all -> 0x0017 }
            r5.F = r2     // Catch:{ all -> 0x0017 }
            java.lang.Object r6 = r1.a(r5)     // Catch:{ all -> 0x0017 }
            if (r6 != r0) goto L_0x0038
            return r0
        L_0x0038:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x0017 }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x0017 }
            if (r6 == 0) goto L_0x0054
            java.lang.Object r6 = r1.next()     // Catch:{ all -> 0x0017 }
            kotlin.Unit r6 = (kotlin.Unit) r6     // Catch:{ all -> 0x0017 }
            java.util.concurrent.atomic.AtomicBoolean r6 = androidx.compose.ui.platform.GlobalSnapshotManager.f17779c     // Catch:{ all -> 0x0017 }
            r4 = 0
            r6.set(r4)     // Catch:{ all -> 0x0017 }
            androidx.compose.runtime.snapshots.Snapshot$Companion r6 = androidx.compose.runtime.snapshots.Snapshot.f15255e     // Catch:{ all -> 0x0017 }
            r6.n()     // Catch:{ all -> 0x0017 }
            goto L_0x002b
        L_0x0054:
            kotlin.Unit r6 = kotlin.Unit.f40552a     // Catch:{ all -> 0x0017 }
            r6 = 0
            kotlinx.coroutines.channels.ChannelsKt.b(r3, r6)
            kotlin.Unit r6 = kotlin.Unit.f40552a
            return r6
        L_0x005d:
            throw r6     // Catch:{ all -> 0x005e }
        L_0x005e:
            r0 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.b(r3, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1.x(java.lang.Object):java.lang.Object");
    }
}
