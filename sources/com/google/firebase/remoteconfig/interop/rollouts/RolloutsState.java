package com.google.firebase.remoteconfig.interop.rollouts;

import java.util.Set;

public abstract class RolloutsState {
    public static RolloutsState a(Set set) {
        return new AutoValue_RolloutsState(set);
    }

    public abstract Set b();
}
