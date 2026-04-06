package androidx.compose.ui.text.android;

import android.text.GraphemeClusterSegmentFinder;
import android.text.TextPaint;

/* renamed from: androidx.compose.ui.text.android.a  reason: case insensitive filesystem */
public abstract /* synthetic */ class C0348a {
    public static /* synthetic */ GraphemeClusterSegmentFinder a(CharSequence charSequence, TextPaint textPaint) {
        return new GraphemeClusterSegmentFinder(charSequence, textPaint);
    }
}
