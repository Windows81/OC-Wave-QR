package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class ShadowKt {
    public static final Shadow a(Shadow shadow, Shadow shadow2, float f2) {
        return new Shadow(ColorKt.h(shadow.c(), shadow2.c(), f2), OffsetKt.b(shadow.d(), shadow2.d(), f2), MathHelpersKt.b(shadow.b(), shadow2.b(), f2), (DefaultConstructorMarker) null);
    }
}
