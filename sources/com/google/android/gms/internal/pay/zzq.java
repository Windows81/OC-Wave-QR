package com.google.android.gms.internal.pay;

import androidx.activity.result.ActivityResultLauncher;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.pay.zzbx;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzq implements RemoteCall {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzx f25913a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f25914b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ActivityResultLauncher f25915c;

    public final void a(Object obj, Object obj2) {
        zzbx zzbx = new zzbx();
        zzbx.a(this.f25914b);
        ((zzg) ((zzab) obj).I()).Z2(zzbx.b(), new zzu(this.f25913a, this.f25915c, (TaskCompletionSource) obj2));
    }
}
