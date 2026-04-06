package com.hansecom.abt.ui.components.abtButton;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
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
import com.hansecom.abt.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: com.hansecom.abt.ui.components.abtButton.ComposableSingletons$AbtIconButtonKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$AbtIconButtonKt$lambda1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$AbtIconButtonKt$lambda1$1 f37906z = new ComposableSingletons$AbtIconButtonKt$lambda1$1();

    public static final Unit f() {
        return Unit.f40552a;
    }

    public static final Unit g() {
        return Unit.f40552a;
    }

    public final void e(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-147087194, i2, -1, "com.hansecom.abt.ui.components.abtButton.ComposableSingletons$AbtIconButtonKt.lambda-1.<anonymous> (AbtIconButton.kt:75)");
            }
            Modifier h2 = SizeKt.h(Modifier.f15489d, 0.0f, 1, (Object) null);
            MeasurePolicy b2 = RowKt.b(Arrangement.f3739a.f(), Alignment.f15444a.l(), composer, 0);
            int a2 = ComposablesKt.a(composer, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer, h2);
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
            Composer b3 = Updater.b(composer);
            Updater.g(b3, b2, companion.c());
            Updater.g(b3, I, companion.e());
            Function2 b4 = companion.b();
            if (b3.n() || !Intrinsics.d(b3.g(), Integer.valueOf(a2))) {
                b3.N(Integer.valueOf(a2));
                b3.A(Integer.valueOf(a2), b4);
            }
            Updater.g(b3, e2, companion.d());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f4150a;
            composer.X(1237569369);
            Object g2 = composer.g();
            Composer.Companion companion2 = Composer.f14567a;
            if (g2 == companion2.a()) {
                g2 = new m();
                composer.N(g2);
            }
            composer.M();
            AbtIconButtonKt.b((Function0) g2, PainterResources_androidKt.c(R.drawable.f33014p, composer, 0), "", (Modifier) null, false, composer, 390, 24);
            Painter c2 = PainterResources_androidKt.c(R.drawable.f33014p, composer, 0);
            composer.X(1237576089);
            Object g3 = composer.g();
            if (g3 == companion2.a()) {
                g3 = new n();
                composer.N(g3);
            }
            composer.M();
            AbtIconButtonKt.b((Function0) g3, c2, "", (Modifier) null, false, composer, 24966, 8);
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
