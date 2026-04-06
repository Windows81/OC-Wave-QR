package com.hansecom.abt.presentation.screens.home.more;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.AppInfo;
import com.hansecom.abt.data.useCases.configurations.GetMoreMenuConfigurationUseCase;
import com.hansecom.abt.presentation.mvi.MviViewModel;
import com.hansecom.abt.presentation.screens.home.more.More;
import com.hansecom.abt.ui.components.listItem.MenuItemListState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class MoreViewModel extends MviViewModel<More.Action, More.State, More.Effect> {

    /* renamed from: i  reason: collision with root package name */
    public final AppInfo f37435i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MoreViewModel(SavedStateHandle savedStateHandle, GetMoreMenuConfigurationUseCase getMoreMenuConfigurationUseCase, AppInfo appInfo) {
        super(savedStateHandle, new More.State((MenuItemListState) null, (String) null, appInfo.b(), 3, (DefaultConstructorMarker) null));
        Intrinsics.i(savedStateHandle, "savedStateHandle");
        Intrinsics.i(getMoreMenuConfigurationUseCase, "getMoreMenuConfigurationUseCase");
        Intrinsics.i(appInfo, "appInfo");
        this.f37435i = appInfo;
        r(new p(getMoreMenuConfigurationUseCase.a(), this));
    }

    private final String v() {
        return this.f37435i.a();
    }

    public static final More.State x(MenuItemListState menuItemListState, MoreViewModel moreViewModel, More.State state) {
        Intrinsics.i(state, "$this$update");
        return More.State.b(state, menuItemListState, moreViewModel.v(), false, 4, (Object) null);
    }

    /* JADX WARNING: type inference failed for: r3v9, types: [com.hansecom.abt.ui.components.listItem.MenuItemState] */
    /* JADX WARNING: type inference failed for: r3v11, types: [com.hansecom.abt.ui.components.listItem.MenuItemState] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object o(com.hansecom.abt.presentation.screens.home.more.More.Action r3, kotlin.coroutines.Continuation r4) {
        /*
            r2 = this;
            boolean r4 = r3 instanceof com.hansecom.abt.presentation.screens.home.more.More.Action.MenuItemClick
            if (r4 == 0) goto L_0x00ab
            com.hansecom.abt.presentation.screens.home.more.More$Action$MenuItemClick r3 = (com.hansecom.abt.presentation.screens.home.more.More.Action.MenuItemClick) r3
            com.hansecom.abt.ui.components.listItem.MenuItemState r4 = r3.a()
            java.lang.String r4 = r4.O()
            if (r4 == 0) goto L_0x0087
            int r0 = r4.hashCode()
            r1 = 0
            switch(r0) {
                case 3198785: goto L_0x0078;
                case 3566168: goto L_0x0069;
                case 868923144: goto L_0x0044;
                case 1942407129: goto L_0x001a;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x0087
        L_0x001a:
            java.lang.String r0 = "WEBVIEW"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0023
            goto L_0x0087
        L_0x0023:
            com.hansecom.abt.ui.components.listItem.MenuItemState r3 = r3.a()
            boolean r4 = r3 instanceof com.hansecom.abt.ui.components.listItem.MenuItemState.Text
            if (r4 == 0) goto L_0x002e
            r1 = r3
            com.hansecom.abt.ui.components.listItem.MenuItemState$Text r1 = (com.hansecom.abt.ui.components.listItem.MenuItemState.Text) r1
        L_0x002e:
            if (r1 == 0) goto L_0x00a8
            com.hansecom.abt.presentation.screens.home.more.More$Effect$OpenWebViewUrl r3 = new com.hansecom.abt.presentation.screens.home.more.More$Effect$OpenWebViewUrl
            java.lang.String r4 = r1.h()
            kotlin.jvm.internal.Intrinsics.f(r4)
            com.hansecom.abt.util.resourcesResolvers.StringValue r0 = r1.g()
            r3.<init>(r4, r0)
            r2.p(r3)
            goto L_0x00a8
        L_0x0044:
            java.lang.String r0 = "BROWSER"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x004d
            goto L_0x0087
        L_0x004d:
            com.hansecom.abt.ui.components.listItem.MenuItemState r3 = r3.a()
            boolean r4 = r3 instanceof com.hansecom.abt.ui.components.listItem.MenuItemState.Text
            if (r4 == 0) goto L_0x0058
            r1 = r3
            com.hansecom.abt.ui.components.listItem.MenuItemState$Text r1 = (com.hansecom.abt.ui.components.listItem.MenuItemState.Text) r1
        L_0x0058:
            if (r1 == 0) goto L_0x00a8
            java.lang.String r3 = r1.h()
            if (r3 == 0) goto L_0x00a8
            com.hansecom.abt.presentation.screens.home.more.More$Effect$OpenBrowserUrl r4 = new com.hansecom.abt.presentation.screens.home.more.More$Effect$OpenBrowserUrl
            r4.<init>(r3)
            r2.p(r4)
            goto L_0x00a8
        L_0x0069:
            java.lang.String r0 = "tour"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0072
            goto L_0x0087
        L_0x0072:
            com.hansecom.abt.presentation.screens.home.more.More$Effect$OpenGuidedTour r3 = com.hansecom.abt.presentation.screens.home.more.More.Effect.OpenGuidedTour.f37419a
            r2.p(r3)
            goto L_0x00a8
        L_0x0078:
            java.lang.String r0 = "help"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0081
            goto L_0x0087
        L_0x0081:
            com.hansecom.abt.presentation.screens.home.more.More$Effect$OpenHelpRequest r3 = com.hansecom.abt.presentation.screens.home.more.More.Effect.OpenHelpRequest.f37420a
            r2.p(r3)
            goto L_0x00a8
        L_0x0087:
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
        L_0x00a8:
            kotlin.Unit r3 = kotlin.Unit.f40552a
            return r3
        L_0x00ab:
            kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
            r3.<init>()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.more.MoreViewModel.o(com.hansecom.abt.presentation.screens.home.more.More$Action, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
