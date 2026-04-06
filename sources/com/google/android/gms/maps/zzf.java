package com.google.android.gms.maps;

import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.maps.zzx;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzh;
import com.google.android.gms.maps.model.Marker;

final class zzf extends zzh {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ GoogleMap.InfoWindowAdapter f26128l;

    public final IObjectWrapper B(zzx zzx) {
        return ObjectWrapper.u1(this.f26128l.b(new Marker(zzx)));
    }

    public final IObjectWrapper f(zzx zzx) {
        return ObjectWrapper.u1(this.f26128l.a(new Marker(zzx)));
    }
}
