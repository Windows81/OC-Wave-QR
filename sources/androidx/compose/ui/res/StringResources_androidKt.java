package androidx.compose.ui.res;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.Arrays;
import kotlin.Metadata;

@Metadata
public final class StringResources_androidKt {
    public static final String a(int i2, int i3, Object[] objArr, Composer composer, int i4) {
        if (ComposerKt.P()) {
            ComposerKt.Y(523207213, i4, -1, "androidx.compose.ui.res.pluralStringResource (StringResources.android.kt:88)");
        }
        String quantityString = Resources_androidKt.a(composer, 0).getQuantityString(i2, i3, Arrays.copyOf(objArr, objArr.length));
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return quantityString;
    }

    public static final String b(int i2, Composer composer, int i3) {
        if (ComposerKt.P()) {
            ComposerKt.Y(1223887937, i3, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:32)");
        }
        String string = Resources_androidKt.a(composer, 0).getString(i2);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return string;
    }

    public static final String c(int i2, Object[] objArr, Composer composer, int i3) {
        if (ComposerKt.P()) {
            ComposerKt.Y(2071230100, i3, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:46)");
        }
        String string = Resources_androidKt.a(composer, 0).getString(i2, Arrays.copyOf(objArr, objArr.length));
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return string;
    }
}
