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
public final class ProductConfiguration {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f39558a;

    /* renamed from: b  reason: collision with root package name */
    public final int f39559b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f39560c;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ProductConfiguration> serializer() {
            return ProductConfiguration$$serializer.f39561a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ ProductConfiguration(int i2, String str, int i3, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i2 & 3)) {
            PluginExceptionsKt.a(i2, 3, ProductConfiguration$$serializer.f39561a.a());
        }
        this.f39558a = str;
        this.f39559b = i3;
        if ((i2 & 4) == 0) {
            this.f39560c = null;
        } else {
            this.f39560c = num;
        }
    }

    public static final /* synthetic */ void a(ProductConfiguration productConfiguration, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.t(serialDescriptor, 0, productConfiguration.f39558a);
        compositeEncoder.r(serialDescriptor, 1, productConfiguration.f39559b);
        if (compositeEncoder.w(serialDescriptor, 2) || productConfiguration.f39560c != null) {
            compositeEncoder.m(serialDescriptor, 2, IntSerializer.f42129a, productConfiguration.f39560c);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductConfiguration)) {
            return false;
        }
        ProductConfiguration productConfiguration = (ProductConfiguration) obj;
        return Intrinsics.d(this.f39558a, productConfiguration.f39558a) && this.f39559b == productConfiguration.f39559b && Intrinsics.d(this.f39560c, productConfiguration.f39560c);
    }

    public int hashCode() {
        int hashCode = ((this.f39558a.hashCode() * 31) + Integer.hashCode(this.f39559b)) * 31;
        Integer num = this.f39560c;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "ProductConfiguration(offerRef=" + this.f39558a + ", quantity=" + this.f39559b + ", groupSize=" + this.f39560c + ')';
    }

    public ProductConfiguration(String str, int i2, Integer num) {
        Intrinsics.i(str, "offerRef");
        this.f39558a = str;
        this.f39559b = i2;
        this.f39560c = num;
    }
}
