package androidx.compose.ui.layout;

import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
final class FixedSizeIntrinsicsPlaceable extends Placeable {
    public FixedSizeIntrinsicsPlaceable(int i2, int i3) {
        S0(IntSize.c((((long) i3) & 4294967295L) | (((long) i2) << 32)));
    }

    public void R0(long j2, float f2, Function1 function1) {
    }

    public int f0(AlignmentLine alignmentLine) {
        return Integer.MIN_VALUE;
    }
}
