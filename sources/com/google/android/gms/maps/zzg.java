package com.google.android.gms.maps;

import android.location.Location;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzay;

final class zzg extends zzay {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ GoogleMap.OnMyLocationChangeListener f26129l;

    public final void D1(IObjectWrapper iObjectWrapper) {
        this.f26129l.a((Location) ObjectWrapper.P(iObjectWrapper));
    }
}
