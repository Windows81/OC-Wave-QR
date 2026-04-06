package com.google.android.gms.maps.model;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class BitmapDescriptor {

    /* renamed from: a  reason: collision with root package name */
    public final IObjectWrapper f25993a;

    public BitmapDescriptor(IObjectWrapper iObjectWrapper) {
        this.f25993a = (IObjectWrapper) Preconditions.m(iObjectWrapper);
    }

    public final IObjectWrapper a() {
        return this.f25993a;
    }
}
