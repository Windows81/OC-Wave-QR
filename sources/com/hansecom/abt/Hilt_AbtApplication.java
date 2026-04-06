package com.hansecom.abt;

import dagger.hilt.android.internal.managers.ApplicationComponentManager;
import dagger.hilt.android.internal.managers.ComponentSupplier;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;

public abstract class Hilt_AbtApplication extends BaseAbtApplication implements GeneratedComponentManagerHolder {

    /* renamed from: A  reason: collision with root package name */
    public final ApplicationComponentManager f32994A = new ApplicationComponentManager(new ComponentSupplier() {
        public Object get() {
            return DaggerAbtApplication_HiltComponents_SingletonC.a().a(new ApplicationContextModule(Hilt_AbtApplication.this)).b();
        }
    });

    /* renamed from: z  reason: collision with root package name */
    public boolean f32995z = false;

    public final ApplicationComponentManager d() {
        return this.f32994A;
    }

    public final Object e() {
        return d().e();
    }

    public void f() {
        if (!this.f32995z) {
            this.f32995z = true;
            ((AbtApplication_GeneratedInjector) e()).b((AbtApplication) UnsafeCasts.a(this));
        }
    }

    public void onCreate() {
        f();
        super.onCreate();
    }
}
