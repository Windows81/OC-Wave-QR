package com.google.android.gms.wallet;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.google.android.gms.internal.wallet.zzd;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
final class zzc implements OnCompleteListener, Runnable {
    public static final Handler C = new zzd(Looper.getMainLooper());
    public static final SparseArray D = new SparseArray(2);
    public static final AtomicInteger E = new AtomicInteger();

    /* renamed from: A  reason: collision with root package name */
    public zzd f27382A;

    /* renamed from: B  reason: collision with root package name */
    public Task f27383B;

    /* renamed from: z  reason: collision with root package name */
    public int f27384z;

    public final void a(Task task) {
        this.f27383B = task;
        d();
    }

    public final void b(zzd zzd) {
        if (this.f27382A == zzd) {
            this.f27382A = null;
        }
    }

    public final void c(zzd zzd) {
        this.f27382A = zzd;
        d();
    }

    public final void d() {
        if (this.f27383B != null && this.f27382A != null) {
            D.delete(this.f27384z);
            C.removeCallbacks(this);
            zzd zzd = this.f27382A;
            if (zzd != null) {
                zzd.b(this.f27383B);
            }
        }
    }

    public final void run() {
        D.delete(this.f27384z);
    }
}
