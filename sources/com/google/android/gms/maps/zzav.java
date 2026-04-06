package com.google.android.gms.maps;

import android.app.Activity;
import android.os.RemoteException;
import androidx.fragment.app.Fragment;
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

final class zzav extends DeferredLifecycleHelper<zzau> {

    /* renamed from: e  reason: collision with root package name */
    public final Fragment f26113e;

    /* renamed from: f  reason: collision with root package name */
    public OnDelegateCreatedListener f26114f;

    /* renamed from: g  reason: collision with root package name */
    public Activity f26115g;

    /* renamed from: h  reason: collision with root package name */
    public final List f26116h = new ArrayList();

    public zzav(Fragment fragment) {
        this.f26113e = fragment;
    }

    public static /* synthetic */ void v(zzav zzav, Activity activity) {
        zzav.f26115g = activity;
        zzav.w();
    }

    public final void a(OnDelegateCreatedListener onDelegateCreatedListener) {
        this.f26114f = onDelegateCreatedListener;
        w();
    }

    public final void w() {
        if (this.f26115g != null && this.f26114f != null && b() == null) {
            try {
                MapsInitializer.a(this.f26115g);
                IMapFragmentDelegate b0 = zzca.a(this.f26115g, (MapsInitializer.Renderer) null).b0(ObjectWrapper.u1(this.f26115g));
                if (b0 != null) {
                    this.f26114f.a(new zzau(this.f26113e, b0));
                    for (OnMapReadyCallback a2 : this.f26116h) {
                        ((zzau) b()).a(a2);
                    }
                    this.f26116h.clear();
                }
            } catch (RemoteException e2) {
                throw new RuntimeRemoteException(e2);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }
}
