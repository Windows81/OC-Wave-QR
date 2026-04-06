package com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance;

import android.os.Parcel;
import android.os.Parcelable;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public interface CheckFareMediaBalance {

    @Metadata
    public interface Action {

        @Metadata
        public static final class CardNumberChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f34710a;

            public CardNumberChange(String str) {
                Intrinsics.i(str, "value");
                this.f34710a = str;
            }

            public final String a() {
                return this.f34710a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CardNumberChange) && Intrinsics.d(this.f34710a, ((CardNumberChange) obj).f34710a);
            }

            public int hashCode() {
                return this.f34710a.hashCode();
            }

            public String toString() {
                String str = this.f34710a;
                return "CardNumberChange(value=" + str + ")";
            }
        }

        @Metadata
        public static final class CodeChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f34711a;

            public CodeChange(String str) {
                Intrinsics.i(str, "value");
                this.f34711a = str;
            }

            public final String a() {
                return this.f34711a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CodeChange) && Intrinsics.d(this.f34711a, ((CodeChange) obj).f34711a);
            }

            public int hashCode() {
                return this.f34711a.hashCode();
            }

            public String toString() {
                String str = this.f34711a;
                return "CodeChange(value=" + str + ")";
            }
        }

        @Metadata
        public static final class Confirm implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final Confirm f34712a = new Confirm();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Confirm);
            }

            public int hashCode() {
                return -269720841;
            }

            public String toString() {
                return "Confirm";
            }
        }
    }

    @Metadata
    public interface Effect {

        @Metadata
        public static final class Error implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final StringValue f34713a;

            public Error(StringValue stringValue) {
                Intrinsics.i(stringValue, "message");
                this.f34713a = stringValue;
            }

            public final StringValue a() {
                return this.f34713a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.d(this.f34713a, ((Error) obj).f34713a);
            }

            public int hashCode() {
                return this.f34713a.hashCode();
            }

            public String toString() {
                StringValue stringValue = this.f34713a;
                return "Error(message=" + stringValue + ")";
            }
        }
    }

    @Metadata
    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new Creator();

        /* renamed from: A  reason: collision with root package name */
        public final StringValue f34714A;

        /* renamed from: B  reason: collision with root package name */
        public final int f34715B;
        public final String C;
        public final StringValue D;
        public final boolean E;
        public final String F;
        public final String G;

        /* renamed from: z  reason: collision with root package name */
        public final String f34716z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<State> {
            /* renamed from: a */
            public final State createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                Class<State> cls = State.class;
                return new State(parcel.readString(), (StringValue) parcel.readParcelable(cls.getClassLoader()), parcel.readInt(), parcel.readString(), (StringValue) parcel.readParcelable(cls.getClassLoader()), parcel.readInt() != 0, parcel.readString(), parcel.readString());
            }

            /* renamed from: b */
            public final State[] newArray(int i2) {
                return new State[i2];
            }
        }

        public State(String str, StringValue stringValue, int i2, String str2, StringValue stringValue2, boolean z2, String str3, String str4) {
            Intrinsics.i(str, "cardNumber");
            Intrinsics.i(stringValue, "cardNumberError");
            Intrinsics.i(str2, "securityCode");
            Intrinsics.i(stringValue2, "securityCodeError");
            Intrinsics.i(str3, "resultCardNumber");
            Intrinsics.i(str4, "resultCardBalance");
            this.f34716z = str;
            this.f34714A = stringValue;
            this.f34715B = i2;
            this.C = str2;
            this.D = stringValue2;
            this.E = z2;
            this.F = str3;
            this.G = str4;
        }

        public static /* synthetic */ State b(State state, String str, StringValue stringValue, int i2, String str2, StringValue stringValue2, boolean z2, String str3, String str4, int i3, Object obj) {
            State state2 = state;
            int i4 = i3;
            return state.a((i4 & 1) != 0 ? state2.f34716z : str, (i4 & 2) != 0 ? state2.f34714A : stringValue, (i4 & 4) != 0 ? state2.f34715B : i2, (i4 & 8) != 0 ? state2.C : str2, (i4 & 16) != 0 ? state2.D : stringValue2, (i4 & 32) != 0 ? state2.E : z2, (i4 & 64) != 0 ? state2.F : str3, (i4 & 128) != 0 ? state2.G : str4);
        }

        public final State a(String str, StringValue stringValue, int i2, String str2, StringValue stringValue2, boolean z2, String str3, String str4) {
            Intrinsics.i(str, "cardNumber");
            Intrinsics.i(stringValue, "cardNumberError");
            Intrinsics.i(str2, "securityCode");
            Intrinsics.i(stringValue2, "securityCodeError");
            String str5 = str3;
            Intrinsics.i(str5, "resultCardNumber");
            String str6 = str4;
            Intrinsics.i(str6, "resultCardBalance");
            return new State(str, stringValue, i2, str2, stringValue2, z2, str5, str6);
        }

        public final String c() {
            return this.f34716z;
        }

        public final StringValue d() {
            return this.f34714A;
        }

        public final int describeContents() {
            return 0;
        }

        public final int e() {
            return this.f34715B;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return Intrinsics.d(this.f34716z, state.f34716z) && Intrinsics.d(this.f34714A, state.f34714A) && this.f34715B == state.f34715B && Intrinsics.d(this.C, state.C) && Intrinsics.d(this.D, state.D) && this.E == state.E && Intrinsics.d(this.F, state.F) && Intrinsics.d(this.G, state.G);
        }

        public final String f() {
            return this.G;
        }

        public final String g() {
            return this.F;
        }

        public final String h() {
            return this.C;
        }

        public int hashCode() {
            return (((((((((((((this.f34716z.hashCode() * 31) + this.f34714A.hashCode()) * 31) + Integer.hashCode(this.f34715B)) * 31) + this.C.hashCode()) * 31) + this.D.hashCode()) * 31) + Boolean.hashCode(this.E)) * 31) + this.F.hashCode()) * 31) + this.G.hashCode();
        }

        public final StringValue i() {
            return this.D;
        }

        public final boolean j() {
            return this.E;
        }

        public String toString() {
            String str = this.f34716z;
            StringValue stringValue = this.f34714A;
            int i2 = this.f34715B;
            String str2 = this.C;
            StringValue stringValue2 = this.D;
            boolean z2 = this.E;
            String str3 = this.F;
            String str4 = this.G;
            return "State(cardNumber=" + str + ", cardNumberError=" + stringValue + ", cardNumberLength=" + i2 + ", securityCode=" + str2 + ", securityCodeError=" + stringValue2 + ", isLoading=" + z2 + ", resultCardNumber=" + str3 + ", resultCardBalance=" + str4 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeString(this.f34716z);
            parcel.writeParcelable(this.f34714A, i2);
            parcel.writeInt(this.f34715B);
            parcel.writeString(this.C);
            parcel.writeParcelable(this.D, i2);
            parcel.writeInt(this.E ? 1 : 0);
            parcel.writeString(this.F);
            parcel.writeString(this.G);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ State(java.lang.String r10, com.hansecom.abt.util.resourcesResolvers.StringValue r11, int r12, java.lang.String r13, com.hansecom.abt.util.resourcesResolvers.StringValue r14, boolean r15, java.lang.String r16, java.lang.String r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
            /*
                r9 = this;
                r0 = r18
                r1 = r0 & 1
                java.lang.String r2 = ""
                if (r1 == 0) goto L_0x000a
                r1 = r2
                goto L_0x000b
            L_0x000a:
                r1 = r10
            L_0x000b:
                r3 = r0 & 2
                if (r3 == 0) goto L_0x0016
                com.hansecom.abt.util.resourcesResolvers.StringValue$Companion r3 = com.hansecom.abt.util.resourcesResolvers.StringValue.Companion
                com.hansecom.abt.util.resourcesResolvers.StringValue r3 = r3.a()
                goto L_0x0017
            L_0x0016:
                r3 = r11
            L_0x0017:
                r4 = r0 & 4
                if (r4 == 0) goto L_0x001e
                r4 = 20
                goto L_0x001f
            L_0x001e:
                r4 = r12
            L_0x001f:
                r5 = r0 & 8
                if (r5 == 0) goto L_0x0025
                r5 = r2
                goto L_0x0026
            L_0x0025:
                r5 = r13
            L_0x0026:
                r6 = r0 & 16
                if (r6 == 0) goto L_0x0031
                com.hansecom.abt.util.resourcesResolvers.StringValue$Companion r6 = com.hansecom.abt.util.resourcesResolvers.StringValue.Companion
                com.hansecom.abt.util.resourcesResolvers.StringValue r6 = r6.a()
                goto L_0x0032
            L_0x0031:
                r6 = r14
            L_0x0032:
                r7 = r0 & 32
                if (r7 == 0) goto L_0x0038
                r7 = 0
                goto L_0x0039
            L_0x0038:
                r7 = r15
            L_0x0039:
                r8 = r0 & 64
                if (r8 == 0) goto L_0x003f
                r8 = r2
                goto L_0x0041
            L_0x003f:
                r8 = r16
            L_0x0041:
                r0 = r0 & 128(0x80, float:1.794E-43)
                if (r0 == 0) goto L_0x0046
                goto L_0x0048
            L_0x0046:
                r2 = r17
            L_0x0048:
                r10 = r9
                r11 = r1
                r12 = r3
                r13 = r4
                r14 = r5
                r15 = r6
                r16 = r7
                r17 = r8
                r18 = r2
                r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalance.State.<init>(java.lang.String, com.hansecom.abt.util.resourcesResolvers.StringValue, int, java.lang.String, com.hansecom.abt.util.resourcesResolvers.StringValue, boolean, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
