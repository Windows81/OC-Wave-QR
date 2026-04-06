package com.hansecom.abt.presentation.screens.home.faremedia.passes.add;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import com.hansecom.abt.R;
import com.hansecom.abt.ui.components.screenHeader.ScreenHeaderKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: com.hansecom.abt.presentation.screens.home.faremedia.passes.add.ComposableSingletons$AddPassesScreenKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$AddPassesScreenKt$lambda1$1 implements Function3<LazyItemScope, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$AddPassesScreenKt$lambda1$1 f37057z = new ComposableSingletons$AddPassesScreenKt$lambda1$1();

    public final void b(LazyItemScope lazyItemScope, Composer composer, int i2) {
        Intrinsics.i(lazyItemScope, "$this$item");
        if ((i2 & 17) != 16 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(2057810476, i2, -1, "com.hansecom.abt.presentation.screens.home.faremedia.passes.add.ComposableSingletons$AddPassesScreenKt.lambda-1.<anonymous> (AddPassesScreen.kt:79)");
            }
            ScreenHeaderKt.b((Modifier) null, (PaddingValues) null, 0, 0, StringResources_androidKt.b(R.string.M, composer, 0), StringResources_androidKt.b(R.string.N, composer, 0), false, composer, 0, 79);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((LazyItemScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
