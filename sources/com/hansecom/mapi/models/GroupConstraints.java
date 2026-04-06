package com.hansecom.mapi.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata
@Serializable
public final class GroupConstraints {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final Integer f39463a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f39464b;

    /* renamed from: c  reason: collision with root package name */
    public final Boolean f39465c;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GroupConstraints> serializer() {
            return GroupConstraints$$serializer.f39466a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ GroupConstraints(int i2, Integer num, Integer num2, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39463a = null;
        } else {
            this.f39463a = num;
        }
        if ((i2 & 2) == 0) {
            this.f39464b = null;
        } else {
            this.f39464b = num2;
        }
        if ((i2 & 4) == 0) {
            this.f39465c = null;
        } else {
            this.f39465c = bool;
        }
    }

    public static final /* synthetic */ void d(GroupConstraints groupConstraints, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || groupConstraints.f39463a != null) {
            compositeEncoder.m(serialDescriptor, 0, IntSerializer.f42129a, groupConstraints.f39463a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || groupConstraints.f39464b != null) {
            compositeEncoder.m(serialDescriptor, 1, IntSerializer.f42129a, groupConstraints.f39464b);
        }
        if (compositeEncoder.w(serialDescriptor, 2) || groupConstraints.f39465c != null) {
            compositeEncoder.m(serialDescriptor, 2, BooleanSerializer.f42073a, groupConstraints.f39465c);
        }
    }

    public final Integer a() {
        return this.f39463a;
    }

    public final Integer b() {
        return this.f39464b;
    }

    public final Boolean c() {
        return this.f39465c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupConstraints)) {
            return false;
        }
        GroupConstraints groupConstraints = (GroupConstraints) obj;
        return Intrinsics.d(this.f39463a, groupConstraints.f39463a) && Intrinsics.d(this.f39464b, groupConstraints.f39464b) && Intrinsics.d(this.f39465c, groupConstraints.f39465c);
    }

    public int hashCode() {
        Integer num = this.f39463a;
        int i2 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f39464b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.f39465c;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        return "GroupConstraints(maxGroupSize=" + this.f39463a + ", minGroupSize=" + this.f39464b + ", isGroupPass=" + this.f39465c + ')';
    }
}
