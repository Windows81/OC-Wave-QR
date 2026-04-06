package com.hansecom.abt.data.deviceInfo;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class DeviceInfo_Factory implements Factory<DeviceInfo> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33274a;

    public static DeviceInfo b(Context context) {
        return new DeviceInfo(context);
    }

    /* renamed from: a */
    public DeviceInfo get() {
        return b((Context) this.f33274a.get());
    }
}
