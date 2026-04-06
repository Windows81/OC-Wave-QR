package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.animation.core.h;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.internal.base.zau;
import java.util.concurrent.atomic.AtomicReference;

public abstract class zap extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: A  reason: collision with root package name */
    public volatile boolean f24759A;

    /* renamed from: B  reason: collision with root package name */
    public final AtomicReference f24760B = new AtomicReference((Object) null);
    public final Handler C = new zau(Looper.getMainLooper());
    public final GoogleApiAvailability D;

    public zap(LifecycleFragment lifecycleFragment, GoogleApiAvailability googleApiAvailability) {
        super(lifecycleFragment);
        this.D = googleApiAvailability;
    }

    public static final int p(zam zam) {
        if (zam == null) {
            return -1;
        }
        return zam.a();
    }

    public final void e(int i2, int i3, Intent intent) {
        zam zam = (zam) this.f24760B.get();
        if (i2 != 1) {
            if (i2 == 2) {
                int i4 = this.D.i(b());
                if (i4 == 0) {
                    o();
                    return;
                } else if (zam == null) {
                    return;
                } else {
                    if (zam.b().H() == 18 && i4 == 18) {
                        return;
                    }
                }
            }
        } else if (i3 == -1) {
            o();
            return;
        } else if (i3 == 0) {
            if (zam != null) {
                int i5 = 13;
                if (intent != null) {
                    i5 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                }
                l(new ConnectionResult(i5, (PendingIntent) null, zam.b().toString()), p(zam));
                return;
            }
            return;
        }
        if (zam != null) {
            l(zam.b(), zam.a());
        }
    }

    public final void f(Bundle bundle) {
        super.f(bundle);
        if (bundle != null) {
            this.f24760B.set(bundle.getBoolean("resolving_error", false) ? new zam(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    public final void i(Bundle bundle) {
        super.i(bundle);
        zam zam = (zam) this.f24760B.get();
        if (zam != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", zam.a());
            bundle.putInt("failed_status", zam.b().H());
            bundle.putParcelable("failed_resolution", zam.b().S());
        }
    }

    public void j() {
        super.j();
        this.f24759A = true;
    }

    public void k() {
        super.k();
        this.f24759A = false;
    }

    public final void l(ConnectionResult connectionResult, int i2) {
        this.f24760B.set((Object) null);
        m(connectionResult, i2);
    }

    public abstract void m(ConnectionResult connectionResult, int i2);

    public abstract void n();

    public final void o() {
        this.f24760B.set((Object) null);
        n();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        l(new ConnectionResult(13, (PendingIntent) null), p((zam) this.f24760B.get()));
    }

    public final void s(ConnectionResult connectionResult, int i2) {
        AtomicReference atomicReference;
        zam zam = new zam(connectionResult, i2);
        do {
            atomicReference = this.f24760B;
            if (h.a(atomicReference, (Object) null, zam)) {
                this.C.post(new zao(this, zam));
                return;
            }
        } while (atomicReference.get() == null);
    }
}
