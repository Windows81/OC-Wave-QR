package com.hansecom.abt.presentation.biometric;

import android.content.Context;
import androidx.biometric.BiometricManager;
import androidx.biometric.BiometricPrompt;
import com.hansecom.abt.presentation.main.MainActivity;
import javax.inject.Singleton;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import v.a;

@Singleton
@Metadata
public final class BiometricHelper {

    /* renamed from: a  reason: collision with root package name */
    public final Context f34156a;

    /* renamed from: b  reason: collision with root package name */
    public final Lazy f34157b = LazyKt.b(new a(this));

    public BiometricHelper(Context context) {
        Intrinsics.i(context, "context");
        this.f34156a = context;
    }

    public static final BiometricManager d(BiometricHelper biometricHelper) {
        return BiometricManager.g(biometricHelper.f34156a);
    }

    public final BiometricManager b() {
        return (BiometricManager) this.f34157b.getValue();
    }

    public final boolean c() {
        return b().a(255) == 0 && b().a(32768) == 0;
    }

    public final void e(MainActivity mainActivity, String str, String str2, String str3, Function0 function0, Function1 function1) {
        Intrinsics.i(mainActivity, "activity");
        Intrinsics.i(str, "title");
        Intrinsics.i(str2, "subtitle");
        Intrinsics.i(str3, "description");
        Intrinsics.i(function0, "onSuccess");
        Intrinsics.i(function1, "onError");
        BiometricPrompt.PromptInfo a2 = new BiometricPrompt.PromptInfo.Builder().e(str).d(str2).c(str3).b(33023).a();
        Intrinsics.h(a2, "build(...)");
        new BiometricPrompt(mainActivity, new BiometricHelper$showPrompt$callback$1(function1, function0)).a(a2);
    }
}
