package com.hansecom.abt.ui.components.fareCapping;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
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
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.R;
import com.hansecom.abt.ui.components.fareCapping.FareCappingCardState;
import com.hansecom.abt.ui.theme.AbtTheme;
import com.hansecom.abt.util.formatters.CurrencyValueFormater;
import com.hansecom.abt.util.resourcesResolvers.StringResourceKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class FareCappingInProgressCardKt$FareCappingInProgressCard$1 implements Function3<ColumnScope, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareCappingCardState.InProgress f38182z;

    public FareCappingInProgressCardKt$FareCappingInProgressCard$1(FareCappingCardState.InProgress inProgress) {
        this.f38182z = inProgress;
    }

    /* JADX INFO: finally extract failed */
    public final void b(ColumnScope columnScope, Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        Intrinsics.i(columnScope, "$this$Card");
        if ((i3 & 17) != 16 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(506186559, i3, -1, "com.hansecom.abt.ui.components.fareCapping.FareCappingInProgressCard.<anonymous> (FareCappingInProgressCard.kt:56)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            float f2 = (float) 12;
            float f3 = (float) 16;
            Modifier j2 = PaddingKt.j(SizeKt.h(companion, 0.0f, 1, (Object) null), Dp.m(f2), Dp.m(f3));
            Alignment.Companion companion2 = Alignment.f15444a;
            Alignment.Vertical i4 = companion2.i();
            FareCappingCardState.InProgress inProgress = this.f38182z;
            Arrangement arrangement = Arrangement.f3739a;
            MeasurePolicy b2 = RowKt.b(arrangement.f(), i4, composer2, 48);
            int a2 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer2, j2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.f17222h;
            Function0 a3 = companion3.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer2.y(a3);
            } else {
                composer.K();
            }
            Composer b3 = Updater.b(composer);
            Updater.g(b3, b2, companion3.c());
            Updater.g(b3, I, companion3.e());
            Function2 b4 = companion3.b();
            if (b3.n() || !Intrinsics.d(b3.g(), Integer.valueOf(a2))) {
                b3.N(Integer.valueOf(a2));
                b3.A(Integer.valueOf(a2), b4);
            }
            Updater.g(b3, e2, companion3.d());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f4150a;
            Modifier t2 = SizeKt.t(companion, Dp.m((float) 48));
            AbtTheme abtTheme = AbtTheme.f38851a;
            Modifier a4 = BackgroundKt.a(t2, abtTheme.b(composer2, 6).z(), RoundedCornerShapeKt.f());
            MeasurePolicy g2 = BoxKt.g(companion2.e(), false);
            int a5 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I2 = composer.I();
            Modifier e3 = ComposedModifierKt.e(composer2, a4);
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
            Composer b5 = Updater.b(composer);
            Updater.g(b5, g2, companion3.c());
            Updater.g(b5, I2, companion3.e());
            Function2 b6 = companion3.b();
            if (b5.n() || !Intrinsics.d(b5.g(), Integer.valueOf(a5))) {
                b5.N(Integer.valueOf(a5));
                b5.A(Integer.valueOf(a5), b6);
            }
            Updater.g(b5, e3, companion3.d());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
            float f4 = f2;
            FareCappingCardState.InProgress inProgress2 = inProgress;
            IconKt.d(PainterResources_androidKt.c(inProgress.a(), composer2, 0), (String) null, SizeKt.t(companion, Dp.m((float) 32)), 0, composer, 432, 8);
            composer.T();
            SpacerKt.a(SizeKt.y(companion, Dp.m(f3)), composer2, 6);
            float f5 = (float) 4;
            Modifier k2 = PaddingKt.k(SizeKt.h(companion, 0.0f, 1, (Object) null), 0.0f, Dp.m(f5), 1, (Object) null);
            MeasurePolicy a7 = ColumnKt.a(arrangement.g(), companion2.k(), composer2, 0);
            int a8 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I3 = composer.I();
            Modifier e4 = ComposedModifierKt.e(composer2, k2);
            Function0 a9 = companion3.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer2.y(a9);
            } else {
                composer.K();
            }
            Composer b7 = Updater.b(composer);
            Updater.g(b7, a7, companion3.c());
            Updater.g(b7, I3, companion3.e());
            Function2 b8 = companion3.b();
            if (b7.n() || !Intrinsics.d(b7.g(), Integer.valueOf(a8))) {
                b7.N(Integer.valueOf(a8));
                b7.A(Integer.valueOf(a8), b8);
            }
            Updater.g(b7, e4, companion3.d());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3815a;
            float f6 = f5;
            float f7 = f4;
            TextKt.j(StringResourceKt.c(inProgress2.b(), new Object[0], composer2, 0), (Modifier) null, abtTheme.b(composer2, 6).q(), (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, abtTheme.d(composer2, 6).b(), composer, 0, 0, 131066);
            Modifier.Companion companion4 = companion;
            SpacerKt.a(SizeKt.i(companion4, Dp.m((float) 8)), composer2, 6);
            composer2.X(-1411196237);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, (DefaultConstructorMarker) null);
            AbtTheme abtTheme2 = abtTheme;
            int q2 = builder.q(new SpanStyle(abtTheme2.b(composer2, 6).q(), 0, FontWeight.f18746A.b(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (DefaultConstructorMarker) null));
            try {
                CurrencyValueFormater currencyValueFormater = CurrencyValueFormater.f39045a;
                builder.k(CurrencyValueFormater.c(currencyValueFormater, Float.valueOf(inProgress2.d() - inProgress2.e()), false, 2, (Object) null));
                Unit unit = Unit.f40552a;
                builder.p(q2);
                builder.k(" ");
                builder.k(StringResourceKt.a(R.string.Z3, new Object[]{StringResourceKt.c(inProgress2.c(), new Object[0], composer2, 0)}, composer2, 0));
                AnnotatedString r2 = builder.r();
                composer.M();
                CurrencyValueFormater currencyValueFormater2 = currencyValueFormater;
                AbtTheme abtTheme3 = abtTheme2;
                TextKt.k(r2, (Modifier) null, 0, (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Map) null, (Function1) null, abtTheme2.d(composer2, 6).d(), composer, 0, 0, 262142);
                Modifier.Companion companion5 = companion4;
                SpacerKt.a(SizeKt.i(companion5, Dp.m(f6)), composer2, 6);
                MeasurePolicy b9 = RowKt.b(arrangement.f(), companion2.i(), composer2, 48);
                int a10 = ComposablesKt.a(composer2, 0);
                CompositionLocalMap I4 = composer.I();
                Modifier e5 = ComposedModifierKt.e(composer2, companion5);
                Function0 a11 = companion3.a();
                if (composer.v() == null) {
                    ComposablesKt.d();
                }
                composer.s();
                if (composer.n()) {
                    composer2.y(a11);
                } else {
                    composer.K();
                }
                Composer b10 = Updater.b(composer);
                Updater.g(b10, b9, companion3.c());
                Updater.g(b10, I4, companion3.e());
                Function2 b11 = companion3.b();
                if (b10.n() || !Intrinsics.d(b10.g(), Integer.valueOf(a10))) {
                    b10.N(Integer.valueOf(a10));
                    b10.A(Integer.valueOf(a10), b11);
                }
                Updater.g(b10, e5, companion3.d());
                float e6 = inProgress2.e();
                float d2 = inProgress2.d();
                composer2.X(614327218);
                boolean h2 = composer2.h(e6) | composer2.h(d2);
                Object g3 = composer.g();
                if (h2 || g3 == Composer.f14567a.a()) {
                    g3 = Float.valueOf(inProgress2.e() / inProgress2.d());
                    composer2.N(g3);
                }
                float floatValue = ((Number) g3).floatValue();
                composer.M();
                FareCappingInProgressCardKt.g(RowScope.c(rowScopeInstance, companion5, 1.0f, false, 2, (Object) null), floatValue, composer2, 0);
                SpacerKt.a(SizeKt.y(companion5, Dp.m(f7)), composer2, 6);
                AbtTheme abtTheme4 = abtTheme3;
                TextKt.j(CurrencyValueFormater.c(currencyValueFormater2, Float.valueOf(inProgress2.d()), false, 2, (Object) null), (Modifier) null, abtTheme4.b(composer2, 6).q(), (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, abtTheme4.d(composer2, 6).g(), composer, 0, 0, 131066);
                composer.T();
                composer.T();
                composer.T();
                if (ComposerKt.P()) {
                    ComposerKt.X();
                }
            } catch (Throwable th) {
                builder.p(q2);
                throw th;
            }
        } else {
            composer.B();
        }
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
