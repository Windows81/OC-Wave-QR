package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata
public final class CardKt {
    public static final void a(Modifier modifier, Shape shape, long j2, long j3, BorderStroke borderStroke, float f2, Function2 function2, Composer composer, int i2, int i3) {
        Composer composer2 = composer;
        int i4 = i2;
        Modifier modifier2 = (i3 & 1) != 0 ? Modifier.f15489d : modifier;
        Shape b2 = (i3 & 2) != 0 ? MaterialTheme.f7937a.b(composer2, 6).b() : shape;
        long n2 = (i3 & 4) != 0 ? MaterialTheme.f7937a.a(composer2, 6).n() : j2;
        long b3 = (i3 & 8) != 0 ? ColorsKt.b(n2, composer2, (i4 >> 6) & 14) : j3;
        BorderStroke borderStroke2 = (i3 & 16) != 0 ? null : borderStroke;
        float m2 = (i3 & 32) != 0 ? Dp.m((float) 1) : f2;
        if (ComposerKt.P()) {
            ComposerKt.Y(1956755640, i4, -1, "androidx.compose.material.Card (Card.kt:64)");
        }
        SurfaceKt.a(modifier2, b2, n2, b3, borderStroke2, m2, function2, composer, 4194302 & i4, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }
}
