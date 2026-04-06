package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class c implements ObserverHandle {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Function1 f15369a;

    public /* synthetic */ c(Function1 function1) {
        this.f15369a = function1;
    }

    public final void d() {
        Snapshot.Companion.l(this.f15369a);
    }
}
