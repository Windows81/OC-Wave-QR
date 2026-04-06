package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.IStatusCallback;

public class StatusCallback extends IStatusCallback.Stub {

    /* renamed from: l  reason: collision with root package name */
    public final BaseImplementation.ResultHolder f24525l;

    public void K0(Status status) {
        this.f24525l.a(status);
    }
}
