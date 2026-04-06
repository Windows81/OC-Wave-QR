package com.hansecom.abt.ui.components.listItem;

import kotlin.jvm.functions.Function1;

public final /* synthetic */ class u implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MenuItemState f38538A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f38539z;

    public /* synthetic */ u(Function1 function1, MenuItemState menuItemState) {
        this.f38539z = function1;
        this.f38538A = menuItemState;
    }

    public final Object invoke(Object obj) {
        return MenuItemListKt.h(this.f38539z, this.f38538A, ((Boolean) obj).booleanValue());
    }
}
