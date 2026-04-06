package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.semantics.SemanticsNode;
import java.util.Comparator;
import kotlin.Metadata;

@Metadata
final class LtrBoundsComparator implements Comparator<SemanticsNode> {

    /* renamed from: z  reason: collision with root package name */
    public static final LtrBoundsComparator f17818z = new LtrBoundsComparator();

    /* renamed from: a */
    public int compare(SemanticsNode semanticsNode, SemanticsNode semanticsNode2) {
        Rect j2 = semanticsNode.j();
        Rect j3 = semanticsNode2.j();
        int compare = Float.compare(j2.o(), j3.o());
        if (compare != 0) {
            return compare;
        }
        int compare2 = Float.compare(j2.r(), j3.r());
        if (compare2 != 0) {
            return compare2;
        }
        int compare3 = Float.compare(j2.i(), j3.i());
        return compare3 != 0 ? compare3 : Float.compare(j2.p(), j3.p());
    }
}
