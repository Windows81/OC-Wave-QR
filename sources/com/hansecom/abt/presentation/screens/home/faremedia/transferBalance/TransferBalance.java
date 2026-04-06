package com.hansecom.abt.presentation.screens.home.faremedia.transferBalance;

import android.os.Parcel;
import android.os.Parcelable;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.PersistentList;

@Metadata
public interface TransferBalance {

    @Metadata
    public interface Action {

        @Metadata
        public static final class Confirm implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final Confirm f37306a = new Confirm();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Confirm);
            }

            public int hashCode() {
                return 2146411760;
            }

            public String toString() {
                return "Confirm";
            }
        }

        @Metadata
        public static final class TargetFareMediaChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final PaymentMethodState.FareMedia f37307a;

            public TargetFareMediaChange(PaymentMethodState.FareMedia fareMedia) {
                Intrinsics.i(fareMedia, "fareMedia");
                this.f37307a = fareMedia;
            }

            public final PaymentMethodState.FareMedia a() {
                return this.f37307a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TargetFareMediaChange) && Intrinsics.d(this.f37307a, ((TargetFareMediaChange) obj).f37307a);
            }

            public int hashCode() {
                return this.f37307a.hashCode();
            }

            public String toString() {
                PaymentMethodState.FareMedia fareMedia = this.f37307a;
                return "TargetFareMediaChange(fareMedia=" + fareMedia + ")";
            }
        }

        @Metadata
        public static final class ValueChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f37308a;

            public ValueChange(String str) {
                Intrinsics.i(str, "value");
                this.f37308a = str;
            }

            public final String a() {
                return this.f37308a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ValueChange) && Intrinsics.d(this.f37308a, ((ValueChange) obj).f37308a);
            }

            public int hashCode() {
                return this.f37308a.hashCode();
            }

            public String toString() {
                String str = this.f37308a;
                return "ValueChange(value=" + str + ")";
            }
        }
    }

    @Metadata
    public interface Effect {

        @Metadata
        public static final class Error implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final StringValue f37309a;

            public Error(StringValue stringValue) {
                Intrinsics.i(stringValue, "message");
                this.f37309a = stringValue;
            }

            public final StringValue a() {
                return this.f37309a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.d(this.f37309a, ((Error) obj).f37309a);
            }

            public int hashCode() {
                return this.f37309a.hashCode();
            }

            public String toString() {
                StringValue stringValue = this.f37309a;
                return "Error(message=" + stringValue + ")";
            }
        }

        @Metadata
        public static final class Success implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final StringValue f37310a;

            public Success(StringValue stringValue) {
                Intrinsics.i(stringValue, "cardTitle");
                this.f37310a = stringValue;
            }

            public final StringValue a() {
                return this.f37310a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Success) && Intrinsics.d(this.f37310a, ((Success) obj).f37310a);
            }

            public int hashCode() {
                return this.f37310a.hashCode();
            }

            public String toString() {
                StringValue stringValue = this.f37310a;
                return "Success(cardTitle=" + stringValue + ")";
            }
        }
    }

    @Metadata
    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new Creator();

        /* renamed from: A  reason: collision with root package name */
        public final ValidationError f37311A;

        /* renamed from: B  reason: collision with root package name */
        public final BigDecimal f37312B;
        public final boolean C;
        public final boolean D;
        public final String E;
        public final BigDecimal F;
        public final ImmutableList G;
        public final ImmutableList H;
        public final PaymentMethodState.FareMedia I;
        public final BigDecimal J;

        /* renamed from: z  reason: collision with root package name */
        public final String f37313z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<State> {
            /* renamed from: a */
            public final State createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                String readString = parcel.readString();
                PaymentMethodState.FareMedia fareMedia = null;
                ValidationError valueOf = parcel.readInt() == 0 ? null : ValidationError.valueOf(parcel.readString());
                BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
                boolean z2 = true;
                boolean z3 = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                String readString2 = parcel.readString();
                BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i2 = 0; i2 != readInt; i2++) {
                    arrayList.add(PaymentMethodState.FareMedia.CREATOR.createFromParcel(parcel));
                }
                PersistentList e2 = ExtensionsKt.e(arrayList);
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                for (int i3 = 0; i3 != readInt2; i3++) {
                    arrayList2.add(PaymentMethodState.FareMedia.CREATOR.createFromParcel(parcel));
                }
                PersistentList e3 = ExtensionsKt.e(arrayList2);
                if (parcel.readInt() != 0) {
                    fareMedia = PaymentMethodState.FareMedia.CREATOR.createFromParcel(parcel);
                }
                return new State(readString, valueOf, bigDecimal, z3, z2, readString2, bigDecimal2, e2, e3, fareMedia, (BigDecimal) parcel.readSerializable());
            }

            /* renamed from: b */
            public final State[] newArray(int i2) {
                return new State[i2];
            }
        }

        @Metadata
        public enum ValidationError {
            MAX_BALANCE,
            LOW_BALANCE;

            static {
                ValidationError[] d2;
                C = EnumEntriesKt.a(d2);
            }
        }

        public State(String str, ValidationError validationError, BigDecimal bigDecimal, boolean z2, boolean z3, String str2, BigDecimal bigDecimal2, ImmutableList immutableList, ImmutableList immutableList2, PaymentMethodState.FareMedia fareMedia, BigDecimal bigDecimal3) {
            Intrinsics.i(str, "value");
            Intrinsics.i(bigDecimal, "maxBalance");
            Intrinsics.i(str2, "title");
            Intrinsics.i(bigDecimal2, "balance");
            Intrinsics.i(immutableList, "virtualFareMediaList");
            Intrinsics.i(immutableList2, "physicalFareMediaList");
            Intrinsics.i(bigDecimal3, "transferAmount");
            this.f37313z = str;
            this.f37311A = validationError;
            this.f37312B = bigDecimal;
            this.C = z2;
            this.D = z3;
            this.E = str2;
            this.F = bigDecimal2;
            this.G = immutableList;
            this.H = immutableList2;
            this.I = fareMedia;
            this.J = bigDecimal3;
        }

        public static /* synthetic */ State b(State state, String str, ValidationError validationError, BigDecimal bigDecimal, boolean z2, boolean z3, String str2, BigDecimal bigDecimal2, ImmutableList immutableList, ImmutableList immutableList2, PaymentMethodState.FareMedia fareMedia, BigDecimal bigDecimal3, int i2, Object obj) {
            State state2 = state;
            int i3 = i2;
            return state.a((i3 & 1) != 0 ? state2.f37313z : str, (i3 & 2) != 0 ? state2.f37311A : validationError, (i3 & 4) != 0 ? state2.f37312B : bigDecimal, (i3 & 8) != 0 ? state2.C : z2, (i3 & 16) != 0 ? state2.D : z3, (i3 & 32) != 0 ? state2.E : str2, (i3 & 64) != 0 ? state2.F : bigDecimal2, (i3 & 128) != 0 ? state2.G : immutableList, (i3 & 256) != 0 ? state2.H : immutableList2, (i3 & 512) != 0 ? state2.I : fareMedia, (i3 & 1024) != 0 ? state2.J : bigDecimal3);
        }

        public final State a(String str, ValidationError validationError, BigDecimal bigDecimal, boolean z2, boolean z3, String str2, BigDecimal bigDecimal2, ImmutableList immutableList, ImmutableList immutableList2, PaymentMethodState.FareMedia fareMedia, BigDecimal bigDecimal3) {
            Intrinsics.i(str, "value");
            BigDecimal bigDecimal4 = bigDecimal;
            Intrinsics.i(bigDecimal4, "maxBalance");
            String str3 = str2;
            Intrinsics.i(str3, "title");
            BigDecimal bigDecimal5 = bigDecimal2;
            Intrinsics.i(bigDecimal5, "balance");
            ImmutableList immutableList3 = immutableList;
            Intrinsics.i(immutableList3, "virtualFareMediaList");
            ImmutableList immutableList4 = immutableList2;
            Intrinsics.i(immutableList4, "physicalFareMediaList");
            BigDecimal bigDecimal6 = bigDecimal3;
            Intrinsics.i(bigDecimal6, "transferAmount");
            return new State(str, validationError, bigDecimal4, z2, z3, str3, bigDecimal5, immutableList3, immutableList4, fareMedia, bigDecimal6);
        }

        public final BigDecimal c() {
            return this.F;
        }

        public final boolean d() {
            return this.C;
        }

        public final int describeContents() {
            return 0;
        }

        public final ValidationError e() {
            return this.f37311A;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return Intrinsics.d(this.f37313z, state.f37313z) && this.f37311A == state.f37311A && Intrinsics.d(this.f37312B, state.f37312B) && this.C == state.C && this.D == state.D && Intrinsics.d(this.E, state.E) && Intrinsics.d(this.F, state.F) && Intrinsics.d(this.G, state.G) && Intrinsics.d(this.H, state.H) && Intrinsics.d(this.I, state.I) && Intrinsics.d(this.J, state.J);
        }

        public final BigDecimal f() {
            return this.f37312B;
        }

        public final ImmutableList g() {
            return this.H;
        }

        public final boolean h() {
            return this.D;
        }

        public int hashCode() {
            int hashCode = this.f37313z.hashCode() * 31;
            ValidationError validationError = this.f37311A;
            int i2 = 0;
            int hashCode2 = (((((((((((((((hashCode + (validationError == null ? 0 : validationError.hashCode())) * 31) + this.f37312B.hashCode()) * 31) + Boolean.hashCode(this.C)) * 31) + Boolean.hashCode(this.D)) * 31) + this.E.hashCode()) * 31) + this.F.hashCode()) * 31) + this.G.hashCode()) * 31) + this.H.hashCode()) * 31;
            PaymentMethodState.FareMedia fareMedia = this.I;
            if (fareMedia != null) {
                i2 = fareMedia.hashCode();
            }
            return ((hashCode2 + i2) * 31) + this.J.hashCode();
        }

        public final PaymentMethodState.FareMedia i() {
            return this.I;
        }

        public final String j() {
            return this.E;
        }

        public final BigDecimal k() {
            return this.J;
        }

        public final String l() {
            return this.f37313z;
        }

        public final ImmutableList n() {
            return this.G;
        }

        public final boolean o() {
            return this.I != null && this.J.compareTo(BigDecimal.ZERO) > 0 && this.f37311A == null;
        }

        public final boolean p() {
            return this.I != null;
        }

        public final boolean q() {
            return !this.G.isEmpty() || !this.H.isEmpty();
        }

        public final boolean r() {
            return this.I != null;
        }

        public String toString() {
            String str = this.f37313z;
            ValidationError validationError = this.f37311A;
            BigDecimal bigDecimal = this.f37312B;
            boolean z2 = this.C;
            boolean z3 = this.D;
            String str2 = this.E;
            BigDecimal bigDecimal2 = this.F;
            ImmutableList immutableList = this.G;
            ImmutableList immutableList2 = this.H;
            PaymentMethodState.FareMedia fareMedia = this.I;
            BigDecimal bigDecimal3 = this.J;
            return "State(value=" + str + ", error=" + validationError + ", maxBalance=" + bigDecimal + ", blockingLoading=" + z2 + ", showLoadingDialog=" + z3 + ", title=" + str2 + ", balance=" + bigDecimal2 + ", virtualFareMediaList=" + immutableList + ", physicalFareMediaList=" + immutableList2 + ", targetFareMedia=" + fareMedia + ", transferAmount=" + bigDecimal3 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeString(this.f37313z);
            ValidationError validationError = this.f37311A;
            if (validationError == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(validationError.name());
            }
            parcel.writeSerializable(this.f37312B);
            parcel.writeInt(this.C ? 1 : 0);
            parcel.writeInt(this.D ? 1 : 0);
            parcel.writeString(this.E);
            parcel.writeSerializable(this.F);
            ImmutableList<PaymentMethodState.FareMedia> immutableList = this.G;
            parcel.writeInt(immutableList.size());
            for (PaymentMethodState.FareMedia writeToParcel : immutableList) {
                writeToParcel.writeToParcel(parcel, i2);
            }
            ImmutableList<PaymentMethodState.FareMedia> immutableList2 = this.H;
            parcel.writeInt(immutableList2.size());
            for (PaymentMethodState.FareMedia writeToParcel2 : immutableList2) {
                writeToParcel2.writeToParcel(parcel, i2);
            }
            PaymentMethodState.FareMedia fareMedia = this.I;
            if (fareMedia == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fareMedia.writeToParcel(parcel, i2);
            }
            parcel.writeSerializable(this.J);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ State(java.lang.String r13, com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalance.State.ValidationError r14, java.math.BigDecimal r15, boolean r16, boolean r17, java.lang.String r18, java.math.BigDecimal r19, kotlinx.collections.immutable.ImmutableList r20, kotlinx.collections.immutable.ImmutableList r21, com.hansecom.abt.presentation.model.PaymentMethodState.FareMedia r22, java.math.BigDecimal r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
            /*
                r12 = this;
                r0 = r24
                r1 = r0 & 1
                java.lang.String r2 = ""
                if (r1 == 0) goto L_0x000a
                r1 = r2
                goto L_0x000b
            L_0x000a:
                r1 = r13
            L_0x000b:
                r3 = r0 & 2
                r4 = 0
                if (r3 == 0) goto L_0x0012
                r3 = r4
                goto L_0x0013
            L_0x0012:
                r3 = r14
            L_0x0013:
                r5 = r0 & 4
                if (r5 == 0) goto L_0x001a
                java.math.BigDecimal r5 = java.math.BigDecimal.ZERO
                goto L_0x001b
            L_0x001a:
                r5 = r15
            L_0x001b:
                r6 = r0 & 8
                r7 = 0
                if (r6 == 0) goto L_0x0022
                r6 = r7
                goto L_0x0024
            L_0x0022:
                r6 = r16
            L_0x0024:
                r8 = r0 & 16
                if (r8 == 0) goto L_0x0029
                goto L_0x002b
            L_0x0029:
                r7 = r17
            L_0x002b:
                r8 = r0 & 32
                if (r8 == 0) goto L_0x0030
                goto L_0x0032
            L_0x0030:
                r2 = r18
            L_0x0032:
                r8 = r0 & 64
                if (r8 == 0) goto L_0x0039
                java.math.BigDecimal r8 = java.math.BigDecimal.ZERO
                goto L_0x003b
            L_0x0039:
                r8 = r19
            L_0x003b:
                r9 = r0 & 128(0x80, float:1.794E-43)
                if (r9 == 0) goto L_0x0044
                kotlinx.collections.immutable.PersistentList r9 = kotlinx.collections.immutable.ExtensionsKt.a()
                goto L_0x0046
            L_0x0044:
                r9 = r20
            L_0x0046:
                r10 = r0 & 256(0x100, float:3.59E-43)
                if (r10 == 0) goto L_0x004f
                kotlinx.collections.immutable.PersistentList r10 = kotlinx.collections.immutable.ExtensionsKt.a()
                goto L_0x0051
            L_0x004f:
                r10 = r21
            L_0x0051:
                r11 = r0 & 512(0x200, float:7.175E-43)
                if (r11 == 0) goto L_0x0056
                goto L_0x0058
            L_0x0056:
                r4 = r22
            L_0x0058:
                r0 = r0 & 1024(0x400, float:1.435E-42)
                if (r0 == 0) goto L_0x005f
                java.math.BigDecimal r0 = java.math.BigDecimal.ZERO
                goto L_0x0061
            L_0x005f:
                r0 = r23
            L_0x0061:
                r13 = r12
                r14 = r1
                r15 = r3
                r16 = r5
                r17 = r6
                r18 = r7
                r19 = r2
                r20 = r8
                r21 = r9
                r22 = r10
                r23 = r4
                r24 = r0
                r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalance.State.<init>(java.lang.String, com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalance$State$ValidationError, java.math.BigDecimal, boolean, boolean, java.lang.String, java.math.BigDecimal, kotlinx.collections.immutable.ImmutableList, kotlinx.collections.immutable.ImmutableList, com.hansecom.abt.presentation.model.PaymentMethodState$FareMedia, java.math.BigDecimal, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
