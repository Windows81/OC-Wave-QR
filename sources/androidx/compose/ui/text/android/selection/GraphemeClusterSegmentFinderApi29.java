package androidx.compose.ui.text.android.selection;

import android.text.TextPaint;
import kotlin.Metadata;

@Metadata
public final class GraphemeClusterSegmentFinderApi29 extends GraphemeClusterSegmentFinder {

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f18605a;

    /* renamed from: b  reason: collision with root package name */
    public final TextPaint f18606b;

    public GraphemeClusterSegmentFinderApi29(CharSequence charSequence, TextPaint textPaint) {
        this.f18605a = charSequence;
        this.f18606b = textPaint;
    }

    public int e(int i2) {
        TextPaint textPaint = this.f18606b;
        CharSequence charSequence = this.f18605a;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i2, 0);
    }

    public int f(int i2) {
        TextPaint textPaint = this.f18606b;
        CharSequence charSequence = this.f18605a;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i2, 2);
    }
}
