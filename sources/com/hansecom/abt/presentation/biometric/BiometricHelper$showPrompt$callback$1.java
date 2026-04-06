package com.hansecom.abt.presentation.biometric;

import androidx.biometric.BiometricPrompt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class BiometricHelper$showPrompt$callback$1 extends BiometricPrompt.AuthenticationCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Function1 f34158a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Function0 f34159b;

    public BiometricHelper$showPrompt$callback$1(Function1 function1, Function0 function0) {
        this.f34158a = function1;
        this.f34159b = function0;
    }

    public void a(int i2, CharSequence charSequence) {
        Intrinsics.i(charSequence, "errString");
        this.f34158a.invoke(charSequence.toString());
    }

    public void b() {
        this.f34158a.invoke((Object) null);
    }

    public void c(BiometricPrompt.AuthenticationResult authenticationResult) {
        Intrinsics.i(authenticationResult, "result");
        this.f34159b.invoke();
    }
}
