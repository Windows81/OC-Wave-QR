package androidx.compose.foundation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.StringResources_androidKt;
import kotlin.Metadata;

@Metadata
public final class BasicTooltipStrings {

    /* renamed from: a  reason: collision with root package name */
    public static final BasicTooltipStrings f2963a = new BasicTooltipStrings();

    public final String a(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(1416633714, i2, -1, "androidx.compose.foundation.BasicTooltipStrings.description (BasicTooltip.android.kt:26)");
        }
        String b2 = StringResources_androidKt.b(R.string.f3153b, composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return b2;
    }

    public final String b(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(187295226, i2, -1, "androidx.compose.foundation.BasicTooltipStrings.label (BasicTooltip.android.kt:24)");
        }
        String b2 = StringResources_androidKt.b(R.string.f3154c, composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return b2;
    }
}
