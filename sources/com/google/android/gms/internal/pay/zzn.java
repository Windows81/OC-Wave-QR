package com.google.android.gms.internal.pay;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.pay.zze;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzn implements RemoteCall {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzx f25907a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f25908b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f25909c;

    public final void a(Object obj, Object obj2) {
        zze zze = new zze();
        zze.b(this.f25908b);
        zze.a(this.f25909c);
        ((zzg) ((zzab) obj).I()).P(zze.c(), new zzt(this.f25907a, (TaskCompletionSource) obj2));
    }
}
