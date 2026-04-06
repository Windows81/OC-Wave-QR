package com.google.android.gms.internal.wallet;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wallet.AutoResolvableVoidResult;
import com.google.android.gms.wallet.AutoResolveHelper;

final class zzv extends zzt {

    /* renamed from: l  reason: collision with root package name */
    public final TaskCompletionSource f25945l;

    public zzv(TaskCompletionSource taskCompletionSource) {
        this.f25945l = taskCompletionSource;
    }

    public final void j2(int i2, Bundle bundle) {
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT");
        AutoResolveHelper.e((pendingIntent == null || i2 != 6) ? new Status(i2) : new Status(6, "Need to resolve PendingIntent", pendingIntent), new AutoResolvableVoidResult(), this.f25945l);
    }
}
