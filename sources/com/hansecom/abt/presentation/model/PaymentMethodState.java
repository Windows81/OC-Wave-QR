package com.hansecom.abt.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public interface PaymentMethodState extends Parcelable {

    @Metadata
    public static final class Cash implements PaymentMethodState {
        public static final Parcelable.Creator<Cash> CREATOR = new Creator();

        /* renamed from: z  reason: collision with root package name */
        public static final Cash f34177z = new Cash();

        @Metadata
        public static final class Creator implements Parcelable.Creator<Cash> {
            /* renamed from: a */
            public final Cash createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                parcel.readInt();
                return Cash.f34177z;
            }

            /* renamed from: b */
            public final Cash[] newArray(int i2) {
                return new Cash[i2];
            }
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Cash);
        }

        public int hashCode() {
            return 1431847840;
        }

        public String toString() {
            return "Cash";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    @Metadata
    public static final class CreditCard implements PaymentMethodState {
        public static final Parcelable.Creator<CreditCard> CREATOR = new Creator();

        /* renamed from: A  reason: collision with root package name */
        public final String f34178A;

        /* renamed from: B  reason: collision with root package name */
        public final String f34179B;
        public final boolean C;
        public final String D;
        public final boolean E;
        public final String F;

        /* renamed from: z  reason: collision with root package name */
        public final long f34180z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<CreditCard> {
            /* renamed from: a */
            public final CreditCard createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                return new CreditCard(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readString());
            }

            /* renamed from: b */
            public final CreditCard[] newArray(int i2) {
                return new CreditCard[i2];
            }
        }

        public CreditCard(long j2, String str, String str2, boolean z2, String str3, boolean z3, String str4) {
            Intrinsics.i(str3, "expiryDate");
            this.f34180z = j2;
            this.f34178A = str;
            this.f34179B = str2;
            this.C = z2;
            this.D = str3;
            this.E = z3;
            this.F = str4;
        }

        public final String a() {
            return this.F;
        }

        public final String b() {
            return this.D;
        }

        public final long c() {
            return this.f34180z;
        }

        public final String d() {
            return this.f34179B;
        }

        public final int describeContents() {
            return 0;
        }

        public final String e() {
            return this.f34178A;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CreditCard)) {
                return false;
            }
            CreditCard creditCard = (CreditCard) obj;
            return this.f34180z == creditCard.f34180z && Intrinsics.d(this.f34178A, creditCard.f34178A) && Intrinsics.d(this.f34179B, creditCard.f34179B) && this.C == creditCard.C && Intrinsics.d(this.D, creditCard.D) && this.E == creditCard.E && Intrinsics.d(this.F, creditCard.F);
        }

        public final boolean f() {
            return this.C;
        }

        public final boolean g() {
            return this.E;
        }

        public int hashCode() {
            int hashCode = Long.hashCode(this.f34180z) * 31;
            String str = this.f34178A;
            int i2 = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f34179B;
            int hashCode3 = (((((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.C)) * 31) + this.D.hashCode()) * 31) + Boolean.hashCode(this.E)) * 31;
            String str3 = this.F;
            if (str3 != null) {
                i2 = str3.hashCode();
            }
            return hashCode3 + i2;
        }

        public String toString() {
            long j2 = this.f34180z;
            String str = this.f34178A;
            String str2 = this.f34179B;
            boolean z2 = this.C;
            String str3 = this.D;
            boolean z3 = this.E;
            String str4 = this.F;
            return "CreditCard(id=" + j2 + ", nickname=" + str + ", maskedPan=" + str2 + ", isDefault=" + z2 + ", expiryDate=" + str3 + ", isExpired=" + z3 + ", cardImageUrl=" + str4 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeLong(this.f34180z);
            parcel.writeString(this.f34178A);
            parcel.writeString(this.f34179B);
            parcel.writeInt(this.C ? 1 : 0);
            parcel.writeString(this.D);
            parcel.writeInt(this.E ? 1 : 0);
            parcel.writeString(this.F);
        }
    }

    @Metadata
    public static final class FareMedia implements PaymentMethodState {
        public static final Parcelable.Creator<FareMedia> CREATOR = new Creator();
        public static final Companion E = new Companion((DefaultConstructorMarker) null);

        /* renamed from: A  reason: collision with root package name */
        public final StringValue f34181A;

        /* renamed from: B  reason: collision with root package name */
        public final boolean f34182B;
        public final BigDecimal C;
        public final boolean D;

        /* renamed from: z  reason: collision with root package name */
        public final String f34183z;

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }
        }

        @Metadata
        public static final class Creator implements Parcelable.Creator<FareMedia> {
            /* renamed from: a */
            public final FareMedia createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                return new FareMedia(parcel.readString(), (StringValue) parcel.readParcelable(FareMedia.class.getClassLoader()), parcel.readInt() != 0, (BigDecimal) parcel.readSerializable(), parcel.readInt() != 0);
            }

            /* renamed from: b */
            public final FareMedia[] newArray(int i2) {
                return new FareMedia[i2];
            }
        }

        public FareMedia(String str, StringValue stringValue, boolean z2, BigDecimal bigDecimal, boolean z3) {
            Intrinsics.i(str, "id");
            Intrinsics.i(stringValue, "title");
            Intrinsics.i(bigDecimal, "balance");
            this.f34183z = str;
            this.f34181A = stringValue;
            this.f34182B = z2;
            this.C = bigDecimal;
            this.D = z3;
        }

        public final BigDecimal a() {
            return this.C;
        }

        public final StringValue b() {
            return this.f34181A;
        }

        public final boolean c() {
            return this.D;
        }

        public final boolean d() {
            return this.f34182B;
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FareMedia)) {
                return false;
            }
            FareMedia fareMedia = (FareMedia) obj;
            return Intrinsics.d(this.f34183z, fareMedia.f34183z) && Intrinsics.d(this.f34181A, fareMedia.f34181A) && this.f34182B == fareMedia.f34182B && Intrinsics.d(this.C, fareMedia.C) && this.D == fareMedia.D;
        }

        public int hashCode() {
            return (((((((this.f34183z.hashCode() * 31) + this.f34181A.hashCode()) * 31) + Boolean.hashCode(this.f34182B)) * 31) + this.C.hashCode()) * 31) + Boolean.hashCode(this.D);
        }

        public final String m() {
            return this.f34183z;
        }

        public String toString() {
            String str = this.f34183z;
            StringValue stringValue = this.f34181A;
            boolean z2 = this.f34182B;
            BigDecimal bigDecimal = this.C;
            boolean z3 = this.D;
            return "FareMedia(id=" + str + ", title=" + stringValue + ", isOnOtherDevice=" + z2 + ", balance=" + bigDecimal + ", isLocked=" + z3 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeString(this.f34183z);
            parcel.writeParcelable(this.f34181A, i2);
            parcel.writeInt(this.f34182B ? 1 : 0);
            parcel.writeSerializable(this.C);
            parcel.writeInt(this.D ? 1 : 0);
        }
    }

    @Metadata
    public static final class GooglePay implements PaymentMethodState {
        public static final Parcelable.Creator<GooglePay> CREATOR = new Creator();

        /* renamed from: z  reason: collision with root package name */
        public final String f34184z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<GooglePay> {
            /* renamed from: a */
            public final GooglePay createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                return new GooglePay(parcel.readString());
            }

            /* renamed from: b */
            public final GooglePay[] newArray(int i2) {
                return new GooglePay[i2];
            }
        }

        public GooglePay(String str) {
            Intrinsics.i(str, "allowedPaymentMethods");
            this.f34184z = str;
        }

        public final String a() {
            return this.f34184z;
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GooglePay) && Intrinsics.d(this.f34184z, ((GooglePay) obj).f34184z);
        }

        public int hashCode() {
            return this.f34184z.hashCode();
        }

        public String toString() {
            String str = this.f34184z;
            return "GooglePay(allowedPaymentMethods=" + str + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeString(this.f34184z);
        }
    }
}
