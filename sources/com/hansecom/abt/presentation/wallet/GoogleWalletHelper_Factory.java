package com.hansecom.abt.presentation.wallet;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class GoogleWalletHelper_Factory implements Factory<GoogleWalletHelper> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f37854a;

    public static GoogleWalletHelper b(Context context) {
        return new GoogleWalletHelper(context);
    }

    /* renamed from: a */
    public GoogleWalletHelper get() {
        return b((Context) this.f37854a.get());
    }
}
