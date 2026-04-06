package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.Paint;
import kotlin.Metadata;

@Metadata
final class CanvasCompatM {

    /* renamed from: a  reason: collision with root package name */
    public static final CanvasCompatM f18511a = new CanvasCompatM();

    public final void a(Canvas canvas, CharSequence charSequence, int i2, int i3, int i4, int i5, float f2, float f3, boolean z2, Paint paint) {
        canvas.drawTextRun(charSequence, i2, i3, i4, i5, f2, f3, z2, paint);
    }

    public final void b(Canvas canvas, char[] cArr, int i2, int i3, int i4, int i5, float f2, float f3, boolean z2, Paint paint) {
        canvas.drawTextRun(cArr, i2, i3, i4, i5, f2, f3, z2, paint);
    }
}
