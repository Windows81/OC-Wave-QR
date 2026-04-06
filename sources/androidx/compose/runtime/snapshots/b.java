package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class b implements ObserverHandle {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Function2 f15368a;

    public /* synthetic */ b(Function2 function2) {
        this.f15368a = function2;
    }

    public final void d() {
        Snapshot.Companion.j(this.f15368a);
    }
}
