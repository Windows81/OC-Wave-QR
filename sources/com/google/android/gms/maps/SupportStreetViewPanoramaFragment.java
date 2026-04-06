package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

public class SupportStreetViewPanoramaFragment extends Fragment {
    public final zzay B0 = new zzay(this);

    public View D0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.B0.e(layoutInflater, viewGroup, bundle);
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
            zzay.v(this.B0, activity);
            this.B0.h(activity, new Bundle(), bundle);
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
        ClassLoader classLoader = SupportStreetViewPanoramaFragment.class.getClassLoader();
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
        ClassLoader classLoader = SupportStreetViewPanoramaFragment.class.getClassLoader();
        if (!(bundle == null || classLoader == null)) {
            bundle.setClassLoader(classLoader);
        }
        super.t0(bundle);
    }

    public void v0(Activity activity) {
        super.v0(activity);
        zzay.v(this.B0, activity);
    }

    public void z0(Bundle bundle) {
        super.z0(bundle);
        this.B0.d(bundle);
    }
}
