package com.hansecom.abt.presentation.screens.home.account.changePassword;

import android.os.Parcel;
import android.os.Parcelable;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public interface ChangePassword {

    @Metadata
    public interface Action {

        @Metadata
        public static final class Confirm implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final Confirm f35283a = new Confirm();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Confirm);
            }

            public int hashCode() {
                return -833535297;
            }

            public String toString() {
                return "Confirm";
            }
        }

        @Metadata
        public static final class NewPasswordChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f35284a;

            public NewPasswordChange(String str) {
                Intrinsics.i(str, "value");
                this.f35284a = str;
            }

            public final String a() {
                return this.f35284a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NewPasswordChange) && Intrinsics.d(this.f35284a, ((NewPasswordChange) obj).f35284a);
            }

            public int hashCode() {
                return this.f35284a.hashCode();
            }

            public String toString() {
                String str = this.f35284a;
                return "NewPasswordChange(value=" + str + ")";
            }
        }

        @Metadata
        public static final class NewPasswordConfirmationChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f35285a;

            public NewPasswordConfirmationChange(String str) {
                Intrinsics.i(str, "value");
                this.f35285a = str;
            }

            public final String a() {
                return this.f35285a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NewPasswordConfirmationChange) && Intrinsics.d(this.f35285a, ((NewPasswordConfirmationChange) obj).f35285a);
            }

            public int hashCode() {
                return this.f35285a.hashCode();
            }

            public String toString() {
                String str = this.f35285a;
                return "NewPasswordConfirmationChange(value=" + str + ")";
            }
        }

        @Metadata
        public static final class NewPasswordConfirmationVisibilityToggle implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final NewPasswordConfirmationVisibilityToggle f35286a = new NewPasswordConfirmationVisibilityToggle();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof NewPasswordConfirmationVisibilityToggle);
            }

            public int hashCode() {
                return -1775382187;
            }

            public String toString() {
                return "NewPasswordConfirmationVisibilityToggle";
            }
        }

        @Metadata
        public static final class NewPasswordVisibilityToggle implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final NewPasswordVisibilityToggle f35287a = new NewPasswordVisibilityToggle();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof NewPasswordVisibilityToggle);
            }

            public int hashCode() {
                return -1887587840;
            }

            public String toString() {
                return "NewPasswordVisibilityToggle";
            }
        }

        @Metadata
        public static final class OldPasswordChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f35288a;

            public OldPasswordChange(String str) {
                Intrinsics.i(str, "value");
                this.f35288a = str;
            }

            public final String a() {
                return this.f35288a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OldPasswordChange) && Intrinsics.d(this.f35288a, ((OldPasswordChange) obj).f35288a);
            }

            public int hashCode() {
                return this.f35288a.hashCode();
            }

            public String toString() {
                String str = this.f35288a;
                return "OldPasswordChange(value=" + str + ")";
            }
        }

        @Metadata
        public static final class OldPasswordVisibilityToggle implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final OldPasswordVisibilityToggle f35289a = new OldPasswordVisibilityToggle();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof OldPasswordVisibilityToggle);
            }

            public int hashCode() {
                return 103436679;
            }

            public String toString() {
                return "OldPasswordVisibilityToggle";
            }
        }
    }

    @Metadata
    public interface Effect {

        @Metadata
        public static final class Error implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final StringValue f35290a;

            public Error(StringValue stringValue) {
                Intrinsics.i(stringValue, "message");
                this.f35290a = stringValue;
            }

            public final StringValue a() {
                return this.f35290a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.d(this.f35290a, ((Error) obj).f35290a);
            }

            public int hashCode() {
                return this.f35290a.hashCode();
            }

            public String toString() {
                StringValue stringValue = this.f35290a;
                return "Error(message=" + stringValue + ")";
            }
        }

        @Metadata
        public static final class Success implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final String f35291a;

            /* renamed from: b  reason: collision with root package name */
            public final String f35292b;

            public Success(String str, String str2) {
                Intrinsics.i(str2, "password");
                this.f35291a = str;
                this.f35292b = str2;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Success)) {
                    return false;
                }
                Success success = (Success) obj;
                return Intrinsics.d(this.f35291a, success.f35291a) && Intrinsics.d(this.f35292b, success.f35292b);
            }

            public int hashCode() {
                String str = this.f35291a;
                return ((str == null ? 0 : str.hashCode()) * 31) + this.f35292b.hashCode();
            }

            public String toString() {
                String str = this.f35291a;
                String str2 = this.f35292b;
                return "Success(email=" + str + ", password=" + str2 + ")";
            }
        }
    }

    @Metadata
    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new Creator();

        /* renamed from: A  reason: collision with root package name */
        public final String f35293A;

        /* renamed from: B  reason: collision with root package name */
        public final StringValue f35294B;
        public final boolean C;
        public final String D;
        public final boolean E;
        public final boolean F;
        public final String G;
        public final boolean H;
        public final boolean I;
        public final boolean J;

        /* renamed from: z  reason: collision with root package name */
        public final String f35295z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<State> {
            /* renamed from: a */
            public final State createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                return new State(parcel.readString(), parcel.readString(), (StringValue) parcel.readParcelable(State.class.getClassLoader()), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* renamed from: b */
            public final State[] newArray(int i2) {
                return new State[i2];
            }
        }

        public State(String str, String str2, StringValue stringValue, boolean z2, String str3, boolean z3, boolean z4, String str4, boolean z5, boolean z6, boolean z7) {
            Intrinsics.i(str, "email");
            Intrinsics.i(str2, "oldPassword");
            Intrinsics.i(stringValue, "oldPasswordError");
            Intrinsics.i(str3, "newPassword");
            Intrinsics.i(str4, "newPasswordConfirmation");
            this.f35295z = str;
            this.f35293A = str2;
            this.f35294B = stringValue;
            this.C = z2;
            this.D = str3;
            this.E = z3;
            this.F = z4;
            this.G = str4;
            this.H = z5;
            this.I = z6;
            this.J = z7;
        }

        public static /* synthetic */ State b(State state, String str, String str2, StringValue stringValue, boolean z2, String str3, boolean z3, boolean z4, String str4, boolean z5, boolean z6, boolean z7, int i2, Object obj) {
            State state2 = state;
            int i3 = i2;
            return state.a((i3 & 1) != 0 ? state2.f35295z : str, (i3 & 2) != 0 ? state2.f35293A : str2, (i3 & 4) != 0 ? state2.f35294B : stringValue, (i3 & 8) != 0 ? state2.C : z2, (i3 & 16) != 0 ? state2.D : str3, (i3 & 32) != 0 ? state2.E : z3, (i3 & 64) != 0 ? state2.F : z4, (i3 & 128) != 0 ? state2.G : str4, (i3 & 256) != 0 ? state2.H : z5, (i3 & 512) != 0 ? state2.I : z6, (i3 & 1024) != 0 ? state2.J : z7);
        }

        public final State a(String str, String str2, StringValue stringValue, boolean z2, String str3, boolean z3, boolean z4, String str4, boolean z5, boolean z6, boolean z7) {
            Intrinsics.i(str, "email");
            Intrinsics.i(str2, "oldPassword");
            StringValue stringValue2 = stringValue;
            Intrinsics.i(stringValue2, "oldPasswordError");
            String str5 = str3;
            Intrinsics.i(str5, "newPassword");
            String str6 = str4;
            Intrinsics.i(str6, "newPasswordConfirmation");
            return new State(str, str2, stringValue2, z2, str5, z3, z4, str6, z5, z6, z7);
        }

        public final String c() {
            return this.f35295z;
        }

        public final boolean d() {
            return !this.E || !this.H;
        }

        public final int describeContents() {
            return 0;
        }

        public final String e() {
            return this.D;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return Intrinsics.d(this.f35295z, state.f35295z) && Intrinsics.d(this.f35293A, state.f35293A) && Intrinsics.d(this.f35294B, state.f35294B) && this.C == state.C && Intrinsics.d(this.D, state.D) && this.E == state.E && this.F == state.F && Intrinsics.d(this.G, state.G) && this.H == state.H && this.I == state.I && this.J == state.J;
        }

        public final String f() {
            return this.G;
        }

        public final boolean g() {
            return this.H;
        }

        public final boolean h() {
            return this.E;
        }

        public int hashCode() {
            return (((((((((((((((((((this.f35295z.hashCode() * 31) + this.f35293A.hashCode()) * 31) + this.f35294B.hashCode()) * 31) + Boolean.hashCode(this.C)) * 31) + this.D.hashCode()) * 31) + Boolean.hashCode(this.E)) * 31) + Boolean.hashCode(this.F)) * 31) + this.G.hashCode()) * 31) + Boolean.hashCode(this.H)) * 31) + Boolean.hashCode(this.I)) * 31) + Boolean.hashCode(this.J);
        }

        public final String i() {
            return this.f35293A;
        }

        public final StringValue j() {
            return this.f35294B;
        }

        public final boolean k() {
            return this.J;
        }

        public final boolean l() {
            return this.I;
        }

        public final boolean n() {
            return this.F;
        }

        public final boolean o() {
            return this.C;
        }

        public String toString() {
            String str = this.f35295z;
            String str2 = this.f35293A;
            StringValue stringValue = this.f35294B;
            boolean z2 = this.C;
            String str3 = this.D;
            boolean z3 = this.E;
            boolean z4 = this.F;
            String str4 = this.G;
            boolean z5 = this.H;
            boolean z6 = this.I;
            boolean z7 = this.J;
            return "State(email=" + str + ", oldPassword=" + str2 + ", oldPasswordError=" + stringValue + ", isOldPasswordVisible=" + z2 + ", newPassword=" + str3 + ", newPasswordIsValid=" + z3 + ", isNewPasswordVisible=" + z4 + ", newPasswordConfirmation=" + str4 + ", newPasswordConfirmationIsValid=" + z5 + ", isNewPasswordConfirmationVisible=" + z6 + ", isLoading=" + z7 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeString(this.f35295z);
            parcel.writeString(this.f35293A);
            parcel.writeParcelable(this.f35294B, i2);
            parcel.writeInt(this.C ? 1 : 0);
            parcel.writeString(this.D);
            parcel.writeInt(this.E ? 1 : 0);
            parcel.writeInt(this.F ? 1 : 0);
            parcel.writeString(this.G);
            parcel.writeInt(this.H ? 1 : 0);
            parcel.writeInt(this.I ? 1 : 0);
            parcel.writeInt(this.J ? 1 : 0);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ State(java.lang.String r13, java.lang.String r14, com.hansecom.abt.util.resourcesResolvers.StringValue r15, boolean r16, java.lang.String r17, boolean r18, boolean r19, java.lang.String r20, boolean r21, boolean r22, boolean r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
            /*
                r12 = this;
                r0 = r24
                r1 = r0 & 1
                java.lang.String r2 = ""
                if (r1 == 0) goto L_0x000a
                r1 = r2
                goto L_0x000b
            L_0x000a:
                r1 = r13
            L_0x000b:
                r3 = r0 & 2
                if (r3 == 0) goto L_0x0011
                r3 = r2
                goto L_0x0012
            L_0x0011:
                r3 = r14
            L_0x0012:
                r4 = r0 & 4
                if (r4 == 0) goto L_0x001d
                com.hansecom.abt.util.resourcesResolvers.StringValue$Companion r4 = com.hansecom.abt.util.resourcesResolvers.StringValue.Companion
                com.hansecom.abt.util.resourcesResolvers.StringValue r4 = r4.a()
                goto L_0x001e
            L_0x001d:
                r4 = r15
            L_0x001e:
                r5 = r0 & 8
                r6 = 0
                if (r5 == 0) goto L_0x0025
                r5 = r6
                goto L_0x0027
            L_0x0025:
                r5 = r16
            L_0x0027:
                r7 = r0 & 16
                if (r7 == 0) goto L_0x002d
                r7 = r2
                goto L_0x002f
            L_0x002d:
                r7 = r17
            L_0x002f:
                r8 = r0 & 32
                r9 = 1
                if (r8 == 0) goto L_0x0036
                r8 = r9
                goto L_0x0038
            L_0x0036:
                r8 = r18
            L_0x0038:
                r10 = r0 & 64
                if (r10 == 0) goto L_0x003e
                r10 = r6
                goto L_0x0040
            L_0x003e:
                r10 = r19
            L_0x0040:
                r11 = r0 & 128(0x80, float:1.794E-43)
                if (r11 == 0) goto L_0x0045
                goto L_0x0047
            L_0x0045:
                r2 = r20
            L_0x0047:
                r11 = r0 & 256(0x100, float:3.59E-43)
                if (r11 == 0) goto L_0x004c
                goto L_0x004e
            L_0x004c:
                r9 = r21
            L_0x004e:
                r11 = r0 & 512(0x200, float:7.175E-43)
                if (r11 == 0) goto L_0x0054
                r11 = r6
                goto L_0x0056
            L_0x0054:
                r11 = r22
            L_0x0056:
                r0 = r0 & 1024(0x400, float:1.435E-42)
                if (r0 == 0) goto L_0x005b
                goto L_0x005d
            L_0x005b:
                r6 = r23
            L_0x005d:
                r13 = r12
                r14 = r1
                r15 = r3
                r16 = r4
                r17 = r5
                r18 = r7
                r19 = r8
                r20 = r10
                r21 = r2
                r22 = r9
                r23 = r11
                r24 = r6
                r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePassword.State.<init>(java.lang.String, java.lang.String, com.hansecom.abt.util.resourcesResolvers.StringValue, boolean, java.lang.String, boolean, boolean, java.lang.String, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
