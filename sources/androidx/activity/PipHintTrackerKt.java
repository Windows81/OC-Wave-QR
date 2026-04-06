package androidx.activity;

import android.graphics.Rect;
import android.view.View;
import kotlin.Metadata;

@Metadata
public final class PipHintTrackerKt {
    public static final Rect b(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }
}
