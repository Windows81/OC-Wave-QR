package com.google.firebase.remoteconfig;

public interface ConfigUpdateListener {
    void a(FirebaseRemoteConfigException firebaseRemoteConfigException);

    void b(ConfigUpdate configUpdate);
}
