package com.hansecom.abt.api;

import com.hansecom.abt.util.resourcesResolvers.StringValue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public abstract class LocalizedException extends Exception {

    /* renamed from: z  reason: collision with root package name */
    public final StringValue f33117z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LocalizedException(StringValue stringValue) {
        super(stringValue.toString());
        Intrinsics.i(stringValue, "messageRes");
        this.f33117z = stringValue;
    }

    public final StringValue a() {
        return this.f33117z;
    }
}
