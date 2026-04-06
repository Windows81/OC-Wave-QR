package com.hansecom.abt.ui.components.listItem;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class w implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f38543A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f38544B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MenuItemListState f38545z;

    public /* synthetic */ w(MenuItemListState menuItemListState, Function1 function1, Modifier modifier, boolean z2, int i2, int i3) {
        this.f38545z = menuItemListState;
        this.f38543A = function1;
        this.f38544B = modifier;
        this.C = z2;
        this.D = i2;
        this.E = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return MenuItemListKt.k(this.f38545z, this.f38543A, this.f38544B, this.C, this.D, this.E, (Composer) obj, ((Integer) obj2).intValue());
    }
}
