package com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource;

import android.os.Parcel;
import android.os.Parcelable;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;

@Metadata
public interface AddPaymentMethodCyberSource {

    @Metadata
    public interface Action {

        @Metadata
        public static final class Confirm implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final Confirm f35541a = new Confirm();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Confirm);
            }

            public int hashCode() {
                return -1043044969;
            }

            public String toString() {
                return "Confirm";
            }
        }

        @Metadata
        public static final class NicknameChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f35542a;

            public NicknameChange(String str) {
                Intrinsics.i(str, "value");
                this.f35542a = str;
            }

            public final String a() {
                return this.f35542a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NicknameChange) && Intrinsics.d(this.f35542a, ((NicknameChange) obj).f35542a);
            }

            public int hashCode() {
                return this.f35542a.hashCode();
            }

            public String toString() {
                String str = this.f35542a;
                return "NicknameChange(value=" + str + ")";
            }
        }

        @Metadata
        public static final class OnCardAddedInWebView implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final OnCardAddedInWebView f35543a = new OnCardAddedInWebView();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof OnCardAddedInWebView);
            }

            public int hashCode() {
                return 655190028;
            }

            public String toString() {
                return "OnCardAddedInWebView";
            }
        }
    }

    @Metadata
    public interface Effect {

        @Metadata
        public static final class Error implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final StringValue f35544a;

            public Error(StringValue stringValue) {
                Intrinsics.i(stringValue, "message");
                this.f35544a = stringValue;
            }

            public final StringValue a() {
                return this.f35544a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.d(this.f35544a, ((Error) obj).f35544a);
            }

            public int hashCode() {
                return this.f35544a.hashCode();
            }

            public String toString() {
                StringValue stringValue = this.f35544a;
                return "Error(message=" + stringValue + ")";
            }
        }

        @Metadata
        public static final class InitialLoadingError implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final StringValue f35545a;

            public final StringValue a() {
                return this.f35545a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InitialLoadingError) && Intrinsics.d(this.f35545a, ((InitialLoadingError) obj).f35545a);
            }

            public int hashCode() {
                return this.f35545a.hashCode();
            }

            public String toString() {
                StringValue stringValue = this.f35545a;
                return "InitialLoadingError(message=" + stringValue + ")";
            }
        }

        @Metadata
        public static final class Success implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final Success f35546a = new Success();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Success);
            }

            public int hashCode() {
                return -1279758539;
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
        public final String f35547A;

        /* renamed from: B  reason: collision with root package name */
        public final String f35548B;
        public final boolean C;
        public final boolean D;

        /* renamed from: z  reason: collision with root package name */
        public final String f35549z;

        @Metadata
        public static final class ChooseCountry implements Parcelable {
            public static final Parcelable.Creator<ChooseCountry> CREATOR = new Creator();

            /* renamed from: A  reason: collision with root package name */
            public final String f35550A;

            /* renamed from: z  reason: collision with root package name */
            public final ImmutableList f35551z;

            @Metadata
            public static final class Creator implements Parcelable.Creator<ChooseCountry> {
                /* renamed from: a */
                public final ChooseCountry createFromParcel(Parcel parcel) {
                    Intrinsics.i(parcel, "parcel");
                    return new ChooseCountry(ExtensionsKt.e(parcel.createStringArrayList()), parcel.readString());
                }

                /* renamed from: b */
                public final ChooseCountry[] newArray(int i2) {
                    return new ChooseCountry[i2];
                }
            }

            public ChooseCountry(ImmutableList immutableList, String str) {
                Intrinsics.i(immutableList, "countries");
                Intrinsics.i(str, "filter");
                this.f35551z = immutableList;
                this.f35550A = str;
            }

            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ChooseCountry)) {
                    return false;
                }
                ChooseCountry chooseCountry = (ChooseCountry) obj;
                return Intrinsics.d(this.f35551z, chooseCountry.f35551z) && Intrinsics.d(this.f35550A, chooseCountry.f35550A);
            }

            public int hashCode() {
                return (this.f35551z.hashCode() * 31) + this.f35550A.hashCode();
            }

            public String toString() {
                ImmutableList immutableList = this.f35551z;
                String str = this.f35550A;
                return "ChooseCountry(countries=" + immutableList + ", filter=" + str + ")";
            }

            public final void writeToParcel(Parcel parcel, int i2) {
                Intrinsics.i(parcel, "dest");
                parcel.writeStringList(this.f35551z);
                parcel.writeString(this.f35550A);
            }
        }

        @Metadata
        public static final class ChooseState implements Parcelable {
            public static final Parcelable.Creator<ChooseState> CREATOR = new Creator();

            /* renamed from: A  reason: collision with root package name */
            public final String f35552A;

            /* renamed from: z  reason: collision with root package name */
            public final ImmutableList f35553z;

            @Metadata
            public static final class Creator implements Parcelable.Creator<ChooseState> {
                /* renamed from: a */
                public final ChooseState createFromParcel(Parcel parcel) {
                    Intrinsics.i(parcel, "parcel");
                    return new ChooseState(ExtensionsKt.e(parcel.createStringArrayList()), parcel.readString());
                }

                /* renamed from: b */
                public final ChooseState[] newArray(int i2) {
                    return new ChooseState[i2];
                }
            }

            public ChooseState(ImmutableList immutableList, String str) {
                Intrinsics.i(immutableList, "states");
                Intrinsics.i(str, "filter");
                this.f35553z = immutableList;
                this.f35552A = str;
            }

            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ChooseState)) {
                    return false;
                }
                ChooseState chooseState = (ChooseState) obj;
                return Intrinsics.d(this.f35553z, chooseState.f35553z) && Intrinsics.d(this.f35552A, chooseState.f35552A);
            }

            public int hashCode() {
                return (this.f35553z.hashCode() * 31) + this.f35552A.hashCode();
            }

            public String toString() {
                ImmutableList immutableList = this.f35553z;
                String str = this.f35552A;
                return "ChooseState(states=" + immutableList + ", filter=" + str + ")";
            }

            public final void writeToParcel(Parcel parcel, int i2) {
                Intrinsics.i(parcel, "dest");
                parcel.writeStringList(this.f35553z);
                parcel.writeString(this.f35552A);
            }
        }

        @Metadata
        public static final class Creator implements Parcelable.Creator<State> {
            /* renamed from: a */
            public final State createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                boolean z2 = true;
                boolean z3 = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                return new State(readString, readString2, readString3, z3, z2);
            }

            /* renamed from: b */
            public final State[] newArray(int i2) {
                return new State[i2];
            }
        }

        public State(String str, String str2, String str3, boolean z2, boolean z3) {
            Intrinsics.i(str, "nickName");
            Intrinsics.i(str2, "cardNumber");
            this.f35549z = str;
            this.f35547A = str2;
            this.f35548B = str3;
            this.C = z2;
            this.D = z3;
        }

        public static /* synthetic */ State b(State state, String str, String str2, String str3, boolean z2, boolean z3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = state.f35549z;
            }
            if ((i2 & 2) != 0) {
                str2 = state.f35547A;
            }
            String str4 = str2;
            if ((i2 & 4) != 0) {
                str3 = state.f35548B;
            }
            String str5 = str3;
            if ((i2 & 8) != 0) {
                z2 = state.C;
            }
            boolean z4 = z2;
            if ((i2 & 16) != 0) {
                z3 = state.D;
            }
            return state.a(str, str4, str5, z4, z3);
        }

        public final State a(String str, String str2, String str3, boolean z2, boolean z3) {
            Intrinsics.i(str, "nickName");
            Intrinsics.i(str2, "cardNumber");
            return new State(str, str2, str3, z2, z3);
        }

        public final String c() {
            return this.f35547A;
        }

        public final String d() {
            return this.f35548B;
        }

        public final int describeContents() {
            return 0;
        }

        public final String e() {
            return this.f35549z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return Intrinsics.d(this.f35549z, state.f35549z) && Intrinsics.d(this.f35547A, state.f35547A) && Intrinsics.d(this.f35548B, state.f35548B) && this.C == state.C && this.D == state.D;
        }

        public final boolean f() {
            return this.D;
        }

        public int hashCode() {
            int hashCode = ((this.f35549z.hashCode() * 31) + this.f35547A.hashCode()) * 31;
            String str = this.f35548B;
            return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.C)) * 31) + Boolean.hashCode(this.D);
        }

        public String toString() {
            String str = this.f35549z;
            String str2 = this.f35547A;
            String str3 = this.f35548B;
            boolean z2 = this.C;
            boolean z3 = this.D;
            return "State(nickName=" + str + ", cardNumber=" + str2 + ", htmlPage=" + str3 + ", isCardInfoFilled=" + z2 + ", isLoading=" + z3 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeString(this.f35549z);
            parcel.writeString(this.f35547A);
            parcel.writeString(this.f35548B);
            parcel.writeInt(this.C ? 1 : 0);
            parcel.writeInt(this.D ? 1 : 0);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ State(java.lang.String r4, java.lang.String r5, java.lang.String r6, boolean r7, boolean r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
            /*
                r3 = this;
                r10 = r9 & 1
                java.lang.String r0 = ""
                if (r10 == 0) goto L_0x0008
                r10 = r0
                goto L_0x0009
            L_0x0008:
                r10 = r4
            L_0x0009:
                r4 = r9 & 2
                if (r4 == 0) goto L_0x000e
                goto L_0x000f
            L_0x000e:
                r0 = r5
            L_0x000f:
                r4 = r9 & 4
                if (r4 == 0) goto L_0x0014
                r6 = 0
            L_0x0014:
                r1 = r6
                r4 = r9 & 8
                r5 = 0
                if (r4 == 0) goto L_0x001c
                r2 = r5
                goto L_0x001d
            L_0x001c:
                r2 = r7
            L_0x001d:
                r4 = r9 & 16
                if (r4 == 0) goto L_0x0023
                r9 = r5
                goto L_0x0024
            L_0x0023:
                r9 = r8
            L_0x0024:
                r4 = r3
                r5 = r10
                r6 = r0
                r7 = r1
                r8 = r2
                r4.<init>(r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSource.State.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
