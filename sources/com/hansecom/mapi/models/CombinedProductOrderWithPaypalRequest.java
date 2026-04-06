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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata
@Serializable
public final class CombinedProductOrderWithPaypalRequest {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final KSerializer[] f39270e = {null, null, new ArrayListSerializer(TopUpReference$$serializer.f39592a), new ArrayListSerializer(ProductConfiguration$$serializer.f39561a)};

    /* renamed from: a  reason: collision with root package name */
    public final String f39271a;

    /* renamed from: b  reason: collision with root package name */
    public final Boolean f39272b;

    /* renamed from: c  reason: collision with root package name */
    public final List f39273c;

    /* renamed from: d  reason: collision with root package name */
    public final List f39274d;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CombinedProductOrderWithPaypalRequest> serializer() {
            return CombinedProductOrderWithPaypalRequest$$serializer.f39275a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ CombinedProductOrderWithPaypalRequest(int i2, String str, Boolean bool, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i2 & 1)) {
            PluginExceptionsKt.a(i2, 1, CombinedProductOrderWithPaypalRequest$$serializer.f39275a.a());
        }
        this.f39271a = str;
        if ((i2 & 2) == 0) {
            this.f39272b = Boolean.FALSE;
        } else {
            this.f39272b = bool;
        }
        if ((i2 & 4) == 0) {
            this.f39273c = null;
        } else {
            this.f39273c = list;
        }
        if ((i2 & 8) == 0) {
            this.f39274d = null;
        } else {
            this.f39274d = list2;
        }
    }

    public static final /* synthetic */ void b(CombinedProductOrderWithPaypalRequest combinedProductOrderWithPaypalRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f39270e;
        compositeEncoder.t(serialDescriptor, 0, combinedProductOrderWithPaypalRequest.f39271a);
        if (compositeEncoder.w(serialDescriptor, 1) || !Intrinsics.d(combinedProductOrderWithPaypalRequest.f39272b, Boolean.FALSE)) {
            compositeEncoder.m(serialDescriptor, 1, BooleanSerializer.f42073a, combinedProductOrderWithPaypalRequest.f39272b);
        }
        if (compositeEncoder.w(serialDescriptor, 2) || combinedProductOrderWithPaypalRequest.f39273c != null) {
            compositeEncoder.m(serialDescriptor, 2, kSerializerArr[2], combinedProductOrderWithPaypalRequest.f39273c);
        }
        if (compositeEncoder.w(serialDescriptor, 3) || combinedProductOrderWithPaypalRequest.f39274d != null) {
            compositeEncoder.m(serialDescriptor, 3, kSerializerArr[3], combinedProductOrderWithPaypalRequest.f39274d);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CombinedProductOrderWithPaypalRequest)) {
            return false;
        }
        CombinedProductOrderWithPaypalRequest combinedProductOrderWithPaypalRequest = (CombinedProductOrderWithPaypalRequest) obj;
        return Intrinsics.d(this.f39271a, combinedProductOrderWithPaypalRequest.f39271a) && Intrinsics.d(this.f39272b, combinedProductOrderWithPaypalRequest.f39272b) && Intrinsics.d(this.f39273c, combinedProductOrderWithPaypalRequest.f39273c) && Intrinsics.d(this.f39274d, combinedProductOrderWithPaypalRequest.f39274d);
    }

    public int hashCode() {
        int hashCode = this.f39271a.hashCode() * 31;
        Boolean bool = this.f39272b;
        int i2 = 0;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List list = this.f39273c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f39274d;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        return "CombinedProductOrderWithPaypalRequest(payPalRequestId=" + this.f39271a + ", isPreTax=" + this.f39272b + ", topUps=" + this.f39273c + ", products=" + this.f39274d + ')';
    }
}
