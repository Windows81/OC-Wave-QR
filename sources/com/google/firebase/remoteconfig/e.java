package com.google.firebase.remoteconfig;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class e implements SuccessContinuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseRemoteConfig f31240a;

    public /* synthetic */ e(FirebaseRemoteConfig firebaseRemoteConfig) {
        this.f31240a = firebaseRemoteConfig;
    }

    public final Task a(Object obj) {
        return this.f31240a.w((Void) obj);
    }
}
