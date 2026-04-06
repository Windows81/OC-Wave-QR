package com.hansecom.mapi.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Serializable
public final class TopUpReference {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f39590a;

    /* renamed from: b  reason: collision with root package name */
    public final Long f39591b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TopUpReference> serializer() {
            return TopUpReference$$serializer.f39592a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ TopUpReference(int i2, String str, Long l2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39590a = null;
        } else {
            this.f39590a = str;
        }
        if ((i2 & 2) == 0) {
            this.f39591b = null;
        } else {
            this.f39591b = l2;
        }
    }

    public static final /* synthetic */ void a(TopUpReference topUpReference, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || topUpReference.f39590a != null) {
            compositeEncoder.m(serialDescriptor, 0, StringSerializer.f42197a, topUpReference.f39590a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || topUpReference.f39591b != null) {
            compositeEncoder.m(serialDescriptor, 1, LongSerializer.f42142a, topUpReference.f39591b);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopUpReference)) {
            return false;
        }
        TopUpReference topUpReference = (TopUpReference) obj;
        return Intrinsics.d(this.f39590a, topUpReference.f39590a) && Intrinsics.d(this.f39591b, topUpReference.f39591b);
    }

    public int hashCode() {
        String str = this.f39590a;
        int i2 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l2 = this.f39591b;
        if (l2 != null) {
            i2 = l2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "TopUpReference(cardId=" + this.f39590a + ", amount=" + this.f39591b + ')';
    }

    public TopUpReference(String str, Long l2) {
        this.f39590a = str;
        this.f39591b = l2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TopUpReference(String str, Long l2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : l2);
    }
}
