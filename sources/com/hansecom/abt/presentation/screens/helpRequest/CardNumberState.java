package com.hansecom.abt.presentation.screens.helpRequest;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CardNumberState implements Parcelable {
    public static final Parcelable.Creator<CardNumberState> CREATOR = new Creator();

    /* renamed from: A  reason: collision with root package name */
    public final String f34797A;

    /* renamed from: B  reason: collision with root package name */
    public final String f34798B;
    public final boolean C;
    public final boolean D;

    /* renamed from: z  reason: collision with root package name */
    public final String f34799z;

    @Metadata
    public static final class Creator implements Parcelable.Creator<CardNumberState> {
        /* renamed from: a */
        public final CardNumberState createFromParcel(Parcel parcel) {
            Intrinsics.i(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            boolean z2 = true;
            boolean z3 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                z2 = false;
            }
            return new CardNumberState(readString, readString2, readString3, z3, z2);
        }

        /* renamed from: b */
        public final CardNumberState[] newArray(int i2) {
            return new CardNumberState[i2];
        }
    }

    public CardNumberState(String str, String str2, String str3, boolean z2, boolean z3) {
        Intrinsics.i(str, "id");
        Intrinsics.i(str2, "nickname");
        Intrinsics.i(str3, "cardNumber");
        this.f34799z = str;
        this.f34797A = str2;
        this.f34798B = str3;
        this.C = z2;
        this.D = z3;
    }

    public final String a() {
        return this.f34798B;
    }

    public final String b() {
        return this.f34797A;
    }

    public final boolean c() {
        return this.D;
    }

    public final boolean d() {
        return this.C;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardNumberState)) {
            return false;
        }
        CardNumberState cardNumberState = (CardNumberState) obj;
        return Intrinsics.d(this.f34799z, cardNumberState.f34799z) && Intrinsics.d(this.f34797A, cardNumberState.f34797A) && Intrinsics.d(this.f34798B, cardNumberState.f34798B) && this.C == cardNumberState.C && this.D == cardNumberState.D;
    }

    public int hashCode() {
        return (((((((this.f34799z.hashCode() * 31) + this.f34797A.hashCode()) * 31) + this.f34798B.hashCode()) * 31) + Boolean.hashCode(this.C)) * 31) + Boolean.hashCode(this.D);
    }

    public final String m() {
        return this.f34799z;
    }

    public String toString() {
        String str = this.f34799z;
        String str2 = this.f34797A;
        String str3 = this.f34798B;
        boolean z2 = this.C;
        boolean z3 = this.D;
        return "CardNumberState(id=" + str + ", nickname=" + str2 + ", cardNumber=" + str3 + ", isVirtual=" + z2 + ", isManual=" + z3 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        Intrinsics.i(parcel, "dest");
        parcel.writeString(this.f34799z);
        parcel.writeString(this.f34797A);
        parcel.writeString(this.f34798B);
        parcel.writeInt(this.C ? 1 : 0);
        parcel.writeInt(this.D ? 1 : 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardNumberState(String str, String str2, String str3, boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, z2, (i2 & 16) != 0 ? false : z3);
    }
}
