package com.hansecom.mapi.models;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata
@Serializable
public final class NotificationDeviceRegistration {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final KSerializer[] f39502d = {null, Platform.Companion.serializer(), null};

    /* renamed from: a  reason: collision with root package name */
    public final String f39503a;

    /* renamed from: b  reason: collision with root package name */
    public final Platform f39504b;

    /* renamed from: c  reason: collision with root package name */
    public final Boolean f39505c;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NotificationDeviceRegistration> serializer() {
            return NotificationDeviceRegistration$$serializer.f39506a;
        }

        public Companion() {
        }
    }

    @Metadata
    @Serializable
    public enum Platform {
        ANDROID("ANDROID"),
        IOS("IOS");
        

        /* renamed from: A  reason: collision with root package name */
        public static final Lazy f39507A = null;
        public static final Companion Companion = null;

        /* renamed from: z  reason: collision with root package name */
        public final String f39509z;

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ KSerializer a() {
                return (KSerializer) Platform.f39507A.getValue();
            }

            public final KSerializer<Platform> serializer() {
                return a();
            }

            public Companion() {
            }
        }

        static {
            Platform[] d2;
            C = EnumEntriesKt.a(d2);
            Companion = new Companion((DefaultConstructorMarker) null);
            f39507A = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, Companion.AnonymousClass1.f39510z);
        }

        /* access modifiers changed from: public */
        Platform(String str) {
            this.f39509z = str;
        }
    }

    public /* synthetic */ NotificationDeviceRegistration(int i2, String str, Platform platform, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i2 & 3)) {
            PluginExceptionsKt.a(i2, 3, NotificationDeviceRegistration$$serializer.f39506a.a());
        }
        this.f39503a = str;
        this.f39504b = platform;
        if ((i2 & 4) == 0) {
            this.f39505c = Boolean.TRUE;
        } else {
            this.f39505c = bool;
        }
    }

    public static final /* synthetic */ void b(NotificationDeviceRegistration notificationDeviceRegistration, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f39502d;
        compositeEncoder.t(serialDescriptor, 0, notificationDeviceRegistration.f39503a);
        compositeEncoder.A(serialDescriptor, 1, kSerializerArr[1], notificationDeviceRegistration.f39504b);
        if (compositeEncoder.w(serialDescriptor, 2) || !Intrinsics.d(notificationDeviceRegistration.f39505c, Boolean.TRUE)) {
            compositeEncoder.m(serialDescriptor, 2, BooleanSerializer.f42073a, notificationDeviceRegistration.f39505c);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationDeviceRegistration)) {
            return false;
        }
        NotificationDeviceRegistration notificationDeviceRegistration = (NotificationDeviceRegistration) obj;
        return Intrinsics.d(this.f39503a, notificationDeviceRegistration.f39503a) && this.f39504b == notificationDeviceRegistration.f39504b && Intrinsics.d(this.f39505c, notificationDeviceRegistration.f39505c);
    }

    public int hashCode() {
        int hashCode = ((this.f39503a.hashCode() * 31) + this.f39504b.hashCode()) * 31;
        Boolean bool = this.f39505c;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        return "NotificationDeviceRegistration(messagingToken=" + this.f39503a + ", platform=" + this.f39504b + ", isActive=" + this.f39505c + ')';
    }
}
