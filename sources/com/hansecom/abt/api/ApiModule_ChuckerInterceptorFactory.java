package com.hansecom.abt.api;

import android.content.Context;
import com.chuckerteam.chucker.api.ChuckerInterceptor;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

public final class ApiModule_ChuckerInterceptorFactory implements Factory<ChuckerInterceptor> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33091a;

    public static ChuckerInterceptor a(Context context) {
        return (ChuckerInterceptor) Preconditions.d(ApiModule.f33084a.c(context));
    }

    /* renamed from: b */
    public ChuckerInterceptor get() {
        return a((Context) this.f33091a.get());
    }
}
