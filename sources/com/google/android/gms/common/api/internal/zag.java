package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zag extends zac {

    /* renamed from: b  reason: collision with root package name */
    public final TaskApiCall f24739b;

    /* renamed from: c  reason: collision with root package name */
    public final TaskCompletionSource f24740c;

    /* renamed from: d  reason: collision with root package name */
    public final StatusExceptionMapper f24741d;

    public zag(int i2, TaskApiCall taskApiCall, TaskCompletionSource taskCompletionSource, StatusExceptionMapper statusExceptionMapper) {
        super(i2);
        this.f24740c = taskCompletionSource;
        this.f24739b = taskApiCall;
        this.f24741d = statusExceptionMapper;
        if (i2 == 2 && taskApiCall.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    public final void a(Status status) {
        this.f24740c.d(this.f24741d.a(status));
    }

    public final void b(Exception exc) {
        this.f24740c.d(exc);
    }

    public final void c(zabq zabq) {
        try {
            this.f24739b.b(zabq.t(), this.f24740c);
        } catch (DeadObjectException e2) {
            throw e2;
        } catch (RemoteException e3) {
            a(zai.e(e3));
        } catch (RuntimeException e4) {
            this.f24740c.d(e4);
        }
    }

    public final void d(zaad zaad, boolean z2) {
        zaad.d(this.f24740c, z2);
    }

    public final boolean f(zabq zabq) {
        return this.f24739b.c();
    }

    public final Feature[] g(zabq zabq) {
        return this.f24739b.e();
    }
}
