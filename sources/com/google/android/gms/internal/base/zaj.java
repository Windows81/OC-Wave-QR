package com.google.android.gms.internal.base;

import android.graphics.drawable.Drawable;

final class zaj extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public int f25266a;

    /* renamed from: b  reason: collision with root package name */
    public int f25267b;

    public zaj(zaj zaj) {
        if (zaj != null) {
            this.f25266a = zaj.f25266a;
            this.f25267b = zaj.f25267b;
        }
    }

    public final int getChangingConfigurations() {
        return this.f25266a;
    }

    public final Drawable newDrawable() {
        return new zak(this);
    }
}
