package com.hansecom.abt.ui.components.fareMediaCard;

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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class FareMediaCardKt$Preview$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PreviewState f38207z;

    public final void b(Composer composer, int i2) {
        FareMediaCardTransferStyle a2;
        Composer composer2 = composer;
        int i3 = i2;
        if ((i3 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(2134744941, i3, -1, "com.hansecom.abt.ui.components.fareMediaCard.Preview.<anonymous> (FareMediaCard.kt:274)");
            }
            Modifier i4 = PaddingKt.i(Modifier.f15489d, Dp.m((float) 16));
            PreviewState previewState = this.f38207z;
            MeasurePolicy a3 = ColumnKt.a(Arrangement.f3739a.g(), Alignment.f15444a.k(), composer2, 0);
            int a4 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer2, i4);
            ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
            Function0 a5 = companion.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer2.y(a5);
            } else {
                composer.K();
            }
            Composer b2 = Updater.b(composer);
            Updater.g(b2, a3, companion.c());
            Updater.g(b2, I, companion.e());
            Function2 b3 = companion.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a4))) {
                b2.N(Integer.valueOf(a4));
                b2.A(Integer.valueOf(a4), b3);
            }
            Updater.g(b2, e2, companion.d());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3815a;
            String c2 = previewState.c();
            String d2 = previewState.d();
            String e3 = previewState.e();
            StringValue a6 = previewState.a();
            boolean j2 = previewState.j();
            boolean h2 = previewState.h();
            boolean i5 = previewState.i();
            StringValue f2 = previewState.f();
            long b4 = previewState.b();
            if (previewState.g()) {
                composer2.X(610274073);
                a2 = FareMediaCardTransferStyles.f38210a.b(composer2, 6);
                composer.M();
            } else {
                composer2.X(610354456);
                a2 = FareMediaCardTransferStyles.f38210a.a(composer2, 6);
                composer.M();
            }
            FareMediaCardKt.e(c2, d2, e3, a6, j2, h2, i5, (Modifier) null, b4, f2, a2, composer, 0, 0, 128);
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
