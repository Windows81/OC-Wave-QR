package com.hansecom.abt.presentation.screens.guest;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.AppInfo;
import com.hansecom.abt.data.useCases.configurations.GetGuestMenuConfigurationUseCase;
import com.hansecom.abt.presentation.mvi.MviViewModel;
import com.hansecom.abt.presentation.screens.guest.Guest;
import com.hansecom.abt.ui.components.listItem.MenuItemListState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class GuestViewModel extends MviViewModel<Guest.Action, Guest.State, Guest.Effect> {

    /* renamed from: i  reason: collision with root package name */
    public final AppInfo f34703i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GuestViewModel(SavedStateHandle savedStateHandle, GetGuestMenuConfigurationUseCase getGuestMenuConfigurationUseCase, AppInfo appInfo) {
        super(savedStateHandle, new Guest.State((MenuItemListState) null, (String) null, 3, (DefaultConstructorMarker) null));
        Intrinsics.i(savedStateHandle, "savedStateHandle");
        Intrinsics.i(getGuestMenuConfigurationUseCase, "getGuestMenuConfigurationUseCase");
        Intrinsics.i(appInfo, "appInfo");
        this.f34703i = appInfo;
        r(new u(getGuestMenuConfigurationUseCase.a(), this));
    }

    public static final Guest.State x(MenuItemListState menuItemListState, GuestViewModel guestViewModel, Guest.State state) {
        Intrinsics.i(state, "$this$update");
        return state.a(menuItemListState, guestViewModel.v());
    }

    public final String v() {
        return this.f34703i.a();
    }

    /* JADX WARNING: type inference failed for: r3v10, types: [com.hansecom.abt.ui.components.listItem.MenuItemState] */
    /* JADX WARNING: type inference failed for: r3v12, types: [com.hansecom.abt.ui.components.listItem.MenuItemState] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object o(com.hansecom.abt.presentation.screens.guest.Guest.Action r3, kotlin.coroutines.Continuation r4) {
        /*
            r2 = this;
            boolean r4 = r3 instanceof com.hansecom.abt.presentation.screens.guest.Guest.Action.MenuItemClick
            if (r4 == 0) goto L_0x00bc
            com.hansecom.abt.presentation.screens.guest.Guest$Action$MenuItemClick r3 = (com.hansecom.abt.presentation.screens.guest.Guest.Action.MenuItemClick) r3
            com.hansecom.abt.ui.components.listItem.MenuItemState r4 = r3.a()
            java.lang.String r4 = r4.O()
            if (r4 == 0) goto L_0x0098
            int r0 = r4.hashCode()
            r1 = 0
            switch(r0) {
                case -1753988792: goto L_0x0089;
                case -1753621409: goto L_0x007a;
                case 74085029: goto L_0x006b;
                case 868923144: goto L_0x0046;
                case 1942407129: goto L_0x001a;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x0098
        L_0x001a:
            java.lang.String r0 = "WEBVIEW"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0024
            goto L_0x0098
        L_0x0024:
            com.hansecom.abt.ui.components.listItem.MenuItemState r3 = r3.a()
            boolean r4 = r3 instanceof com.hansecom.abt.ui.components.listItem.MenuItemState.Text
            if (r4 == 0) goto L_0x002f
            r1 = r3
            com.hansecom.abt.ui.components.listItem.MenuItemState$Text r1 = (com.hansecom.abt.ui.components.listItem.MenuItemState.Text) r1
        L_0x002f:
            if (r1 == 0) goto L_0x00b9
            com.hansecom.abt.presentation.screens.guest.Guest$Effect$OpenWebViewUrl r3 = new com.hansecom.abt.presentation.screens.guest.Guest$Effect$OpenWebViewUrl
            java.lang.String r4 = r1.h()
            kotlin.jvm.internal.Intrinsics.f(r4)
            com.hansecom.abt.util.resourcesResolvers.StringValue r0 = r1.g()
            r3.<init>(r4, r0)
            r2.p(r3)
            goto L_0x00b9
        L_0x0046:
            java.lang.String r0 = "BROWSER"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x004f
            goto L_0x0098
        L_0x004f:
            com.hansecom.abt.ui.components.listItem.MenuItemState r3 = r3.a()
            boolean r4 = r3 instanceof com.hansecom.abt.ui.components.listItem.MenuItemState.Text
            if (r4 == 0) goto L_0x005a
            r1 = r3
            com.hansecom.abt.ui.components.listItem.MenuItemState$Text r1 = (com.hansecom.abt.ui.components.listItem.MenuItemState.Text) r1
        L_0x005a:
            if (r1 == 0) goto L_0x00b9
            java.lang.String r3 = r1.h()
            if (r3 == 0) goto L_0x00b9
            com.hansecom.abt.presentation.screens.guest.Guest$Effect$OpenBrowserUrl r4 = new com.hansecom.abt.presentation.screens.guest.Guest$Effect$OpenBrowserUrl
            r4.<init>(r3)
            r2.p(r4)
            goto L_0x00b9
        L_0x006b:
            java.lang.String r0 = "check_balance"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0074
            goto L_0x0098
        L_0x0074:
            com.hansecom.abt.presentation.screens.guest.Guest$Effect$OpenCheckFareMediaBalance r3 = com.hansecom.abt.presentation.screens.guest.Guest.Effect.OpenCheckFareMediaBalance.f34689a
            r2.p(r3)
            goto L_0x00b9
        L_0x007a:
            java.lang.String r0 = "guest_tour"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0083
            goto L_0x0098
        L_0x0083:
            com.hansecom.abt.presentation.screens.guest.Guest$Effect$OpenGuidedTour r3 = com.hansecom.abt.presentation.screens.guest.Guest.Effect.OpenGuidedTour.f34690a
            r2.p(r3)
            goto L_0x00b9
        L_0x0089:
            java.lang.String r0 = "guest_help"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0092
            goto L_0x0098
        L_0x0092:
            com.hansecom.abt.presentation.screens.guest.Guest$Effect$OpenHelpRequest r3 = com.hansecom.abt.presentation.screens.guest.Guest.Effect.OpenHelpRequest.f34691a
            r2.p(r3)
            goto L_0x00b9
        L_0x0098:
            timber.log.Timber$Forest r4 = timber.log.Timber.f44337a
            com.hansecom.abt.ui.components.listItem.MenuItemState r3 = r3.a()
            java.lang.String r3 = r3.O()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unhandled menu item click action="
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r4.b(r3, r0)
        L_0x00b9:
            kotlin.Unit r3 = kotlin.Unit.f40552a
            return r3
        L_0x00bc:
            kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
            r3.<init>()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.guest.GuestViewModel.o(com.hansecom.abt.presentation.screens.guest.Guest$Action, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
