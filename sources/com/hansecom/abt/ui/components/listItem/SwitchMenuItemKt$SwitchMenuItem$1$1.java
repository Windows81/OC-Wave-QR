package com.hansecom.abt.ui.components.listItem;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.SwitchColors;
import androidx.compose.material3.SwitchKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SwitchMenuItemKt$SwitchMenuItem$1$1 implements Function3<RowScope, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f38507A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f38508B;
    public final /* synthetic */ boolean C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Painter f38509z;

    public SwitchMenuItemKt$SwitchMenuItem$1$1(Painter painter, String str, boolean z2, boolean z3) {
        this.f38509z = painter;
        this.f38507A = str;
        this.f38508B = z2;
        this.C = z3;
    }

    public final void b(RowScope rowScope, Composer composer, int i2) {
        int i3;
        Intrinsics.i(rowScope, "$this$MenuItemRow");
        if ((i2 & 6) == 0) {
            i3 = (composer.W(rowScope) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 19) != 18 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-159048450, i3, -1, "com.hansecom.abt.ui.components.listItem.SwitchMenuItem.<anonymous>.<anonymous> (SwitchMenuItem.kt:39)");
            }
            if (this.f38509z != null) {
                composer.X(-358300181);
                MenuItemKt.m(this.f38509z, (Modifier) null, composer, 0, 2);
                composer.M();
            } else {
                composer.X(-358240134);
                SpacerKt.a(SizeKt.t(Modifier.f15489d, Dp.m((float) 24)), composer, 6);
                composer.M();
            }
            MenuItemKt.o(rowScope, this.f38507A, (Modifier) null, composer, i3 & 14, 2);
            SwitchKt.c(this.f38508B, (Function1) null, (Modifier) null, (Function2) null, this.C, (SwitchColors) null, (MutableInteractionSource) null, composer, 48, 108);
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
