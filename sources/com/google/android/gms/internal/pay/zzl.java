package com.google.android.gms.internal.pay;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.tasks.OnFailureListener;

public final /* synthetic */ class zzl implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzz f25904a;

    public /* synthetic */ zzl(zzz zzz) {
        this.f25904a = zzz;
    }

    public final void e(Exception exc) {
        zzz zzz = this.f25904a;
        if (exc instanceof UnsupportedApiCallException) {
            zzz.t1(new Status(1));
        } else {
            zzz.t1(new Status(3));
        }
    }
}
