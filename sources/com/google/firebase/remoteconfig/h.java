package com.google.firebase.remoteconfig;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class h implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseRemoteConfig f31244a;

    public /* synthetic */ h(FirebaseRemoteConfig firebaseRemoteConfig) {
        this.f31244a = firebaseRemoteConfig;
    }

    public final Object a(Task task) {
        return Boolean.valueOf(this.f31244a.z(task));
    }
}
