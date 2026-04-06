package com.hansecom.abt.ui.components.abtButton;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AbtSideButtonKt$AbtSideButton$1 implements Function3<RowScope, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Integer f37888A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f37889z;

    public AbtSideButtonKt$AbtSideButton$1(String str, Integer num) {
        this.f37889z = str;
        this.f37888A = num;
    }

    public final void b(RowScope rowScope, Composer composer, int i2) {
        Intrinsics.i(rowScope, "$this$Button");
        if ((i2 & 17) != 16 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1071819234, i2, -1, "com.hansecom.abt.ui.components.abtButton.AbtSideButton.<anonymous> (AbtSideButton.kt:51)");
            }
            AbtSideButtonKt.e(this.f37889z, this.f37888A, composer, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
