package androidx.compose.ui.text.android.style;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.Metadata;

@Metadata
public final class LetterSpacingSpanEm extends MetricAffectingSpan {

    /* renamed from: a  reason: collision with root package name */
    public final float f18621a;

    public LetterSpacingSpanEm(float f2) {
        this.f18621a = f2;
    }

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.f18621a);
    }

    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.f18621a);
    }
}
