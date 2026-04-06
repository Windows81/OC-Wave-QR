package com.hansecom.abt.presentation.screens.home.account.payment.detalis;

import android.os.Parcel;
import android.os.Parcelable;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public interface PaymentMethodDetails {

    @Metadata
    public interface Action {

        @Metadata
        public static final class Delete implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final Delete f35764a = new Delete();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Delete);
            }

            public int hashCode() {
                return 1674409461;
            }

            public String toString() {
                return "Delete";
            }
        }

        @Metadata
        public static final class DeleteDialog implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final boolean f35765a;

            public DeleteDialog(boolean z2) {
                this.f35765a = z2;
            }

            public final boolean a() {
                return this.f35765a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DeleteDialog) && this.f35765a == ((DeleteDialog) obj).f35765a;
            }

            public int hashCode() {
                return Boolean.hashCode(this.f35765a);
            }

            public String toString() {
                boolean z2 = this.f35765a;
                return "DeleteDialog(show=" + z2 + ")";
            }
        }

        @Metadata
        public static final class NickNameChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f35766a;

            public NickNameChange(String str) {
                Intrinsics.i(str, "value");
                this.f35766a = str;
            }

            public final String a() {
                return this.f35766a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NickNameChange) && Intrinsics.d(this.f35766a, ((NickNameChange) obj).f35766a);
            }

            public int hashCode() {
                return this.f35766a.hashCode();
            }

            public String toString() {
                String str = this.f35766a;
                return "NickNameChange(value=" + str + ")";
            }
        }

        @Metadata
        public static final class Save implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final Save f35767a = new Save();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Save);
            }

            public int hashCode() {
                return 1347435591;
            }

            public String toString() {
                return "Save";
            }
        }
    }

    @Metadata
    public interface Effect {

        @Metadata
        public static final class DeleteSuccess implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final DeleteSuccess f35768a = new DeleteSuccess();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof DeleteSuccess);
            }

            public int hashCode() {
                return 11891817;
            }

            public String toString() {
                return "DeleteSuccess";
            }
        }

        @Metadata
        public static final class Error implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final StringValue f35769a;

            public Error(StringValue stringValue) {
                Intrinsics.i(stringValue, "message");
                this.f35769a = stringValue;
            }

            public final StringValue a() {
                return this.f35769a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.d(this.f35769a, ((Error) obj).f35769a);
            }

            public int hashCode() {
                return this.f35769a.hashCode();
            }

            public String toString() {
                StringValue stringValue = this.f35769a;
                return "Error(message=" + stringValue + ")";
            }
        }

        @Metadata
        public static final class InitialLoadingError implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final StringValue f35770a;

            public InitialLoadingError(StringValue stringValue) {
                Intrinsics.i(stringValue, "message");
                this.f35770a = stringValue;
            }

            public final StringValue a() {
                return this.f35770a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InitialLoadingError) && Intrinsics.d(this.f35770a, ((InitialLoadingError) obj).f35770a);
            }

            public int hashCode() {
                return this.f35770a.hashCode();
            }

            public String toString() {
                StringValue stringValue = this.f35770a;
                return "InitialLoadingError(message=" + stringValue + ")";
            }
        }

        @Metadata
        public static final class SaveSuccess implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final SaveSuccess f35771a = new SaveSuccess();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof SaveSuccess);
            }

            public int hashCode() {
                return -2027972457;
            }

            public String toString() {
                return "SaveSuccess";
            }
        }
    }

    @Metadata
    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new Creator();

        /* renamed from: A  reason: collision with root package name */
        public final boolean f35772A;

        /* renamed from: B  reason: collision with root package name */
        public final boolean f35773B;
        public final PaymentMethodState.CreditCard C;
        public final String D;
        public final StringValue E;
        public final boolean F;
        public final boolean G;

        /* renamed from: z  reason: collision with root package name */
        public final boolean f35774z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<State> {
            /* renamed from: a */
            public final State createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                return new State(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : PaymentMethodState.CreditCard.CREATOR.createFromParcel(parcel), parcel.readString(), (StringValue) parcel.readParcelable(State.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* renamed from: b */
            public final State[] newArray(int i2) {
                return new State[i2];
            }
        }

        public State(boolean z2, boolean z3, boolean z4, PaymentMethodState.CreditCard creditCard, String str, StringValue stringValue, boolean z5, boolean z6) {
            Intrinsics.i(str, "nickName");
            Intrinsics.i(stringValue, "nickNameError");
            this.f35774z = z2;
            this.f35772A = z3;
            this.f35773B = z4;
            this.C = creditCard;
            this.D = str;
            this.E = stringValue;
            this.F = z5;
            this.G = z6;
        }

        public static /* synthetic */ State b(State state, boolean z2, boolean z3, boolean z4, PaymentMethodState.CreditCard creditCard, String str, StringValue stringValue, boolean z5, boolean z6, int i2, Object obj) {
            State state2 = state;
            int i3 = i2;
            return state.a((i3 & 1) != 0 ? state2.f35774z : z2, (i3 & 2) != 0 ? state2.f35772A : z3, (i3 & 4) != 0 ? state2.f35773B : z4, (i3 & 8) != 0 ? state2.C : creditCard, (i3 & 16) != 0 ? state2.D : str, (i3 & 32) != 0 ? state2.E : stringValue, (i3 & 64) != 0 ? state2.F : z5, (i3 & 128) != 0 ? state2.G : z6);
        }

        public final State a(boolean z2, boolean z3, boolean z4, PaymentMethodState.CreditCard creditCard, String str, StringValue stringValue, boolean z5, boolean z6) {
            Intrinsics.i(str, "nickName");
            StringValue stringValue2 = stringValue;
            Intrinsics.i(stringValue2, "nickNameError");
            return new State(z2, z3, z4, creditCard, str, stringValue2, z5, z6);
        }

        public final boolean c() {
            return this.G;
        }

        public final boolean d() {
            return this.f35774z;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean e() {
            return this.f35773B;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return this.f35774z == state.f35774z && this.f35772A == state.f35772A && this.f35773B == state.f35773B && Intrinsics.d(this.C, state.C) && Intrinsics.d(this.D, state.D) && Intrinsics.d(this.E, state.E) && this.F == state.F && this.G == state.G;
        }

        public final boolean f() {
            return this.f35772A;
        }

        public final String g() {
            return this.D;
        }

        public final StringValue h() {
            return this.E;
        }

        public int hashCode() {
            int hashCode = ((((Boolean.hashCode(this.f35774z) * 31) + Boolean.hashCode(this.f35772A)) * 31) + Boolean.hashCode(this.f35773B)) * 31;
            PaymentMethodState.CreditCard creditCard = this.C;
            return ((((((((hashCode + (creditCard == null ? 0 : creditCard.hashCode())) * 31) + this.D.hashCode()) * 31) + this.E.hashCode()) * 31) + Boolean.hashCode(this.F)) * 31) + Boolean.hashCode(this.G);
        }

        public final PaymentMethodState.CreditCard i() {
            return this.C;
        }

        public final boolean j() {
            return this.F;
        }

        public String toString() {
            boolean z2 = this.f35774z;
            boolean z3 = this.f35772A;
            boolean z4 = this.f35773B;
            PaymentMethodState.CreditCard creditCard = this.C;
            String str = this.D;
            StringValue stringValue = this.E;
            boolean z5 = this.F;
            boolean z6 = this.G;
            return "State(initialLoading=" + z2 + ", loadingSaveChanges=" + z3 + ", loadingDeleteCard=" + z4 + ", paymentMethod=" + creditCard + ", nickName=" + str + ", nickNameError=" + stringValue + ", showDeleteDialog=" + z5 + ", hasNickname=" + z6 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeInt(this.f35774z ? 1 : 0);
            parcel.writeInt(this.f35772A ? 1 : 0);
            parcel.writeInt(this.f35773B ? 1 : 0);
            PaymentMethodState.CreditCard creditCard = this.C;
            if (creditCard == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                creditCard.writeToParcel(parcel, i2);
            }
            parcel.writeString(this.D);
            parcel.writeParcelable(this.E, i2);
            parcel.writeInt(this.F ? 1 : 0);
            parcel.writeInt(this.G ? 1 : 0);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ State(boolean r10, boolean r11, boolean r12, com.hansecom.abt.presentation.model.PaymentMethodState.CreditCard r13, java.lang.String r14, com.hansecom.abt.util.resourcesResolvers.StringValue r15, boolean r16, boolean r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
            /*
                r9 = this;
                r0 = r18
                r1 = r0 & 1
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r1 = r2
                goto L_0x000a
            L_0x0009:
                r1 = r10
            L_0x000a:
                r3 = r0 & 2
                if (r3 == 0) goto L_0x0010
                r3 = r2
                goto L_0x0011
            L_0x0010:
                r3 = r11
            L_0x0011:
                r4 = r0 & 4
                if (r4 == 0) goto L_0x0017
                r4 = r2
                goto L_0x0018
            L_0x0017:
                r4 = r12
            L_0x0018:
                r5 = r0 & 8
                if (r5 == 0) goto L_0x001e
                r5 = 0
                goto L_0x001f
            L_0x001e:
                r5 = r13
            L_0x001f:
                r6 = r0 & 16
                if (r6 == 0) goto L_0x0026
                java.lang.String r6 = ""
                goto L_0x0027
            L_0x0026:
                r6 = r14
            L_0x0027:
                r7 = r0 & 32
                if (r7 == 0) goto L_0x0032
                com.hansecom.abt.util.resourcesResolvers.StringValue$Companion r7 = com.hansecom.abt.util.resourcesResolvers.StringValue.Companion
                com.hansecom.abt.util.resourcesResolvers.StringValue r7 = r7.a()
                goto L_0x0033
            L_0x0032:
                r7 = r15
            L_0x0033:
                r8 = r0 & 64
                if (r8 == 0) goto L_0x0038
                goto L_0x003a
            L_0x0038:
                r2 = r16
            L_0x003a:
                r0 = r0 & 128(0x80, float:1.794E-43)
                if (r0 == 0) goto L_0x0040
                r0 = 1
                goto L_0x0042
            L_0x0040:
                r0 = r17
            L_0x0042:
                r10 = r9
                r11 = r1
                r12 = r3
                r13 = r4
                r14 = r5
                r15 = r6
                r16 = r7
                r17 = r2
                r18 = r0
                r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetails.State.<init>(boolean, boolean, boolean, com.hansecom.abt.presentation.model.PaymentMethodState$CreditCard, java.lang.String, com.hansecom.abt.util.resourcesResolvers.StringValue, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
