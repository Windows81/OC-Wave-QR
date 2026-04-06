package com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup;

import android.os.Parcel;
import android.os.Parcelable;
import com.hansecom.abt.data.localDomain.PaymentMethodType;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.PersistentList;

@Metadata
public interface AutoloadSetup {

    @Metadata
    public interface Action {

        @Metadata
        public static final class BackupPaymentMethodChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final PaymentMethodState f36290a;

            public BackupPaymentMethodChange(PaymentMethodState paymentMethodState) {
                this.f36290a = paymentMethodState;
            }

            public final PaymentMethodState a() {
                return this.f36290a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BackupPaymentMethodChange) && Intrinsics.d(this.f36290a, ((BackupPaymentMethodChange) obj).f36290a);
            }

            public int hashCode() {
                PaymentMethodState paymentMethodState = this.f36290a;
                if (paymentMethodState == null) {
                    return 0;
                }
                return paymentMethodState.hashCode();
            }

            public String toString() {
                PaymentMethodState paymentMethodState = this.f36290a;
                return "BackupPaymentMethodChange(paymentMethod=" + paymentMethodState + ")";
            }
        }

        @Metadata
        public static final class BalanceThresholdChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f36291a;

            public BalanceThresholdChange(String str) {
                Intrinsics.i(str, "value");
                this.f36291a = str;
            }

            public final String a() {
                return this.f36291a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BalanceThresholdChange) && Intrinsics.d(this.f36291a, ((BalanceThresholdChange) obj).f36291a);
            }

            public int hashCode() {
                return this.f36291a.hashCode();
            }

            public String toString() {
                String str = this.f36291a;
                return "BalanceThresholdChange(value=" + str + ")";
            }
        }

        @Metadata
        public static final class Confirm implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final Confirm f36292a = new Confirm();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Confirm);
            }

            public int hashCode() {
                return 1807118826;
            }

            public String toString() {
                return "Confirm";
            }
        }

        @Metadata
        public static final class PaymentMethodChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final PaymentMethodState f36293a;

            public PaymentMethodChange(PaymentMethodState paymentMethodState) {
                Intrinsics.i(paymentMethodState, "paymentMethod");
                this.f36293a = paymentMethodState;
            }

            public final PaymentMethodState a() {
                return this.f36293a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PaymentMethodChange) && Intrinsics.d(this.f36293a, ((PaymentMethodChange) obj).f36293a);
            }

            public int hashCode() {
                return this.f36293a.hashCode();
            }

            public String toString() {
                PaymentMethodState paymentMethodState = this.f36293a;
                return "PaymentMethodChange(paymentMethod=" + paymentMethodState + ")";
            }
        }

        @Metadata
        public static final class TopUpValueChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f36294a;

            public TopUpValueChange(String str) {
                Intrinsics.i(str, "value");
                this.f36294a = str;
            }

            public final String a() {
                return this.f36294a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TopUpValueChange) && Intrinsics.d(this.f36294a, ((TopUpValueChange) obj).f36294a);
            }

            public int hashCode() {
                return this.f36294a.hashCode();
            }

            public String toString() {
                String str = this.f36294a;
                return "TopUpValueChange(value=" + str + ")";
            }
        }
    }

    @Metadata
    public interface Effect {

        @Metadata
        public static final class Error implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final StringValue f36295a;

            public Error(StringValue stringValue) {
                Intrinsics.i(stringValue, "message");
                this.f36295a = stringValue;
            }

            public final StringValue a() {
                return this.f36295a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.d(this.f36295a, ((Error) obj).f36295a);
            }

            public int hashCode() {
                return this.f36295a.hashCode();
            }

            public String toString() {
                StringValue stringValue = this.f36295a;
                return "Error(message=" + stringValue + ")";
            }
        }

        @Metadata
        public static final class InitialLoadingError implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final StringValue f36296a;

            public InitialLoadingError(StringValue stringValue) {
                Intrinsics.i(stringValue, "message");
                this.f36296a = stringValue;
            }

            public final StringValue a() {
                return this.f36296a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InitialLoadingError) && Intrinsics.d(this.f36296a, ((InitialLoadingError) obj).f36296a);
            }

            public int hashCode() {
                return this.f36296a.hashCode();
            }

            public String toString() {
                StringValue stringValue = this.f36296a;
                return "InitialLoadingError(message=" + stringValue + ")";
            }
        }

        @Metadata
        public static final class Success implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final Success f36297a = new Success();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Success);
            }

            public int hashCode() {
                return 1570405256;
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
        public final String f36298A;

        /* renamed from: B  reason: collision with root package name */
        public final BalanceValidationError f36299B;
        public final BigDecimal C;
        public final BigDecimal D;
        public final String E;
        public final TopUpValidationError F;
        public final BigDecimal G;
        public final BigDecimal H;
        public final BigDecimal I;
        public final PersistentList J;
        public final boolean K;
        public final boolean L;
        public final PaymentMethodState.CreditCard M;
        public final PersistentList N;
        public final boolean O;
        public final PaymentMethodState.CreditCard P;
        public final boolean Q;
        public final boolean R;

        /* renamed from: z  reason: collision with root package name */
        public final String f36300z;

        @Metadata
        public enum BalanceValidationError {
            MIN_VALUE,
            MAX_VALUE;

            static {
                BalanceValidationError[] d2;
                C = EnumEntriesKt.a(d2);
            }
        }

        @Metadata
        public static final class Creator implements Parcelable.Creator<State> {
            /* renamed from: a */
            public final State createFromParcel(Parcel parcel) {
                Parcel parcel2 = parcel;
                Intrinsics.i(parcel2, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                BalanceValidationError valueOf = parcel.readInt() == 0 ? null : BalanceValidationError.valueOf(parcel.readString());
                BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
                BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
                String readString3 = parcel.readString();
                TopUpValidationError valueOf2 = parcel.readInt() == 0 ? null : TopUpValidationError.valueOf(parcel.readString());
                BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
                BigDecimal bigDecimal4 = (BigDecimal) parcel.readSerializable();
                BigDecimal bigDecimal5 = (BigDecimal) parcel.readSerializable();
                PersistentList e2 = ExtensionsKt.e(parcel.createStringArrayList());
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                PaymentMethodState.CreditCard createFromParcel = parcel.readInt() == 0 ? null : PaymentMethodState.CreditCard.CREATOR.createFromParcel(parcel2);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    arrayList.add(PaymentMethodType.valueOf(parcel.readString()));
                    i2++;
                    readInt = readInt;
                }
                return new State(readString, readString2, valueOf, bigDecimal, bigDecimal2, readString3, valueOf2, bigDecimal3, bigDecimal4, bigDecimal5, e2, z2, z3, createFromParcel, ExtensionsKt.e(arrayList), parcel.readInt() != 0, parcel.readInt() == 0 ? null : PaymentMethodState.CreditCard.CREATOR.createFromParcel(parcel2), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* renamed from: b */
            public final State[] newArray(int i2) {
                return new State[i2];
            }
        }

        @Metadata
        public enum TopUpValidationError {
            MIN_VALUE,
            MAX_VALUE,
            MAX_BALANCE;

            static {
                TopUpValidationError[] d2;
                D = EnumEntriesKt.a(d2);
            }
        }

        public State(String str, String str2, BalanceValidationError balanceValidationError, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str3, TopUpValidationError topUpValidationError, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, PersistentList persistentList, boolean z2, boolean z3, PaymentMethodState.CreditCard creditCard, PersistentList persistentList2, boolean z4, PaymentMethodState.CreditCard creditCard2, boolean z5, boolean z6) {
            BigDecimal bigDecimal6 = bigDecimal;
            BigDecimal bigDecimal7 = bigDecimal2;
            String str4 = str3;
            BigDecimal bigDecimal8 = bigDecimal3;
            BigDecimal bigDecimal9 = bigDecimal4;
            BigDecimal bigDecimal10 = bigDecimal5;
            PersistentList persistentList3 = persistentList;
            PersistentList persistentList4 = persistentList2;
            Intrinsics.i(str, "title");
            Intrinsics.i(str2, "balanceThresholdValue");
            Intrinsics.i(bigDecimal6, "minBalanceThreshold");
            Intrinsics.i(bigDecimal7, "maxBalanceThreshold");
            Intrinsics.i(str4, "topUpValue");
            Intrinsics.i(bigDecimal8, "minTopUpValue");
            Intrinsics.i(bigDecimal9, "maxTopUpValue");
            Intrinsics.i(bigDecimal10, "maxBalance");
            Intrinsics.i(persistentList3, "quickSelectValues");
            Intrinsics.i(persistentList4, "paymentMethodTypes");
            this.f36300z = str;
            this.f36298A = str2;
            this.f36299B = balanceValidationError;
            this.C = bigDecimal6;
            this.D = bigDecimal7;
            this.E = str4;
            this.F = topUpValidationError;
            this.G = bigDecimal8;
            this.H = bigDecimal9;
            this.I = bigDecimal10;
            this.J = persistentList3;
            this.K = z2;
            this.L = z3;
            this.M = creditCard;
            this.N = persistentList4;
            this.O = z4;
            this.P = creditCard2;
            this.Q = z5;
            this.R = z6;
        }

        public static /* synthetic */ State b(State state, String str, String str2, BalanceValidationError balanceValidationError, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str3, TopUpValidationError topUpValidationError, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, PersistentList persistentList, boolean z2, boolean z3, PaymentMethodState.CreditCard creditCard, PersistentList persistentList2, boolean z4, PaymentMethodState.CreditCard creditCard2, boolean z5, boolean z6, int i2, Object obj) {
            State state2 = state;
            int i3 = i2;
            return state.a((i3 & 1) != 0 ? state2.f36300z : str, (i3 & 2) != 0 ? state2.f36298A : str2, (i3 & 4) != 0 ? state2.f36299B : balanceValidationError, (i3 & 8) != 0 ? state2.C : bigDecimal, (i3 & 16) != 0 ? state2.D : bigDecimal2, (i3 & 32) != 0 ? state2.E : str3, (i3 & 64) != 0 ? state2.F : topUpValidationError, (i3 & 128) != 0 ? state2.G : bigDecimal3, (i3 & 256) != 0 ? state2.H : bigDecimal4, (i3 & 512) != 0 ? state2.I : bigDecimal5, (i3 & 1024) != 0 ? state2.J : persistentList, (i3 & 2048) != 0 ? state2.K : z2, (i3 & 4096) != 0 ? state2.L : z3, (i3 & 8192) != 0 ? state2.M : creditCard, (i3 & 16384) != 0 ? state2.N : persistentList2, (i3 & 32768) != 0 ? state2.O : z4, (i3 & 65536) != 0 ? state2.P : creditCard2, (i3 & 131072) != 0 ? state2.Q : z5, (i3 & 262144) != 0 ? state2.R : z6);
        }

        public final State a(String str, String str2, BalanceValidationError balanceValidationError, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str3, TopUpValidationError topUpValidationError, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, PersistentList persistentList, boolean z2, boolean z3, PaymentMethodState.CreditCard creditCard, PersistentList persistentList2, boolean z4, PaymentMethodState.CreditCard creditCard2, boolean z5, boolean z6) {
            String str4 = str;
            Intrinsics.i(str4, "title");
            Intrinsics.i(str2, "balanceThresholdValue");
            Intrinsics.i(bigDecimal, "minBalanceThreshold");
            Intrinsics.i(bigDecimal2, "maxBalanceThreshold");
            Intrinsics.i(str3, "topUpValue");
            Intrinsics.i(bigDecimal3, "minTopUpValue");
            Intrinsics.i(bigDecimal4, "maxTopUpValue");
            Intrinsics.i(bigDecimal5, "maxBalance");
            Intrinsics.i(persistentList, "quickSelectValues");
            Intrinsics.i(persistentList2, "paymentMethodTypes");
            return new State(str4, str2, balanceValidationError, bigDecimal, bigDecimal2, str3, topUpValidationError, bigDecimal3, bigDecimal4, bigDecimal5, persistentList, z2, z3, creditCard, persistentList2, z4, creditCard2, z5, z6);
        }

        public final PaymentMethodState.CreditCard c() {
            return this.P;
        }

        public final String d() {
            return this.f36298A;
        }

        public final int describeContents() {
            return 0;
        }

        public final BalanceValidationError e() {
            return this.f36299B;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return Intrinsics.d(this.f36300z, state.f36300z) && Intrinsics.d(this.f36298A, state.f36298A) && this.f36299B == state.f36299B && Intrinsics.d(this.C, state.C) && Intrinsics.d(this.D, state.D) && Intrinsics.d(this.E, state.E) && this.F == state.F && Intrinsics.d(this.G, state.G) && Intrinsics.d(this.H, state.H) && Intrinsics.d(this.I, state.I) && Intrinsics.d(this.J, state.J) && this.K == state.K && this.L == state.L && Intrinsics.d(this.M, state.M) && Intrinsics.d(this.N, state.N) && this.O == state.O && Intrinsics.d(this.P, state.P) && this.Q == state.Q && this.R == state.R;
        }

        public final boolean f() {
            return this.L;
        }

        public final BigDecimal g() {
            return this.I;
        }

        public final BigDecimal h() {
            return this.D;
        }

        public int hashCode() {
            int hashCode = ((this.f36300z.hashCode() * 31) + this.f36298A.hashCode()) * 31;
            BalanceValidationError balanceValidationError = this.f36299B;
            int i2 = 0;
            int hashCode2 = (((((((hashCode + (balanceValidationError == null ? 0 : balanceValidationError.hashCode())) * 31) + this.C.hashCode()) * 31) + this.D.hashCode()) * 31) + this.E.hashCode()) * 31;
            TopUpValidationError topUpValidationError = this.F;
            int hashCode3 = (((((((((((((hashCode2 + (topUpValidationError == null ? 0 : topUpValidationError.hashCode())) * 31) + this.G.hashCode()) * 31) + this.H.hashCode()) * 31) + this.I.hashCode()) * 31) + this.J.hashCode()) * 31) + Boolean.hashCode(this.K)) * 31) + Boolean.hashCode(this.L)) * 31;
            PaymentMethodState.CreditCard creditCard = this.M;
            int hashCode4 = (((((hashCode3 + (creditCard == null ? 0 : creditCard.hashCode())) * 31) + this.N.hashCode()) * 31) + Boolean.hashCode(this.O)) * 31;
            PaymentMethodState.CreditCard creditCard2 = this.P;
            if (creditCard2 != null) {
                i2 = creditCard2.hashCode();
            }
            return ((((hashCode4 + i2) * 31) + Boolean.hashCode(this.Q)) * 31) + Boolean.hashCode(this.R);
        }

        public final BigDecimal i() {
            return this.H;
        }

        public final BigDecimal j() {
            return this.C;
        }

        public final BigDecimal k() {
            return this.G;
        }

        public final PaymentMethodState.CreditCard l() {
            return this.M;
        }

        public final PersistentList n() {
            return this.N;
        }

        public final PersistentList o() {
            return this.J;
        }

        public final boolean p() {
            return this.R;
        }

        public final String q() {
            return this.f36300z;
        }

        public final String r() {
            return this.E;
        }

        public final TopUpValidationError s() {
            return this.F;
        }

        public final boolean t() {
            return this.O;
        }

        public String toString() {
            String str = this.f36300z;
            String str2 = this.f36298A;
            BalanceValidationError balanceValidationError = this.f36299B;
            BigDecimal bigDecimal = this.C;
            BigDecimal bigDecimal2 = this.D;
            String str3 = this.E;
            TopUpValidationError topUpValidationError = this.F;
            BigDecimal bigDecimal3 = this.G;
            BigDecimal bigDecimal4 = this.H;
            BigDecimal bigDecimal5 = this.I;
            PersistentList persistentList = this.J;
            boolean z2 = this.K;
            boolean z3 = this.L;
            PaymentMethodState.CreditCard creditCard = this.M;
            PersistentList persistentList2 = this.N;
            boolean z4 = this.O;
            PaymentMethodState.CreditCard creditCard2 = this.P;
            boolean z5 = this.Q;
            boolean z6 = this.R;
            return "State(title=" + str + ", balanceThresholdValue=" + str2 + ", balanceThresholdValueError=" + balanceValidationError + ", minBalanceThreshold=" + bigDecimal + ", maxBalanceThreshold=" + bigDecimal2 + ", topUpValue=" + str3 + ", topUpValueError=" + topUpValidationError + ", minTopUpValue=" + bigDecimal3 + ", maxTopUpValue=" + bigDecimal4 + ", maxBalance=" + bigDecimal5 + ", quickSelectValues=" + persistentList + ", isPaused=" + z2 + ", canInputBalanceThreshold=" + z3 + ", paymentMethod=" + creditCard + ", paymentMethodTypes=" + persistentList2 + ", isBackupPaymentMethodEnabled=" + z4 + ", backupPaymentMethod=" + creditCard2 + ", isLoading=" + z5 + ", showLoadingDialog=" + z6 + ")";
        }

        public final boolean u() {
            return this.Q;
        }

        public final boolean v() {
            return this.K;
        }

        public final boolean w() {
            return this.M != null;
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeString(this.f36300z);
            parcel.writeString(this.f36298A);
            BalanceValidationError balanceValidationError = this.f36299B;
            if (balanceValidationError == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(balanceValidationError.name());
            }
            parcel.writeSerializable(this.C);
            parcel.writeSerializable(this.D);
            parcel.writeString(this.E);
            TopUpValidationError topUpValidationError = this.F;
            if (topUpValidationError == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(topUpValidationError.name());
            }
            parcel.writeSerializable(this.G);
            parcel.writeSerializable(this.H);
            parcel.writeSerializable(this.I);
            parcel.writeStringList(this.J);
            parcel.writeInt(this.K ? 1 : 0);
            parcel.writeInt(this.L ? 1 : 0);
            PaymentMethodState.CreditCard creditCard = this.M;
            if (creditCard == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                creditCard.writeToParcel(parcel, i2);
            }
            PersistentList<PaymentMethodType> persistentList = this.N;
            parcel.writeInt(persistentList.size());
            for (PaymentMethodType name : persistentList) {
                parcel.writeString(name.name());
            }
            parcel.writeInt(this.O ? 1 : 0);
            PaymentMethodState.CreditCard creditCard2 = this.P;
            if (creditCard2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                creditCard2.writeToParcel(parcel, i2);
            }
            parcel.writeInt(this.Q ? 1 : 0);
            parcel.writeInt(this.R ? 1 : 0);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ State(java.lang.String r21, java.lang.String r22, com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetup.State.BalanceValidationError r23, java.math.BigDecimal r24, java.math.BigDecimal r25, java.lang.String r26, com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetup.State.TopUpValidationError r27, java.math.BigDecimal r28, java.math.BigDecimal r29, java.math.BigDecimal r30, kotlinx.collections.immutable.PersistentList r31, boolean r32, boolean r33, com.hansecom.abt.presentation.model.PaymentMethodState.CreditCard r34, kotlinx.collections.immutable.PersistentList r35, boolean r36, com.hansecom.abt.presentation.model.PaymentMethodState.CreditCard r37, boolean r38, boolean r39, int r40, kotlin.jvm.internal.DefaultConstructorMarker r41) {
            /*
                r20 = this;
                r0 = r40
                r1 = r0 & 1
                java.lang.String r2 = ""
                if (r1 == 0) goto L_0x000a
                r1 = r2
                goto L_0x000c
            L_0x000a:
                r1 = r21
            L_0x000c:
                r3 = r0 & 2
                if (r3 == 0) goto L_0x0012
                r3 = r2
                goto L_0x0014
            L_0x0012:
                r3 = r22
            L_0x0014:
                r4 = r0 & 4
                if (r4 == 0) goto L_0x001a
                r4 = 0
                goto L_0x001c
            L_0x001a:
                r4 = r23
            L_0x001c:
                r6 = r0 & 8
                if (r6 == 0) goto L_0x0023
                java.math.BigDecimal r6 = java.math.BigDecimal.ZERO
                goto L_0x0025
            L_0x0023:
                r6 = r24
            L_0x0025:
                r7 = r0 & 16
                if (r7 == 0) goto L_0x002c
                java.math.BigDecimal r7 = java.math.BigDecimal.ZERO
                goto L_0x002e
            L_0x002c:
                r7 = r25
            L_0x002e:
                r8 = r0 & 32
                if (r8 == 0) goto L_0x0033
                goto L_0x0035
            L_0x0033:
                r2 = r26
            L_0x0035:
                r8 = r0 & 64
                if (r8 == 0) goto L_0x003b
                r8 = 0
                goto L_0x003d
            L_0x003b:
                r8 = r27
            L_0x003d:
                r9 = r0 & 128(0x80, float:1.794E-43)
                if (r9 == 0) goto L_0x0044
                java.math.BigDecimal r9 = java.math.BigDecimal.ZERO
                goto L_0x0046
            L_0x0044:
                r9 = r28
            L_0x0046:
                r10 = r0 & 256(0x100, float:3.59E-43)
                if (r10 == 0) goto L_0x004d
                java.math.BigDecimal r10 = java.math.BigDecimal.ZERO
                goto L_0x004f
            L_0x004d:
                r10 = r29
            L_0x004f:
                r11 = r0 & 512(0x200, float:7.175E-43)
                if (r11 == 0) goto L_0x0056
                java.math.BigDecimal r11 = java.math.BigDecimal.ZERO
                goto L_0x0058
            L_0x0056:
                r11 = r30
            L_0x0058:
                r12 = r0 & 1024(0x400, float:1.435E-42)
                if (r12 == 0) goto L_0x0061
                kotlinx.collections.immutable.PersistentList r12 = kotlinx.collections.immutable.ExtensionsKt.a()
                goto L_0x0063
            L_0x0061:
                r12 = r31
            L_0x0063:
                r13 = r0 & 2048(0x800, float:2.87E-42)
                if (r13 == 0) goto L_0x0069
                r13 = 0
                goto L_0x006b
            L_0x0069:
                r13 = r32
            L_0x006b:
                r15 = r0 & 4096(0x1000, float:5.74E-42)
                if (r15 == 0) goto L_0x0071
                r15 = 0
                goto L_0x0073
            L_0x0071:
                r15 = r33
            L_0x0073:
                r5 = r0 & 8192(0x2000, float:1.14794E-41)
                if (r5 == 0) goto L_0x0079
                r5 = 0
                goto L_0x007b
            L_0x0079:
                r5 = r34
            L_0x007b:
                r14 = r0 & 16384(0x4000, float:2.2959E-41)
                if (r14 == 0) goto L_0x0084
                kotlinx.collections.immutable.PersistentList r14 = kotlinx.collections.immutable.ExtensionsKt.a()
                goto L_0x0086
            L_0x0084:
                r14 = r35
            L_0x0086:
                r16 = 32768(0x8000, float:4.5918E-41)
                r16 = r0 & r16
                if (r16 == 0) goto L_0x0090
                r16 = 1
                goto L_0x0092
            L_0x0090:
                r16 = r36
            L_0x0092:
                r17 = 65536(0x10000, float:9.18355E-41)
                r17 = r0 & r17
                if (r17 == 0) goto L_0x009b
                r17 = 0
                goto L_0x009d
            L_0x009b:
                r17 = r37
            L_0x009d:
                r18 = 131072(0x20000, float:1.83671E-40)
                r18 = r0 & r18
                if (r18 == 0) goto L_0x00a6
                r18 = 0
                goto L_0x00a8
            L_0x00a6:
                r18 = r38
            L_0x00a8:
                r19 = 262144(0x40000, float:3.67342E-40)
                r0 = r0 & r19
                if (r0 == 0) goto L_0x00b0
                r0 = 0
                goto L_0x00b2
            L_0x00b0:
                r0 = r39
            L_0x00b2:
                r21 = r20
                r22 = r1
                r23 = r3
                r24 = r4
                r25 = r6
                r26 = r7
                r27 = r2
                r28 = r8
                r29 = r9
                r30 = r10
                r31 = r11
                r32 = r12
                r33 = r13
                r34 = r15
                r35 = r5
                r36 = r14
                r37 = r16
                r38 = r17
                r39 = r18
                r40 = r0
                r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetup.State.<init>(java.lang.String, java.lang.String, com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetup$State$BalanceValidationError, java.math.BigDecimal, java.math.BigDecimal, java.lang.String, com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetup$State$TopUpValidationError, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, kotlinx.collections.immutable.PersistentList, boolean, boolean, com.hansecom.abt.presentation.model.PaymentMethodState$CreditCard, kotlinx.collections.immutable.PersistentList, boolean, com.hansecom.abt.presentation.model.PaymentMethodState$CreditCard, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
