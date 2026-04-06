package com.hansecom.abt.data.managers;

import com.hansecom.abt.data.deviceInfo.DeviceInfo;
import com.hansecom.mapi.apis.AnonymousFareMediaApi;
import com.hansecom.mapi.apis.UserFareMediaApi;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class FareMediaManager_Factory implements Factory<FareMediaManager> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33295a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33296b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f33297c;

    public static FareMediaManager b(DeviceInfo deviceInfo, UserFareMediaApi userFareMediaApi, AnonymousFareMediaApi anonymousFareMediaApi) {
        return new FareMediaManager(deviceInfo, userFareMediaApi, anonymousFareMediaApi);
    }

    /* renamed from: a */
    public FareMediaManager get() {
        return b((DeviceInfo) this.f33295a.get(), (UserFareMediaApi) this.f33296b.get(), (AnonymousFareMediaApi) this.f33297c.get());
    }
}
