package com.google.firebase.sessions;

import com.google.firebase.encoders.json.NumberedEnum;
import kotlin.Metadata;

@Metadata
public enum LogEnvironment implements NumberedEnum {
    LOG_ENVIRONMENT_UNKNOWN(0),
    LOG_ENVIRONMENT_AUTOPUSH(1),
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);
    

    /* renamed from: z  reason: collision with root package name */
    public final int f31499z;

    /* access modifiers changed from: public */
    LogEnvironment(int i2) {
        this.f31499z = i2;
    }

    public int i() {
        return this.f31499z;
    }
}
