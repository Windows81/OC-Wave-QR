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
public final class FareMediaCredentialsWithValidityExtention {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f39360a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39361b;

    /* renamed from: c  reason: collision with root package name */
    public final String f39362c;

    /* renamed from: d  reason: collision with root package name */
    public final Boolean f39363d;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FareMediaCredentialsWithValidityExtention> serializer() {
            return FareMediaCredentialsWithValidityExtention$$serializer.f39364a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ FareMediaCredentialsWithValidityExtention(int i2, String str, String str2, String str3, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39360a = null;
        } else {
            this.f39360a = str;
        }
        if ((i2 & 2) == 0) {
            this.f39361b = null;
        } else {
            this.f39361b = str2;
        }
        if ((i2 & 4) == 0) {
            this.f39362c = null;
        } else {
            this.f39362c = str3;
        }
        if ((i2 & 8) == 0) {
            this.f39363d = null;
        } else {
            this.f39363d = bool;
        }
    }

    public static final /* synthetic */ void a(FareMediaCredentialsWithValidityExtention fareMediaCredentialsWithValidityExtention, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || fareMediaCredentialsWithValidityExtention.f39360a != null) {
            compositeEncoder.m(serialDescriptor, 0, StringSerializer.f42197a, fareMediaCredentialsWithValidityExtention.f39360a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || fareMediaCredentialsWithValidityExtention.f39361b != null) {
            compositeEncoder.m(serialDescriptor, 1, StringSerializer.f42197a, fareMediaCredentialsWithValidityExtention.f39361b);
        }
        if (compositeEncoder.w(serialDescriptor, 2) || fareMediaCredentialsWithValidityExtention.f39362c != null) {
            compositeEncoder.m(serialDescriptor, 2, StringSerializer.f42197a, fareMediaCredentialsWithValidityExtention.f39362c);
        }
        if (compositeEncoder.w(serialDescriptor, 3) || fareMediaCredentialsWithValidityExtention.f39363d != null) {
            compositeEncoder.m(serialDescriptor, 3, BooleanSerializer.f42073a, fareMediaCredentialsWithValidityExtention.f39363d);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FareMediaCredentialsWithValidityExtention)) {
            return false;
        }
        FareMediaCredentialsWithValidityExtention fareMediaCredentialsWithValidityExtention = (FareMediaCredentialsWithValidityExtention) obj;
        return Intrinsics.d(this.f39360a, fareMediaCredentialsWithValidityExtention.f39360a) && Intrinsics.d(this.f39361b, fareMediaCredentialsWithValidityExtention.f39361b) && Intrinsics.d(this.f39362c, fareMediaCredentialsWithValidityExtention.f39362c) && Intrinsics.d(this.f39363d, fareMediaCredentialsWithValidityExtention.f39363d);
    }

    public int hashCode() {
        String str = this.f39360a;
        int i2 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f39361b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f39362c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f39363d;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        return "FareMediaCredentialsWithValidityExtention(cardId=" + this.f39360a + ", nickname=" + this.f39361b + ", securityCode=" + this.f39362c + ", extendedValidity=" + this.f39363d + ')';
    }

    public FareMediaCredentialsWithValidityExtention(String str, String str2, String str3, Boolean bool) {
        this.f39360a = str;
        this.f39361b = str2;
        this.f39362c = str3;
        this.f39363d = bool;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FareMediaCredentialsWithValidityExtention(String str, String str2, String str3, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : bool);
    }
}
