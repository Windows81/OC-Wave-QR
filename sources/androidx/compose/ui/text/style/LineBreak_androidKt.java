package androidx.compose.ui.text.style;

import kotlin.Metadata;

@Metadata
public final class LineBreak_androidKt {
    public static final int e(int i2, int i3, int i4) {
        return i2 | (i3 << 8) | (i4 << 16);
    }

    public static final int f(int i2) {
        return i2 & 255;
    }

    public static final int g(int i2) {
        return (i2 >> 8) & 255;
    }

    public static final int h(int i2) {
        return (i2 >> 16) & 255;
    }
}
