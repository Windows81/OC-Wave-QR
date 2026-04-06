package androidx.compose.material3;

import android.content.res.Configuration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class Locale24 {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f10253a = new Companion((DefaultConstructorMarker) null);

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Locale a(Composer composer, int i2) {
            if (ComposerKt.P()) {
                ComposerKt.Y(317587697, i2, -1, "androidx.compose.material3.Locale24.Companion.defaultLocale (CalendarLocale.android.kt:43)");
            }
            Locale locale = ((Configuration) composer.C(AndroidCompositionLocals_androidKt.f())).getLocales().get(0);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
            return locale;
        }

        public Companion() {
        }
    }
}
