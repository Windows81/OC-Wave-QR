package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;

@Metadata
public final class ElevationOverlayKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ProvidableCompositionLocal f7803a = CompositionLocalKt.j(ElevationOverlayKt$LocalElevationOverlay$1.f7806z);

    /* renamed from: b  reason: collision with root package name */
    public static final ProvidableCompositionLocal f7804b = CompositionLocalKt.h((SnapshotMutationPolicy) null, ElevationOverlayKt$LocalAbsoluteElevation$1.f7805z, 1, (Object) null);

    public static final long b(long j2, float f2, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(1613340891, i2, -1, "androidx.compose.material.calculateForegroundColor (ElevationOverlay.kt:85)");
        }
        long l2 = Color.l(ColorsKt.b(j2, composer, i2 & 14), ((((float) Math.log((double) (f2 + ((float) 1)))) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return l2;
    }

    public static final ProvidableCompositionLocal c() {
        return f7804b;
    }

    public static final ProvidableCompositionLocal d() {
        return f7803a;
    }
}
