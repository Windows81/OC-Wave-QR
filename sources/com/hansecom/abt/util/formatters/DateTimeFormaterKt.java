package com.hansecom.abt.util.formatters;

import android.content.res.Configuration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InspectionModeKt;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.FormatStyle;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class DateTimeFormaterKt {
    public static final String a(LocalDate localDate, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-2145588996, i2, -1, "com.hansecom.abt.util.formatters.formatDateTime (DateTimeFormater.kt:46)");
        }
        String b2 = DateTimeFormater.b(DateTimeFormater.f39048a, localDate, (FormatStyle) null, d(composer, 0), 2, (Object) null);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return b2;
    }

    public static final String b(LocalDateTime localDateTime, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(535037615, i2, -1, "com.hansecom.abt.util.formatters.formatDateTime (DateTimeFormater.kt:56)");
        }
        String d2 = DateTimeFormater.d(DateTimeFormater.f39048a, localDateTime, (FormatStyle) null, d(composer, 0), 2, (Object) null);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return d2;
    }

    public static final String c(LocalTime localTime, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-855697091, i2, -1, "com.hansecom.abt.util.formatters.formatDateTime (DateTimeFormater.kt:51)");
        }
        String f2 = DateTimeFormater.f(DateTimeFormater.f39048a, localTime, (FormatStyle) null, d(composer, 0), 2, (Object) null);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return f2;
    }

    public static final Locale d(Composer composer, int i2) {
        Locale locale;
        if (ComposerKt.P()) {
            ComposerKt.Y(350265529, i2, -1, "com.hansecom.abt.util.formatters.getCurrentLocale (DateTimeFormater.kt:61)");
        }
        if (((Boolean) composer.C(InspectionModeKt.a())).booleanValue()) {
            locale = Locale.ROOT;
            Intrinsics.f(locale);
        } else {
            locale = ((Configuration) composer.C(AndroidCompositionLocals_androidKt.f())).getLocales().get(0);
            Intrinsics.f(locale);
        }
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return locale;
    }
}
