package com.google.firebase.remoteconfig;

import java.util.Set;

public abstract class ConfigUpdate {
    public static ConfigUpdate a(Set set) {
        return new AutoValue_ConfigUpdate(set);
    }

    public abstract Set b();
}
