package androidx.compose.material;

import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class DrawerDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final DrawerDefaults f7703a = new DrawerDefaults();

    /* renamed from: b  reason: collision with root package name */
    public static final TweenSpec f7704b = new TweenSpec(256, 0, (Easing) null, 6, (DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final float f7705c = Dp.m((float) 16);

    public final TweenSpec a() {
        return f7704b;
    }

    public final long b(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-788676020, i2, -1, "androidx.compose.material.DrawerDefaults.<get-backgroundColor> (Drawer.kt:708)");
        }
        long n2 = MaterialTheme.f7937a.a(composer, 6).n();
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return n2;
    }

    public final float c() {
        return f7705c;
    }

    public final long d(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(617225966, i2, -1, "androidx.compose.material.DrawerDefaults.<get-scrimColor> (Drawer.kt:719)");
        }
        long l2 = Color.l(MaterialTheme.f7937a.a(composer, 6).i(), 0.32f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return l2;
    }

    public final Shape e(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(2041803618, i2, -1, "androidx.compose.material.DrawerDefaults.<get-shape> (Drawer.kt:715)");
        }
        CornerBasedShape a2 = MaterialTheme.f7937a.b(composer, 6).a();
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return a2;
    }
}
