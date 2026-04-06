package com.google.android.gms.maps.internal;

import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.maps.zzi;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

public interface zzf extends IInterface {
    void G0(IObjectWrapper iObjectWrapper, int i2);

    IStreetViewPanoramaFragmentDelegate M0(IObjectWrapper iObjectWrapper);

    IStreetViewPanoramaViewDelegate R1(IObjectWrapper iObjectWrapper, StreetViewPanoramaOptions streetViewPanoramaOptions);

    IMapViewDelegate V1(IObjectWrapper iObjectWrapper, GoogleMapOptions googleMapOptions);

    IMapFragmentDelegate b0(IObjectWrapper iObjectWrapper);

    int e();

    ICameraUpdateFactoryDelegate g();

    void j0(IObjectWrapper iObjectWrapper, int i2);

    zzi m();
}
