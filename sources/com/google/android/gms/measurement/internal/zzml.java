package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

final class zzml implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f26818A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ String f26819B;
    public final /* synthetic */ String C;
    public final /* synthetic */ zzp D;
    public final /* synthetic */ zzlp E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f26820z;

    public zzml(zzlp zzlp, AtomicReference atomicReference, String str, String str2, String str3, zzp zzp) {
        this.f26820z = atomicReference;
        this.f26818A = str;
        this.f26819B = str2;
        this.C = str3;
        this.D = zzp;
        this.E = zzlp;
    }

    public final void run() {
        synchronized (this.f26820z) {
            try {
                zzgb B2 = this.E.f26759d;
                if (B2 == null) {
                    this.E.m().G().d("(legacy) Failed to get conditional properties; not connected to service", zzgi.v(this.f26818A), this.f26819B, this.C);
                    this.f26820z.set(Collections.emptyList());
                    this.f26820z.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f26818A)) {
                    Preconditions.m(this.D);
                    this.f26820z.set(B2.n0(this.f26819B, this.C, this.D));
                } else {
                    this.f26820z.set(B2.l1(this.f26818A, this.f26819B, this.C));
                }
                this.E.n0();
                this.f26820z.notify();
            } catch (RemoteException e2) {
                try {
                    this.E.m().G().d("(legacy) Failed to get conditional properties; remote exception", zzgi.v(this.f26818A), this.f26819B, e2);
                    this.f26820z.set(Collections.emptyList());
                    this.f26820z.notify();
                } catch (Throwable th) {
                    this.f26820z.notify();
                    throw th;
                }
            }
        }
    }
}
