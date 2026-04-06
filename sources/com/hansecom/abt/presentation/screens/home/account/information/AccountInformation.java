package com.hansecom.abt.presentation.screens.home.account.information;

import android.os.Parcel;
import android.os.Parcelable;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import com.hansecom.abt.util.resourcesResolvers.StringValueKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public interface AccountInformation {

    @Metadata
    public interface Action {

        @Metadata
        public static final class FirstNameChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f35435a;

            public FirstNameChange(String str) {
                Intrinsics.i(str, "value");
                this.f35435a = str;
            }

            public final String a() {
                return this.f35435a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FirstNameChange) && Intrinsics.d(this.f35435a, ((FirstNameChange) obj).f35435a);
            }

            public int hashCode() {
                return this.f35435a.hashCode();
            }

            public String toString() {
                String str = this.f35435a;
                return "FirstNameChange(value=" + str + ")";
            }
        }

        @Metadata
        public static final class LastNameChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f35436a;

            public LastNameChange(String str) {
                Intrinsics.i(str, "value");
                this.f35436a = str;
            }

            public final String a() {
                return this.f35436a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LastNameChange) && Intrinsics.d(this.f35436a, ((LastNameChange) obj).f35436a);
            }

            public int hashCode() {
                return this.f35436a.hashCode();
            }

            public String toString() {
                String str = this.f35436a;
                return "LastNameChange(value=" + str + ")";
            }
        }

        @Metadata
        public static final class PhoneChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f35437a;

            public PhoneChange(String str) {
                Intrinsics.i(str, "value");
                this.f35437a = str;
            }

            public final String a() {
                return this.f35437a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PhoneChange) && Intrinsics.d(this.f35437a, ((PhoneChange) obj).f35437a);
            }

            public int hashCode() {
                return this.f35437a.hashCode();
            }

            public String toString() {
                String str = this.f35437a;
                return "PhoneChange(value=" + str + ")";
            }
        }

        @Metadata
        public static final class Save implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final Save f35438a = new Save();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Save);
            }

            public int hashCode() {
                return 14581919;
            }

            public String toString() {
                return "Save";
            }
        }
    }

    @Metadata
    public interface Effect {

        @Metadata
        public static final class Failure implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final StringValue f35439a;

            public Failure(StringValue stringValue) {
                Intrinsics.i(stringValue, "message");
                this.f35439a = stringValue;
            }

            public final StringValue a() {
                return this.f35439a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Failure) && Intrinsics.d(this.f35439a, ((Failure) obj).f35439a);
            }

            public int hashCode() {
                return this.f35439a.hashCode();
            }

            public String toString() {
                StringValue stringValue = this.f35439a;
                return "Failure(message=" + stringValue + ")";
            }
        }

        @Metadata
        public static final class Success implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final Success f35440a = new Success();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Success);
            }

            public int hashCode() {
                return -540064260;
            }

            public String toString() {
                return "Success";
            }
        }
    }

    @Metadata
    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new Creator();

        /* renamed from: A  reason: collision with root package name */
        public final boolean f35441A;

        /* renamed from: B  reason: collision with root package name */
        public final String f35442B;
        public final StringValue C;
        public final boolean D;
        public final String E;
        public final StringValue F;
        public final String G;
        public final boolean H;
        public final boolean I;
        public final String J;
        public final StringValue K;
        public final boolean L;

        /* renamed from: z  reason: collision with root package name */
        public final boolean f35443z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<State> {
            /* renamed from: a */
            public final State createFromParcel(Parcel parcel) {
                Parcel parcel2 = parcel;
                Intrinsics.i(parcel2, "parcel");
                Class<State> cls = State.class;
                return new State(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), (StringValue) parcel2.readParcelable(cls.getClassLoader()), parcel.readInt() != 0, parcel.readString(), (StringValue) parcel2.readParcelable(cls.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), (StringValue) parcel2.readParcelable(cls.getClassLoader()), parcel.readInt() != 0);
            }

            /* renamed from: b */
            public final State[] newArray(int i2) {
                return new State[i2];
            }
        }

        public State(boolean z2, boolean z3, String str, StringValue stringValue, boolean z4, String str2, StringValue stringValue2, String str3, boolean z5, boolean z6, String str4, StringValue stringValue3, boolean z7) {
            Intrinsics.i(str, "firstName");
            Intrinsics.i(stringValue, "firstNameError");
            Intrinsics.i(str2, "lastName");
            Intrinsics.i(stringValue2, "lastNameError");
            Intrinsics.i(str3, "email");
            Intrinsics.i(str4, "phoneNumber");
            Intrinsics.i(stringValue3, "phoneNumberError");
            this.f35443z = z2;
            this.f35441A = z3;
            this.f35442B = str;
            this.C = stringValue;
            this.D = z4;
            this.E = str2;
            this.F = stringValue2;
            this.G = str3;
            this.H = z5;
            this.I = z6;
            this.J = str4;
            this.K = stringValue3;
            this.L = z7;
        }

        public static /* synthetic */ State b(State state, boolean z2, boolean z3, String str, StringValue stringValue, boolean z4, String str2, StringValue stringValue2, String str3, boolean z5, boolean z6, String str4, StringValue stringValue3, boolean z7, int i2, Object obj) {
            State state2 = state;
            int i3 = i2;
            return state.a((i3 & 1) != 0 ? state2.f35443z : z2, (i3 & 2) != 0 ? state2.f35441A : z3, (i3 & 4) != 0 ? state2.f35442B : str, (i3 & 8) != 0 ? state2.C : stringValue, (i3 & 16) != 0 ? state2.D : z4, (i3 & 32) != 0 ? state2.E : str2, (i3 & 64) != 0 ? state2.F : stringValue2, (i3 & 128) != 0 ? state2.G : str3, (i3 & 256) != 0 ? state2.H : z5, (i3 & 512) != 0 ? state2.I : z6, (i3 & 1024) != 0 ? state2.J : str4, (i3 & 2048) != 0 ? state2.K : stringValue3, (i3 & 4096) != 0 ? state2.L : z7);
        }

        public final State a(boolean z2, boolean z3, String str, StringValue stringValue, boolean z4, String str2, StringValue stringValue2, String str3, boolean z5, boolean z6, String str4, StringValue stringValue3, boolean z7) {
            String str5 = str;
            Intrinsics.i(str5, "firstName");
            StringValue stringValue4 = stringValue;
            Intrinsics.i(stringValue4, "firstNameError");
            String str6 = str2;
            Intrinsics.i(str6, "lastName");
            StringValue stringValue5 = stringValue2;
            Intrinsics.i(stringValue5, "lastNameError");
            String str7 = str3;
            Intrinsics.i(str7, "email");
            String str8 = str4;
            Intrinsics.i(str8, "phoneNumber");
            StringValue stringValue6 = stringValue3;
            Intrinsics.i(stringValue6, "phoneNumberError");
            return new State(z2, z3, str5, stringValue4, z4, str6, stringValue5, str7, z5, z6, str8, stringValue6, z7);
        }

        public final boolean c() {
            return this.f35443z || this.L;
        }

        public final String d() {
            return this.G;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean e() {
            return !this.f35443z && !this.L;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return this.f35443z == state.f35443z && this.f35441A == state.f35441A && Intrinsics.d(this.f35442B, state.f35442B) && Intrinsics.d(this.C, state.C) && this.D == state.D && Intrinsics.d(this.E, state.E) && Intrinsics.d(this.F, state.F) && Intrinsics.d(this.G, state.G) && this.H == state.H && this.I == state.I && Intrinsics.d(this.J, state.J) && Intrinsics.d(this.K, state.K) && this.L == state.L;
        }

        public final String f() {
            return this.f35442B;
        }

        public final boolean g() {
            return this.f35441A;
        }

        public final StringValue h() {
            return this.C;
        }

        public int hashCode() {
            return (((((((((((((((((((((((Boolean.hashCode(this.f35443z) * 31) + Boolean.hashCode(this.f35441A)) * 31) + this.f35442B.hashCode()) * 31) + this.C.hashCode()) * 31) + Boolean.hashCode(this.D)) * 31) + this.E.hashCode()) * 31) + this.F.hashCode()) * 31) + this.G.hashCode()) * 31) + Boolean.hashCode(this.H)) * 31) + Boolean.hashCode(this.I)) * 31) + this.J.hashCode()) * 31) + this.K.hashCode()) * 31) + Boolean.hashCode(this.L);
        }

        public final boolean i() {
            return StringValueKt.a(this.F) || StringValueKt.a(this.C) || StringValueKt.a(this.K);
        }

        public final String j() {
            return this.E;
        }

        public final boolean k() {
            return this.D;
        }

        public final StringValue l() {
            return this.F;
        }

        public final String n() {
            return this.J;
        }

        public final boolean o() {
            return this.H;
        }

        public final StringValue p() {
            return this.K;
        }

        public String toString() {
            boolean z2 = this.f35443z;
            boolean z3 = this.f35441A;
            String str = this.f35442B;
            StringValue stringValue = this.C;
            boolean z4 = this.D;
            String str2 = this.E;
            StringValue stringValue2 = this.F;
            String str3 = this.G;
            boolean z5 = this.H;
            boolean z6 = this.I;
            String str4 = this.J;
            StringValue stringValue3 = this.K;
            boolean z7 = this.L;
            return "State(loading=" + z2 + ", firstNameEnabled=" + z3 + ", firstName=" + str + ", firstNameError=" + stringValue + ", lastNameEnabled=" + z4 + ", lastName=" + str2 + ", lastNameError=" + stringValue2 + ", email=" + str3 + ", phoneNumberEnabled=" + z5 + ", phoneNumberIsMandatory=" + z6 + ", phoneNumber=" + str4 + ", phoneNumberError=" + stringValue3 + ", saving=" + z7 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeInt(this.f35443z ? 1 : 0);
            parcel.writeInt(this.f35441A ? 1 : 0);
            parcel.writeString(this.f35442B);
            parcel.writeParcelable(this.C, i2);
            parcel.writeInt(this.D ? 1 : 0);
            parcel.writeString(this.E);
            parcel.writeParcelable(this.F, i2);
            parcel.writeString(this.G);
            parcel.writeInt(this.H ? 1 : 0);
            parcel.writeInt(this.I ? 1 : 0);
            parcel.writeString(this.J);
            parcel.writeParcelable(this.K, i2);
            parcel.writeInt(this.L ? 1 : 0);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ State(boolean r15, boolean r16, java.lang.String r17, com.hansecom.abt.util.resourcesResolvers.StringValue r18, boolean r19, java.lang.String r20, com.hansecom.abt.util.resourcesResolvers.StringValue r21, java.lang.String r22, boolean r23, boolean r24, java.lang.String r25, com.hansecom.abt.util.resourcesResolvers.StringValue r26, boolean r27, int r28, kotlin.jvm.internal.DefaultConstructorMarker r29) {
            /*
                r14 = this;
                r0 = r28
                r1 = r0 & 1
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r1 = r2
                goto L_0x000a
            L_0x0009:
                r1 = r15
            L_0x000a:
                r3 = r0 & 2
                r4 = 1
                if (r3 == 0) goto L_0x0011
                r3 = r4
                goto L_0x0013
            L_0x0011:
                r3 = r16
            L_0x0013:
                r5 = r0 & 4
                java.lang.String r6 = ""
                if (r5 == 0) goto L_0x001b
                r5 = r6
                goto L_0x001d
            L_0x001b:
                r5 = r17
            L_0x001d:
                r7 = r0 & 8
                if (r7 == 0) goto L_0x0028
                com.hansecom.abt.util.resourcesResolvers.StringValue$Companion r7 = com.hansecom.abt.util.resourcesResolvers.StringValue.Companion
                com.hansecom.abt.util.resourcesResolvers.StringValue r7 = r7.a()
                goto L_0x002a
            L_0x0028:
                r7 = r18
            L_0x002a:
                r8 = r0 & 16
                if (r8 == 0) goto L_0x0030
                r8 = r4
                goto L_0x0032
            L_0x0030:
                r8 = r19
            L_0x0032:
                r9 = r0 & 32
                if (r9 == 0) goto L_0x0038
                r9 = r6
                goto L_0x003a
            L_0x0038:
                r9 = r20
            L_0x003a:
                r10 = r0 & 64
                if (r10 == 0) goto L_0x0045
                com.hansecom.abt.util.resourcesResolvers.StringValue$Companion r10 = com.hansecom.abt.util.resourcesResolvers.StringValue.Companion
                com.hansecom.abt.util.resourcesResolvers.StringValue r10 = r10.a()
                goto L_0x0047
            L_0x0045:
                r10 = r21
            L_0x0047:
                r11 = r0 & 128(0x80, float:1.794E-43)
                if (r11 == 0) goto L_0x004d
                r11 = r6
                goto L_0x004f
            L_0x004d:
                r11 = r22
            L_0x004f:
                r12 = r0 & 256(0x100, float:3.59E-43)
                if (r12 == 0) goto L_0x0055
                r12 = r4
                goto L_0x0057
            L_0x0055:
                r12 = r23
            L_0x0057:
                r13 = r0 & 512(0x200, float:7.175E-43)
                if (r13 == 0) goto L_0x005c
                goto L_0x005e
            L_0x005c:
                r4 = r24
            L_0x005e:
                r13 = r0 & 1024(0x400, float:1.435E-42)
                if (r13 == 0) goto L_0x0063
                goto L_0x0065
            L_0x0063:
                r6 = r25
            L_0x0065:
                r13 = r0 & 2048(0x800, float:2.87E-42)
                if (r13 == 0) goto L_0x0070
                com.hansecom.abt.util.resourcesResolvers.StringValue$Companion r13 = com.hansecom.abt.util.resourcesResolvers.StringValue.Companion
                com.hansecom.abt.util.resourcesResolvers.StringValue r13 = r13.a()
                goto L_0x0072
            L_0x0070:
                r13 = r26
            L_0x0072:
                r0 = r0 & 4096(0x1000, float:5.74E-42)
                if (r0 == 0) goto L_0x0077
                goto L_0x0079
            L_0x0077:
                r2 = r27
            L_0x0079:
                r15 = r14
                r16 = r1
                r17 = r3
                r18 = r5
                r19 = r7
                r20 = r8
                r21 = r9
                r22 = r10
                r23 = r11
                r24 = r12
                r25 = r4
                r26 = r6
                r27 = r13
                r28 = r2
                r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.information.AccountInformation.State.<init>(boolean, boolean, java.lang.String, com.hansecom.abt.util.resourcesResolvers.StringValue, boolean, java.lang.String, com.hansecom.abt.util.resourcesResolvers.StringValue, java.lang.String, boolean, boolean, java.lang.String, com.hansecom.abt.util.resourcesResolvers.StringValue, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
