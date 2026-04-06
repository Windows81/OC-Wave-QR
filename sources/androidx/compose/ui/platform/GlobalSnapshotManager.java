package androidx.compose.ui.platform;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

@Metadata
public final class GlobalSnapshotManager {

    /* renamed from: a  reason: collision with root package name */
    public static final GlobalSnapshotManager f17777a = new GlobalSnapshotManager();

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicBoolean f17778b = new AtomicBoolean(false);

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicBoolean f17779c = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    public static final int f17780d = 8;

    public final void b() {
        if (f17778b.compareAndSet(false, true)) {
            Channel b2 = ChannelKt.b(1, (BufferOverflow) null, (Function1) null, 6, (Object) null);
            Job unused = BuildersKt__Builders_commonKt.d(CoroutineScopeKt.a(AndroidUiDispatcher.L.b()), (CoroutineContext) null, (CoroutineStart) null, new GlobalSnapshotManager$ensureStarted$1(b2, (Continuation) null), 3, (Object) null);
            Snapshot.f15255e.k(new GlobalSnapshotManager$ensureStarted$2(b2));
        }
    }
}
