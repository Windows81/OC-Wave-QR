package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.OnDelegateCreatedListener;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.internal.zzca;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.List;

final class zzas extends DeferredLifecycleHelper<zzar> {

    /* renamed from: e  reason: collision with root package name */
    public final ViewGroup f26105e;

    /* renamed from: f  reason: collision with root package name */
    public final Context f26106f;

    /* renamed from: g  reason: collision with root package name */
    public OnDelegateCreatedListener f26107g;

    /* renamed from: h  reason: collision with root package name */
    public final StreetViewPanoramaOptions f26108h;

    /* renamed from: i  reason: collision with root package name */
    public final List f26109i;

    public final void a(OnDelegateCreatedListener onDelegateCreatedListener) {
        this.f26107g = onDelegateCreatedListener;
        v();
    }

    public final void v() {
        if (this.f26107g != null && b() == null) {
            try {
                MapsInitializer.a(this.f26106f);
                this.f26107g.a(new zzar(this.f26105e, zzca.a(this.f26106f, (MapsInitializer.Renderer) null).R1(ObjectWrapper.u1(this.f26106f), this.f26108h)));
                for (OnStreetViewPanoramaReadyCallback a2 : this.f26109i) {
                    ((zzar) b()).a(a2);
                }
                this.f26109i.clear();
            } catch (RemoteException e2) {
                throw new RuntimeRemoteException(e2);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }
}
