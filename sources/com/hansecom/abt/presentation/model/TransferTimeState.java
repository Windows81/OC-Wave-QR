package com.hansecom.abt.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TransferTimeState implements Parcelable {
    public static final Parcelable.Creator<TransferTimeState> CREATOR = new Creator();

    /* renamed from: A  reason: collision with root package name */
    public final boolean f34188A;

    /* renamed from: B  reason: collision with root package name */
    public final boolean f34189B;

    /* renamed from: z  reason: collision with root package name */
    public final int f34190z;

    @Metadata
    public static final class Creator implements Parcelable.Creator<TransferTimeState> {
        /* renamed from: a */
        public final TransferTimeState createFromParcel(Parcel parcel) {
            Intrinsics.i(parcel, "parcel");
            int readInt = parcel.readInt();
            boolean z2 = false;
            boolean z3 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z2 = true;
            }
            return new TransferTimeState(readInt, z3, z2);
        }

        /* renamed from: b */
        public final TransferTimeState[] newArray(int i2) {
            return new TransferTimeState[i2];
        }
    }

    public TransferTimeState(int i2, boolean z2, boolean z3) {
        this.f34190z = i2;
        this.f34188A = z2;
        this.f34189B = z3;
    }

    public final int a() {
        return this.f34190z;
    }

    public final boolean b() {
        return this.f34188A;
    }

    public final boolean c() {
        return this.f34189B;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferTimeState)) {
            return false;
        }
        TransferTimeState transferTimeState = (TransferTimeState) obj;
        return this.f34190z == transferTimeState.f34190z && this.f34188A == transferTimeState.f34188A && this.f34189B == transferTimeState.f34189B;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f34190z) * 31) + Boolean.hashCode(this.f34188A)) * 31) + Boolean.hashCode(this.f34189B);
    }

    public String toString() {
        int i2 = this.f34190z;
        boolean z2 = this.f34188A;
        boolean z3 = this.f34189B;
        return "TransferTimeState(minutesLeft=" + i2 + ", isActive=" + z2 + ", isExceeding=" + z3 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        Intrinsics.i(parcel, "dest");
        parcel.writeInt(this.f34190z);
        parcel.writeInt(this.f34188A ? 1 : 0);
        parcel.writeInt(this.f34189B ? 1 : 0);
    }
}
