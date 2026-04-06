package com.hansecom.abt.ui.components.formFields;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
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
import androidx.compose.ui.res.StringResources_androidKt;
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
/* renamed from: com.hansecom.abt.ui.components.formFields.ComposableSingletons$ValueFieldKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$ValueFieldKt$lambda1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$ValueFieldKt$lambda1$1 f38315z = new ComposableSingletons$ValueFieldKt$lambda1$1();

    public static final Unit g(String str) {
        Intrinsics.i(str, "it");
        return Unit.f40552a;
    }

    public static final Unit h(String str) {
        Intrinsics.i(str, "it");
        return Unit.f40552a;
    }

    public static final Unit i(String str) {
        Intrinsics.i(str, "it");
        return Unit.f40552a;
    }

    public final void f(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if ((i3 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(938141562, i3, -1, "com.hansecom.abt.ui.components.formFields.ComposableSingletons$ValueFieldKt.lambda-1.<anonymous> (ValueField.kt:214)");
            }
            float f2 = (float) 16;
            Modifier i4 = PaddingKt.i(Modifier.f15489d, Dp.m(f2));
            MeasurePolicy a2 = ColumnKt.a(Arrangement.f3739a.n(Dp.m(f2)), Alignment.f15444a.k(), composer2, 6);
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
            composer2.X(-154205111);
            Object g2 = composer.g();
            Composer.Companion companion2 = Composer.f14567a;
            if (g2 == companion2.a()) {
                g2 = new N();
                composer2.N(g2);
            }
            composer.M();
            ValueFieldKt.b("0", (Function1) g2, (Modifier) null, StringResources_androidKt.b(R.string.t0, composer2, 0), (String) null, false, (VisualTransformation) null, (FocusRequester) null, 0, true, composer, 805503030, 468);
            composer2.X(-154196407);
            Object g3 = composer.g();
            if (g3 == companion2.a()) {
                g3 = new O();
                composer2.N(g3);
            }
            composer.M();
            ValueFieldKt.b("1000", (Function1) g3, (Modifier) null, StringResources_androidKt.b(R.string.t0, composer2, 0), StringResources_androidKt.b(R.string.n0, composer2, 0), false, (VisualTransformation) null, (FocusRequester) null, 0, true, composer, 805306422, 484);
            composer2.X(-154186167);
            Object g4 = composer.g();
            if (g4 == companion2.a()) {
                g4 = new P();
                composer2.N(g4);
            }
            composer.M();
            ValueFieldKt.b("1000", (Function1) g4, (Modifier) null, StringResources_androidKt.b(R.string.t0, composer2, 0), (String) null, false, (VisualTransformation) null, (FocusRequester) null, 0, false, composer, 805306422, 500);
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
