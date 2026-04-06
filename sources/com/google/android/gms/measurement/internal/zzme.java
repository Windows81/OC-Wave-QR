package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzdl;

final class zzme implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f26799A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ zzdl f26800B;
    public final /* synthetic */ zzlp C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ zzbh f26801z;

    public zzme(zzlp zzlp, zzbh zzbh, String str, zzdl zzdl) {
        this.f26801z = zzbh;
        this.f26799A = str;
        this.f26800B = zzdl;
        this.C = zzlp;
    }

    public final void run() {
        byte[] bArr = null;
        try {
            zzgb B2 = this.C.f26759d;
            if (B2 == null) {
                this.C.m().G().a("Discarding data. Failed to send event to service to bundle");
                return;
            }
            bArr = B2.X(this.f26801z, this.f26799A);
            this.C.n0();
            this.C.j().V(this.f26800B, bArr);
        } catch (RemoteException e2) {
            this.C.m().G().b("Failed to send event to the service to bundle", e2);
        } finally {
            this.C.j().V(this.f26800B, bArr);
        }
    }
}
