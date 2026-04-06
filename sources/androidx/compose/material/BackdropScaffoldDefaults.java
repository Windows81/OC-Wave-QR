package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSize;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

@Metadata
public final class BackdropScaffoldDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final BackdropScaffoldDefaults f7184a = new BackdropScaffoldDefaults();

    /* renamed from: b  reason: collision with root package name */
    public static final float f7185b = Dp.m((float) 56);

    /* renamed from: c  reason: collision with root package name */
    public static final float f7186c = Dp.m((float) 48);

    /* renamed from: d  reason: collision with root package name */
    public static final float f7187d = Dp.m((float) 1);

    /* renamed from: e  reason: collision with root package name */
    public static final AnimationSpec f7188e = AnimationSpecKt.n(300, 0, EasingKt.d(), 2, (Object) null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f7189f = 8;

    public final AnimationSpec a() {
        return f7188e;
    }

    public final float b() {
        return f7187d;
    }

    public final long c(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(1806270648, i2, -1, "androidx.compose.material.BackdropScaffoldDefaults.<get-frontLayerScrimColor> (BackdropScaffold.kt:628)");
        }
        long l2 = Color.l(MaterialTheme.f7937a.a(composer, 6).n(), 0.6f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return l2;
    }

    public final Shape d(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(1580588700, i2, -1, "androidx.compose.material.BackdropScaffoldDefaults.<get-frontLayerShape> (BackdropScaffold.kt:618)");
        }
        CornerBasedShape a2 = MaterialTheme.f7937a.b(composer, 6).a();
        float f2 = (float) 16;
        CornerBasedShape d2 = CornerBasedShape.d(a2, CornerSizeKt.c(Dp.m(f2)), CornerSizeKt.c(Dp.m(f2)), (CornerSize) null, (CornerSize) null, 12, (Object) null);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return d2;
    }

    public final float e() {
        return f7186c;
    }

    public final float f() {
        return f7185b;
    }
}
