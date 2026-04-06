package com.hansecom.abt.presentation.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class NavigationBarsState implements Parcelable {
    public static final Parcelable.Creator<NavigationBarsState> CREATOR = new Creator();

    /* renamed from: A  reason: collision with root package name */
    public final boolean f34209A;

    /* renamed from: B  reason: collision with root package name */
    public final String f34210B;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f34211z;

    @Metadata
    public static final class Creator implements Parcelable.Creator<NavigationBarsState> {
        /* renamed from: a */
        public final NavigationBarsState createFromParcel(Parcel parcel) {
            Intrinsics.i(parcel, "parcel");
            boolean z2 = false;
            boolean z3 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z2 = true;
            }
            return new NavigationBarsState(z3, z2, parcel.readString());
        }

        /* renamed from: b */
        public final NavigationBarsState[] newArray(int i2) {
            return new NavigationBarsState[i2];
        }
    }

    public NavigationBarsState(boolean z2, boolean z3, String str) {
        this.f34211z = z2;
        this.f34209A = z3;
        this.f34210B = str;
    }

    public final NavigationBarsState a(boolean z2, boolean z3, String str) {
        return new NavigationBarsState(z2, z3, str);
    }

    public final boolean b() {
        return this.f34209A;
    }

    public final boolean c() {
        return this.f34211z;
    }

    public final String d() {
        return this.f34210B;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NavigationBarsState)) {
            return false;
        }
        NavigationBarsState navigationBarsState = (NavigationBarsState) obj;
        return this.f34211z == navigationBarsState.f34211z && this.f34209A == navigationBarsState.f34209A && Intrinsics.d(this.f34210B, navigationBarsState.f34210B);
    }

    public int hashCode() {
        int hashCode = ((Boolean.hashCode(this.f34211z) * 31) + Boolean.hashCode(this.f34209A)) * 31;
        String str = this.f34210B;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        boolean z2 = this.f34211z;
        boolean z3 = this.f34209A;
        String str = this.f34210B;
        return "NavigationBarsState(showTopBar=" + z2 + ", showBottomBar=" + z3 + ", topBarTitle=" + str + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        Intrinsics.i(parcel, "dest");
        parcel.writeInt(this.f34211z ? 1 : 0);
        parcel.writeInt(this.f34209A ? 1 : 0);
        parcel.writeString(this.f34210B);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NavigationBarsState(boolean z2, boolean z3, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z2, (i2 & 2) != 0 ? false : z3, (i2 & 4) != 0 ? null : str);
    }
}
