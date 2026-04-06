package com.google.android.gms.common;

import android.content.Intent;

public class UserRecoverableException extends Exception {

    /* renamed from: z  reason: collision with root package name */
    public final Intent f24410z;

    public UserRecoverableException(String str, Intent intent) {
        super(str);
        this.f24410z = intent;
    }
}
