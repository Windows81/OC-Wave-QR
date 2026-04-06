package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;

@Metadata
public final class ContentAlpha {

    /* renamed from: a  reason: collision with root package name */
    public static final ContentAlpha f7561a = new ContentAlpha();

    public final float a(float f2, float f3, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-1528360391, i2, -1, "androidx.compose.material.ContentAlpha.contentAlpha (ContentAlpha.kt:77)");
        }
        long v2 = ((Color) composer.C(ContentColorKt.a())).v();
        if (!MaterialTheme.f7937a.a(composer, 6).o() ? ((double) ColorKt.i(v2)) >= 0.5d : ((double) ColorKt.i(v2)) <= 0.5d) {
            f2 = f3;
        }
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return f2;
    }

    public final float b(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(621183615, i2, -1, "androidx.compose.material.ContentAlpha.<get-disabled> (ContentAlpha.kt:60)");
        }
        float a2 = a(0.38f, 0.38f, composer, ((i2 << 6) & 896) | 54);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return a2;
    }

    public final float c(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(629162431, i2, -1, "androidx.compose.material.ContentAlpha.<get-high> (ContentAlpha.kt:36)");
        }
        float a2 = a(1.0f, 0.87f, composer, ((i2 << 6) & 896) | 54);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return a2;
    }

    public final float d(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(1999054879, i2, -1, "androidx.compose.material.ContentAlpha.<get-medium> (ContentAlpha.kt:48)");
        }
        float a2 = a(0.74f, 0.6f, composer, ((i2 << 6) & 896) | 54);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return a2;
    }
}
