package com.google.android.gms.internal.pay;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.pay.zzaw;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzp implements RemoteCall {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzx f25911a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f25912b;

    public final void a(Object obj, Object obj2) {
        zzaw zzaw = new zzaw();
        zzaw.a(this.f25912b);
        ((zzg) ((zzab) obj).I()).X2(zzaw.b(), new zzs(this.f25911a, (TaskCompletionSource) obj2));
    }
}
