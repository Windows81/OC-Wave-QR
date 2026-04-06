package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

@Metadata
public final class TextFieldCoreModifierKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f6289a = Dp.m((float) 2);

    public static final Rect d(Density density, Rect rect, boolean z2, int i2) {
        return Rect.h(rect, z2 ? ((float) i2) - rect.p() : rect.o(), 0.0f, (z2 ? ((float) i2) - rect.p() : rect.o()) + ((float) density.P1(f6289a)), 0.0f, 10, (Object) null);
    }

    public static final boolean e(Brush brush) {
        return !(brush instanceof SolidColor) || ((SolidColor) brush).c() != 16;
    }

    public static final float f(float f2) {
        if (Float.isNaN(f2) || Float.isInfinite(f2)) {
            return f2;
        }
        return (float) (f2 > 0.0f ? Math.ceil((double) f2) : Math.floor((double) f2));
    }
}
