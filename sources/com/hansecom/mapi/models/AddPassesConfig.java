package com.hansecom.mapi.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata
@Serializable
public final class AddPassesConfig {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final Integer f39165a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f39166b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AddPassesConfig> serializer() {
            return AddPassesConfig$$serializer.f39167a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ AddPassesConfig(int i2, Integer num, Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39165a = null;
        } else {
            this.f39165a = num;
        }
        if ((i2 & 2) == 0) {
            this.f39166b = null;
        } else {
            this.f39166b = num2;
        }
    }

    public static final /* synthetic */ void a(AddPassesConfig addPassesConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || addPassesConfig.f39165a != null) {
            compositeEncoder.m(serialDescriptor, 0, IntSerializer.f42129a, addPassesConfig.f39165a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || addPassesConfig.f39166b != null) {
            compositeEncoder.m(serialDescriptor, 1, IntSerializer.f42129a, addPassesConfig.f39166b);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddPassesConfig)) {
            return false;
        }
        AddPassesConfig addPassesConfig = (AddPassesConfig) obj;
        return Intrinsics.d(this.f39165a, addPassesConfig.f39165a) && Intrinsics.d(this.f39166b, addPassesConfig.f39166b);
    }

    public int hashCode() {
        Integer num = this.f39165a;
        int i2 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f39166b;
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "AddPassesConfig(maxTotalNumberOfPasses=" + this.f39165a + ", maxPassesPerPurchase=" + this.f39166b + ')';
    }
}
