package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextOverflow;
import kotlin.Metadata;

@Metadata
public final class TextPainter {

    /* renamed from: a  reason: collision with root package name */
    public static final TextPainter f18495a = new TextPainter();

    public final void a(Canvas canvas, TextLayoutResult textLayoutResult) {
        boolean z2 = textLayoutResult.i() && !TextOverflow.h(textLayoutResult.l().f(), TextOverflow.f19125b.e());
        if (z2) {
            Rect c2 = RectKt.c(Offset.f15855b.c(), Size.d((((long) Float.floatToRawIntBits((float) ((int) (textLayoutResult.B() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits((float) ((int) (textLayoutResult.B() >> 32)))) << 32)));
            canvas.o();
            Canvas.n(canvas, c2, 0, 2, (Object) null);
        }
        SpanStyle y2 = textLayoutResult.l().i().y();
        TextDecoration s2 = y2.s();
        if (s2 == null) {
            s2 = TextDecoration.f19089b.c();
        }
        TextDecoration textDecoration = s2;
        Shadow r2 = y2.r();
        if (r2 == null) {
            r2 = Shadow.f16116d.a();
        }
        Shadow shadow = r2;
        DrawStyle h2 = y2.h();
        if (h2 == null) {
            h2 = Fill.f16295a;
        }
        DrawStyle drawStyle = h2;
        try {
            Brush f2 = y2.f();
            if (f2 != null) {
                MultiParagraph.J(textLayoutResult.w(), canvas, f2, y2.t() != TextForegroundStyle.Unspecified.f19104b ? y2.t().c() : 1.0f, shadow, textDecoration, drawStyle, 0, 64, (Object) null);
            } else {
                MultiParagraph.H(textLayoutResult.w(), canvas, y2.t() != TextForegroundStyle.Unspecified.f19104b ? y2.t().g() : Color.f15975b.a(), shadow, textDecoration, drawStyle, 0, 32, (Object) null);
            }
        } finally {
            if (z2) {
                canvas.t();
            }
        }
    }
}
