package com.google.firebase.heartbeatinfo;

import android.content.Context;
import com.google.firebase.inject.Provider;

public final /* synthetic */ class d implements Provider {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f30766a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f30767b;

    public /* synthetic */ d(Context context, String str) {
        this.f30766a = context;
        this.f30767b = str;
    }

    public final Object get() {
        return DefaultHeartBeatController.i(this.f30766a, this.f30767b);
    }
}
