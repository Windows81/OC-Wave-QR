package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Set;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.Channel;

public final /* synthetic */ class A implements Function2 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Channel f14528z;

    public /* synthetic */ A(Channel channel) {
        this.f14528z = channel;
    }

    public final Object m(Object obj, Object obj2) {
        return SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.E(this.f14528z, (Set) obj, (Snapshot) obj2);
    }
}
