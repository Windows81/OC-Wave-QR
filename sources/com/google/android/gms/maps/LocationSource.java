package com.google.android.gms.maps;

public interface LocationSource {

    public interface OnLocationChangedListener {
    }

    void a(OnLocationChangedListener onLocationChangedListener);

    void deactivate();
}
