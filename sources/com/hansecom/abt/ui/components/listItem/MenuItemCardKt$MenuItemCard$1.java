package com.hansecom.abt.ui.components.listItem;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@Metadata
public final class MenuItemCardKt$MenuItemCard$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f38480A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f38481B;
    public final /* synthetic */ Painter C;
    public final /* synthetic */ Painter D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f38482z;

    public MenuItemCardKt$MenuItemCard$1(String str, Modifier modifier, Function0 function0, Painter painter, Painter painter2) {
        this.f38482z = str;
        this.f38480A = modifier;
        this.f38481B = function0;
        this.C = painter;
        this.D = painter2;
    }

    public final void b(Composer composer, int i2) {
        int i3 = i2;
        if ((i3 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1450556904, i3, -1, "com.hansecom.abt.ui.components.listItem.MenuItemCard.<anonymous> (MenuItemCard.kt:34)");
            }
            PaddingValues c2 = PaddingKt.c(Dp.m((float) 16), 0.0f, 2, (Object) null);
            MenuItemKt.h(this.f38482z, this.f38480A, Dp.m((float) 48), c2, this.f38481B, this.C, this.D, false, false, false, (String) null, composer, 3456, 0, 1920);
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
