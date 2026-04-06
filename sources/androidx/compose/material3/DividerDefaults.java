package androidx.compose.material3;

import androidx.compose.material3.tokens.DividerTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;

@Metadata
public final class DividerDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final DividerDefaults f9860a = new DividerDefaults();

    /* renamed from: b  reason: collision with root package name */
    public static final float f9861b = DividerTokens.f13051a.b();

    public final long a(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(77461041, i2, -1, "androidx.compose.material3.DividerDefaults.<get-color> (Divider.kt:116)");
        }
        long k2 = ColorSchemeKt.k(DividerTokens.f13051a.a(), composer, 6);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return k2;
    }

    public final float b() {
        return f9861b;
    }
}
