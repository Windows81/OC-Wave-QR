package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class a implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ConfigAutoFetch f31364a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Task f31365b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Task f31366c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f31367d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f31368e;

    public /* synthetic */ a(ConfigAutoFetch configAutoFetch, Task task, Task task2, long j2, int i2) {
        this.f31364a = configAutoFetch;
        this.f31365b = task;
        this.f31366c = task2;
        this.f31367d = j2;
        this.f31368e = i2;
    }

    public final Object a(Task task) {
        return this.f31364a.h(this.f31365b, this.f31366c, this.f31367d, this.f31368e, task);
    }
}
