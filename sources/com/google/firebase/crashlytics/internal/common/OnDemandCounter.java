package com.google.firebase.crashlytics.internal.common;

import java.util.concurrent.atomic.AtomicInteger;

public final class OnDemandCounter {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f30097a = new AtomicInteger();

    /* renamed from: b  reason: collision with root package name */
    public final AtomicInteger f30098b = new AtomicInteger();

    public void a() {
        this.f30098b.getAndIncrement();
    }

    public void b() {
        this.f30097a.getAndIncrement();
    }

    public void c() {
        this.f30098b.set(0);
    }
}
