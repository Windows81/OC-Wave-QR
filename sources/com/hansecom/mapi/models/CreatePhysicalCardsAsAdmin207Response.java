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
public final class CreatePhysicalCardsAsAdmin207Response {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final AdminCreateCardsResponse f39295a;

    /* renamed from: b  reason: collision with root package name */
    public final ErrorResponse f39296b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CreatePhysicalCardsAsAdmin207Response> serializer() {
            return CreatePhysicalCardsAsAdmin207Response$$serializer.f39297a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ CreatePhysicalCardsAsAdmin207Response(int i2, AdminCreateCardsResponse adminCreateCardsResponse, ErrorResponse errorResponse, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39295a = null;
        } else {
            this.f39295a = adminCreateCardsResponse;
        }
        if ((i2 & 2) == 0) {
            this.f39296b = null;
        } else {
            this.f39296b = errorResponse;
        }
    }

    public static final /* synthetic */ void a(CreatePhysicalCardsAsAdmin207Response createPhysicalCardsAsAdmin207Response, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || createPhysicalCardsAsAdmin207Response.f39295a != null) {
            compositeEncoder.m(serialDescriptor, 0, AdminCreateCardsResponse$$serializer.f39187a, createPhysicalCardsAsAdmin207Response.f39295a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || createPhysicalCardsAsAdmin207Response.f39296b != null) {
            compositeEncoder.m(serialDescriptor, 1, ErrorResponse$$serializer.f39321a, createPhysicalCardsAsAdmin207Response.f39296b);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreatePhysicalCardsAsAdmin207Response)) {
            return false;
        }
        CreatePhysicalCardsAsAdmin207Response createPhysicalCardsAsAdmin207Response = (CreatePhysicalCardsAsAdmin207Response) obj;
        return Intrinsics.d(this.f39295a, createPhysicalCardsAsAdmin207Response.f39295a) && Intrinsics.d(this.f39296b, createPhysicalCardsAsAdmin207Response.f39296b);
    }

    public int hashCode() {
        AdminCreateCardsResponse adminCreateCardsResponse = this.f39295a;
        int i2 = 0;
        int hashCode = (adminCreateCardsResponse == null ? 0 : adminCreateCardsResponse.hashCode()) * 31;
        ErrorResponse errorResponse = this.f39296b;
        if (errorResponse != null) {
            i2 = errorResponse.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "CreatePhysicalCardsAsAdmin207Response(success=" + this.f39295a + ", failure=" + this.f39296b + ')';
    }
}
