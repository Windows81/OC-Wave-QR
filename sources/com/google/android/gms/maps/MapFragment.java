package com.google.android.gms.maps;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MapFragment extends Fragment {

    /* renamed from: z  reason: collision with root package name */
    public final zzae f25953z = new zzae(this);

    public void onActivityCreated(Bundle bundle) {
        ClassLoader classLoader = MapFragment.class.getClassLoader();
        if (!(bundle == null || classLoader == null)) {
            bundle.setClassLoader(classLoader);
        }
        super.onActivityCreated(bundle);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        zzae.v(this.f25953z, activity);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f25953z.d(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View e2 = this.f25953z.e(layoutInflater, viewGroup, bundle);
        e2.setClickable(true);
        return e2;
    }

    public void onDestroy() {
        this.f25953z.f();
        super.onDestroy();
    }

    public void onDestroyView() {
        this.f25953z.g();
        super.onDestroyView();
    }

    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            zzae.v(this.f25953z, activity);
            GoogleMapOptions f0 = GoogleMapOptions.f0(activity, attributeSet);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("MapOptions", f0);
            this.f25953z.h(activity, bundle2, bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onLowMemory() {
        this.f25953z.i();
        super.onLowMemory();
    }

    public void onPause() {
        this.f25953z.j();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f25953z.k();
    }

    public void onSaveInstanceState(Bundle bundle) {
        ClassLoader classLoader = MapFragment.class.getClassLoader();
        if (!(bundle == null || classLoader == null)) {
            bundle.setClassLoader(classLoader);
        }
        super.onSaveInstanceState(bundle);
        this.f25953z.l(bundle);
    }

    public void onStart() {
        super.onStart();
        this.f25953z.m();
    }

    public void onStop() {
        this.f25953z.n();
        super.onStop();
    }

    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}
