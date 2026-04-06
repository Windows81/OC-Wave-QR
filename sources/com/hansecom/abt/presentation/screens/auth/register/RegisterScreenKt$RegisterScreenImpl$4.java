package com.hansecom.abt.presentation.screens.auth.register;

import android.content.Context;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavHostController;
import com.hansecom.abt.util.ScaffoldImePaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class RegisterScreenKt$RegisterScreenImpl$4 implements Function3<PaddingValues, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ NavHostController f34399A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavBackStackEntry f34400z;

    public RegisterScreenKt$RegisterScreenImpl$4(NavBackStackEntry navBackStackEntry, NavHostController navHostController) {
        this.f34400z = navBackStackEntry;
        this.f34399A = navHostController;
    }

    public final void b(PaddingValues paddingValues, Composer composer, int i2) {
        Intrinsics.i(paddingValues, "innerPadding");
        if ((i2 & 6) == 0) {
            i2 |= composer.W(paddingValues) ? 4 : 2;
        }
        if ((i2 & 19) != 18 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(879470556, i2, -1, "com.hansecom.abt.presentation.screens.auth.register.RegisterScreenImpl.<anonymous> (RegisterScreen.kt:90)");
            }
            Modifier f2 = SizeKt.f(ScaffoldImePaddingKt.a(Modifier.f15489d, paddingValues), 0.0f, 1, (Object) null);
            Alignment e2 = Alignment.f15444a.e();
            NavBackStackEntry navBackStackEntry = this.f34400z;
            NavHostController navHostController = this.f34399A;
            MeasurePolicy g2 = BoxKt.g(e2, false);
            int a2 = ComposablesKt.a(composer, 0);
            CompositionLocalMap I = composer.I();
            Modifier e3 = ComposedModifierKt.e(composer, f2);
            ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
            Function0 a3 = companion.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer.y(a3);
            } else {
                composer.K();
            }
            Composer b2 = Updater.b(composer);
            Updater.g(b2, g2, companion.c());
            Updater.g(b2, I, companion.e());
            Function2 b3 = companion.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a2))) {
                b2.N(Integer.valueOf(a2));
                b2.A(Integer.valueOf(a2), b3);
            }
            Updater.g(b2, e3, companion.d());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
            RegisterNavigationKt.d(navBackStackEntry, navHostController, (Context) composer.C(AndroidCompositionLocals_androidKt.g()), composer, 0);
            composer.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((PaddingValues) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
