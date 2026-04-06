package androidx.compose.ui.input.pointer;

import kotlin.Metadata;

@Metadata
public final class PointerEvent_androidKt {
    public static final int a() {
        return PointerKeyboardModifiers.b(0);
    }

    public static final boolean b(int i2) {
        return (i2 & 4096) != 0;
    }

    public static final boolean c(int i2) {
        return (i2 & 33) != 0;
    }

    public static final boolean d(int i2) {
        return (i2 & 66) != 0;
    }
}
