package com.hansecom.abt.presentation.screens.auth.register.userInfoStep;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.presentation.screens.auth.register.Register;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class RegisterUserInfoStepScreenKt$Preview$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Register.State.UserInfoStep f34575z;

    public static final Unit e(Register.Action.UserInfoStep userInfoStep) {
        Intrinsics.i(userInfoStep, "it");
        return Unit.f40552a;
    }

    public final void c(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1321155282, i2, -1, "com.hansecom.abt.presentation.screens.auth.register.userInfoStep.Preview.<anonymous> (RegisterUserInfoStepScreen.kt:233)");
            }
            Register.State.UserInfoStep userInfoStep = this.f34575z;
            composer.X(1154477790);
            Object g2 = composer.g();
            if (g2 == Composer.f14567a.a()) {
                g2 = new n();
                composer.N(g2);
            }
            composer.M();
            RegisterUserInfoStepScreenKt.r(userInfoStep, (Function1) g2, composer, 48);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        c((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
