package com.hansecom.abt.ui.components.bottomSheet;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AbtBottomSheetKt$AbtBottomSheet$headerComposable$1 implements Function3<Function0<? extends Unit>, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f38027A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f38028z;

    public AbtBottomSheetKt$AbtBottomSheet$headerComposable$1(String str, Function0 function0) {
        this.f38028z = str;
        this.f38027A = function0;
    }

    public final void b(Function0 function0, Composer composer, int i2) {
        Intrinsics.i(function0, "it");
        if ((i2 & 17) != 16 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1327789989, i2, -1, "com.hansecom.abt.ui.components.bottomSheet.AbtBottomSheet.<anonymous> (AbtBottomSheet.kt:75)");
            }
            AbtBottomSheetKt.f(this.f38028z, this.f38027A, composer, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((Function0) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
