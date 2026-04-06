package androidx.compose.ui.text.android.style;

import android.graphics.Paint;
import kotlin.Metadata;

@Metadata
public final class LineHeightSpan implements android.text.style.LineHeightSpan {

    /* renamed from: a  reason: collision with root package name */
    public final float f18623a;

    public LineHeightSpan(float f2) {
        this.f18623a = f2;
    }

    public void chooseHeight(CharSequence charSequence, int i2, int i3, int i4, int i5, Paint.FontMetricsInt fontMetricsInt) {
        int a2 = LineHeightStyleSpan_androidKt.a(fontMetricsInt);
        if (a2 > 0) {
            int ceil = (int) ((float) Math.ceil((double) this.f18623a));
            int ceil2 = (int) Math.ceil(((double) fontMetricsInt.descent) * ((double) ((((float) ceil) * 1.0f) / ((float) a2))));
            fontMetricsInt.descent = ceil2;
            fontMetricsInt.ascent = ceil2 - ceil;
        }
    }
}
