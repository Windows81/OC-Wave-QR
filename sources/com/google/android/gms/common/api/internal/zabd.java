package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

final class zabd extends zabw {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f24609a;

    public zabd(zabe zabe) {
        this.f24609a = new WeakReference(zabe);
    }

    public final void a() {
        zabe zabe = (zabe) this.f24609a.get();
        if (zabe != null) {
            zabe.r(zabe);
        }
    }
}
