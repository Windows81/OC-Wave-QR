package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;

@Metadata
final class MotionEventHelper {

    /* renamed from: a  reason: collision with root package name */
    public static final MotionEventHelper f16832a = new MotionEventHelper();

    public final long a(MotionEvent motionEvent, int i2) {
        float a2 = motionEvent.getRawX(i2);
        return Offset.e((((long) Float.floatToRawIntBits(motionEvent.getRawY(i2))) & 4294967295L) | (((long) Float.floatToRawIntBits(a2)) << 32));
    }
}
