package com.google.android.gms.internal.wallet;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzu extends zzt {

    /* renamed from: l  reason: collision with root package name */
    public final TaskCompletionSource f25944l;

    public zzu(TaskCompletionSource taskCompletionSource) {
        this.f25944l = taskCompletionSource;
    }

    public final void A0(int i2, boolean z2, Bundle bundle) {
        TaskUtil.a(new Status(i2), Boolean.valueOf(z2), this.f25944l);
    }

    public final void p0(Status status, boolean z2, Bundle bundle) {
        TaskUtil.a(status, Boolean.valueOf(z2), this.f25944l);
    }
}
