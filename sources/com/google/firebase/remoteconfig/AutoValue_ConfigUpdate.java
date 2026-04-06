package com.google.firebase.remoteconfig;

import java.util.Set;

final class AutoValue_ConfigUpdate extends ConfigUpdate {

    /* renamed from: a  reason: collision with root package name */
    public final Set f31195a;

    public AutoValue_ConfigUpdate(Set set) {
        if (set != null) {
            this.f31195a = set;
            return;
        }
        throw new NullPointerException("Null updatedKeys");
    }

    public Set b() {
        return this.f31195a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConfigUpdate) {
            return this.f31195a.equals(((ConfigUpdate) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f31195a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ConfigUpdate{updatedKeys=" + this.f31195a + "}";
    }
}
