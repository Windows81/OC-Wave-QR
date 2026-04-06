package com.hansecom.mapi.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Serializable
public final class DeleteUserRequest {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f39298a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DeleteUserRequest> serializer() {
            return DeleteUserRequest$$serializer.f39299a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ DeleteUserRequest(int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39298a = null;
        } else {
            this.f39298a = str;
        }
    }

    public static final /* synthetic */ void a(DeleteUserRequest deleteUserRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || deleteUserRequest.f39298a != null) {
            compositeEncoder.m(serialDescriptor, 0, StringSerializer.f42197a, deleteUserRequest.f39298a);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeleteUserRequest) && Intrinsics.d(this.f39298a, ((DeleteUserRequest) obj).f39298a);
    }

    public int hashCode() {
        String str = this.f39298a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "DeleteUserRequest(password=" + this.f39298a + ')';
    }

    public DeleteUserRequest(String str) {
        this.f39298a = str;
    }
}
