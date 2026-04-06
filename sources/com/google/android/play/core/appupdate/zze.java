package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zze extends ResultReceiver {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f27476z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zze(zzg zzg, Handler handler, TaskCompletionSource taskCompletionSource) {
        super(handler);
        this.f27476z = taskCompletionSource;
    }

    public final void onReceiveResult(int i2, Bundle bundle) {
        if (i2 == 1) {
            this.f27476z.e(-1);
        } else if (i2 != 2) {
            this.f27476z.e(1);
        } else {
            this.f27476z.e(0);
        }
    }
}
