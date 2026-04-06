package com.hansecom.abt.presentation.nfc;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class NfcHelper_Factory implements Factory<NfcHelper> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f34216a;

    public static NfcHelper b(Context context) {
        return new NfcHelper(context);
    }

    /* renamed from: a */
    public NfcHelper get() {
        return b((Context) this.f34216a.get());
    }
}
