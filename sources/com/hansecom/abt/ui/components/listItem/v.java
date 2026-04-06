package com.hansecom.abt.ui.components.listItem;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class v implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f38540A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f38541B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MenuItemState f38542z;

    public /* synthetic */ v(MenuItemState menuItemState, Function1 function1, boolean z2, int i2) {
        this.f38542z = menuItemState;
        this.f38540A = function1;
        this.f38541B = z2;
        this.C = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return MenuItemListKt.i(this.f38542z, this.f38540A, this.f38541B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
