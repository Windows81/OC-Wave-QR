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
public final class FareMediaCredentials {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f39356a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39357b;

    /* renamed from: c  reason: collision with root package name */
    public final String f39358c;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FareMediaCredentials> serializer() {
            return FareMediaCredentials$$serializer.f39359a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ FareMediaCredentials(int i2, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i2 & 3)) {
            PluginExceptionsKt.a(i2, 3, FareMediaCredentials$$serializer.f39359a.a());
        }
        this.f39356a = str;
        this.f39357b = str2;
        if ((i2 & 4) == 0) {
            this.f39358c = null;
        } else {
            this.f39358c = str3;
        }
    }

    public static final /* synthetic */ void a(FareMediaCredentials fareMediaCredentials, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.t(serialDescriptor, 0, fareMediaCredentials.f39356a);
        compositeEncoder.t(serialDescriptor, 1, fareMediaCredentials.f39357b);
        if (compositeEncoder.w(serialDescriptor, 2) || fareMediaCredentials.f39358c != null) {
            compositeEncoder.m(serialDescriptor, 2, StringSerializer.f42197a, fareMediaCredentials.f39358c);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FareMediaCredentials)) {
            return false;
        }
        FareMediaCredentials fareMediaCredentials = (FareMediaCredentials) obj;
        return Intrinsics.d(this.f39356a, fareMediaCredentials.f39356a) && Intrinsics.d(this.f39357b, fareMediaCredentials.f39357b) && Intrinsics.d(this.f39358c, fareMediaCredentials.f39358c);
    }

    public int hashCode() {
        int hashCode = ((this.f39356a.hashCode() * 31) + this.f39357b.hashCode()) * 31;
        String str = this.f39358c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FareMediaCredentials(cardId=" + this.f39356a + ", securityCode=" + this.f39357b + ", nickname=" + this.f39358c + ')';
    }

    public FareMediaCredentials(String str, String str2, String str3) {
        Intrinsics.i(str, "cardId");
        Intrinsics.i(str2, "securityCode");
        this.f39356a = str;
        this.f39357b = str2;
        this.f39358c = str3;
    }
}
