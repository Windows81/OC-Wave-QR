package com.hansecom.abt.presentation.screens.payment;

import android.os.Parcel;
import android.os.Parcelable;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.PersistentList;

@Metadata
public interface ChoosePaymentMethod {

    @Metadata
    public interface Action {

        @Metadata
        public static final class AddPaymentMethod implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final AddPaymentMethod f37737a = new AddPaymentMethod();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof AddPaymentMethod);
            }

            public int hashCode() {
                return -460232321;
            }

            public String toString() {
                return "AddPaymentMethod";
            }
        }

        @Metadata
        /* renamed from: com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethod$Action$ChoosePaymentMethod  reason: collision with other inner class name */
        public static final class C0009ChoosePaymentMethod implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final PaymentMethodState f37738a;

            public C0009ChoosePaymentMethod(PaymentMethodState paymentMethodState) {
                Intrinsics.i(paymentMethodState, "paymentMethod");
                this.f37738a = paymentMethodState;
            }

            public final PaymentMethodState a() {
                return this.f37738a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0009ChoosePaymentMethod) && Intrinsics.d(this.f37738a, ((C0009ChoosePaymentMethod) obj).f37738a);
            }

            public int hashCode() {
                return this.f37738a.hashCode();
            }

            public String toString() {
                PaymentMethodState paymentMethodState = this.f37738a;
                return "ChoosePaymentMethod(paymentMethod=" + paymentMethodState + ")";
            }
        }
    }

    @Metadata
    public interface Effect {

        @Metadata
        /* renamed from: com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethod$Effect$ChoosePaymentMethod  reason: collision with other inner class name */
        public static final class C0010ChoosePaymentMethod implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final PaymentMethodState f37739a;

            public C0010ChoosePaymentMethod(PaymentMethodState paymentMethodState) {
                Intrinsics.i(paymentMethodState, "paymentMethod");
                this.f37739a = paymentMethodState;
            }

            public final PaymentMethodState a() {
                return this.f37739a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0010ChoosePaymentMethod) && Intrinsics.d(this.f37739a, ((C0010ChoosePaymentMethod) obj).f37739a);
            }

            public int hashCode() {
                return this.f37739a.hashCode();
            }

            public String toString() {
                PaymentMethodState paymentMethodState = this.f37739a;
                return "ChoosePaymentMethod(paymentMethod=" + paymentMethodState + ")";
            }
        }

        @Metadata
        public static final class Error implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final StringValue f37740a;

            public Error(StringValue stringValue) {
                Intrinsics.i(stringValue, "message");
                this.f37740a = stringValue;
            }

            public final StringValue a() {
                return this.f37740a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.d(this.f37740a, ((Error) obj).f37740a);
            }

            public int hashCode() {
                return this.f37740a.hashCode();
            }

            public String toString() {
                StringValue stringValue = this.f37740a;
                return "Error(message=" + stringValue + ")";
            }
        }

        @Metadata
        public static final class InputCardDetails implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final InputCardDetails f37741a = new InputCardDetails();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof InputCardDetails);
            }

            public int hashCode() {
                return 1437303558;
            }

            public String toString() {
                return "InputCardDetails";
            }
        }
    }

    @Metadata
    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new Creator();

        /* renamed from: A  reason: collision with root package name */
        public final boolean f37742A;

        /* renamed from: B  reason: collision with root package name */
        public final ImmutableList f37743B;
        public final ImmutableList C;
        public final ImmutableList D;
        public final Integer E;

        /* renamed from: z  reason: collision with root package name */
        public final boolean f37744z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<State> {
            /* renamed from: a */
            public final State createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i2 = 0; i2 != readInt; i2++) {
                    arrayList.add(PaymentMethodState.FareMedia.CREATOR.createFromParcel(parcel));
                }
                PersistentList e2 = ExtensionsKt.e(arrayList);
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                for (int i3 = 0; i3 != readInt2; i3++) {
                    arrayList2.add(PaymentMethodState.CreditCard.CREATOR.createFromParcel(parcel));
                }
                PersistentList e3 = ExtensionsKt.e(arrayList2);
                int readInt3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt3);
                for (int i4 = 0; i4 != readInt3; i4++) {
                    arrayList3.add(parcel.readParcelable(State.class.getClassLoader()));
                }
                return new State(z2, z3, e2, e3, ExtensionsKt.e(arrayList3), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            /* renamed from: b */
            public final State[] newArray(int i2) {
                return new State[i2];
            }
        }

        public State(boolean z2, boolean z3, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, Integer num) {
            Intrinsics.i(immutableList, "fareMediaPaymentMethods");
            Intrinsics.i(immutableList2, "cardPaymentMethods");
            Intrinsics.i(immutableList3, "otherPaymentMethods");
            this.f37744z = z2;
            this.f37742A = z3;
            this.f37743B = immutableList;
            this.C = immutableList2;
            this.D = immutableList3;
            this.E = num;
        }

        public static /* synthetic */ State b(State state, boolean z2, boolean z3, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, Integer num, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z2 = state.f37744z;
            }
            if ((i2 & 2) != 0) {
                z3 = state.f37742A;
            }
            boolean z4 = z3;
            if ((i2 & 4) != 0) {
                immutableList = state.f37743B;
            }
            ImmutableList immutableList4 = immutableList;
            if ((i2 & 8) != 0) {
                immutableList2 = state.C;
            }
            ImmutableList immutableList5 = immutableList2;
            if ((i2 & 16) != 0) {
                immutableList3 = state.D;
            }
            ImmutableList immutableList6 = immutableList3;
            if ((i2 & 32) != 0) {
                num = state.E;
            }
            return state.a(z2, z4, immutableList4, immutableList5, immutableList6, num);
        }

        public final State a(boolean z2, boolean z3, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, Integer num) {
            Intrinsics.i(immutableList, "fareMediaPaymentMethods");
            Intrinsics.i(immutableList2, "cardPaymentMethods");
            Intrinsics.i(immutableList3, "otherPaymentMethods");
            return new State(z2, z3, immutableList, immutableList2, immutableList3, num);
        }

        public final ImmutableList c() {
            return this.C;
        }

        public final ImmutableList d() {
            return this.f37743B;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean e() {
            return this.f37744z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return this.f37744z == state.f37744z && this.f37742A == state.f37742A && Intrinsics.d(this.f37743B, state.f37743B) && Intrinsics.d(this.C, state.C) && Intrinsics.d(this.D, state.D) && Intrinsics.d(this.E, state.E);
        }

        public final boolean f() {
            return this.f37742A;
        }

        public final Integer g() {
            return this.E;
        }

        public final boolean h() {
            return this.E != null && this.C.size() >= this.E.intValue();
        }

        public int hashCode() {
            int hashCode = ((((((((Boolean.hashCode(this.f37744z) * 31) + Boolean.hashCode(this.f37742A)) * 31) + this.f37743B.hashCode()) * 31) + this.C.hashCode()) * 31) + this.D.hashCode()) * 31;
            Integer num = this.E;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        public final ImmutableList i() {
            return this.D;
        }

        public String toString() {
            boolean z2 = this.f37744z;
            boolean z3 = this.f37742A;
            ImmutableList immutableList = this.f37743B;
            ImmutableList immutableList2 = this.C;
            ImmutableList immutableList3 = this.D;
            Integer num = this.E;
            return "State(loading=" + z2 + ", loadingAddCard=" + z3 + ", fareMediaPaymentMethods=" + immutableList + ", cardPaymentMethods=" + immutableList2 + ", otherPaymentMethods=" + immutableList3 + ", maxCardPaymentMethodsCount=" + num + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            int intValue;
            Intrinsics.i(parcel, "dest");
            parcel.writeInt(this.f37744z ? 1 : 0);
            parcel.writeInt(this.f37742A ? 1 : 0);
            ImmutableList<PaymentMethodState.FareMedia> immutableList = this.f37743B;
            parcel.writeInt(immutableList.size());
            for (PaymentMethodState.FareMedia writeToParcel : immutableList) {
                writeToParcel.writeToParcel(parcel, i2);
            }
            ImmutableList<PaymentMethodState.CreditCard> immutableList2 = this.C;
            parcel.writeInt(immutableList2.size());
            for (PaymentMethodState.CreditCard writeToParcel2 : immutableList2) {
                writeToParcel2.writeToParcel(parcel, i2);
            }
            ImmutableList<Parcelable> immutableList3 = this.D;
            parcel.writeInt(immutableList3.size());
            for (Parcelable writeParcelable : immutableList3) {
                parcel.writeParcelable(writeParcelable, i2);
            }
            Integer num = this.E;
            if (num == null) {
                intValue = 0;
            } else {
                parcel.writeInt(1);
                intValue = num.intValue();
            }
            parcel.writeInt(intValue);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ State(boolean r5, boolean r6, kotlinx.collections.immutable.ImmutableList r7, kotlinx.collections.immutable.ImmutableList r8, kotlinx.collections.immutable.ImmutableList r9, java.lang.Integer r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
            /*
                r4 = this;
                r12 = r11 & 1
                r0 = 0
                if (r12 == 0) goto L_0x0007
                r12 = r0
                goto L_0x0008
            L_0x0007:
                r12 = r5
            L_0x0008:
                r5 = r11 & 2
                if (r5 == 0) goto L_0x000d
                goto L_0x000e
            L_0x000d:
                r0 = r6
            L_0x000e:
                r5 = r11 & 4
                if (r5 == 0) goto L_0x0016
                kotlinx.collections.immutable.PersistentList r7 = kotlinx.collections.immutable.ExtensionsKt.a()
            L_0x0016:
                r1 = r7
                r5 = r11 & 8
                if (r5 == 0) goto L_0x001f
                kotlinx.collections.immutable.PersistentList r8 = kotlinx.collections.immutable.ExtensionsKt.a()
            L_0x001f:
                r2 = r8
                r5 = r11 & 16
                if (r5 == 0) goto L_0x0028
                kotlinx.collections.immutable.PersistentList r9 = kotlinx.collections.immutable.ExtensionsKt.a()
            L_0x0028:
                r3 = r9
                r5 = r11 & 32
                if (r5 == 0) goto L_0x002e
                r10 = 0
            L_0x002e:
                r11 = r10
                r5 = r4
                r6 = r12
                r7 = r0
                r8 = r1
                r9 = r2
                r10 = r3
                r5.<init>(r6, r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethod.State.<init>(boolean, boolean, kotlinx.collections.immutable.ImmutableList, kotlinx.collections.immutable.ImmutableList, kotlinx.collections.immutable.ImmutableList, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
