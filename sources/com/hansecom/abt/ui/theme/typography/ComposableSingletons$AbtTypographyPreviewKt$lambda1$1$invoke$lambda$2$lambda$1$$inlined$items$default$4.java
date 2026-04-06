package com.hansecom.abt.ui.theme.typography;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

@Metadata
/* renamed from: com.hansecom.abt.ui.theme.typography.ComposableSingletons$AbtTypographyPreviewKt$lambda-1$1$invoke$lambda$2$lambda$1$$inlined$items$default$4  reason: invalid class name */
public final class ComposableSingletons$AbtTypographyPreviewKt$lambda1$1$invoke$lambda$2$lambda$1$$inlined$items$default$4 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ List f38967z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$AbtTypographyPreviewKt$lambda1$1$invoke$lambda$2$lambda$1$$inlined$items$default$4(List list) {
        super(4);
        this.f38967z = list;
    }

    public final void b(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
        int i4;
        if ((i3 & 6) == 0) {
            i4 = (composer.W(lazyItemScope) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= composer.i(i2) ? 32 : 16;
        }
        if (composer.E((i4 & 147) != 146, i4 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-632812321, i4, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            AbtTypographyKeyTokens abtTypographyKeyTokens = (AbtTypographyKeyTokens) this.f38967z.get(i2);
            composer.X(-402038489);
            AbtTypographyPreviewKt.b(abtTypographyKeyTokens.name(), AbtTypographyKt.e(abtTypographyKeyTokens, composer, 0), composer, 0);
            composer.M();
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        b((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
