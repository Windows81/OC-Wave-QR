package com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi;

import android.os.Parcel;
import android.os.Parcelable;
import com.hansecom.abt.api.networkMerchants.CreditCardInfoNetworkMerchantResponse;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;

@Metadata
public interface AddPaymentMethodNmi {

    @Metadata
    public interface Action {

        @Metadata
        public interface ChooseCountry extends Action {

            @Metadata
            public static final class CountryChange implements ChooseCountry {

                /* renamed from: a  reason: collision with root package name */
                public final String f35596a;

                public CountryChange(String str) {
                    Intrinsics.i(str, "value");
                    this.f35596a = str;
                }

                public final String a() {
                    return this.f35596a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof CountryChange) && Intrinsics.d(this.f35596a, ((CountryChange) obj).f35596a);
                }

                public int hashCode() {
                    return this.f35596a.hashCode();
                }

                public String toString() {
                    String str = this.f35596a;
                    return "CountryChange(value=" + str + ")";
                }
            }

            @Metadata
            public static final class FilterChange implements ChooseCountry {

                /* renamed from: a  reason: collision with root package name */
                public final String f35597a;

                public FilterChange(String str) {
                    Intrinsics.i(str, "value");
                    this.f35597a = str;
                }

                public final String a() {
                    return this.f35597a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof FilterChange) && Intrinsics.d(this.f35597a, ((FilterChange) obj).f35597a);
                }

                public int hashCode() {
                    return this.f35597a.hashCode();
                }

                public String toString() {
                    String str = this.f35597a;
                    return "FilterChange(value=" + str + ")";
                }
            }
        }

        @Metadata
        public interface ChooseState extends Action {

            @Metadata
            public static final class FilterChange implements ChooseState {

                /* renamed from: a  reason: collision with root package name */
                public final String f35598a;

                public FilterChange(String str) {
                    Intrinsics.i(str, "value");
                    this.f35598a = str;
                }

                public final String a() {
                    return this.f35598a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof FilterChange) && Intrinsics.d(this.f35598a, ((FilterChange) obj).f35598a);
                }

                public int hashCode() {
                    return this.f35598a.hashCode();
                }

                public String toString() {
                    String str = this.f35598a;
                    return "FilterChange(value=" + str + ")";
                }
            }

            @Metadata
            public static final class StateChange implements ChooseState {

                /* renamed from: a  reason: collision with root package name */
                public final String f35599a;

                public StateChange(String str) {
                    Intrinsics.i(str, "value");
                    this.f35599a = str;
                }

                public final String a() {
                    return this.f35599a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof StateChange) && Intrinsics.d(this.f35599a, ((StateChange) obj).f35599a);
                }

                public int hashCode() {
                    return this.f35599a.hashCode();
                }

                public String toString() {
                    String str = this.f35599a;
                    return "StateChange(value=" + str + ")";
                }
            }
        }

        @Metadata
        public static final class CityChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f35600a;

            public CityChange(String str) {
                Intrinsics.i(str, "value");
                this.f35600a = str;
            }

            public final String a() {
                return this.f35600a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CityChange) && Intrinsics.d(this.f35600a, ((CityChange) obj).f35600a);
            }

            public int hashCode() {
                return this.f35600a.hashCode();
            }

            public String toString() {
                String str = this.f35600a;
                return "CityChange(value=" + str + ")";
            }
        }

        @Metadata
        public static final class Confirm implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final Confirm f35601a = new Confirm();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Confirm);
            }

            public int hashCode() {
                return -1188794453;
            }

            public String toString() {
                return "Confirm";
            }
        }

        @Metadata
        public static final class NicknameChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f35602a;

            public NicknameChange(String str) {
                Intrinsics.i(str, "value");
                this.f35602a = str;
            }

            public final String a() {
                return this.f35602a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NicknameChange) && Intrinsics.d(this.f35602a, ((NicknameChange) obj).f35602a);
            }

            public int hashCode() {
                return this.f35602a.hashCode();
            }

            public String toString() {
                String str = this.f35602a;
                return "NicknameChange(value=" + str + ")";
            }
        }

        @Metadata
        public static final class OnCardAddedInWebView implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final CreditCardInfoNetworkMerchantResponse f35603a;

            public OnCardAddedInWebView(CreditCardInfoNetworkMerchantResponse creditCardInfoNetworkMerchantResponse) {
                Intrinsics.i(creditCardInfoNetworkMerchantResponse, "value");
                this.f35603a = creditCardInfoNetworkMerchantResponse;
            }

            public final CreditCardInfoNetworkMerchantResponse a() {
                return this.f35603a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OnCardAddedInWebView) && Intrinsics.d(this.f35603a, ((OnCardAddedInWebView) obj).f35603a);
            }

            public int hashCode() {
                return this.f35603a.hashCode();
            }

            public String toString() {
                CreditCardInfoNetworkMerchantResponse creditCardInfoNetworkMerchantResponse = this.f35603a;
                return "OnCardAddedInWebView(value=" + creditCardInfoNetworkMerchantResponse + ")";
            }
        }

        @Metadata
        public static final class PostalCodeChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f35604a;

            public PostalCodeChange(String str) {
                Intrinsics.i(str, "value");
                this.f35604a = str;
            }

            public final String a() {
                return this.f35604a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PostalCodeChange) && Intrinsics.d(this.f35604a, ((PostalCodeChange) obj).f35604a);
            }

            public int hashCode() {
                return this.f35604a.hashCode();
            }

            public String toString() {
                String str = this.f35604a;
                return "PostalCodeChange(value=" + str + ")";
            }
        }

        @Metadata
        public static final class StateChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f35605a;

            public StateChange(String str) {
                Intrinsics.i(str, "value");
                this.f35605a = str;
            }

            public final String a() {
                return this.f35605a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateChange) && Intrinsics.d(this.f35605a, ((StateChange) obj).f35605a);
            }

            public int hashCode() {
                return this.f35605a.hashCode();
            }

            public String toString() {
                String str = this.f35605a;
                return "StateChange(value=" + str + ")";
            }
        }

        @Metadata
        public static final class StreetNameChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f35606a;

            public StreetNameChange(String str) {
                Intrinsics.i(str, "value");
                this.f35606a = str;
            }

            public final String a() {
                return this.f35606a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StreetNameChange) && Intrinsics.d(this.f35606a, ((StreetNameChange) obj).f35606a);
            }

            public int hashCode() {
                return this.f35606a.hashCode();
            }

            public String toString() {
                String str = this.f35606a;
                return "StreetNameChange(value=" + str + ")";
            }
        }

        @Metadata
        public static final class StreetNameSecondLineChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f35607a;

            public StreetNameSecondLineChange(String str) {
                Intrinsics.i(str, "value");
                this.f35607a = str;
            }

            public final String a() {
                return this.f35607a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StreetNameSecondLineChange) && Intrinsics.d(this.f35607a, ((StreetNameSecondLineChange) obj).f35607a);
            }

            public int hashCode() {
                return this.f35607a.hashCode();
            }

            public String toString() {
                String str = this.f35607a;
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
                public static final ChangeCountrySuccess f35608a = new ChangeCountrySuccess();

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof ChangeCountrySuccess);
                }

                public int hashCode() {
                    return 1136932255;
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
                public static final ChangeStateSuccess f35609a = new ChangeStateSuccess();

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof ChangeStateSuccess);
                }

                public int hashCode() {
                    return 1295561321;
                }

                public String toString() {
                    return "ChangeStateSuccess";
                }
            }
        }

        @Metadata
        public static final class Error implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final StringValue f35610a;

            public Error(StringValue stringValue) {
                Intrinsics.i(stringValue, "message");
                this.f35610a = stringValue;
            }

            public final StringValue a() {
                return this.f35610a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.d(this.f35610a, ((Error) obj).f35610a);
            }

            public int hashCode() {
                return this.f35610a.hashCode();
            }

            public String toString() {
                StringValue stringValue = this.f35610a;
                return "Error(message=" + stringValue + ")";
            }
        }

        @Metadata
        public static final class InitialLoadingError implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final StringValue f35611a;

            public InitialLoadingError(StringValue stringValue) {
                Intrinsics.i(stringValue, "message");
                this.f35611a = stringValue;
            }

            public final StringValue a() {
                return this.f35611a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InitialLoadingError) && Intrinsics.d(this.f35611a, ((InitialLoadingError) obj).f35611a);
            }

            public int hashCode() {
                return this.f35611a.hashCode();
            }

            public String toString() {
                StringValue stringValue = this.f35611a;
                return "InitialLoadingError(message=" + stringValue + ")";
            }
        }

        @Metadata
        public static final class Success implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final Success f35612a = new Success();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Success);
            }

            public int hashCode() {
                return -1425508023;
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
        public final String f35613A;

        /* renamed from: B  reason: collision with root package name */
        public final boolean f35614B;
        public final boolean C;
        public final String D;
        public final StringValue E;
        public final String F;
        public final StringValue G;
        public final String H;
        public final StringValue I;
        public final String J;
        public final StringValue K;
        public final String L;
        public final StringValue M;
        public final String N;
        public final StringValue O;
        public final boolean P;
        public final int Q;
        public final ChooseCountry R;
        public final ChooseState S;

        /* renamed from: z  reason: collision with root package name */
        public final String f35615z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<State> {
            /* renamed from: a */
            public final State createFromParcel(Parcel parcel) {
                Parcel parcel2 = parcel;
                Intrinsics.i(parcel2, "parcel");
                Class<State> cls = State.class;
                return new State(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), (StringValue) parcel2.readParcelable(cls.getClassLoader()), parcel.readString(), (StringValue) parcel2.readParcelable(cls.getClassLoader()), parcel.readString(), (StringValue) parcel2.readParcelable(cls.getClassLoader()), parcel.readString(), (StringValue) parcel2.readParcelable(cls.getClassLoader()), parcel.readString(), (StringValue) parcel2.readParcelable(cls.getClassLoader()), parcel.readString(), (StringValue) parcel2.readParcelable(cls.getClassLoader()), parcel.readInt() != 0, parcel.readInt(), ChooseCountry.CREATOR.createFromParcel(parcel2), ChooseState.CREATOR.createFromParcel(parcel2));
            }

            /* renamed from: b */
            public final State[] newArray(int i2) {
                return new State[i2];
            }
        }

        public State(String str, String str2, boolean z2, boolean z3, String str3, StringValue stringValue, String str4, StringValue stringValue2, String str5, StringValue stringValue3, String str6, StringValue stringValue4, String str7, StringValue stringValue5, String str8, StringValue stringValue6, boolean z4, int i2, ChooseCountry chooseCountry, ChooseState chooseState) {
            String str9 = str;
            String str10 = str2;
            String str11 = str3;
            StringValue stringValue7 = stringValue;
            String str12 = str4;
            StringValue stringValue8 = stringValue2;
            String str13 = str5;
            StringValue stringValue9 = stringValue3;
            String str14 = str6;
            StringValue stringValue10 = stringValue4;
            String str15 = str7;
            StringValue stringValue11 = stringValue5;
            String str16 = str8;
            StringValue stringValue12 = stringValue6;
            Intrinsics.i(str9, "nickName");
            Intrinsics.i(str10, "cardNumber");
            Intrinsics.i(str11, "streetName");
            Intrinsics.i(stringValue7, "streetNameError");
            Intrinsics.i(str12, "streetNameSecondLine");
            Intrinsics.i(stringValue8, "streetNameSecondLineError");
            Intrinsics.i(str13, "city");
            Intrinsics.i(stringValue9, "cityError");
            Intrinsics.i(str14, "postalCode");
            Intrinsics.i(stringValue10, "postalCodeError");
            Intrinsics.i(str15, "country");
            Intrinsics.i(stringValue11, "countryError");
            Intrinsics.i(str16, "state");
            Intrinsics.i(stringValue12, "stateError");
            Intrinsics.i(chooseCountry, "chooseCountryState");
            ChooseState chooseState2 = chooseState;
            Intrinsics.i(chooseState2, "chooseStateState");
            this.f35615z = str9;
            this.f35613A = str10;
            this.f35614B = z2;
            this.C = z3;
            this.D = str11;
            this.E = stringValue7;
            this.F = str12;
            this.G = stringValue8;
            this.H = str13;
            this.I = stringValue9;
            this.J = str14;
            this.K = stringValue10;
            this.L = str15;
            this.M = stringValue11;
            this.N = str16;
            this.O = stringValue12;
            this.P = z4;
            this.Q = i2;
            this.R = chooseCountry;
            this.S = chooseState2;
        }

        public static /* synthetic */ State b(State state, String str, String str2, boolean z2, boolean z3, String str3, StringValue stringValue, String str4, StringValue stringValue2, String str5, StringValue stringValue3, String str6, StringValue stringValue4, String str7, StringValue stringValue5, String str8, StringValue stringValue6, boolean z4, int i2, ChooseCountry chooseCountry, ChooseState chooseState, int i3, Object obj) {
            State state2 = state;
            int i4 = i3;
            return state.a((i4 & 1) != 0 ? state2.f35615z : str, (i4 & 2) != 0 ? state2.f35613A : str2, (i4 & 4) != 0 ? state2.f35614B : z2, (i4 & 8) != 0 ? state2.C : z3, (i4 & 16) != 0 ? state2.D : str3, (i4 & 32) != 0 ? state2.E : stringValue, (i4 & 64) != 0 ? state2.F : str4, (i4 & 128) != 0 ? state2.G : stringValue2, (i4 & 256) != 0 ? state2.H : str5, (i4 & 512) != 0 ? state2.I : stringValue3, (i4 & 1024) != 0 ? state2.J : str6, (i4 & 2048) != 0 ? state2.K : stringValue4, (i4 & 4096) != 0 ? state2.L : str7, (i4 & 8192) != 0 ? state2.M : stringValue5, (i4 & 16384) != 0 ? state2.N : str8, (i4 & 32768) != 0 ? state2.O : stringValue6, (i4 & 65536) != 0 ? state2.P : z4, (i4 & 131072) != 0 ? state2.Q : i2, (i4 & 262144) != 0 ? state2.R : chooseCountry, (i4 & 524288) != 0 ? state2.S : chooseState);
        }

        public final State a(String str, String str2, boolean z2, boolean z3, String str3, StringValue stringValue, String str4, StringValue stringValue2, String str5, StringValue stringValue3, String str6, StringValue stringValue4, String str7, StringValue stringValue5, String str8, StringValue stringValue6, boolean z4, int i2, ChooseCountry chooseCountry, ChooseState chooseState) {
            String str9 = str;
            Intrinsics.i(str9, "nickName");
            Intrinsics.i(str2, "cardNumber");
            Intrinsics.i(str3, "streetName");
            Intrinsics.i(stringValue, "streetNameError");
            Intrinsics.i(str4, "streetNameSecondLine");
            Intrinsics.i(stringValue2, "streetNameSecondLineError");
            Intrinsics.i(str5, "city");
            Intrinsics.i(stringValue3, "cityError");
            Intrinsics.i(str6, "postalCode");
            Intrinsics.i(stringValue4, "postalCodeError");
            Intrinsics.i(str7, "country");
            Intrinsics.i(stringValue5, "countryError");
            Intrinsics.i(str8, "state");
            Intrinsics.i(stringValue6, "stateError");
            Intrinsics.i(chooseCountry, "chooseCountryState");
            Intrinsics.i(chooseState, "chooseStateState");
            return new State(str9, str2, z2, z3, str3, stringValue, str4, stringValue2, str5, stringValue3, str6, stringValue4, str7, stringValue5, str8, stringValue6, z4, i2, chooseCountry, chooseState);
        }

        public final String c() {
            return this.f35613A;
        }

        public final ChooseCountry d() {
            return this.R;
        }

        public final int describeContents() {
            return 0;
        }

        public final ChooseState e() {
            return this.S;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return Intrinsics.d(this.f35615z, state.f35615z) && Intrinsics.d(this.f35613A, state.f35613A) && this.f35614B == state.f35614B && this.C == state.C && Intrinsics.d(this.D, state.D) && Intrinsics.d(this.E, state.E) && Intrinsics.d(this.F, state.F) && Intrinsics.d(this.G, state.G) && Intrinsics.d(this.H, state.H) && Intrinsics.d(this.I, state.I) && Intrinsics.d(this.J, state.J) && Intrinsics.d(this.K, state.K) && Intrinsics.d(this.L, state.L) && Intrinsics.d(this.M, state.M) && Intrinsics.d(this.N, state.N) && Intrinsics.d(this.O, state.O) && this.P == state.P && this.Q == state.Q && Intrinsics.d(this.R, state.R) && Intrinsics.d(this.S, state.S);
        }

        public final String f() {
            return this.H;
        }

        public final StringValue g() {
            return this.I;
        }

        public final String h() {
            return this.L;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((((((((this.f35615z.hashCode() * 31) + this.f35613A.hashCode()) * 31) + Boolean.hashCode(this.f35614B)) * 31) + Boolean.hashCode(this.C)) * 31) + this.D.hashCode()) * 31) + this.E.hashCode()) * 31) + this.F.hashCode()) * 31) + this.G.hashCode()) * 31) + this.H.hashCode()) * 31) + this.I.hashCode()) * 31) + this.J.hashCode()) * 31) + this.K.hashCode()) * 31) + this.L.hashCode()) * 31) + this.M.hashCode()) * 31) + this.N.hashCode()) * 31) + this.O.hashCode()) * 31) + Boolean.hashCode(this.P)) * 31) + Integer.hashCode(this.Q)) * 31) + this.R.hashCode()) * 31) + this.S.hashCode();
        }

        public final StringValue i() {
            return this.M;
        }

        public final boolean j() {
            StringValue stringValue = this.O;
            StringValue.Companion companion = StringValue.Companion;
            return !Intrinsics.d(stringValue, companion.a()) || !Intrinsics.d(this.M, companion.a()) || !Intrinsics.d(this.E, companion.a()) || !Intrinsics.d(this.G, companion.a()) || !Intrinsics.d(this.I, companion.a()) || !Intrinsics.d(this.K, companion.a());
        }

        public final String k() {
            return this.f35615z;
        }

        public final int l() {
            return this.Q;
        }

        public final String n() {
            return this.J;
        }

        public final StringValue o() {
            return this.K;
        }

        public final boolean p() {
            return this.P;
        }

        public final String q() {
            return this.N;
        }

        public final StringValue r() {
            return this.O;
        }

        public final String s() {
            return this.D;
        }

        public final StringValue t() {
            return this.E;
        }

        public String toString() {
            String str = this.f35615z;
            String str2 = this.f35613A;
            boolean z2 = this.f35614B;
            boolean z3 = this.C;
            String str3 = this.D;
            StringValue stringValue = this.E;
            String str4 = this.F;
            StringValue stringValue2 = this.G;
            String str5 = this.H;
            StringValue stringValue3 = this.I;
            String str6 = this.J;
            StringValue stringValue4 = this.K;
            String str7 = this.L;
            StringValue stringValue5 = this.M;
            String str8 = this.N;
            StringValue stringValue6 = this.O;
            boolean z4 = this.P;
            int i2 = this.Q;
            ChooseCountry chooseCountry = this.R;
            ChooseState chooseState = this.S;
            return "State(nickName=" + str + ", cardNumber=" + str2 + ", isCardInfoFilled=" + z2 + ", isLoading=" + z3 + ", streetName=" + str3 + ", streetNameError=" + stringValue + ", streetNameSecondLine=" + str4 + ", streetNameSecondLineError=" + stringValue2 + ", city=" + str5 + ", cityError=" + stringValue3 + ", postalCode=" + str6 + ", postalCodeError=" + stringValue4 + ", country=" + str7 + ", countryError=" + stringValue5 + ", state=" + str8 + ", stateError=" + stringValue6 + ", showStatesSelector=" + z4 + ", nmiPaymentPageResource=" + i2 + ", chooseCountryState=" + chooseCountry + ", chooseStateState=" + chooseState + ")";
        }

        public final String u() {
            return this.F;
        }

        public final StringValue v() {
            return this.G;
        }

        public final boolean w() {
            return this.f35614B;
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeString(this.f35615z);
            parcel.writeString(this.f35613A);
            parcel.writeInt(this.f35614B ? 1 : 0);
            parcel.writeInt(this.C ? 1 : 0);
            parcel.writeString(this.D);
            parcel.writeParcelable(this.E, i2);
            parcel.writeString(this.F);
            parcel.writeParcelable(this.G, i2);
            parcel.writeString(this.H);
            parcel.writeParcelable(this.I, i2);
            parcel.writeString(this.J);
            parcel.writeParcelable(this.K, i2);
            parcel.writeString(this.L);
            parcel.writeParcelable(this.M, i2);
            parcel.writeString(this.N);
            parcel.writeParcelable(this.O, i2);
            parcel.writeInt(this.P ? 1 : 0);
            parcel.writeInt(this.Q);
            this.R.writeToParcel(parcel, i2);
            this.S.writeToParcel(parcel, i2);
        }

        public final boolean x() {
            return this.C;
        }

        @Metadata
        public static final class ChooseCountry implements Parcelable {
            public static final Parcelable.Creator<ChooseCountry> CREATOR = new Creator();

            /* renamed from: A  reason: collision with root package name */
            public final String f35616A;

            /* renamed from: z  reason: collision with root package name */
            public final ImmutableList f35617z;

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
                this.f35617z = immutableList;
                this.f35616A = str;
            }

            public static /* synthetic */ ChooseCountry b(ChooseCountry chooseCountry, ImmutableList immutableList, String str, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    immutableList = chooseCountry.f35617z;
                }
                if ((i2 & 2) != 0) {
                    str = chooseCountry.f35616A;
                }
                return chooseCountry.a(immutableList, str);
            }

            public final ChooseCountry a(ImmutableList immutableList, String str) {
                Intrinsics.i(immutableList, "countries");
                Intrinsics.i(str, "filter");
                return new ChooseCountry(immutableList, str);
            }

            public final ImmutableList c() {
                return this.f35617z;
            }

            public final String d() {
                return this.f35616A;
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
                return Intrinsics.d(this.f35617z, chooseCountry.f35617z) && Intrinsics.d(this.f35616A, chooseCountry.f35616A);
            }

            public int hashCode() {
                return (this.f35617z.hashCode() * 31) + this.f35616A.hashCode();
            }

            public String toString() {
                ImmutableList immutableList = this.f35617z;
                String str = this.f35616A;
                return "ChooseCountry(countries=" + immutableList + ", filter=" + str + ")";
            }

            public final void writeToParcel(Parcel parcel, int i2) {
                Intrinsics.i(parcel, "dest");
                parcel.writeStringList(this.f35617z);
                parcel.writeString(this.f35616A);
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
            public final String f35618A;

            /* renamed from: z  reason: collision with root package name */
            public final ImmutableList f35619z;

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
                this.f35619z = immutableList;
                this.f35618A = str;
            }

            public static /* synthetic */ ChooseState b(ChooseState chooseState, ImmutableList immutableList, String str, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    immutableList = chooseState.f35619z;
                }
                if ((i2 & 2) != 0) {
                    str = chooseState.f35618A;
                }
                return chooseState.a(immutableList, str);
            }

            public final ChooseState a(ImmutableList immutableList, String str) {
                Intrinsics.i(immutableList, "states");
                Intrinsics.i(str, "filter");
                return new ChooseState(immutableList, str);
            }

            public final String c() {
                return this.f35618A;
            }

            public final ImmutableList d() {
                return this.f35619z;
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
                return Intrinsics.d(this.f35619z, chooseState.f35619z) && Intrinsics.d(this.f35618A, chooseState.f35618A);
            }

            public int hashCode() {
                return (this.f35619z.hashCode() * 31) + this.f35618A.hashCode();
            }

            public String toString() {
                ImmutableList immutableList = this.f35619z;
                String str = this.f35618A;
                return "ChooseState(states=" + immutableList + ", filter=" + str + ")";
            }

            public final void writeToParcel(Parcel parcel, int i2) {
                Intrinsics.i(parcel, "dest");
                parcel.writeStringList(this.f35619z);
                parcel.writeString(this.f35618A);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ ChooseState(ImmutableList immutableList, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? ExtensionsKt.a() : immutableList, (i2 & 2) != 0 ? "" : str);
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ State(java.lang.String r23, java.lang.String r24, boolean r25, boolean r26, java.lang.String r27, com.hansecom.abt.util.resourcesResolvers.StringValue r28, java.lang.String r29, com.hansecom.abt.util.resourcesResolvers.StringValue r30, java.lang.String r31, com.hansecom.abt.util.resourcesResolvers.StringValue r32, java.lang.String r33, com.hansecom.abt.util.resourcesResolvers.StringValue r34, java.lang.String r35, com.hansecom.abt.util.resourcesResolvers.StringValue r36, java.lang.String r37, com.hansecom.abt.util.resourcesResolvers.StringValue r38, boolean r39, int r40, com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi.State.ChooseCountry r41, com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi.State.ChooseState r42, int r43, kotlin.jvm.internal.DefaultConstructorMarker r44) {
            /*
                r22 = this;
                r0 = r43
                r1 = r0 & 1
                java.lang.String r2 = ""
                if (r1 == 0) goto L_0x000a
                r1 = r2
                goto L_0x000c
            L_0x000a:
                r1 = r23
            L_0x000c:
                r3 = r0 & 2
                if (r3 == 0) goto L_0x0012
                r3 = r2
                goto L_0x0014
            L_0x0012:
                r3 = r24
            L_0x0014:
                r4 = r0 & 4
                if (r4 == 0) goto L_0x001a
                r4 = 0
                goto L_0x001c
            L_0x001a:
                r4 = r25
            L_0x001c:
                r6 = r0 & 8
                if (r6 == 0) goto L_0x0022
                r6 = 0
                goto L_0x0024
            L_0x0022:
                r6 = r26
            L_0x0024:
                r7 = r0 & 16
                if (r7 == 0) goto L_0x002a
                r7 = r2
                goto L_0x002c
            L_0x002a:
                r7 = r27
            L_0x002c:
                r8 = r0 & 32
                if (r8 == 0) goto L_0x0037
                com.hansecom.abt.util.resourcesResolvers.StringValue$Companion r8 = com.hansecom.abt.util.resourcesResolvers.StringValue.Companion
                com.hansecom.abt.util.resourcesResolvers.StringValue r8 = r8.a()
                goto L_0x0039
            L_0x0037:
                r8 = r28
            L_0x0039:
                r9 = r0 & 64
                if (r9 == 0) goto L_0x003f
                r9 = r2
                goto L_0x0041
            L_0x003f:
                r9 = r29
            L_0x0041:
                r10 = r0 & 128(0x80, float:1.794E-43)
                if (r10 == 0) goto L_0x004c
                com.hansecom.abt.util.resourcesResolvers.StringValue$Companion r10 = com.hansecom.abt.util.resourcesResolvers.StringValue.Companion
                com.hansecom.abt.util.resourcesResolvers.StringValue r10 = r10.a()
                goto L_0x004e
            L_0x004c:
                r10 = r30
            L_0x004e:
                r11 = r0 & 256(0x100, float:3.59E-43)
                if (r11 == 0) goto L_0x0054
                r11 = r2
                goto L_0x0056
            L_0x0054:
                r11 = r31
            L_0x0056:
                r12 = r0 & 512(0x200, float:7.175E-43)
                if (r12 == 0) goto L_0x0061
                com.hansecom.abt.util.resourcesResolvers.StringValue$Companion r12 = com.hansecom.abt.util.resourcesResolvers.StringValue.Companion
                com.hansecom.abt.util.resourcesResolvers.StringValue r12 = r12.a()
                goto L_0x0063
            L_0x0061:
                r12 = r32
            L_0x0063:
                r13 = r0 & 1024(0x400, float:1.435E-42)
                if (r13 == 0) goto L_0x0069
                r13 = r2
                goto L_0x006b
            L_0x0069:
                r13 = r33
            L_0x006b:
                r14 = r0 & 2048(0x800, float:2.87E-42)
                if (r14 == 0) goto L_0x0076
                com.hansecom.abt.util.resourcesResolvers.StringValue$Companion r14 = com.hansecom.abt.util.resourcesResolvers.StringValue.Companion
                com.hansecom.abt.util.resourcesResolvers.StringValue r14 = r14.a()
                goto L_0x0078
            L_0x0076:
                r14 = r34
            L_0x0078:
                r15 = r0 & 4096(0x1000, float:5.74E-42)
                if (r15 == 0) goto L_0x007e
                r15 = r2
                goto L_0x0080
            L_0x007e:
                r15 = r35
            L_0x0080:
                r5 = r0 & 8192(0x2000, float:1.14794E-41)
                if (r5 == 0) goto L_0x008b
                com.hansecom.abt.util.resourcesResolvers.StringValue$Companion r5 = com.hansecom.abt.util.resourcesResolvers.StringValue.Companion
                com.hansecom.abt.util.resourcesResolvers.StringValue r5 = r5.a()
                goto L_0x008d
            L_0x008b:
                r5 = r36
            L_0x008d:
                r44 = r2
                r2 = r0 & 16384(0x4000, float:2.2959E-41)
                if (r2 == 0) goto L_0x0096
                r2 = r44
                goto L_0x0098
            L_0x0096:
                r2 = r37
            L_0x0098:
                r16 = 32768(0x8000, float:4.5918E-41)
                r16 = r0 & r16
                if (r16 == 0) goto L_0x00a6
                com.hansecom.abt.util.resourcesResolvers.StringValue$Companion r16 = com.hansecom.abt.util.resourcesResolvers.StringValue.Companion
                com.hansecom.abt.util.resourcesResolvers.StringValue r16 = r16.a()
                goto L_0x00a8
            L_0x00a6:
                r16 = r38
            L_0x00a8:
                r17 = 65536(0x10000, float:9.18355E-41)
                r17 = r0 & r17
                if (r17 == 0) goto L_0x00b1
                r17 = 1
                goto L_0x00b3
            L_0x00b1:
                r17 = r39
            L_0x00b3:
                r18 = 131072(0x20000, float:1.83671E-40)
                r18 = r0 & r18
                if (r18 == 0) goto L_0x00bc
                r18 = 0
                goto L_0x00be
            L_0x00bc:
                r18 = r40
            L_0x00be:
                r19 = 262144(0x40000, float:3.67342E-40)
                r19 = r0 & r19
                r44 = r2
                r2 = 0
                if (r19 == 0) goto L_0x00d2
                r19 = r5
                com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi$State$ChooseCountry r5 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi$State$ChooseCountry
                r20 = r15
                r15 = 3
                r5.<init>(r2, r2, r15, r2)
                goto L_0x00d9
            L_0x00d2:
                r19 = r5
                r20 = r15
                r15 = 3
                r5 = r41
            L_0x00d9:
                r21 = 524288(0x80000, float:7.34684E-40)
                r0 = r0 & r21
                if (r0 == 0) goto L_0x00e5
                com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi$State$ChooseState r0 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi$State$ChooseState
                r0.<init>(r2, r2, r15, r2)
                goto L_0x00e7
            L_0x00e5:
                r0 = r42
            L_0x00e7:
                r23 = r22
                r24 = r1
                r25 = r3
                r26 = r4
                r27 = r6
                r28 = r7
                r29 = r8
                r30 = r9
                r31 = r10
                r32 = r11
                r33 = r12
                r34 = r13
                r35 = r14
                r36 = r20
                r37 = r19
                r38 = r44
                r39 = r16
                r40 = r17
                r41 = r18
                r42 = r5
                r43 = r0
                r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi.State.<init>(java.lang.String, java.lang.String, boolean, boolean, java.lang.String, com.hansecom.abt.util.resourcesResolvers.StringValue, java.lang.String, com.hansecom.abt.util.resourcesResolvers.StringValue, java.lang.String, com.hansecom.abt.util.resourcesResolvers.StringValue, java.lang.String, com.hansecom.abt.util.resourcesResolvers.StringValue, java.lang.String, com.hansecom.abt.util.resourcesResolvers.StringValue, java.lang.String, com.hansecom.abt.util.resourcesResolvers.StringValue, boolean, int, com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi$State$ChooseCountry, com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi$State$ChooseState, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
