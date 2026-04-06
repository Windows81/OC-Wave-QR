package androidx.compose.ui.text.android.style;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.Metadata;

@Metadata
public class BaselineShiftSpan extends MetricAffectingSpan {

    /* renamed from: a  reason: collision with root package name */
    public final float f18618a;

    public BaselineShiftSpan(float f2) {
        this.f18618a = f2;
    }

    public void updateDrawState(TextPaint textPaint) {
        textPaint.baselineShift += (int) ((float) Math.ceil((double) (textPaint.ascent() * this.f18618a)));
    }

    public void updateMeasureState(TextPaint textPaint) {
        textPaint.baselineShift += (int) ((float) Math.ceil((double) (textPaint.ascent() * this.f18618a)));
    }
}
