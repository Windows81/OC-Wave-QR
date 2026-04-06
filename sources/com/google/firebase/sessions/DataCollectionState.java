package com.google.firebase.sessions;

import com.google.firebase.encoders.json.NumberedEnum;
import kotlin.Metadata;

@Metadata
public enum DataCollectionState implements NumberedEnum {
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    COLLECTION_DISABLED_REMOTE(4),
    COLLECTION_SAMPLED(5);
    

    /* renamed from: z  reason: collision with root package name */
    public final int f31481z;

    /* access modifiers changed from: public */
    DataCollectionState(int i2) {
        this.f31481z = i2;
    }

    public int i() {
        return this.f31481z;
    }
}
