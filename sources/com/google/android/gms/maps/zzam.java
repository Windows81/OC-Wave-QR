package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.zzbq;

final class zzam extends zzbq {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ OnStreetViewPanoramaReadyCallback f26094l;

    public zzam(zzan zzan, OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        this.f26094l = onStreetViewPanoramaReadyCallback;
    }

    public final void c0(IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate) {
        this.f26094l.a(new StreetViewPanorama(iStreetViewPanoramaDelegate));
    }
}
