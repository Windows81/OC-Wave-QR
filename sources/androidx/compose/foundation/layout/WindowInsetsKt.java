package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class WindowInsetsKt {
    public static final WindowInsets a(int i2, int i3, int i4, int i5) {
        return new FixedIntInsets(i2, i3, i4, i5);
    }

    public static /* synthetic */ WindowInsets b(int i2, int i3, int i4, int i5, int i6, Object obj) {
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
        return a(i2, i3, i4, i5);
    }

    public static final WindowInsets c(float f2, float f3, float f4, float f5) {
        return new FixedDpInsets(f2, f3, f4, f5, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ WindowInsets d(float f2, float f3, float f4, float f5, int i2, Object obj) {
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
        return c(f2, f3, f4, f5);
    }

    public static final WindowInsets e(WindowInsets windowInsets, WindowInsets windowInsets2) {
        return new AddedInsets(windowInsets, windowInsets2);
    }

    public static final WindowInsets f(PaddingValues paddingValues) {
        return new PaddingValuesInsets(paddingValues);
    }

    public static final PaddingValues g(WindowInsets windowInsets, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-1485016250, i2, -1, "androidx.compose.foundation.layout.asPaddingValues (WindowInsets.kt:220)");
        }
        InsetsPaddingValues insetsPaddingValues = new InsetsPaddingValues(windowInsets, (Density) composer.C(CompositionLocalsKt.g()));
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return insetsPaddingValues;
    }

    public static final PaddingValues h(WindowInsets windowInsets, Density density) {
        return new InsetsPaddingValues(windowInsets, density);
    }

    public static final WindowInsets i(WindowInsets windowInsets, WindowInsets windowInsets2) {
        return new ExcludeInsets(windowInsets, windowInsets2);
    }

    public static final WindowInsets j(WindowInsets windowInsets, int i2) {
        return new LimitInsets(windowInsets, i2, (DefaultConstructorMarker) null);
    }

    public static final WindowInsets k(WindowInsets windowInsets, WindowInsets windowInsets2) {
        return new UnionInsets(windowInsets, windowInsets2);
    }
}
