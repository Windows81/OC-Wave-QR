package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;

public final /* synthetic */ class i implements SuccessContinuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ConfigFetchHandler.FetchResponse f31387a;

    public /* synthetic */ i(ConfigFetchHandler.FetchResponse fetchResponse) {
        this.f31387a = fetchResponse;
    }

    public final Task a(Object obj) {
        return Tasks.e(this.f31387a);
    }
}
