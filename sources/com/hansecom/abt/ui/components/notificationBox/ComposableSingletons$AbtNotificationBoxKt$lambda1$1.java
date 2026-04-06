package com.hansecom.abt.ui.components.notificationBox;

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
/* renamed from: com.hansecom.abt.ui.components.notificationBox.ComposableSingletons$AbtNotificationBoxKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$AbtNotificationBoxKt$lambda1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$AbtNotificationBoxKt$lambda1$1 f38571z = new ComposableSingletons$AbtNotificationBoxKt$lambda1$1();

    public static final Unit e() {
        return Unit.f40552a;
    }

    public final void c(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if ((i3 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-821298755, i3, -1, "com.hansecom.abt.ui.components.notificationBox.ComposableSingletons$AbtNotificationBoxKt.lambda-1.<anonymous> (AbtNotificationBox.kt:132)");
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
            composer2.X(2051328520);
            for (AbtNotificationBoxType abtNotificationBoxType : AbtNotificationBoxType.f()) {
                Painter c2 = PainterResources_androidKt.c(R.drawable.I, composer2, 0);
                Modifier.Companion companion2 = Modifier.f15489d;
                AbtNotificationBoxKt.c(abtNotificationBoxType, c2, "Hello, world!", SizeKt.h(companion2, 0.0f, 1, (Object) null), (String) null, (Function0) null, composer, 3456, 48);
                Painter c3 = PainterResources_androidKt.c(R.drawable.I, composer2, 0);
                Modifier h2 = SizeKt.h(companion2, 0.0f, 1, (Object) null);
                composer2.X(500628289);
                Object g2 = composer.g();
                if (g2 == Composer.f14567a.a()) {
                    g2 = new c();
                    composer2.N(g2);
                }
                composer.M();
                AbtNotificationBoxKt.c(abtNotificationBoxType, c3, "Hello, world!", h2, "Action", (Function0) g2, composer, 224640, 0);
            }
            composer.M();
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
