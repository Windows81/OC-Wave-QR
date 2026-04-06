package com.google.android.gms.measurement.internal;

abstract class zzix extends zziy {

    /* renamed from: b  reason: collision with root package name */
    public boolean f26586b;

    public zzix(zzhw zzhw) {
        super(zzhw);
        this.f26587a.n();
    }

    public void o() {
    }

    public final void p() {
        if (!s()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void q() {
        if (this.f26586b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!t()) {
            this.f26587a.R();
            this.f26586b = true;
        }
    }

    public final void r() {
        if (!this.f26586b) {
            o();
            this.f26587a.R();
            this.f26586b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final boolean s() {
        return this.f26586b;
    }

    public abstract boolean t();
}
