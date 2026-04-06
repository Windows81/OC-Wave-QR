package com.google.firebase.installations;

import com.google.firebase.FirebaseException;

public class FirebaseInstallationsException extends FirebaseException {

    /* renamed from: z  reason: collision with root package name */
    public final Status f30794z;

    public enum Status {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public FirebaseInstallationsException(Status status) {
        this.f30794z = status;
    }

    public FirebaseInstallationsException(String str, Status status) {
        super(str);
        this.f30794z = status;
    }
}
