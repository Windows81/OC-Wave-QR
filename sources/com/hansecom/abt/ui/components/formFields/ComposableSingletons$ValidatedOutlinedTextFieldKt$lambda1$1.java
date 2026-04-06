package com.hansecom.abt.ui.components.formFields;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.ContentType;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: com.hansecom.abt.ui.components.formFields.ComposableSingletons$ValidatedOutlinedTextFieldKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$ValidatedOutlinedTextFieldKt$lambda1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$ValidatedOutlinedTextFieldKt$lambda1$1 f38311z = new ComposableSingletons$ValidatedOutlinedTextFieldKt$lambda1$1();

    public static final Unit f(String str) {
        Intrinsics.i(str, "it");
        return Unit.f40552a;
    }

    public static final Unit g(String str) {
        Intrinsics.i(str, "it");
        return Unit.f40552a;
    }

    public final void e(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if ((i3 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(463545665, i3, -1, "com.hansecom.abt.ui.components.formFields.ComposableSingletons$ValidatedOutlinedTextFieldKt.lambda-1.<anonymous> (ValidatedOutlinedTextField.kt:73)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            Modifier f2 = SizeKt.f(companion, 0.0f, 1, (Object) null);
            MeasurePolicy a2 = ColumnKt.a(Arrangement.f3739a.n(Dp.m((float) 24)), Alignment.f15444a.k(), composer2, 6);
            int a3 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer2, f2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.f17222h;
            Function0 a4 = companion2.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer2.y(a4);
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
            int i4 = R.string.q4;
            Modifier h2 = SizeKt.h(companion, 0.0f, 1, (Object) null);
            composer2.X(-477234123);
            Object g2 = composer.g();
            Composer.Companion companion3 = Composer.f14567a;
            if (g2 == companion3.a()) {
                g2 = new L();
                composer2.N(g2);
            }
            composer.M();
            Modifier.Companion companion4 = companion;
            ValidatedOutlinedTextFieldKt.e("nostrum", (Function1) g2, i4, "fermentum", h2, "honestatis", false, false, (FocusRequester) null, 0, 0, 0, (KeyboardActions) null, (VisualTransformation) null, (Function2) null, (ContentType) null, composer, 14380086, 0, 65280);
            int i5 = R.string.q4;
            Modifier h3 = SizeKt.h(companion4, 0.0f, 1, (Object) null);
            Composer composer3 = composer;
            composer3.X(-477220171);
            Object g3 = composer.g();
            if (g3 == companion3.a()) {
                g3 = new M();
                composer3.N(g3);
            }
            composer.M();
            ValidatedOutlinedTextFieldKt.e("", (Function1) g3, i5, "fermentum", h3, "honestatis", false, false, (FocusRequester) null, 0, 0, 0, (KeyboardActions) null, (VisualTransformation) null, (Function2) null, (ContentType) null, composer, 14380086, 0, 65280);
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
        e((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
