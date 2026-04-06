package com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard;

import android.os.Parcel;
import android.os.Parcelable;
import com.hansecom.abt.data.localDomain.PaymentMethodType;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.PersistentList;

@Metadata
public interface FareMediaPurchaseCard {

    @Metadata
    public interface Action {

        @Metadata
        public static final class Confirm implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final Confirm f37170a = new Confirm();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Confirm);
            }

            public int hashCode() {
                return -1157512034;
            }

            public String toString() {
                return "Confirm";
            }
        }

        @Metadata
        public static final class NickNameChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f37171a;

            public NickNameChange(String str) {
                Intrinsics.i(str, "value");
                this.f37171a = str;
            }

            public final String a() {
                return this.f37171a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NickNameChange) && Intrinsics.d(this.f37171a, ((NickNameChange) obj).f37171a);
            }

            public int hashCode() {
                return this.f37171a.hashCode();
            }

            public String toString() {
                String str = this.f37171a;
                return "NickNameChange(value=" + str + ")";
            }
        }

        @Metadata
        public static final class OpenRiderTypeSelector implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final boolean f37172a;

            public OpenRiderTypeSelector(boolean z2) {
                this.f37172a = z2;
            }

            public final boolean a() {
                return this.f37172a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenRiderTypeSelector) && this.f37172a == ((OpenRiderTypeSelector) obj).f37172a;
            }

            public int hashCode() {
                return Boolean.hashCode(this.f37172a);
            }

            public String toString() {
                boolean z2 = this.f37172a;
                return "OpenRiderTypeSelector(open=" + z2 + ")";
            }
        }

        @Metadata
        public static final class PaymentMethodChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final PaymentMethodState f37173a;

            public PaymentMethodChange(PaymentMethodState paymentMethodState) {
                Intrinsics.i(paymentMethodState, "paymentMethod");
                this.f37173a = paymentMethodState;
            }

            public final PaymentMethodState a() {
                return this.f37173a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PaymentMethodChange) && Intrinsics.d(this.f37173a, ((PaymentMethodChange) obj).f37173a);
            }

            public int hashCode() {
                return this.f37173a.hashCode();
            }

            public String toString() {
                PaymentMethodState paymentMethodState = this.f37173a;
                return "PaymentMethodChange(paymentMethod=" + paymentMethodState + ")";
            }
        }

        @Metadata
        public static final class RiderTypeChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final RiderType f37174a;

            public RiderTypeChange(RiderType riderType) {
                Intrinsics.i(riderType, "riderType");
                this.f37174a = riderType;
            }

            public final RiderType a() {
                return this.f37174a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RiderTypeChange) && Intrinsics.d(this.f37174a, ((RiderTypeChange) obj).f37174a);
            }

            public int hashCode() {
                return this.f37174a.hashCode();
            }

            public String toString() {
                RiderType riderType = this.f37174a;
                return "RiderTypeChange(riderType=" + riderType + ")";
            }
        }

        @Metadata
        public static final class TopUpAmountChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final BigDecimal f37175a;

            public TopUpAmountChange(BigDecimal bigDecimal) {
                Intrinsics.i(bigDecimal, "value");
                this.f37175a = bigDecimal;
            }

            public final BigDecimal a() {
                return this.f37175a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TopUpAmountChange) && Intrinsics.d(this.f37175a, ((TopUpAmountChange) obj).f37175a);
            }

            public int hashCode() {
                return this.f37175a.hashCode();
            }

            public String toString() {
                BigDecimal bigDecimal = this.f37175a;
                return "TopUpAmountChange(value=" + bigDecimal + ")";
            }
        }
    }

    @Metadata
    public interface Effect {

        @Metadata
        public static final class Error implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final StringValue f37176a;

            public Error(StringValue stringValue) {
                Intrinsics.i(stringValue, "message");
                this.f37176a = stringValue;
            }

            public final StringValue a() {
                return this.f37176a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.d(this.f37176a, ((Error) obj).f37176a);
            }

            public int hashCode() {
                return this.f37176a.hashCode();
            }

            public String toString() {
                StringValue stringValue = this.f37176a;
                return "Error(message=" + stringValue + ")";
            }
        }

        @Metadata
        public static final class Success implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final Success f37177a = new Success();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Success);
            }

            public int hashCode() {
                return -1394225604;
            }

            public String toString() {
                return "Success";
            }
        }
    }

    @Metadata
    public static final class RiderType implements Parcelable {
        public static final Parcelable.Creator<RiderType> CREATOR = new Creator();

        /* renamed from: A  reason: collision with root package name */
        public final String f37178A;

        /* renamed from: B  reason: collision with root package name */
        public final StringValue f37179B;
        public final Integer C;
        public final BigDecimal D;

        /* renamed from: z  reason: collision with root package name */
        public final int f37180z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<RiderType> {
            /* renamed from: a */
            public final RiderType createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                return new RiderType(parcel.readInt(), parcel.readString(), (StringValue) parcel.readParcelable(RiderType.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (BigDecimal) parcel.readSerializable());
            }

            /* renamed from: b */
            public final RiderType[] newArray(int i2) {
                return new RiderType[i2];
            }
        }

        public RiderType(int i2, String str, StringValue stringValue, Integer num, BigDecimal bigDecimal) {
            Intrinsics.i(str, "name");
            Intrinsics.i(bigDecimal, "price");
            this.f37180z = i2;
            this.f37178A = str;
            this.f37179B = stringValue;
            this.C = num;
            this.D = bigDecimal;
        }

        public final int a() {
            return this.f37180z;
        }

        public final String b() {
            return this.f37178A;
        }

        public final BigDecimal c() {
            return this.D;
        }

        public final StringValue d() {
            return this.f37179B;
        }

        public final int describeContents() {
            return 0;
        }

        public final Integer e() {
            return this.C;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RiderType)) {
                return false;
            }
            RiderType riderType = (RiderType) obj;
            return this.f37180z == riderType.f37180z && Intrinsics.d(this.f37178A, riderType.f37178A) && Intrinsics.d(this.f37179B, riderType.f37179B) && Intrinsics.d(this.C, riderType.C) && Intrinsics.d(this.D, riderType.D);
        }

        public int hashCode() {
            int hashCode = ((Integer.hashCode(this.f37180z) * 31) + this.f37178A.hashCode()) * 31;
            StringValue stringValue = this.f37179B;
            int i2 = 0;
            int hashCode2 = (hashCode + (stringValue == null ? 0 : stringValue.hashCode())) * 31;
            Integer num = this.C;
            if (num != null) {
                i2 = num.hashCode();
            }
            return ((hashCode2 + i2) * 31) + this.D.hashCode();
        }

        public String toString() {
            int i2 = this.f37180z;
            String str = this.f37178A;
            StringValue stringValue = this.f37179B;
            Integer num = this.C;
            BigDecimal bigDecimal = this.D;
            return "RiderType(id=" + i2 + ", name=" + str + ", terms=" + stringValue + ", virtualFareMediaId=" + num + ", price=" + bigDecimal + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            int intValue;
            Intrinsics.i(parcel, "dest");
            parcel.writeInt(this.f37180z);
            parcel.writeString(this.f37178A);
            parcel.writeParcelable(this.f37179B, i2);
            Integer num = this.C;
            if (num == null) {
                intValue = 0;
            } else {
                parcel.writeInt(1);
                intValue = num.intValue();
            }
            parcel.writeInt(intValue);
            parcel.writeSerializable(this.D);
        }
    }

    @Metadata
    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new Creator();

        /* renamed from: A  reason: collision with root package name */
        public final StringValue f37181A;

        /* renamed from: B  reason: collision with root package name */
        public final boolean f37182B;
        public final boolean C;
        public final boolean D;
        public final PersistentList E;
        public final BigDecimal F;
        public final PersistentList G;
        public final RiderType H;
        public final PaymentMethodState I;
        public final PersistentList J;
        public final boolean K;

        /* renamed from: z  reason: collision with root package name */
        public final String f37183z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<State> {
            /* renamed from: a */
            public final State createFromParcel(Parcel parcel) {
                Parcel parcel2 = parcel;
                Intrinsics.i(parcel2, "parcel");
                String readString = parcel.readString();
                Class<State> cls = State.class;
                StringValue stringValue = (StringValue) parcel2.readParcelable(cls.getClassLoader());
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                boolean z4 = parcel.readInt() != 0;
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i2 = 0; i2 != readInt; i2++) {
                    arrayList.add(parcel.readSerializable());
                }
                PersistentList e2 = ExtensionsKt.e(arrayList);
                BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                for (int i3 = 0; i3 != readInt2; i3++) {
                    arrayList2.add(RiderType.CREATOR.createFromParcel(parcel2));
                }
                PersistentList e3 = ExtensionsKt.e(arrayList2);
                RiderType createFromParcel = parcel.readInt() == 0 ? null : RiderType.CREATOR.createFromParcel(parcel2);
                PaymentMethodState paymentMethodState = (PaymentMethodState) parcel2.readParcelable(cls.getClassLoader());
                int readInt3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt3);
                for (int i4 = 0; i4 != readInt3; i4++) {
                    arrayList3.add(PaymentMethodType.valueOf(parcel.readString()));
                }
                return new State(readString, stringValue, z2, z3, z4, e2, bigDecimal, e3, createFromParcel, paymentMethodState, ExtensionsKt.e(arrayList3), parcel.readInt() != 0);
            }

            /* renamed from: b */
            public final State[] newArray(int i2) {
                return new State[i2];
            }
        }

        public State(String str, StringValue stringValue, boolean z2, boolean z3, boolean z4, PersistentList persistentList, BigDecimal bigDecimal, PersistentList persistentList2, RiderType riderType, PaymentMethodState paymentMethodState, PersistentList persistentList3, boolean z5) {
            Intrinsics.i(str, "nickName");
            Intrinsics.i(stringValue, "nickNameError");
            Intrinsics.i(persistentList, "quickSelectValues");
            Intrinsics.i(bigDecimal, "topUpAmount");
            Intrinsics.i(persistentList2, "riderTypes");
            Intrinsics.i(persistentList3, "paymentMethodTypes");
            this.f37183z = str;
            this.f37181A = stringValue;
            this.f37182B = z2;
            this.C = z3;
            this.D = z4;
            this.E = persistentList;
            this.F = bigDecimal;
            this.G = persistentList2;
            this.H = riderType;
            this.I = paymentMethodState;
            this.J = persistentList3;
            this.K = z5;
        }

        public static /* synthetic */ State b(State state, String str, StringValue stringValue, boolean z2, boolean z3, boolean z4, PersistentList persistentList, BigDecimal bigDecimal, PersistentList persistentList2, RiderType riderType, PaymentMethodState paymentMethodState, PersistentList persistentList3, boolean z5, int i2, Object obj) {
            State state2 = state;
            int i3 = i2;
            return state.a((i3 & 1) != 0 ? state2.f37183z : str, (i3 & 2) != 0 ? state2.f37181A : stringValue, (i3 & 4) != 0 ? state2.f37182B : z2, (i3 & 8) != 0 ? state2.C : z3, (i3 & 16) != 0 ? state2.D : z4, (i3 & 32) != 0 ? state2.E : persistentList, (i3 & 64) != 0 ? state2.F : bigDecimal, (i3 & 128) != 0 ? state2.G : persistentList2, (i3 & 256) != 0 ? state2.H : riderType, (i3 & 512) != 0 ? state2.I : paymentMethodState, (i3 & 1024) != 0 ? state2.J : persistentList3, (i3 & 2048) != 0 ? state2.K : z5);
        }

        public final State a(String str, StringValue stringValue, boolean z2, boolean z3, boolean z4, PersistentList persistentList, BigDecimal bigDecimal, PersistentList persistentList2, RiderType riderType, PaymentMethodState paymentMethodState, PersistentList persistentList3, boolean z5) {
            Intrinsics.i(str, "nickName");
            StringValue stringValue2 = stringValue;
            Intrinsics.i(stringValue2, "nickNameError");
            PersistentList persistentList4 = persistentList;
            Intrinsics.i(persistentList4, "quickSelectValues");
            BigDecimal bigDecimal2 = bigDecimal;
            Intrinsics.i(bigDecimal2, "topUpAmount");
            PersistentList persistentList5 = persistentList2;
            Intrinsics.i(persistentList5, "riderTypes");
            PersistentList persistentList6 = persistentList3;
            Intrinsics.i(persistentList6, "paymentMethodTypes");
            return new State(str, stringValue2, z2, z3, z4, persistentList4, bigDecimal2, persistentList5, riderType, paymentMethodState, persistentList6, z5);
        }

        public final BigDecimal c() {
            BigDecimal c2;
            RiderType riderType = this.H;
            if (riderType != null && (c2 = riderType.c()) != null) {
                return c2;
            }
            BigDecimal bigDecimal = BigDecimal.ZERO;
            Intrinsics.h(bigDecimal, "ZERO");
            return bigDecimal;
        }

        public final String d() {
            return this.f37183z;
        }

        public final int describeContents() {
            return 0;
        }

        public final StringValue e() {
            return this.f37181A;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return Intrinsics.d(this.f37183z, state.f37183z) && Intrinsics.d(this.f37181A, state.f37181A) && this.f37182B == state.f37182B && this.C == state.C && this.D == state.D && Intrinsics.d(this.E, state.E) && Intrinsics.d(this.F, state.F) && Intrinsics.d(this.G, state.G) && Intrinsics.d(this.H, state.H) && Intrinsics.d(this.I, state.I) && Intrinsics.d(this.J, state.J) && this.K == state.K;
        }

        public final PaymentMethodState f() {
            return this.I;
        }

        public final PersistentList g() {
            return this.J;
        }

        public final PersistentList h() {
            return this.E;
        }

        public int hashCode() {
            int hashCode = ((((((((((((((this.f37183z.hashCode() * 31) + this.f37181A.hashCode()) * 31) + Boolean.hashCode(this.f37182B)) * 31) + Boolean.hashCode(this.C)) * 31) + Boolean.hashCode(this.D)) * 31) + this.E.hashCode()) * 31) + this.F.hashCode()) * 31) + this.G.hashCode()) * 31;
            RiderType riderType = this.H;
            int i2 = 0;
            int hashCode2 = (hashCode + (riderType == null ? 0 : riderType.hashCode())) * 31;
            PaymentMethodState paymentMethodState = this.I;
            if (paymentMethodState != null) {
                i2 = paymentMethodState.hashCode();
            }
            return ((((hashCode2 + i2) * 31) + this.J.hashCode()) * 31) + Boolean.hashCode(this.K);
        }

        public final PersistentList i() {
            return this.G;
        }

        public final RiderType j() {
            return this.H;
        }

        public final boolean k() {
            return this.K;
        }

        public final BigDecimal l() {
            return this.F;
        }

        public final BigDecimal n() {
            BigDecimal add = c().add(this.F);
            Intrinsics.h(add, "add(...)");
            return add;
        }

        public final boolean o() {
            return this.H != null && (p() || this.I != null);
        }

        public final boolean p() {
            return Intrinsics.d(n(), BigDecimal.ZERO);
        }

        public final boolean q() {
            return this.f37182B;
        }

        public final boolean r() {
            return this.C;
        }

        public final boolean s() {
            return this.D;
        }

        public String toString() {
            String str = this.f37183z;
            StringValue stringValue = this.f37181A;
            boolean z2 = this.f37182B;
            boolean z3 = this.C;
            boolean z4 = this.D;
            PersistentList persistentList = this.E;
            BigDecimal bigDecimal = this.F;
            PersistentList persistentList2 = this.G;
            RiderType riderType = this.H;
            PaymentMethodState paymentMethodState = this.I;
            PersistentList persistentList3 = this.J;
            boolean z5 = this.K;
            return "State(nickName=" + str + ", nickNameError=" + stringValue + ", isInitLoading=" + z2 + ", isLoading=" + z3 + ", isRiderTypeSelectorOpen=" + z4 + ", quickSelectValues=" + persistentList + ", topUpAmount=" + bigDecimal + ", riderTypes=" + persistentList2 + ", selectedRiderType=" + riderType + ", paymentMethod=" + paymentMethodState + ", paymentMethodTypes=" + persistentList3 + ", showWalletUnavailableWarning=" + z5 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeString(this.f37183z);
            parcel.writeParcelable(this.f37181A, i2);
            parcel.writeInt(this.f37182B ? 1 : 0);
            parcel.writeInt(this.C ? 1 : 0);
            parcel.writeInt(this.D ? 1 : 0);
            PersistentList<Serializable> persistentList = this.E;
            parcel.writeInt(persistentList.size());
            for (Serializable writeSerializable : persistentList) {
                parcel.writeSerializable(writeSerializable);
            }
            parcel.writeSerializable(this.F);
            PersistentList<RiderType> persistentList2 = this.G;
            parcel.writeInt(persistentList2.size());
            for (RiderType writeToParcel : persistentList2) {
                writeToParcel.writeToParcel(parcel, i2);
            }
            RiderType riderType = this.H;
            if (riderType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                riderType.writeToParcel(parcel, i2);
            }
            parcel.writeParcelable(this.I, i2);
            PersistentList<PaymentMethodType> persistentList3 = this.J;
            parcel.writeInt(persistentList3.size());
            for (PaymentMethodType name : persistentList3) {
                parcel.writeString(name.name());
            }
            parcel.writeInt(this.K ? 1 : 0);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ State(java.lang.String r14, com.hansecom.abt.util.resourcesResolvers.StringValue r15, boolean r16, boolean r17, boolean r18, kotlinx.collections.immutable.PersistentList r19, java.math.BigDecimal r20, kotlinx.collections.immutable.PersistentList r21, com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCard.RiderType r22, com.hansecom.abt.presentation.model.PaymentMethodState r23, kotlinx.collections.immutable.PersistentList r24, boolean r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
            /*
                r13 = this;
                r0 = r26
                r1 = r0 & 1
                if (r1 == 0) goto L_0x0009
                java.lang.String r1 = ""
                goto L_0x000a
            L_0x0009:
                r1 = r14
            L_0x000a:
                r2 = r0 & 2
                if (r2 == 0) goto L_0x0015
                com.hansecom.abt.util.resourcesResolvers.StringValue$Companion r2 = com.hansecom.abt.util.resourcesResolvers.StringValue.Companion
                com.hansecom.abt.util.resourcesResolvers.StringValue r2 = r2.a()
                goto L_0x0016
            L_0x0015:
                r2 = r15
            L_0x0016:
                r3 = r0 & 4
                r4 = 0
                if (r3 == 0) goto L_0x001d
                r3 = r4
                goto L_0x001f
            L_0x001d:
                r3 = r16
            L_0x001f:
                r5 = r0 & 8
                if (r5 == 0) goto L_0x0025
                r5 = r4
                goto L_0x0027
            L_0x0025:
                r5 = r17
            L_0x0027:
                r6 = r0 & 16
                if (r6 == 0) goto L_0x002d
                r6 = r4
                goto L_0x002f
            L_0x002d:
                r6 = r18
            L_0x002f:
                r7 = r0 & 32
                if (r7 == 0) goto L_0x0038
                kotlinx.collections.immutable.PersistentList r7 = kotlinx.collections.immutable.ExtensionsKt.a()
                goto L_0x003a
            L_0x0038:
                r7 = r19
            L_0x003a:
                r8 = r0 & 64
                if (r8 == 0) goto L_0x0041
                java.math.BigDecimal r8 = java.math.BigDecimal.ZERO
                goto L_0x0043
            L_0x0041:
                r8 = r20
            L_0x0043:
                r9 = r0 & 128(0x80, float:1.794E-43)
                if (r9 == 0) goto L_0x004c
                kotlinx.collections.immutable.PersistentList r9 = kotlinx.collections.immutable.ExtensionsKt.a()
                goto L_0x004e
            L_0x004c:
                r9 = r21
            L_0x004e:
                r10 = r0 & 256(0x100, float:3.59E-43)
                r11 = 0
                if (r10 == 0) goto L_0x0055
                r10 = r11
                goto L_0x0057
            L_0x0055:
                r10 = r22
            L_0x0057:
                r12 = r0 & 512(0x200, float:7.175E-43)
                if (r12 == 0) goto L_0x005c
                goto L_0x005e
            L_0x005c:
                r11 = r23
            L_0x005e:
                r12 = r0 & 1024(0x400, float:1.435E-42)
                if (r12 == 0) goto L_0x0067
                kotlinx.collections.immutable.PersistentList r12 = kotlinx.collections.immutable.ExtensionsKt.a()
                goto L_0x0069
            L_0x0067:
                r12 = r24
            L_0x0069:
                r0 = r0 & 2048(0x800, float:2.87E-42)
                if (r0 == 0) goto L_0x006e
                goto L_0x0070
            L_0x006e:
                r4 = r25
            L_0x0070:
                r14 = r13
                r15 = r1
                r16 = r2
                r17 = r3
                r18 = r5
                r19 = r6
                r20 = r7
                r21 = r8
                r22 = r9
                r23 = r10
                r24 = r11
                r25 = r12
                r26 = r4
                r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCard.State.<init>(java.lang.String, com.hansecom.abt.util.resourcesResolvers.StringValue, boolean, boolean, boolean, kotlinx.collections.immutable.PersistentList, java.math.BigDecimal, kotlinx.collections.immutable.PersistentList, com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCard$RiderType, com.hansecom.abt.presentation.model.PaymentMethodState, kotlinx.collections.immutable.PersistentList, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
