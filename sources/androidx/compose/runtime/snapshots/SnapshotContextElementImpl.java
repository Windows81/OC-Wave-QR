package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.snapshots.SnapshotContextElement;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.ThreadContextElement;

@Metadata
public final class SnapshotContextElementImpl implements SnapshotContextElement, ThreadContextElement<Snapshot> {

    /* renamed from: z  reason: collision with root package name */
    public final Snapshot f15265z;

    public CoroutineContext.Element d(CoroutineContext.Key key) {
        return SnapshotContextElement.DefaultImpls.b(this, key);
    }

    /* renamed from: e */
    public void X(CoroutineContext coroutineContext, Snapshot snapshot) {
        this.f15265z.A(snapshot);
    }

    /* renamed from: f */
    public Snapshot n0(CoroutineContext coroutineContext) {
        return this.f15265z.z();
    }

    public CoroutineContext g(CoroutineContext.Key key) {
        return SnapshotContextElement.DefaultImpls.c(this, key);
    }

    public CoroutineContext.Key getKey() {
        return SnapshotContextElement.f15263c;
    }

    public Object k(Object obj, Function2 function2) {
        return SnapshotContextElement.DefaultImpls.a(this, obj, function2);
    }

    public CoroutineContext y(CoroutineContext coroutineContext) {
        return SnapshotContextElement.DefaultImpls.d(this, coroutineContext);
    }
}
