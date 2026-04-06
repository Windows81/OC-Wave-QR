package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class k implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ConfigRealtimeHttpClient f31391a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Task f31392b;

    public /* synthetic */ k(ConfigRealtimeHttpClient configRealtimeHttpClient, Task task) {
        this.f31391a = configRealtimeHttpClient;
        this.f31392b = task;
    }

    public final Object a(Task task) {
        return this.f31391a.q(this.f31392b, task);
    }
}
