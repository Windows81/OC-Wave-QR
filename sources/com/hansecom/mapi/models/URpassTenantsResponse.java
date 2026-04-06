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
public final class URpassTenantsResponse {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f39622a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39623b;

    /* renamed from: c  reason: collision with root package name */
    public final String f39624c;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<URpassTenantsResponse> serializer() {
            return URpassTenantsResponse$$serializer.f39625a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ URpassTenantsResponse(int i2, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i2 & 7)) {
            PluginExceptionsKt.a(i2, 7, URpassTenantsResponse$$serializer.f39625a.a());
        }
        this.f39622a = str;
        this.f39623b = str2;
        this.f39624c = str3;
    }

    public static final /* synthetic */ void a(URpassTenantsResponse uRpassTenantsResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.t(serialDescriptor, 0, uRpassTenantsResponse.f39622a);
        compositeEncoder.t(serialDescriptor, 1, uRpassTenantsResponse.f39623b);
        compositeEncoder.t(serialDescriptor, 2, uRpassTenantsResponse.f39624c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof URpassTenantsResponse)) {
            return false;
        }
        URpassTenantsResponse uRpassTenantsResponse = (URpassTenantsResponse) obj;
        return Intrinsics.d(this.f39622a, uRpassTenantsResponse.f39622a) && Intrinsics.d(this.f39623b, uRpassTenantsResponse.f39623b) && Intrinsics.d(this.f39624c, uRpassTenantsResponse.f39624c);
    }

    public int hashCode() {
        return (((this.f39622a.hashCode() * 31) + this.f39623b.hashCode()) * 31) + this.f39624c.hashCode();
    }

    public String toString() {
        return "URpassTenantsResponse(id=" + this.f39622a + ", name=" + this.f39623b + ", location=" + this.f39624c + ')';
    }
}
