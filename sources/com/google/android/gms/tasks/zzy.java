package com.google.android.gms.tasks;

import com.google.android.gms.internal.tasks.zza;

public final /* synthetic */ class zzy implements OnCompleteListener {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f27246A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ zzb f27247B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ zza f27248z;

    public final void a(Task task) {
        this.f27248z.removeCallbacksAndMessages((Object) null);
        TaskCompletionSource taskCompletionSource = this.f27246A;
        if (task.n()) {
            taskCompletionSource.e(task.k());
        } else if (task.l()) {
            this.f27247B.a();
        } else {
            Exception j2 = task.j();
            j2.getClass();
            taskCompletionSource.d(j2);
        }
    }
}
