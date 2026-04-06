package com.hansecom.mapi.models;

import java.util.List;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Serializable
public final class CombinedProductOrderWithProviderRequest {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    public static final KSerializer[] f39276g = {CardNetwork.Companion.serializer(), null, null, null, new ArrayListSerializer(TopUpReference$$serializer.f39592a), new ArrayListSerializer(ProductConfiguration$$serializer.f39561a)};

    /* renamed from: a  reason: collision with root package name */
    public final CardNetwork f39277a;

    /* renamed from: b  reason: collision with root package name */
    public final InvoiceData f39278b;

    /* renamed from: c  reason: collision with root package name */
    public final String f39279c;

    /* renamed from: d  reason: collision with root package name */
    public final String f39280d;

    /* renamed from: e  reason: collision with root package name */
    public final List f39281e;

    /* renamed from: f  reason: collision with root package name */
    public final List f39282f;

    @Metadata
    @Serializable
    public enum CardNetwork {
        visa("visa"),
        mastercard("mastercard"),
        amex("amex"),
        discover("discover"),
        maestro("maestro"),
        jcb("jcb"),
        diners("diners"),
        cartebleue("cartebleue"),
        carteblanc("carteblanc"),
        voyager("voyager"),
        wex("wex"),
        unionpay("unionpay"),
        style("style"),
        valuelink("valuelink"),
        interac("interac"),
        laser("laser");
        

        /* renamed from: A  reason: collision with root package name */
        public static final Lazy f39284A = null;
        public static final Companion Companion = null;

        /* renamed from: z  reason: collision with root package name */
        public final String f39286z;

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ KSerializer a() {
                return (KSerializer) CardNetwork.f39284A.getValue();
            }

            public final KSerializer<CardNetwork> serializer() {
                return a();
            }

            public Companion() {
            }
        }

        static {
            CardNetwork[] d2;
            C = EnumEntriesKt.a(d2);
            Companion = new Companion((DefaultConstructorMarker) null);
            f39284A = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, Companion.AnonymousClass1.f39287z);
        }

        /* access modifiers changed from: public */
        CardNetwork(String str) {
            this.f39286z = str;
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CombinedProductOrderWithProviderRequest> serializer() {
            return CombinedProductOrderWithProviderRequest$$serializer.f39283a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ CombinedProductOrderWithProviderRequest(int i2, CardNetwork cardNetwork, InvoiceData invoiceData, String str, String str2, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i2 & 7)) {
            PluginExceptionsKt.a(i2, 7, CombinedProductOrderWithProviderRequest$$serializer.f39283a.a());
        }
        this.f39277a = cardNetwork;
        this.f39278b = invoiceData;
        this.f39279c = str;
        if ((i2 & 8) == 0) {
            this.f39280d = null;
        } else {
            this.f39280d = str2;
        }
        if ((i2 & 16) == 0) {
            this.f39281e = null;
        } else {
            this.f39281e = list;
        }
        if ((i2 & 32) == 0) {
            this.f39282f = null;
        } else {
            this.f39282f = list2;
        }
    }

    public static final /* synthetic */ void b(CombinedProductOrderWithProviderRequest combinedProductOrderWithProviderRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f39276g;
        compositeEncoder.A(serialDescriptor, 0, kSerializerArr[0], combinedProductOrderWithProviderRequest.f39277a);
        compositeEncoder.A(serialDescriptor, 1, InvoiceData$$serializer.f39493a, combinedProductOrderWithProviderRequest.f39278b);
        compositeEncoder.t(serialDescriptor, 2, combinedProductOrderWithProviderRequest.f39279c);
        if (compositeEncoder.w(serialDescriptor, 3) || combinedProductOrderWithProviderRequest.f39280d != null) {
            compositeEncoder.m(serialDescriptor, 3, StringSerializer.f42197a, combinedProductOrderWithProviderRequest.f39280d);
        }
        if (compositeEncoder.w(serialDescriptor, 4) || combinedProductOrderWithProviderRequest.f39281e != null) {
            compositeEncoder.m(serialDescriptor, 4, kSerializerArr[4], combinedProductOrderWithProviderRequest.f39281e);
        }
        if (compositeEncoder.w(serialDescriptor, 5) || combinedProductOrderWithProviderRequest.f39282f != null) {
            compositeEncoder.m(serialDescriptor, 5, kSerializerArr[5], combinedProductOrderWithProviderRequest.f39282f);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CombinedProductOrderWithProviderRequest)) {
            return false;
        }
        CombinedProductOrderWithProviderRequest combinedProductOrderWithProviderRequest = (CombinedProductOrderWithProviderRequest) obj;
        return this.f39277a == combinedProductOrderWithProviderRequest.f39277a && Intrinsics.d(this.f39278b, combinedProductOrderWithProviderRequest.f39278b) && Intrinsics.d(this.f39279c, combinedProductOrderWithProviderRequest.f39279c) && Intrinsics.d(this.f39280d, combinedProductOrderWithProviderRequest.f39280d) && Intrinsics.d(this.f39281e, combinedProductOrderWithProviderRequest.f39281e) && Intrinsics.d(this.f39282f, combinedProductOrderWithProviderRequest.f39282f);
    }

    public int hashCode() {
        int hashCode = ((((this.f39277a.hashCode() * 31) + this.f39278b.hashCode()) * 31) + this.f39279c.hashCode()) * 31;
        String str = this.f39280d;
        int i2 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f39281e;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f39282f;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        return "CombinedProductOrderWithProviderRequest(cardNetwork=" + this.f39277a + ", invoiceData=" + this.f39278b + ", encryptedPaymentData=" + this.f39279c + ", promoCode=" + this.f39280d + ", topUps=" + this.f39281e + ", products=" + this.f39282f + ')';
    }
}
