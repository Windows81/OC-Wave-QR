package com.hansecom.abt.presentation.screens.guest;

import com.hansecom.abt.presentation.screens.guest.Guest;
import com.hansecom.abt.ui.components.listItem.MenuItemListState;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class u implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ GuestViewModel f34762A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MenuItemListState f34763z;

    public /* synthetic */ u(MenuItemListState menuItemListState, GuestViewModel guestViewModel) {
        this.f34763z = menuItemListState;
        this.f34762A = guestViewModel;
    }

    public final Object invoke(Object obj) {
        return GuestViewModel.x(this.f34763z, this.f34762A, (Guest.State) obj);
    }
}
