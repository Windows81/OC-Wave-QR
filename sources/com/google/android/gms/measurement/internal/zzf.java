package com.google.android.gms.measurement.internal;

abstract class zzf extends zzg {

    /* renamed from: b  reason: collision with root package name */
    public boolean f26291b;

    public zzf(zzhw zzhw) {
        super(zzhw);
        this.f26587a.n();
    }

    public abstract boolean A();

    public final void v() {
        if (!z()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void w() {
        if (this.f26291b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!A()) {
            this.f26587a.R();
            this.f26291b = true;
        }
    }

    public final void x() {
        if (!this.f26291b) {
            y();
            this.f26587a.R();
            this.f26291b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public void y() {
    }

    public final boolean z() {
        return this.f26291b;
    }
}
