package com.google.android.gms.auth.api.signin.internal;

public class HashAccumulator {

    /* renamed from: a  reason: collision with root package name */
    public int f24341a = 1;

    public HashAccumulator a(Object obj) {
        this.f24341a = (this.f24341a * 31) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    public int b() {
        return this.f24341a;
    }

    public final HashAccumulator c(boolean z2) {
        this.f24341a = (this.f24341a * 31) + (z2 ? 1 : 0);
        return this;
    }
}
