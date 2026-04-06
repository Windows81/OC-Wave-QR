package androidx.compose.material3;

import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material3.tokens.PrimaryNavigationTabTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class TabKt$LeadingIconTab$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f11278A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f11279B;
    public final /* synthetic */ IndicationNodeFactory C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ Function0 E;
    public final /* synthetic */ Function2 F;
    public final /* synthetic */ Function2 G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f11280z;

    public final void b(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if (composer2.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1831009258, i3, -1, "androidx.compose.material3.LeadingIconTab.<anonymous> (Tab.kt:171)");
            }
            Modifier h2 = SizeKt.h(PaddingKt.k(SelectableKt.a(SizeKt.i(this.f11280z, TabKt.f11271a), this.f11278A, this.f11279B, this.C, this.D, Role.j(Role.f18040b.h()), this.E), TabKt.k(), 0.0f, 2, (Object) null), 0.0f, 1, (Object) null);
            Arrangement.HorizontalOrVertical b2 = Arrangement.f3739a.b();
            Alignment.Vertical i4 = Alignment.f15444a.i();
            Function2 function2 = this.F;
            Function2 function22 = this.G;
            MeasurePolicy b3 = RowKt.b(b2, i4, composer2, 54);
            int a2 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer2, h2);
            ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
            Function0 a3 = companion.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer2.y(a3);
            } else {
                composer.K();
            }
            Composer b4 = Updater.b(composer);
            Updater.g(b4, b3, companion.c());
            Updater.g(b4, I, companion.e());
            Function2 b5 = companion.b();
            if (b4.n() || !Intrinsics.d(b4.g(), Integer.valueOf(a2))) {
                b4.N(Integer.valueOf(a2));
                b4.A(Integer.valueOf(a2), b5);
            }
            Updater.g(b4, e2, companion.d());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f4150a;
            function2.m(composer2, 0);
            SpacerKt.a(SizeKt.s(Modifier.f15489d, TabKt.f11277g), composer2, 6);
            TextKt.h(TextStyle.c(TypographyKt.e(PrimaryNavigationTabTokens.f13859a.e(), composer2, 6), 0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.f19080b.a(), 0, 0, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744447, (Object) null), function22, composer2, 0);
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
