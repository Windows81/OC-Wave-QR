package com.hansecom.abt.presentation.screens.auth.login;

import android.os.Parcel;
import android.os.Parcelable;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public interface Login {

    @Metadata
    public interface Action {

        @Metadata
        public static final class AutoLogin implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f34287a;

            /* renamed from: b  reason: collision with root package name */
            public final String f34288b;

            public final String a() {
                return this.f34287a;
            }

            public final String b() {
                return this.f34288b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AutoLogin)) {
                    return false;
                }
                AutoLogin autoLogin = (AutoLogin) obj;
                return Intrinsics.d(this.f34287a, autoLogin.f34287a) && Intrinsics.d(this.f34288b, autoLogin.f34288b);
            }

            public int hashCode() {
                return (this.f34287a.hashCode() * 31) + this.f34288b.hashCode();
            }

            public String toString() {
                String str = this.f34287a;
                String str2 = this.f34288b;
                return "AutoLogin(email=" + str + ", password=" + str2 + ")";
            }
        }

        @Metadata
        public static final class EmailChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f34289a;

            public EmailChange(String str) {
                Intrinsics.i(str, "value");
                this.f34289a = str;
            }

            public final String a() {
                return this.f34289a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof EmailChange) && Intrinsics.d(this.f34289a, ((EmailChange) obj).f34289a);
            }

            public int hashCode() {
                return this.f34289a.hashCode();
            }

            public String toString() {
                String str = this.f34289a;
                return "EmailChange(value=" + str + ")";
            }
        }

        @Metadata
        /* renamed from: com.hansecom.abt.presentation.screens.auth.login.Login$Action$Login  reason: collision with other inner class name */
        public static final class C0007Login implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final C0007Login f34290a = new C0007Login();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0007Login);
            }

            public int hashCode() {
                return 1498387272;
            }

            public String toString() {
                return "Login";
            }
        }

        @Metadata
        public static final class PasswordChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f34291a;

            public PasswordChange(String str) {
                Intrinsics.i(str, "value");
                this.f34291a = str;
            }

            public final String a() {
                return this.f34291a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PasswordChange) && Intrinsics.d(this.f34291a, ((PasswordChange) obj).f34291a);
            }

            public int hashCode() {
                return this.f34291a.hashCode();
            }

            public String toString() {
                String str = this.f34291a;
                return "PasswordChange(value=" + str + ")";
            }
        }

        @Metadata
        public static final class PasswordContentVisibilityToggle implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final PasswordContentVisibilityToggle f34292a = new PasswordContentVisibilityToggle();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof PasswordContentVisibilityToggle);
            }

            public int hashCode() {
                return 1860580771;
            }

            public String toString() {
                return "PasswordContentVisibilityToggle";
            }
        }
    }

    @Metadata
    public interface Effect {

        @Metadata
        public static final class AccountInactive implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final String f34293a;

            public AccountInactive(String str) {
                Intrinsics.i(str, "email");
                this.f34293a = str;
            }

            public final String a() {
                return this.f34293a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AccountInactive) && Intrinsics.d(this.f34293a, ((AccountInactive) obj).f34293a);
            }

            public int hashCode() {
                return this.f34293a.hashCode();
            }

            public String toString() {
                String str = this.f34293a;
                return "AccountInactive(email=" + str + ")";
            }
        }

        @Metadata
        public static final class LoginFail implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final StringValue f34294a;

            public LoginFail(StringValue stringValue) {
                Intrinsics.i(stringValue, "message");
                this.f34294a = stringValue;
            }

            public final StringValue a() {
                return this.f34294a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LoginFail) && Intrinsics.d(this.f34294a, ((LoginFail) obj).f34294a);
            }

            public int hashCode() {
                return this.f34294a.hashCode();
            }

            public String toString() {
                StringValue stringValue = this.f34294a;
                return "LoginFail(message=" + stringValue + ")";
            }
        }

        @Metadata
        public static final class LoginSuccess implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final String f34295a;

            /* renamed from: b  reason: collision with root package name */
            public final String f34296b;

            public LoginSuccess(String str, String str2) {
                Intrinsics.i(str, "email");
                Intrinsics.i(str2, "password");
                this.f34295a = str;
                this.f34296b = str2;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LoginSuccess)) {
                    return false;
                }
                LoginSuccess loginSuccess = (LoginSuccess) obj;
                return Intrinsics.d(this.f34295a, loginSuccess.f34295a) && Intrinsics.d(this.f34296b, loginSuccess.f34296b);
            }

            public int hashCode() {
                return (this.f34295a.hashCode() * 31) + this.f34296b.hashCode();
            }

            public String toString() {
                String str = this.f34295a;
                String str2 = this.f34296b;
                return "LoginSuccess(email=" + str + ", password=" + str2 + ")";
            }
        }
    }

    @Metadata
    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new Creator();

        /* renamed from: A  reason: collision with root package name */
        public final StringValue f34297A;

        /* renamed from: B  reason: collision with root package name */
        public final String f34298B;
        public final StringValue C;
        public final boolean D;
        public final boolean E;
        public final boolean F;
        public final boolean G;

        /* renamed from: z  reason: collision with root package name */
        public final String f34299z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<State> {
            /* renamed from: a */
            public final State createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                Class<State> cls = State.class;
                return new State(parcel.readString(), (StringValue) parcel.readParcelable(cls.getClassLoader()), parcel.readString(), (StringValue) parcel.readParcelable(cls.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* renamed from: b */
            public final State[] newArray(int i2) {
                return new State[i2];
            }
        }

        public State(String str, StringValue stringValue, String str2, StringValue stringValue2, boolean z2, boolean z3, boolean z4, boolean z5) {
            Intrinsics.i(str, "email");
            Intrinsics.i(stringValue, "emailErrorMessage");
            Intrinsics.i(str2, "password");
            Intrinsics.i(stringValue2, "passwordErrorMessage");
            this.f34299z = str;
            this.f34297A = stringValue;
            this.f34298B = str2;
            this.C = stringValue2;
            this.D = z2;
            this.E = z3;
            this.F = z4;
            this.G = z5;
        }

        public static /* synthetic */ State b(State state, String str, StringValue stringValue, String str2, StringValue stringValue2, boolean z2, boolean z3, boolean z4, boolean z5, int i2, Object obj) {
            State state2 = state;
            int i3 = i2;
            return state.a((i3 & 1) != 0 ? state2.f34299z : str, (i3 & 2) != 0 ? state2.f34297A : stringValue, (i3 & 4) != 0 ? state2.f34298B : str2, (i3 & 8) != 0 ? state2.C : stringValue2, (i3 & 16) != 0 ? state2.D : z2, (i3 & 32) != 0 ? state2.E : z3, (i3 & 64) != 0 ? state2.F : z4, (i3 & 128) != 0 ? state2.G : z5);
        }

        public final State a(String str, StringValue stringValue, String str2, StringValue stringValue2, boolean z2, boolean z3, boolean z4, boolean z5) {
            Intrinsics.i(str, "email");
            Intrinsics.i(stringValue, "emailErrorMessage");
            Intrinsics.i(str2, "password");
            Intrinsics.i(stringValue2, "passwordErrorMessage");
            return new State(str, stringValue, str2, stringValue2, z2, z3, z4, z5);
        }

        public final String c() {
            return this.f34299z;
        }

        public final StringValue d() {
            return this.f34297A;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean e() {
            StringValue stringValue = this.f34297A;
            StringValue.Companion companion = StringValue.Companion;
            return !Intrinsics.d(stringValue, companion.a()) || !Intrinsics.d(this.C, companion.a());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return Intrinsics.d(this.f34299z, state.f34299z) && Intrinsics.d(this.f34297A, state.f34297A) && Intrinsics.d(this.f34298B, state.f34298B) && Intrinsics.d(this.C, state.C) && this.D == state.D && this.E == state.E && this.F == state.F && this.G == state.G;
        }

        public final boolean f() {
            return this.E;
        }

        public final String g() {
            return this.f34298B;
        }

        public final StringValue h() {
            return this.C;
        }

        public int hashCode() {
            return (((((((((((((this.f34299z.hashCode() * 31) + this.f34297A.hashCode()) * 31) + this.f34298B.hashCode()) * 31) + this.C.hashCode()) * 31) + Boolean.hashCode(this.D)) * 31) + Boolean.hashCode(this.E)) * 31) + Boolean.hashCode(this.F)) * 31) + Boolean.hashCode(this.G);
        }

        public final boolean i() {
            return this.D;
        }

        public final boolean j() {
            return this.F;
        }

        public final boolean k() {
            return this.G;
        }

        public String toString() {
            String str = this.f34299z;
            StringValue stringValue = this.f34297A;
            String str2 = this.f34298B;
            StringValue stringValue2 = this.C;
            boolean z2 = this.D;
            boolean z3 = this.E;
            boolean z4 = this.F;
            boolean z5 = this.G;
            return "State(email=" + str + ", emailErrorMessage=" + stringValue + ", password=" + str2 + ", passwordErrorMessage=" + stringValue2 + ", passwordIsVisible=" + z2 + ", loginInProgress=" + z3 + ", showLogo=" + z4 + ", showRegistration=" + z5 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeString(this.f34299z);
            parcel.writeParcelable(this.f34297A, i2);
            parcel.writeString(this.f34298B);
            parcel.writeParcelable(this.C, i2);
            parcel.writeInt(this.D ? 1 : 0);
            parcel.writeInt(this.E ? 1 : 0);
            parcel.writeInt(this.F ? 1 : 0);
            parcel.writeInt(this.G ? 1 : 0);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ State(java.lang.String r10, com.hansecom.abt.util.resourcesResolvers.StringValue r11, java.lang.String r12, com.hansecom.abt.util.resourcesResolvers.StringValue r13, boolean r14, boolean r15, boolean r16, boolean r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
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
                if (r4 == 0) goto L_0x001c
                goto L_0x001d
            L_0x001c:
                r2 = r12
            L_0x001d:
                r4 = r0 & 8
                if (r4 == 0) goto L_0x0028
                com.hansecom.abt.util.resourcesResolvers.StringValue$Companion r4 = com.hansecom.abt.util.resourcesResolvers.StringValue.Companion
                com.hansecom.abt.util.resourcesResolvers.StringValue r4 = r4.a()
                goto L_0x0029
            L_0x0028:
                r4 = r13
            L_0x0029:
                r5 = r0 & 16
                r6 = 0
                if (r5 == 0) goto L_0x0030
                r5 = r6
                goto L_0x0031
            L_0x0030:
                r5 = r14
            L_0x0031:
                r7 = r0 & 32
                if (r7 == 0) goto L_0x0037
                r7 = r6
                goto L_0x0038
            L_0x0037:
                r7 = r15
            L_0x0038:
                r8 = r0 & 64
                if (r8 == 0) goto L_0x003d
                goto L_0x003f
            L_0x003d:
                r6 = r16
            L_0x003f:
                r0 = r0 & 128(0x80, float:1.794E-43)
                if (r0 == 0) goto L_0x0045
                r0 = 1
                goto L_0x0047
            L_0x0045:
                r0 = r17
            L_0x0047:
                r10 = r9
                r11 = r1
                r12 = r3
                r13 = r2
                r14 = r4
                r15 = r5
                r16 = r7
                r17 = r6
                r18 = r0
                r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.auth.login.Login.State.<init>(java.lang.String, com.hansecom.abt.util.resourcesResolvers.StringValue, java.lang.String, com.hansecom.abt.util.resourcesResolvers.StringValue, boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
