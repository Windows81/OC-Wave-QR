package androidx.compose.ui.text.android.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.compose.ui.text.android.TextLayout_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class IndentationFixSpan implements LeadingMarginSpan {
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i2, int i3, int i4, int i5, int i6, CharSequence charSequence, int i7, int i8, boolean z2, Layout layout) {
        int lineForOffset;
        if (layout != null && paint != null && (lineForOffset = layout.getLineForOffset(i7)) == layout.getLineCount() - 1 && TextLayout_androidKt.m(layout, lineForOffset)) {
            float a2 = IndentationFixSpan_androidKt.a(layout, lineForOffset, paint) + IndentationFixSpan_androidKt.c(layout, lineForOffset, paint);
            if (a2 != 0.0f) {
                Intrinsics.f(canvas);
                canvas.translate(a2, 0.0f);
            }
        }
    }

    public int getLeadingMargin(boolean z2) {
        return 0;
    }
}
