package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.OnDelegateCreatedListener;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import com.google.android.gms.maps.internal.zzca;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.List;

final class zzah extends DeferredLifecycleHelper<zzag> {

    /* renamed from: e  reason: collision with root package name */
    public final ViewGroup f26085e;

    /* renamed from: f  reason: collision with root package name */
    public final Context f26086f;

    /* renamed from: g  reason: collision with root package name */
    public OnDelegateCreatedListener f26087g;

    /* renamed from: h  reason: collision with root package name */
    public final GoogleMapOptions f26088h;

    /* renamed from: i  reason: collision with root package name */
    public final List f26089i;

    public final void a(OnDelegateCreatedListener onDelegateCreatedListener) {
        this.f26087g = onDelegateCreatedListener;
        v();
    }

    public final void v() {
        if (this.f26087g != null && b() == null) {
            try {
                MapsInitializer.a(this.f26086f);
                IMapViewDelegate V1 = zzca.a(this.f26086f, (MapsInitializer.Renderer) null).V1(ObjectWrapper.u1(this.f26086f), this.f26088h);
                if (V1 != null) {
                    this.f26087g.a(new zzag(this.f26085e, V1));
                    for (OnMapReadyCallback a2 : this.f26089i) {
                        ((zzag) b()).a(a2);
                    }
                    this.f26089i.clear();
                }
            } catch (RemoteException e2) {
                throw new RuntimeRemoteException(e2);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }
}
