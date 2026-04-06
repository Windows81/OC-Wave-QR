package com.hansecom.abt.presentation.biometric;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class BiometricHelper_Factory implements Factory<BiometricHelper> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f34161a;

    public static BiometricHelper b(Context context) {
        return new BiometricHelper(context);
    }

    /* renamed from: a */
    public BiometricHelper get() {
        return b((Context) this.f34161a.get());
    }
}
