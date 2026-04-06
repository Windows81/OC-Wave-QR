package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

public final class zzag implements zzaq {

    /* renamed from: z  reason: collision with root package name */
    public final boolean f25326z;

    public zzag(Boolean bool) {
        if (bool == null) {
            this.f25326z = false;
        } else {
            this.f25326z = bool.booleanValue();
        }
    }

    public final zzaq c() {
        return new zzag(Boolean.valueOf(this.f25326z));
    }

    public final Boolean e() {
        return Boolean.valueOf(this.f25326z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzag) && this.f25326z == ((zzag) obj).f25326z;
    }

    public final Double g() {
        return Double.valueOf(this.f25326z ? 1.0d : 0.0d);
    }

    public final String h() {
        return Boolean.toString(this.f25326z);
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f25326z).hashCode();
    }

    public final Iterator i() {
        return null;
    }

    public final zzaq o(String str, zzh zzh, List list) {
        if ("toString".equals(str)) {
            return new zzas(Boolean.toString(this.f25326z));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", new Object[]{Boolean.toString(this.f25326z), str}));
    }

    public final String toString() {
        return String.valueOf(this.f25326z);
    }
}
