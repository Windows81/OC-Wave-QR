package com.google.android.gms.maps;

import android.app.Activity;
import android.app.Fragment;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.OnDelegateCreatedListener;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.internal.zzca;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

final class zzae extends DeferredLifecycleHelper<zzad> {

    /* renamed from: e  reason: collision with root package name */
    public final Fragment f26077e;

    /* renamed from: f  reason: collision with root package name */
    public OnDelegateCreatedListener f26078f;

    /* renamed from: g  reason: collision with root package name */
    public Activity f26079g;

    /* renamed from: h  reason: collision with root package name */
    public final List f26080h = new ArrayList();

    public zzae(Fragment fragment) {
        this.f26077e = fragment;
    }

    public static /* synthetic */ void v(zzae zzae, Activity activity) {
        zzae.f26079g = activity;
        zzae.w();
    }

    public final void a(OnDelegateCreatedListener onDelegateCreatedListener) {
        this.f26078f = onDelegateCreatedListener;
        w();
    }

    public final void w() {
        if (this.f26079g != null && this.f26078f != null && b() == null) {
            try {
                MapsInitializer.a(this.f26079g);
                IMapFragmentDelegate b0 = zzca.a(this.f26079g, (MapsInitializer.Renderer) null).b0(ObjectWrapper.u1(this.f26079g));
                if (b0 != null) {
                    this.f26078f.a(new zzad(this.f26077e, b0));
                    for (OnMapReadyCallback a2 : this.f26080h) {
                        ((zzad) b()).a(a2);
                    }
                    this.f26080h.clear();
                }
            } catch (RemoteException e2) {
                throw new RuntimeRemoteException(e2);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }
}
