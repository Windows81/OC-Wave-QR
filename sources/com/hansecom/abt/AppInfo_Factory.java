package com.hansecom.abt;

import dagger.internal.Factory;

public final class AppInfo_Factory implements Factory<AppInfo> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final AppInfo_Factory f32875a = new AppInfo_Factory();
    }

    public static AppInfo b() {
        return new AppInfo();
    }

    /* renamed from: a */
    public AppInfo get() {
        return b();
    }
}
