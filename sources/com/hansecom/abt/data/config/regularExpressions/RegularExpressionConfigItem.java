package com.hansecom.abt.data.config.regularExpressions;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata
@Serializable
public final class RegularExpressionConfigItem {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f33251a;

    /* renamed from: b  reason: collision with root package name */
    public final String f33252b;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<RegularExpressionConfigItem> serializer() {
            return RegularExpressionConfigItem$$serializer.f33253a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ RegularExpressionConfigItem(int i2, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i2 & 3)) {
            PluginExceptionsKt.a(i2, 3, RegularExpressionConfigItem$$serializer.f33253a.a());
        }
        this.f33251a = str;
        this.f33252b = str2;
    }

    public static final /* synthetic */ void c(RegularExpressionConfigItem regularExpressionConfigItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.t(serialDescriptor, 0, regularExpressionConfigItem.f33251a);
        compositeEncoder.t(serialDescriptor, 1, regularExpressionConfigItem.f33252b);
    }

    public final String a() {
        return this.f33252b;
    }

    public final String b() {
        return this.f33251a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegularExpressionConfigItem)) {
            return false;
        }
        RegularExpressionConfigItem regularExpressionConfigItem = (RegularExpressionConfigItem) obj;
        return Intrinsics.d(this.f33251a, regularExpressionConfigItem.f33251a) && Intrinsics.d(this.f33252b, regularExpressionConfigItem.f33252b);
    }

    public int hashCode() {
        return (this.f33251a.hashCode() * 31) + this.f33252b.hashCode();
    }

    public String toString() {
        String str = this.f33251a;
        String str2 = this.f33252b;
        return "RegularExpressionConfigItem(name=" + str + ", expression=" + str2 + ")";
    }
}
