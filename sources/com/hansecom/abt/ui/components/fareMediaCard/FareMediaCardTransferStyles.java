package com.hansecom.abt.ui.components.fareMediaCard;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.ui.theme.AbtTheme;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class FareMediaCardTransferStyles {

    /* renamed from: a  reason: collision with root package name */
    public static final FareMediaCardTransferStyles f38210a = new FareMediaCardTransferStyles();

    public final FareMediaCardTransferStyle a(Composer composer, int i2) {
        composer.X(-2114023732);
        if (ComposerKt.P()) {
            ComposerKt.Y(-2114023732, i2, -1, "com.hansecom.abt.ui.components.fareMediaCard.FareMediaCardTransferStyles.<get-Positive> (FareMediaCard.kt:222)");
        }
        AbtTheme abtTheme = AbtTheme.f38851a;
        FareMediaCardTransferStyle fareMediaCardTransferStyle = new FareMediaCardTransferStyle(abtTheme.b(composer, 6).v(), abtTheme.b(composer, 6).m(), (DefaultConstructorMarker) null);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return fareMediaCardTransferStyle;
    }

    public final FareMediaCardTransferStyle b(Composer composer, int i2) {
        composer.X(658810684);
        if (ComposerKt.P()) {
            ComposerKt.Y(658810684, i2, -1, "com.hansecom.abt.ui.components.fareMediaCard.FareMediaCardTransferStyles.<get-Warning> (FareMediaCard.kt:216)");
        }
        AbtTheme abtTheme = AbtTheme.f38851a;
        FareMediaCardTransferStyle fareMediaCardTransferStyle = new FareMediaCardTransferStyle(abtTheme.b(composer, 6).B(), abtTheme.b(composer, 6).s(), (DefaultConstructorMarker) null);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return fareMediaCardTransferStyle;
    }
}
