package com.google.firebase.perf.config;

import com.google.android.gms.tasks.OnFailureListener;

public final /* synthetic */ class c implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RemoteConfigManager f30951a;

    public /* synthetic */ c(RemoteConfigManager remoteConfigManager) {
        this.f30951a = remoteConfigManager;
    }

    public final void e(Exception exc) {
        this.f30951a.lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(exc);
    }
}
