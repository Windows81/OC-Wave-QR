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
public final class FareMediaConfiguration {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final Integer f39354a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FareMediaConfiguration> serializer() {
            return FareMediaConfiguration$$serializer.f39355a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ FareMediaConfiguration(int i2, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39354a = null;
        } else {
            this.f39354a = num;
        }
    }

    public static final /* synthetic */ void a(FareMediaConfiguration fareMediaConfiguration, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || fareMediaConfiguration.f39354a != null) {
            compositeEncoder.m(serialDescriptor, 0, IntSerializer.f42129a, fareMediaConfiguration.f39354a);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FareMediaConfiguration) && Intrinsics.d(this.f39354a, ((FareMediaConfiguration) obj).f39354a);
    }

    public int hashCode() {
        Integer num = this.f39354a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public String toString() {
        return "FareMediaConfiguration(maxLinkedCards=" + this.f39354a + ')';
    }
}
