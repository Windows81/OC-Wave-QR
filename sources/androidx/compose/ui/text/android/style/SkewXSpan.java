package androidx.compose.ui.text.android.style;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.Metadata;

@Metadata
public class SkewXSpan extends MetricAffectingSpan {

    /* renamed from: a  reason: collision with root package name */
    public final float f18653a;

    public SkewXSpan(float f2) {
        this.f18653a = f2;
    }

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSkewX(this.f18653a + textPaint.getTextSkewX());
    }

    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSkewX(this.f18653a + textPaint.getTextSkewX());
    }
}
