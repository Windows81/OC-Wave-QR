package androidx.compose.ui.text.android;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.Metadata;

@Metadata
public final class PaintExtensions_androidKt {
    public static final void a(Rect rect, Rect rect2) {
        rect.right += rect2.width();
        rect.top = Math.min(rect.top, rect2.top);
        rect.bottom = Math.max(rect.bottom, rect2.bottom);
    }

    public static final void b(Paint paint, CharSequence charSequence, int i2, int i3, Rect rect) {
        if (Build.VERSION.SDK_INT >= 29) {
            Paint29.a(paint, charSequence, i2, i3, rect);
        } else {
            paint.getTextBounds(charSequence.toString(), i2, i3, rect);
        }
    }

    public static final Rect c(TextPaint textPaint, CharSequence charSequence, int i2, int i3) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            Class<MetricAffectingSpan> cls = MetricAffectingSpan.class;
            if (SpannedExtensions_androidKt.b(spanned, cls, i2, i3)) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i2 < i3) {
                    int nextSpanTransition = spanned.nextSpanTransition(i2, i3, cls);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i2, nextSpanTransition, cls);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    b(textPaint2, charSequence, i2, nextSpanTransition, rect2);
                    a(rect, rect2);
                    i2 = nextSpanTransition;
                }
                return rect;
            }
        }
        return d(textPaint, charSequence, i2, i3);
    }

    public static final Rect d(Paint paint, CharSequence charSequence, int i2, int i3) {
        Rect rect = new Rect();
        b(paint, charSequence, i2, i3, rect);
        return rect;
    }
}
