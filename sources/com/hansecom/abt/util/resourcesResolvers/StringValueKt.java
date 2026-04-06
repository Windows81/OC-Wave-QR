package com.hansecom.abt.util.resourcesResolvers;

import com.hansecom.abt.util.resourcesResolvers.StringValue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class StringValueKt {
    public static final boolean a(StringValue stringValue) {
        Intrinsics.i(stringValue, "<this>");
        return !Intrinsics.d(stringValue, StringValue.Companion.a());
    }

    public static final StringValue b(StringValue stringValue) {
        return stringValue == null ? StringValue.Companion.a() : stringValue;
    }

    public static final StringValue c(int i2) {
        return new StringValue.ResourceId(i2);
    }

    public static final StringValue d(String str) {
        Intrinsics.i(str, "<this>");
        return new StringValue.Value(str);
    }
}
