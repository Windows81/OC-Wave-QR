package com.google.android.play.core.appupdate;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.appupdate.internal.zzg;
import com.google.android.play.core.appupdate.internal.zzm;

class zzo extends zzg {

    /* renamed from: l  reason: collision with root package name */
    public final zzm f27492l;

    /* renamed from: m  reason: collision with root package name */
    public final TaskCompletionSource f27493m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ zzr f27494n;

    public zzo(zzr zzr, zzm zzm, TaskCompletionSource taskCompletionSource) {
        this.f27494n = zzr;
        this.f27492l = zzm;
        this.f27493m = taskCompletionSource;
    }

    public void C1(Bundle bundle) {
        this.f27494n.f27499a.u(this.f27493m);
        this.f27492l.d("onRequestInfo", new Object[0]);
    }

    public void b2(Bundle bundle) {
        this.f27494n.f27499a.u(this.f27493m);
        this.f27492l.d("onCompleteUpdate", new Object[0]);
    }
}
