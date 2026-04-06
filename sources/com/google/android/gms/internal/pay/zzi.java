package com.google.android.gms.internal.pay;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.pay.zzba;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzi implements RemoteCall {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzx f25899a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f25900b;

    public final void a(Object obj, Object obj2) {
        zzba zzba = new zzba();
        zzba.a(this.f25900b);
        ((zzg) ((zzab) obj).I()).Y2(zzba.b(), new zzv(this.f25899a, (TaskCompletionSource) obj2));
    }
}
