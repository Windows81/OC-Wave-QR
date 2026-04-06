package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate;
import com.google.android.gms.maps.internal.StreetViewLifecycleDelegate;
import com.google.android.gms.maps.internal.zzbz;
import com.google.android.gms.maps.model.RuntimeRemoteException;

final class zzar implements StreetViewLifecycleDelegate {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f26102a;

    /* renamed from: b  reason: collision with root package name */
    public final IStreetViewPanoramaViewDelegate f26103b;

    /* renamed from: c  reason: collision with root package name */
    public View f26104c;

    public zzar(ViewGroup viewGroup, IStreetViewPanoramaViewDelegate iStreetViewPanoramaViewDelegate) {
        this.f26103b = (IStreetViewPanoramaViewDelegate) Preconditions.m(iStreetViewPanoramaViewDelegate);
        this.f26102a = (ViewGroup) Preconditions.m(viewGroup);
    }

    public final void a(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        try {
            this.f26103b.O(new zzaq(this, onStreetViewPanoramaReadyCallback));
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void j() {
        try {
            this.f26103b.j();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void l() {
        try {
            this.f26103b.l();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void n() {
        try {
            this.f26103b.n();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void o() {
        try {
            this.f26103b.o();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void onLowMemory() {
        try {
            this.f26103b.onLowMemory();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void p(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            zzbz.b(bundle, bundle2);
            this.f26103b.p(bundle2);
            zzbz.b(bundle2, bundle);
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void q() {
        try {
            this.f26103b.q();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void s(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            zzbz.b(bundle, bundle2);
            this.f26103b.s(bundle2);
            zzbz.b(bundle2, bundle);
            this.f26104c = (View) ObjectWrapper.P(this.f26103b.r());
            this.f26102a.removeAllViews();
            this.f26102a.addView(this.f26104c);
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void w() {
        throw new UnsupportedOperationException("onDestroyView not allowed on StreetViewPanoramaViewDelegate");
    }

    public final void x(Activity activity, Bundle bundle, Bundle bundle2) {
        throw new UnsupportedOperationException("onInflate not allowed on StreetViewPanoramaViewDelegate");
    }

    public final View y(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        throw new UnsupportedOperationException("onCreateView not allowed on StreetViewPanoramaViewDelegate");
    }
}
