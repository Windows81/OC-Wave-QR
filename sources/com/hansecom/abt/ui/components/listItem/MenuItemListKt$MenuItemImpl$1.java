package com.hansecom.abt.ui.components.listItem;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.ui.components.listItem.MenuItemState;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.PersistentList;

@Metadata
public final class MenuItemListKt$MenuItemImpl$1 implements Function3<ColumnScope, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f38489A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MenuItemState f38490z;

    public MenuItemListKt$MenuItemImpl$1(MenuItemState menuItemState, Function1 function1) {
        this.f38490z = menuItemState;
        this.f38489A = function1;
    }

    public final void b(ColumnScope columnScope, Composer composer, int i2) {
        Intrinsics.i(columnScope, "$this$GroupMenuItem");
        if ((i2 & 17) != 16 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(2112319151, i2, -1, "com.hansecom.abt.ui.components.listItem.MenuItemImpl.<anonymous> (MenuItemList.kt:59)");
            }
            PersistentList a2 = ((MenuItemState.Group) this.f38490z).a();
            Function1 function1 = this.f38489A;
            MenuItemState menuItemState = this.f38490z;
            ArrayList arrayList = new ArrayList(CollectionsKt.x(a2, 10));
            int i3 = 0;
            for (Object next : a2) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.w();
                }
                MenuItemListKt.f((MenuItemState) next, function1, i3 != CollectionsKt.o(((MenuItemState.Group) menuItemState).a()), composer, 0);
                arrayList.add(Unit.f40552a);
                i3 = i4;
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
        b((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
