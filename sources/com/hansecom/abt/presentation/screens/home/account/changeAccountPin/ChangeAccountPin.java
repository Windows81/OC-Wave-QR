package com.hansecom.abt.presentation.screens.home.account.changeAccountPin;

import android.os.Parcel;
import android.os.Parcelable;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public interface ChangeAccountPin {

    @Metadata
    public interface Action {

        @Metadata
        public static final class Confirm implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final Confirm f35229a = new Confirm();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Confirm);
            }

            public int hashCode() {
                return -568591265;
            }

            public String toString() {
                return "Confirm";
            }
        }

        @Metadata
        public static final class NewPinChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f35230a;

            public NewPinChange(String str) {
                Intrinsics.i(str, "value");
                this.f35230a = str;
            }

            public final String a() {
                return this.f35230a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NewPinChange) && Intrinsics.d(this.f35230a, ((NewPinChange) obj).f35230a);
            }

            public int hashCode() {
                return this.f35230a.hashCode();
            }

            public String toString() {
                String str = this.f35230a;
                return "NewPinChange(value=" + str + ")";
            }
        }

        @Metadata
        public static final class NewPinConfirmationChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f35231a;

            public NewPinConfirmationChange(String str) {
                Intrinsics.i(str, "value");
                this.f35231a = str;
            }

            public final String a() {
                return this.f35231a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NewPinConfirmationChange) && Intrinsics.d(this.f35231a, ((NewPinConfirmationChange) obj).f35231a);
            }

            public int hashCode() {
                return this.f35231a.hashCode();
            }

            public String toString() {
                String str = this.f35231a;
                return "NewPinConfirmationChange(value=" + str + ")";
            }
        }

        @Metadata
        public static final class NewPinConfirmationVisibilityToggle implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final NewPinConfirmationVisibilityToggle f35232a = new NewPinConfirmationVisibilityToggle();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof NewPinConfirmationVisibilityToggle);
            }

            public int hashCode() {
                return 1182955729;
            }

            public String toString() {
                return "NewPinConfirmationVisibilityToggle";
            }
        }

        @Metadata
        public static final class NewPinVisibilityToggle implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final NewPinVisibilityToggle f35233a = new NewPinVisibilityToggle();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof NewPinVisibilityToggle);
            }

            public int hashCode() {
                return -2837636;
            }

            public String toString() {
                return "NewPinVisibilityToggle";
            }
        }

        @Metadata
        public static final class OldPinChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f35234a;

            public OldPinChange(String str) {
                Intrinsics.i(str, "value");
                this.f35234a = str;
            }

            public final String a() {
                return this.f35234a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OldPinChange) && Intrinsics.d(this.f35234a, ((OldPinChange) obj).f35234a);
            }

            public int hashCode() {
                return this.f35234a.hashCode();
            }

            public String toString() {
                String str = this.f35234a;
                return "OldPinChange(value=" + str + ")";
            }
        }

        @Metadata
        public static final class OldPinVisibilityToggle implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final OldPinVisibilityToggle f35235a = new OldPinVisibilityToggle();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof OldPinVisibilityToggle);
            }

            public int hashCode() {
                return -1383711851;
            }

            public String toString() {
                return "OldPinVisibilityToggle";
            }
        }
    }

    @Metadata
    public interface Effect {

        @Metadata
        public static final class Error implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final StringValue f35236a;

            public Error(StringValue stringValue) {
                Intrinsics.i(stringValue, "message");
                this.f35236a = stringValue;
            }

            public final StringValue a() {
                return this.f35236a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.d(this.f35236a, ((Error) obj).f35236a);
            }

            public int hashCode() {
                return this.f35236a.hashCode();
            }

            public String toString() {
                StringValue stringValue = this.f35236a;
                return "Error(message=" + stringValue + ")";
            }
        }

        @Metadata
        public static final class Success implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final Success f35237a = new Success();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Success);
            }

            public int hashCode() {
                return -805304835;
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
        public final boolean f35238A;

        /* renamed from: B  reason: collision with root package name */
        public final StringValue f35239B;
        public final boolean C;
        public final String D;
        public final boolean E;
        public final boolean F;
        public final String G;
        public final boolean H;
        public final boolean I;
        public final boolean J;

        /* renamed from: z  reason: collision with root package name */
        public final String f35240z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<State> {
            /* renamed from: a */
            public final State createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                return new State(parcel.readString(), parcel.readInt() != 0, (StringValue) parcel.readParcelable(State.class.getClassLoader()), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* renamed from: b */
            public final State[] newArray(int i2) {
                return new State[i2];
            }
        }

        public State(String str, boolean z2, StringValue stringValue, boolean z3, String str2, boolean z4, boolean z5, String str3, boolean z6, boolean z7, boolean z8) {
            Intrinsics.i(str, "oldPin");
            Intrinsics.i(stringValue, "oldPinError");
            Intrinsics.i(str2, "newPin");
            Intrinsics.i(str3, "newPinConfirmation");
            this.f35240z = str;
            this.f35238A = z2;
            this.f35239B = stringValue;
            this.C = z3;
            this.D = str2;
            this.E = z4;
            this.F = z5;
            this.G = str3;
            this.H = z6;
            this.I = z7;
            this.J = z8;
        }

        public static /* synthetic */ State b(State state, String str, boolean z2, StringValue stringValue, boolean z3, String str2, boolean z4, boolean z5, String str3, boolean z6, boolean z7, boolean z8, int i2, Object obj) {
            State state2 = state;
            int i3 = i2;
            return state.a((i3 & 1) != 0 ? state2.f35240z : str, (i3 & 2) != 0 ? state2.f35238A : z2, (i3 & 4) != 0 ? state2.f35239B : stringValue, (i3 & 8) != 0 ? state2.C : z3, (i3 & 16) != 0 ? state2.D : str2, (i3 & 32) != 0 ? state2.E : z4, (i3 & 64) != 0 ? state2.F : z5, (i3 & 128) != 0 ? state2.G : str3, (i3 & 256) != 0 ? state2.H : z6, (i3 & 512) != 0 ? state2.I : z7, (i3 & 1024) != 0 ? state2.J : z8);
        }

        public final State a(String str, boolean z2, StringValue stringValue, boolean z3, String str2, boolean z4, boolean z5, String str3, boolean z6, boolean z7, boolean z8) {
            Intrinsics.i(str, "oldPin");
            StringValue stringValue2 = stringValue;
            Intrinsics.i(stringValue2, "oldPinError");
            String str4 = str2;
            Intrinsics.i(str4, "newPin");
            String str5 = str3;
            Intrinsics.i(str5, "newPinConfirmation");
            return new State(str, z2, stringValue2, z3, str4, z4, z5, str5, z6, z7, z8);
        }

        public final boolean c() {
            return !this.f35238A || !this.E || !this.H;
        }

        public final String d() {
            return this.D;
        }

        public final int describeContents() {
            return 0;
        }

        public final String e() {
            return this.G;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return Intrinsics.d(this.f35240z, state.f35240z) && this.f35238A == state.f35238A && Intrinsics.d(this.f35239B, state.f35239B) && this.C == state.C && Intrinsics.d(this.D, state.D) && this.E == state.E && this.F == state.F && Intrinsics.d(this.G, state.G) && this.H == state.H && this.I == state.I && this.J == state.J;
        }

        public final boolean f() {
            return this.H;
        }

        public final boolean g() {
            return this.E;
        }

        public final String h() {
            return this.f35240z;
        }

        public int hashCode() {
            return (((((((((((((((((((this.f35240z.hashCode() * 31) + Boolean.hashCode(this.f35238A)) * 31) + this.f35239B.hashCode()) * 31) + Boolean.hashCode(this.C)) * 31) + this.D.hashCode()) * 31) + Boolean.hashCode(this.E)) * 31) + Boolean.hashCode(this.F)) * 31) + this.G.hashCode()) * 31) + Boolean.hashCode(this.H)) * 31) + Boolean.hashCode(this.I)) * 31) + Boolean.hashCode(this.J);
        }

        public final StringValue i() {
            return this.f35239B;
        }

        public final boolean j() {
            return this.f35238A;
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
            String str = this.f35240z;
            boolean z2 = this.f35238A;
            StringValue stringValue = this.f35239B;
            boolean z3 = this.C;
            String str2 = this.D;
            boolean z4 = this.E;
            boolean z5 = this.F;
            String str3 = this.G;
            boolean z6 = this.H;
            boolean z7 = this.I;
            boolean z8 = this.J;
            return "State(oldPin=" + str + ", oldPinIsValid=" + z2 + ", oldPinError=" + stringValue + ", isOldPinVisible=" + z3 + ", newPin=" + str2 + ", newPinIsValid=" + z4 + ", isNewPinVisible=" + z5 + ", newPinConfirmation=" + str3 + ", newPinConfirmationIsValid=" + z6 + ", isNewPinConfirmationVisible=" + z7 + ", isLoading=" + z8 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeString(this.f35240z);
            parcel.writeInt(this.f35238A ? 1 : 0);
            parcel.writeParcelable(this.f35239B, i2);
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
        public /* synthetic */ State(java.lang.String r13, boolean r14, com.hansecom.abt.util.resourcesResolvers.StringValue r15, boolean r16, java.lang.String r17, boolean r18, boolean r19, java.lang.String r20, boolean r21, boolean r22, boolean r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
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
                r4 = 1
                if (r3 == 0) goto L_0x0012
                r3 = r4
                goto L_0x0013
            L_0x0012:
                r3 = r14
            L_0x0013:
                r5 = r0 & 4
                if (r5 == 0) goto L_0x001e
                com.hansecom.abt.util.resourcesResolvers.StringValue$Companion r5 = com.hansecom.abt.util.resourcesResolvers.StringValue.Companion
                com.hansecom.abt.util.resourcesResolvers.StringValue r5 = r5.a()
                goto L_0x001f
            L_0x001e:
                r5 = r15
            L_0x001f:
                r6 = r0 & 8
                r7 = 0
                if (r6 == 0) goto L_0x0026
                r6 = r7
                goto L_0x0028
            L_0x0026:
                r6 = r16
            L_0x0028:
                r8 = r0 & 16
                if (r8 == 0) goto L_0x002e
                r8 = r2
                goto L_0x0030
            L_0x002e:
                r8 = r17
            L_0x0030:
                r9 = r0 & 32
                if (r9 == 0) goto L_0x0036
                r9 = r4
                goto L_0x0038
            L_0x0036:
                r9 = r18
            L_0x0038:
                r10 = r0 & 64
                if (r10 == 0) goto L_0x003e
                r10 = r7
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
                r4 = r21
            L_0x004e:
                r11 = r0 & 512(0x200, float:7.175E-43)
                if (r11 == 0) goto L_0x0054
                r11 = r7
                goto L_0x0056
            L_0x0054:
                r11 = r22
            L_0x0056:
                r0 = r0 & 1024(0x400, float:1.435E-42)
                if (r0 == 0) goto L_0x005b
                goto L_0x005d
            L_0x005b:
                r7 = r23
            L_0x005d:
                r13 = r12
                r14 = r1
                r15 = r3
                r16 = r5
                r17 = r6
                r18 = r8
                r19 = r9
                r20 = r10
                r21 = r2
                r22 = r4
                r23 = r11
                r24 = r7
                r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPin.State.<init>(java.lang.String, boolean, com.hansecom.abt.util.resourcesResolvers.StringValue, boolean, java.lang.String, boolean, boolean, java.lang.String, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
