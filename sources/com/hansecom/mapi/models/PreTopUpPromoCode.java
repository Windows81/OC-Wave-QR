package com.hansecom.mapi.models;

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
public final class PreTopUpPromoCode {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final int f39546a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39547b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PreTopUpPromoCode> serializer() {
            return PreTopUpPromoCode$$serializer.f39548a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ PreTopUpPromoCode(int i2, int i3, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i2 & 3)) {
            PluginExceptionsKt.a(i2, 3, PreTopUpPromoCode$$serializer.f39548a.a());
        }
        this.f39546a = i3;
        this.f39547b = str;
    }

    public static final /* synthetic */ void a(PreTopUpPromoCode preTopUpPromoCode, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.r(serialDescriptor, 0, preTopUpPromoCode.f39546a);
        compositeEncoder.t(serialDescriptor, 1, preTopUpPromoCode.f39547b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreTopUpPromoCode)) {
            return false;
        }
        PreTopUpPromoCode preTopUpPromoCode = (PreTopUpPromoCode) obj;
        return this.f39546a == preTopUpPromoCode.f39546a && Intrinsics.d(this.f39547b, preTopUpPromoCode.f39547b);
    }

    public int hashCode() {
        return (Integer.hashCode(this.f39546a) * 31) + this.f39547b.hashCode();
    }

    public String toString() {
        return "PreTopUpPromoCode(amount=" + this.f39546a + ", promoCodeNumber=" + this.f39547b + ')';
    }

    public PreTopUpPromoCode(int i2, String str) {
        Intrinsics.i(str, "promoCodeNumber");
        this.f39546a = i2;
        this.f39547b = str;
    }
}
