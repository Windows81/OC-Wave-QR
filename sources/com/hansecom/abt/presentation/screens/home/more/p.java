package com.hansecom.abt.presentation.screens.home.more;

import com.hansecom.abt.presentation.screens.home.more.More;
import com.hansecom.abt.ui.components.listItem.MenuItemListState;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class p implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MoreViewModel f37485A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MenuItemListState f37486z;

    public /* synthetic */ p(MenuItemListState menuItemListState, MoreViewModel moreViewModel) {
        this.f37486z = menuItemListState;
        this.f37485A = moreViewModel;
    }

    public final Object invoke(Object obj) {
        return MoreViewModel.x(this.f37486z, this.f37485A, (More.State) obj);
    }
}
