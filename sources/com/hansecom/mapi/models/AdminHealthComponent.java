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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Serializable
public final class AdminHealthComponent {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final KSerializer[] f39188c = {Status.Companion.serializer(), null};

    /* renamed from: a  reason: collision with root package name */
    public final Status f39189a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39190b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AdminHealthComponent> serializer() {
            return AdminHealthComponent$$serializer.f39191a;
        }

        public Companion() {
        }
    }

    @Metadata
    @Serializable
    public enum Status {
        OK("OK"),
        DEGRADED("DEGRADED"),
        DOWN("DOWN");
        

        /* renamed from: A  reason: collision with root package name */
        public static final Lazy f39192A = null;
        public static final Companion Companion = null;

        /* renamed from: z  reason: collision with root package name */
        public final String f39194z;

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ KSerializer a() {
                return (KSerializer) Status.f39192A.getValue();
            }

            public final KSerializer<Status> serializer() {
                return a();
            }

            public Companion() {
            }
        }

        static {
            Status[] d2;
            C = EnumEntriesKt.a(d2);
            Companion = new Companion((DefaultConstructorMarker) null);
            f39192A = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, Companion.AnonymousClass1.f39195z);
        }

        /* access modifiers changed from: public */
        Status(String str) {
            this.f39194z = str;
        }
    }

    public /* synthetic */ AdminHealthComponent(int i2, Status status, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39189a = null;
        } else {
            this.f39189a = status;
        }
        if ((i2 & 2) == 0) {
            this.f39190b = null;
        } else {
            this.f39190b = str;
        }
    }

    public static final /* synthetic */ void b(AdminHealthComponent adminHealthComponent, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f39188c;
        if (compositeEncoder.w(serialDescriptor, 0) || adminHealthComponent.f39189a != null) {
            compositeEncoder.m(serialDescriptor, 0, kSerializerArr[0], adminHealthComponent.f39189a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || adminHealthComponent.f39190b != null) {
            compositeEncoder.m(serialDescriptor, 1, StringSerializer.f42197a, adminHealthComponent.f39190b);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdminHealthComponent)) {
            return false;
        }
        AdminHealthComponent adminHealthComponent = (AdminHealthComponent) obj;
        return this.f39189a == adminHealthComponent.f39189a && Intrinsics.d(this.f39190b, adminHealthComponent.f39190b);
    }

    public int hashCode() {
        Status status = this.f39189a;
        int i2 = 0;
        int hashCode = (status == null ? 0 : status.hashCode()) * 31;
        String str = this.f39190b;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "AdminHealthComponent(status=" + this.f39189a + ", details=" + this.f39190b + ')';
    }
}
