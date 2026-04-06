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
public final class FareMediumCreateRequest {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final Integer f39411a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39412b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FareMediumCreateRequest> serializer() {
            return FareMediumCreateRequest$$serializer.f39413a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ FareMediumCreateRequest(int i2, Integer num, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39411a = null;
        } else {
            this.f39411a = num;
        }
        if ((i2 & 2) == 0) {
            this.f39412b = null;
        } else {
            this.f39412b = str;
        }
    }

    public static final /* synthetic */ void a(FareMediumCreateRequest fareMediumCreateRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || fareMediumCreateRequest.f39411a != null) {
            compositeEncoder.m(serialDescriptor, 0, IntSerializer.f42129a, fareMediumCreateRequest.f39411a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || fareMediumCreateRequest.f39412b != null) {
            compositeEncoder.m(serialDescriptor, 1, StringSerializer.f42197a, fareMediumCreateRequest.f39412b);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FareMediumCreateRequest)) {
            return false;
        }
        FareMediumCreateRequest fareMediumCreateRequest = (FareMediumCreateRequest) obj;
        return Intrinsics.d(this.f39411a, fareMediumCreateRequest.f39411a) && Intrinsics.d(this.f39412b, fareMediumCreateRequest.f39412b);
    }

    public int hashCode() {
        Integer num = this.f39411a;
        int i2 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f39412b;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "FareMediumCreateRequest(fareCategoryId=" + this.f39411a + ", nickname=" + this.f39412b + ')';
    }

    public FareMediumCreateRequest(Integer num, String str) {
        this.f39411a = num;
        this.f39412b = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FareMediumCreateRequest(Integer num, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : num, (i2 & 2) != 0 ? null : str);
    }
}
