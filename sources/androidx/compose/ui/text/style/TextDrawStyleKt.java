package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.SpanStyleKt;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata
public final class TextDrawStyleKt {
    public static final TextForegroundStyle b(TextForegroundStyle textForegroundStyle, TextForegroundStyle textForegroundStyle2, float f2) {
        boolean z2 = textForegroundStyle instanceof BrushStyle;
        return (z2 || (textForegroundStyle2 instanceof BrushStyle)) ? (!z2 || !(textForegroundStyle2 instanceof BrushStyle)) ? (TextForegroundStyle) SpanStyleKt.d(textForegroundStyle, textForegroundStyle2, f2) : TextForegroundStyle.f19102a.a((Brush) SpanStyleKt.d(((BrushStyle) textForegroundStyle).d(), ((BrushStyle) textForegroundStyle2).d(), f2), MathHelpersKt.b(textForegroundStyle.c(), textForegroundStyle2.c(), f2)) : TextForegroundStyle.f19102a.b(ColorKt.h(textForegroundStyle.g(), textForegroundStyle2.g(), f2));
    }

    public static final long c(long j2, float f2) {
        if (Float.isNaN(f2) || f2 >= 1.0f) {
            return j2;
        }
        return Color.l(j2, Color.o(j2) * f2, 0.0f, 0.0f, 0.0f, 14, (Object) null);
    }

    public static final float d(float f2, Function0 function0) {
        return Float.isNaN(f2) ? ((Number) function0.invoke()).floatValue() : f2;
    }
}
