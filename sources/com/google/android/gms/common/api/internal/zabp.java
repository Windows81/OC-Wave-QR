package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.internal.BaseGmsClient;

final class zabp implements BaseGmsClient.SignOutCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zabq f24657a;

    public zabp(zabq zabq) {
        this.f24657a = zabq;
    }

    public final void a() {
        this.f24657a.f24670x.f24497n.post(new zabo(this));
    }
}
