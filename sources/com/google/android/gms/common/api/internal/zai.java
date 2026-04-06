package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public abstract class zai {

    /* renamed from: a  reason: collision with root package name */
    public final int f24743a;

    public zai(int i2) {
        this.f24743a = i2;
    }

    public static /* bridge */ /* synthetic */ Status e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    public abstract void a(Status status);

    public abstract void b(Exception exc);

    public abstract void c(zabq zabq);

    public abstract void d(zaad zaad, boolean z2);
}
