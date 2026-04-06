package com.hansecom.abt.ui.components.abtButton;

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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: com.hansecom.abt.ui.components.abtButton.ComposableSingletons$AbtSideButtonKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$AbtSideButtonKt$lambda1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$AbtSideButtonKt$lambda1$1 f37910z = new ComposableSingletons$AbtSideButtonKt$lambda1$1();

    /* access modifiers changed from: private */
    public static final Unit f() {
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit g() {
        return Unit.f40552a;
    }

    public final void e(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if ((i3 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1037585645, i3, -1, "com.hansecom.abt.ui.components.abtButton.ComposableSingletons$AbtSideButtonKt.lambda-1.<anonymous> (AbtSideButton.kt:89)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            float f2 = (float) 16;
            Modifier i4 = PaddingKt.i(companion, Dp.m(f2));
            MeasurePolicy a2 = ColumnKt.a(Arrangement.f3739a.n(Dp.m(f2)), Alignment.f15444a.k(), composer, 6);
            int a3 = ComposablesKt.a(composer, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer, i4);
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
            Modifier h2 = SizeKt.h(companion, 0.0f, 1, (Object) null);
            int i5 = R.drawable.f32998B;
            composer.X(-1172377734);
            Object g2 = composer.g();
            Composer.Companion companion3 = Composer.f14567a;
            if (g2 == companion3.a()) {
                g2 = new o();
                composer.N(g2);
            }
            composer.M();
            AbtSideButtonKt.c((Function0) g2, h2, (AbtButtonState) null, "Button", Integer.valueOf(i5), composer, 3126, 4);
            Modifier h3 = SizeKt.h(companion, 0.0f, 1, (Object) null);
            AbtButtonState abtButtonState = AbtButtonState.Disabled;
            int i6 = R.drawable.f32998B;
            composer.X(-1172369702);
            Object g3 = composer.g();
            if (g3 == companion3.a()) {
                g3 = new p();
                composer.N(g3);
            }
            composer.M();
            AbtSideButtonKt.c((Function0) g3, h3, abtButtonState, "Button", Integer.valueOf(i6), composer, 3510, 0);
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
