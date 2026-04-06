package androidx.core.view;

import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.sequences.Sequence;

@Metadata
public final class ViewGroupKt {
    public static final Sequence a(ViewGroup viewGroup) {
        return new ViewGroupKt$children$1(viewGroup);
    }

    public static final Sequence b(ViewGroup viewGroup) {
        return new ViewGroupKt$special$$inlined$Sequence$1(viewGroup);
    }

    public static final Iterator c(ViewGroup viewGroup) {
        return new ViewGroupKt$iterator$1(viewGroup);
    }
}
