package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

abstract class zad extends zac {

    /* renamed from: b  reason: collision with root package name */
    public final TaskCompletionSource f24723b;

    public zad(int i2, TaskCompletionSource taskCompletionSource) {
        super(i2);
        this.f24723b = taskCompletionSource;
    }

    public final void a(Status status) {
        this.f24723b.d(new ApiException(status));
    }

    public final void b(Exception exc) {
        this.f24723b.d(exc);
    }

    public final void c(zabq zabq) {
        try {
            h(zabq);
        } catch (DeadObjectException e2) {
            a(zai.e(e2));
            throw e2;
        } catch (RemoteException e3) {
            a(zai.e(e3));
        } catch (RuntimeException e4) {
            this.f24723b.d(e4);
        }
    }

    public void d(zaad zaad, boolean z2) {
    }

    public abstract void h(zabq zabq);
}
