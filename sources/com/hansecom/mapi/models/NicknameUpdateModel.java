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
public final class NicknameUpdateModel {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f39500a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NicknameUpdateModel> serializer() {
            return NicknameUpdateModel$$serializer.f39501a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ NicknameUpdateModel(int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39500a = null;
        } else {
            this.f39500a = str;
        }
    }

    public static final /* synthetic */ void a(NicknameUpdateModel nicknameUpdateModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || nicknameUpdateModel.f39500a != null) {
            compositeEncoder.m(serialDescriptor, 0, StringSerializer.f42197a, nicknameUpdateModel.f39500a);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NicknameUpdateModel) && Intrinsics.d(this.f39500a, ((NicknameUpdateModel) obj).f39500a);
    }

    public int hashCode() {
        String str = this.f39500a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "NicknameUpdateModel(nickname=" + this.f39500a + ')';
    }

    public NicknameUpdateModel(String str) {
        this.f39500a = str;
    }
}
