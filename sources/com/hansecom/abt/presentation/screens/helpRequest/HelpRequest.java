package com.hansecom.abt.presentation.screens.helpRequest;

import android.os.Parcel;
import android.os.Parcelable;
import com.hansecom.abt.data.config.help.HelpScreenConfig;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.PersistentList;

@Metadata
public interface HelpRequest {

    @Metadata
    public interface Action {

        @Metadata
        public static final class CardNumberChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f34822a;

            public CardNumberChange(String str) {
                Intrinsics.i(str, "value");
                this.f34822a = str;
            }

            public final String a() {
                return this.f34822a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CardNumberChange) && Intrinsics.d(this.f34822a, ((CardNumberChange) obj).f34822a);
            }

            public int hashCode() {
                return this.f34822a.hashCode();
            }

            public String toString() {
                String str = this.f34822a;
                return "CardNumberChange(value=" + str + ")";
            }
        }

        @Metadata
        public static final class CardNumberOpenSelector implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final boolean f34823a;

            public CardNumberOpenSelector(boolean z2) {
                this.f34823a = z2;
            }

            public final boolean a() {
                return this.f34823a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CardNumberOpenSelector) && this.f34823a == ((CardNumberOpenSelector) obj).f34823a;
            }

            public int hashCode() {
                return Boolean.hashCode(this.f34823a);
            }

            public String toString() {
                boolean z2 = this.f34823a;
                return "CardNumberOpenSelector(open=" + z2 + ")";
            }
        }

        @Metadata
        public static final class CardNumberSelect implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final CardNumberState f34824a;

            public CardNumberSelect(CardNumberState cardNumberState) {
                this.f34824a = cardNumberState;
            }

            public final CardNumberState a() {
                return this.f34824a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CardNumberSelect) && Intrinsics.d(this.f34824a, ((CardNumberSelect) obj).f34824a);
            }

            public int hashCode() {
                CardNumberState cardNumberState = this.f34824a;
                if (cardNumberState == null) {
                    return 0;
                }
                return cardNumberState.hashCode();
            }

            public String toString() {
                CardNumberState cardNumberState = this.f34824a;
                return "CardNumberSelect(value=" + cardNumberState + ")";
            }
        }

        @Metadata
        public static final class CaseCategoryChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f34825a;

            public CaseCategoryChange(String str) {
                Intrinsics.i(str, "value");
                this.f34825a = str;
            }

            public final String a() {
                return this.f34825a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CaseCategoryChange) && Intrinsics.d(this.f34825a, ((CaseCategoryChange) obj).f34825a);
            }

            public int hashCode() {
                return this.f34825a.hashCode();
            }

            public String toString() {
                String str = this.f34825a;
                return "CaseCategoryChange(value=" + str + ")";
            }
        }

        @Metadata
        public static final class CaseCategoryOpenSelector implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final boolean f34826a;

            public CaseCategoryOpenSelector(boolean z2) {
                this.f34826a = z2;
            }

            public final boolean a() {
                return this.f34826a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CaseCategoryOpenSelector) && this.f34826a == ((CaseCategoryOpenSelector) obj).f34826a;
            }

            public int hashCode() {
                return Boolean.hashCode(this.f34826a);
            }

            public String toString() {
                boolean z2 = this.f34826a;
                return "CaseCategoryOpenSelector(open=" + z2 + ")";
            }
        }

        @Metadata
        public static final class CaseReasonChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f34827a;

            public CaseReasonChange(String str) {
                Intrinsics.i(str, "value");
                this.f34827a = str;
            }

            public final String a() {
                return this.f34827a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CaseReasonChange) && Intrinsics.d(this.f34827a, ((CaseReasonChange) obj).f34827a);
            }

            public int hashCode() {
                return this.f34827a.hashCode();
            }

            public String toString() {
                String str = this.f34827a;
                return "CaseReasonChange(value=" + str + ")";
            }
        }

        @Metadata
        public static final class CaseReasonOpenSelector implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final boolean f34828a;

            public CaseReasonOpenSelector(boolean z2) {
                this.f34828a = z2;
            }

            public final boolean a() {
                return this.f34828a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CaseReasonOpenSelector) && this.f34828a == ((CaseReasonOpenSelector) obj).f34828a;
            }

            public int hashCode() {
                return Boolean.hashCode(this.f34828a);
            }

            public String toString() {
                boolean z2 = this.f34828a;
                return "CaseReasonOpenSelector(open=" + z2 + ")";
            }
        }

        @Metadata
        public static final class CaseResolutionChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f34829a;

            public CaseResolutionChange(String str) {
                Intrinsics.i(str, "value");
                this.f34829a = str;
            }

            public final String a() {
                return this.f34829a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CaseResolutionChange) && Intrinsics.d(this.f34829a, ((CaseResolutionChange) obj).f34829a);
            }

            public int hashCode() {
                return this.f34829a.hashCode();
            }

            public String toString() {
                String str = this.f34829a;
                return "CaseResolutionChange(value=" + str + ")";
            }
        }

        @Metadata
        public static final class CaseResolutionOpenSelector implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final boolean f34830a;

            public CaseResolutionOpenSelector(boolean z2) {
                this.f34830a = z2;
            }

            public final boolean a() {
                return this.f34830a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CaseResolutionOpenSelector) && this.f34830a == ((CaseResolutionOpenSelector) obj).f34830a;
            }

            public int hashCode() {
                return Boolean.hashCode(this.f34830a);
            }

            public String toString() {
                boolean z2 = this.f34830a;
                return "CaseResolutionOpenSelector(open=" + z2 + ")";
            }
        }

        @Metadata
        public static final class CloseSuccess implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final CloseSuccess f34831a = new CloseSuccess();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof CloseSuccess);
            }

            public int hashCode() {
                return 2066146922;
            }

            public String toString() {
                return "CloseSuccess";
            }
        }

        @Metadata
        public static final class ContactNameChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f34832a;

            public ContactNameChange(String str) {
                Intrinsics.i(str, "value");
                this.f34832a = str;
            }

            public final String a() {
                return this.f34832a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ContactNameChange) && Intrinsics.d(this.f34832a, ((ContactNameChange) obj).f34832a);
            }

            public int hashCode() {
                return this.f34832a.hashCode();
            }

            public String toString() {
                String str = this.f34832a;
                return "ContactNameChange(value=" + str + ")";
            }
        }

        @Metadata
        public static final class DescriptionChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f34833a;

            public DescriptionChange(String str) {
                Intrinsics.i(str, "value");
                this.f34833a = str;
            }

            public final String a() {
                return this.f34833a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DescriptionChange) && Intrinsics.d(this.f34833a, ((DescriptionChange) obj).f34833a);
            }

            public int hashCode() {
                return this.f34833a.hashCode();
            }

            public String toString() {
                String str = this.f34833a;
                return "DescriptionChange(value=" + str + ")";
            }
        }

        @Metadata
        public static final class EmailChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f34834a;

            public EmailChange(String str) {
                Intrinsics.i(str, "value");
                this.f34834a = str;
            }

            public final String a() {
                return this.f34834a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof EmailChange) && Intrinsics.d(this.f34834a, ((EmailChange) obj).f34834a);
            }

            public int hashCode() {
                return this.f34834a.hashCode();
            }

            public String toString() {
                String str = this.f34834a;
                return "EmailChange(value=" + str + ")";
            }
        }

        @Metadata
        public static final class PhoneChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f34835a;

            public PhoneChange(String str) {
                Intrinsics.i(str, "value");
                this.f34835a = str;
            }

            public final String a() {
                return this.f34835a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PhoneChange) && Intrinsics.d(this.f34835a, ((PhoneChange) obj).f34835a);
            }

            public int hashCode() {
                return this.f34835a.hashCode();
            }

            public String toString() {
                String str = this.f34835a;
                return "PhoneChange(value=" + str + ")";
            }
        }

        @Metadata
        public static final class Send implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final Send f34836a = new Send();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Send);
            }

            public int hashCode() {
                return 1090703879;
            }

            public String toString() {
                return "Send";
            }
        }

        @Metadata
        public static final class SubjectChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f34837a;

            public SubjectChange(String str) {
                Intrinsics.i(str, "value");
                this.f34837a = str;
            }

            public final String a() {
                return this.f34837a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SubjectChange) && Intrinsics.d(this.f34837a, ((SubjectChange) obj).f34837a);
            }

            public int hashCode() {
                return this.f34837a.hashCode();
            }

            public String toString() {
                String str = this.f34837a;
                return "SubjectChange(value=" + str + ")";
            }
        }
    }

    @Metadata
    public interface Effect {

        @Metadata
        public static final class Error implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final StringValue f34838a;

            public Error(StringValue stringValue) {
                Intrinsics.i(stringValue, "message");
                this.f34838a = stringValue;
            }

            public final StringValue a() {
                return this.f34838a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.d(this.f34838a, ((Error) obj).f34838a);
            }

            public int hashCode() {
                return this.f34838a.hashCode();
            }

            public String toString() {
                StringValue stringValue = this.f34838a;
                return "Error(message=" + stringValue + ")";
            }
        }

        @Metadata
        public static final class GoBack implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final GoBack f34839a = new GoBack();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof GoBack);
            }

            public int hashCode() {
                return 1327532275;
            }

            public String toString() {
                return "GoBack";
            }
        }
    }

    @Metadata
    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new Creator();

        /* renamed from: A  reason: collision with root package name */
        public final ImmutableList f34840A;

        /* renamed from: B  reason: collision with root package name */
        public final ImmutableList f34841B;
        public final ImmutableList C;
        public final ImmutableList D;
        public final String E;
        public final StringValue F;
        public final String G;
        public final StringValue H;
        public final String I;
        public final StringValue J;
        public final String K;
        public final StringValue L;
        public final String M;
        public final StringValue N;
        public final String O;
        public final CardNumberState P;
        public final boolean Q;
        public final StringValue R;
        public final boolean S;
        public final int T;
        public final String U;
        public final boolean V;
        public final StringValue W;
        public final String X;
        public final boolean Y;
        public final StringValue Z;
        public final String a0;
        public final boolean b0;
        public final StringValue c0;
        public final boolean d0;
        public final boolean e0;
        public final boolean f0;

        /* renamed from: z  reason: collision with root package name */
        public final HelpScreenConfig f34842z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<State> {
            /* renamed from: a */
            public final State createFromParcel(Parcel parcel) {
                Parcel parcel2 = parcel;
                Intrinsics.i(parcel2, "parcel");
                HelpScreenConfig createFromParcel = HelpScreenConfig.CREATOR.createFromParcel(parcel2);
                PersistentList e2 = ExtensionsKt.e(parcel.createStringArrayList());
                PersistentList e3 = ExtensionsKt.e(parcel.createStringArrayList());
                PersistentList e4 = ExtensionsKt.e(parcel.createStringArrayList());
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i2 = 0; i2 != readInt; i2++) {
                    arrayList.add(CardNumberState.CREATOR.createFromParcel(parcel2));
                }
                PersistentList e5 = ExtensionsKt.e(arrayList);
                Class<State> cls = State.class;
                return new State(createFromParcel, e2, e3, e4, e5, parcel.readString(), (StringValue) parcel2.readParcelable(cls.getClassLoader()), parcel.readString(), (StringValue) parcel2.readParcelable(cls.getClassLoader()), parcel.readString(), (StringValue) parcel2.readParcelable(cls.getClassLoader()), parcel.readString(), (StringValue) parcel2.readParcelable(cls.getClassLoader()), parcel.readString(), (StringValue) parcel2.readParcelable(cls.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : CardNumberState.CREATOR.createFromParcel(parcel2), parcel.readInt() != 0, (StringValue) parcel2.readParcelable(cls.getClassLoader()), parcel.readInt() != 0, parcel.readInt(), parcel.readString(), parcel.readInt() != 0, (StringValue) parcel2.readParcelable(cls.getClassLoader()), parcel.readString(), parcel.readInt() != 0, (StringValue) parcel2.readParcelable(cls.getClassLoader()), parcel.readString(), parcel.readInt() != 0, (StringValue) parcel2.readParcelable(cls.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* renamed from: b */
            public final State[] newArray(int i2) {
                return new State[i2];
            }
        }

        public State(HelpScreenConfig helpScreenConfig, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, ImmutableList immutableList4, String str, StringValue stringValue, String str2, StringValue stringValue2, String str3, StringValue stringValue3, String str4, StringValue stringValue4, String str5, StringValue stringValue5, String str6, CardNumberState cardNumberState, boolean z2, StringValue stringValue6, boolean z3, int i2, String str7, boolean z4, StringValue stringValue7, String str8, boolean z5, StringValue stringValue8, String str9, boolean z6, StringValue stringValue9, boolean z7, boolean z8, boolean z9) {
            HelpScreenConfig helpScreenConfig2 = helpScreenConfig;
            ImmutableList immutableList5 = immutableList;
            ImmutableList immutableList6 = immutableList2;
            ImmutableList immutableList7 = immutableList3;
            ImmutableList immutableList8 = immutableList4;
            String str10 = str;
            StringValue stringValue10 = stringValue;
            String str11 = str2;
            StringValue stringValue11 = stringValue2;
            String str12 = str3;
            StringValue stringValue12 = stringValue3;
            String str13 = str4;
            StringValue stringValue13 = stringValue4;
            String str14 = str5;
            String str15 = str6;
            Intrinsics.i(helpScreenConfig2, "config");
            Intrinsics.i(immutableList5, "caseReasons");
            Intrinsics.i(immutableList6, "caseCategories");
            Intrinsics.i(immutableList7, "caseResolutions");
            Intrinsics.i(immutableList8, "cardNumbers");
            Intrinsics.i(str10, "email");
            Intrinsics.i(stringValue10, "emailError");
            Intrinsics.i(str11, "subject");
            Intrinsics.i(stringValue11, "subjectError");
            Intrinsics.i(str12, "description");
            Intrinsics.i(stringValue12, "descriptionError");
            Intrinsics.i(str13, "contactName");
            Intrinsics.i(stringValue13, "contactNameError");
            Intrinsics.i(str14, "phoneNumber");
            Intrinsics.i(stringValue5, "phoneError");
            Intrinsics.i(str6, "cardNumber");
            Intrinsics.i(stringValue6, "cardNumberError");
            Intrinsics.i(str7, "caseReason");
            Intrinsics.i(stringValue7, "caseReasonError");
            Intrinsics.i(str8, "caseCategory");
            Intrinsics.i(stringValue8, "caseCategoryError");
            Intrinsics.i(str9, "caseResolution");
            Intrinsics.i(stringValue9, "caseResolutionError");
            this.f34842z = helpScreenConfig2;
            this.f34840A = immutableList5;
            this.f34841B = immutableList6;
            this.C = immutableList7;
            this.D = immutableList8;
            this.E = str10;
            this.F = stringValue10;
            this.G = str11;
            this.H = stringValue11;
            this.I = str12;
            this.J = stringValue12;
            this.K = str13;
            this.L = stringValue13;
            this.M = str14;
            this.N = stringValue5;
            this.O = str6;
            this.P = cardNumberState;
            this.Q = z2;
            this.R = stringValue6;
            this.S = z3;
            this.T = i2;
            this.U = str7;
            this.V = z4;
            this.W = stringValue7;
            this.X = str8;
            this.Y = z5;
            this.Z = stringValue8;
            this.a0 = str9;
            this.b0 = z6;
            this.c0 = stringValue9;
            this.d0 = z7;
            this.e0 = z8;
            this.f0 = z9;
        }

        public static /* synthetic */ State b(State state, HelpScreenConfig helpScreenConfig, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, ImmutableList immutableList4, String str, StringValue stringValue, String str2, StringValue stringValue2, String str3, StringValue stringValue3, String str4, StringValue stringValue4, String str5, StringValue stringValue5, String str6, CardNumberState cardNumberState, boolean z2, StringValue stringValue6, boolean z3, int i2, String str7, boolean z4, StringValue stringValue7, String str8, boolean z5, StringValue stringValue8, String str9, boolean z6, StringValue stringValue9, boolean z7, boolean z8, boolean z9, int i3, int i4, Object obj) {
            State state2 = state;
            int i5 = i3;
            return state.a((i5 & 1) != 0 ? state2.f34842z : helpScreenConfig, (i5 & 2) != 0 ? state2.f34840A : immutableList, (i5 & 4) != 0 ? state2.f34841B : immutableList2, (i5 & 8) != 0 ? state2.C : immutableList3, (i5 & 16) != 0 ? state2.D : immutableList4, (i5 & 32) != 0 ? state2.E : str, (i5 & 64) != 0 ? state2.F : stringValue, (i5 & 128) != 0 ? state2.G : str2, (i5 & 256) != 0 ? state2.H : stringValue2, (i5 & 512) != 0 ? state2.I : str3, (i5 & 1024) != 0 ? state2.J : stringValue3, (i5 & 2048) != 0 ? state2.K : str4, (i5 & 4096) != 0 ? state2.L : stringValue4, (i5 & 8192) != 0 ? state2.M : str5, (i5 & 16384) != 0 ? state2.N : stringValue5, (i5 & 32768) != 0 ? state2.O : str6, (i5 & 65536) != 0 ? state2.P : cardNumberState, (i5 & 131072) != 0 ? state2.Q : z2, (i5 & 262144) != 0 ? state2.R : stringValue6, (i5 & 524288) != 0 ? state2.S : z3, (i5 & 1048576) != 0 ? state2.T : i2, (i5 & 2097152) != 0 ? state2.U : str7, (i5 & 4194304) != 0 ? state2.V : z4, (i5 & 8388608) != 0 ? state2.W : stringValue7, (i5 & 16777216) != 0 ? state2.X : str8, (i5 & 33554432) != 0 ? state2.Y : z5, (i5 & 67108864) != 0 ? state2.Z : stringValue8, (i5 & 134217728) != 0 ? state2.a0 : str9, (i5 & 268435456) != 0 ? state2.b0 : z6, (i5 & 536870912) != 0 ? state2.c0 : stringValue9, (i5 & 1073741824) != 0 ? state2.d0 : z7, (i5 & Integer.MIN_VALUE) != 0 ? state2.e0 : z8, (i4 & 1) != 0 ? state2.f0 : z9);
        }

        public final String A() {
            return this.E;
        }

        public final StringValue B() {
            return this.F;
        }

        public final boolean C() {
            StringValue stringValue = this.F;
            StringValue.Companion companion = StringValue.Companion;
            return !Intrinsics.d(stringValue, companion.a()) || !Intrinsics.d(this.H, companion.a()) || !Intrinsics.d(this.J, companion.a()) || !Intrinsics.d(this.L, companion.a()) || !Intrinsics.d(this.N, companion.a()) || !Intrinsics.d(this.R, companion.a()) || !Intrinsics.d(this.W, companion.a()) || !Intrinsics.d(this.Z, companion.a()) || !Intrinsics.d(this.c0, companion.a());
        }

        public final StringValue D() {
            return this.N;
        }

        public final String F() {
            return this.M;
        }

        public final boolean G() {
            return this.S;
        }

        public final boolean H() {
            return this.d0;
        }

        public final boolean I() {
            return this.e0;
        }

        public final boolean J() {
            return this.f0;
        }

        public final String K() {
            return this.G;
        }

        public final StringValue L() {
            return this.H;
        }

        public final State a(HelpScreenConfig helpScreenConfig, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, ImmutableList immutableList4, String str, StringValue stringValue, String str2, StringValue stringValue2, String str3, StringValue stringValue3, String str4, StringValue stringValue4, String str5, StringValue stringValue5, String str6, CardNumberState cardNumberState, boolean z2, StringValue stringValue6, boolean z3, int i2, String str7, boolean z4, StringValue stringValue7, String str8, boolean z5, StringValue stringValue8, String str9, boolean z6, StringValue stringValue9, boolean z7, boolean z8, boolean z9) {
            HelpScreenConfig helpScreenConfig2 = helpScreenConfig;
            Intrinsics.i(helpScreenConfig2, "config");
            Intrinsics.i(immutableList, "caseReasons");
            Intrinsics.i(immutableList2, "caseCategories");
            Intrinsics.i(immutableList3, "caseResolutions");
            Intrinsics.i(immutableList4, "cardNumbers");
            Intrinsics.i(str, "email");
            Intrinsics.i(stringValue, "emailError");
            Intrinsics.i(str2, "subject");
            Intrinsics.i(stringValue2, "subjectError");
            Intrinsics.i(str3, "description");
            Intrinsics.i(stringValue3, "descriptionError");
            Intrinsics.i(str4, "contactName");
            Intrinsics.i(stringValue4, "contactNameError");
            Intrinsics.i(str5, "phoneNumber");
            Intrinsics.i(stringValue5, "phoneError");
            Intrinsics.i(str6, "cardNumber");
            Intrinsics.i(stringValue6, "cardNumberError");
            Intrinsics.i(str7, "caseReason");
            Intrinsics.i(stringValue7, "caseReasonError");
            Intrinsics.i(str8, "caseCategory");
            Intrinsics.i(stringValue8, "caseCategoryError");
            Intrinsics.i(str9, "caseResolution");
            Intrinsics.i(stringValue9, "caseResolutionError");
            return new State(helpScreenConfig2, immutableList, immutableList2, immutableList3, immutableList4, str, stringValue, str2, stringValue2, str3, stringValue3, str4, stringValue4, str5, stringValue5, str6, cardNumberState, z2, stringValue6, z3, i2, str7, z4, stringValue7, str8, z5, stringValue8, str9, z6, stringValue9, z7, z8, z9);
        }

        public final String c() {
            return this.O;
        }

        public final StringValue d() {
            return this.R;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean e() {
            return this.Q;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return Intrinsics.d(this.f34842z, state.f34842z) && Intrinsics.d(this.f34840A, state.f34840A) && Intrinsics.d(this.f34841B, state.f34841B) && Intrinsics.d(this.C, state.C) && Intrinsics.d(this.D, state.D) && Intrinsics.d(this.E, state.E) && Intrinsics.d(this.F, state.F) && Intrinsics.d(this.G, state.G) && Intrinsics.d(this.H, state.H) && Intrinsics.d(this.I, state.I) && Intrinsics.d(this.J, state.J) && Intrinsics.d(this.K, state.K) && Intrinsics.d(this.L, state.L) && Intrinsics.d(this.M, state.M) && Intrinsics.d(this.N, state.N) && Intrinsics.d(this.O, state.O) && Intrinsics.d(this.P, state.P) && this.Q == state.Q && Intrinsics.d(this.R, state.R) && this.S == state.S && this.T == state.T && Intrinsics.d(this.U, state.U) && this.V == state.V && Intrinsics.d(this.W, state.W) && Intrinsics.d(this.X, state.X) && this.Y == state.Y && Intrinsics.d(this.Z, state.Z) && Intrinsics.d(this.a0, state.a0) && this.b0 == state.b0 && Intrinsics.d(this.c0, state.c0) && this.d0 == state.d0 && this.e0 == state.e0 && this.f0 == state.f0;
        }

        public final int f() {
            return this.T;
        }

        public final CardNumberState g() {
            return this.P;
        }

        public final ImmutableList h() {
            return this.D;
        }

        public int hashCode() {
            int hashCode = ((((((((((((((((((((((((((((((this.f34842z.hashCode() * 31) + this.f34840A.hashCode()) * 31) + this.f34841B.hashCode()) * 31) + this.C.hashCode()) * 31) + this.D.hashCode()) * 31) + this.E.hashCode()) * 31) + this.F.hashCode()) * 31) + this.G.hashCode()) * 31) + this.H.hashCode()) * 31) + this.I.hashCode()) * 31) + this.J.hashCode()) * 31) + this.K.hashCode()) * 31) + this.L.hashCode()) * 31) + this.M.hashCode()) * 31) + this.N.hashCode()) * 31) + this.O.hashCode()) * 31;
            CardNumberState cardNumberState = this.P;
            return ((((((((((((((((((((((((((((((((hashCode + (cardNumberState == null ? 0 : cardNumberState.hashCode())) * 31) + Boolean.hashCode(this.Q)) * 31) + this.R.hashCode()) * 31) + Boolean.hashCode(this.S)) * 31) + Integer.hashCode(this.T)) * 31) + this.U.hashCode()) * 31) + Boolean.hashCode(this.V)) * 31) + this.W.hashCode()) * 31) + this.X.hashCode()) * 31) + Boolean.hashCode(this.Y)) * 31) + this.Z.hashCode()) * 31) + this.a0.hashCode()) * 31) + Boolean.hashCode(this.b0)) * 31) + this.c0.hashCode()) * 31) + Boolean.hashCode(this.d0)) * 31) + Boolean.hashCode(this.e0)) * 31) + Boolean.hashCode(this.f0);
        }

        public final ImmutableList i() {
            return this.f34841B;
        }

        public final String j() {
            return this.X;
        }

        public final StringValue k() {
            return this.Z;
        }

        public final boolean l() {
            return this.Y;
        }

        public final String n() {
            return this.U;
        }

        public final StringValue o() {
            return this.W;
        }

        public final boolean p() {
            return this.V;
        }

        public final ImmutableList q() {
            return this.f34840A;
        }

        public final String r() {
            return this.a0;
        }

        public final StringValue s() {
            return this.c0;
        }

        public final boolean t() {
            return this.b0;
        }

        public String toString() {
            HelpScreenConfig helpScreenConfig = this.f34842z;
            ImmutableList immutableList = this.f34840A;
            ImmutableList immutableList2 = this.f34841B;
            ImmutableList immutableList3 = this.C;
            ImmutableList immutableList4 = this.D;
            String str = this.E;
            StringValue stringValue = this.F;
            String str2 = this.G;
            StringValue stringValue2 = this.H;
            String str3 = this.I;
            StringValue stringValue3 = this.J;
            String str4 = this.K;
            StringValue stringValue4 = this.L;
            String str5 = this.M;
            StringValue stringValue5 = this.N;
            String str6 = this.O;
            CardNumberState cardNumberState = this.P;
            boolean z2 = this.Q;
            StringValue stringValue6 = this.R;
            boolean z3 = this.S;
            int i2 = this.T;
            String str7 = this.U;
            boolean z4 = this.V;
            StringValue stringValue7 = this.W;
            String str8 = this.X;
            boolean z5 = this.Y;
            StringValue stringValue8 = this.Z;
            String str9 = this.a0;
            boolean z6 = this.b0;
            StringValue stringValue9 = this.c0;
            boolean z7 = this.d0;
            boolean z8 = this.e0;
            boolean z9 = this.f0;
            return "State(config=" + helpScreenConfig + ", caseReasons=" + immutableList + ", caseCategories=" + immutableList2 + ", caseResolutions=" + immutableList3 + ", cardNumbers=" + immutableList4 + ", email=" + str + ", emailError=" + stringValue + ", subject=" + str2 + ", subjectError=" + stringValue2 + ", description=" + str3 + ", descriptionError=" + stringValue3 + ", contactName=" + str4 + ", contactNameError=" + stringValue4 + ", phoneNumber=" + str5 + ", phoneError=" + stringValue5 + ", cardNumber=" + str6 + ", cardNumberState=" + cardNumberState + ", cardNumberIsOpen=" + z2 + ", cardNumberError=" + stringValue6 + ", showCustomCardNumber=" + z3 + ", cardNumberLength=" + i2 + ", caseReason=" + str7 + ", caseReasonIsOpen=" + z4 + ", caseReasonError=" + stringValue7 + ", caseCategory=" + str8 + ", caseCategoryIsOpen=" + z5 + ", caseCategoryError=" + stringValue8 + ", caseResolution=" + str9 + ", caseResolutionIsOpen=" + z6 + ", caseResolutionError=" + stringValue9 + ", showProgress=" + z7 + ", showSuccess=" + z8 + ", showTopBar=" + z9 + ")";
        }

        public final ImmutableList u() {
            return this.C;
        }

        public final HelpScreenConfig v() {
            return this.f34842z;
        }

        public final String w() {
            return this.K;
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            this.f34842z.writeToParcel(parcel, i2);
            parcel.writeStringList(this.f34840A);
            parcel.writeStringList(this.f34841B);
            parcel.writeStringList(this.C);
            ImmutableList<CardNumberState> immutableList = this.D;
            parcel.writeInt(immutableList.size());
            for (CardNumberState writeToParcel : immutableList) {
                writeToParcel.writeToParcel(parcel, i2);
            }
            parcel.writeString(this.E);
            parcel.writeParcelable(this.F, i2);
            parcel.writeString(this.G);
            parcel.writeParcelable(this.H, i2);
            parcel.writeString(this.I);
            parcel.writeParcelable(this.J, i2);
            parcel.writeString(this.K);
            parcel.writeParcelable(this.L, i2);
            parcel.writeString(this.M);
            parcel.writeParcelable(this.N, i2);
            parcel.writeString(this.O);
            CardNumberState cardNumberState = this.P;
            if (cardNumberState == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                cardNumberState.writeToParcel(parcel, i2);
            }
            parcel.writeInt(this.Q ? 1 : 0);
            parcel.writeParcelable(this.R, i2);
            parcel.writeInt(this.S ? 1 : 0);
            parcel.writeInt(this.T);
            parcel.writeString(this.U);
            parcel.writeInt(this.V ? 1 : 0);
            parcel.writeParcelable(this.W, i2);
            parcel.writeString(this.X);
            parcel.writeInt(this.Y ? 1 : 0);
            parcel.writeParcelable(this.Z, i2);
            parcel.writeString(this.a0);
            parcel.writeInt(this.b0 ? 1 : 0);
            parcel.writeParcelable(this.c0, i2);
            parcel.writeInt(this.d0 ? 1 : 0);
            parcel.writeInt(this.e0 ? 1 : 0);
            parcel.writeInt(this.f0 ? 1 : 0);
        }

        public final StringValue x() {
            return this.L;
        }

        public final String y() {
            return this.I;
        }

        public final StringValue z() {
            return this.J;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ State(com.hansecom.abt.data.config.help.HelpScreenConfig r35, kotlinx.collections.immutable.ImmutableList r36, kotlinx.collections.immutable.ImmutableList r37, kotlinx.collections.immutable.ImmutableList r38, kotlinx.collections.immutable.ImmutableList r39, java.lang.String r40, com.hansecom.abt.util.resourcesResolvers.StringValue r41, java.lang.String r42, com.hansecom.abt.util.resourcesResolvers.StringValue r43, java.lang.String r44, com.hansecom.abt.util.resourcesResolvers.StringValue r45, java.lang.String r46, com.hansecom.abt.util.resourcesResolvers.StringValue r47, java.lang.String r48, com.hansecom.abt.util.resourcesResolvers.StringValue r49, java.lang.String r50, com.hansecom.abt.presentation.screens.helpRequest.CardNumberState r51, boolean r52, com.hansecom.abt.util.resourcesResolvers.StringValue r53, boolean r54, int r55, java.lang.String r56, boolean r57, com.hansecom.abt.util.resourcesResolvers.StringValue r58, java.lang.String r59, boolean r60, com.hansecom.abt.util.resourcesResolvers.StringValue r61, java.lang.String r62, boolean r63, com.hansecom.abt.util.resourcesResolvers.StringValue r64, boolean r65, boolean r66, boolean r67, int r68, int r69, kotlin.jvm.internal.DefaultConstructorMarker r70) {
            /*
                r34 = this;
                r0 = r68
                r1 = r0 & 1
                if (r1 == 0) goto L_0x0019
                com.hansecom.abt.data.config.help.HelpScreenConfig r1 = new com.hansecom.abt.data.config.help.HelpScreenConfig
                r12 = 511(0x1ff, float:7.16E-43)
                r13 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r2 = r1
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                goto L_0x001b
            L_0x0019:
                r1 = r35
            L_0x001b:
                r2 = r0 & 2
                if (r2 == 0) goto L_0x0024
                kotlinx.collections.immutable.PersistentList r2 = kotlinx.collections.immutable.ExtensionsKt.a()
                goto L_0x0026
            L_0x0024:
                r2 = r36
            L_0x0026:
                r3 = r0 & 4
                if (r3 == 0) goto L_0x002f
                kotlinx.collections.immutable.PersistentList r3 = kotlinx.collections.immutable.ExtensionsKt.a()
                goto L_0x0031
            L_0x002f:
                r3 = r37
            L_0x0031:
                r4 = r0 & 8
                if (r4 == 0) goto L_0x003a
                kotlinx.collections.immutable.PersistentList r4 = kotlinx.collections.immutable.ExtensionsKt.a()
                goto L_0x003c
            L_0x003a:
                r4 = r38
            L_0x003c:
                r5 = r0 & 16
                if (r5 == 0) goto L_0x0045
                kotlinx.collections.immutable.PersistentList r5 = kotlinx.collections.immutable.ExtensionsKt.a()
                goto L_0x0047
            L_0x0045:
                r5 = r39
            L_0x0047:
                r6 = r0 & 32
                java.lang.String r7 = ""
                if (r6 == 0) goto L_0x004f
                r6 = r7
                goto L_0x0051
            L_0x004f:
                r6 = r40
            L_0x0051:
                r8 = r0 & 64
                if (r8 == 0) goto L_0x005c
                com.hansecom.abt.util.resourcesResolvers.StringValue$Companion r8 = com.hansecom.abt.util.resourcesResolvers.StringValue.Companion
                com.hansecom.abt.util.resourcesResolvers.StringValue r8 = r8.a()
                goto L_0x005e
            L_0x005c:
                r8 = r41
            L_0x005e:
                r9 = r0 & 128(0x80, float:1.794E-43)
                if (r9 == 0) goto L_0x0064
                r9 = r7
                goto L_0x0066
            L_0x0064:
                r9 = r42
            L_0x0066:
                r10 = r0 & 256(0x100, float:3.59E-43)
                if (r10 == 0) goto L_0x0071
                com.hansecom.abt.util.resourcesResolvers.StringValue$Companion r10 = com.hansecom.abt.util.resourcesResolvers.StringValue.Companion
                com.hansecom.abt.util.resourcesResolvers.StringValue r10 = r10.a()
                goto L_0x0073
            L_0x0071:
                r10 = r43
            L_0x0073:
                r11 = r0 & 512(0x200, float:7.175E-43)
                if (r11 == 0) goto L_0x0079
                r11 = r7
                goto L_0x007b
            L_0x0079:
                r11 = r44
            L_0x007b:
                r12 = r0 & 1024(0x400, float:1.435E-42)
                if (r12 == 0) goto L_0x0086
                com.hansecom.abt.util.resourcesResolvers.StringValue$Companion r12 = com.hansecom.abt.util.resourcesResolvers.StringValue.Companion
                com.hansecom.abt.util.resourcesResolvers.StringValue r12 = r12.a()
                goto L_0x0088
            L_0x0086:
                r12 = r45
            L_0x0088:
                r13 = r0 & 2048(0x800, float:2.87E-42)
                if (r13 == 0) goto L_0x008e
                r13 = r7
                goto L_0x0090
            L_0x008e:
                r13 = r46
            L_0x0090:
                r14 = r0 & 4096(0x1000, float:5.74E-42)
                if (r14 == 0) goto L_0x009b
                com.hansecom.abt.util.resourcesResolvers.StringValue$Companion r14 = com.hansecom.abt.util.resourcesResolvers.StringValue.Companion
                com.hansecom.abt.util.resourcesResolvers.StringValue r14 = r14.a()
                goto L_0x009d
            L_0x009b:
                r14 = r47
            L_0x009d:
                r15 = r0 & 8192(0x2000, float:1.14794E-41)
                if (r15 == 0) goto L_0x00a3
                r15 = r7
                goto L_0x00a5
            L_0x00a3:
                r15 = r48
            L_0x00a5:
                r35 = r7
                r7 = r0 & 16384(0x4000, float:2.2959E-41)
                if (r7 == 0) goto L_0x00b2
                com.hansecom.abt.util.resourcesResolvers.StringValue$Companion r7 = com.hansecom.abt.util.resourcesResolvers.StringValue.Companion
                com.hansecom.abt.util.resourcesResolvers.StringValue r7 = r7.a()
                goto L_0x00b4
            L_0x00b2:
                r7 = r49
            L_0x00b4:
                r16 = 32768(0x8000, float:4.5918E-41)
                r16 = r0 & r16
                if (r16 == 0) goto L_0x00be
                r16 = r35
                goto L_0x00c0
            L_0x00be:
                r16 = r50
            L_0x00c0:
                r17 = 65536(0x10000, float:9.18355E-41)
                r17 = r0 & r17
                if (r17 == 0) goto L_0x00c9
                r17 = 0
                goto L_0x00cb
            L_0x00c9:
                r17 = r51
            L_0x00cb:
                r18 = 131072(0x20000, float:1.83671E-40)
                r18 = r0 & r18
                r19 = 0
                if (r18 == 0) goto L_0x00d6
                r18 = r19
                goto L_0x00d8
            L_0x00d6:
                r18 = r52
            L_0x00d8:
                r20 = 262144(0x40000, float:3.67342E-40)
                r20 = r0 & r20
                if (r20 == 0) goto L_0x00e5
                com.hansecom.abt.util.resourcesResolvers.StringValue$Companion r20 = com.hansecom.abt.util.resourcesResolvers.StringValue.Companion
                com.hansecom.abt.util.resourcesResolvers.StringValue r20 = r20.a()
                goto L_0x00e7
            L_0x00e5:
                r20 = r53
            L_0x00e7:
                r21 = 524288(0x80000, float:7.34684E-40)
                r21 = r0 & r21
                if (r21 == 0) goto L_0x00f0
                r21 = r19
                goto L_0x00f2
            L_0x00f0:
                r21 = r54
            L_0x00f2:
                r22 = 1048576(0x100000, float:1.469368E-39)
                r22 = r0 & r22
                if (r22 == 0) goto L_0x00fb
                r22 = 20
                goto L_0x00fd
            L_0x00fb:
                r22 = r55
            L_0x00fd:
                r23 = 2097152(0x200000, float:2.938736E-39)
                r23 = r0 & r23
                if (r23 == 0) goto L_0x0106
                r23 = r35
                goto L_0x0108
            L_0x0106:
                r23 = r56
            L_0x0108:
                r24 = 4194304(0x400000, float:5.877472E-39)
                r24 = r0 & r24
                if (r24 == 0) goto L_0x0111
                r24 = r19
                goto L_0x0113
            L_0x0111:
                r24 = r57
            L_0x0113:
                r25 = 8388608(0x800000, float:1.17549435E-38)
                r25 = r0 & r25
                if (r25 == 0) goto L_0x0120
                com.hansecom.abt.util.resourcesResolvers.StringValue$Companion r25 = com.hansecom.abt.util.resourcesResolvers.StringValue.Companion
                com.hansecom.abt.util.resourcesResolvers.StringValue r25 = r25.a()
                goto L_0x0122
            L_0x0120:
                r25 = r58
            L_0x0122:
                r26 = 16777216(0x1000000, float:2.3509887E-38)
                r26 = r0 & r26
                if (r26 == 0) goto L_0x012b
                r26 = r35
                goto L_0x012d
            L_0x012b:
                r26 = r59
            L_0x012d:
                r27 = 33554432(0x2000000, float:9.403955E-38)
                r27 = r0 & r27
                if (r27 == 0) goto L_0x0136
                r27 = r19
                goto L_0x0138
            L_0x0136:
                r27 = r60
            L_0x0138:
                r28 = 67108864(0x4000000, float:1.5046328E-36)
                r28 = r0 & r28
                if (r28 == 0) goto L_0x0145
                com.hansecom.abt.util.resourcesResolvers.StringValue$Companion r28 = com.hansecom.abt.util.resourcesResolvers.StringValue.Companion
                com.hansecom.abt.util.resourcesResolvers.StringValue r28 = r28.a()
                goto L_0x0147
            L_0x0145:
                r28 = r61
            L_0x0147:
                r29 = 134217728(0x8000000, float:3.85186E-34)
                r29 = r0 & r29
                if (r29 == 0) goto L_0x0150
                r29 = r35
                goto L_0x0152
            L_0x0150:
                r29 = r62
            L_0x0152:
                r30 = 268435456(0x10000000, float:2.5243549E-29)
                r30 = r0 & r30
                if (r30 == 0) goto L_0x015b
                r30 = r19
                goto L_0x015d
            L_0x015b:
                r30 = r63
            L_0x015d:
                r31 = 536870912(0x20000000, float:1.0842022E-19)
                r31 = r0 & r31
                if (r31 == 0) goto L_0x016a
                com.hansecom.abt.util.resourcesResolvers.StringValue$Companion r31 = com.hansecom.abt.util.resourcesResolvers.StringValue.Companion
                com.hansecom.abt.util.resourcesResolvers.StringValue r31 = r31.a()
                goto L_0x016c
            L_0x016a:
                r31 = r64
            L_0x016c:
                r32 = 1073741824(0x40000000, float:2.0)
                r32 = r0 & r32
                if (r32 == 0) goto L_0x0175
                r32 = r19
                goto L_0x0177
            L_0x0175:
                r32 = r65
            L_0x0177:
                r33 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 & r33
                if (r0 == 0) goto L_0x0180
                r0 = r19
                goto L_0x0182
            L_0x0180:
                r0 = r66
            L_0x0182:
                r33 = r69 & 1
                if (r33 == 0) goto L_0x0187
                goto L_0x0189
            L_0x0187:
                r19 = r67
            L_0x0189:
                r35 = r34
                r36 = r1
                r37 = r2
                r38 = r3
                r39 = r4
                r40 = r5
                r41 = r6
                r42 = r8
                r43 = r9
                r44 = r10
                r45 = r11
                r46 = r12
                r47 = r13
                r48 = r14
                r49 = r15
                r50 = r7
                r51 = r16
                r52 = r17
                r53 = r18
                r54 = r20
                r55 = r21
                r56 = r22
                r57 = r23
                r58 = r24
                r59 = r25
                r60 = r26
                r61 = r27
                r62 = r28
                r63 = r29
                r64 = r30
                r65 = r31
                r66 = r32
                r67 = r0
                r68 = r19
                r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.helpRequest.HelpRequest.State.<init>(com.hansecom.abt.data.config.help.HelpScreenConfig, kotlinx.collections.immutable.ImmutableList, kotlinx.collections.immutable.ImmutableList, kotlinx.collections.immutable.ImmutableList, kotlinx.collections.immutable.ImmutableList, java.lang.String, com.hansecom.abt.util.resourcesResolvers.StringValue, java.lang.String, com.hansecom.abt.util.resourcesResolvers.StringValue, java.lang.String, com.hansecom.abt.util.resourcesResolvers.StringValue, java.lang.String, com.hansecom.abt.util.resourcesResolvers.StringValue, java.lang.String, com.hansecom.abt.util.resourcesResolvers.StringValue, java.lang.String, com.hansecom.abt.presentation.screens.helpRequest.CardNumberState, boolean, com.hansecom.abt.util.resourcesResolvers.StringValue, boolean, int, java.lang.String, boolean, com.hansecom.abt.util.resourcesResolvers.StringValue, java.lang.String, boolean, com.hansecom.abt.util.resourcesResolvers.StringValue, java.lang.String, boolean, com.hansecom.abt.util.resourcesResolvers.StringValue, boolean, boolean, boolean, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
