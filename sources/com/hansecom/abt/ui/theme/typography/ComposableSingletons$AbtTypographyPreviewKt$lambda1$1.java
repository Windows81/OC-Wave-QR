package com.hansecom.abt.ui.theme.typography;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: com.hansecom.abt.ui.theme.typography.ComposableSingletons$AbtTypographyPreviewKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$AbtTypographyPreviewKt$lambda1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$AbtTypographyPreviewKt$lambda1$1 f38971z = new ComposableSingletons$AbtTypographyPreviewKt$lambda1$1();

    public static final Unit e(LazyListScope lazyListScope) {
        Intrinsics.i(lazyListScope, "$this$LazyColumn");
        EnumEntries f2 = AbtTypographyKeyTokens.f();
        lazyListScope.d(f2.size(), (Function1) null, new ComposableSingletons$AbtTypographyPreviewKt$lambda1$1$invoke$lambda$2$lambda$1$$inlined$items$default$3(ComposableSingletons$AbtTypographyPreviewKt$lambda1$1$invoke$lambda$2$lambda$1$$inlined$items$default$1.f38962z, f2), ComposableLambdaKt.c(-632812321, true, new ComposableSingletons$AbtTypographyPreviewKt$lambda1$1$invoke$lambda$2$lambda$1$$inlined$items$default$4(f2)));
        return Unit.f40552a;
    }

    public final void c(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(297006785, i2, -1, "com.hansecom.abt.ui.theme.typography.ComposableSingletons$AbtTypographyPreviewKt.lambda-1.<anonymous> (AbtTypographyPreview.kt:48)");
            }
            composer.X(1846406285);
            Object g2 = composer.g();
            if (g2 == Composer.f14567a.a()) {
                g2 = new c();
                composer.N(g2);
            }
            composer.M();
            LazyDslKt.b((Modifier) null, (LazyListState) null, (PaddingValues) null, false, (Arrangement.Vertical) null, (Alignment.Horizontal) null, (FlingBehavior) null, false, (OverscrollEffect) null, (Function1) g2, composer, 805306368, 511);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        c((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
