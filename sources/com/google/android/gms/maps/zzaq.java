package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.zzbq;

final class zzaq extends zzbq {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ OnStreetViewPanoramaReadyCallback f26101l;

    public zzaq(zzar zzar, OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        this.f26101l = onStreetViewPanoramaReadyCallback;
    }

    public final void c0(IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate) {
        this.f26101l.a(new StreetViewPanorama(iStreetViewPanoramaDelegate));
    }
}
