package androidx.compose.material3;

import android.content.res.Configuration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

@Metadata
public final class SearchBar_androidKt {
    public static final float a(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(1909557323, i2, -1, "androidx.compose.material3.getWindowContainerHeight (SearchBar.android.kt:27)");
        }
        float m2 = Dp.m((float) ((Configuration) composer.C(AndroidCompositionLocals_androidKt.f())).screenHeightDp);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return m2;
    }
}
