package com.hansecom.abt.ui.components.formFields;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: com.hansecom.abt.ui.components.formFields.ComposableSingletons$SearchTextFieldKt$lambda-2$1  reason: invalid class name */
public final class ComposableSingletons$SearchTextFieldKt$lambda2$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$SearchTextFieldKt$lambda2$1 f38301z = new ComposableSingletons$SearchTextFieldKt$lambda2$1();

    /* access modifiers changed from: private */
    public static final Unit e(String str) {
        Intrinsics.i(str, "it");
        return Unit.f40552a;
    }

    public final void c(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1094714859, i2, -1, "com.hansecom.abt.ui.components.formFields.ComposableSingletons$SearchTextFieldKt.lambda-2.<anonymous> (SearchTextField.kt:63)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            Modifier f2 = SizeKt.f(companion, 0.0f, 1, (Object) null);
            MeasurePolicy a2 = ColumnKt.a(Arrangement.f3739a.n(Dp.m((float) 24)), Alignment.f15444a.k(), composer, 6);
            int a3 = ComposablesKt.a(composer, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer, f2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.f17222h;
            Function0 a4 = companion2.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer.y(a4);
            } else {
                composer.K();
            }
            Composer b2 = Updater.b(composer);
            Updater.g(b2, a2, companion2.c());
            Updater.g(b2, I, companion2.e());
            Function2 b3 = companion2.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a3))) {
                b2.N(Integer.valueOf(a3));
                b2.A(Integer.valueOf(a3), b3);
            }
            Updater.g(b2, e2, companion2.d());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3815a;
            composer.X(470436298);
            Object g2 = composer.g();
            if (g2 == Composer.f14567a.a()) {
                g2 = new C();
                composer.N(g2);
            }
            composer.M();
            SearchTextFieldKt.c("nostrum", (Function1) g2, R.string.q4, SizeKt.h(companion, 0.0f, 1, (Object) null), false, (FocusRequester) null, 0, 0, composer, 27702, 224);
            composer.T();
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
