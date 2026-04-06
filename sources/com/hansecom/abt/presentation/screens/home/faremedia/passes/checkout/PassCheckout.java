package com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.contract.ApiTaskResult;
import com.hansecom.abt.data.localDomain.PaymentMethodType;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import com.hansecom.abt.ui.UiResult;
import com.hansecom.abt.ui.components.passCard.PassOfferCardState;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public interface PassCheckout {

    @Metadata
    public interface Action {

        @Metadata
        public static final class Confirm implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final Confirm f37086a = new Confirm();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Confirm);
            }

            public int hashCode() {
                return 1585793496;
            }

            public String toString() {
                return "Confirm";
            }
        }

        @Metadata
        public static final class CouponApply implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final CouponApply f37087a = new CouponApply();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof CouponApply);
            }

            public int hashCode() {
                return -173934080;
            }

            public String toString() {
                return "CouponApply";
            }
        }

        @Metadata
        public static final class CouponChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f37088a;

            public CouponChange(String str) {
                Intrinsics.i(str, "value");
                this.f37088a = str;
            }

            public final String a() {
                return this.f37088a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CouponChange) && Intrinsics.d(this.f37088a, ((CouponChange) obj).f37088a);
            }

            public int hashCode() {
                return this.f37088a.hashCode();
            }

            public String toString() {
                String str = this.f37088a;
                return "CouponChange(value=" + str + ")";
            }
        }

        @Metadata
        public static final class CouponReset implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final CouponReset f37089a = new CouponReset();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof CouponReset);
            }

            public int hashCode() {
                return -158559263;
            }

            public String toString() {
                return "CouponReset";
            }
        }

        @Metadata
        public static final class GooglePayResult implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final ApiTaskResult f37090a;

            public GooglePayResult(ApiTaskResult apiTaskResult) {
                Intrinsics.i(apiTaskResult, "result");
                this.f37090a = apiTaskResult;
            }

            public final ApiTaskResult a() {
                return this.f37090a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof GooglePayResult) && Intrinsics.d(this.f37090a, ((GooglePayResult) obj).f37090a);
            }

            public int hashCode() {
                return this.f37090a.hashCode();
            }

            public String toString() {
                ApiTaskResult apiTaskResult = this.f37090a;
                return "GooglePayResult(result=" + apiTaskResult + ")";
            }
        }

        @Metadata
        public static final class PaymentMethodChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final PaymentMethodState f37091a;

            public PaymentMethodChange(PaymentMethodState paymentMethodState) {
                Intrinsics.i(paymentMethodState, "paymentMethod");
                this.f37091a = paymentMethodState;
            }

            public final PaymentMethodState a() {
                return this.f37091a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PaymentMethodChange) && Intrinsics.d(this.f37091a, ((PaymentMethodChange) obj).f37091a);
            }

            public int hashCode() {
                return this.f37091a.hashCode();
            }

            public String toString() {
                PaymentMethodState paymentMethodState = this.f37091a;
                return "PaymentMethodChange(paymentMethod=" + paymentMethodState + ")";
            }
        }
    }

    @Metadata
    public interface Effect {

        @Metadata
        public static final class CouponApplied implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final CouponApplied f37092a = new CouponApplied();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof CouponApplied);
            }

            public int hashCode() {
                return -1572992342;
            }

            public String toString() {
                return "CouponApplied";
            }
        }

        @Metadata
        public static final class CouponReset implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final CouponReset f37093a = new CouponReset();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof CouponReset);
            }

            public int hashCode() {
                return 1041669820;
            }

            public String toString() {
                return "CouponReset";
            }
        }

        @Metadata
        public static final class Error implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final StringValue f37094a;

            /* renamed from: b  reason: collision with root package name */
            public final List f37095b;

            public Error(StringValue stringValue, List list) {
                Intrinsics.i(stringValue, "message");
                Intrinsics.i(list, "args");
                this.f37094a = stringValue;
                this.f37095b = list;
            }

            public final List a() {
                return this.f37095b;
            }

            public final StringValue b() {
                return this.f37094a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Error)) {
                    return false;
                }
                Error error = (Error) obj;
                return Intrinsics.d(this.f37094a, error.f37094a) && Intrinsics.d(this.f37095b, error.f37095b);
            }

            public int hashCode() {
                return (this.f37094a.hashCode() * 31) + this.f37095b.hashCode();
            }

            public String toString() {
                StringValue stringValue = this.f37094a;
                List list = this.f37095b;
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
            public final Task f37096a;

            public GooglePayRequest(Task task) {
                Intrinsics.i(task, "task");
                this.f37096a = task;
            }

            public final Task a() {
                return this.f37096a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof GooglePayRequest) && Intrinsics.d(this.f37096a, ((GooglePayRequest) obj).f37096a);
            }

            public int hashCode() {
                return this.f37096a.hashCode();
            }

            public String toString() {
                Task task = this.f37096a;
                return "GooglePayRequest(task=" + task + ")";
            }
        }

        @Metadata
        public static final class Success implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final String f37097a;

            public Success(String str) {
                Intrinsics.i(str, "passName");
                this.f37097a = str;
            }

            public final String a() {
                return this.f37097a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Success) && Intrinsics.d(this.f37097a, ((Success) obj).f37097a);
            }

            public int hashCode() {
                return this.f37097a.hashCode();
            }

            public String toString() {
                String str = this.f37097a;
                return "Success(passName=" + str + ")";
            }
        }
    }

    @Metadata
    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new Creator();

        /* renamed from: A  reason: collision with root package name */
        public final String f37098A;

        /* renamed from: B  reason: collision with root package name */
        public final PassOfferCardState f37099B;
        public final BigDecimal C;
        public final BigDecimal D;
        public final boolean E;
        public final boolean F;
        public final List G;
        public final PaymentMethodState H;
        public final StringValue I;
        public final boolean J;
        public final String K;
        public final UiResult L;
        public final Integer M;
        public final BigDecimal N;

        /* renamed from: z  reason: collision with root package name */
        public final String f37100z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<State> {
            /* renamed from: a */
            public final State createFromParcel(Parcel parcel) {
                Parcel parcel2 = parcel;
                Intrinsics.i(parcel2, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Integer num = null;
                PassOfferCardState createFromParcel = parcel.readInt() == 0 ? null : PassOfferCardState.CREATOR.createFromParcel(parcel2);
                BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
                BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i2 = 0; i2 != readInt; i2++) {
                    arrayList.add(PaymentMethodType.valueOf(parcel.readString()));
                }
                Class<State> cls = State.class;
                PaymentMethodState paymentMethodState = (PaymentMethodState) parcel2.readParcelable(cls.getClassLoader());
                StringValue stringValue = (StringValue) parcel2.readParcelable(cls.getClassLoader());
                boolean z4 = parcel.readInt() != 0;
                String readString3 = parcel.readString();
                UiResult uiResult = (UiResult) parcel2.readParcelable(cls.getClassLoader());
                if (parcel.readInt() != 0) {
                    num = Integer.valueOf(parcel.readInt());
                }
                return new State(readString, readString2, createFromParcel, bigDecimal, bigDecimal2, z2, z3, arrayList, paymentMethodState, stringValue, z4, readString3, uiResult, num, (BigDecimal) parcel.readSerializable());
            }

            /* renamed from: b */
            public final State[] newArray(int i2) {
                return new State[i2];
            }
        }

        public State(String str, String str2, PassOfferCardState passOfferCardState, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z2, boolean z3, List list, PaymentMethodState paymentMethodState, StringValue stringValue, boolean z4, String str3, UiResult uiResult, Integer num, BigDecimal bigDecimal3) {
            String str4 = str3;
            UiResult uiResult2 = uiResult;
            Intrinsics.i(list, "paymentMethodTypes");
            Intrinsics.i(str4, "coupon");
            Intrinsics.i(uiResult2, "couponStatus");
            this.f37100z = str;
            this.f37098A = str2;
            this.f37099B = passOfferCardState;
            this.C = bigDecimal;
            this.D = bigDecimal2;
            this.E = z2;
            this.F = z3;
            this.G = list;
            this.H = paymentMethodState;
            this.I = stringValue;
            this.J = z4;
            this.K = str4;
            this.L = uiResult2;
            this.M = num;
            this.N = bigDecimal3;
        }

        public static /* synthetic */ State b(State state, String str, String str2, PassOfferCardState passOfferCardState, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z2, boolean z3, List list, PaymentMethodState paymentMethodState, StringValue stringValue, boolean z4, String str3, UiResult uiResult, Integer num, BigDecimal bigDecimal3, int i2, Object obj) {
            State state2 = state;
            int i3 = i2;
            return state.a((i3 & 1) != 0 ? state2.f37100z : str, (i3 & 2) != 0 ? state2.f37098A : str2, (i3 & 4) != 0 ? state2.f37099B : passOfferCardState, (i3 & 8) != 0 ? state2.C : bigDecimal, (i3 & 16) != 0 ? state2.D : bigDecimal2, (i3 & 32) != 0 ? state2.E : z2, (i3 & 64) != 0 ? state2.F : z3, (i3 & 128) != 0 ? state2.G : list, (i3 & 256) != 0 ? state2.H : paymentMethodState, (i3 & 512) != 0 ? state2.I : stringValue, (i3 & 1024) != 0 ? state2.J : z4, (i3 & 2048) != 0 ? state2.K : str3, (i3 & 4096) != 0 ? state2.L : uiResult, (i3 & 8192) != 0 ? state2.M : num, (i3 & 16384) != 0 ? state2.N : bigDecimal3);
        }

        public final State a(String str, String str2, PassOfferCardState passOfferCardState, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z2, boolean z3, List list, PaymentMethodState paymentMethodState, StringValue stringValue, boolean z4, String str3, UiResult uiResult, Integer num, BigDecimal bigDecimal3) {
            List list2 = list;
            Intrinsics.i(list2, "paymentMethodTypes");
            String str4 = str3;
            Intrinsics.i(str4, "coupon");
            UiResult uiResult2 = uiResult;
            Intrinsics.i(uiResult2, "couponStatus");
            return new State(str, str2, passOfferCardState, bigDecimal, bigDecimal2, z2, z3, list2, paymentMethodState, stringValue, z4, str4, uiResult2, num, bigDecimal3);
        }

        public final boolean c() {
            return this.E;
        }

        public final String d() {
            return this.K;
        }

        public final int describeContents() {
            return 0;
        }

        public final BigDecimal e() {
            return this.N;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return Intrinsics.d(this.f37100z, state.f37100z) && Intrinsics.d(this.f37098A, state.f37098A) && Intrinsics.d(this.f37099B, state.f37099B) && Intrinsics.d(this.C, state.C) && Intrinsics.d(this.D, state.D) && this.E == state.E && this.F == state.F && Intrinsics.d(this.G, state.G) && Intrinsics.d(this.H, state.H) && Intrinsics.d(this.I, state.I) && this.J == state.J && Intrinsics.d(this.K, state.K) && Intrinsics.d(this.L, state.L) && Intrinsics.d(this.M, state.M) && Intrinsics.d(this.N, state.N);
        }

        public final Integer f() {
            return this.M;
        }

        public final UiResult g() {
            return this.L;
        }

        public final String h() {
            return this.f37098A;
        }

        public int hashCode() {
            String str = this.f37100z;
            int i2 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f37098A;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            PassOfferCardState passOfferCardState = this.f37099B;
            int hashCode3 = (hashCode2 + (passOfferCardState == null ? 0 : passOfferCardState.hashCode())) * 31;
            BigDecimal bigDecimal = this.C;
            int hashCode4 = (hashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            BigDecimal bigDecimal2 = this.D;
            int hashCode5 = (((((((hashCode4 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31) + Boolean.hashCode(this.E)) * 31) + Boolean.hashCode(this.F)) * 31) + this.G.hashCode()) * 31;
            PaymentMethodState paymentMethodState = this.H;
            int hashCode6 = (hashCode5 + (paymentMethodState == null ? 0 : paymentMethodState.hashCode())) * 31;
            StringValue stringValue = this.I;
            int hashCode7 = (((((((hashCode6 + (stringValue == null ? 0 : stringValue.hashCode())) * 31) + Boolean.hashCode(this.J)) * 31) + this.K.hashCode()) * 31) + this.L.hashCode()) * 31;
            Integer num = this.M;
            int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
            BigDecimal bigDecimal3 = this.N;
            if (bigDecimal3 != null) {
                i2 = bigDecimal3.hashCode();
            }
            return hashCode8 + i2;
        }

        public final String i() {
            return this.f37100z;
        }

        public final PassOfferCardState j() {
            return this.f37099B;
        }

        public final PaymentMethodState k() {
            return this.H;
        }

        public final StringValue l() {
            return this.I;
        }

        public final List n() {
            return this.G;
        }

        public final boolean o() {
            return this.F;
        }

        public final BigDecimal p() {
            return this.C;
        }

        public final BigDecimal q() {
            return this.D;
        }

        public final boolean r() {
            return this.J;
        }

        public final boolean s() {
            return Intrinsics.d(this.C, BigDecimal.ZERO);
        }

        public final boolean t() {
            return this.H != null && !this.L.b();
        }

        public String toString() {
            String str = this.f37100z;
            String str2 = this.f37098A;
            PassOfferCardState passOfferCardState = this.f37099B;
            BigDecimal bigDecimal = this.C;
            BigDecimal bigDecimal2 = this.D;
            boolean z2 = this.E;
            boolean z3 = this.F;
            List list = this.G;
            PaymentMethodState paymentMethodState = this.H;
            StringValue stringValue = this.I;
            boolean z4 = this.J;
            String str3 = this.K;
            UiResult uiResult = this.L;
            Integer num = this.M;
            BigDecimal bigDecimal3 = this.N;
            return "State(fareMediaName=" + str + ", fareMediaId=" + str2 + ", pass=" + passOfferCardState + ", subtotalAmount=" + bigDecimal + ", totalAmount=" + bigDecimal2 + ", blockingLoading=" + z2 + ", showLoadingDialog=" + z3 + ", paymentMethodTypes=" + list + ", paymentMethod=" + paymentMethodState + ", paymentMethodError=" + stringValue + ", isCouponsEnabled=" + z4 + ", coupon=" + str3 + ", couponStatus=" + uiResult + ", couponPercentage=" + num + ", couponAmount=" + bigDecimal3 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeString(this.f37100z);
            parcel.writeString(this.f37098A);
            PassOfferCardState passOfferCardState = this.f37099B;
            if (passOfferCardState == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                passOfferCardState.writeToParcel(parcel, i2);
            }
            parcel.writeSerializable(this.C);
            parcel.writeSerializable(this.D);
            parcel.writeInt(this.E ? 1 : 0);
            parcel.writeInt(this.F ? 1 : 0);
            List<PaymentMethodType> list = this.G;
            parcel.writeInt(list.size());
            for (PaymentMethodType name : list) {
                parcel.writeString(name.name());
            }
            parcel.writeParcelable(this.H, i2);
            parcel.writeParcelable(this.I, i2);
            parcel.writeInt(this.J ? 1 : 0);
            parcel.writeString(this.K);
            parcel.writeParcelable(this.L, i2);
            Integer num = this.M;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            }
            parcel.writeSerializable(this.N);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ State(java.lang.String r17, java.lang.String r18, com.hansecom.abt.ui.components.passCard.PassOfferCardState r19, java.math.BigDecimal r20, java.math.BigDecimal r21, boolean r22, boolean r23, java.util.List r24, com.hansecom.abt.presentation.model.PaymentMethodState r25, com.hansecom.abt.util.resourcesResolvers.StringValue r26, boolean r27, java.lang.String r28, com.hansecom.abt.ui.UiResult r29, java.lang.Integer r30, java.math.BigDecimal r31, int r32, kotlin.jvm.internal.DefaultConstructorMarker r33) {
            /*
                r16 = this;
                r0 = r32
                r1 = r0 & 1
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r1 = r2
                goto L_0x000b
            L_0x0009:
                r1 = r17
            L_0x000b:
                r3 = r0 & 2
                if (r3 == 0) goto L_0x0011
                r3 = r2
                goto L_0x0013
            L_0x0011:
                r3 = r18
            L_0x0013:
                r4 = r0 & 4
                if (r4 == 0) goto L_0x0019
                r4 = r2
                goto L_0x001b
            L_0x0019:
                r4 = r19
            L_0x001b:
                r5 = r0 & 8
                if (r5 == 0) goto L_0x0021
                r5 = r2
                goto L_0x0023
            L_0x0021:
                r5 = r20
            L_0x0023:
                r6 = r0 & 16
                if (r6 == 0) goto L_0x0029
                r6 = r2
                goto L_0x002b
            L_0x0029:
                r6 = r21
            L_0x002b:
                r7 = r0 & 32
                r8 = 0
                if (r7 == 0) goto L_0x0032
                r7 = r8
                goto L_0x0034
            L_0x0032:
                r7 = r22
            L_0x0034:
                r9 = r0 & 64
                if (r9 == 0) goto L_0x0039
                goto L_0x003b
            L_0x0039:
                r8 = r23
            L_0x003b:
                r9 = r0 & 128(0x80, float:1.794E-43)
                if (r9 == 0) goto L_0x0044
                java.util.List r9 = kotlin.collections.CollectionsKt.m()
                goto L_0x0046
            L_0x0044:
                r9 = r24
            L_0x0046:
                r10 = r0 & 256(0x100, float:3.59E-43)
                if (r10 == 0) goto L_0x004c
                r10 = r2
                goto L_0x004e
            L_0x004c:
                r10 = r25
            L_0x004e:
                r11 = r0 & 512(0x200, float:7.175E-43)
                if (r11 == 0) goto L_0x0054
                r11 = r2
                goto L_0x0056
            L_0x0054:
                r11 = r26
            L_0x0056:
                r12 = r0 & 1024(0x400, float:1.435E-42)
                if (r12 == 0) goto L_0x005c
                r12 = 1
                goto L_0x005e
            L_0x005c:
                r12 = r27
            L_0x005e:
                r13 = r0 & 2048(0x800, float:2.87E-42)
                if (r13 == 0) goto L_0x0065
                java.lang.String r13 = ""
                goto L_0x0067
            L_0x0065:
                r13 = r28
            L_0x0067:
                r14 = r0 & 4096(0x1000, float:5.74E-42)
                if (r14 == 0) goto L_0x006e
                com.hansecom.abt.ui.UiResult$Init r14 = com.hansecom.abt.ui.UiResult.Init.f37861z
                goto L_0x0070
            L_0x006e:
                r14 = r29
            L_0x0070:
                r15 = r0 & 8192(0x2000, float:1.14794E-41)
                if (r15 == 0) goto L_0x0076
                r15 = r2
                goto L_0x0078
            L_0x0076:
                r15 = r30
            L_0x0078:
                r0 = r0 & 16384(0x4000, float:2.2959E-41)
                if (r0 == 0) goto L_0x007d
                goto L_0x007f
            L_0x007d:
                r2 = r31
            L_0x007f:
                r17 = r16
                r18 = r1
                r19 = r3
                r20 = r4
                r21 = r5
                r22 = r6
                r23 = r7
                r24 = r8
                r25 = r9
                r26 = r10
                r27 = r11
                r28 = r12
                r29 = r13
                r30 = r14
                r31 = r15
                r32 = r2
                r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout.State.<init>(java.lang.String, java.lang.String, com.hansecom.abt.ui.components.passCard.PassOfferCardState, java.math.BigDecimal, java.math.BigDecimal, boolean, boolean, java.util.List, com.hansecom.abt.presentation.model.PaymentMethodState, com.hansecom.abt.util.resourcesResolvers.StringValue, boolean, java.lang.String, com.hansecom.abt.ui.UiResult, java.lang.Integer, java.math.BigDecimal, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
