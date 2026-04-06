package androidx.compose.material3.internal;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.os.ConfigurationCompat;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata
public final class Strings_androidKt {
    public static final String a(String str, Object... objArr) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
        Intrinsics.h(format, "format(...)");
        return format;
    }

    public static final String b(int i2, Composer composer, int i3) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-907677715, i3, -1, "androidx.compose.material3.internal.getString (Strings.android.kt:30)");
        }
        composer.C(AndroidCompositionLocals_androidKt.f());
        String string = ((Context) composer.C(AndroidCompositionLocals_androidKt.g())).getResources().getString(i2);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return string;
    }

    public static final String c(int i2, Object[] objArr, Composer composer, int i3) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-1427268608, i3, -1, "androidx.compose.material3.internal.getString (Strings.android.kt:38)");
        }
        String b2 = b(i2, composer, i3 & 14);
        Locale d2 = ConfigurationCompat.a((Configuration) composer.C(AndroidCompositionLocals_androidKt.f())).d(0);
        if (d2 == null) {
            d2 = Locale.getDefault();
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.f40914a;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(d2, b2, Arrays.copyOf(copyOf, copyOf.length));
        Intrinsics.h(format, "format(...)");
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return format;
    }
}
