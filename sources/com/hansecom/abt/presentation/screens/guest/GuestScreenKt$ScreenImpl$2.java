package com.hansecom.abt.presentation.screens.guest;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.hansecom.abt.R;
import com.hansecom.abt.ui.components.abtTopBar.AbtTopBarKt;
import com.hansecom.abt.util.resourcesResolvers.StringResourceKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata
public final class GuestScreenKt$ScreenImpl$2 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f34700z;

    public GuestScreenKt$ScreenImpl$2(Function0 function0) {
        this.f34700z = function0;
    }

    public final void b(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1679916434, i2, -1, "com.hansecom.abt.presentation.screens.guest.ScreenImpl.<anonymous> (GuestScreen.kt:72)");
            }
            AbtTopBarKt.b(StringResourceKt.a(R.string.F5, new Object[0], composer, 0), SizeKt.h(Modifier.f15489d, 0.0f, 1, (Object) null), this.f34700z, (Function3) null, false, composer, 48, 24);
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
