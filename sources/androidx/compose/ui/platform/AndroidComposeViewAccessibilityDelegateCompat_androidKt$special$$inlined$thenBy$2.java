package androidx.compose.ui.platform;

import androidx.compose.ui.semantics.SemanticsNode;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;

@Metadata
public final class AndroidComposeViewAccessibilityDelegateCompat_androidKt$special$$inlined$thenBy$2<T> implements Comparator {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Comparator f17575z;

    public AndroidComposeViewAccessibilityDelegateCompat_androidKt$special$$inlined$thenBy$2(Comparator comparator) {
        this.f17575z = comparator;
    }

    public final int compare(Object obj, Object obj2) {
        int compare = this.f17575z.compare(obj, obj2);
        return compare != 0 ? compare : ComparisonsKt.d(Integer.valueOf(((SemanticsNode) obj).o()), Integer.valueOf(((SemanticsNode) obj2).o()));
    }
}
