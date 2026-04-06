package com.google.android.gms.maps;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class StreetViewPanoramaFragment extends Fragment {

    /* renamed from: z  reason: collision with root package name */
    public final zzao f25986z = new zzao(this);

    public void onActivityCreated(Bundle bundle) {
        ClassLoader classLoader = StreetViewPanoramaFragment.class.getClassLoader();
        if (!(bundle == null || classLoader == null)) {
            bundle.setClassLoader(classLoader);
        }
        super.onActivityCreated(bundle);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        zzao.v(this.f25986z, activity);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f25986z.d(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f25986z.e(layoutInflater, viewGroup, bundle);
    }

    public void onDestroy() {
        this.f25986z.f();
        super.onDestroy();
    }

    public void onDestroyView() {
        this.f25986z.g();
        super.onDestroyView();
    }

    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            zzao.v(this.f25986z, activity);
            this.f25986z.h(activity, new Bundle(), bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onLowMemory() {
        this.f25986z.i();
        super.onLowMemory();
    }

    public void onPause() {
        this.f25986z.j();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f25986z.k();
    }

    public void onSaveInstanceState(Bundle bundle) {
        ClassLoader classLoader = StreetViewPanoramaFragment.class.getClassLoader();
        if (!(bundle == null || classLoader == null)) {
            bundle.setClassLoader(classLoader);
        }
        super.onSaveInstanceState(bundle);
        this.f25986z.l(bundle);
    }

    public void onStart() {
        super.onStart();
        this.f25986z.m();
    }

    public void onStop() {
        this.f25986z.n();
        super.onStop();
    }

    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}
