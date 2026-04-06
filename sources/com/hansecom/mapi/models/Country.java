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
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Serializable
public final class Country {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final Integer f39288a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39289b;

    /* renamed from: c  reason: collision with root package name */
    public final Boolean f39290c;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Country> serializer() {
            return Country$$serializer.f39291a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ Country(int i2, Integer num, String str, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39288a = null;
        } else {
            this.f39288a = num;
        }
        if ((i2 & 2) == 0) {
            this.f39289b = null;
        } else {
            this.f39289b = str;
        }
        if ((i2 & 4) == 0) {
            this.f39290c = null;
        } else {
            this.f39290c = bool;
        }
    }

    public static final /* synthetic */ void d(Country country, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || country.f39288a != null) {
            compositeEncoder.m(serialDescriptor, 0, IntSerializer.f42129a, country.f39288a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || country.f39289b != null) {
            compositeEncoder.m(serialDescriptor, 1, StringSerializer.f42197a, country.f39289b);
        }
        if (compositeEncoder.w(serialDescriptor, 2) || country.f39290c != null) {
            compositeEncoder.m(serialDescriptor, 2, BooleanSerializer.f42073a, country.f39290c);
        }
    }

    public final Integer a() {
        return this.f39288a;
    }

    public final String b() {
        return this.f39289b;
    }

    public final Boolean c() {
        return this.f39290c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Country)) {
            return false;
        }
        Country country = (Country) obj;
        return Intrinsics.d(this.f39288a, country.f39288a) && Intrinsics.d(this.f39289b, country.f39289b) && Intrinsics.d(this.f39290c, country.f39290c);
    }

    public int hashCode() {
        Integer num = this.f39288a;
        int i2 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f39289b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f39290c;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        return "Country(countryId=" + this.f39288a + ", countryName=" + this.f39289b + ", hasStates=" + this.f39290c + ')';
    }
}
