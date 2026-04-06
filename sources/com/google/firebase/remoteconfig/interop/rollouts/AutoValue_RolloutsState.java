package com.google.firebase.remoteconfig.interop.rollouts;

import java.util.Set;

final class AutoValue_RolloutsState extends RolloutsState {

    /* renamed from: a  reason: collision with root package name */
    public final Set f31420a;

    public AutoValue_RolloutsState(Set set) {
        if (set != null) {
            this.f31420a = set;
            return;
        }
        throw new NullPointerException("Null rolloutAssignments");
    }

    public Set b() {
        return this.f31420a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RolloutsState) {
            return this.f31420a.equals(((RolloutsState) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f31420a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f31420a + "}";
    }
}
