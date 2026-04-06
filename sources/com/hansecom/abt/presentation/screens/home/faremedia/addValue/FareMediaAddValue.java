package com.hansecom.abt.presentation.screens.home.faremedia.addValue;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.contract.ApiTaskResult;
import com.hansecom.abt.data.localDomain.PaymentMethodType;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import com.hansecom.abt.ui.UiResult;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.PersistentList;

@Metadata
public interface FareMediaAddValue {

    @Metadata
    public interface Action {

        @Metadata
        public static final class Confirm implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final Confirm f36057a = new Confirm();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Confirm);
            }

            public int hashCode() {
                return 1225891040;
            }

            public String toString() {
                return "Confirm";
            }
        }

        @Metadata
        public static final class CouponApply implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final CouponApply f36058a = new CouponApply();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof CouponApply);
            }

            public int hashCode() {
                return 1279101192;
            }

            public String toString() {
                return "CouponApply";
            }
        }

        @Metadata
        public static final class CouponChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f36059a;

            public CouponChange(String str) {
                Intrinsics.i(str, "value");
                this.f36059a = str;
            }

            public final String a() {
                return this.f36059a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CouponChange) && Intrinsics.d(this.f36059a, ((CouponChange) obj).f36059a);
            }

            public int hashCode() {
                return this.f36059a.hashCode();
            }

            public String toString() {
                String str = this.f36059a;
                return "CouponChange(value=" + str + ")";
            }
        }

        @Metadata
        public static final class CouponReset implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final CouponReset f36060a = new CouponReset();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof CouponReset);
            }

            public int hashCode() {
                return 1294476009;
            }

            public String toString() {
                return "CouponReset";
            }
        }

        @Metadata
        public static final class GooglePayResult implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final ApiTaskResult f36061a;

            public GooglePayResult(ApiTaskResult apiTaskResult) {
                Intrinsics.i(apiTaskResult, "result");
                this.f36061a = apiTaskResult;
            }

            public final ApiTaskResult a() {
                return this.f36061a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof GooglePayResult) && Intrinsics.d(this.f36061a, ((GooglePayResult) obj).f36061a);
            }

            public int hashCode() {
                return this.f36061a.hashCode();
            }

            public String toString() {
                ApiTaskResult apiTaskResult = this.f36061a;
                return "GooglePayResult(result=" + apiTaskResult + ")";
            }
        }

        @Metadata
        public static final class PaymentMethodChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final PaymentMethodState f36062a;

            public PaymentMethodChange(PaymentMethodState paymentMethodState) {
                Intrinsics.i(paymentMethodState, "paymentMethod");
                this.f36062a = paymentMethodState;
            }

            public final PaymentMethodState a() {
                return this.f36062a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PaymentMethodChange) && Intrinsics.d(this.f36062a, ((PaymentMethodChange) obj).f36062a);
            }

            public int hashCode() {
                return this.f36062a.hashCode();
            }

            public String toString() {
                PaymentMethodState paymentMethodState = this.f36062a;
                return "PaymentMethodChange(paymentMethod=" + paymentMethodState + ")";
            }
        }

        @Metadata
        public static final class ValueChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f36063a;

            public ValueChange(String str) {
                Intrinsics.i(str, "value");
                this.f36063a = str;
            }

            public final String a() {
                return this.f36063a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ValueChange) && Intrinsics.d(this.f36063a, ((ValueChange) obj).f36063a);
            }

            public int hashCode() {
                return this.f36063a.hashCode();
            }

            public String toString() {
                String str = this.f36063a;
                return "ValueChange(value=" + str + ")";
            }
        }
    }

    @Metadata
    public interface Effect {

        @Metadata
        public static final class CouponApplied implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final CouponApplied f36064a = new CouponApplied();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof CouponApplied);
            }

            public int hashCode() {
                return -1070467150;
            }

            public String toString() {
                return "CouponApplied";
            }
        }

        @Metadata
        public static final class CouponReset implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final CouponReset f36065a = new CouponReset();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof CouponReset);
            }

            public int hashCode() {
                return -1800262204;
            }

            public String toString() {
                return "CouponReset";
            }
        }

        @Metadata
        public static final class Error implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final StringValue f36066a;

            /* renamed from: b  reason: collision with root package name */
            public final List f36067b;

            public Error(StringValue stringValue, List list) {
                Intrinsics.i(stringValue, "message");
                Intrinsics.i(list, "args");
                this.f36066a = stringValue;
                this.f36067b = list;
            }

            public final List a() {
                return this.f36067b;
            }

            public final StringValue b() {
                return this.f36066a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Error)) {
                    return false;
                }
                Error error = (Error) obj;
                return Intrinsics.d(this.f36066a, error.f36066a) && Intrinsics.d(this.f36067b, error.f36067b);
            }

            public int hashCode() {
                return (this.f36066a.hashCode() * 31) + this.f36067b.hashCode();
            }

            public String toString() {
                StringValue stringValue = this.f36066a;
                List list = this.f36067b;
                return "Error(message=" + stringValue + ", args=" + list + ")";
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Error(StringValue stringValue, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(stringValue, (i2 & 2) != 0 ? CollectionsKt.m() : list);
            }
        }

        @Metadata
        public static final class GooglePayRequest implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final Task f36068a;

            public GooglePayRequest(Task task) {
                Intrinsics.i(task, "task");
                this.f36068a = task;
            }

            public final Task a() {
                return this.f36068a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof GooglePayRequest) && Intrinsics.d(this.f36068a, ((GooglePayRequest) obj).f36068a);
            }

            public int hashCode() {
                return this.f36068a.hashCode();
            }

            public String toString() {
                Task task = this.f36068a;
                return "GooglePayRequest(task=" + task + ")";
            }
        }

        @Metadata
        public static final class InitialLoadingError implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final StringValue f36069a;

            public InitialLoadingError(StringValue stringValue) {
                Intrinsics.i(stringValue, "message");
                this.f36069a = stringValue;
            }

            public final StringValue a() {
                return this.f36069a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InitialLoadingError) && Intrinsics.d(this.f36069a, ((InitialLoadingError) obj).f36069a);
            }

            public int hashCode() {
                return this.f36069a.hashCode();
            }

            public String toString() {
                StringValue stringValue = this.f36069a;
                return "InitialLoadingError(message=" + stringValue + ")";
            }
        }

        @Metadata
        public static final class Success implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final BigDecimal f36070a;

            public Success(BigDecimal bigDecimal) {
                Intrinsics.i(bigDecimal, "amount");
                this.f36070a = bigDecimal;
            }

            public final BigDecimal a() {
                return this.f36070a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Success) && Intrinsics.d(this.f36070a, ((Success) obj).f36070a);
            }

            public int hashCode() {
                return this.f36070a.hashCode();
            }

            public String toString() {
                BigDecimal bigDecimal = this.f36070a;
                return "Success(amount=" + bigDecimal + ")";
            }
        }
    }

    @Metadata
    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new Creator();

        /* renamed from: A  reason: collision with root package name */
        public final String f36071A;

        /* renamed from: B  reason: collision with root package name */
        public final ValidationError f36072B;
        public final BigDecimal C;
        public final BigDecimal D;
        public final BigDecimal E;
        public final PersistentList F;
        public final PaymentMethodState G;
        public final PersistentList H;
        public final boolean I;
        public final boolean J;
        public final boolean K;
        public final boolean L;
        public final String M;
        public final UiResult N;
        public final Integer O;
        public final BigDecimal P;
        public final BigDecimal Q;
        public final BigDecimal R;

        /* renamed from: z  reason: collision with root package name */
        public final String f36073z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<State> {
            /* renamed from: a */
            public final State createFromParcel(Parcel parcel) {
                Parcel parcel2 = parcel;
                Intrinsics.i(parcel2, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Integer num = null;
                ValidationError valueOf = parcel.readInt() == 0 ? null : ValidationError.valueOf(parcel.readString());
                BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
                BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
                BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
                PersistentList e2 = ExtensionsKt.e(parcel.createStringArrayList());
                Class<State> cls = State.class;
                PaymentMethodState paymentMethodState = (PaymentMethodState) parcel2.readParcelable(cls.getClassLoader());
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i2 = 0; i2 != readInt; i2++) {
                    arrayList.add(PaymentMethodType.valueOf(parcel.readString()));
                }
                PersistentList e3 = ExtensionsKt.e(arrayList);
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                boolean z4 = parcel.readInt() != 0;
                boolean z5 = parcel.readInt() != 0;
                String readString3 = parcel.readString();
                UiResult uiResult = (UiResult) parcel2.readParcelable(cls.getClassLoader());
                if (parcel.readInt() != 0) {
                    num = Integer.valueOf(parcel.readInt());
                }
                return new State(readString, readString2, valueOf, bigDecimal, bigDecimal2, bigDecimal3, e2, paymentMethodState, e3, z2, z3, z4, z5, readString3, uiResult, num, (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
            }

            /* renamed from: b */
            public final State[] newArray(int i2) {
                return new State[i2];
            }
        }

        @Metadata
        public enum ValidationError {
            MIN_VALUE,
            MAX_VALUE,
            MAX_BALANCE;

            static {
                ValidationError[] d2;
                D = EnumEntriesKt.a(d2);
            }
        }

        public State(String str, String str2, ValidationError validationError, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, PersistentList persistentList, PaymentMethodState paymentMethodState, PersistentList persistentList2, boolean z2, boolean z3, boolean z4, boolean z5, String str3, UiResult uiResult, Integer num, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6) {
            BigDecimal bigDecimal7 = bigDecimal;
            BigDecimal bigDecimal8 = bigDecimal2;
            BigDecimal bigDecimal9 = bigDecimal3;
            PersistentList persistentList3 = persistentList;
            PersistentList persistentList4 = persistentList2;
            String str4 = str3;
            UiResult uiResult2 = uiResult;
            BigDecimal bigDecimal10 = bigDecimal5;
            BigDecimal bigDecimal11 = bigDecimal6;
            Intrinsics.i(str, "title");
            Intrinsics.i(str2, "value");
            Intrinsics.i(bigDecimal7, "minValue");
            Intrinsics.i(bigDecimal8, "maxValue");
            Intrinsics.i(bigDecimal9, "maxBalance");
            Intrinsics.i(persistentList3, "quickSelectValues");
            Intrinsics.i(persistentList4, "paymentMethodTypes");
            Intrinsics.i(str4, "coupon");
            Intrinsics.i(uiResult2, "couponStatus");
            Intrinsics.i(bigDecimal10, "subtotalAmount");
            Intrinsics.i(bigDecimal11, "totalAmount");
            this.f36073z = str;
            this.f36071A = str2;
            this.f36072B = validationError;
            this.C = bigDecimal7;
            this.D = bigDecimal8;
            this.E = bigDecimal9;
            this.F = persistentList3;
            this.G = paymentMethodState;
            this.H = persistentList4;
            this.I = z2;
            this.J = z3;
            this.K = z4;
            this.L = z5;
            this.M = str4;
            this.N = uiResult2;
            this.O = num;
            this.P = bigDecimal4;
            this.Q = bigDecimal10;
            this.R = bigDecimal11;
        }

        public static /* synthetic */ State b(State state, String str, String str2, ValidationError validationError, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, PersistentList persistentList, PaymentMethodState paymentMethodState, PersistentList persistentList2, boolean z2, boolean z3, boolean z4, boolean z5, String str3, UiResult uiResult, Integer num, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, int i2, Object obj) {
            State state2 = state;
            int i3 = i2;
            return state.a((i3 & 1) != 0 ? state2.f36073z : str, (i3 & 2) != 0 ? state2.f36071A : str2, (i3 & 4) != 0 ? state2.f36072B : validationError, (i3 & 8) != 0 ? state2.C : bigDecimal, (i3 & 16) != 0 ? state2.D : bigDecimal2, (i3 & 32) != 0 ? state2.E : bigDecimal3, (i3 & 64) != 0 ? state2.F : persistentList, (i3 & 128) != 0 ? state2.G : paymentMethodState, (i3 & 256) != 0 ? state2.H : persistentList2, (i3 & 512) != 0 ? state2.I : z2, (i3 & 1024) != 0 ? state2.J : z3, (i3 & 2048) != 0 ? state2.K : z4, (i3 & 4096) != 0 ? state2.L : z5, (i3 & 8192) != 0 ? state2.M : str3, (i3 & 16384) != 0 ? state2.N : uiResult, (i3 & 32768) != 0 ? state2.O : num, (i3 & 65536) != 0 ? state2.P : bigDecimal4, (i3 & 131072) != 0 ? state2.Q : bigDecimal5, (i3 & 262144) != 0 ? state2.R : bigDecimal6);
        }

        public final State a(String str, String str2, ValidationError validationError, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, PersistentList persistentList, PaymentMethodState paymentMethodState, PersistentList persistentList2, boolean z2, boolean z3, boolean z4, boolean z5, String str3, UiResult uiResult, Integer num, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6) {
            String str4 = str;
            Intrinsics.i(str4, "title");
            Intrinsics.i(str2, "value");
            Intrinsics.i(bigDecimal, "minValue");
            Intrinsics.i(bigDecimal2, "maxValue");
            Intrinsics.i(bigDecimal3, "maxBalance");
            Intrinsics.i(persistentList, "quickSelectValues");
            Intrinsics.i(persistentList2, "paymentMethodTypes");
            Intrinsics.i(str3, "coupon");
            Intrinsics.i(uiResult, "couponStatus");
            Intrinsics.i(bigDecimal5, "subtotalAmount");
            Intrinsics.i(bigDecimal6, "totalAmount");
            return new State(str4, str2, validationError, bigDecimal, bigDecimal2, bigDecimal3, persistentList, paymentMethodState, persistentList2, z2, z3, z4, z5, str3, uiResult, num, bigDecimal4, bigDecimal5, bigDecimal6);
        }

        public final boolean c() {
            return this.J;
        }

        public final boolean d() {
            return this.I;
        }

        public final int describeContents() {
            return 0;
        }

        public final String e() {
            return this.M;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return Intrinsics.d(this.f36073z, state.f36073z) && Intrinsics.d(this.f36071A, state.f36071A) && this.f36072B == state.f36072B && Intrinsics.d(this.C, state.C) && Intrinsics.d(this.D, state.D) && Intrinsics.d(this.E, state.E) && Intrinsics.d(this.F, state.F) && Intrinsics.d(this.G, state.G) && Intrinsics.d(this.H, state.H) && this.I == state.I && this.J == state.J && this.K == state.K && this.L == state.L && Intrinsics.d(this.M, state.M) && Intrinsics.d(this.N, state.N) && Intrinsics.d(this.O, state.O) && Intrinsics.d(this.P, state.P) && Intrinsics.d(this.Q, state.Q) && Intrinsics.d(this.R, state.R);
        }

        public final BigDecimal f() {
            return this.P;
        }

        public final Integer g() {
            return this.O;
        }

        public final UiResult h() {
            return this.N;
        }

        public int hashCode() {
            int hashCode = ((this.f36073z.hashCode() * 31) + this.f36071A.hashCode()) * 31;
            ValidationError validationError = this.f36072B;
            int i2 = 0;
            int hashCode2 = (((((((((hashCode + (validationError == null ? 0 : validationError.hashCode())) * 31) + this.C.hashCode()) * 31) + this.D.hashCode()) * 31) + this.E.hashCode()) * 31) + this.F.hashCode()) * 31;
            PaymentMethodState paymentMethodState = this.G;
            int hashCode3 = (((((((((((((((hashCode2 + (paymentMethodState == null ? 0 : paymentMethodState.hashCode())) * 31) + this.H.hashCode()) * 31) + Boolean.hashCode(this.I)) * 31) + Boolean.hashCode(this.J)) * 31) + Boolean.hashCode(this.K)) * 31) + Boolean.hashCode(this.L)) * 31) + this.M.hashCode()) * 31) + this.N.hashCode()) * 31;
            Integer num = this.O;
            int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            BigDecimal bigDecimal = this.P;
            if (bigDecimal != null) {
                i2 = bigDecimal.hashCode();
            }
            return ((((hashCode4 + i2) * 31) + this.Q.hashCode()) * 31) + this.R.hashCode();
        }

        public final ValidationError i() {
            return this.f36072B;
        }

        public final BigDecimal j() {
            return this.E;
        }

        public final BigDecimal k() {
            return this.D;
        }

        public final BigDecimal l() {
            return this.C;
        }

        public final PaymentMethodState n() {
            return this.G;
        }

        public final PersistentList o() {
            return this.H;
        }

        public final PersistentList p() {
            return this.F;
        }

        public final boolean q() {
            return this.K;
        }

        public final BigDecimal r() {
            return this.Q;
        }

        public final String s() {
            return this.f36073z;
        }

        public final BigDecimal t() {
            return this.R;
        }

        public String toString() {
            String str = this.f36073z;
            String str2 = this.f36071A;
            ValidationError validationError = this.f36072B;
            BigDecimal bigDecimal = this.C;
            BigDecimal bigDecimal2 = this.D;
            BigDecimal bigDecimal3 = this.E;
            PersistentList persistentList = this.F;
            PaymentMethodState paymentMethodState = this.G;
            PersistentList persistentList2 = this.H;
            boolean z2 = this.I;
            boolean z3 = this.J;
            boolean z4 = this.K;
            boolean z5 = this.L;
            String str3 = this.M;
            UiResult uiResult = this.N;
            Integer num = this.O;
            BigDecimal bigDecimal4 = this.P;
            BigDecimal bigDecimal5 = this.Q;
            BigDecimal bigDecimal6 = this.R;
            return "State(title=" + str + ", value=" + str2 + ", error=" + validationError + ", minValue=" + bigDecimal + ", maxValue=" + bigDecimal2 + ", maxBalance=" + bigDecimal3 + ", quickSelectValues=" + persistentList + ", paymentMethod=" + paymentMethodState + ", paymentMethodTypes=" + persistentList2 + ", cashPaymentGuideShown=" + z2 + ", blockingLoading=" + z3 + ", showLoadingDialog=" + z4 + ", isCouponsEnabled=" + z5 + ", coupon=" + str3 + ", couponStatus=" + uiResult + ", couponPercentage=" + num + ", couponAmount=" + bigDecimal4 + ", subtotalAmount=" + bigDecimal5 + ", totalAmount=" + bigDecimal6 + ")";
        }

        public final String u() {
            return this.f36071A;
        }

        public final boolean v() {
            return this.G instanceof PaymentMethodState.Cash;
        }

        public final boolean w() {
            return this.L;
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeString(this.f36073z);
            parcel.writeString(this.f36071A);
            ValidationError validationError = this.f36072B;
            if (validationError == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(validationError.name());
            }
            parcel.writeSerializable(this.C);
            parcel.writeSerializable(this.D);
            parcel.writeSerializable(this.E);
            parcel.writeStringList(this.F);
            parcel.writeParcelable(this.G, i2);
            PersistentList<PaymentMethodType> persistentList = this.H;
            parcel.writeInt(persistentList.size());
            for (PaymentMethodType name : persistentList) {
                parcel.writeString(name.name());
            }
            parcel.writeInt(this.I ? 1 : 0);
            parcel.writeInt(this.J ? 1 : 0);
            parcel.writeInt(this.K ? 1 : 0);
            parcel.writeInt(this.L ? 1 : 0);
            parcel.writeString(this.M);
            parcel.writeParcelable(this.N, i2);
            Integer num = this.O;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            }
            parcel.writeSerializable(this.P);
            parcel.writeSerializable(this.Q);
            parcel.writeSerializable(this.R);
        }

        public final boolean x() {
            return this.G != null && !this.N.b();
        }

        public final boolean y() {
            return this.G != null;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ State(java.lang.String r24, java.lang.String r25, com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue.State.ValidationError r26, java.math.BigDecimal r27, java.math.BigDecimal r28, java.math.BigDecimal r29, kotlinx.collections.immutable.PersistentList r30, com.hansecom.abt.presentation.model.PaymentMethodState r31, kotlinx.collections.immutable.PersistentList r32, boolean r33, boolean r34, boolean r35, boolean r36, java.lang.String r37, com.hansecom.abt.ui.UiResult r38, java.lang.Integer r39, java.math.BigDecimal r40, java.math.BigDecimal r41, java.math.BigDecimal r42, int r43, kotlin.jvm.internal.DefaultConstructorMarker r44) {
            /*
                r23 = this;
                r0 = r43
                r1 = r0 & 1
                java.lang.String r2 = ""
                if (r1 == 0) goto L_0x000a
                r4 = r2
                goto L_0x000c
            L_0x000a:
                r4 = r24
            L_0x000c:
                r1 = r0 & 2
                if (r1 == 0) goto L_0x0012
                r5 = r2
                goto L_0x0014
            L_0x0012:
                r5 = r25
            L_0x0014:
                r1 = r0 & 4
                r3 = 0
                if (r1 == 0) goto L_0x001b
                r6 = r3
                goto L_0x001d
            L_0x001b:
                r6 = r26
            L_0x001d:
                r1 = r0 & 64
                if (r1 == 0) goto L_0x0027
                kotlinx.collections.immutable.PersistentList r1 = kotlinx.collections.immutable.ExtensionsKt.a()
                r10 = r1
                goto L_0x0029
            L_0x0027:
                r10 = r30
            L_0x0029:
                r1 = r0 & 128(0x80, float:1.794E-43)
                if (r1 == 0) goto L_0x002f
                r11 = r3
                goto L_0x0031
            L_0x002f:
                r11 = r31
            L_0x0031:
                r1 = r0 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto L_0x003b
                kotlinx.collections.immutable.PersistentList r1 = kotlinx.collections.immutable.ExtensionsKt.a()
                r12 = r1
                goto L_0x003d
            L_0x003b:
                r12 = r32
            L_0x003d:
                r1 = r0 & 512(0x200, float:7.175E-43)
                r7 = 0
                if (r1 == 0) goto L_0x0044
                r13 = r7
                goto L_0x0046
            L_0x0044:
                r13 = r33
            L_0x0046:
                r1 = r0 & 1024(0x400, float:1.435E-42)
                if (r1 == 0) goto L_0x004c
                r14 = r7
                goto L_0x004e
            L_0x004c:
                r14 = r34
            L_0x004e:
                r1 = r0 & 2048(0x800, float:2.87E-42)
                if (r1 == 0) goto L_0x0054
                r15 = r7
                goto L_0x0056
            L_0x0054:
                r15 = r35
            L_0x0056:
                r1 = r0 & 4096(0x1000, float:5.74E-42)
                if (r1 == 0) goto L_0x005e
                r1 = 1
                r16 = r1
                goto L_0x0060
            L_0x005e:
                r16 = r36
            L_0x0060:
                r1 = r0 & 8192(0x2000, float:1.14794E-41)
                if (r1 == 0) goto L_0x0067
                r17 = r2
                goto L_0x0069
            L_0x0067:
                r17 = r37
            L_0x0069:
                r1 = r0 & 16384(0x4000, float:2.2959E-41)
                if (r1 == 0) goto L_0x0072
                com.hansecom.abt.ui.UiResult$Init r1 = com.hansecom.abt.ui.UiResult.Init.f37861z
                r18 = r1
                goto L_0x0074
            L_0x0072:
                r18 = r38
            L_0x0074:
                r1 = 32768(0x8000, float:4.5918E-41)
                r1 = r1 & r0
                if (r1 == 0) goto L_0x007d
                r19 = r3
                goto L_0x007f
            L_0x007d:
                r19 = r39
            L_0x007f:
                r1 = 65536(0x10000, float:9.18355E-41)
                r1 = r1 & r0
                if (r1 == 0) goto L_0x0087
                r20 = r3
                goto L_0x0089
            L_0x0087:
                r20 = r40
            L_0x0089:
                r1 = 131072(0x20000, float:1.83671E-40)
                r1 = r1 & r0
                if (r1 == 0) goto L_0x0093
                java.math.BigDecimal r1 = java.math.BigDecimal.ZERO
                r21 = r1
                goto L_0x0095
            L_0x0093:
                r21 = r41
            L_0x0095:
                r1 = 262144(0x40000, float:3.67342E-40)
                r0 = r0 & r1
                if (r0 == 0) goto L_0x009f
                java.math.BigDecimal r0 = java.math.BigDecimal.ZERO
                r22 = r0
                goto L_0x00a1
            L_0x009f:
                r22 = r42
            L_0x00a1:
                r3 = r23
                r7 = r27
                r8 = r28
                r9 = r29
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue.State.<init>(java.lang.String, java.lang.String, com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue$State$ValidationError, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, kotlinx.collections.immutable.PersistentList, com.hansecom.abt.presentation.model.PaymentMethodState, kotlinx.collections.immutable.PersistentList, boolean, boolean, boolean, boolean, java.lang.String, com.hansecom.abt.ui.UiResult, java.lang.Integer, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
