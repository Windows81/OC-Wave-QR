package com.hansecom.abt.ui.components.bottomSheet;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class OptionsBottomSheetKt$BottomSheet$1 implements Function3<Function0<? extends Unit>, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f38041z;

    public OptionsBottomSheetKt$BottomSheet$1(String str) {
        this.f38041z = str;
    }

    public final void b(Function0 function0, Composer composer, int i2) {
        Intrinsics.i(function0, "onClose");
        if ((i2 & 6) == 0) {
            i2 |= composer.l(function0) ? 4 : 2;
        }
        if ((i2 & 19) != 18 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1646535909, i2, -1, "com.hansecom.abt.ui.components.bottomSheet.BottomSheet.<anonymous> (OptionsBottomSheet.kt:86)");
            }
            OptionsBottomSheetKt.l(this.f38041z, function0, composer, (i2 << 3) & 112);
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
