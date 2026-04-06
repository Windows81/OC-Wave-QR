package com.hansecom.abt.data.config.menu;

import com.hansecom.abt.AppFeatures;
import dagger.internal.Factory;
import dagger.internal.Provider;
import kotlinx.serialization.json.Json;

public final class AccountMenuConfigConverter_Factory implements Factory<AccountMenuConfigConverter> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33217a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33218b;

    public static AccountMenuConfigConverter b(Json json, AppFeatures appFeatures) {
        return new AccountMenuConfigConverter(json, appFeatures);
    }

    /* renamed from: a */
    public AccountMenuConfigConverter get() {
        return b((Json) this.f33217a.get(), (AppFeatures) this.f33218b.get());
    }
}
