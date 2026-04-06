package androidx.compose.ui.platform;

import androidx.compose.ui.semantics.SemanticsNode;
import java.util.Comparator;
import kotlin.Metadata;

@Metadata
public final class AndroidComposeViewAccessibilityDelegateCompat_androidKt$special$$inlined$thenBy$1<T> implements Comparator {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Comparator f17573A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Comparator f17574z;

    public AndroidComposeViewAccessibilityDelegateCompat_androidKt$special$$inlined$thenBy$1(Comparator comparator, Comparator comparator2) {
        this.f17574z = comparator;
        this.f17573A = comparator2;
    }

    public final int compare(Object obj, Object obj2) {
        int compare = this.f17574z.compare(obj, obj2);
        return compare != 0 ? compare : this.f17573A.compare(((SemanticsNode) obj).q(), ((SemanticsNode) obj2).q());
    }
}
