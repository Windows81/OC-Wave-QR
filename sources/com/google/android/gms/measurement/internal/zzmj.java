package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;

final class zzmj implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zzp f26812A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f26813B;
    public final /* synthetic */ zzbh C;
    public final /* synthetic */ String D;
    public final /* synthetic */ zzlp E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f26814z;

    public zzmj(zzlp zzlp, boolean z2, zzp zzp, boolean z3, zzbh zzbh, String str) {
        this.f26814z = z2;
        this.f26812A = zzp;
        this.f26813B = z3;
        this.C = zzbh;
        this.D = str;
        this.E = zzlp;
    }

    public final void run() {
        zzgb B2 = this.E.f26759d;
        if (B2 == null) {
            this.E.m().G().a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.f26814z) {
            Preconditions.m(this.f26812A);
            this.E.K(B2, this.f26813B ? null : this.C, this.f26812A);
        } else {
            try {
                if (TextUtils.isEmpty(this.D)) {
                    Preconditions.m(this.f26812A);
                    B2.Y(this.C, this.f26812A);
                } else {
                    B2.V(this.C, this.D, this.E.m().O());
                }
            } catch (RemoteException e2) {
                this.E.m().G().b("Failed to send event to the service", e2);
            }
        }
        this.E.n0();
    }
}
