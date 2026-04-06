package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

@Metadata
final class DefaultElevationOverlay implements ElevationOverlay {

    /* renamed from: a  reason: collision with root package name */
    public static final DefaultElevationOverlay f7594a = new DefaultElevationOverlay();

    public long a(long j2, float f2, Composer composer, int i2) {
        composer.X(-1687113661);
        if (ComposerKt.P()) {
            ComposerKt.Y(-1687113661, i2, -1, "androidx.compose.material.DefaultElevationOverlay.apply (ElevationOverlay.kt:67)");
        }
        Colors a2 = MaterialTheme.f7937a.a(composer, 6);
        if (Dp.l(f2, Dp.m((float) 0)) <= 0 || a2.o()) {
            composer.X(1169156439);
            composer.M();
        } else {
            composer.X(1169017931);
            j2 = ColorKt.g(ElevationOverlayKt.b(j2, f2, composer, i2 & 126), j2);
            composer.M();
        }
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return j2;
    }
}
