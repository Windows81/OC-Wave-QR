package com.hansecom.mapi.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Serializable
public final class AdminPhysicalFareMedia {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final Integer f39203a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39204b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f39205c;

    /* renamed from: d  reason: collision with root package name */
    public final String f39206d;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AdminPhysicalFareMedia> serializer() {
            return AdminPhysicalFareMedia$$serializer.f39207a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ AdminPhysicalFareMedia(int i2, Integer num, String str, Integer num2, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39203a = null;
        } else {
            this.f39203a = num;
        }
        if ((i2 & 2) == 0) {
            this.f39204b = null;
        } else {
            this.f39204b = str;
        }
        if ((i2 & 4) == 0) {
            this.f39205c = null;
        } else {
            this.f39205c = num2;
        }
        if ((i2 & 8) == 0) {
            this.f39206d = null;
        } else {
            this.f39206d = str2;
        }
    }

    public static final /* synthetic */ void a(AdminPhysicalFareMedia adminPhysicalFareMedia, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || adminPhysicalFareMedia.f39203a != null) {
            compositeEncoder.m(serialDescriptor, 0, IntSerializer.f42129a, adminPhysicalFareMedia.f39203a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || adminPhysicalFareMedia.f39204b != null) {
            compositeEncoder.m(serialDescriptor, 1, StringSerializer.f42197a, adminPhysicalFareMedia.f39204b);
        }
        if (compositeEncoder.w(serialDescriptor, 2) || adminPhysicalFareMedia.f39205c != null) {
            compositeEncoder.m(serialDescriptor, 2, IntSerializer.f42129a, adminPhysicalFareMedia.f39205c);
        }
        if (compositeEncoder.w(serialDescriptor, 3) || adminPhysicalFareMedia.f39206d != null) {
            compositeEncoder.m(serialDescriptor, 3, StringSerializer.f42197a, adminPhysicalFareMedia.f39206d);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdminPhysicalFareMedia)) {
            return false;
        }
        AdminPhysicalFareMedia adminPhysicalFareMedia = (AdminPhysicalFareMedia) obj;
        return Intrinsics.d(this.f39203a, adminPhysicalFareMedia.f39203a) && Intrinsics.d(this.f39204b, adminPhysicalFareMedia.f39204b) && Intrinsics.d(this.f39205c, adminPhysicalFareMedia.f39205c) && Intrinsics.d(this.f39206d, adminPhysicalFareMedia.f39206d);
    }

    public int hashCode() {
        Integer num = this.f39203a;
        int i2 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f39204b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f39205c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.f39206d;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        return "AdminPhysicalFareMedia(id=" + this.f39203a + ", name=" + this.f39204b + ", riderTypeId=" + this.f39205c + ", riderTypeName=" + this.f39206d + ')';
    }
}
