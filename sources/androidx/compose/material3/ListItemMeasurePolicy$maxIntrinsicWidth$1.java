package androidx.compose.material3;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata
public /* synthetic */ class ListItemMeasurePolicy$maxIntrinsicWidth$1 extends FunctionReferenceImpl implements Function2<IntrinsicMeasurable, Integer, Integer> {
    public static final ListItemMeasurePolicy$maxIntrinsicWidth$1 I = new ListItemMeasurePolicy$maxIntrinsicWidth$1();

    public ListItemMeasurePolicy$maxIntrinsicWidth$1() {
        super(2, IntrinsicMeasurable.class, "maxIntrinsicWidth", "maxIntrinsicWidth(I)I", 0);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return v((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
    }

    public final Integer v(IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return Integer.valueOf(intrinsicMeasurable.a0(i2));
    }
}
