package androidx.compose.material;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class OutlinedTextFieldMeasurePolicy$maxIntrinsicWidth$1 extends Lambda implements Function2<IntrinsicMeasurable, Integer, Integer> {

    /* renamed from: z  reason: collision with root package name */
    public static final OutlinedTextFieldMeasurePolicy$maxIntrinsicWidth$1 f8155z = new OutlinedTextFieldMeasurePolicy$maxIntrinsicWidth$1();

    public OutlinedTextFieldMeasurePolicy$maxIntrinsicWidth$1() {
        super(2);
    }

    public final Integer b(IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return Integer.valueOf(intrinsicMeasurable.a0(i2));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return b((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
    }
}
