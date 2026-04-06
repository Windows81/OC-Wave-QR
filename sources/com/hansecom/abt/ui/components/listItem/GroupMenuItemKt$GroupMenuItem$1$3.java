package com.hansecom.abt.ui.components.listItem;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class GroupMenuItemKt$GroupMenuItem$1$3 implements Function3<RowScope, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f38476A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Painter f38477B;
    public final /* synthetic */ State C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Painter f38478z;

    public GroupMenuItemKt$GroupMenuItem$1$3(Painter painter, String str, Painter painter2, State state) {
        this.f38478z = painter;
        this.f38476A = str;
        this.f38477B = painter2;
        this.C = state;
    }

    public final void b(RowScope rowScope, Composer composer, int i2) {
        Intrinsics.i(rowScope, "$this$MenuItemRow");
        if ((i2 & 6) == 0) {
            i2 |= composer.W(rowScope) ? 4 : 2;
        }
        if ((i2 & 19) != 18 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(70149452, i2, -1, "com.hansecom.abt.ui.components.listItem.GroupMenuItem.<anonymous>.<anonymous> (GroupMenuItem.kt:58)");
            }
            if (this.f38478z != null) {
                composer.X(-1415840110);
                MenuItemKt.m(this.f38478z, (Modifier) null, composer, 0, 2);
                composer.M();
            } else {
                composer.X(-1415772127);
                SpacerKt.a(SizeKt.t(Modifier.f15489d, Dp.m((float) 24)), composer, 6);
                composer.M();
            }
            String str = this.f38476A;
            Modifier.Companion companion = Modifier.f15489d;
            MenuItemKt.o(rowScope, str, RowScope.c(rowScope, companion, 1.0f, false, 2, (Object) null), composer, i2 & 14, 0);
            MenuItemKt.m(this.f38477B, RotateKt.a(companion, GroupMenuItemKt.j(this.C)), composer, 0, 0);
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
