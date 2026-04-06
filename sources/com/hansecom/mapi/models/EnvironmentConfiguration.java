package com.hansecom.mapi.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata
@Serializable
public final class EnvironmentConfiguration {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final LoadMoneyConfig f39302a;

    /* renamed from: b  reason: collision with root package name */
    public final AddPassesConfig f39303b;

    /* renamed from: c  reason: collision with root package name */
    public final FareMediaConfiguration f39304c;

    /* renamed from: d  reason: collision with root package name */
    public final CardPurchaseDefaults f39305d;

    /* renamed from: e  reason: collision with root package name */
    public final PaymentMethodConfiguration f39306e;

    /* renamed from: f  reason: collision with root package name */
    public final VanillaDirectConfiguration f39307f;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EnvironmentConfiguration> serializer() {
            return EnvironmentConfiguration$$serializer.f39308a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ EnvironmentConfiguration(int i2, LoadMoneyConfig loadMoneyConfig, AddPassesConfig addPassesConfig, FareMediaConfiguration fareMediaConfiguration, CardPurchaseDefaults cardPurchaseDefaults, PaymentMethodConfiguration paymentMethodConfiguration, VanillaDirectConfiguration vanillaDirectConfiguration, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39302a = null;
        } else {
            this.f39302a = loadMoneyConfig;
        }
        if ((i2 & 2) == 0) {
            this.f39303b = null;
        } else {
            this.f39303b = addPassesConfig;
        }
        if ((i2 & 4) == 0) {
            this.f39304c = null;
        } else {
            this.f39304c = fareMediaConfiguration;
        }
        if ((i2 & 8) == 0) {
            this.f39305d = null;
        } else {
            this.f39305d = cardPurchaseDefaults;
        }
        if ((i2 & 16) == 0) {
            this.f39306e = null;
        } else {
            this.f39306e = paymentMethodConfiguration;
        }
        if ((i2 & 32) == 0) {
            this.f39307f = null;
        } else {
            this.f39307f = vanillaDirectConfiguration;
        }
    }

    public static final /* synthetic */ void d(EnvironmentConfiguration environmentConfiguration, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || environmentConfiguration.f39302a != null) {
            compositeEncoder.m(serialDescriptor, 0, LoadMoneyConfig$$serializer.f39499a, environmentConfiguration.f39302a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || environmentConfiguration.f39303b != null) {
            compositeEncoder.m(serialDescriptor, 1, AddPassesConfig$$serializer.f39167a, environmentConfiguration.f39303b);
        }
        if (compositeEncoder.w(serialDescriptor, 2) || environmentConfiguration.f39304c != null) {
            compositeEncoder.m(serialDescriptor, 2, FareMediaConfiguration$$serializer.f39355a, environmentConfiguration.f39304c);
        }
        if (compositeEncoder.w(serialDescriptor, 3) || environmentConfiguration.f39305d != null) {
            compositeEncoder.m(serialDescriptor, 3, CardPurchaseDefaults$$serializer.f39245a, environmentConfiguration.f39305d);
        }
        if (compositeEncoder.w(serialDescriptor, 4) || environmentConfiguration.f39306e != null) {
            compositeEncoder.m(serialDescriptor, 4, PaymentMethodConfiguration$$serializer.f39532a, environmentConfiguration.f39306e);
        }
        if (compositeEncoder.w(serialDescriptor, 5) || environmentConfiguration.f39307f != null) {
            compositeEncoder.m(serialDescriptor, 5, VanillaDirectConfiguration$$serializer.f39694a, environmentConfiguration.f39307f);
        }
    }

    public final CardPurchaseDefaults a() {
        return this.f39305d;
    }

    public final PaymentMethodConfiguration b() {
        return this.f39306e;
    }

    public final VanillaDirectConfiguration c() {
        return this.f39307f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnvironmentConfiguration)) {
            return false;
        }
        EnvironmentConfiguration environmentConfiguration = (EnvironmentConfiguration) obj;
        return Intrinsics.d(this.f39302a, environmentConfiguration.f39302a) && Intrinsics.d(this.f39303b, environmentConfiguration.f39303b) && Intrinsics.d(this.f39304c, environmentConfiguration.f39304c) && Intrinsics.d(this.f39305d, environmentConfiguration.f39305d) && Intrinsics.d(this.f39306e, environmentConfiguration.f39306e) && Intrinsics.d(this.f39307f, environmentConfiguration.f39307f);
    }

    public int hashCode() {
        LoadMoneyConfig loadMoneyConfig = this.f39302a;
        int i2 = 0;
        int hashCode = (loadMoneyConfig == null ? 0 : loadMoneyConfig.hashCode()) * 31;
        AddPassesConfig addPassesConfig = this.f39303b;
        int hashCode2 = (hashCode + (addPassesConfig == null ? 0 : addPassesConfig.hashCode())) * 31;
        FareMediaConfiguration fareMediaConfiguration = this.f39304c;
        int hashCode3 = (hashCode2 + (fareMediaConfiguration == null ? 0 : fareMediaConfiguration.hashCode())) * 31;
        CardPurchaseDefaults cardPurchaseDefaults = this.f39305d;
        int hashCode4 = (hashCode3 + (cardPurchaseDefaults == null ? 0 : cardPurchaseDefaults.hashCode())) * 31;
        PaymentMethodConfiguration paymentMethodConfiguration = this.f39306e;
        int hashCode5 = (hashCode4 + (paymentMethodConfiguration == null ? 0 : paymentMethodConfiguration.hashCode())) * 31;
        VanillaDirectConfiguration vanillaDirectConfiguration = this.f39307f;
        if (vanillaDirectConfiguration != null) {
            i2 = vanillaDirectConfiguration.hashCode();
        }
        return hashCode5 + i2;
    }

    public String toString() {
        return "EnvironmentConfiguration(loadMoney=" + this.f39302a + ", addPasses=" + this.f39303b + ", fareMediaManagement=" + this.f39304c + ", cardPurchaseDefaults=" + this.f39305d + ", paymentMethods=" + this.f39306e + ", vanillaDirect=" + this.f39307f + ')';
    }
}
