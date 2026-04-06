package androidx.compose.material;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.material.Strings;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.R;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;

@Metadata
public final class Strings_androidKt {
    public static final String a(int i2, Composer composer, int i3) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-726638443, i3, -1, "androidx.compose.material.getString (Strings.android.kt:25)");
        }
        composer.C(AndroidCompositionLocals_androidKt.f());
        Resources resources = ((Context) composer.C(AndroidCompositionLocals_androidKt.g())).getResources();
        Strings.Companion companion = Strings.f8507b;
        String string = Strings.k(i2, companion.e()) ? resources.getString(R.string.f15533i) : Strings.k(i2, companion.a()) ? resources.getString(R.string.f15526b) : Strings.k(i2, companion.b()) ? resources.getString(R.string.f15527c) : Strings.k(i2, companion.c()) ? resources.getString(R.string.f15528d) : Strings.k(i2, companion.d()) ? resources.getString(R.string.f15530f) : Strings.k(i2, companion.g()) ? resources.getString(R.string.f15536l) : Strings.k(i2, companion.f()) ? resources.getString(R.string.f15535k) : Strings.k(i2, companion.h()) ? resources.getString(R.string.f8218a) : "";
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return string;
    }
}
