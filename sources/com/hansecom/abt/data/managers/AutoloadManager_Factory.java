package com.hansecom.abt.data.managers;

import com.hansecom.mapi.apis.AutoloadsApi;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class AutoloadManager_Factory implements Factory<AutoloadManager> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33291a;

    public static AutoloadManager b(AutoloadsApi autoloadsApi) {
        return new AutoloadManager(autoloadsApi);
    }

    /* renamed from: a */
    public AutoloadManager get() {
        return b((AutoloadsApi) this.f33291a.get());
    }
}
