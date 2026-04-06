package com.google.android.gms.maps;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate;
import com.google.android.gms.maps.internal.StreetViewLifecycleDelegate;
import com.google.android.gms.maps.internal.zzbz;
import com.google.android.gms.maps.model.RuntimeRemoteException;

final class zzan implements StreetViewLifecycleDelegate {

    /* renamed from: a  reason: collision with root package name */
    public final Fragment f26095a;

    /* renamed from: b  reason: collision with root package name */
    public final IStreetViewPanoramaFragmentDelegate f26096b;

    public zzan(Fragment fragment, IStreetViewPanoramaFragmentDelegate iStreetViewPanoramaFragmentDelegate) {
        this.f26096b = (IStreetViewPanoramaFragmentDelegate) Preconditions.m(iStreetViewPanoramaFragmentDelegate);
        this.f26095a = (Fragment) Preconditions.m(fragment);
    }

    public final void a(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        try {
            this.f26096b.O(new zzam(this, onStreetViewPanoramaReadyCallback));
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void j() {
        try {
            this.f26096b.j();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void l() {
        try {
            this.f26096b.l();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void n() {
        try {
            this.f26096b.n();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void o() {
        try {
            this.f26096b.o();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void onLowMemory() {
        try {
            this.f26096b.onLowMemory();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void p(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            zzbz.b(bundle, bundle2);
            this.f26096b.p(bundle2);
            zzbz.b(bundle2, bundle);
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void q() {
        try {
            this.f26096b.q();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void s(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            zzbz.b(bundle, bundle2);
            Bundle arguments = this.f26095a.getArguments();
            if (arguments != null && arguments.containsKey("StreetViewPanoramaOptions")) {
                zzbz.c(bundle2, "StreetViewPanoramaOptions", arguments.getParcelable("StreetViewPanoramaOptions"));
            }
            this.f26096b.s(bundle2);
            zzbz.b(bundle2, bundle);
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void w() {
        try {
            this.f26096b.w();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void x(Activity activity, Bundle bundle, Bundle bundle2) {
        try {
            Bundle bundle3 = new Bundle();
            zzbz.b(bundle2, bundle3);
            this.f26096b.s1(ObjectWrapper.u1(activity), (StreetViewPanoramaOptions) null, bundle3);
            zzbz.b(bundle3, bundle2);
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final View y(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            zzbz.b(bundle, bundle2);
            IObjectWrapper D = this.f26096b.D(ObjectWrapper.u1(layoutInflater), ObjectWrapper.u1(viewGroup), bundle2);
            zzbz.b(bundle2, bundle);
            return (View) ObjectWrapper.P(D);
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }
}
