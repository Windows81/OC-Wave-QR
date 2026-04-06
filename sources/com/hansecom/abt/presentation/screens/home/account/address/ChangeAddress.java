package com.hansecom.abt.presentation.screens.home.account.address;

import android.os.Parcel;
import android.os.Parcelable;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;

@Metadata
public interface ChangeAddress {

    @Metadata
    public interface Action {

        @Metadata
        public interface ChooseCountry extends Action {

            @Metadata
            public static final class CountryChange implements ChooseCountry {

                /* renamed from: a  reason: collision with root package name */
                public final String f35110a;

                public CountryChange(String str) {
                    Intrinsics.i(str, "value");
                    this.f35110a = str;
                }

                public final String a() {
                    return this.f35110a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof CountryChange) && Intrinsics.d(this.f35110a, ((CountryChange) obj).f35110a);
                }

                public int hashCode() {
                    return this.f35110a.hashCode();
                }

                public String toString() {
                    String str = this.f35110a;
                    return "CountryChange(value=" + str + ")";
                }
            }

            @Metadata
            public static final class FilterChange implements ChooseCountry {

                /* renamed from: a  reason: collision with root package name */
                public final String f35111a;

                public FilterChange(String str) {
                    Intrinsics.i(str, "value");
                    this.f35111a = str;
                }

                public final String a() {
                    return this.f35111a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof FilterChange) && Intrinsics.d(this.f35111a, ((FilterChange) obj).f35111a);
                }

                public int hashCode() {
                    return this.f35111a.hashCode();
                }

                public String toString() {
                    String str = this.f35111a;
                    return "FilterChange(value=" + str + ")";
                }
            }
        }

        @Metadata
        public interface ChooseState extends Action {

            @Metadata
            public static final class FilterChange implements ChooseState {

                /* renamed from: a  reason: collision with root package name */
                public final String f35112a;

                public FilterChange(String str) {
                    Intrinsics.i(str, "value");
                    this.f35112a = str;
                }

                public final String a() {
                    return this.f35112a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof FilterChange) && Intrinsics.d(this.f35112a, ((FilterChange) obj).f35112a);
                }

                public int hashCode() {
                    return this.f35112a.hashCode();
                }

                public String toString() {
                    String str = this.f35112a;
                    return "FilterChange(value=" + str + ")";
                }
            }

            @Metadata
            public static final class StateChange implements ChooseState {

                /* renamed from: a  reason: collision with root package name */
                public final String f35113a;

                public StateChange(String str) {
                    Intrinsics.i(str, "value");
                    this.f35113a = str;
                }

                public final String a() {
                    return this.f35113a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof StateChange) && Intrinsics.d(this.f35113a, ((StateChange) obj).f35113a);
                }

                public int hashCode() {
                    return this.f35113a.hashCode();
                }

                public String toString() {
                    String str = this.f35113a;
                    return "StateChange(value=" + str + ")";
                }
            }
        }

        @Metadata
        public static final class CityChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f35114a;

            public CityChange(String str) {
                Intrinsics.i(str, "value");
                this.f35114a = str;
            }

            public final String a() {
                return this.f35114a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CityChange) && Intrinsics.d(this.f35114a, ((CityChange) obj).f35114a);
            }

            public int hashCode() {
                return this.f35114a.hashCode();
            }

            public String toString() {
                String str = this.f35114a;
                return "CityChange(value=" + str + ")";
            }
        }

        @Metadata
        public static final class Confirm implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final Confirm f35115a = new Confirm();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Confirm);
            }

            public int hashCode() {
                return -77870813;
            }

            public String toString() {
                return "Confirm";
            }
        }

        @Metadata
        public static final class PostalCodeChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f35116a;

            public PostalCodeChange(String str) {
                Intrinsics.i(str, "value");
                this.f35116a = str;
            }

            public final String a() {
                return this.f35116a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PostalCodeChange) && Intrinsics.d(this.f35116a, ((PostalCodeChange) obj).f35116a);
            }

            public int hashCode() {
                return this.f35116a.hashCode();
            }

            public String toString() {
                String str = this.f35116a;
                return "PostalCodeChange(value=" + str + ")";
            }
        }

        @Metadata
        public static final class StateChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f35117a;

            public StateChange(String str) {
                Intrinsics.i(str, "value");
                this.f35117a = str;
            }

            public final String a() {
                return this.f35117a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateChange) && Intrinsics.d(this.f35117a, ((StateChange) obj).f35117a);
            }

            public int hashCode() {
                return this.f35117a.hashCode();
            }

            public String toString() {
                String str = this.f35117a;
                return "StateChange(value=" + str + ")";
            }
        }

        @Metadata
        public static final class StreetNameChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f35118a;

            public StreetNameChange(String str) {
                Intrinsics.i(str, "value");
                this.f35118a = str;
            }

            public final String a() {
                return this.f35118a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StreetNameChange) && Intrinsics.d(this.f35118a, ((StreetNameChange) obj).f35118a);
            }

            public int hashCode() {
                return this.f35118a.hashCode();
            }

            public String toString() {
                String str = this.f35118a;
                return "StreetNameChange(value=" + str + ")";
            }
        }

        @Metadata
        public static final class StreetNameSecondLineChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f35119a;

            public StreetNameSecondLineChange(String str) {
                Intrinsics.i(str, "value");
                this.f35119a = str;
            }

            public final String a() {
                return this.f35119a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StreetNameSecondLineChange) && Intrinsics.d(this.f35119a, ((StreetNameSecondLineChange) obj).f35119a);
            }

            public int hashCode() {
                return this.f35119a.hashCode();
            }

            public String toString() {
                String str = this.f35119a;
                return "StreetNameSecondLineChange(value=" + str + ")";
            }
        }
    }

    @Metadata
    public interface Effect {

        @Metadata
        public interface ChangeCountry extends Effect {

            @Metadata
            public static final class ChangeCountrySuccess implements ChangeCountry {

                /* renamed from: a  reason: collision with root package name */
                public static final ChangeCountrySuccess f35120a = new ChangeCountrySuccess();

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof ChangeCountrySuccess);
                }

                public int hashCode() {
                    return -457658073;
                }

                public String toString() {
                    return "ChangeCountrySuccess";
                }
            }
        }

        @Metadata
        public interface ChangeState extends Effect {

            @Metadata
            public static final class ChangeStateSuccess implements ChangeState {

                /* renamed from: a  reason: collision with root package name */
                public static final ChangeStateSuccess f35121a = new ChangeStateSuccess();

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof ChangeStateSuccess);
                }

                public int hashCode() {
                    return 680014321;
                }

                public String toString() {
                    return "ChangeStateSuccess";
                }
            }
        }

        @Metadata
        public interface Details extends Effect {

            @Metadata
            public static final class Error implements Effect {

                /* renamed from: a  reason: collision with root package name */
                public final StringValue f35122a;

                public Error(StringValue stringValue) {
                    Intrinsics.i(stringValue, "message");
                    this.f35122a = stringValue;
                }

                public final StringValue a() {
                    return this.f35122a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Error) && Intrinsics.d(this.f35122a, ((Error) obj).f35122a);
                }

                public int hashCode() {
                    return this.f35122a.hashCode();
                }

                public String toString() {
                    StringValue stringValue = this.f35122a;
                    return "Error(message=" + stringValue + ")";
                }
            }

            @Metadata
            public static final class InitialLoadingError implements Effect {

                /* renamed from: a  reason: collision with root package name */
                public final StringValue f35123a;

                public final StringValue a() {
                    return this.f35123a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof InitialLoadingError) && Intrinsics.d(this.f35123a, ((InitialLoadingError) obj).f35123a);
                }

                public int hashCode() {
                    return this.f35123a.hashCode();
                }

                public String toString() {
                    StringValue stringValue = this.f35123a;
                    return "InitialLoadingError(message=" + stringValue + ")";
                }
            }

            @Metadata
            public static final class Success implements Effect {

                /* renamed from: a  reason: collision with root package name */
                public static final Success f35124a = new Success();

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof Success);
                }

                public int hashCode() {
                    return -764252939;
                }

                public String toString() {
                    return "Success";
                }
            }
        }
    }

    @Metadata
    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new Creator();

        /* renamed from: A  reason: collision with root package name */
        public final StringValue f35125A;

        /* renamed from: B  reason: collision with root package name */
        public final String f35126B;
        public final StringValue C;
        public final String D;
        public final StringValue E;
        public final String F;
        public final StringValue G;
        public final String H;
        public final StringValue I;
        public final String J;
        public final StringValue K;
        public final boolean L;
        public final boolean M;
        public final ChooseCountry N;
        public final ChooseState O;

        /* renamed from: z  reason: collision with root package name */
        public final String f35127z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<State> {
            /* renamed from: a */
            public final State createFromParcel(Parcel parcel) {
                Parcel parcel2 = parcel;
                Intrinsics.i(parcel2, "parcel");
                String readString = parcel.readString();
                Class<State> cls = State.class;
                StringValue stringValue = (StringValue) parcel2.readParcelable(cls.getClassLoader());
                String readString2 = parcel.readString();
                StringValue stringValue2 = (StringValue) parcel2.readParcelable(cls.getClassLoader());
                String readString3 = parcel.readString();
                StringValue stringValue3 = (StringValue) parcel2.readParcelable(cls.getClassLoader());
                String readString4 = parcel.readString();
                StringValue stringValue4 = (StringValue) parcel2.readParcelable(cls.getClassLoader());
                String readString5 = parcel.readString();
                StringValue stringValue5 = (StringValue) parcel2.readParcelable(cls.getClassLoader());
                String readString6 = parcel.readString();
                StringValue stringValue6 = (StringValue) parcel2.readParcelable(cls.getClassLoader());
                boolean z2 = true;
                boolean z3 = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                return new State(readString, stringValue, readString2, stringValue2, readString3, stringValue3, readString4, stringValue4, readString5, stringValue5, readString6, stringValue6, z3, z2, ChooseCountry.CREATOR.createFromParcel(parcel2), ChooseState.CREATOR.createFromParcel(parcel2));
            }

            /* renamed from: b */
            public final State[] newArray(int i2) {
                return new State[i2];
            }
        }

        public State(String str, StringValue stringValue, String str2, StringValue stringValue2, String str3, StringValue stringValue3, String str4, StringValue stringValue4, String str5, StringValue stringValue5, String str6, StringValue stringValue6, boolean z2, boolean z3, ChooseCountry chooseCountry, ChooseState chooseState) {
            String str7 = str;
            StringValue stringValue7 = stringValue;
            String str8 = str2;
            StringValue stringValue8 = stringValue2;
            String str9 = str3;
            StringValue stringValue9 = stringValue3;
            String str10 = str4;
            StringValue stringValue10 = stringValue4;
            String str11 = str5;
            StringValue stringValue11 = stringValue5;
            String str12 = str6;
            StringValue stringValue12 = stringValue6;
            ChooseCountry chooseCountry2 = chooseCountry;
            ChooseState chooseState2 = chooseState;
            Intrinsics.i(str7, "streetName");
            Intrinsics.i(stringValue7, "streetNameError");
            Intrinsics.i(str8, "streetNameSecondLine");
            Intrinsics.i(stringValue8, "streetNameSecondLineError");
            Intrinsics.i(str9, "city");
            Intrinsics.i(stringValue9, "cityError");
            Intrinsics.i(str10, "state");
            Intrinsics.i(stringValue10, "stateError");
            Intrinsics.i(str11, "postalCode");
            Intrinsics.i(stringValue11, "postalCodeError");
            Intrinsics.i(str12, "country");
            Intrinsics.i(stringValue12, "countryError");
            Intrinsics.i(chooseCountry2, "chooseCountryState");
            Intrinsics.i(chooseState2, "chooseStateState");
            this.f35127z = str7;
            this.f35125A = stringValue7;
            this.f35126B = str8;
            this.C = stringValue8;
            this.D = str9;
            this.E = stringValue9;
            this.F = str10;
            this.G = stringValue10;
            this.H = str11;
            this.I = stringValue11;
            this.J = str12;
            this.K = stringValue12;
            this.L = z2;
            this.M = z3;
            this.N = chooseCountry2;
            this.O = chooseState2;
        }

        public static /* synthetic */ State b(State state, String str, StringValue stringValue, String str2, StringValue stringValue2, String str3, StringValue stringValue3, String str4, StringValue stringValue4, String str5, StringValue stringValue5, String str6, StringValue stringValue6, boolean z2, boolean z3, ChooseCountry chooseCountry, ChooseState chooseState, int i2, Object obj) {
            State state2 = state;
            int i3 = i2;
            return state.a((i3 & 1) != 0 ? state2.f35127z : str, (i3 & 2) != 0 ? state2.f35125A : stringValue, (i3 & 4) != 0 ? state2.f35126B : str2, (i3 & 8) != 0 ? state2.C : stringValue2, (i3 & 16) != 0 ? state2.D : str3, (i3 & 32) != 0 ? state2.E : stringValue3, (i3 & 64) != 0 ? state2.F : str4, (i3 & 128) != 0 ? state2.G : stringValue4, (i3 & 256) != 0 ? state2.H : str5, (i3 & 512) != 0 ? state2.I : stringValue5, (i3 & 1024) != 0 ? state2.J : str6, (i3 & 2048) != 0 ? state2.K : stringValue6, (i3 & 4096) != 0 ? state2.L : z2, (i3 & 8192) != 0 ? state2.M : z3, (i3 & 16384) != 0 ? state2.N : chooseCountry, (i3 & 32768) != 0 ? state2.O : chooseState);
        }

        public final State a(String str, StringValue stringValue, String str2, StringValue stringValue2, String str3, StringValue stringValue3, String str4, StringValue stringValue4, String str5, StringValue stringValue5, String str6, StringValue stringValue6, boolean z2, boolean z3, ChooseCountry chooseCountry, ChooseState chooseState) {
            String str7 = str;
            Intrinsics.i(str7, "streetName");
            Intrinsics.i(stringValue, "streetNameError");
            Intrinsics.i(str2, "streetNameSecondLine");
            Intrinsics.i(stringValue2, "streetNameSecondLineError");
            Intrinsics.i(str3, "city");
            Intrinsics.i(stringValue3, "cityError");
            Intrinsics.i(str4, "state");
            Intrinsics.i(stringValue4, "stateError");
            Intrinsics.i(str5, "postalCode");
            Intrinsics.i(stringValue5, "postalCodeError");
            Intrinsics.i(str6, "country");
            Intrinsics.i(stringValue6, "countryError");
            Intrinsics.i(chooseCountry, "chooseCountryState");
            Intrinsics.i(chooseState, "chooseStateState");
            return new State(str7, stringValue, str2, stringValue2, str3, stringValue3, str4, stringValue4, str5, stringValue5, str6, stringValue6, z2, z3, chooseCountry, chooseState);
        }

        public final ChooseCountry c() {
            return this.N;
        }

        public final ChooseState d() {
            return this.O;
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
            return Intrinsics.d(this.f35127z, state.f35127z) && Intrinsics.d(this.f35125A, state.f35125A) && Intrinsics.d(this.f35126B, state.f35126B) && Intrinsics.d(this.C, state.C) && Intrinsics.d(this.D, state.D) && Intrinsics.d(this.E, state.E) && Intrinsics.d(this.F, state.F) && Intrinsics.d(this.G, state.G) && Intrinsics.d(this.H, state.H) && Intrinsics.d(this.I, state.I) && Intrinsics.d(this.J, state.J) && Intrinsics.d(this.K, state.K) && this.L == state.L && this.M == state.M && Intrinsics.d(this.N, state.N) && Intrinsics.d(this.O, state.O);
        }

        public final StringValue f() {
            return this.E;
        }

        public final String g() {
            return this.J;
        }

        public final String h() {
            return this.H;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((this.f35127z.hashCode() * 31) + this.f35125A.hashCode()) * 31) + this.f35126B.hashCode()) * 31) + this.C.hashCode()) * 31) + this.D.hashCode()) * 31) + this.E.hashCode()) * 31) + this.F.hashCode()) * 31) + this.G.hashCode()) * 31) + this.H.hashCode()) * 31) + this.I.hashCode()) * 31) + this.J.hashCode()) * 31) + this.K.hashCode()) * 31) + Boolean.hashCode(this.L)) * 31) + Boolean.hashCode(this.M)) * 31) + this.N.hashCode()) * 31) + this.O.hashCode();
        }

        public final StringValue i() {
            return this.I;
        }

        public final boolean j() {
            return this.L;
        }

        public final String k() {
            return this.F;
        }

        public final String l() {
            return this.f35127z;
        }

        public final StringValue n() {
            return this.f35125A;
        }

        public final String o() {
            return this.f35126B;
        }

        public final boolean p() {
            return this.M;
        }

        public String toString() {
            String str = this.f35127z;
            StringValue stringValue = this.f35125A;
            String str2 = this.f35126B;
            StringValue stringValue2 = this.C;
            String str3 = this.D;
            StringValue stringValue3 = this.E;
            String str4 = this.F;
            StringValue stringValue4 = this.G;
            String str5 = this.H;
            StringValue stringValue5 = this.I;
            String str6 = this.J;
            StringValue stringValue6 = this.K;
            boolean z2 = this.L;
            boolean z3 = this.M;
            ChooseCountry chooseCountry = this.N;
            ChooseState chooseState = this.O;
            return "State(streetName=" + str + ", streetNameError=" + stringValue + ", streetNameSecondLine=" + str2 + ", streetNameSecondLineError=" + stringValue2 + ", city=" + str3 + ", cityError=" + stringValue3 + ", state=" + str4 + ", stateError=" + stringValue4 + ", postalCode=" + str5 + ", postalCodeError=" + stringValue5 + ", country=" + str6 + ", countryError=" + stringValue6 + ", showStatesSelector=" + z2 + ", isLoading=" + z3 + ", chooseCountryState=" + chooseCountry + ", chooseStateState=" + chooseState + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeString(this.f35127z);
            parcel.writeParcelable(this.f35125A, i2);
            parcel.writeString(this.f35126B);
            parcel.writeParcelable(this.C, i2);
            parcel.writeString(this.D);
            parcel.writeParcelable(this.E, i2);
            parcel.writeString(this.F);
            parcel.writeParcelable(this.G, i2);
            parcel.writeString(this.H);
            parcel.writeParcelable(this.I, i2);
            parcel.writeString(this.J);
            parcel.writeParcelable(this.K, i2);
            parcel.writeInt(this.L ? 1 : 0);
            parcel.writeInt(this.M ? 1 : 0);
            this.N.writeToParcel(parcel, i2);
            this.O.writeToParcel(parcel, i2);
        }

        @Metadata
        public static final class ChooseCountry implements Parcelable {
            public static final Parcelable.Creator<ChooseCountry> CREATOR = new Creator();

            /* renamed from: A  reason: collision with root package name */
            public final String f35128A;

            /* renamed from: z  reason: collision with root package name */
            public final ImmutableList f35129z;

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
                this.f35129z = immutableList;
                this.f35128A = str;
            }

            public static /* synthetic */ ChooseCountry b(ChooseCountry chooseCountry, ImmutableList immutableList, String str, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    immutableList = chooseCountry.f35129z;
                }
                if ((i2 & 2) != 0) {
                    str = chooseCountry.f35128A;
                }
                return chooseCountry.a(immutableList, str);
            }

            public final ChooseCountry a(ImmutableList immutableList, String str) {
                Intrinsics.i(immutableList, "countries");
                Intrinsics.i(str, "filter");
                return new ChooseCountry(immutableList, str);
            }

            public final ImmutableList c() {
                return this.f35129z;
            }

            public final String d() {
                return this.f35128A;
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
                return Intrinsics.d(this.f35129z, chooseCountry.f35129z) && Intrinsics.d(this.f35128A, chooseCountry.f35128A);
            }

            public int hashCode() {
                return (this.f35129z.hashCode() * 31) + this.f35128A.hashCode();
            }

            public String toString() {
                ImmutableList immutableList = this.f35129z;
                String str = this.f35128A;
                return "ChooseCountry(countries=" + immutableList + ", filter=" + str + ")";
            }

            public final void writeToParcel(Parcel parcel, int i2) {
                Intrinsics.i(parcel, "dest");
                parcel.writeStringList(this.f35129z);
                parcel.writeString(this.f35128A);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ ChooseCountry(ImmutableList immutableList, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? ExtensionsKt.a() : immutableList, (i2 & 2) != 0 ? "" : str);
            }
        }

        @Metadata
        public static final class ChooseState implements Parcelable {
            public static final Parcelable.Creator<ChooseState> CREATOR = new Creator();

            /* renamed from: A  reason: collision with root package name */
            public final String f35130A;

            /* renamed from: z  reason: collision with root package name */
            public final ImmutableList f35131z;

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
                this.f35131z = immutableList;
                this.f35130A = str;
            }

            public static /* synthetic */ ChooseState b(ChooseState chooseState, ImmutableList immutableList, String str, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    immutableList = chooseState.f35131z;
                }
                if ((i2 & 2) != 0) {
                    str = chooseState.f35130A;
                }
                return chooseState.a(immutableList, str);
            }

            public final ChooseState a(ImmutableList immutableList, String str) {
                Intrinsics.i(immutableList, "states");
                Intrinsics.i(str, "filter");
                return new ChooseState(immutableList, str);
            }

            public final String c() {
                return this.f35130A;
            }

            public final ImmutableList d() {
                return this.f35131z;
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
                return Intrinsics.d(this.f35131z, chooseState.f35131z) && Intrinsics.d(this.f35130A, chooseState.f35130A);
            }

            public int hashCode() {
                return (this.f35131z.hashCode() * 31) + this.f35130A.hashCode();
            }

            public String toString() {
                ImmutableList immutableList = this.f35131z;
                String str = this.f35130A;
                return "ChooseState(states=" + immutableList + ", filter=" + str + ")";
            }

            public final void writeToParcel(Parcel parcel, int i2) {
                Intrinsics.i(parcel, "dest");
                parcel.writeStringList(this.f35131z);
                parcel.writeString(this.f35130A);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ ChooseState(ImmutableList immutableList, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? ExtensionsKt.a() : immutableList, (i2 & 2) != 0 ? "" : str);
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ State(java.lang.String r19, com.hansecom.abt.util.resourcesResolvers.StringValue r20, java.lang.String r21, com.hansecom.abt.util.resourcesResolvers.StringValue r22, java.lang.String r23, com.hansecom.abt.util.resourcesResolvers.StringValue r24, java.lang.String r25, com.hansecom.abt.util.resourcesResolvers.StringValue r26, java.lang.String r27, com.hansecom.abt.util.resourcesResolvers.StringValue r28, java.lang.String r29, com.hansecom.abt.util.resourcesResolvers.StringValue r30, boolean r31, boolean r32, com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress.State.ChooseCountry r33, com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress.State.ChooseState r34, int r35, kotlin.jvm.internal.DefaultConstructorMarker r36) {
            /*
                r18 = this;
                r0 = r35
                r1 = r0 & 1
                java.lang.String r2 = ""
                if (r1 == 0) goto L_0x000a
                r1 = r2
                goto L_0x000c
            L_0x000a:
                r1 = r19
            L_0x000c:
                r3 = r0 & 2
                if (r3 == 0) goto L_0x0017
                com.hansecom.abt.util.resourcesResolvers.StringValue$Companion r3 = com.hansecom.abt.util.resourcesResolvers.StringValue.Companion
                com.hansecom.abt.util.resourcesResolvers.StringValue r3 = r3.a()
                goto L_0x0019
            L_0x0017:
                r3 = r20
            L_0x0019:
                r4 = r0 & 4
                if (r4 == 0) goto L_0x001f
                r4 = r2
                goto L_0x0021
            L_0x001f:
                r4 = r21
            L_0x0021:
                r5 = r0 & 8
                if (r5 == 0) goto L_0x002c
                com.hansecom.abt.util.resourcesResolvers.StringValue$Companion r5 = com.hansecom.abt.util.resourcesResolvers.StringValue.Companion
                com.hansecom.abt.util.resourcesResolvers.StringValue r5 = r5.a()
                goto L_0x002e
            L_0x002c:
                r5 = r22
            L_0x002e:
                r6 = r0 & 16
                if (r6 == 0) goto L_0x0034
                r6 = r2
                goto L_0x0036
            L_0x0034:
                r6 = r23
            L_0x0036:
                r7 = r0 & 32
                if (r7 == 0) goto L_0x0041
                com.hansecom.abt.util.resourcesResolvers.StringValue$Companion r7 = com.hansecom.abt.util.resourcesResolvers.StringValue.Companion
                com.hansecom.abt.util.resourcesResolvers.StringValue r7 = r7.a()
                goto L_0x0043
            L_0x0041:
                r7 = r24
            L_0x0043:
                r8 = r0 & 64
                if (r8 == 0) goto L_0x0049
                r8 = r2
                goto L_0x004b
            L_0x0049:
                r8 = r25
            L_0x004b:
                r9 = r0 & 128(0x80, float:1.794E-43)
                if (r9 == 0) goto L_0x0056
                com.hansecom.abt.util.resourcesResolvers.StringValue$Companion r9 = com.hansecom.abt.util.resourcesResolvers.StringValue.Companion
                com.hansecom.abt.util.resourcesResolvers.StringValue r9 = r9.a()
                goto L_0x0058
            L_0x0056:
                r9 = r26
            L_0x0058:
                r10 = r0 & 256(0x100, float:3.59E-43)
                if (r10 == 0) goto L_0x005e
                r10 = r2
                goto L_0x0060
            L_0x005e:
                r10 = r27
            L_0x0060:
                r11 = r0 & 512(0x200, float:7.175E-43)
                if (r11 == 0) goto L_0x006b
                com.hansecom.abt.util.resourcesResolvers.StringValue$Companion r11 = com.hansecom.abt.util.resourcesResolvers.StringValue.Companion
                com.hansecom.abt.util.resourcesResolvers.StringValue r11 = r11.a()
                goto L_0x006d
            L_0x006b:
                r11 = r28
            L_0x006d:
                r12 = r0 & 1024(0x400, float:1.435E-42)
                if (r12 == 0) goto L_0x0072
                goto L_0x0074
            L_0x0072:
                r2 = r29
            L_0x0074:
                r12 = r0 & 2048(0x800, float:2.87E-42)
                if (r12 == 0) goto L_0x007f
                com.hansecom.abt.util.resourcesResolvers.StringValue$Companion r12 = com.hansecom.abt.util.resourcesResolvers.StringValue.Companion
                com.hansecom.abt.util.resourcesResolvers.StringValue r12 = r12.a()
                goto L_0x0081
            L_0x007f:
                r12 = r30
            L_0x0081:
                r13 = r0 & 4096(0x1000, float:5.74E-42)
                if (r13 == 0) goto L_0x0087
                r13 = 1
                goto L_0x0089
            L_0x0087:
                r13 = r31
            L_0x0089:
                r14 = r0 & 8192(0x2000, float:1.14794E-41)
                if (r14 == 0) goto L_0x008f
                r14 = 0
                goto L_0x0091
            L_0x008f:
                r14 = r32
            L_0x0091:
                r15 = r0 & 16384(0x4000, float:2.2959E-41)
                r36 = r14
                r14 = 0
                if (r15 == 0) goto L_0x00a1
                com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress$State$ChooseCountry r15 = new com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress$State$ChooseCountry
                r16 = r13
                r13 = 3
                r15.<init>(r14, r14, r13, r14)
                goto L_0x00a6
            L_0x00a1:
                r16 = r13
                r13 = 3
                r15 = r33
            L_0x00a6:
                r17 = 32768(0x8000, float:4.5918E-41)
                r0 = r0 & r17
                if (r0 == 0) goto L_0x00b3
                com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress$State$ChooseState r0 = new com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress$State$ChooseState
                r0.<init>(r14, r14, r13, r14)
                goto L_0x00b5
            L_0x00b3:
                r0 = r34
            L_0x00b5:
                r19 = r18
                r20 = r1
                r21 = r3
                r22 = r4
                r23 = r5
                r24 = r6
                r25 = r7
                r26 = r8
                r27 = r9
                r28 = r10
                r29 = r11
                r30 = r2
                r31 = r12
                r32 = r16
                r33 = r36
                r34 = r15
                r35 = r0
                r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress.State.<init>(java.lang.String, com.hansecom.abt.util.resourcesResolvers.StringValue, java.lang.String, com.hansecom.abt.util.resourcesResolvers.StringValue, java.lang.String, com.hansecom.abt.util.resourcesResolvers.StringValue, java.lang.String, com.hansecom.abt.util.resourcesResolvers.StringValue, java.lang.String, com.hansecom.abt.util.resourcesResolvers.StringValue, java.lang.String, com.hansecom.abt.util.resourcesResolvers.StringValue, boolean, boolean, com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress$State$ChooseCountry, com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress$State$ChooseState, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
