package com.hansecom.abt.ui.components.listItem;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class MenuItemKt$MenuItem$2$1 implements Function3<RowScope, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f38483A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ String f38484B;
    public final /* synthetic */ Painter C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Painter f38485z;

    public MenuItemKt$MenuItem$2$1(Painter painter, boolean z2, String str, Painter painter2) {
        this.f38485z = painter;
        this.f38483A = z2;
        this.f38484B = str;
        this.C = painter2;
    }

    public final void b(RowScope rowScope, Composer composer, int i2) {
        Intrinsics.i(rowScope, "$this$MenuItemRow");
        if ((i2 & 6) == 0) {
            i2 |= composer.W(rowScope) ? 4 : 2;
        }
        if ((i2 & 19) != 18 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1458536728, i2, -1, "com.hansecom.abt.ui.components.listItem.MenuItem.<anonymous>.<anonymous> (MenuItem.kt:55)");
            }
            if (this.f38485z != null) {
                composer.X(-1687289257);
                MenuItemKt.m(this.f38485z, (Modifier) null, composer, 0, 2);
                composer.M();
            } else if (this.f38483A) {
                composer.X(-1687196474);
                SpacerKt.a(SizeKt.t(Modifier.f15489d, Dp.m((float) 24)), composer, 6);
                composer.M();
            } else {
                composer.X(-1687120555);
                composer.M();
            }
            MenuItemKt.o(rowScope, this.f38484B, (Modifier) null, composer, i2 & 14, 2);
            Painter painter = this.C;
            if (painter != null) {
                MenuItemKt.m(painter, (Modifier) null, composer, 0, 2);
            }
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
