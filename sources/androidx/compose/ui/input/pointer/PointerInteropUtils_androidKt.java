package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class PointerInteropUtils_androidKt {
    public static final void a(long j2, Function1 function1) {
        MotionEvent obtain = MotionEvent.obtain(j2, j2, 3, 0.0f, 0.0f, 0);
        obtain.setSource(0);
        function1.invoke(obtain);
        obtain.recycle();
    }

    public static final void b(PointerEvent pointerEvent, long j2, Function1 function1) {
        d(pointerEvent, j2, function1, true);
    }

    public static final void c(PointerEvent pointerEvent, long j2, Function1 function1) {
        d(pointerEvent, j2, function1, false);
    }

    public static final void d(PointerEvent pointerEvent, long j2, Function1 function1, boolean z2) {
        MotionEvent g2 = pointerEvent.g();
        if (g2 != null) {
            int action = g2.getAction();
            if (z2) {
                g2.setAction(3);
            }
            int i2 = (int) (j2 >> 32);
            int i3 = (int) (j2 & 4294967295L);
            g2.offsetLocation(-Float.intBitsToFloat(i2), -Float.intBitsToFloat(i3));
            function1.invoke(g2);
            g2.offsetLocation(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3));
            g2.setAction(action);
            return;
        }
        throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
    }
}
