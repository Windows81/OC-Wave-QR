package com.hansecom.abt.presentation.screens.home.faremedia.linkCard;

import android.os.Parcel;
import android.os.Parcelable;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public interface FareMediaLinkCard {

    @Metadata
    public interface Action {

        @Metadata
        public static final class CardNumberChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f36912a;

            public CardNumberChange(String str) {
                Intrinsics.i(str, "value");
                this.f36912a = str;
            }

            public final String a() {
                return this.f36912a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CardNumberChange) && Intrinsics.d(this.f36912a, ((CardNumberChange) obj).f36912a);
            }

            public int hashCode() {
                return this.f36912a.hashCode();
            }

            public String toString() {
                String str = this.f36912a;
                return "CardNumberChange(value=" + str + ")";
            }
        }

        @Metadata
        public static final class CodeChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f36913a;

            public CodeChange(String str) {
                Intrinsics.i(str, "value");
                this.f36913a = str;
            }

            public final String a() {
                return this.f36913a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CodeChange) && Intrinsics.d(this.f36913a, ((CodeChange) obj).f36913a);
            }

            public int hashCode() {
                return this.f36913a.hashCode();
            }

            public String toString() {
                String str = this.f36913a;
                return "CodeChange(value=" + str + ")";
            }
        }

        @Metadata
        public static final class Confirm implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final Confirm f36914a = new Confirm();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Confirm);
            }

            public int hashCode() {
                return 243283756;
            }

            public String toString() {
                return "Confirm";
            }
        }

        @Metadata
        public static final class NickNameChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f36915a;

            public NickNameChange(String str) {
                Intrinsics.i(str, "value");
                this.f36915a = str;
            }

            public final String a() {
                return this.f36915a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NickNameChange) && Intrinsics.d(this.f36915a, ((NickNameChange) obj).f36915a);
            }

            public int hashCode() {
                return this.f36915a.hashCode();
            }

            public String toString() {
                String str = this.f36915a;
                return "NickNameChange(value=" + str + ")";
            }
        }
    }

    @Metadata
    public interface Effect {

        @Metadata
        public static final class Error implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final StringValue f36916a;

            public Error(StringValue stringValue) {
                Intrinsics.i(stringValue, "message");
                this.f36916a = stringValue;
            }

            public final StringValue a() {
                return this.f36916a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.d(this.f36916a, ((Error) obj).f36916a);
            }

            public int hashCode() {
                return this.f36916a.hashCode();
            }

            public String toString() {
                StringValue stringValue = this.f36916a;
                return "Error(message=" + stringValue + ")";
            }
        }

        @Metadata
        public static final class Success implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final Success f36917a = new Success();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Success);
            }

            public int hashCode() {
                return 6570186;
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
        public final StringValue f36918A;

        /* renamed from: B  reason: collision with root package name */
        public final String f36919B;
        public final StringValue C;
        public final int D;
        public final String E;
        public final StringValue F;
        public final boolean G;

        /* renamed from: z  reason: collision with root package name */
        public final String f36920z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<State> {
            /* renamed from: a */
            public final State createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                Class<State> cls = State.class;
                return new State(parcel.readString(), (StringValue) parcel.readParcelable(cls.getClassLoader()), parcel.readString(), (StringValue) parcel.readParcelable(cls.getClassLoader()), parcel.readInt(), parcel.readString(), (StringValue) parcel.readParcelable(cls.getClassLoader()), parcel.readInt() != 0);
            }

            /* renamed from: b */
            public final State[] newArray(int i2) {
                return new State[i2];
            }
        }

        public State(String str, StringValue stringValue, String str2, StringValue stringValue2, int i2, String str3, StringValue stringValue3, boolean z2) {
            Intrinsics.i(str, "nickName");
            Intrinsics.i(stringValue, "nickNameError");
            Intrinsics.i(str2, "cardNumber");
            Intrinsics.i(stringValue2, "cardNumberError");
            Intrinsics.i(str3, "code");
            Intrinsics.i(stringValue3, "codeError");
            this.f36920z = str;
            this.f36918A = stringValue;
            this.f36919B = str2;
            this.C = stringValue2;
            this.D = i2;
            this.E = str3;
            this.F = stringValue3;
            this.G = z2;
        }

        public static /* synthetic */ State b(State state, String str, StringValue stringValue, String str2, StringValue stringValue2, int i2, String str3, StringValue stringValue3, boolean z2, int i3, Object obj) {
            State state2 = state;
            int i4 = i3;
            return state.a((i4 & 1) != 0 ? state2.f36920z : str, (i4 & 2) != 0 ? state2.f36918A : stringValue, (i4 & 4) != 0 ? state2.f36919B : str2, (i4 & 8) != 0 ? state2.C : stringValue2, (i4 & 16) != 0 ? state2.D : i2, (i4 & 32) != 0 ? state2.E : str3, (i4 & 64) != 0 ? state2.F : stringValue3, (i4 & 128) != 0 ? state2.G : z2);
        }

        public final State a(String str, StringValue stringValue, String str2, StringValue stringValue2, int i2, String str3, StringValue stringValue3, boolean z2) {
            Intrinsics.i(str, "nickName");
            Intrinsics.i(stringValue, "nickNameError");
            Intrinsics.i(str2, "cardNumber");
            Intrinsics.i(stringValue2, "cardNumberError");
            String str4 = str3;
            Intrinsics.i(str4, "code");
            StringValue stringValue4 = stringValue3;
            Intrinsics.i(stringValue4, "codeError");
            return new State(str, stringValue, str2, stringValue2, i2, str4, stringValue4, z2);
        }

        public final String c() {
            return this.f36919B;
        }

        public final StringValue d() {
            return this.C;
        }

        public final int describeContents() {
            return 0;
        }

        public final int e() {
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
            return Intrinsics.d(this.f36920z, state.f36920z) && Intrinsics.d(this.f36918A, state.f36918A) && Intrinsics.d(this.f36919B, state.f36919B) && Intrinsics.d(this.C, state.C) && this.D == state.D && Intrinsics.d(this.E, state.E) && Intrinsics.d(this.F, state.F) && this.G == state.G;
        }

        public final String f() {
            return this.E;
        }

        public final StringValue g() {
            return this.F;
        }

        public final String h() {
            return this.f36920z;
        }

        public int hashCode() {
            return (((((((((((((this.f36920z.hashCode() * 31) + this.f36918A.hashCode()) * 31) + this.f36919B.hashCode()) * 31) + this.C.hashCode()) * 31) + Integer.hashCode(this.D)) * 31) + this.E.hashCode()) * 31) + this.F.hashCode()) * 31) + Boolean.hashCode(this.G);
        }

        public final StringValue i() {
            return this.f36918A;
        }

        public final boolean j() {
            return this.G;
        }

        public String toString() {
            String str = this.f36920z;
            StringValue stringValue = this.f36918A;
            String str2 = this.f36919B;
            StringValue stringValue2 = this.C;
            int i2 = this.D;
            String str3 = this.E;
            StringValue stringValue3 = this.F;
            boolean z2 = this.G;
            return "State(nickName=" + str + ", nickNameError=" + stringValue + ", cardNumber=" + str2 + ", cardNumberError=" + stringValue2 + ", cardNumberLength=" + i2 + ", code=" + str3 + ", codeError=" + stringValue3 + ", isLoading=" + z2 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeString(this.f36920z);
            parcel.writeParcelable(this.f36918A, i2);
            parcel.writeString(this.f36919B);
            parcel.writeParcelable(this.C, i2);
            parcel.writeInt(this.D);
            parcel.writeString(this.E);
            parcel.writeParcelable(this.F, i2);
            parcel.writeInt(this.G ? 1 : 0);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ State(java.lang.String r9, com.hansecom.abt.util.resourcesResolvers.StringValue r10, java.lang.String r11, com.hansecom.abt.util.resourcesResolvers.StringValue r12, int r13, java.lang.String r14, com.hansecom.abt.util.resourcesResolvers.StringValue r15, boolean r16, int r17, kotlin.jvm.internal.DefaultConstructorMarker r18) {
            /*
                r8 = this;
                r0 = r17
                r1 = r0 & 1
                java.lang.String r2 = ""
                if (r1 == 0) goto L_0x000a
                r1 = r2
                goto L_0x000b
            L_0x000a:
                r1 = r9
            L_0x000b:
                r3 = r0 & 2
                if (r3 == 0) goto L_0x0016
                com.hansecom.abt.util.resourcesResolvers.StringValue$Companion r3 = com.hansecom.abt.util.resourcesResolvers.StringValue.Companion
                com.hansecom.abt.util.resourcesResolvers.StringValue r3 = r3.a()
                goto L_0x0017
            L_0x0016:
                r3 = r10
            L_0x0017:
                r4 = r0 & 4
                if (r4 == 0) goto L_0x001d
                r4 = r2
                goto L_0x001e
            L_0x001d:
                r4 = r11
            L_0x001e:
                r5 = r0 & 8
                if (r5 == 0) goto L_0x0029
                com.hansecom.abt.util.resourcesResolvers.StringValue$Companion r5 = com.hansecom.abt.util.resourcesResolvers.StringValue.Companion
                com.hansecom.abt.util.resourcesResolvers.StringValue r5 = r5.a()
                goto L_0x002a
            L_0x0029:
                r5 = r12
            L_0x002a:
                r6 = r0 & 16
                if (r6 == 0) goto L_0x0031
                r6 = 20
                goto L_0x0032
            L_0x0031:
                r6 = r13
            L_0x0032:
                r7 = r0 & 32
                if (r7 == 0) goto L_0x0037
                goto L_0x0038
            L_0x0037:
                r2 = r14
            L_0x0038:
                r7 = r0 & 64
                if (r7 == 0) goto L_0x0043
                com.hansecom.abt.util.resourcesResolvers.StringValue$Companion r7 = com.hansecom.abt.util.resourcesResolvers.StringValue.Companion
                com.hansecom.abt.util.resourcesResolvers.StringValue r7 = r7.a()
                goto L_0x0044
            L_0x0043:
                r7 = r15
            L_0x0044:
                r0 = r0 & 128(0x80, float:1.794E-43)
                if (r0 == 0) goto L_0x004a
                r0 = 0
                goto L_0x004c
            L_0x004a:
                r0 = r16
            L_0x004c:
                r9 = r8
                r10 = r1
                r11 = r3
                r12 = r4
                r13 = r5
                r14 = r6
                r15 = r2
                r16 = r7
                r17 = r0
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.linkCard.FareMediaLinkCard.State.<init>(java.lang.String, com.hansecom.abt.util.resourcesResolvers.StringValue, java.lang.String, com.hansecom.abt.util.resourcesResolvers.StringValue, int, java.lang.String, com.hansecom.abt.util.resourcesResolvers.StringValue, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
