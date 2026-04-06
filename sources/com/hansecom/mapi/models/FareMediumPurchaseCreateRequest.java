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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Serializable
public final class FareMediumPurchaseCreateRequest {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final KSerializer[] f39414f = {null, null, WalletType.Companion.serializer(), null, null};

    /* renamed from: a  reason: collision with root package name */
    public final Integer f39415a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39416b;

    /* renamed from: c  reason: collision with root package name */
    public final WalletType f39417c;

    /* renamed from: d  reason: collision with root package name */
    public final Long f39418d;

    /* renamed from: e  reason: collision with root package name */
    public final TopUpReference f39419e;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FareMediumPurchaseCreateRequest> serializer() {
            return FareMediumPurchaseCreateRequest$$serializer.f39420a;
        }

        public Companion() {
        }
    }

    @Metadata
    @Serializable
    public enum WalletType {
        GOOGLE("GOOGLE"),
        APPLE("APPLE");
        

        /* renamed from: A  reason: collision with root package name */
        public static final Lazy f39421A = null;
        public static final Companion Companion = null;

        /* renamed from: z  reason: collision with root package name */
        public final String f39423z;

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ KSerializer a() {
                return (KSerializer) WalletType.f39421A.getValue();
            }

            public final KSerializer<WalletType> serializer() {
                return a();
            }

            public Companion() {
            }
        }

        static {
            WalletType[] d2;
            C = EnumEntriesKt.a(d2);
            Companion = new Companion((DefaultConstructorMarker) null);
            f39421A = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, Companion.AnonymousClass1.f39424z);
        }

        /* access modifiers changed from: public */
        WalletType(String str) {
            this.f39423z = str;
        }
    }

    public /* synthetic */ FareMediumPurchaseCreateRequest(int i2, Integer num, String str, WalletType walletType, Long l2, TopUpReference topUpReference, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39415a = null;
        } else {
            this.f39415a = num;
        }
        if ((i2 & 2) == 0) {
            this.f39416b = null;
        } else {
            this.f39416b = str;
        }
        if ((i2 & 4) == 0) {
            this.f39417c = null;
        } else {
            this.f39417c = walletType;
        }
        if ((i2 & 8) == 0) {
            this.f39418d = null;
        } else {
            this.f39418d = l2;
        }
        if ((i2 & 16) == 0) {
            this.f39419e = null;
        } else {
            this.f39419e = topUpReference;
        }
    }

    public static final /* synthetic */ void b(FareMediumPurchaseCreateRequest fareMediumPurchaseCreateRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f39414f;
        if (compositeEncoder.w(serialDescriptor, 0) || fareMediumPurchaseCreateRequest.f39415a != null) {
            compositeEncoder.m(serialDescriptor, 0, IntSerializer.f42129a, fareMediumPurchaseCreateRequest.f39415a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || fareMediumPurchaseCreateRequest.f39416b != null) {
            compositeEncoder.m(serialDescriptor, 1, StringSerializer.f42197a, fareMediumPurchaseCreateRequest.f39416b);
        }
        if (compositeEncoder.w(serialDescriptor, 2) || fareMediumPurchaseCreateRequest.f39417c != null) {
            compositeEncoder.m(serialDescriptor, 2, kSerializerArr[2], fareMediumPurchaseCreateRequest.f39417c);
        }
        if (compositeEncoder.w(serialDescriptor, 3) || fareMediumPurchaseCreateRequest.f39418d != null) {
            compositeEncoder.m(serialDescriptor, 3, LongSerializer.f42142a, fareMediumPurchaseCreateRequest.f39418d);
        }
        if (compositeEncoder.w(serialDescriptor, 4) || fareMediumPurchaseCreateRequest.f39419e != null) {
            compositeEncoder.m(serialDescriptor, 4, TopUpReference$$serializer.f39592a, fareMediumPurchaseCreateRequest.f39419e);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FareMediumPurchaseCreateRequest)) {
            return false;
        }
        FareMediumPurchaseCreateRequest fareMediumPurchaseCreateRequest = (FareMediumPurchaseCreateRequest) obj;
        return Intrinsics.d(this.f39415a, fareMediumPurchaseCreateRequest.f39415a) && Intrinsics.d(this.f39416b, fareMediumPurchaseCreateRequest.f39416b) && this.f39417c == fareMediumPurchaseCreateRequest.f39417c && Intrinsics.d(this.f39418d, fareMediumPurchaseCreateRequest.f39418d) && Intrinsics.d(this.f39419e, fareMediumPurchaseCreateRequest.f39419e);
    }

    public int hashCode() {
        Integer num = this.f39415a;
        int i2 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f39416b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        WalletType walletType = this.f39417c;
        int hashCode3 = (hashCode2 + (walletType == null ? 0 : walletType.hashCode())) * 31;
        Long l2 = this.f39418d;
        int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        TopUpReference topUpReference = this.f39419e;
        if (topUpReference != null) {
            i2 = topUpReference.hashCode();
        }
        return hashCode4 + i2;
    }

    public String toString() {
        return "FareMediumPurchaseCreateRequest(virtualFareMediaId=" + this.f39415a + ", nickname=" + this.f39416b + ", walletType=" + this.f39417c + ", paymentMethodId=" + this.f39418d + ", topUpAmount=" + this.f39419e + ')';
    }

    public FareMediumPurchaseCreateRequest(Integer num, String str, WalletType walletType, Long l2, TopUpReference topUpReference) {
        this.f39415a = num;
        this.f39416b = str;
        this.f39417c = walletType;
        this.f39418d = l2;
        this.f39419e = topUpReference;
    }
}
