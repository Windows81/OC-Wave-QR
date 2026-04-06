package com.hansecom.abt.data.managers;

import com.hansecom.mapi.apis.InstitutionsApi;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class InstitutionManager_Factory implements Factory<InstitutionManager> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33299a;

    public static InstitutionManager b(InstitutionsApi institutionsApi) {
        return new InstitutionManager(institutionsApi);
    }

    /* renamed from: a */
    public InstitutionManager get() {
        return b((InstitutionsApi) this.f33299a.get());
    }
}
