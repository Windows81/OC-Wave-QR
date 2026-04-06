package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.zzbq;

final class zzaw extends zzbq {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ OnStreetViewPanoramaReadyCallback f26117l;

    public zzaw(zzax zzax, OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        this.f26117l = onStreetViewPanoramaReadyCallback;
    }

    public final void c0(IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate) {
        this.f26117l.a(new StreetViewPanorama(iStreetViewPanoramaDelegate));
    }
}
