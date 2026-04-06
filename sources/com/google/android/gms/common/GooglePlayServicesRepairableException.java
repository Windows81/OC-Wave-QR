package com.google.android.gms.common;

import android.content.Intent;

public class GooglePlayServicesRepairableException extends UserRecoverableException {

    /* renamed from: A  reason: collision with root package name */
    public final int f24396A;

    public GooglePlayServicesRepairableException(int i2, String str, Intent intent) {
        super(str, intent);
        this.f24396A = i2;
    }

    public int a() {
        return this.f24396A;
    }
}
