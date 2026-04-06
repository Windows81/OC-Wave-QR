package androidx.compose.ui.layout;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.math.MathKt;

@Metadata
public /* synthetic */ class AlignmentLineKt$LastBaseline$1 extends FunctionReferenceImpl implements Function2<Integer, Integer, Integer> {
    public static final AlignmentLineKt$LastBaseline$1 I = new AlignmentLineKt$LastBaseline$1();

    public AlignmentLineKt$LastBaseline$1() {
        super(2, MathKt.class, "max", "max(II)I", 1);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return v(((Number) obj).intValue(), ((Number) obj2).intValue());
    }

    public final Integer v(int i2, int i3) {
        return Integer.valueOf(Math.max(i2, i3));
    }
}
