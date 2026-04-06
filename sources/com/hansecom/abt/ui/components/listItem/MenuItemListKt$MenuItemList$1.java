package com.hansecom.abt.ui.components.listItem;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.PersistentList;

@Metadata
public final class MenuItemListKt$MenuItemList$1 implements Function3<ColumnScope, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f38491A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f38492B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MenuItemListState f38493z;

    public MenuItemListKt$MenuItemList$1(MenuItemListState menuItemListState, Function1 function1, boolean z2) {
        this.f38493z = menuItemListState;
        this.f38491A = function1;
        this.f38492B = z2;
    }

    public final void b(ColumnScope columnScope, Composer composer, int i2) {
        boolean z2;
        Intrinsics.i(columnScope, "$this$MenuItemListContainer");
        if ((i2 & 17) != 16 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1070412583, i2, -1, "com.hansecom.abt.ui.components.listItem.MenuItemList.<anonymous> (MenuItemList.kt:26)");
            }
            PersistentList a2 = this.f38493z.a();
            Function1 function1 = this.f38491A;
            boolean z3 = this.f38492B;
            MenuItemListState menuItemListState = this.f38493z;
            ArrayList arrayList = new ArrayList(CollectionsKt.x(a2, 10));
            int i3 = 0;
            for (Object next : a2) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.w();
                }
                MenuItemState menuItemState = (MenuItemState) next;
                if (z3) {
                    z2 = true;
                    if (i3 != menuItemListState.a().size() - 1) {
                        MenuItemListKt.f(menuItemState, function1, z2, composer, 0);
                        arrayList.add(Unit.f40552a);
                        i3 = i4;
                    }
                }
                z2 = false;
                MenuItemListKt.f(menuItemState, function1, z2, composer, 0);
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
