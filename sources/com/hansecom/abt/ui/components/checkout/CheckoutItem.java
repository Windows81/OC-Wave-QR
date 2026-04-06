package com.hansecom.abt.ui.components.checkout;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CheckoutItem implements Parcelable {
    public static final Parcelable.Creator<CheckoutItem> CREATOR = new Creator();

    /* renamed from: A  reason: collision with root package name */
    public final BigDecimal f38081A;

    /* renamed from: z  reason: collision with root package name */
    public final String f38082z;

    @Metadata
    public static final class Creator implements Parcelable.Creator<CheckoutItem> {
        /* renamed from: a */
        public final CheckoutItem createFromParcel(Parcel parcel) {
            Intrinsics.i(parcel, "parcel");
            return new CheckoutItem(parcel.readString(), (BigDecimal) parcel.readSerializable());
        }

        /* renamed from: b */
        public final CheckoutItem[] newArray(int i2) {
            return new CheckoutItem[i2];
        }
    }

    public CheckoutItem(String str, BigDecimal bigDecimal) {
        Intrinsics.i(str, "label");
        Intrinsics.i(bigDecimal, "amount");
        this.f38082z = str;
        this.f38081A = bigDecimal;
    }

    public final BigDecimal a() {
        return this.f38081A;
    }

    public final String b() {
        return this.f38082z;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutItem)) {
            return false;
        }
        CheckoutItem checkoutItem = (CheckoutItem) obj;
        return Intrinsics.d(this.f38082z, checkoutItem.f38082z) && Intrinsics.d(this.f38081A, checkoutItem.f38081A);
    }

    public int hashCode() {
        return (this.f38082z.hashCode() * 31) + this.f38081A.hashCode();
    }

    public String toString() {
        String str = this.f38082z;
        BigDecimal bigDecimal = this.f38081A;
        return "CheckoutItem(label=" + str + ", amount=" + bigDecimal + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        Intrinsics.i(parcel, "dest");
        parcel.writeString(this.f38082z);
        parcel.writeSerializable(this.f38081A);
    }
}
