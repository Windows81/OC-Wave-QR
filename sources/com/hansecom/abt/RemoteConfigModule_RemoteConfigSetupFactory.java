package com.hansecom.abt;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class RemoteConfigModule_RemoteConfigSetupFactory implements Factory<RemoteConfigSetup> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final RemoteConfigModule_RemoteConfigSetupFactory f33075a = new RemoteConfigModule_RemoteConfigSetupFactory();
    }

    public static RemoteConfigSetup b() {
        return (RemoteConfigSetup) Preconditions.d(RemoteConfigModule.f33074a.a());
    }

    /* renamed from: a */
    public RemoteConfigSetup get() {
        return b();
    }
}
