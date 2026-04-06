package com.hansecom.abt.ui.components.formFields;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: com.hansecom.abt.ui.components.formFields.ComposableSingletons$ClickableOutlinedTextFieldKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$ClickableOutlinedTextFieldKt$lambda1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$ClickableOutlinedTextFieldKt$lambda1$1 f38292z = new ComposableSingletons$ClickableOutlinedTextFieldKt$lambda1$1();

    public static final Unit g() {
        return Unit.f40552a;
    }

    public static final Unit h() {
        return Unit.f40552a;
    }

    public static final Unit i() {
        return Unit.f40552a;
    }

    public final void f(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if ((i3 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-344809798, i3, -1, "com.hansecom.abt.ui.components.formFields.ComposableSingletons$ClickableOutlinedTextFieldKt.lambda-1.<anonymous> (ClickableOutlinedTextField.kt:107)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            float f2 = (float) 16;
            Modifier i4 = PaddingKt.i(companion, Dp.m(f2));
            MeasurePolicy a2 = ColumnKt.a(Arrangement.f3739a.n(Dp.m(f2)), Alignment.f15444a.k(), composer2, 6);
            int a3 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer2, i4);
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
            Modifier h2 = SizeKt.h(companion, 0.0f, 1, (Object) null);
            Painter c2 = PainterResources_androidKt.c(R.drawable.f33007i, composer2, 0);
            composer2.X(-578871863);
            Object g2 = composer.g();
            Composer.Companion companion3 = Composer.f14567a;
            if (g2 == companion3.a()) {
                g2 = new C0652t();
                composer2.N(g2);
            }
            composer.M();
            ClickableOutlinedTextFieldKt.e("", (Function0) g2, "Label", h2, false, (String) null, (String) null, c2, (Function0) null, composer, 3510, 368);
            Modifier h3 = SizeKt.h(companion, 0.0f, 1, (Object) null);
            Composer composer3 = composer;
            Painter c3 = PainterResources_androidKt.c(R.drawable.f33007i, composer3, 0);
            composer3.X(-578862999);
            Object g3 = composer.g();
            if (g3 == companion3.a()) {
                g3 = new C0653u();
                composer3.N(g3);
            }
            composer.M();
            ClickableOutlinedTextFieldKt.e("Value", (Function0) g3, "Label", h3, false, (String) null, (String) null, c3, (Function0) null, composer, 3510, 368);
            Modifier h4 = SizeKt.h(companion, 0.0f, 1, (Object) null);
            Composer composer4 = composer;
            Painter c4 = PainterResources_androidKt.c(R.drawable.f33007i, composer4, 0);
            composer4.X(-578853079);
            Object g4 = composer.g();
            if (g4 == companion3.a()) {
                g4 = new C0654v();
                composer4.N(g4);
            }
            composer.M();
            ClickableOutlinedTextFieldKt.e("Value", (Function0) g4, "Label", h4, false, (String) null, "Error", c4, (Function0) null, composer, 1576374, 304);
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
        f((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
