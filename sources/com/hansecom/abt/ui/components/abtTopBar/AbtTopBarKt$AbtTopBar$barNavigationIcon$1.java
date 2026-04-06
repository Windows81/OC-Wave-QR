package com.hansecom.abt.ui.components.abtTopBar;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.hansecom.abt.ui.components.UpIconButtonKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@Metadata
public final class AbtTopBarKt$AbtTopBar$barNavigationIcon$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f37937z;

    public AbtTopBarKt$AbtTopBar$barNavigationIcon$1(Function0 function0) {
        this.f37937z = function0;
    }

    public final void b(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(2055799449, i2, -1, "com.hansecom.abt.ui.components.abtTopBar.AbtTopBar.<anonymous> (AbtTopBar.kt:41)");
            }
            Function0 function0 = this.f37937z;
            if (function0 != null) {
                UpIconButtonKt.b(function0, (Modifier) null, composer, 0, 2);
            }
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
