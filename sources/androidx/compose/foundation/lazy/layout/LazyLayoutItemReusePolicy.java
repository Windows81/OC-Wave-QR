package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class LazyLayoutItemReusePolicy implements SubcomposeSlotReusePolicy {

    /* renamed from: a  reason: collision with root package name */
    public final LazyLayoutItemContentFactory f4872a;

    /* renamed from: b  reason: collision with root package name */
    public final MutableObjectIntMap f4873b = ObjectIntMapKt.b();

    public LazyLayoutItemReusePolicy(LazyLayoutItemContentFactory lazyLayoutItemContentFactory) {
        this.f4872a = lazyLayoutItemContentFactory;
    }

    public void a(SubcomposeSlotReusePolicy.SlotIdsSet slotIdsSet) {
        this.f4873b.j();
        for (Object next : slotIdsSet) {
            Object c2 = this.f4872a.c(next);
            int e2 = this.f4873b.e(c2, 0);
            if (e2 == 7) {
                slotIdsSet.remove(next);
            } else {
                this.f4873b.u(c2, e2 + 1);
            }
        }
    }

    public boolean b(Object obj, Object obj2) {
        return Intrinsics.d(this.f4872a.c(obj), this.f4872a.c(obj2));
    }
}
