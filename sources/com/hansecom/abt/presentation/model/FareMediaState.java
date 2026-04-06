package com.hansecom.abt.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.hansecom.abt.util.formatters.CardNumberValueFormater;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class FareMediaState implements Parcelable {
    public static final Parcelable.Creator<FareMediaState> CREATOR = new Creator();

    /* renamed from: A  reason: collision with root package name */
    public final String f34169A;

    /* renamed from: B  reason: collision with root package name */
    public final BigDecimal f34170B;
    public final String C;
    public final String D;
    public final Boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;

    /* renamed from: z  reason: collision with root package name */
    public final String f34171z;

    @Metadata
    public static final class Creator implements Parcelable.Creator<FareMediaState> {
        /* renamed from: a */
        public final FareMediaState createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Intrinsics.i(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new FareMediaState(readString, readString2, bigDecimal, readString3, readString4, valueOf, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final FareMediaState[] newArray(int i2) {
            return new FareMediaState[i2];
        }
    }

    public FareMediaState(String str, String str2, BigDecimal bigDecimal, String str3, String str4, Boolean bool, boolean z2, boolean z3, boolean z4) {
        Intrinsics.i(str, "id");
        Intrinsics.i(str2, "nickname");
        Intrinsics.i(bigDecimal, "balance");
        Intrinsics.i(str3, "cardNumber");
        Intrinsics.i(str4, "riderType");
        this.f34171z = str;
        this.f34169A = str2;
        this.f34170B = bigDecimal;
        this.C = str3;
        this.D = str4;
        this.E = bool;
        this.F = z2;
        this.G = z3;
        this.H = z4;
    }

    public final String a() {
        String str = this.f34169A;
        return str.length() == 0 ? CardNumberValueFormater.f39044a.a(this.f34171z) : str;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FareMediaState)) {
            return false;
        }
        FareMediaState fareMediaState = (FareMediaState) obj;
        return Intrinsics.d(this.f34171z, fareMediaState.f34171z) && Intrinsics.d(this.f34169A, fareMediaState.f34169A) && Intrinsics.d(this.f34170B, fareMediaState.f34170B) && Intrinsics.d(this.C, fareMediaState.C) && Intrinsics.d(this.D, fareMediaState.D) && Intrinsics.d(this.E, fareMediaState.E) && this.F == fareMediaState.F && this.G == fareMediaState.G && this.H == fareMediaState.H;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f34171z.hashCode() * 31) + this.f34169A.hashCode()) * 31) + this.f34170B.hashCode()) * 31) + this.C.hashCode()) * 31) + this.D.hashCode()) * 31;
        Boolean bool = this.E;
        return ((((((hashCode + (bool == null ? 0 : bool.hashCode())) * 31) + Boolean.hashCode(this.F)) * 31) + Boolean.hashCode(this.G)) * 31) + Boolean.hashCode(this.H);
    }

    public final String m() {
        return this.f34171z;
    }

    public String toString() {
        String str = this.f34171z;
        String str2 = this.f34169A;
        BigDecimal bigDecimal = this.f34170B;
        String str3 = this.C;
        String str4 = this.D;
        Boolean bool = this.E;
        boolean z2 = this.F;
        boolean z3 = this.G;
        boolean z4 = this.H;
        return "FareMediaState(id=" + str + ", nickname=" + str2 + ", balance=" + bigDecimal + ", cardNumber=" + str3 + ", riderType=" + str4 + ", autoRenew=" + bool + ", isVirtual=" + z2 + ", isLocked=" + z3 + ", isOnOtherDevice=" + z4 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        boolean booleanValue;
        Intrinsics.i(parcel, "dest");
        parcel.writeString(this.f34171z);
        parcel.writeString(this.f34169A);
        parcel.writeSerializable(this.f34170B);
        parcel.writeString(this.C);
        parcel.writeString(this.D);
        Boolean bool = this.E;
        if (bool == null) {
            booleanValue = false;
        } else {
            parcel.writeInt(1);
            booleanValue = bool.booleanValue();
        }
        parcel.writeInt(booleanValue ? 1 : 0);
        parcel.writeInt(this.F ? 1 : 0);
        parcel.writeInt(this.G ? 1 : 0);
        parcel.writeInt(this.H ? 1 : 0);
    }
}
