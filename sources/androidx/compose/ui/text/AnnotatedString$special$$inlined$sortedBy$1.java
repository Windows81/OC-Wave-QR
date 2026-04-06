package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;

@Metadata
public final class AnnotatedString$special$$inlined$sortedBy$1<T> implements Comparator {
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.d(Integer.valueOf(((AnnotatedString.Range) obj).h()), Integer.valueOf(((AnnotatedString.Range) obj2).h()));
    }
}
