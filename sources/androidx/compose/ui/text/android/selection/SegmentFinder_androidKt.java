package androidx.compose.ui.text.android.selection;

import android.os.Build;
import android.text.TextPaint;
import kotlin.Metadata;

@Metadata
public final class SegmentFinder_androidKt {
    public static final SegmentFinder a(CharSequence charSequence, TextPaint textPaint) {
        return Build.VERSION.SDK_INT >= 29 ? new GraphemeClusterSegmentFinderApi29(charSequence, textPaint) : new GraphemeClusterSegmentFinderUnderApi29(charSequence);
    }
}
