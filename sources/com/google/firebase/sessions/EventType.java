package com.google.firebase.sessions;

import com.google.firebase.encoders.json.NumberedEnum;
import kotlin.Metadata;

@Metadata
public enum EventType implements NumberedEnum {
    EVENT_TYPE_UNKNOWN(0),
    SESSION_START(1);
    

    /* renamed from: z  reason: collision with root package name */
    public final int f31489z;

    /* access modifiers changed from: public */
    EventType(int i2) {
        this.f31489z = i2;
    }

    public int i() {
        return this.f31489z;
    }
}
