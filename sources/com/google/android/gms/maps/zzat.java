package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.zzaq;

final class zzat extends zzaq {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ OnMapReadyCallback f26110l;

    public zzat(zzau zzau, OnMapReadyCallback onMapReadyCallback) {
        this.f26110l = onMapReadyCallback;
    }

    public final void x0(IGoogleMapDelegate iGoogleMapDelegate) {
        this.f26110l.a(new GoogleMap(iGoogleMapDelegate));
    }
}
