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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata
@Serializable
public final class URpassPurchaseRequest {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final KSerializer[] f39617d = {null, new ArrayListSerializer(URpassPurchaseItem$$serializer.f39616a), null};

    /* renamed from: a  reason: collision with root package name */
    public final String f39618a;

    /* renamed from: b  reason: collision with root package name */
    public final List f39619b;

    /* renamed from: c  reason: collision with root package name */
    public final long f39620c;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<URpassPurchaseRequest> serializer() {
            return URpassPurchaseRequest$$serializer.f39621a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ URpassPurchaseRequest(int i2, String str, List list, long j2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i2 & 7)) {
            PluginExceptionsKt.a(i2, 7, URpassPurchaseRequest$$serializer.f39621a.a());
        }
        this.f39618a = str;
        this.f39619b = list;
        this.f39620c = j2;
    }

    public static final /* synthetic */ void b(URpassPurchaseRequest uRpassPurchaseRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f39617d;
        compositeEncoder.t(serialDescriptor, 0, uRpassPurchaseRequest.f39618a);
        compositeEncoder.A(serialDescriptor, 1, kSerializerArr[1], uRpassPurchaseRequest.f39619b);
        compositeEncoder.E(serialDescriptor, 2, uRpassPurchaseRequest.f39620c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof URpassPurchaseRequest)) {
            return false;
        }
        URpassPurchaseRequest uRpassPurchaseRequest = (URpassPurchaseRequest) obj;
        return Intrinsics.d(this.f39618a, uRpassPurchaseRequest.f39618a) && Intrinsics.d(this.f39619b, uRpassPurchaseRequest.f39619b) && this.f39620c == uRpassPurchaseRequest.f39620c;
    }

    public int hashCode() {
        return (((this.f39618a.hashCode() * 31) + this.f39619b.hashCode()) * 31) + Long.hashCode(this.f39620c);
    }

    public String toString() {
        return "URpassPurchaseRequest(urpassTenant=" + this.f39618a + ", items=" + this.f39619b + ", paymentMethodId=" + this.f39620c + ')';
    }
}
