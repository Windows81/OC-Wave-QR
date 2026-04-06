package com.hansecom.abt.data.useCases.configurations;

import com.hansecom.abt.data.config.RemoteConfig;
import com.hansecom.abt.data.config.menu.MenuConfigConverter;
import com.hansecom.abt.ui.components.listItem.MenuItemListState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class GetMoreMenuConfigurationUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final MenuConfigConverter f33879a;

    public GetMoreMenuConfigurationUseCase(MenuConfigConverter menuConfigConverter) {
        Intrinsics.i(menuConfigConverter, "menuConfigConverter");
        this.f33879a = menuConfigConverter;
    }

    public final MenuItemListState a() {
        return this.f33879a.e(RemoteConfig.MORE, (Object) null);
    }
}
