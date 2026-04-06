package com.hansecom.abt.ui.components.circleIcons;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
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
import com.hansecom.abt.ui.components.circleIcons.CircleIconStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: com.hansecom.abt.ui.components.circleIcons.ComposableSingletons$CircleIconKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$CircleIconKt$lambda1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$CircleIconKt$lambda1$1 f38105z = new ComposableSingletons$CircleIconKt$lambda1$1();

    public final void b(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1036715844, i2, -1, "com.hansecom.abt.ui.components.circleIcons.ComposableSingletons$CircleIconKt.lambda-1.<anonymous> (CircleIcon.kt:48)");
            }
            Alignment.Horizontal g2 = Alignment.f15444a.g();
            Arrangement.HorizontalOrVertical n2 = Arrangement.f3739a.n(Dp.m((float) 32));
            Modifier.Companion companion = Modifier.f15489d;
            MeasurePolicy a2 = ColumnKt.a(n2, g2, composer, 54);
            int a3 = ComposablesKt.a(composer, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer, companion);
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
            Composer composer2 = composer;
            CircleIconKt.b(new CircleIconStyle.Type.Positive((CircleIconStyle.Size) null, 1, (DefaultConstructorMarker) null), (Modifier) null, 0, composer2, 0, 6);
            Composer composer3 = composer;
            CircleIconKt.b(new CircleIconStyle.Type.Warning((CircleIconStyle.Size) null, 1, (DefaultConstructorMarker) null), (Modifier) null, 0, composer3, 0, 6);
            CircleIconKt.b(new CircleIconStyle.Type.Warning(CircleIconStyle.Size.MEDIUM), (Modifier) null, 0, composer2, 0, 6);
            CircleIconKt.b(new CircleIconStyle.Type.Informative((CircleIconStyle.Size) null, 1, (DefaultConstructorMarker) null), (Modifier) null, 0, composer3, 0, 6);
            CircleIconKt.b(new CircleIconStyle.Type.Error((CircleIconStyle.Size) null, 1, (DefaultConstructorMarker) null), (Modifier) null, 0, composer2, 0, 6);
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
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
