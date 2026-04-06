package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

public final /* synthetic */ class a implements Deferred.DeferredHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f29921a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f29922b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f29923c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ StaticSessionData f29924d;

    public /* synthetic */ a(String str, String str2, long j2, StaticSessionData staticSessionData) {
        this.f29921a = str;
        this.f29922b = str2;
        this.f29923c = j2;
        this.f29924d = staticSessionData;
    }

    public final void a(Provider provider) {
        ((CrashlyticsNativeComponent) provider.get()).c(this.f29921a, this.f29922b, this.f29923c, this.f29924d);
    }
}
