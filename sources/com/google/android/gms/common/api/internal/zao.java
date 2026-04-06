package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.Preconditions;

final class zao implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zap f24757A;

    /* renamed from: z  reason: collision with root package name */
    public final zam f24758z;

    public zao(zap zap, zam zam) {
        this.f24757A = zap;
        this.f24758z = zam;
    }

    public final void run() {
        if (this.f24757A.f24759A) {
            ConnectionResult b2 = this.f24758z.b();
            if (b2.X()) {
                zap zap = this.f24757A;
                zap.f24501z.startActivityForResult(GoogleApiActivity.a(zap.b(), (PendingIntent) Preconditions.m(b2.S()), this.f24758z.a(), false), 1);
                return;
            }
            zap zap2 = this.f24757A;
            if (zap2.D.d(zap2.b(), b2.H(), (String) null) != null) {
                zap zap3 = this.f24757A;
                zap3.D.z(zap3.b(), zap3.f24501z, b2.H(), 2, this.f24757A);
            } else if (b2.H() == 18) {
                zap zap4 = this.f24757A;
                Dialog u2 = zap4.D.u(zap4.b(), zap4);
                zap zap5 = this.f24757A;
                zap5.D.v(zap5.b().getApplicationContext(), new zan(this, u2));
            } else {
                this.f24757A.l(b2, this.f24758z.a());
            }
        }
    }
}
