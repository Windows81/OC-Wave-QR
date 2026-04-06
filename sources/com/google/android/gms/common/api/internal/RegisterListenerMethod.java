package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.TaskCompletionSource;

public abstract class RegisterListenerMethod<A extends Api.AnyClient, L> {

    /* renamed from: a  reason: collision with root package name */
    public final ListenerHolder f24520a;

    /* renamed from: b  reason: collision with root package name */
    public final Feature[] f24521b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f24522c;

    public void a() {
        this.f24520a.a();
    }

    public ListenerHolder.ListenerKey b() {
        return this.f24520a.b();
    }

    public Feature[] c() {
        return this.f24521b;
    }

    public abstract void d(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource);

    public final boolean e() {
        return this.f24522c;
    }
}
