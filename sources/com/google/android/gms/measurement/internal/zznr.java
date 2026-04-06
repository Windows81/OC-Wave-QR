package com.google.android.gms.measurement.internal;

abstract class zznr extends zzno {

    /* renamed from: c  reason: collision with root package name */
    public boolean f26890c;

    public zznr(zznv zznv) {
        super(zznv);
        this.f26888b.C0();
    }

    public final void u() {
        if (!w()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void v() {
        if (!this.f26890c) {
            x();
            this.f26888b.B0();
            this.f26890c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final boolean w() {
        return this.f26890c;
    }

    public abstract boolean x();
}
