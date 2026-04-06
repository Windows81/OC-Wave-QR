package androidx.compose.ui.text.platform;

import android.text.TextPaint;
import kotlin.Metadata;

@Metadata
public final class AndroidTextPaint_androidKt {
    public static final void a(TextPaint textPaint, float f2) {
        if (!Float.isNaN(f2)) {
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            textPaint.setAlpha(Math.round(f2 * ((float) 255)));
        }
    }
}
