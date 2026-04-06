package com.google.android.gms.common.api.internal;

abstract class zabg {

    /* renamed from: a  reason: collision with root package name */
    public final zabf f24633a;

    public zabg(zabf zabf) {
        this.f24633a = zabf;
    }

    public abstract void a();

    public final void b(zabi zabi) {
        zabi.f24635l.lock();
        try {
            if (zabi.f24645v == this.f24633a) {
                a();
            }
        } finally {
            zabi.f24635l.unlock();
        }
    }
}
