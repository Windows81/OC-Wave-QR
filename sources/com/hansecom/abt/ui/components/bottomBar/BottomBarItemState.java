package com.hansecom.abt.ui.components.bottomBar;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class BottomBarItemState implements Parcelable {
    public static final Parcelable.Creator<BottomBarItemState> CREATOR = new Creator();

    /* renamed from: A  reason: collision with root package name */
    public final int f37988A;

    /* renamed from: B  reason: collision with root package name */
    public final int f37989B;
    public final String C;

    /* renamed from: z  reason: collision with root package name */
    public final int f37990z;

    @Metadata
    public static final class Creator implements Parcelable.Creator<BottomBarItemState> {
        /* renamed from: a */
        public final BottomBarItemState createFromParcel(Parcel parcel) {
            Intrinsics.i(parcel, "parcel");
            return new BottomBarItemState(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        /* renamed from: b */
        public final BottomBarItemState[] newArray(int i2) {
            return new BottomBarItemState[i2];
        }
    }

    public BottomBarItemState(int i2, int i3, int i4, String str) {
        Intrinsics.i(str, "testTag");
        this.f37990z = i2;
        this.f37988A = i3;
        this.f37989B = i4;
        this.C = str;
    }

    public final String E() {
        return this.C;
    }

    public final int a() {
        return this.f37988A;
    }

    public final int b() {
        return this.f37990z;
    }

    public final int c() {
        return this.f37989B;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomBarItemState)) {
            return false;
        }
        BottomBarItemState bottomBarItemState = (BottomBarItemState) obj;
        return this.f37990z == bottomBarItemState.f37990z && this.f37988A == bottomBarItemState.f37988A && this.f37989B == bottomBarItemState.f37989B && Intrinsics.d(this.C, bottomBarItemState.C);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f37990z) * 31) + Integer.hashCode(this.f37988A)) * 31) + Integer.hashCode(this.f37989B)) * 31) + this.C.hashCode();
    }

    public String toString() {
        int i2 = this.f37990z;
        int i3 = this.f37988A;
        int i4 = this.f37989B;
        String str = this.C;
        return "BottomBarItemState(id=" + i2 + ", icon=" + i3 + ", label=" + i4 + ", testTag=" + str + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        Intrinsics.i(parcel, "dest");
        parcel.writeInt(this.f37990z);
        parcel.writeInt(this.f37988A);
        parcel.writeInt(this.f37989B);
        parcel.writeString(this.C);
    }
}
