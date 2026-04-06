package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.internal.MapLifecycleDelegate;
import com.google.android.gms.maps.internal.zzbz;
import com.google.android.gms.maps.model.RuntimeRemoteException;

final class zzau implements MapLifecycleDelegate {

    /* renamed from: a  reason: collision with root package name */
    public final Fragment f26111a;

    /* renamed from: b  reason: collision with root package name */
    public final IMapFragmentDelegate f26112b;

    public zzau(Fragment fragment, IMapFragmentDelegate iMapFragmentDelegate) {
        this.f26112b = (IMapFragmentDelegate) Preconditions.m(iMapFragmentDelegate);
        this.f26111a = (Fragment) Preconditions.m(fragment);
    }

    public final void a(OnMapReadyCallback onMapReadyCallback) {
        try {
            this.f26112b.H(new zzat(this, onMapReadyCallback));
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void j() {
        try {
            this.f26112b.j();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void l() {
        try {
            this.f26112b.l();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void n() {
        try {
            this.f26112b.n();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void o() {
        try {
            this.f26112b.o();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void onLowMemory() {
        try {
            this.f26112b.onLowMemory();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void p(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            zzbz.b(bundle, bundle2);
            this.f26112b.p(bundle2);
            zzbz.b(bundle2, bundle);
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void q() {
        try {
            this.f26112b.q();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void s(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            zzbz.b(bundle, bundle2);
            Bundle r2 = this.f26111a.r();
            if (r2 != null && r2.containsKey("MapOptions")) {
                zzbz.c(bundle2, "MapOptions", r2.getParcelable("MapOptions"));
            }
            this.f26112b.s(bundle2);
            zzbz.b(bundle2, bundle);
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void w() {
        try {
            this.f26112b.w();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void x(Activity activity, Bundle bundle, Bundle bundle2) {
        GoogleMapOptions googleMapOptions = (GoogleMapOptions) bundle.getParcelable("MapOptions");
        try {
            Bundle bundle3 = new Bundle();
            zzbz.b(bundle2, bundle3);
            this.f26112b.U0(ObjectWrapper.u1(activity), googleMapOptions, bundle3);
            zzbz.b(bundle3, bundle2);
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final View y(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy;
        try {
            Bundle bundle2 = new Bundle();
            zzbz.b(bundle, bundle2);
            threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
            IObjectWrapper D = this.f26112b.D(ObjectWrapper.u1(layoutInflater), ObjectWrapper.u1(viewGroup), bundle2);
            StrictMode.setThreadPolicy(threadPolicy);
            zzbz.b(bundle2, bundle);
            return (View) ObjectWrapper.P(D);
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }
}
