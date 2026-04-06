package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;

public final class PaymentDataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentDataRequest> CREATOR = new zzac();

    /* renamed from: A  reason: collision with root package name */
    public boolean f27293A;

    /* renamed from: B  reason: collision with root package name */
    public CardRequirements f27294B;
    public boolean C;
    public ShippingAddressRequirements D;
    public ArrayList E;
    public PaymentMethodTokenizationParameters F;
    public TransactionInfo G;
    public boolean H;
    public String I;
    public byte[] J;
    public Bundle K;

    /* renamed from: z  reason: collision with root package name */
    public boolean f27295z;

    @Deprecated
    public final class Builder {
        public /* synthetic */ Builder(zzab zzab) {
        }

        public PaymentDataRequest a() {
            PaymentDataRequest paymentDataRequest = PaymentDataRequest.this;
            if (paymentDataRequest.I == null && paymentDataRequest.J == null) {
                Preconditions.n(paymentDataRequest.E, "Allowed payment methods must be set! You can set it through addAllowedPaymentMethod() or addAllowedPaymentMethods() in the PaymentDataRequest Builder.");
                Preconditions.n(PaymentDataRequest.this.f27294B, "Card requirements must be set!");
                PaymentDataRequest paymentDataRequest2 = PaymentDataRequest.this;
                if (paymentDataRequest2.F != null) {
                    Preconditions.n(paymentDataRequest2.G, "Transaction info must be set if paymentMethodTokenizationParameters is set!");
                }
            }
            return PaymentDataRequest.this;
        }
    }

    public PaymentDataRequest() {
        this.H = true;
    }

    public static PaymentDataRequest H(String str) {
        Builder Q = Q();
        PaymentDataRequest.this.I = (String) Preconditions.n(str, "paymentDataRequestJson cannot be null!");
        return Q.a();
    }

    public static Builder Q() {
        return new Builder((zzab) null);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.c(parcel, 1, this.f27295z);
        SafeParcelWriter.c(parcel, 2, this.f27293A);
        SafeParcelWriter.v(parcel, 3, this.f27294B, i2, false);
        SafeParcelWriter.c(parcel, 4, this.C);
        SafeParcelWriter.v(parcel, 5, this.D, i2, false);
        SafeParcelWriter.p(parcel, 6, this.E, false);
        SafeParcelWriter.v(parcel, 7, this.F, i2, false);
        SafeParcelWriter.v(parcel, 8, this.G, i2, false);
        SafeParcelWriter.c(parcel, 9, this.H);
        SafeParcelWriter.w(parcel, 10, this.I, false);
        SafeParcelWriter.e(parcel, 11, this.K, false);
        SafeParcelWriter.g(parcel, 12, this.J, false);
        SafeParcelWriter.b(parcel, a2);
    }

    public PaymentDataRequest(boolean z2, boolean z3, CardRequirements cardRequirements, boolean z4, ShippingAddressRequirements shippingAddressRequirements, ArrayList arrayList, PaymentMethodTokenizationParameters paymentMethodTokenizationParameters, TransactionInfo transactionInfo, boolean z5, String str, byte[] bArr, Bundle bundle) {
        this.f27295z = z2;
        this.f27293A = z3;
        this.f27294B = cardRequirements;
        this.C = z4;
        this.D = shippingAddressRequirements;
        this.E = arrayList;
        this.F = paymentMethodTokenizationParameters;
        this.G = transactionInfo;
        this.H = z5;
        this.I = str;
        this.J = bArr;
        this.K = bundle;
    }
}
