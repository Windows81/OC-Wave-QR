package com.google.android.gms.maps.internal;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.GoogleMapOptions;

public interface IMapFragmentDelegate extends IInterface {
    IObjectWrapper D(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, Bundle bundle);

    void H(zzar zzar);

    void U0(IObjectWrapper iObjectWrapper, GoogleMapOptions googleMapOptions, Bundle bundle);

    void j();

    void l();

    void n();

    void o();

    void onLowMemory();

    void p(Bundle bundle);

    void q();

    void s(Bundle bundle);

    void w();
}
