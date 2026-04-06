package com.google.android.gms.wallet;

import android.accounts.Account;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class WalletConstants {

    /* renamed from: a  reason: collision with root package name */
    public static final Account f27331a = new Account("ACCOUNT_NO_WALLET", "com.google");

    @Retention(RetentionPolicy.SOURCE)
    public @interface BillingAddressFormat {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface CardClass {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface CardNetwork {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface PaymentCardRecognitionType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface PaymentMethod {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface PaymentMethodTokenizationType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TotalPriceStatus {
    }
}
