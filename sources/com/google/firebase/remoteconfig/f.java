package com.google.firebase.remoteconfig;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class f implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseRemoteConfig f31241a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Task f31242b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Task f31243c;

    public /* synthetic */ f(FirebaseRemoteConfig firebaseRemoteConfig, Task task, Task task2) {
        this.f31241a = firebaseRemoteConfig;
        this.f31242b = task;
        this.f31243c = task2;
    }

    public final Object a(Task task) {
        return this.f31241a.t(this.f31242b, this.f31243c, task);
    }
}
