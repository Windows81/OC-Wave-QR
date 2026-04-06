package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class TouchBoundsExpansionKt {
    public static final DpTouchBoundsExpansion a(float f2, float f3, float f4, float f5) {
        return new DpTouchBoundsExpansion(f2, f3, f4, f5, true, (DefaultConstructorMarker) null);
    }

    public static final long b(int i2, int i3, int i4, int i5) {
        boolean z2 = true;
        if (!(i2 >= 0 && i2 < 32768)) {
            InlineClassHelperKt.a("Start must be in the range of 0 .. 32767");
        }
        if (!(i3 >= 0 && i3 < 32768)) {
            InlineClassHelperKt.a("Top must be in the range of 0 .. 32767");
        }
        if (!(i4 >= 0 && i4 < 32768)) {
            InlineClassHelperKt.a("End must be in the range of 0 .. 32767");
        }
        if (i5 < 0 || i5 >= 32768) {
            z2 = false;
        }
        if (!z2) {
            InlineClassHelperKt.a("Bottom must be in the range of 0 .. 32767");
        }
        return TouchBoundsExpansion.d(TouchBoundsExpansion.f17451b.c(i2, i3, i4, i5, true));
    }

    public static /* synthetic */ long c(int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i2 = 0;
        }
        if ((i6 & 2) != 0) {
            i3 = 0;
        }
        if ((i6 & 4) != 0) {
            i4 = 0;
        }
        if ((i6 & 8) != 0) {
            i5 = 0;
        }
        return b(i2, i3, i4, i5);
    }
}
