package com.hansecom.abt.data.config.menu;

import dagger.internal.Factory;
import dagger.internal.Provider;
import kotlinx.serialization.json.Json;

public final class MenuConfigConverter_Factory<T> implements Factory<MenuConfigConverter<T>> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33231a;

    public static MenuConfigConverter b(Json json) {
        return new MenuConfigConverter(json);
    }

    /* renamed from: a */
    public MenuConfigConverter get() {
        return b((Json) this.f33231a.get());
    }
}
