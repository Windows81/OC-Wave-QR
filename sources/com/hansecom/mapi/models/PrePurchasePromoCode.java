package com.hansecom.mapi.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata
@Serializable
public final class PrePurchasePromoCode {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f39537a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39538b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f39539c;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PrePurchasePromoCode> serializer() {
            return PrePurchasePromoCode$$serializer.f39540a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ PrePurchasePromoCode(int i2, String str, String str2, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i2 & 3)) {
            PluginExceptionsKt.a(i2, 3, PrePurchasePromoCode$$serializer.f39540a.a());
        }
        this.f39537a = str;
        this.f39538b = str2;
        if ((i2 & 4) == 0) {
            this.f39539c = null;
        } else {
            this.f39539c = num;
        }
    }

    public static final /* synthetic */ void a(PrePurchasePromoCode prePurchasePromoCode, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.t(serialDescriptor, 0, prePurchasePromoCode.f39537a);
        compositeEncoder.t(serialDescriptor, 1, prePurchasePromoCode.f39538b);
        if (compositeEncoder.w(serialDescriptor, 2) || prePurchasePromoCode.f39539c != null) {
            compositeEncoder.m(serialDescriptor, 2, IntSerializer.f42129a, prePurchasePromoCode.f39539c);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrePurchasePromoCode)) {
            return false;
        }
        PrePurchasePromoCode prePurchasePromoCode = (PrePurchasePromoCode) obj;
        return Intrinsics.d(this.f39537a, prePurchasePromoCode.f39537a) && Intrinsics.d(this.f39538b, prePurchasePromoCode.f39538b) && Intrinsics.d(this.f39539c, prePurchasePromoCode.f39539c);
    }

    public int hashCode() {
        int hashCode = ((this.f39537a.hashCode() * 31) + this.f39538b.hashCode()) * 31;
        Integer num = this.f39539c;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "PrePurchasePromoCode(offerRef=" + this.f39537a + ", promoCodeNumber=" + this.f39538b + ", groupSize=" + this.f39539c + ')';
    }

    public PrePurchasePromoCode(String str, String str2, Integer num) {
        Intrinsics.i(str, "offerRef");
        Intrinsics.i(str2, "promoCodeNumber");
        this.f39537a = str;
        this.f39538b = str2;
        this.f39539c = num;
    }
}
