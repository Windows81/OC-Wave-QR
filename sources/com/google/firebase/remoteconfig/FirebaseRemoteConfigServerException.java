package com.google.firebase.remoteconfig;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;

public class FirebaseRemoteConfigServerException extends FirebaseRemoteConfigException {

    /* renamed from: A  reason: collision with root package name */
    public final int f31215A;

    public FirebaseRemoteConfigServerException(int i2, String str) {
        super(str);
        this.f31215A = i2;
    }

    public int a() {
        return this.f31215A;
    }

    public FirebaseRemoteConfigServerException(int i2, String str, Throwable th) {
        super(str, th);
        this.f31215A = i2;
    }

    public FirebaseRemoteConfigServerException(String str, FirebaseRemoteConfigException.Code code) {
        super(str, code);
        this.f31215A = -1;
    }

    public FirebaseRemoteConfigServerException(int i2, String str, FirebaseRemoteConfigException.Code code) {
        super(str, code);
        this.f31215A = i2;
    }
}
