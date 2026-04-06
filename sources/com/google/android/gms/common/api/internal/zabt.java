package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;

final class zabt implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zabu f24673A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ConnectionResult f24674z;

    public zabt(zabu zabu, ConnectionResult connectionResult) {
        this.f24673A = zabu;
        this.f24674z = connectionResult;
    }

    public final void run() {
        zabu zabu = this.f24673A;
        zabq zabq = (zabq) zabu.f24680f.f24493j.get(zabu.f24676b);
        if (zabq != null) {
            if (this.f24674z.f0()) {
                this.f24673A.f24679e = true;
                if (this.f24673A.f24675a.t()) {
                    this.f24673A.i();
                    return;
                }
                try {
                    zabu zabu2 = this.f24673A;
                    zabu2.f24675a.e((IAccountAccessor) null, zabu2.f24675a.d());
                } catch (SecurityException e2) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e2);
                    this.f24673A.f24675a.f("Failed to get service from broker.");
                    zabq.F(new ConnectionResult(10), (Exception) null);
                }
            } else {
                zabq.F(this.f24674z, (Exception) null);
            }
        }
    }
}
