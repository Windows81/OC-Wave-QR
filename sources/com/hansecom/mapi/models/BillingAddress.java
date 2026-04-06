package com.hansecom.mapi.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Serializable
public final class BillingAddress {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f39221a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39222b;

    /* renamed from: c  reason: collision with root package name */
    public final String f39223c;

    /* renamed from: d  reason: collision with root package name */
    public final String f39224d;

    /* renamed from: e  reason: collision with root package name */
    public final String f39225e;

    /* renamed from: f  reason: collision with root package name */
    public final String f39226f;

    /* renamed from: g  reason: collision with root package name */
    public final Boolean f39227g;

    /* renamed from: h  reason: collision with root package name */
    public final String f39228h;

    /* renamed from: i  reason: collision with root package name */
    public final String f39229i;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BillingAddress> serializer() {
            return BillingAddress$$serializer.f39230a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ BillingAddress(int i2, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39221a = null;
        } else {
            this.f39221a = str;
        }
        if ((i2 & 2) == 0) {
            this.f39222b = null;
        } else {
            this.f39222b = str2;
        }
        if ((i2 & 4) == 0) {
            this.f39223c = null;
        } else {
            this.f39223c = str3;
        }
        if ((i2 & 8) == 0) {
            this.f39224d = null;
        } else {
            this.f39224d = str4;
        }
        if ((i2 & 16) == 0) {
            this.f39225e = null;
        } else {
            this.f39225e = str5;
        }
        if ((i2 & 32) == 0) {
            this.f39226f = null;
        } else {
            this.f39226f = str6;
        }
        if ((i2 & 64) == 0) {
            this.f39227g = Boolean.FALSE;
        } else {
            this.f39227g = bool;
        }
        if ((i2 & 128) == 0) {
            this.f39228h = null;
        } else {
            this.f39228h = str7;
        }
        if ((i2 & 256) == 0) {
            this.f39229i = null;
        } else {
            this.f39229i = str8;
        }
    }

    public static final /* synthetic */ void a(BillingAddress billingAddress, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || billingAddress.f39221a != null) {
            compositeEncoder.m(serialDescriptor, 0, StringSerializer.f42197a, billingAddress.f39221a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || billingAddress.f39222b != null) {
            compositeEncoder.m(serialDescriptor, 1, StringSerializer.f42197a, billingAddress.f39222b);
        }
        if (compositeEncoder.w(serialDescriptor, 2) || billingAddress.f39223c != null) {
            compositeEncoder.m(serialDescriptor, 2, StringSerializer.f42197a, billingAddress.f39223c);
        }
        if (compositeEncoder.w(serialDescriptor, 3) || billingAddress.f39224d != null) {
            compositeEncoder.m(serialDescriptor, 3, StringSerializer.f42197a, billingAddress.f39224d);
        }
        if (compositeEncoder.w(serialDescriptor, 4) || billingAddress.f39225e != null) {
            compositeEncoder.m(serialDescriptor, 4, StringSerializer.f42197a, billingAddress.f39225e);
        }
        if (compositeEncoder.w(serialDescriptor, 5) || billingAddress.f39226f != null) {
            compositeEncoder.m(serialDescriptor, 5, StringSerializer.f42197a, billingAddress.f39226f);
        }
        if (compositeEncoder.w(serialDescriptor, 6) || !Intrinsics.d(billingAddress.f39227g, Boolean.FALSE)) {
            compositeEncoder.m(serialDescriptor, 6, BooleanSerializer.f42073a, billingAddress.f39227g);
        }
        if (compositeEncoder.w(serialDescriptor, 7) || billingAddress.f39228h != null) {
            compositeEncoder.m(serialDescriptor, 7, StringSerializer.f42197a, billingAddress.f39228h);
        }
        if (compositeEncoder.w(serialDescriptor, 8) || billingAddress.f39229i != null) {
            compositeEncoder.m(serialDescriptor, 8, StringSerializer.f42197a, billingAddress.f39229i);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillingAddress)) {
            return false;
        }
        BillingAddress billingAddress = (BillingAddress) obj;
        return Intrinsics.d(this.f39221a, billingAddress.f39221a) && Intrinsics.d(this.f39222b, billingAddress.f39222b) && Intrinsics.d(this.f39223c, billingAddress.f39223c) && Intrinsics.d(this.f39224d, billingAddress.f39224d) && Intrinsics.d(this.f39225e, billingAddress.f39225e) && Intrinsics.d(this.f39226f, billingAddress.f39226f) && Intrinsics.d(this.f39227g, billingAddress.f39227g) && Intrinsics.d(this.f39228h, billingAddress.f39228h) && Intrinsics.d(this.f39229i, billingAddress.f39229i);
    }

    public int hashCode() {
        String str = this.f39221a;
        int i2 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f39222b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f39223c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f39224d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f39225e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f39226f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.f39227g;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str7 = this.f39228h;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f39229i;
        if (str8 != null) {
            i2 = str8.hashCode();
        }
        return hashCode8 + i2;
    }

    public String toString() {
        return "BillingAddress(firstName=" + this.f39221a + ", lastName=" + this.f39222b + ", street=" + this.f39223c + ", streetOptional=" + this.f39224d + ", city=" + this.f39225e + ", state=" + this.f39226f + ", stateIsEnum=" + this.f39227g + ", country=" + this.f39228h + ", zip=" + this.f39229i + ')';
    }

    public BillingAddress(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, String str8) {
        this.f39221a = str;
        this.f39222b = str2;
        this.f39223c = str3;
        this.f39224d = str4;
        this.f39225e = str5;
        this.f39226f = str6;
        this.f39227g = bool;
        this.f39228h = str7;
        this.f39229i = str8;
    }
}
