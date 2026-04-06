package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;

@Metadata
public interface ScrollConfig {
    boolean a(PointerEvent pointerEvent) {
        return false;
    }

    boolean b() {
        return true;
    }

    long c(Density density, PointerEvent pointerEvent, long j2);
}
