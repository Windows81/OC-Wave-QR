package androidx.compose.ui.text.android.style;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.Metadata;

@Metadata
public final class TypefaceSpan extends MetricAffectingSpan {

    /* renamed from: a  reason: collision with root package name */
    public final Typeface f18656a;

    public TypefaceSpan(Typeface typeface) {
        this.f18656a = typeface;
    }

    public final void a(Paint paint) {
        paint.setTypeface(this.f18656a);
    }

    public void updateDrawState(TextPaint textPaint) {
        a(textPaint);
    }

    public void updateMeasureState(TextPaint textPaint) {
        a(textPaint);
    }
}
