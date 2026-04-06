package com.hansecom.abt.ui.components.passCard;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PassCardState implements Parcelable {
    public static final Parcelable.Creator<PassCardState> CREATOR = new Creator();

    /* renamed from: A  reason: collision with root package name */
    public final String f38622A;

    /* renamed from: B  reason: collision with root package name */
    public final boolean f38623B;
    public final boolean C;
    public final boolean D;
    public final int E;
    public final LocalDateTime F;
    public final LocalDateTime G;

    /* renamed from: z  reason: collision with root package name */
    public final long f38624z;

    @Metadata
    public static final class Creator implements Parcelable.Creator<PassCardState> {
        /* renamed from: a */
        public final PassCardState createFromParcel(Parcel parcel) {
            Intrinsics.i(parcel, "parcel");
            return new PassCardState(parcel.readLong(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), (LocalDateTime) parcel.readSerializable(), (LocalDateTime) parcel.readSerializable());
        }

        /* renamed from: b */
        public final PassCardState[] newArray(int i2) {
            return new PassCardState[i2];
        }
    }

    public PassCardState(long j2, String str, boolean z2, boolean z3, boolean z4, int i2, LocalDateTime localDateTime, LocalDateTime localDateTime2) {
        Intrinsics.i(str, "title");
        this.f38624z = j2;
        this.f38622A = str;
        this.f38623B = z2;
        this.C = z3;
        this.D = z4;
        this.E = i2;
        this.F = localDateTime;
        this.G = localDateTime2;
    }

    public static /* synthetic */ PassCardState b(PassCardState passCardState, long j2, String str, boolean z2, boolean z3, boolean z4, int i2, LocalDateTime localDateTime, LocalDateTime localDateTime2, int i3, Object obj) {
        PassCardState passCardState2 = passCardState;
        int i4 = i3;
        return passCardState.a((i4 & 1) != 0 ? passCardState2.f38624z : j2, (i4 & 2) != 0 ? passCardState2.f38622A : str, (i4 & 4) != 0 ? passCardState2.f38623B : z2, (i4 & 8) != 0 ? passCardState2.C : z3, (i4 & 16) != 0 ? passCardState2.D : z4, (i4 & 32) != 0 ? passCardState2.E : i2, (i4 & 64) != 0 ? passCardState2.F : localDateTime, (i4 & 128) != 0 ? passCardState2.G : localDateTime2);
    }

    public final PassCardState a(long j2, String str, boolean z2, boolean z3, boolean z4, int i2, LocalDateTime localDateTime, LocalDateTime localDateTime2) {
        Intrinsics.i(str, "title");
        return new PassCardState(j2, str, z2, z3, z4, i2, localDateTime, localDateTime2);
    }

    public final LocalDateTime c() {
        return this.F;
    }

    public final int d() {
        return this.E;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.C;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassCardState)) {
            return false;
        }
        PassCardState passCardState = (PassCardState) obj;
        return this.f38624z == passCardState.f38624z && Intrinsics.d(this.f38622A, passCardState.f38622A) && this.f38623B == passCardState.f38623B && this.C == passCardState.C && this.D == passCardState.D && this.E == passCardState.E && Intrinsics.d(this.F, passCardState.F) && Intrinsics.d(this.G, passCardState.G);
    }

    public final long f() {
        return this.f38624z;
    }

    public final String g() {
        return this.f38622A;
    }

    public final LocalDateTime h() {
        return this.G;
    }

    public int hashCode() {
        int hashCode = ((((((((((Long.hashCode(this.f38624z) * 31) + this.f38622A.hashCode()) * 31) + Boolean.hashCode(this.f38623B)) * 31) + Boolean.hashCode(this.C)) * 31) + Boolean.hashCode(this.D)) * 31) + Integer.hashCode(this.E)) * 31;
        LocalDateTime localDateTime = this.F;
        int i2 = 0;
        int hashCode2 = (hashCode + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31;
        LocalDateTime localDateTime2 = this.G;
        if (localDateTime2 != null) {
            i2 = localDateTime2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final boolean i() {
        return this.f38623B;
    }

    public final boolean j() {
        return this.D;
    }

    public String toString() {
        long j2 = this.f38624z;
        String str = this.f38622A;
        boolean z2 = this.f38623B;
        boolean z3 = this.C;
        boolean z4 = this.D;
        int i2 = this.E;
        LocalDateTime localDateTime = this.F;
        LocalDateTime localDateTime2 = this.G;
        return "PassCardState(id=" + j2 + ", title=" + str + ", isActive=" + z2 + ", hasPossibleAutoload=" + z3 + ", isAutoloadOn=" + z4 + ", groupSize=" + i2 + ", activateUntil=" + localDateTime + ", validTo=" + localDateTime2 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        Intrinsics.i(parcel, "dest");
        parcel.writeLong(this.f38624z);
        parcel.writeString(this.f38622A);
        parcel.writeInt(this.f38623B ? 1 : 0);
        parcel.writeInt(this.C ? 1 : 0);
        parcel.writeInt(this.D ? 1 : 0);
        parcel.writeInt(this.E);
        parcel.writeSerializable(this.F);
        parcel.writeSerializable(this.G);
    }
}
