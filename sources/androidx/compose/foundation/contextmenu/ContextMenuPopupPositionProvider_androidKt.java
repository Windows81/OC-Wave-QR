package androidx.compose.foundation.contextmenu;

import kotlin.Metadata;

@Metadata
public final class ContextMenuPopupPositionProvider_androidKt {
    public static final int a(int i2, int i3, boolean z2) {
        return f(i2, i3, !z2);
    }

    public static final int b(int i2, int i3, int i4, boolean z2) {
        return i3 >= i4 ? f(i3, i4, z2) : g(i2, i3, i4, z2) ? e(i2, i3, z2) : h(i2, i3, i4, z2) ? d(i2, i3, z2) : a(i3, i4, z2);
    }

    public static /* synthetic */ int c(int i2, int i3, int i4, boolean z2, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            z2 = true;
        }
        return b(i2, i3, i4, z2);
    }

    public static final int d(int i2, int i3, boolean z2) {
        return e(i2, i3, !z2);
    }

    public static final int e(int i2, int i3, boolean z2) {
        return z2 ? i2 : i2 - i3;
    }

    public static final int f(int i2, int i3, boolean z2) {
        if (z2) {
            return 0;
        }
        return i3 - i2;
    }

    public static final boolean g(int i2, int i3, int i4, boolean z2) {
        return h(i2, i3, i4, !z2);
    }

    public static final boolean h(int i2, int i3, int i4, boolean z2) {
        if (z2) {
            if (i3 > i2) {
                return false;
            }
        } else if (i4 - i3 <= i2) {
            return false;
        }
        return true;
    }
}
