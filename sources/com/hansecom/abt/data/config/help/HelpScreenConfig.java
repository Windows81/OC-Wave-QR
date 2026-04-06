package com.hansecom.abt.data.config.help;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class HelpScreenConfig implements Parcelable {
    public static final Parcelable.Creator<HelpScreenConfig> CREATOR = new Creator();

    /* renamed from: A  reason: collision with root package name */
    public final Boolean f33199A;

    /* renamed from: B  reason: collision with root package name */
    public final Boolean f33200B;
    public final Boolean C;
    public final Boolean D;
    public final Boolean E;
    public final Boolean F;
    public final Boolean G;
    public final Boolean H;

    /* renamed from: z  reason: collision with root package name */
    public final Boolean f33201z;

    @Metadata
    public static final class Creator implements Parcelable.Creator<HelpScreenConfig> {
        /* renamed from: a */
        public final HelpScreenConfig createFromParcel(Parcel parcel) {
            Boolean bool;
            Boolean bool2;
            Boolean bool3;
            Boolean bool4;
            Boolean bool5;
            Boolean bool6;
            Boolean bool7;
            Boolean bool8;
            Boolean bool9;
            Intrinsics.i(parcel, "parcel");
            boolean z2 = false;
            if (parcel.readInt() == 0) {
                bool = null;
            } else {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                bool2 = null;
            } else {
                bool2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                bool3 = null;
            } else {
                bool3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                bool4 = null;
            } else {
                bool4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                bool5 = null;
            } else {
                bool5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                bool6 = null;
            } else {
                bool6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                bool7 = null;
            } else {
                bool7 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                bool8 = null;
            } else {
                bool8 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                bool9 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                bool9 = Boolean.valueOf(z2);
            }
            return new HelpScreenConfig(bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9);
        }

        /* renamed from: b */
        public final HelpScreenConfig[] newArray(int i2) {
            return new HelpScreenConfig[i2];
        }
    }

    public HelpScreenConfig(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9) {
        this.f33201z = bool;
        this.f33199A = bool2;
        this.f33200B = bool3;
        this.C = bool4;
        this.D = bool5;
        this.E = bool6;
        this.F = bool7;
        this.G = bool8;
        this.H = bool9;
    }

    public final Boolean a() {
        return this.D;
    }

    public final Boolean b() {
        return this.G;
    }

    public final Boolean c() {
        return this.F;
    }

    public final Boolean d() {
        return this.H;
    }

    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.f33199A;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HelpScreenConfig)) {
            return false;
        }
        HelpScreenConfig helpScreenConfig = (HelpScreenConfig) obj;
        return Intrinsics.d(this.f33201z, helpScreenConfig.f33201z) && Intrinsics.d(this.f33199A, helpScreenConfig.f33199A) && Intrinsics.d(this.f33200B, helpScreenConfig.f33200B) && Intrinsics.d(this.C, helpScreenConfig.C) && Intrinsics.d(this.D, helpScreenConfig.D) && Intrinsics.d(this.E, helpScreenConfig.E) && Intrinsics.d(this.F, helpScreenConfig.F) && Intrinsics.d(this.G, helpScreenConfig.G) && Intrinsics.d(this.H, helpScreenConfig.H);
    }

    public final Boolean f() {
        return this.E;
    }

    public final Boolean g() {
        return this.f33201z;
    }

    public final Boolean h() {
        return this.f33200B;
    }

    public int hashCode() {
        Boolean bool = this.f33201z;
        int i2 = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f33199A;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f33200B;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.C;
        int hashCode4 = (hashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.D;
        int hashCode5 = (hashCode4 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.E;
        int hashCode6 = (hashCode5 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.F;
        int hashCode7 = (hashCode6 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.G;
        int hashCode8 = (hashCode7 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.H;
        if (bool9 != null) {
            i2 = bool9.hashCode();
        }
        return hashCode8 + i2;
    }

    public final Boolean i() {
        return this.C;
    }

    public String toString() {
        Boolean bool = this.f33201z;
        Boolean bool2 = this.f33199A;
        Boolean bool3 = this.f33200B;
        Boolean bool4 = this.C;
        Boolean bool5 = this.D;
        Boolean bool6 = this.E;
        Boolean bool7 = this.F;
        Boolean bool8 = this.G;
        Boolean bool9 = this.H;
        return "HelpScreenConfig(email=" + bool + ", contactName=" + bool2 + ", phoneNumber=" + bool3 + ", subject=" + bool4 + ", cardNumber=" + bool5 + ", description=" + bool6 + ", caseReason=" + bool7 + ", caseCategory=" + bool8 + ", caseResolution=" + bool9 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        Intrinsics.i(parcel, "dest");
        Boolean bool = this.f33201z;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.f33199A;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.f33200B;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Boolean bool4 = this.C;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        Boolean bool5 = this.D;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        Boolean bool6 = this.E;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool6.booleanValue() ? 1 : 0);
        }
        Boolean bool7 = this.F;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool7.booleanValue() ? 1 : 0);
        }
        Boolean bool8 = this.G;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool8.booleanValue() ? 1 : 0);
        }
        Boolean bool9 = this.H;
        if (bool9 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(bool9.booleanValue() ? 1 : 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ HelpScreenConfig(java.lang.Boolean r11, java.lang.Boolean r12, java.lang.Boolean r13, java.lang.Boolean r14, java.lang.Boolean r15, java.lang.Boolean r16, java.lang.Boolean r17, java.lang.Boolean r18, java.lang.Boolean r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r10 = this;
            r0 = r20
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r11
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r12
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r13
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r14
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0026
        L_0x0025:
            r6 = r15
        L_0x0026:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002c
            r7 = r2
            goto L_0x002e
        L_0x002c:
            r7 = r16
        L_0x002e:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0034
            r8 = r2
            goto L_0x0036
        L_0x0034:
            r8 = r17
        L_0x0036:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003c
            r9 = r2
            goto L_0x003e
        L_0x003c:
            r9 = r18
        L_0x003e:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r2 = r19
        L_0x0045:
            r11 = r10
            r12 = r1
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r9
            r20 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.config.help.HelpScreenConfig.<init>(java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
