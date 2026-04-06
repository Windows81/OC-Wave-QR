package com.google.android.gms.common.api.internal;

import com.google.android.gms.signin.internal.zac;
import com.google.android.gms.signin.internal.zak;
import java.lang.ref.WeakReference;

final class zaar extends zac {

    /* renamed from: l  reason: collision with root package name */
    public final WeakReference f24574l;

    public zaar(zaaw zaaw) {
        this.f24574l = new WeakReference(zaaw);
    }

    public final void E0(zak zak) {
        zaaw zaaw = (zaaw) this.f24574l.get();
        if (zaaw != null) {
            zaaw.f24577a.l(new zaaq(this, zaaw, zaaw, zak));
        }
    }
}
