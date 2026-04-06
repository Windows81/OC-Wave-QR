package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.semantics.SemanticsNode;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata
final class TopBottomBoundsComparator implements Comparator<Pair<? extends Rect, ? extends List<SemanticsNode>>> {

    /* renamed from: z  reason: collision with root package name */
    public static final TopBottomBoundsComparator f17885z = new TopBottomBoundsComparator();

    /* renamed from: a */
    public int compare(Pair pair, Pair pair2) {
        int compare = Float.compare(((Rect) pair.e()).r(), ((Rect) pair2.e()).r());
        return compare != 0 ? compare : Float.compare(((Rect) pair.e()).i(), ((Rect) pair2.e()).i());
    }
}
