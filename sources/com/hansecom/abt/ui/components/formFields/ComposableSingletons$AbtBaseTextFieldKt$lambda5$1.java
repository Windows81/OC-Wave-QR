package com.hansecom.abt.ui.components.formFields;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: com.hansecom.abt.ui.components.formFields.ComposableSingletons$AbtBaseTextFieldKt$lambda-5$1  reason: invalid class name */
public final class ComposableSingletons$AbtBaseTextFieldKt$lambda5$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$AbtBaseTextFieldKt$lambda5$1 f38279z = new ComposableSingletons$AbtBaseTextFieldKt$lambda5$1();

    public static final Unit h(String str) {
        Intrinsics.i(str, "it");
        return Unit.f40552a;
    }

    public static final Unit i(String str) {
        Intrinsics.i(str, "it");
        return Unit.f40552a;
    }

    public static final Unit k(String str) {
        Intrinsics.i(str, "it");
        return Unit.f40552a;
    }

    public static final Unit p(String str) {
        Intrinsics.i(str, "it");
        return Unit.f40552a;
    }

    public final void g(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if ((i3 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1755052486, i3, -1, "com.hansecom.abt.ui.components.formFields.ComposableSingletons$AbtBaseTextFieldKt.lambda-5.<anonymous> (AbtBaseTextField.kt:204)");
            }
            float f2 = (float) 16;
            Arrangement.HorizontalOrVertical n2 = Arrangement.f3739a.n(Dp.m(f2));
            Modifier i4 = PaddingKt.i(Modifier.f15489d, Dp.m(f2));
            MeasurePolicy a2 = ColumnKt.a(n2, Alignment.f15444a.k(), composer2, 6);
            int a3 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer2, i4);
            ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
            Function0 a4 = companion.a();
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
            Updater.g(b2, a2, companion.c());
            Updater.g(b2, I, companion.e());
            Function2 b3 = companion.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a3))) {
                b2.N(Integer.valueOf(a3));
                b2.A(Integer.valueOf(a3), b3);
            }
            Updater.g(b2, e2, companion.d());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3815a;
            composer2.X(-653941363);
            Object g2 = composer.g();
            Composer.Companion companion2 = Composer.f14567a;
            if (g2 == companion2.a()) {
                g2 = new C0646m();
                composer2.N(g2);
            }
            composer.M();
            AbtBaseTextFieldKt.c("Hello", (Function1) g2, (Modifier) null, false, false, (TextStyle) null, (Function2) null, (Function2) null, (Function2) null, (Function2) null, (Function2) null, (Function2) null, (Function2) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, (PaddingValues) null, 0.0f, 0.0f, 0.0f, 0.0f, (Function0) null, composer, 54, 0, 0, 536870908);
            Composer composer3 = composer;
            composer3.X(-653937715);
            Object g3 = composer.g();
            if (g3 == companion2.a()) {
                g3 = new C0647n();
                composer3.N(g3);
            }
            composer.M();
            ComposableSingletons$AbtBaseTextFieldKt composableSingletons$AbtBaseTextFieldKt = ComposableSingletons$AbtBaseTextFieldKt.f38269a;
            AbtBaseTextFieldKt.c("Hello", (Function1) g3, (Modifier) null, false, false, (TextStyle) null, composableSingletons$AbtBaseTextFieldKt.a(), (Function2) null, (Function2) null, (Function2) null, (Function2) null, (Function2) null, composableSingletons$AbtBaseTextFieldKt.b(), false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, (PaddingValues) null, 0.0f, 0.0f, 0.0f, 0.0f, (Function0) null, composer, 1572918, 384, 0, 536866748);
            Composer composer4 = composer;
            composer4.X(-653931059);
            Object g4 = composer.g();
            if (g4 == companion2.a()) {
                g4 = new C0648o();
                composer4.N(g4);
            }
            composer.M();
            AbtBaseTextFieldKt.c("Hello", (Function1) g4, (Modifier) null, false, false, (TextStyle) null, composableSingletons$AbtBaseTextFieldKt.c(), (Function2) null, (Function2) null, (Function2) null, (Function2) null, (Function2) null, composableSingletons$AbtBaseTextFieldKt.d(), true, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, (PaddingValues) null, 0.0f, 0.0f, 0.0f, 0.0f, (Function0) null, composer, 1572918, 3456, 0, 536858556);
            Composer composer5 = composer;
            composer5.X(-653923347);
            Object g5 = composer.g();
            if (g5 == companion2.a()) {
                g5 = new C0649p();
                composer5.N(g5);
            }
            composer.M();
            PaddingValues b4 = PaddingKt.b(Dp.m((float) 8), Dp.m((float) 4));
            Dp.Companion companion3 = Dp.f19144A;
            AbtBaseTextFieldKt.c("12345", (Function1) g5, (Modifier) null, false, false, (TextStyle) null, (Function2) null, (Function2) null, (Function2) null, (Function2) null, (Function2) null, (Function2) null, (Function2) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, b4, companion3.c(), companion3.c(), 0.0f, 0.0f, (Function0) null, composer, 54, 0, 224256, 478150652);
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
        g((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
