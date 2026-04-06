package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class l implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ConfigRealtimeHttpClient f31393a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Task f31394b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Task f31395c;

    public /* synthetic */ l(ConfigRealtimeHttpClient configRealtimeHttpClient, Task task, Task task2) {
        this.f31393a = configRealtimeHttpClient;
        this.f31394b = task;
        this.f31395c = task2;
    }

    public final Object a(Task task) {
        return this.f31393a.r(this.f31394b, this.f31395c, task);
    }
}
