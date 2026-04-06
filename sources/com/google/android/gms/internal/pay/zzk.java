package com.google.android.gms.internal.pay;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.pay.zzcd;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzk implements RemoteCall {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzcd f25902a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ zzz f25903b;

    public /* synthetic */ zzk(zzcd zzcd, zzz zzz) {
        this.f25902a = zzcd;
        this.f25903b = zzz;
    }

    public final void a(Object obj, Object obj2) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        ((zzg) ((zzab) obj).I()).a3(this.f25902a, this.f25903b);
    }
}
