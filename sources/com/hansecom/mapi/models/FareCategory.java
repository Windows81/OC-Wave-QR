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
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Serializable
public final class FareCategory {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final Integer f39322a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39323b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FareCategory> serializer() {
            return FareCategory$$serializer.f39324a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ FareCategory(int i2, Integer num, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39322a = null;
        } else {
            this.f39322a = num;
        }
        if ((i2 & 2) == 0) {
            this.f39323b = null;
        } else {
            this.f39323b = str;
        }
    }

    public static final /* synthetic */ void a(FareCategory fareCategory, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || fareCategory.f39322a != null) {
            compositeEncoder.m(serialDescriptor, 0, IntSerializer.f42129a, fareCategory.f39322a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || fareCategory.f39323b != null) {
            compositeEncoder.m(serialDescriptor, 1, StringSerializer.f42197a, fareCategory.f39323b);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FareCategory)) {
            return false;
        }
        FareCategory fareCategory = (FareCategory) obj;
        return Intrinsics.d(this.f39322a, fareCategory.f39322a) && Intrinsics.d(this.f39323b, fareCategory.f39323b);
    }

    public int hashCode() {
        Integer num = this.f39322a;
        int i2 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f39323b;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "FareCategory(id=" + this.f39322a + ", displayName=" + this.f39323b + ')';
    }
}
