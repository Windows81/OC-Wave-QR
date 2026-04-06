package androidx.compose.runtime.snapshots;

import java.util.Set;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class k implements Function2 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SnapshotStateObserver f15380z;

    public /* synthetic */ k(SnapshotStateObserver snapshotStateObserver) {
        this.f15380z = snapshotStateObserver;
    }

    public final Object m(Object obj, Object obj2) {
        return SnapshotStateObserver.e(this.f15380z, (Set) obj, (Snapshot) obj2);
    }
}
