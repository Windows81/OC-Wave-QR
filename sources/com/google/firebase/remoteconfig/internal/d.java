package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class d implements SuccessContinuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ConfigCacheClient f31372a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f31373b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ConfigContainer f31374c;

    public /* synthetic */ d(ConfigCacheClient configCacheClient, boolean z2, ConfigContainer configContainer) {
        this.f31372a = configCacheClient;
        this.f31373b = z2;
        this.f31374c = configContainer;
    }

    public final Task a(Object obj) {
        return this.f31372a.j(this.f31373b, this.f31374c, (Void) obj);
    }
}
