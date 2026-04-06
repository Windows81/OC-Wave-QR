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
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Serializable
public final class AdminLinkInstitutionRequest {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final int f39196a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39197b;

    /* renamed from: c  reason: collision with root package name */
    public final String f39198c;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AdminLinkInstitutionRequest> serializer() {
            return AdminLinkInstitutionRequest$$serializer.f39199a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ AdminLinkInstitutionRequest(int i2, int i3, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i2 & 3)) {
            PluginExceptionsKt.a(i2, 3, AdminLinkInstitutionRequest$$serializer.f39199a.a());
        }
        this.f39196a = i3;
        this.f39197b = str;
        if ((i2 & 4) == 0) {
            this.f39198c = null;
        } else {
            this.f39198c = str2;
        }
    }

    public static final /* synthetic */ void a(AdminLinkInstitutionRequest adminLinkInstitutionRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.r(serialDescriptor, 0, adminLinkInstitutionRequest.f39196a);
        compositeEncoder.t(serialDescriptor, 1, adminLinkInstitutionRequest.f39197b);
        if (compositeEncoder.w(serialDescriptor, 2) || adminLinkInstitutionRequest.f39198c != null) {
            compositeEncoder.m(serialDescriptor, 2, StringSerializer.f42197a, adminLinkInstitutionRequest.f39198c);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdminLinkInstitutionRequest)) {
            return false;
        }
        AdminLinkInstitutionRequest adminLinkInstitutionRequest = (AdminLinkInstitutionRequest) obj;
        return this.f39196a == adminLinkInstitutionRequest.f39196a && Intrinsics.d(this.f39197b, adminLinkInstitutionRequest.f39197b) && Intrinsics.d(this.f39198c, adminLinkInstitutionRequest.f39198c);
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.f39196a) * 31) + this.f39197b.hashCode()) * 31;
        String str = this.f39198c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "AdminLinkInstitutionRequest(institutionId=" + this.f39196a + ", email=" + this.f39197b + ", cardId=" + this.f39198c + ')';
    }
}
