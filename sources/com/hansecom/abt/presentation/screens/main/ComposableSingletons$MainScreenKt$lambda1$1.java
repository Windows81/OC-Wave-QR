package com.hansecom.abt.presentation.screens.main;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: com.hansecom.abt.presentation.screens.main.ComposableSingletons$MainScreenKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$MainScreenKt$lambda1$1 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$MainScreenKt$lambda1$1 f37536z = new ComposableSingletons$MainScreenKt$lambda1$1();

    public final void b(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i2) {
        Intrinsics.i(animatedVisibilityScope, "$this$AnimatedVisibility");
        if (ComposerKt.P()) {
            ComposerKt.Y(-1160198311, i2, -1, "com.hansecom.abt.presentation.screens.main.ComposableSingletons$MainScreenKt.lambda-1.<anonymous> (MainScreen.kt:96)");
        }
        MainScreenKt.s(composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
