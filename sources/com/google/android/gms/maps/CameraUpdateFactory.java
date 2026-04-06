package com.google.android.gms.maps;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;

public final class CameraUpdateFactory {

    /* renamed from: a  reason: collision with root package name */
    public static ICameraUpdateFactoryDelegate f25948a;

    public static void a(ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate) {
        f25948a = (ICameraUpdateFactoryDelegate) Preconditions.m(iCameraUpdateFactoryDelegate);
    }
}
