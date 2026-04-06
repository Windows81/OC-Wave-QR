package com.hansecom.mapi.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Serializable
public final class BalanceTransferRequest {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f39218a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f39219b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BalanceTransferRequest> serializer() {
            return BalanceTransferRequest$$serializer.f39220a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ BalanceTransferRequest(int i2, String str, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39218a = null;
        } else {
            this.f39218a = str;
        }
        if ((i2 & 2) == 0) {
            this.f39219b = null;
        } else {
            this.f39219b = num;
        }
    }

    public static final /* synthetic */ void a(BalanceTransferRequest balanceTransferRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || balanceTransferRequest.f39218a != null) {
            compositeEncoder.m(serialDescriptor, 0, StringSerializer.f42197a, balanceTransferRequest.f39218a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || balanceTransferRequest.f39219b != null) {
            compositeEncoder.m(serialDescriptor, 1, IntSerializer.f42129a, balanceTransferRequest.f39219b);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BalanceTransferRequest)) {
            return false;
        }
        BalanceTransferRequest balanceTransferRequest = (BalanceTransferRequest) obj;
        return Intrinsics.d(this.f39218a, balanceTransferRequest.f39218a) && Intrinsics.d(this.f39219b, balanceTransferRequest.f39219b);
    }

    public int hashCode() {
        String str = this.f39218a;
        int i2 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f39219b;
        if (num != null) {
            i2 = num.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "BalanceTransferRequest(recipientCardId=" + this.f39218a + ", transferAmount=" + this.f39219b + ')';
    }

    public BalanceTransferRequest(String str, Integer num) {
        this.f39218a = str;
        this.f39219b = num;
    }
}
