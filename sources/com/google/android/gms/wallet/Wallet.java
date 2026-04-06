package com.google.android.gms.wallet;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.wallet.zzab;
import com.google.android.gms.internal.wallet.zzr;
import com.google.android.gms.internal.wallet.zzz;
import com.google.android.gms.wallet.wobs.WalletObjects;
import java.util.Locale;

public final class Wallet {

    /* renamed from: a  reason: collision with root package name */
    public static final Api f27319a;

    /* renamed from: b  reason: collision with root package name */
    public static final Api.ClientKey f27320b;

    /* renamed from: c  reason: collision with root package name */
    public static final Api.AbstractClientBuilder f27321c;

    /* renamed from: d  reason: collision with root package name */
    public static final WalletObjects f27322d = new zzab();

    /* renamed from: e  reason: collision with root package name */
    public static final zzr f27323e = new zzr();

    /* renamed from: f  reason: collision with root package name */
    public static final zzz f27324f = new zzz();

    public static final class WalletOptions implements Api.ApiOptions.HasAccountOptions {

        /* renamed from: A  reason: collision with root package name */
        public final int f27325A;

        /* renamed from: B  reason: collision with root package name */
        public final Account f27326B;
        public final boolean C;

        /* renamed from: z  reason: collision with root package name */
        public final int f27327z;

        public static final class Builder {

            /* renamed from: a  reason: collision with root package name */
            public int f27328a = 3;

            /* renamed from: b  reason: collision with root package name */
            public int f27329b = 1;

            /* renamed from: c  reason: collision with root package name */
            public boolean f27330c = true;

            public WalletOptions a() {
                return new WalletOptions(this);
            }

            public Builder b(int i2) {
                if (i2 != 0) {
                    if (i2 == 0) {
                        i2 = 0;
                    } else if (!(i2 == 2 || i2 == 1 || i2 == 23 || i2 == 3)) {
                        throw new IllegalArgumentException(String.format(Locale.US, "Invalid environment value %d", new Object[]{Integer.valueOf(i2)}));
                    }
                }
                this.f27328a = i2;
                return this;
            }
        }

        public WalletOptions(Builder builder) {
            this.f27327z = builder.f27328a;
            this.f27325A = builder.f27329b;
            this.C = builder.f27330c;
            this.f27326B = null;
        }

        public Account F() {
            return null;
        }

        public boolean equals(Object obj) {
            if (obj instanceof WalletOptions) {
                WalletOptions walletOptions = (WalletOptions) obj;
                return Objects.a(Integer.valueOf(this.f27327z), Integer.valueOf(walletOptions.f27327z)) && Objects.a(Integer.valueOf(this.f27325A), Integer.valueOf(walletOptions.f27325A)) && Objects.a((Object) null, (Object) null) && Objects.a(Boolean.valueOf(this.C), Boolean.valueOf(walletOptions.C));
            }
        }

        public int hashCode() {
            return Objects.b(Integer.valueOf(this.f27327z), Integer.valueOf(this.f27325A), null, Boolean.valueOf(this.C));
        }
    }

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f27320b = clientKey;
        zzap zzap = new zzap();
        f27321c = zzap;
        f27319a = new Api("Wallet.API", zzap, clientKey);
    }

    public static PaymentsClient a(Context context, WalletOptions walletOptions) {
        return new PaymentsClient(context, walletOptions);
    }
}
