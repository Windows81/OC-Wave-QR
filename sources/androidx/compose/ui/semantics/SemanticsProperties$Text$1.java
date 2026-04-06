package androidx.compose.ui.semantics;

import androidx.compose.ui.text.AnnotatedString;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SemanticsProperties$Text$1 extends Lambda implements Function2<List<? extends AnnotatedString>, List<? extends AnnotatedString>, List<? extends AnnotatedString>> {

    /* renamed from: z  reason: collision with root package name */
    public static final SemanticsProperties$Text$1 f18139z = new SemanticsProperties$Text$1();

    public SemanticsProperties$Text$1() {
        super(2);
    }

    /* renamed from: b */
    public final List m(List list, List list2) {
        List P0;
        if (list == null || (P0 = CollectionsKt.P0(list)) == null) {
            return list2;
        }
        P0.addAll(list2);
        return P0;
    }
}
