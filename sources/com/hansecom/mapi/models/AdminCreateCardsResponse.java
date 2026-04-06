package com.hansecom.mapi.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata
@Serializable
public final class AdminCreateCardsResponse {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final KSerializer[] f39184c = {null, new ArrayListSerializer(AdminPhysicalCards$$serializer.f39202a)};

    /* renamed from: a  reason: collision with root package name */
    public final Integer f39185a;

    /* renamed from: b  reason: collision with root package name */
    public final List f39186b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AdminCreateCardsResponse> serializer() {
            return AdminCreateCardsResponse$$serializer.f39187a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ AdminCreateCardsResponse(int i2, Integer num, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39185a = null;
        } else {
            this.f39185a = num;
        }
        if ((i2 & 2) == 0) {
            this.f39186b = null;
        } else {
            this.f39186b = list;
        }
    }

    public static final /* synthetic */ void b(AdminCreateCardsResponse adminCreateCardsResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f39184c;
        if (compositeEncoder.w(serialDescriptor, 0) || adminCreateCardsResponse.f39185a != null) {
            compositeEncoder.m(serialDescriptor, 0, IntSerializer.f42129a, adminCreateCardsResponse.f39185a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || adminCreateCardsResponse.f39186b != null) {
            compositeEncoder.m(serialDescriptor, 1, kSerializerArr[1], adminCreateCardsResponse.f39186b);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdminCreateCardsResponse)) {
            return false;
        }
        AdminCreateCardsResponse adminCreateCardsResponse = (AdminCreateCardsResponse) obj;
        return Intrinsics.d(this.f39185a, adminCreateCardsResponse.f39185a) && Intrinsics.d(this.f39186b, adminCreateCardsResponse.f39186b);
    }

    public int hashCode() {
        Integer num = this.f39185a;
        int i2 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.f39186b;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "AdminCreateCardsResponse(totalCards=" + this.f39185a + ", cards=" + this.f39186b + ')';
    }
}
