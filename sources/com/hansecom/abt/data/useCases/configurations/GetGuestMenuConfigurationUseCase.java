package com.hansecom.abt.data.useCases.configurations;

import com.hansecom.abt.data.config.RemoteConfig;
import com.hansecom.abt.data.config.menu.MenuConfigConverter;
import com.hansecom.abt.ui.components.listItem.MenuItemListState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class GetGuestMenuConfigurationUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final MenuConfigConverter f33872a;

    public GetGuestMenuConfigurationUseCase(MenuConfigConverter menuConfigConverter) {
        Intrinsics.i(menuConfigConverter, "menuConfigConverter");
        this.f33872a = menuConfigConverter;
    }

    public final MenuItemListState a() {
        return this.f33872a.e(RemoteConfig.GUEST, (Object) null);
    }
}
