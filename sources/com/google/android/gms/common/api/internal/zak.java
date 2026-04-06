package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public final class zak extends zap {
    public final SparseArray E;

    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i2 = 0; i2 < this.E.size(); i2++) {
            zaj u2 = u(i2);
            if (u2 != null) {
                printWriter.append(str).append("GoogleApiClient #").print(u2.f24744l);
                printWriter.println(":");
                u2.f24745m.f(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    public final void j() {
        super.j();
        SparseArray sparseArray = this.E;
        boolean z2 = this.f24759A;
        String valueOf = String.valueOf(sparseArray);
        Log.d("AutoManageHelper", "onStart " + z2 + " " + valueOf);
        if (this.f24760B.get() == null) {
            for (int i2 = 0; i2 < this.E.size(); i2++) {
                zaj u2 = u(i2);
                if (u2 != null) {
                    u2.f24745m.d();
                }
            }
        }
    }

    public final void k() {
        super.k();
        for (int i2 = 0; i2 < this.E.size(); i2++) {
            zaj u2 = u(i2);
            if (u2 != null) {
                u2.f24745m.e();
            }
        }
    }

    public final void m(ConnectionResult connectionResult, int i2) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i2 < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        zaj zaj = (zaj) this.E.get(i2);
        if (zaj != null) {
            t(i2);
            GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = zaj.f24746n;
            if (onConnectionFailedListener != null) {
                onConnectionFailedListener.N(connectionResult);
            }
        }
    }

    public final void n() {
        for (int i2 = 0; i2 < this.E.size(); i2++) {
            zaj u2 = u(i2);
            if (u2 != null) {
                u2.f24745m.d();
            }
        }
    }

    public final void t(int i2) {
        zaj zaj = (zaj) this.E.get(i2);
        this.E.remove(i2);
        if (zaj != null) {
            zaj.f24745m.i(zaj);
            zaj.f24745m.e();
        }
    }

    public final zaj u(int i2) {
        if (this.E.size() <= i2) {
            return null;
        }
        SparseArray sparseArray = this.E;
        return (zaj) sparseArray.get(sparseArray.keyAt(i2));
    }
}
