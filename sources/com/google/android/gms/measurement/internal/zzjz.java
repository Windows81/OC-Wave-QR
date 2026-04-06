package com.google.android.gms.measurement.internal;

import android.util.SparseArray;
import com.google.common.util.concurrent.FutureCallback;

final class zzjz implements FutureCallback<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zznk f26662a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ zzjk f26663b;

    public zzjz(zzjk zzjk, zznk zznk) {
        this.f26662a = zznk;
        this.f26663b = zzjk;
    }

    public final void a(Object obj) {
        this.f26663b.n();
        if (this.f26663b.d().t(zzbj.N0)) {
            c();
            this.f26663b.f26628i = false;
            this.f26663b.f26629j = 1;
            this.f26663b.m().F().b("Successfully registered trigger URI", this.f26662a.f26882z);
            this.f26663b.H0();
            return;
        }
        this.f26663b.f26628i = false;
        this.f26663b.H0();
        this.f26663b.m().F().b("registerTriggerAsync ran. uri", this.f26662a.f26882z);
    }

    public final void b(Throwable th) {
        this.f26663b.n();
        this.f26663b.f26628i = false;
        if (!this.f26663b.d().t(zzbj.N0)) {
            this.f26663b.H0();
            this.f26663b.m().G().b("registerTriggerAsync failed with throwable", th);
            return;
        }
        int C = (this.f26663b.d().t(zzbj.L0) ? zzjk.C(this.f26663b, th) : 2) - 1;
        if (C == 0) {
            this.f26663b.m().L().c("registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", zzgi.v(this.f26663b.p().F()), zzgi.v(th.toString()));
            this.f26663b.f26629j = 1;
            this.f26663b.A0().add(this.f26662a);
        } else if (C == 1) {
            this.f26663b.A0().add(this.f26662a);
            if (this.f26663b.f26629j > 32) {
                this.f26663b.f26629j = 1;
                this.f26663b.m().L().c("registerTriggerAsync failed. May try later. App ID, throwable", zzgi.v(this.f26663b.p().F()), zzgi.v(th.toString()));
                return;
            }
            this.f26663b.m().L().d("registerTriggerAsync failed. App ID, delay in seconds, throwable", zzgi.v(this.f26663b.p().F()), zzgi.v(String.valueOf(this.f26663b.f26629j)), zzgi.v(th.toString()));
            zzjk zzjk = this.f26663b;
            zzjk.Q0(zzjk, zzjk.f26629j);
            zzjk zzjk2 = this.f26663b;
            zzjk2.f26629j = zzjk2.f26629j << 1;
        } else if (C == 2) {
            this.f26663b.m().G().c("registerTriggerAsync failed. Dropping URI. App ID, Throwable", zzgi.v(this.f26663b.p().F()), th);
            c();
            this.f26663b.f26629j = 1;
            this.f26663b.H0();
        }
    }

    public final void c() {
        SparseArray K = this.f26663b.i().K();
        zznk zznk = this.f26662a;
        K.put(zznk.f26881B, Long.valueOf(zznk.f26880A));
        this.f26663b.i().v(K);
    }
}
