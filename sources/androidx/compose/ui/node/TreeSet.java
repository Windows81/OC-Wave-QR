package androidx.compose.ui.node;

import java.util.Comparator;
import kotlin.Metadata;

@Metadata
public final class TreeSet<E> extends java.util.TreeSet<E> {
    public TreeSet(Comparator comparator) {
        super(comparator);
    }

    public /* bridge */ int e() {
        return super.size();
    }

    public final /* bridge */ int size() {
        return e();
    }
}
