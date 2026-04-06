package com.hansecom.abt.presentation.screens.home.account.payment;

import android.os.Parcel;
import android.os.Parcelable;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;

@Metadata
public interface PaymentMethods {

    @Metadata
    public interface Action {

        @Metadata
        public static final class AddPaymentMethod implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final AddPaymentMethod f35496a = new AddPaymentMethod();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof AddPaymentMethod);
            }

            public int hashCode() {
                return -1300881285;
            }

            public String toString() {
                return "AddPaymentMethod";
            }
        }

        @Metadata
        public static final class Refresh implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final Refresh f35497a = new Refresh();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Refresh);
            }

            public int hashCode() {
                return 1480478246;
            }

            public String toString() {
                return "Refresh";
            }
        }
    }

    @Metadata
    public interface Effect {

        @Metadata
        public static final class Error implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final StringValue f35498a;

            public Error(StringValue stringValue) {
                Intrinsics.i(stringValue, "message");
                this.f35498a = stringValue;
            }

            public final StringValue a() {
                return this.f35498a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.d(this.f35498a, ((Error) obj).f35498a);
            }

            public int hashCode() {
                return this.f35498a.hashCode();
            }

            public String toString() {
                StringValue stringValue = this.f35498a;
                return "Error(message=" + stringValue + ")";
            }
        }

        @Metadata
        public static final class InputCardDetails implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final InputCardDetails f35499a = new InputCardDetails();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof InputCardDetails);
            }

            public int hashCode() {
                return 596654594;
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
        public final boolean f35500A;

        /* renamed from: B  reason: collision with root package name */
        public final boolean f35501B;
        public final ImmutableList C;
        public final Integer D;

        /* renamed from: z  reason: collision with root package name */
        public final boolean f35502z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<State> {
            /* renamed from: a */
            public final State createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                boolean z4 = parcel.readInt() != 0;
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i2 = 0; i2 != readInt; i2++) {
                    arrayList.add(PaymentMethodState.CreditCard.CREATOR.createFromParcel(parcel));
                }
                return new State(z2, z3, z4, ExtensionsKt.e(arrayList), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            /* renamed from: b */
            public final State[] newArray(int i2) {
                return new State[i2];
            }
        }

        public State(boolean z2, boolean z3, boolean z4, ImmutableList immutableList, Integer num) {
            Intrinsics.i(immutableList, "paymentMethods");
            this.f35502z = z2;
            this.f35500A = z3;
            this.f35501B = z4;
            this.C = immutableList;
            this.D = num;
        }

        public static /* synthetic */ State b(State state, boolean z2, boolean z3, boolean z4, ImmutableList immutableList, Integer num, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z2 = state.f35502z;
            }
            if ((i2 & 2) != 0) {
                z3 = state.f35500A;
            }
            boolean z5 = z3;
            if ((i2 & 4) != 0) {
                z4 = state.f35501B;
            }
            boolean z6 = z4;
            if ((i2 & 8) != 0) {
                immutableList = state.C;
            }
            ImmutableList immutableList2 = immutableList;
            if ((i2 & 16) != 0) {
                num = state.D;
            }
            return state.a(z2, z5, z6, immutableList2, num);
        }

        public final State a(boolean z2, boolean z3, boolean z4, ImmutableList immutableList, Integer num) {
            Intrinsics.i(immutableList, "paymentMethods");
            return new State(z2, z3, z4, immutableList, num);
        }

        public final boolean c() {
            return this.f35502z;
        }

        public final boolean d() {
            return this.f35500A;
        }

        public final int describeContents() {
            return 0;
        }

        public final Integer e() {
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
            return this.f35502z == state.f35502z && this.f35500A == state.f35500A && this.f35501B == state.f35501B && Intrinsics.d(this.C, state.C) && Intrinsics.d(this.D, state.D);
        }

        public final boolean f() {
            return this.D != null && this.C.size() >= this.D.intValue();
        }

        public final ImmutableList g() {
            return this.C;
        }

        public final boolean h() {
            return this.f35501B;
        }

        public int hashCode() {
            int hashCode = ((((((Boolean.hashCode(this.f35502z) * 31) + Boolean.hashCode(this.f35500A)) * 31) + Boolean.hashCode(this.f35501B)) * 31) + this.C.hashCode()) * 31;
            Integer num = this.D;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            boolean z2 = this.f35502z;
            boolean z3 = this.f35500A;
            boolean z4 = this.f35501B;
            ImmutableList immutableList = this.C;
            Integer num = this.D;
            return "State(loading=" + z2 + ", loadingAddCard=" + z3 + ", refreshing=" + z4 + ", paymentMethods=" + immutableList + ", maxPaymentMethodsCount=" + num + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            int intValue;
            Intrinsics.i(parcel, "dest");
            parcel.writeInt(this.f35502z ? 1 : 0);
            parcel.writeInt(this.f35500A ? 1 : 0);
            parcel.writeInt(this.f35501B ? 1 : 0);
            ImmutableList<PaymentMethodState.CreditCard> immutableList = this.C;
            parcel.writeInt(immutableList.size());
            for (PaymentMethodState.CreditCard writeToParcel : immutableList) {
                writeToParcel.writeToParcel(parcel, i2);
            }
            Integer num = this.D;
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
        public /* synthetic */ State(boolean r4, boolean r5, boolean r6, kotlinx.collections.immutable.ImmutableList r7, java.lang.Integer r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
            /*
                r3 = this;
                r10 = r9 & 1
                r0 = 0
                if (r10 == 0) goto L_0x0007
                r10 = r0
                goto L_0x0008
            L_0x0007:
                r10 = r4
            L_0x0008:
                r4 = r9 & 2
                if (r4 == 0) goto L_0x000e
                r1 = r0
                goto L_0x000f
            L_0x000e:
                r1 = r5
            L_0x000f:
                r4 = r9 & 4
                if (r4 == 0) goto L_0x0014
                goto L_0x0015
            L_0x0014:
                r0 = r6
            L_0x0015:
                r4 = r9 & 8
                if (r4 == 0) goto L_0x001d
                kotlinx.collections.immutable.PersistentList r7 = kotlinx.collections.immutable.ExtensionsKt.a()
            L_0x001d:
                r2 = r7
                r4 = r9 & 16
                if (r4 == 0) goto L_0x0023
                r8 = 0
            L_0x0023:
                r9 = r8
                r4 = r3
                r5 = r10
                r6 = r1
                r7 = r0
                r8 = r2
                r4.<init>(r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethods.State.<init>(boolean, boolean, boolean, kotlinx.collections.immutable.ImmutableList, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
