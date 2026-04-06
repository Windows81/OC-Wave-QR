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
public final class CreateCyberSourceFormRequest {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f39292a;

    /* renamed from: b  reason: collision with root package name */
    public final Boolean f39293b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CreateCyberSourceFormRequest> serializer() {
            return CreateCyberSourceFormRequest$$serializer.f39294a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ CreateCyberSourceFormRequest(int i2, String str, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39292a = null;
        } else {
            this.f39292a = str;
        }
        if ((i2 & 2) == 0) {
            this.f39293b = null;
        } else {
            this.f39293b = bool;
        }
    }

    public static final /* synthetic */ void a(CreateCyberSourceFormRequest createCyberSourceFormRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || createCyberSourceFormRequest.f39292a != null) {
            compositeEncoder.m(serialDescriptor, 0, StringSerializer.f42197a, createCyberSourceFormRequest.f39292a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || createCyberSourceFormRequest.f39293b != null) {
            compositeEncoder.m(serialDescriptor, 1, BooleanSerializer.f42073a, createCyberSourceFormRequest.f39293b);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateCyberSourceFormRequest)) {
            return false;
        }
        CreateCyberSourceFormRequest createCyberSourceFormRequest = (CreateCyberSourceFormRequest) obj;
        return Intrinsics.d(this.f39292a, createCyberSourceFormRequest.f39292a) && Intrinsics.d(this.f39293b, createCyberSourceFormRequest.f39293b);
    }

    public int hashCode() {
        String str = this.f39292a;
        int i2 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.f39293b;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "CreateCyberSourceFormRequest(nickname=" + this.f39292a + ", isDefault=" + this.f39293b + ')';
    }

    public CreateCyberSourceFormRequest(String str, Boolean bool) {
        this.f39292a = str;
        this.f39293b = bool;
    }
}
