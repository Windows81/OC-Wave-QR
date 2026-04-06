package androidx.core.view;

import android.view.View;
import kotlin.Metadata;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

@Metadata
public final class ViewKt {
    public static final Sequence a(View view) {
        return SequencesKt.h(view.getParent(), ViewKt$ancestors$1.I);
    }
}
