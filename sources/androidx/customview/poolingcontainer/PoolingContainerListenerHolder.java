package androidx.customview.poolingcontainer;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class PoolingContainerListenerHolder {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f20486a = new ArrayList();

    public final void a(PoolingContainerListener poolingContainerListener) {
        Intrinsics.i(poolingContainerListener, "listener");
        this.f20486a.add(poolingContainerListener);
    }

    public final void b(PoolingContainerListener poolingContainerListener) {
        Intrinsics.i(poolingContainerListener, "listener");
        this.f20486a.remove(poolingContainerListener);
    }
}
