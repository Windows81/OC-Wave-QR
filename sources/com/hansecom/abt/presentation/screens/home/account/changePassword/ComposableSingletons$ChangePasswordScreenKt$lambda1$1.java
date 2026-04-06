package com.hansecom.abt.presentation.screens.home.account.changePassword;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePassword;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
/* renamed from: com.hansecom.abt.presentation.screens.home.account.changePassword.ComposableSingletons$ChangePasswordScreenKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$ChangePasswordScreenKt$lambda1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$ChangePasswordScreenKt$lambda1$1 f35313z = new ComposableSingletons$ChangePasswordScreenKt$lambda1$1();

    public static final Unit g(ChangePassword.Action action) {
        Intrinsics.i(action, "it");
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit h() {
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit i() {
        return Unit.f40552a;
    }

    public final void f(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if ((i3 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(2064492871, i3, -1, "com.hansecom.abt.presentation.screens.home.account.changePassword.ComposableSingletons$ChangePasswordScreenKt.lambda-1.<anonymous> (ChangePasswordScreen.kt:178)");
            }
            ChangePassword.State state = new ChangePassword.State((String) null, (String) null, (StringValue) null, false, (String) null, false, false, (String) null, false, false, false, 2047, (DefaultConstructorMarker) null);
            Flow A2 = FlowKt.A();
            composer2.X(1284473911);
            Object g2 = composer.g();
            Composer.Companion companion = Composer.f14567a;
            if (g2 == companion.a()) {
                g2 = new y();
                composer2.N(g2);
            }
            Function1 function1 = (Function1) g2;
            composer.M();
            composer2.X(1284473111);
            Object g3 = composer.g();
            if (g3 == companion.a()) {
                g3 = new z();
                composer2.N(g3);
            }
            Function0 function0 = (Function0) g3;
            composer.M();
            composer2.X(1284475831);
            Object g4 = composer.g();
            if (g4 == companion.a()) {
                g4 = new A();
                composer2.N(g4);
            }
            composer.M();
            ChangePasswordScreenKt.h(state, function1, A2, function0, (Function0) g4, composer, 27696, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        f((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
