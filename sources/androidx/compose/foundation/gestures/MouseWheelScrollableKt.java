package androidx.compose.foundation.gestures;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

@Metadata
public final class MouseWheelScrollableKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f3526a = Dp.m((float) 6);

    /* renamed from: b  reason: collision with root package name */
    public static final float f3527b = Dp.m((float) 1);

    public static final boolean d(float f2) {
        return Float.isNaN(f2) || Math.abs(f2) < 0.5f;
    }
}
