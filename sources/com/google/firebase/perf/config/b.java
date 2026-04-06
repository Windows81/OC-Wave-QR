package com.google.firebase.perf.config;

import com.google.android.gms.tasks.OnSuccessListener;

public final /* synthetic */ class b implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RemoteConfigManager f30950a;

    public /* synthetic */ b(RemoteConfigManager remoteConfigManager) {
        this.f30950a = remoteConfigManager;
    }

    public final void a(Object obj) {
        this.f30950a.lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0((Boolean) obj);
    }
}
