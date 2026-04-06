package androidx.compose.ui;

import java.lang.reflect.Field;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;

@Metadata
public final class Actual_jvmKt$tryPopulateReflectively$$inlined$sortedBy$1<T> implements Comparator {
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.d(((Field) obj).getName(), ((Field) obj2).getName());
    }
}
