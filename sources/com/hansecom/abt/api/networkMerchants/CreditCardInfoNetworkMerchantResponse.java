package com.hansecom.abt.api.networkMerchants;

import android.os.Parcel;
import android.os.Parcelable;
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
public final class CreditCardInfoNetworkMerchantResponse implements Parcelable {
    public static final Parcelable.Creator<CreditCardInfoNetworkMerchantResponse> CREATOR = new Creator();
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: A  reason: collision with root package name */
    public final String f33134A;

    /* renamed from: B  reason: collision with root package name */
    public final Card f33135B;
    public final Check C;

    /* renamed from: z  reason: collision with root package name */
    public final String f33136z;

    @Metadata
    @Serializable
    public static final class Card implements Parcelable {
        public static final Parcelable.Creator<Card> CREATOR = new Creator();
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

        /* renamed from: A  reason: collision with root package name */
        public final String f33143A;

        /* renamed from: B  reason: collision with root package name */
        public final String f33144B;
        public final String C;
        public final String D;

        /* renamed from: z  reason: collision with root package name */
        public final String f33145z;

        @Metadata
        public static final class Companion {
            public Companion() {
            }

            public final KSerializer<Card> serializer() {
                return CreditCardInfoNetworkMerchantResponse$Card$$serializer.f33139a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata
        public static final class Creator implements Parcelable.Creator<Card> {
            /* renamed from: a */
            public final Card createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                return new Card(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* renamed from: b */
            public final Card[] newArray(int i2) {
                return new Card[i2];
            }
        }

        public /* synthetic */ Card(int i2, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
            if (31 != (i2 & 31)) {
                PluginExceptionsKt.a(i2, 31, CreditCardInfoNetworkMerchantResponse$Card$$serializer.f33139a.a());
            }
            this.f33145z = str;
            this.f33143A = str2;
            this.f33144B = str3;
            this.C = str4;
            this.D = str5;
        }

        public static final /* synthetic */ void d(Card card, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.t(serialDescriptor, 0, card.f33145z);
            compositeEncoder.t(serialDescriptor, 1, card.f33143A);
            compositeEncoder.t(serialDescriptor, 2, card.f33144B);
            compositeEncoder.t(serialDescriptor, 3, card.C);
            compositeEncoder.t(serialDescriptor, 4, card.D);
        }

        public final String a() {
            return this.f33144B;
        }

        public final String b() {
            return this.f33145z;
        }

        public final String c() {
            return this.C;
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Card)) {
                return false;
            }
            Card card = (Card) obj;
            return Intrinsics.d(this.f33145z, card.f33145z) && Intrinsics.d(this.f33143A, card.f33143A) && Intrinsics.d(this.f33144B, card.f33144B) && Intrinsics.d(this.C, card.C) && Intrinsics.d(this.D, card.D);
        }

        public int hashCode() {
            return (((((((this.f33145z.hashCode() * 31) + this.f33143A.hashCode()) * 31) + this.f33144B.hashCode()) * 31) + this.C.hashCode()) * 31) + this.D.hashCode();
        }

        public String toString() {
            String str = this.f33145z;
            String str2 = this.f33143A;
            String str3 = this.f33144B;
            String str4 = this.C;
            String str5 = this.D;
            return "Card(number=" + str + ", bin=" + str2 + ", expirationDate=" + str3 + ", type=" + str4 + ", hash=" + str5 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeString(this.f33145z);
            parcel.writeString(this.f33143A);
            parcel.writeString(this.f33144B);
            parcel.writeString(this.C);
            parcel.writeString(this.D);
        }

        public Card(String str, String str2, String str3, String str4, String str5) {
            Intrinsics.i(str, "number");
            Intrinsics.i(str2, "bin");
            Intrinsics.i(str3, "expirationDate");
            Intrinsics.i(str4, "type");
            Intrinsics.i(str5, "hash");
            this.f33145z = str;
            this.f33143A = str2;
            this.f33144B = str3;
            this.C = str4;
            this.D = str5;
        }
    }

    @Metadata
    @Serializable
    public static final class Check implements Parcelable {
        public static final Parcelable.Creator<Check> CREATOR = new Creator();
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

        /* renamed from: A  reason: collision with root package name */
        public final String f33146A;

        /* renamed from: B  reason: collision with root package name */
        public final String f33147B;
        public final String C;
        public final String D;
        public final String E;

        /* renamed from: z  reason: collision with root package name */
        public final String f33148z;

        @Metadata
        public static final class Companion {
            public Companion() {
            }

            public final KSerializer<Check> serializer() {
                return CreditCardInfoNetworkMerchantResponse$Check$$serializer.f33141a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata
        public static final class Creator implements Parcelable.Creator<Check> {
            /* renamed from: a */
            public final Check createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                return new Check(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* renamed from: b */
            public final Check[] newArray(int i2) {
                return new Check[i2];
            }
        }

        public /* synthetic */ Check(int i2, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
            if (63 != (i2 & 63)) {
                PluginExceptionsKt.a(i2, 63, CreditCardInfoNetworkMerchantResponse$Check$$serializer.f33141a.a());
            }
            this.f33148z = str;
            this.f33146A = str2;
            this.f33147B = str3;
            this.C = str4;
            this.D = str5;
            this.E = str6;
        }

        public static final /* synthetic */ void c(Check check, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            StringSerializer stringSerializer = StringSerializer.f42197a;
            compositeEncoder.m(serialDescriptor, 0, stringSerializer, check.f33148z);
            compositeEncoder.m(serialDescriptor, 1, stringSerializer, check.f33146A);
            compositeEncoder.m(serialDescriptor, 2, stringSerializer, check.f33147B);
            compositeEncoder.m(serialDescriptor, 3, stringSerializer, check.C);
            compositeEncoder.m(serialDescriptor, 4, stringSerializer, check.D);
            compositeEncoder.m(serialDescriptor, 5, stringSerializer, check.E);
        }

        public final String a() {
            return this.f33147B;
        }

        public final String b() {
            return this.f33146A;
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Check)) {
                return false;
            }
            Check check = (Check) obj;
            return Intrinsics.d(this.f33148z, check.f33148z) && Intrinsics.d(this.f33146A, check.f33146A) && Intrinsics.d(this.f33147B, check.f33147B) && Intrinsics.d(this.C, check.C) && Intrinsics.d(this.D, check.D) && Intrinsics.d(this.E, check.E);
        }

        public int hashCode() {
            String str = this.f33148z;
            int i2 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f33146A;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f33147B;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.C;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.D;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.E;
            if (str6 != null) {
                i2 = str6.hashCode();
            }
            return hashCode5 + i2;
        }

        public String toString() {
            String str = this.f33148z;
            String str2 = this.f33146A;
            String str3 = this.f33147B;
            String str4 = this.C;
            String str5 = this.D;
            String str6 = this.E;
            return "Check(name=" + str + ", account=" + str2 + ", aba=" + str3 + ", transit=" + str4 + ", institution=" + str5 + ", hash=" + str6 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeString(this.f33148z);
            parcel.writeString(this.f33146A);
            parcel.writeString(this.f33147B);
            parcel.writeString(this.C);
            parcel.writeString(this.D);
            parcel.writeString(this.E);
        }

        public Check(String str, String str2, String str3, String str4, String str5, String str6) {
            this.f33148z = str;
            this.f33146A = str2;
            this.f33147B = str3;
            this.C = str4;
            this.D = str5;
            this.E = str6;
        }
    }

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<CreditCardInfoNetworkMerchantResponse> serializer() {
            return CreditCardInfoNetworkMerchantResponse$$serializer.f33137a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata
    public static final class Creator implements Parcelable.Creator<CreditCardInfoNetworkMerchantResponse> {
        /* renamed from: a */
        public final CreditCardInfoNetworkMerchantResponse createFromParcel(Parcel parcel) {
            Intrinsics.i(parcel, "parcel");
            return new CreditCardInfoNetworkMerchantResponse(parcel.readString(), parcel.readString(), Card.CREATOR.createFromParcel(parcel), Check.CREATOR.createFromParcel(parcel));
        }

        /* renamed from: b */
        public final CreditCardInfoNetworkMerchantResponse[] newArray(int i2) {
            return new CreditCardInfoNetworkMerchantResponse[i2];
        }
    }

    public /* synthetic */ CreditCardInfoNetworkMerchantResponse(int i2, String str, String str2, Card card, Check check, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i2 & 15)) {
            PluginExceptionsKt.a(i2, 15, CreditCardInfoNetworkMerchantResponse$$serializer.f33137a.a());
        }
        this.f33136z = str;
        this.f33134A = str2;
        this.f33135B = card;
        this.C = check;
    }

    public static final /* synthetic */ void d(CreditCardInfoNetworkMerchantResponse creditCardInfoNetworkMerchantResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.t(serialDescriptor, 0, creditCardInfoNetworkMerchantResponse.f33136z);
        compositeEncoder.t(serialDescriptor, 1, creditCardInfoNetworkMerchantResponse.f33134A);
        compositeEncoder.A(serialDescriptor, 2, CreditCardInfoNetworkMerchantResponse$Card$$serializer.f33139a, creditCardInfoNetworkMerchantResponse.f33135B);
        compositeEncoder.A(serialDescriptor, 3, CreditCardInfoNetworkMerchantResponse$Check$$serializer.f33141a, creditCardInfoNetworkMerchantResponse.C);
    }

    public final Card a() {
        return this.f33135B;
    }

    public final Check b() {
        return this.C;
    }

    public final String c() {
        return this.f33134A;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditCardInfoNetworkMerchantResponse)) {
            return false;
        }
        CreditCardInfoNetworkMerchantResponse creditCardInfoNetworkMerchantResponse = (CreditCardInfoNetworkMerchantResponse) obj;
        return Intrinsics.d(this.f33136z, creditCardInfoNetworkMerchantResponse.f33136z) && Intrinsics.d(this.f33134A, creditCardInfoNetworkMerchantResponse.f33134A) && Intrinsics.d(this.f33135B, creditCardInfoNetworkMerchantResponse.f33135B) && Intrinsics.d(this.C, creditCardInfoNetworkMerchantResponse.C);
    }

    public int hashCode() {
        return (((((this.f33136z.hashCode() * 31) + this.f33134A.hashCode()) * 31) + this.f33135B.hashCode()) * 31) + this.C.hashCode();
    }

    public String toString() {
        String str = this.f33136z;
        String str2 = this.f33134A;
        Card card = this.f33135B;
        Check check = this.C;
        return "CreditCardInfoNetworkMerchantResponse(tokenType=" + str + ", token=" + str2 + ", card=" + card + ", check=" + check + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        Intrinsics.i(parcel, "dest");
        parcel.writeString(this.f33136z);
        parcel.writeString(this.f33134A);
        this.f33135B.writeToParcel(parcel, i2);
        this.C.writeToParcel(parcel, i2);
    }

    public CreditCardInfoNetworkMerchantResponse(String str, String str2, Card card, Check check) {
        Intrinsics.i(str, "tokenType");
        Intrinsics.i(str2, "token");
        Intrinsics.i(card, "card");
        Intrinsics.i(check, "check");
        this.f33136z = str;
        this.f33134A = str2;
        this.f33135B = card;
        this.C = check;
    }
}
