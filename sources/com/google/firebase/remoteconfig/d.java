package com.google.firebase.remoteconfig;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class d implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Task f31239a;

    public /* synthetic */ d(Task task) {
        this.f31239a = task;
    }

    public final Object a(Task task) {
        return FirebaseRemoteConfig.u(this.f31239a, task);
    }
}
