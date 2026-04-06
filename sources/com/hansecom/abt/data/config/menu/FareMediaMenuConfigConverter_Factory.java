package com.hansecom.abt.data.config.menu;

import com.hansecom.abt.AppFeatures;
import dagger.internal.Factory;
import dagger.internal.Provider;
import kotlinx.serialization.json.Json;

public final class FareMediaMenuConfigConverter_Factory implements Factory<FareMediaMenuConfigConverter> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33224a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33225b;

    public static FareMediaMenuConfigConverter b(Json json, AppFeatures appFeatures) {
        return new FareMediaMenuConfigConverter(json, appFeatures);
    }

    /* renamed from: a */
    public FareMediaMenuConfigConverter get() {
        return b((Json) this.f33224a.get(), (AppFeatures) this.f33225b.get());
    }
}
