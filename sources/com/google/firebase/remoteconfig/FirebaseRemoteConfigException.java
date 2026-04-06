package com.google.firebase.remoteconfig;

import com.google.firebase.FirebaseException;

public class FirebaseRemoteConfigException extends FirebaseException {

    /* renamed from: z  reason: collision with root package name */
    public final Code f31210z;

    public enum Code {
        UNKNOWN(0),
        CONFIG_UPDATE_STREAM_ERROR(1),
        CONFIG_UPDATE_MESSAGE_INVALID(2),
        CONFIG_UPDATE_NOT_FETCHED(3),
        CONFIG_UPDATE_UNAVAILABLE(4);
        

        /* renamed from: z  reason: collision with root package name */
        public final int f31213z;

        /* access modifiers changed from: public */
        Code(int i2) {
            this.f31213z = i2;
        }
    }

    public FirebaseRemoteConfigException(String str) {
        super(str);
        this.f31210z = Code.UNKNOWN;
    }

    public FirebaseRemoteConfigException(String str, Throwable th) {
        super(str, th);
        this.f31210z = Code.UNKNOWN;
    }

    public FirebaseRemoteConfigException(String str, Code code) {
        super(str);
        this.f31210z = code;
    }

    public FirebaseRemoteConfigException(String str, Throwable th, Code code) {
        super(str, th);
        this.f31210z = code;
    }
}
