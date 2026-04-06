package androidx.compose.ui.layout;

import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;
import kotlin.Metadata;

@Metadata
final class NoOpSubcomposeSlotReusePolicy implements SubcomposeSlotReusePolicy {

    /* renamed from: a  reason: collision with root package name */
    public static final NoOpSubcomposeSlotReusePolicy f17130a = new NoOpSubcomposeSlotReusePolicy();

    public void a(SubcomposeSlotReusePolicy.SlotIdsSet slotIdsSet) {
        slotIdsSet.clear();
    }

    public boolean b(Object obj, Object obj2) {
        return false;
    }
}
