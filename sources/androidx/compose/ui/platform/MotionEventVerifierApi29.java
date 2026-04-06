package androidx.compose.ui.platform;

import android.view.MotionEvent;
import kotlin.Metadata;

@Metadata
final class MotionEventVerifierApi29 {

    /* renamed from: a  reason: collision with root package name */
    public static final MotionEventVerifierApi29 f17820a = new MotionEventVerifierApi29();

    public final boolean a(MotionEvent motionEvent, int i2) {
        return (Float.floatToRawIntBits(motionEvent.getRawX(i2)) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY(i2)) & Integer.MAX_VALUE) < 2139095040;
    }
}
