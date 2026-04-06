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
public final class ChangeIvrPinRequest {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f39246a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39247b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ChangeIvrPinRequest> serializer() {
            return ChangeIvrPinRequest$$serializer.f39248a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ ChangeIvrPinRequest(int i2, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i2 & 3)) {
            PluginExceptionsKt.a(i2, 3, ChangeIvrPinRequest$$serializer.f39248a.a());
        }
        this.f39246a = str;
        this.f39247b = str2;
    }

    public static final /* synthetic */ void a(ChangeIvrPinRequest changeIvrPinRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.t(serialDescriptor, 0, changeIvrPinRequest.f39246a);
        compositeEncoder.t(serialDescriptor, 1, changeIvrPinRequest.f39247b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeIvrPinRequest)) {
            return false;
        }
        ChangeIvrPinRequest changeIvrPinRequest = (ChangeIvrPinRequest) obj;
        return Intrinsics.d(this.f39246a, changeIvrPinRequest.f39246a) && Intrinsics.d(this.f39247b, changeIvrPinRequest.f39247b);
    }

    public int hashCode() {
        return (this.f39246a.hashCode() * 31) + this.f39247b.hashCode();
    }

    public String toString() {
        return "ChangeIvrPinRequest(oldPin=" + this.f39246a + ", newPin=" + this.f39247b + ')';
    }

    public ChangeIvrPinRequest(String str, String str2) {
        Intrinsics.i(str, "oldPin");
        Intrinsics.i(str2, "newPin");
        this.f39246a = str;
        this.f39247b = str2;
    }
}
