package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.zzaq;

final class zzac extends zzaq {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ OnMapReadyCallback f26074l;

    public zzac(zzad zzad, OnMapReadyCallback onMapReadyCallback) {
        this.f26074l = onMapReadyCallback;
    }

    public final void x0(IGoogleMapDelegate iGoogleMapDelegate) {
        this.f26074l.a(new GoogleMap(iGoogleMapDelegate));
    }
}
