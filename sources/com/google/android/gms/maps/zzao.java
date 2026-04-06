package com.google.android.gms.maps;

import android.app.Activity;
import android.app.Fragment;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.OnDelegateCreatedListener;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.internal.zzca;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

final class zzao extends DeferredLifecycleHelper<zzan> {

    /* renamed from: e  reason: collision with root package name */
    public final Fragment f26097e;

    /* renamed from: f  reason: collision with root package name */
    public OnDelegateCreatedListener f26098f;

    /* renamed from: g  reason: collision with root package name */
    public Activity f26099g;

    /* renamed from: h  reason: collision with root package name */
    public final List f26100h = new ArrayList();

    public zzao(Fragment fragment) {
        this.f26097e = fragment;
    }

    public static /* synthetic */ void v(zzao zzao, Activity activity) {
        zzao.f26099g = activity;
        zzao.w();
    }

    public final void a(OnDelegateCreatedListener onDelegateCreatedListener) {
        this.f26098f = onDelegateCreatedListener;
        w();
    }

    public final void w() {
        if (this.f26099g != null && this.f26098f != null && b() == null) {
            try {
                MapsInitializer.a(this.f26099g);
                this.f26098f.a(new zzan(this.f26097e, zzca.a(this.f26099g, (MapsInitializer.Renderer) null).M0(ObjectWrapper.u1(this.f26099g))));
                for (OnStreetViewPanoramaReadyCallback a2 : this.f26100h) {
                    ((zzan) b()).a(a2);
                }
                this.f26100h.clear();
            } catch (RemoteException e2) {
                throw new RuntimeRemoteException(e2);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }
}
