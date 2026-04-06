package androidx.compose.ui.text.font;

import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

@Metadata
public final class FontWeightKt {
    public static final FontWeight a(FontWeight fontWeight, FontWeight fontWeight2, float f2) {
        return new FontWeight(RangesKt.o(MathHelpersKt.c(fontWeight.y(), fontWeight2.y(), f2), 1, 1000));
    }
}
