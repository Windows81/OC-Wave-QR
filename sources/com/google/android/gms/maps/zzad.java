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
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.internal.MapLifecycleDelegate;
import com.google.android.gms.maps.internal.zzbz;
import com.google.android.gms.maps.model.RuntimeRemoteException;

final class zzad implements MapLifecycleDelegate {

    /* renamed from: a  reason: collision with root package name */
    public final Fragment f26075a;

    /* renamed from: b  reason: collision with root package name */
    public final IMapFragmentDelegate f26076b;

    public zzad(Fragment fragment, IMapFragmentDelegate iMapFragmentDelegate) {
        this.f26076b = (IMapFragmentDelegate) Preconditions.m(iMapFragmentDelegate);
        this.f26075a = (Fragment) Preconditions.m(fragment);
    }

    public final void a(OnMapReadyCallback onMapReadyCallback) {
        try {
            this.f26076b.H(new zzac(this, onMapReadyCallback));
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void j() {
        try {
            this.f26076b.j();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void l() {
        try {
            this.f26076b.l();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void n() {
        try {
            this.f26076b.n();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void o() {
        try {
            this.f26076b.o();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void onLowMemory() {
        try {
            this.f26076b.onLowMemory();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void p(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            zzbz.b(bundle, bundle2);
            this.f26076b.p(bundle2);
            zzbz.b(bundle2, bundle);
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void q() {
        try {
            this.f26076b.q();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void s(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            zzbz.b(bundle, bundle2);
            Bundle arguments = this.f26075a.getArguments();
            if (arguments != null && arguments.containsKey("MapOptions")) {
                zzbz.c(bundle2, "MapOptions", arguments.getParcelable("MapOptions"));
            }
            this.f26076b.s(bundle2);
            zzbz.b(bundle2, bundle);
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void w() {
        try {
            this.f26076b.w();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void x(Activity activity, Bundle bundle, Bundle bundle2) {
        GoogleMapOptions googleMapOptions = (GoogleMapOptions) bundle.getParcelable("MapOptions");
        try {
            Bundle bundle3 = new Bundle();
            zzbz.b(bundle2, bundle3);
            this.f26076b.U0(ObjectWrapper.u1(activity), googleMapOptions, bundle3);
            zzbz.b(bundle3, bundle2);
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final View y(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            zzbz.b(bundle, bundle2);
            IObjectWrapper D = this.f26076b.D(ObjectWrapper.u1(layoutInflater), ObjectWrapper.u1(viewGroup), bundle2);
            zzbz.b(bundle2, bundle);
            return (View) ObjectWrapper.P(D);
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }
}
