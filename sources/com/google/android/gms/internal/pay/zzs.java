package com.google.android.gms.internal.pay;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.pay.zzbm;
import com.google.android.gms.pay.zzbo;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzs extends zzy {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f25917l;

    public zzs(zzx zzx, TaskCompletionSource taskCompletionSource) {
        this.f25917l = taskCompletionSource;
    }

    public final void F0(zzbm zzbm) {
        this.f25917l.b(new zzbo(zzbm));
    }

    public final void O2(Status status) {
        TaskUtil.a(status, (Object) null, this.f25917l);
    }
}
