package com.hansecom.abt.presentation.screens.home.faremedia.cardInformation;

import android.os.Parcel;
import android.os.Parcelable;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;

@Metadata
public interface CardInformation {

    @Metadata
    public interface Action {

        @Metadata
        public static final class NicknameChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f36423a;

            public NicknameChange(String str) {
                Intrinsics.i(str, "value");
                this.f36423a = str;
            }

            public final String a() {
                return this.f36423a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NicknameChange) && Intrinsics.d(this.f36423a, ((NicknameChange) obj).f36423a);
            }

            public int hashCode() {
                return this.f36423a.hashCode();
            }

            public String toString() {
                String str = this.f36423a;
                return "NicknameChange(value=" + str + ")";
            }
        }

        @Metadata
        public static final class NicknameSave implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final NicknameSave f36424a = new NicknameSave();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof NicknameSave);
            }

            public int hashCode() {
                return -1350194959;
            }

            public String toString() {
                return "NicknameSave";
            }
        }
    }

    @Metadata
    public interface Effect {

        @Metadata
        public static final class Error implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final StringValue f36425a;

            public Error(StringValue stringValue) {
                Intrinsics.i(stringValue, "message");
                this.f36425a = stringValue;
            }

            public final StringValue a() {
                return this.f36425a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.d(this.f36425a, ((Error) obj).f36425a);
            }

            public int hashCode() {
                return this.f36425a.hashCode();
            }

            public String toString() {
                StringValue stringValue = this.f36425a;
                return "Error(message=" + stringValue + ")";
            }
        }

        @Metadata
        public static final class Success implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final String f36426a;

            public Success(String str) {
                Intrinsics.i(str, "nickname");
                this.f36426a = str;
            }

            public final String a() {
                return this.f36426a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Success) && Intrinsics.d(this.f36426a, ((Success) obj).f36426a);
            }

            public int hashCode() {
                return this.f36426a.hashCode();
            }

            public String toString() {
                String str = this.f36426a;
                return "Success(nickname=" + str + ")";
            }
        }
    }

    @Metadata
    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new Creator();

        /* renamed from: A  reason: collision with root package name */
        public final String f36427A;

        /* renamed from: B  reason: collision with root package name */
        public final String f36428B;
        public final String C;
        public final String D;
        public final BigDecimal E;
        public final ImmutableList F;
        public final String G;
        public final StringValue H;
        public final boolean I;

        /* renamed from: z  reason: collision with root package name */
        public final boolean f36429z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<State> {
            /* renamed from: a */
            public final State createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                return new State(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), ExtensionsKt.e(parcel.createStringArrayList()), parcel.readString(), (StringValue) parcel.readParcelable(State.class.getClassLoader()), parcel.readInt() != 0);
            }

            /* renamed from: b */
            public final State[] newArray(int i2) {
                return new State[i2];
            }
        }

        public State(boolean z2, String str, String str2, String str3, String str4, BigDecimal bigDecimal, ImmutableList immutableList, String str5, StringValue stringValue, boolean z3) {
            Intrinsics.i(str, "title");
            Intrinsics.i(str2, "cardHolder");
            Intrinsics.i(str3, "cardNumber");
            Intrinsics.i(str4, "riderType");
            Intrinsics.i(bigDecimal, "balance");
            Intrinsics.i(immutableList, "institutions");
            Intrinsics.i(str5, "nickname");
            Intrinsics.i(stringValue, "nicknameError");
            this.f36429z = z2;
            this.f36427A = str;
            this.f36428B = str2;
            this.C = str3;
            this.D = str4;
            this.E = bigDecimal;
            this.F = immutableList;
            this.G = str5;
            this.H = stringValue;
            this.I = z3;
        }

        public static /* synthetic */ State b(State state, boolean z2, String str, String str2, String str3, String str4, BigDecimal bigDecimal, ImmutableList immutableList, String str5, StringValue stringValue, boolean z3, int i2, Object obj) {
            State state2 = state;
            int i3 = i2;
            return state.a((i3 & 1) != 0 ? state2.f36429z : z2, (i3 & 2) != 0 ? state2.f36427A : str, (i3 & 4) != 0 ? state2.f36428B : str2, (i3 & 8) != 0 ? state2.C : str3, (i3 & 16) != 0 ? state2.D : str4, (i3 & 32) != 0 ? state2.E : bigDecimal, (i3 & 64) != 0 ? state2.F : immutableList, (i3 & 128) != 0 ? state2.G : str5, (i3 & 256) != 0 ? state2.H : stringValue, (i3 & 512) != 0 ? state2.I : z3);
        }

        public final State a(boolean z2, String str, String str2, String str3, String str4, BigDecimal bigDecimal, ImmutableList immutableList, String str5, StringValue stringValue, boolean z3) {
            Intrinsics.i(str, "title");
            Intrinsics.i(str2, "cardHolder");
            String str6 = str3;
            Intrinsics.i(str6, "cardNumber");
            String str7 = str4;
            Intrinsics.i(str7, "riderType");
            BigDecimal bigDecimal2 = bigDecimal;
            Intrinsics.i(bigDecimal2, "balance");
            ImmutableList immutableList2 = immutableList;
            Intrinsics.i(immutableList2, "institutions");
            String str8 = str5;
            Intrinsics.i(str8, "nickname");
            StringValue stringValue2 = stringValue;
            Intrinsics.i(stringValue2, "nicknameError");
            return new State(z2, str, str2, str6, str7, bigDecimal2, immutableList2, str8, stringValue2, z3);
        }

        public final BigDecimal c() {
            return this.E;
        }

        public final String d() {
            return this.f36428B;
        }

        public final int describeContents() {
            return 0;
        }

        public final String e() {
            return this.C;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return this.f36429z == state.f36429z && Intrinsics.d(this.f36427A, state.f36427A) && Intrinsics.d(this.f36428B, state.f36428B) && Intrinsics.d(this.C, state.C) && Intrinsics.d(this.D, state.D) && Intrinsics.d(this.E, state.E) && Intrinsics.d(this.F, state.F) && Intrinsics.d(this.G, state.G) && Intrinsics.d(this.H, state.H) && this.I == state.I;
        }

        public final ImmutableList f() {
            return this.F;
        }

        public final String g() {
            return this.G;
        }

        public final StringValue h() {
            return this.H;
        }

        public int hashCode() {
            return (((((((((((((((((Boolean.hashCode(this.f36429z) * 31) + this.f36427A.hashCode()) * 31) + this.f36428B.hashCode()) * 31) + this.C.hashCode()) * 31) + this.D.hashCode()) * 31) + this.E.hashCode()) * 31) + this.F.hashCode()) * 31) + this.G.hashCode()) * 31) + this.H.hashCode()) * 31) + Boolean.hashCode(this.I);
        }

        public final String i() {
            return this.D;
        }

        public final String j() {
            return this.f36427A;
        }

        public final boolean k() {
            return this.f36429z;
        }

        public final boolean l() {
            return this.I;
        }

        public String toString() {
            boolean z2 = this.f36429z;
            String str = this.f36427A;
            String str2 = this.f36428B;
            String str3 = this.C;
            String str4 = this.D;
            BigDecimal bigDecimal = this.E;
            ImmutableList immutableList = this.F;
            String str5 = this.G;
            StringValue stringValue = this.H;
            boolean z3 = this.I;
            return "State(isInitLoading=" + z2 + ", title=" + str + ", cardHolder=" + str2 + ", cardNumber=" + str3 + ", riderType=" + str4 + ", balance=" + bigDecimal + ", institutions=" + immutableList + ", nickname=" + str5 + ", nicknameError=" + stringValue + ", isLoading=" + z3 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeInt(this.f36429z ? 1 : 0);
            parcel.writeString(this.f36427A);
            parcel.writeString(this.f36428B);
            parcel.writeString(this.C);
            parcel.writeString(this.D);
            parcel.writeSerializable(this.E);
            parcel.writeStringList(this.F);
            parcel.writeString(this.G);
            parcel.writeParcelable(this.H, i2);
            parcel.writeInt(this.I ? 1 : 0);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ State(boolean r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.math.BigDecimal r17, kotlinx.collections.immutable.ImmutableList r18, java.lang.String r19, com.hansecom.abt.util.resourcesResolvers.StringValue r20, boolean r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
            /*
                r11 = this;
                r0 = r22
                r1 = r0 & 1
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r1 = r2
                goto L_0x000a
            L_0x0009:
                r1 = r12
            L_0x000a:
                r3 = r0 & 2
                java.lang.String r4 = ""
                if (r3 == 0) goto L_0x0012
                r3 = r4
                goto L_0x0013
            L_0x0012:
                r3 = r13
            L_0x0013:
                r5 = r0 & 4
                if (r5 == 0) goto L_0x0019
                r5 = r4
                goto L_0x001a
            L_0x0019:
                r5 = r14
            L_0x001a:
                r6 = r0 & 8
                if (r6 == 0) goto L_0x0020
                r6 = r4
                goto L_0x0021
            L_0x0020:
                r6 = r15
            L_0x0021:
                r7 = r0 & 16
                if (r7 == 0) goto L_0x0027
                r7 = r4
                goto L_0x0029
            L_0x0027:
                r7 = r16
            L_0x0029:
                r8 = r0 & 32
                if (r8 == 0) goto L_0x0030
                java.math.BigDecimal r8 = java.math.BigDecimal.ZERO
                goto L_0x0032
            L_0x0030:
                r8 = r17
            L_0x0032:
                r9 = r0 & 64
                if (r9 == 0) goto L_0x003b
                kotlinx.collections.immutable.PersistentList r9 = kotlinx.collections.immutable.ExtensionsKt.a()
                goto L_0x003d
            L_0x003b:
                r9 = r18
            L_0x003d:
                r10 = r0 & 128(0x80, float:1.794E-43)
                if (r10 == 0) goto L_0x0042
                goto L_0x0044
            L_0x0042:
                r4 = r19
            L_0x0044:
                r10 = r0 & 256(0x100, float:3.59E-43)
                if (r10 == 0) goto L_0x004f
                com.hansecom.abt.util.resourcesResolvers.StringValue$Companion r10 = com.hansecom.abt.util.resourcesResolvers.StringValue.Companion
                com.hansecom.abt.util.resourcesResolvers.StringValue r10 = r10.a()
                goto L_0x0051
            L_0x004f:
                r10 = r20
            L_0x0051:
                r0 = r0 & 512(0x200, float:7.175E-43)
                if (r0 == 0) goto L_0x0056
                goto L_0x0058
            L_0x0056:
                r2 = r21
            L_0x0058:
                r12 = r11
                r13 = r1
                r14 = r3
                r15 = r5
                r16 = r6
                r17 = r7
                r18 = r8
                r19 = r9
                r20 = r4
                r21 = r10
                r22 = r2
                r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.CardInformation.State.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.math.BigDecimal, kotlinx.collections.immutable.ImmutableList, java.lang.String, com.hansecom.abt.util.resourcesResolvers.StringValue, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
