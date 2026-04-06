package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.zzaq;

final class zzaf extends zzaq {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ OnMapReadyCallback f26081l;

    public zzaf(zzag zzag, OnMapReadyCallback onMapReadyCallback) {
        this.f26081l = onMapReadyCallback;
    }

    public final void x0(IGoogleMapDelegate iGoogleMapDelegate) {
        this.f26081l.a(new GoogleMap(iGoogleMapDelegate));
    }
}
