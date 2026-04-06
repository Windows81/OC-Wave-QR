package com.hansecom.abt.presentation.screens.home.faremedia.autoload;

import android.os.Parcel;
import android.os.Parcelable;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AutoloadState implements Parcelable {
    public static final Parcelable.Creator<AutoloadState> CREATOR = new Creator();

    /* renamed from: A  reason: collision with root package name */
    public final BigDecimal f36238A;

    /* renamed from: B  reason: collision with root package name */
    public final BigDecimal f36239B;
    public final boolean C;
    public final PaymentMethodState.CreditCard D;
    public final PaymentMethodState.CreditCard E;

    /* renamed from: z  reason: collision with root package name */
    public final long f36240z;

    @Metadata
    public static final class Creator implements Parcelable.Creator<AutoloadState> {
        /* renamed from: a */
        public final AutoloadState createFromParcel(Parcel parcel) {
            Intrinsics.i(parcel, "parcel");
            long readLong = parcel.readLong();
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            boolean z2 = parcel.readInt() != 0;
            PaymentMethodState.CreditCard creditCard = null;
            PaymentMethodState.CreditCard createFromParcel = parcel.readInt() == 0 ? null : PaymentMethodState.CreditCard.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                creditCard = PaymentMethodState.CreditCard.CREATOR.createFromParcel(parcel);
            }
            return new AutoloadState(readLong, bigDecimal, bigDecimal2, z2, createFromParcel, creditCard);
        }

        /* renamed from: b */
        public final AutoloadState[] newArray(int i2) {
            return new AutoloadState[i2];
        }
    }

    public AutoloadState(long j2, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z2, PaymentMethodState.CreditCard creditCard, PaymentMethodState.CreditCard creditCard2) {
        Intrinsics.i(bigDecimal, "autoloadAmount");
        Intrinsics.i(bigDecimal2, "balanceThreshold");
        this.f36240z = j2;
        this.f36238A = bigDecimal;
        this.f36239B = bigDecimal2;
        this.C = z2;
        this.D = creditCard;
        this.E = creditCard2;
    }

    public static /* synthetic */ AutoloadState b(AutoloadState autoloadState, long j2, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z2, PaymentMethodState.CreditCard creditCard, PaymentMethodState.CreditCard creditCard2, int i2, Object obj) {
        AutoloadState autoloadState2 = autoloadState;
        return autoloadState.a((i2 & 1) != 0 ? autoloadState2.f36240z : j2, (i2 & 2) != 0 ? autoloadState2.f36238A : bigDecimal, (i2 & 4) != 0 ? autoloadState2.f36239B : bigDecimal2, (i2 & 8) != 0 ? autoloadState2.C : z2, (i2 & 16) != 0 ? autoloadState2.D : creditCard, (i2 & 32) != 0 ? autoloadState2.E : creditCard2);
    }

    public final AutoloadState a(long j2, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z2, PaymentMethodState.CreditCard creditCard, PaymentMethodState.CreditCard creditCard2) {
        Intrinsics.i(bigDecimal, "autoloadAmount");
        Intrinsics.i(bigDecimal2, "balanceThreshold");
        return new AutoloadState(j2, bigDecimal, bigDecimal2, z2, creditCard, creditCard2);
    }

    public final BigDecimal c() {
        return this.f36238A;
    }

    public final PaymentMethodState.CreditCard d() {
        return this.E;
    }

    public final int describeContents() {
        return 0;
    }

    public final BigDecimal e() {
        return this.f36239B;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoloadState)) {
            return false;
        }
        AutoloadState autoloadState = (AutoloadState) obj;
        return this.f36240z == autoloadState.f36240z && Intrinsics.d(this.f36238A, autoloadState.f36238A) && Intrinsics.d(this.f36239B, autoloadState.f36239B) && this.C == autoloadState.C && Intrinsics.d(this.D, autoloadState.D) && Intrinsics.d(this.E, autoloadState.E);
    }

    public final long f() {
        return this.f36240z;
    }

    public final PaymentMethodState.CreditCard g() {
        return this.D;
    }

    public final boolean h() {
        return this.C;
    }

    public int hashCode() {
        int hashCode = ((((((Long.hashCode(this.f36240z) * 31) + this.f36238A.hashCode()) * 31) + this.f36239B.hashCode()) * 31) + Boolean.hashCode(this.C)) * 31;
        PaymentMethodState.CreditCard creditCard = this.D;
        int i2 = 0;
        int hashCode2 = (hashCode + (creditCard == null ? 0 : creditCard.hashCode())) * 31;
        PaymentMethodState.CreditCard creditCard2 = this.E;
        if (creditCard2 != null) {
            i2 = creditCard2.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        long j2 = this.f36240z;
        BigDecimal bigDecimal = this.f36238A;
        BigDecimal bigDecimal2 = this.f36239B;
        boolean z2 = this.C;
        PaymentMethodState.CreditCard creditCard = this.D;
        PaymentMethodState.CreditCard creditCard2 = this.E;
        return "AutoloadState(id=" + j2 + ", autoloadAmount=" + bigDecimal + ", balanceThreshold=" + bigDecimal2 + ", isPaused=" + z2 + ", paymentMethod=" + creditCard + ", backupPaymentMethod=" + creditCard2 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        Intrinsics.i(parcel, "dest");
        parcel.writeLong(this.f36240z);
        parcel.writeSerializable(this.f36238A);
        parcel.writeSerializable(this.f36239B);
        parcel.writeInt(this.C ? 1 : 0);
        PaymentMethodState.CreditCard creditCard = this.D;
        if (creditCard == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            creditCard.writeToParcel(parcel, i2);
        }
        PaymentMethodState.CreditCard creditCard2 = this.E;
        if (creditCard2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        creditCard2.writeToParcel(parcel, i2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AutoloadState(long j2, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z2, PaymentMethodState.CreditCard creditCard, PaymentMethodState.CreditCard creditCard2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, bigDecimal, bigDecimal2, z2, (i2 & 16) != 0 ? null : creditCard, (i2 & 32) != 0 ? null : creditCard2);
    }
}
