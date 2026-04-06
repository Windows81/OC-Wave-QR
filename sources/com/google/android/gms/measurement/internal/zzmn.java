package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

final class zzmn implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f26824A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ String f26825B;
    public final /* synthetic */ String C;
    public final /* synthetic */ zzp D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ zzlp F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f26826z;

    public zzmn(zzlp zzlp, AtomicReference atomicReference, String str, String str2, String str3, zzp zzp, boolean z2) {
        this.f26826z = atomicReference;
        this.f26824A = str;
        this.f26825B = str2;
        this.C = str3;
        this.D = zzp;
        this.E = z2;
        this.F = zzlp;
    }

    public final void run() {
        synchronized (this.f26826z) {
            try {
                zzgb B2 = this.F.f26759d;
                if (B2 == null) {
                    this.F.m().G().d("(legacy) Failed to get user properties; not connected to service", zzgi.v(this.f26824A), this.f26825B, this.C);
                    this.f26826z.set(Collections.emptyList());
                    this.f26826z.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f26824A)) {
                    Preconditions.m(this.D);
                    this.f26826z.set(B2.D2(this.f26825B, this.C, this.E, this.D));
                } else {
                    this.f26826z.set(B2.u0(this.f26824A, this.f26825B, this.C, this.E));
                }
                this.F.n0();
                this.f26826z.notify();
            } catch (RemoteException e2) {
                try {
                    this.F.m().G().d("(legacy) Failed to get user properties; remote exception", zzgi.v(this.f26824A), this.f26825B, e2);
                    this.f26826z.set(Collections.emptyList());
                    this.f26826z.notify();
                } catch (Throwable th) {
                    this.f26826z.notify();
                    throw th;
                }
            }
        }
    }
}
