package com.google.android.gms.dynamic;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;

final class zad implements zah {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FrameLayout f25210a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LayoutInflater f25211b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f25212c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Bundle f25213d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ DeferredLifecycleHelper f25214e;

    public zad(DeferredLifecycleHelper deferredLifecycleHelper, FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f25214e = deferredLifecycleHelper;
        this.f25210a = frameLayout;
        this.f25211b = layoutInflater;
        this.f25212c = viewGroup;
        this.f25213d = bundle;
    }

    public final int b() {
        return 2;
    }

    public final void c(LifecycleDelegate lifecycleDelegate) {
        this.f25210a.removeAllViews();
        this.f25210a.addView(this.f25214e.f25194a.y(this.f25211b, this.f25212c, this.f25213d));
    }
}
