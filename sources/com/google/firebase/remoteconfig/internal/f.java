package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Date;
import java.util.Map;

public final /* synthetic */ class f implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ConfigFetchHandler f31377a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Task f31378b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Task f31379c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Date f31380d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Map f31381e;

    public /* synthetic */ f(ConfigFetchHandler configFetchHandler, Task task, Task task2, Date date, Map map) {
        this.f31377a = configFetchHandler;
        this.f31378b = task;
        this.f31379c = task2;
        this.f31380d = date;
        this.f31381e = map;
    }

    public final Object a(Task task) {
        return this.f31377a.w(this.f31378b, this.f31379c, this.f31380d, this.f31381e, task);
    }
}
