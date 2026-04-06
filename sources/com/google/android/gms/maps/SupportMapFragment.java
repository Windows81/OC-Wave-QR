package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

public class SupportMapFragment extends Fragment {
    public final zzav B0 = new zzav(this);

    public View D0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View e2 = this.B0.e(layoutInflater, viewGroup, bundle);
        e2.setClickable(true);
        return e2;
    }

    public void E0() {
        this.B0.f();
        super.E0();
    }

    public void G0() {
        this.B0.g();
        super.G0();
    }

    public void H1(Bundle bundle) {
        super.H1(bundle);
    }

    public void K0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.K0(activity, attributeSet, bundle);
            zzav.v(this.B0, activity);
            GoogleMapOptions f0 = GoogleMapOptions.f0(activity, attributeSet);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("MapOptions", f0);
            this.B0.h(activity, bundle2, bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void P0() {
        this.B0.j();
        super.P0();
    }

    public void U0() {
        super.U0();
        this.B0.k();
    }

    public void V0(Bundle bundle) {
        ClassLoader classLoader = SupportMapFragment.class.getClassLoader();
        if (!(bundle == null || classLoader == null)) {
            bundle.setClassLoader(classLoader);
        }
        super.V0(bundle);
        this.B0.l(bundle);
    }

    public void W0() {
        super.W0();
        this.B0.m();
    }

    public void X0() {
        this.B0.n();
        super.X0();
    }

    public void onLowMemory() {
        this.B0.i();
        super.onLowMemory();
    }

    public void t0(Bundle bundle) {
        ClassLoader classLoader = SupportMapFragment.class.getClassLoader();
        if (!(bundle == null || classLoader == null)) {
            bundle.setClassLoader(classLoader);
        }
        super.t0(bundle);
    }

    public void v0(Activity activity) {
        super.v0(activity);
        zzav.v(this.B0, activity);
    }

    public void z0(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.z0(bundle);
            this.B0.d(bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
