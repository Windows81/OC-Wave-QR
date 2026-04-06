package androidx.compose.ui.text.android.style;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.Metadata;

@Metadata
public final class LetterSpacingSpanPx extends MetricAffectingSpan {

    /* renamed from: a  reason: collision with root package name */
    public final float f18622a;

    public LetterSpacingSpanPx(float f2) {
        this.f18622a = f2;
    }

    public final void a(TextPaint textPaint) {
        float textSize = textPaint.getTextSize() * textPaint.getTextScaleX();
        if (textSize != 0.0f) {
            textPaint.setLetterSpacing(this.f18622a / textSize);
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        a(textPaint);
    }

    public void updateMeasureState(TextPaint textPaint) {
        a(textPaint);
    }
}
