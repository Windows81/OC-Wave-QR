package com.google.android.gms.internal.pay;

import android.app.PendingIntent;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.IntentSenderRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzu extends zzy {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ ActivityResultLauncher f25919l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f25920m;

    public zzu(zzx zzx, ActivityResultLauncher activityResultLauncher, TaskCompletionSource taskCompletionSource) {
        this.f25919l = activityResultLauncher;
        this.f25920m = taskCompletionSource;
    }

    public final void t1(Status status) {
        if (status.o0() && status.f0() && this.f25919l != null) {
            this.f25919l.a(new IntentSenderRequest.Builder(((PendingIntent) Preconditions.m(status.Q())).getIntentSender()).a());
        }
        TaskUtil.b(status, (Object) null, this.f25920m);
    }
}
