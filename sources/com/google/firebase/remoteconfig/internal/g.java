package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Date;

public final /* synthetic */ class g implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ConfigFetchHandler f31382a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Date f31383b;

    public /* synthetic */ g(ConfigFetchHandler configFetchHandler, Date date) {
        this.f31382a = configFetchHandler;
        this.f31383b = date;
    }

    public final Object a(Task task) {
        return this.f31382a.x(this.f31383b, task);
    }
}
