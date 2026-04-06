package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import com.google.android.gms.maps.internal.MapLifecycleDelegate;
import com.google.android.gms.maps.internal.zzbz;
import com.google.android.gms.maps.model.RuntimeRemoteException;

final class zzag implements MapLifecycleDelegate {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f26082a;

    /* renamed from: b  reason: collision with root package name */
    public final IMapViewDelegate f26083b;

    /* renamed from: c  reason: collision with root package name */
    public View f26084c;

    public zzag(ViewGroup viewGroup, IMapViewDelegate iMapViewDelegate) {
        this.f26083b = (IMapViewDelegate) Preconditions.m(iMapViewDelegate);
        this.f26082a = (ViewGroup) Preconditions.m(viewGroup);
    }

    public final void a(OnMapReadyCallback onMapReadyCallback) {
        try {
            this.f26083b.H(new zzaf(this, onMapReadyCallback));
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void j() {
        try {
            this.f26083b.j();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void l() {
        try {
            this.f26083b.l();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void n() {
        try {
            this.f26083b.n();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void o() {
        try {
            this.f26083b.o();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void onLowMemory() {
        try {
            this.f26083b.onLowMemory();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void p(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            zzbz.b(bundle, bundle2);
            this.f26083b.p(bundle2);
            zzbz.b(bundle2, bundle);
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void q() {
        try {
            this.f26083b.q();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void s(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            zzbz.b(bundle, bundle2);
            this.f26083b.s(bundle2);
            zzbz.b(bundle2, bundle);
            this.f26084c = (View) ObjectWrapper.P(this.f26083b.r());
            this.f26082a.removeAllViews();
            this.f26082a.addView(this.f26084c);
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void w() {
        throw new UnsupportedOperationException("onDestroyView not allowed on MapViewDelegate");
    }

    public final void x(Activity activity, Bundle bundle, Bundle bundle2) {
        throw new UnsupportedOperationException("onInflate not allowed on MapViewDelegate");
    }

    public final View y(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        throw new UnsupportedOperationException("onCreateView not allowed on MapViewDelegate");
    }
}
