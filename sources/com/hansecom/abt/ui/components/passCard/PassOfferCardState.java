package com.hansecom.abt.ui.components.passCard;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PassOfferCardState implements Parcelable {
    public static final Parcelable.Creator<PassOfferCardState> CREATOR = new Creator();

    /* renamed from: A  reason: collision with root package name */
    public final String f38634A;

    /* renamed from: B  reason: collision with root package name */
    public final String f38635B;
    public final String C;
    public final BigDecimal D;
    public final String E;
    public final boolean F;
    public final int G;
    public final int H;
    public final int I;

    /* renamed from: z  reason: collision with root package name */
    public final int f38636z;

    @Metadata
    public static final class Creator implements Parcelable.Creator<PassOfferCardState> {
        /* renamed from: a */
        public final PassOfferCardState createFromParcel(Parcel parcel) {
            Intrinsics.i(parcel, "parcel");
            return new PassOfferCardState(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* renamed from: b */
        public final PassOfferCardState[] newArray(int i2) {
            return new PassOfferCardState[i2];
        }
    }

    public PassOfferCardState(int i2, String str, String str2, String str3, BigDecimal bigDecimal, String str4, boolean z2, int i3, int i4, int i5) {
        Intrinsics.i(str, "name");
        Intrinsics.i(str2, "description");
        Intrinsics.i(bigDecimal, "pricePerPerson");
        Intrinsics.i(str4, "offerRef");
        this.f38636z = i2;
        this.f38634A = str;
        this.f38635B = str2;
        this.C = str3;
        this.D = bigDecimal;
        this.E = str4;
        this.F = z2;
        this.G = i3;
        this.H = i4;
        this.I = i5;
    }

    public static /* synthetic */ PassOfferCardState b(PassOfferCardState passOfferCardState, int i2, String str, String str2, String str3, BigDecimal bigDecimal, String str4, boolean z2, int i3, int i4, int i5, int i6, Object obj) {
        PassOfferCardState passOfferCardState2 = passOfferCardState;
        int i7 = i6;
        return passOfferCardState.a((i7 & 1) != 0 ? passOfferCardState2.f38636z : i2, (i7 & 2) != 0 ? passOfferCardState2.f38634A : str, (i7 & 4) != 0 ? passOfferCardState2.f38635B : str2, (i7 & 8) != 0 ? passOfferCardState2.C : str3, (i7 & 16) != 0 ? passOfferCardState2.D : bigDecimal, (i7 & 32) != 0 ? passOfferCardState2.E : str4, (i7 & 64) != 0 ? passOfferCardState2.F : z2, (i7 & 128) != 0 ? passOfferCardState2.G : i3, (i7 & 256) != 0 ? passOfferCardState2.H : i4, (i7 & 512) != 0 ? passOfferCardState2.I : i5);
    }

    public final PassOfferCardState a(int i2, String str, String str2, String str3, BigDecimal bigDecimal, String str4, boolean z2, int i3, int i4, int i5) {
        Intrinsics.i(str, "name");
        Intrinsics.i(str2, "description");
        BigDecimal bigDecimal2 = bigDecimal;
        Intrinsics.i(bigDecimal2, "pricePerPerson");
        String str5 = str4;
        Intrinsics.i(str5, "offerRef");
        return new PassOfferCardState(i2, str, str2, str3, bigDecimal2, str5, z2, i3, i4, i5);
    }

    public final String c() {
        return this.f38635B;
    }

    public final int d() {
        return this.G;
    }

    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.f38636z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassOfferCardState)) {
            return false;
        }
        PassOfferCardState passOfferCardState = (PassOfferCardState) obj;
        return this.f38636z == passOfferCardState.f38636z && Intrinsics.d(this.f38634A, passOfferCardState.f38634A) && Intrinsics.d(this.f38635B, passOfferCardState.f38635B) && Intrinsics.d(this.C, passOfferCardState.C) && Intrinsics.d(this.D, passOfferCardState.D) && Intrinsics.d(this.E, passOfferCardState.E) && this.F == passOfferCardState.F && this.G == passOfferCardState.G && this.H == passOfferCardState.H && this.I == passOfferCardState.I;
    }

    public final int f() {
        return this.I;
    }

    public final int g() {
        return this.H;
    }

    public final String h() {
        return this.f38634A;
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.f38636z) * 31) + this.f38634A.hashCode()) * 31) + this.f38635B.hashCode()) * 31;
        String str = this.C;
        return ((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.D.hashCode()) * 31) + this.E.hashCode()) * 31) + Boolean.hashCode(this.F)) * 31) + Integer.hashCode(this.G)) * 31) + Integer.hashCode(this.H)) * 31) + Integer.hashCode(this.I);
    }

    public final String i() {
        return this.E;
    }

    public final BigDecimal j() {
        BigDecimal bigDecimal = this.D;
        BigDecimal valueOf = BigDecimal.valueOf((long) this.G);
        Intrinsics.h(valueOf, "valueOf(...)");
        BigDecimal multiply = bigDecimal.multiply(valueOf);
        Intrinsics.h(multiply, "multiply(...)");
        return multiply;
    }

    public final String k() {
        return this.C;
    }

    public final boolean l() {
        return Intrinsics.d(this.D, BigDecimal.ZERO);
    }

    public final boolean n() {
        return this.F;
    }

    public String toString() {
        int i2 = this.f38636z;
        String str = this.f38634A;
        String str2 = this.f38635B;
        String str3 = this.C;
        BigDecimal bigDecimal = this.D;
        String str4 = this.E;
        boolean z2 = this.F;
        int i3 = this.G;
        int i4 = this.H;
        int i5 = this.I;
        return "PassOfferCardState(id=" + i2 + ", name=" + str + ", description=" + str2 + ", validityDescription=" + str3 + ", pricePerPerson=" + bigDecimal + ", offerRef=" + str4 + ", isGroupPass=" + z2 + ", groupSize=" + i3 + ", minGroupSize=" + i4 + ", maxGroupSize=" + i5 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        Intrinsics.i(parcel, "dest");
        parcel.writeInt(this.f38636z);
        parcel.writeString(this.f38634A);
        parcel.writeString(this.f38635B);
        parcel.writeString(this.C);
        parcel.writeSerializable(this.D);
        parcel.writeString(this.E);
        parcel.writeInt(this.F ? 1 : 0);
        parcel.writeInt(this.G);
        parcel.writeInt(this.H);
        parcel.writeInt(this.I);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PassOfferCardState(int r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.math.BigDecimal r18, java.lang.String r19, boolean r20, int r21, int r22, int r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
            r13 = this;
            r0 = r24
            r1 = r0 & 32
            if (r1 == 0) goto L_0x000a
            java.lang.String r1 = ""
            r8 = r1
            goto L_0x000c
        L_0x000a:
            r8 = r19
        L_0x000c:
            r1 = r0 & 64
            r2 = 0
            if (r1 == 0) goto L_0x0013
            r9 = r2
            goto L_0x0015
        L_0x0013:
            r9 = r20
        L_0x0015:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x001c
            r1 = 1
            r10 = r1
            goto L_0x001e
        L_0x001c:
            r10 = r21
        L_0x001e:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0024
            r11 = r2
            goto L_0x0026
        L_0x0024:
            r11 = r22
        L_0x0026:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x002c
            r12 = r2
            goto L_0x002e
        L_0x002c:
            r12 = r23
        L_0x002e:
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.passCard.PassOfferCardState.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.math.BigDecimal, java.lang.String, boolean, int, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
