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
public final class NotificationDeviceResponse {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f39511a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f39512b;

    /* renamed from: c  reason: collision with root package name */
    public final String f39513c;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NotificationDeviceResponse> serializer() {
            return NotificationDeviceResponse$$serializer.f39514a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ NotificationDeviceResponse(int i2, String str, boolean z2, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i2 & 3)) {
            PluginExceptionsKt.a(i2, 3, NotificationDeviceResponse$$serializer.f39514a.a());
        }
        this.f39511a = str;
        this.f39512b = z2;
        if ((i2 & 4) == 0) {
            this.f39513c = null;
        } else {
            this.f39513c = str2;
        }
    }

    public static final /* synthetic */ void a(NotificationDeviceResponse notificationDeviceResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.t(serialDescriptor, 0, notificationDeviceResponse.f39511a);
        compositeEncoder.s(serialDescriptor, 1, notificationDeviceResponse.f39512b);
        if (compositeEncoder.w(serialDescriptor, 2) || notificationDeviceResponse.f39513c != null) {
            compositeEncoder.m(serialDescriptor, 2, StringSerializer.f42197a, notificationDeviceResponse.f39513c);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationDeviceResponse)) {
            return false;
        }
        NotificationDeviceResponse notificationDeviceResponse = (NotificationDeviceResponse) obj;
        return Intrinsics.d(this.f39511a, notificationDeviceResponse.f39511a) && this.f39512b == notificationDeviceResponse.f39512b && Intrinsics.d(this.f39513c, notificationDeviceResponse.f39513c);
    }

    public int hashCode() {
        int hashCode = ((this.f39511a.hashCode() * 31) + Boolean.hashCode(this.f39512b)) * 31;
        String str = this.f39513c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "NotificationDeviceResponse(messagingToken=" + this.f39511a + ", isActive=" + this.f39512b + ", expiration=" + this.f39513c + ')';
    }
}
