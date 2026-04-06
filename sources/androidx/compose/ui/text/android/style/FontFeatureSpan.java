package androidx.compose.ui.text.android.style;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.Metadata;

@Metadata
public final class FontFeatureSpan extends MetricAffectingSpan {

    /* renamed from: a  reason: collision with root package name */
    public final String f18619a;

    public FontFeatureSpan(String str) {
        this.f18619a = str;
    }

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setFontFeatureSettings(this.f18619a);
    }

    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setFontFeatureSettings(this.f18619a);
    }
}
