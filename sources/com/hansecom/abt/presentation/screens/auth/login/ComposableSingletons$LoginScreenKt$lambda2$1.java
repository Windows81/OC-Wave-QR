package com.hansecom.abt.presentation.screens.auth.login;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.presentation.screens.auth.login.Login;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.Flow;

@Metadata
/* renamed from: com.hansecom.abt.presentation.screens.auth.login.ComposableSingletons$LoginScreenKt$lambda-2$1  reason: invalid class name */
public final class ComposableSingletons$LoginScreenKt$lambda2$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$LoginScreenKt$lambda2$1 f34286z = new ComposableSingletons$LoginScreenKt$lambda2$1();

    /* access modifiers changed from: private */
    public static final Unit e() {
        return Unit.f40552a;
    }

    public final void c(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if ((i3 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1790483697, i3, -1, "com.hansecom.abt.presentation.screens.auth.login.ComposableSingletons$LoginScreenKt.lambda-2.<anonymous> (LoginScreen.kt:272)");
            }
            Login.State state = new Login.State("iaroslav.kamnev@hansecom.com", (StringValue) null, "Hanse123+", (StringValue) null, false, false, true, false, 10, (DefaultConstructorMarker) null);
            composer2.X(1852170875);
            Object g2 = composer.g();
            if (g2 == Composer.f14567a.a()) {
                g2 = new b();
                composer2.N(g2);
            }
            composer.M();
            LoginScreenKt.o(state, (Function1) null, (Flow) null, (Function0) null, (Function1) null, (Function0) null, (Function0) null, (Function0) g2, composer, 12582912, 126);
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
