package com.google.android.gms.internal.pay;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.pay.EmoneyReadiness;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzt extends zzy {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f25918l;

    public zzt(zzx zzx, TaskCompletionSource taskCompletionSource) {
        this.f25918l = taskCompletionSource;
    }

    public final void X0(Status status, EmoneyReadiness emoneyReadiness) {
        TaskUtil.b(status, emoneyReadiness, this.f25918l);
    }
}
