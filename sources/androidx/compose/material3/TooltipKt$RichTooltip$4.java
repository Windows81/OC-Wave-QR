package androidx.compose.material3;

import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.RichTooltipTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class TooltipKt$RichTooltip$4 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f11606A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ RichTooltipColors f11607B;
    public final /* synthetic */ Function2 C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f11608z;

    public final void b(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if (composer2.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1249811482, i3, -1, "androidx.compose.material3.RichTooltip.<anonymous> (Tooltip.kt:579)");
            }
            RichTooltipTokens richTooltipTokens = RichTooltipTokens.f13905a;
            TextStyle e2 = TypographyKt.e(richTooltipTokens.a(), composer2, 6);
            TextStyle e3 = TypographyKt.e(richTooltipTokens.b(), composer2, 6);
            TextStyle e4 = TypographyKt.e(richTooltipTokens.c(), composer2, 6);
            Modifier.Companion companion = Modifier.f15489d;
            Modifier k2 = PaddingKt.k(companion, TooltipKt.s(), 0.0f, 2, (Object) null);
            Function2 function2 = this.f11608z;
            Function2 function22 = this.f11606A;
            RichTooltipColors richTooltipColors = this.f11607B;
            Function2 function23 = this.C;
            Arrangement.Vertical g2 = Arrangement.f3739a.g();
            Alignment.Companion companion2 = Alignment.f15444a;
            MeasurePolicy a2 = ColumnKt.a(g2, companion2.k(), composer2, 0);
            int a3 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I = composer.I();
            Modifier e5 = ComposedModifierKt.e(composer2, k2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.f17222h;
            Function0 a4 = companion3.a();
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
            Updater.g(b2, a2, companion3.c());
            Updater.g(b2, I, companion3.e());
            Function2 b3 = companion3.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a3))) {
                b2.N(Integer.valueOf(a3));
                b2.A(Integer.valueOf(a3), b3);
            }
            Updater.g(b2, e5, companion3.d());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3815a;
            if (function2 == null) {
                composer2.X(112051624);
            } else {
                composer2.X(112051625);
                Modifier h2 = AlignmentLineKt.h(companion, TooltipKt.q(), 0.0f, 2, (Object) null);
                MeasurePolicy g3 = BoxKt.g(companion2.o(), false);
                int a5 = ComposablesKt.a(composer2, 0);
                CompositionLocalMap I2 = composer.I();
                Modifier e6 = ComposedModifierKt.e(composer2, h2);
                Function0 a6 = companion3.a();
                if (composer.v() == null) {
                    ComposablesKt.d();
                }
                composer.s();
                if (composer.n()) {
                    composer2.y(a6);
                } else {
                    composer.K();
                }
                Composer b4 = Updater.b(composer);
                Updater.g(b4, g3, companion3.c());
                Updater.g(b4, I2, companion3.e());
                Function2 b5 = companion3.b();
                if (b4.n() || !Intrinsics.d(b4.g(), Integer.valueOf(a5))) {
                    b4.N(Integer.valueOf(a5));
                    b4.A(Integer.valueOf(a5), b5);
                }
                Updater.g(b4, e6, companion3.d());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
                CompositionLocalKt.d(new ProvidedValue[]{ContentColorKt.a().d(Color.h(richTooltipColors.c())), TextKt.q().d(e3)}, function2, composer2, ProvidedValue.f14769i);
                composer.T();
                Unit unit = Unit.f40552a;
            }
            composer.M();
            Modifier A2 = TooltipKt.A(companion, function2 != null, function22 != null);
            MeasurePolicy g4 = BoxKt.g(companion2.o(), false);
            int a7 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I3 = composer.I();
            Modifier e7 = ComposedModifierKt.e(composer2, A2);
            Function0 a8 = companion3.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer2.y(a8);
            } else {
                composer.K();
            }
            Composer b6 = Updater.b(composer);
            Updater.g(b6, g4, companion3.c());
            Updater.g(b6, I3, companion3.e());
            Function2 b7 = companion3.b();
            if (b6.n() || !Intrinsics.d(b6.g(), Integer.valueOf(a7))) {
                b6.N(Integer.valueOf(a7));
                b6.A(Integer.valueOf(a7), b7);
            }
            Updater.g(b6, e7, companion3.d());
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f3797a;
            ProvidedValue[] providedValueArr = {ContentColorKt.a().d(Color.h(richTooltipColors.b())), TextKt.q().d(e4)};
            int i4 = ProvidedValue.f14769i;
            CompositionLocalKt.d(providedValueArr, function23, composer2, i4);
            composer.T();
            if (function22 == null) {
                composer2.X(112784836);
            } else {
                composer2.X(112784837);
                Modifier m2 = PaddingKt.m(SizeKt.n(companion, TooltipKt.p(), 0.0f, 2, (Object) null), 0.0f, 0.0f, 0.0f, TooltipKt.o(), 7, (Object) null);
                MeasurePolicy g5 = BoxKt.g(companion2.o(), false);
                int a9 = ComposablesKt.a(composer2, 0);
                CompositionLocalMap I4 = composer.I();
                Modifier e8 = ComposedModifierKt.e(composer2, m2);
                Function0 a10 = companion3.a();
                if (composer.v() == null) {
                    ComposablesKt.d();
                }
                composer.s();
                if (composer.n()) {
                    composer2.y(a10);
                } else {
                    composer.K();
                }
                Composer b8 = Updater.b(composer);
                Updater.g(b8, g5, companion3.c());
                Updater.g(b8, I4, companion3.e());
                Function2 b9 = companion3.b();
                if (b8.n() || !Intrinsics.d(b8.g(), Integer.valueOf(a9))) {
                    b8.N(Integer.valueOf(a9));
                    b8.A(Integer.valueOf(a9), b9);
                }
                Updater.g(b8, e8, companion3.d());
                CompositionLocalKt.d(new ProvidedValue[]{ContentColorKt.a().d(Color.h(richTooltipColors.a())), TextKt.q().d(e2)}, function22, composer2, i4);
                composer.T();
                Unit unit2 = Unit.f40552a;
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
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
