package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class PaddingKt {
    public static final PaddingValues a(float f2) {
        return new PaddingValuesImpl(f2, f2, f2, f2, (DefaultConstructorMarker) null);
    }

    public static final PaddingValues b(float f2, float f3) {
        return new PaddingValuesImpl(f2, f3, f2, f3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ PaddingValues c(float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Dp.m((float) 0);
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.m((float) 0);
        }
        return b(f2, f3);
    }

    public static final PaddingValues d(float f2, float f3, float f4, float f5) {
        return new PaddingValuesImpl(f2, f3, f4, f5, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ PaddingValues e(float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Dp.m((float) 0);
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.m((float) 0);
        }
        if ((i2 & 4) != 0) {
            f4 = Dp.m((float) 0);
        }
        if ((i2 & 8) != 0) {
            f5 = Dp.m((float) 0);
        }
        return d(f2, f3, f4, f5);
    }

    public static final float f(PaddingValues paddingValues, LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? paddingValues.c(layoutDirection) : paddingValues.b(layoutDirection);
    }

    public static final float g(PaddingValues paddingValues, LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? paddingValues.b(layoutDirection) : paddingValues.c(layoutDirection);
    }

    public static final Modifier h(Modifier modifier, PaddingValues paddingValues) {
        return modifier.o0(new PaddingValuesElement(paddingValues, new PaddingKt$padding$4(paddingValues)));
    }

    public static final Modifier i(Modifier modifier, float f2) {
        return modifier.o0(new PaddingElement(f2, f2, f2, f2, true, new PaddingKt$padding$3(f2), (DefaultConstructorMarker) null));
    }

    public static final Modifier j(Modifier modifier, float f2, float f3) {
        return modifier.o0(new PaddingElement(f2, f3, f2, f3, true, new PaddingKt$padding$2(f2, f3), (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ Modifier k(Modifier modifier, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Dp.m((float) 0);
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.m((float) 0);
        }
        return j(modifier, f2, f3);
    }

    public static final Modifier l(Modifier modifier, float f2, float f3, float f4, float f5) {
        return modifier.o0(new PaddingElement(f2, f3, f4, f5, true, new PaddingKt$padding$1(f2, f3, f4, f5), (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ Modifier m(Modifier modifier, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Dp.m((float) 0);
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.m((float) 0);
        }
        if ((i2 & 4) != 0) {
            f4 = Dp.m((float) 0);
        }
        if ((i2 & 8) != 0) {
            f5 = Dp.m((float) 0);
        }
        return l(modifier, f2, f3, f4, f5);
    }
}
