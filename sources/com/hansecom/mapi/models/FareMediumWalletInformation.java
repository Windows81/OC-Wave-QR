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
public final class FareMediumWalletInformation {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final Integer f39428a;

    /* renamed from: b  reason: collision with root package name */
    public final Boolean f39429b;

    /* renamed from: c  reason: collision with root package name */
    public final Boolean f39430c;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FareMediumWalletInformation> serializer() {
            return FareMediumWalletInformation$$serializer.f39431a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ FareMediumWalletInformation(int i2, Integer num, Boolean bool, Boolean bool2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39428a = null;
        } else {
            this.f39428a = num;
        }
        if ((i2 & 2) == 0) {
            this.f39429b = null;
        } else {
            this.f39429b = bool;
        }
        if ((i2 & 4) == 0) {
            this.f39430c = null;
        } else {
            this.f39430c = bool2;
        }
    }

    public static final /* synthetic */ void b(FareMediumWalletInformation fareMediumWalletInformation, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || fareMediumWalletInformation.f39428a != null) {
            compositeEncoder.m(serialDescriptor, 0, IntSerializer.f42129a, fareMediumWalletInformation.f39428a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || fareMediumWalletInformation.f39429b != null) {
            compositeEncoder.m(serialDescriptor, 1, BooleanSerializer.f42073a, fareMediumWalletInformation.f39429b);
        }
        if (compositeEncoder.w(serialDescriptor, 2) || fareMediumWalletInformation.f39430c != null) {
            compositeEncoder.m(serialDescriptor, 2, BooleanSerializer.f42073a, fareMediumWalletInformation.f39430c);
        }
    }

    public final Boolean a() {
        return this.f39429b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FareMediumWalletInformation)) {
            return false;
        }
        FareMediumWalletInformation fareMediumWalletInformation = (FareMediumWalletInformation) obj;
        return Intrinsics.d(this.f39428a, fareMediumWalletInformation.f39428a) && Intrinsics.d(this.f39429b, fareMediumWalletInformation.f39429b) && Intrinsics.d(this.f39430c, fareMediumWalletInformation.f39430c);
    }

    public int hashCode() {
        Integer num = this.f39428a;
        int i2 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.f39429b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f39430c;
        if (bool2 != null) {
            i2 = bool2.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        return "FareMediumWalletInformation(availableReplacements=" + this.f39428a + ", isProvisioned=" + this.f39429b + ", onCurrentDevice=" + this.f39430c + ')';
    }
}
