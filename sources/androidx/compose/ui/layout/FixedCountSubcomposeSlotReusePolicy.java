package androidx.compose.ui.layout;

import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;
import kotlin.Metadata;

@Metadata
final class FixedCountSubcomposeSlotReusePolicy implements SubcomposeSlotReusePolicy {

    /* renamed from: a  reason: collision with root package name */
    public final int f17038a;

    public void a(SubcomposeSlotReusePolicy.SlotIdsSet slotIdsSet) {
        int size = slotIdsSet.size();
        int i2 = this.f17038a;
        if (size > i2) {
            slotIdsSet.h(i2);
        }
    }

    public boolean b(Object obj, Object obj2) {
        return true;
    }
}
