package androidx.compose.ui.text.android.style;

import android.graphics.Paint;
import kotlin.Metadata;

@Metadata
public final class LineHeightStyleSpan_androidKt {
    public static final int a(Paint.FontMetricsInt fontMetricsInt) {
        return fontMetricsInt.descent - fontMetricsInt.ascent;
    }
}
