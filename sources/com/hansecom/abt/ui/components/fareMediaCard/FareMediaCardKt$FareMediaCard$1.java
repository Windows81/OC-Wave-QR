package com.hansecom.abt.ui.components.fareMediaCard;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.PainterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
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
import com.hansecom.abt.ui.components.AbtTextKt;
import com.hansecom.abt.ui.components.balance.BalanceKt;
import com.hansecom.abt.ui.theme.AbtTheme;
import com.hansecom.abt.util.resourcesResolvers.StringResourceKt;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import com.hansecom.abt.util.resourcesResolvers.StringValueKt;
import com.hansecom.abt.util.resourcesResolvers.StyledStringResourceKt;
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
public final class FareMediaCardKt$FareMediaCard$1 implements Function3<ColumnScope, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ FareMediaCardTransferStyle f38204A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ StringValue f38205B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ String E;
    public final /* synthetic */ String F;
    public final /* synthetic */ long G;
    public final /* synthetic */ String H;
    public final /* synthetic */ StringValue I;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f38206z;

    public FareMediaCardKt$FareMediaCard$1(boolean z2, FareMediaCardTransferStyle fareMediaCardTransferStyle, StringValue stringValue, boolean z3, boolean z4, String str, String str2, long j2, String str3, StringValue stringValue2) {
        this.f38206z = z2;
        this.f38204A = fareMediaCardTransferStyle;
        this.f38205B = stringValue;
        this.C = z3;
        this.D = z4;
        this.E = str;
        this.F = str2;
        this.G = j2;
        this.H = str3;
        this.I = stringValue2;
    }

    /* JADX INFO: finally extract failed */
    public final void b(ColumnScope columnScope, Composer composer, int i2) {
        AbtTheme abtTheme;
        int i3;
        Modifier.Companion companion;
        int i4;
        AbtTheme abtTheme2;
        int i5;
        int i6;
        float f2;
        Object obj;
        int i7;
        Composer composer2 = composer;
        int i8 = i2;
        Intrinsics.i(columnScope, "$this$FareMediaCardBase");
        if ((i8 & 17) != 16 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1860014647, i8, -1, "com.hansecom.abt.ui.components.fareMediaCard.FareMediaCard.<anonymous> (FareMediaCard.kt:64)");
            }
            boolean z2 = this.f38206z;
            int i9 = z2 ? R.drawable.f33005g : R.drawable.f33004f;
            int i10 = z2 ? R.drawable.f0 : R.drawable.e0;
            Modifier.Companion companion2 = Modifier.f15489d;
            Modifier b2 = BackgroundKt.b(companion2, this.f38204A.a(), (Shape) null, 2, (Object) null);
            StringValue stringValue = this.f38205B;
            boolean z3 = this.C;
            boolean z4 = this.D;
            String str = this.E;
            String str2 = this.F;
            long j2 = this.G;
            String str3 = this.H;
            StringValue stringValue2 = this.I;
            FareMediaCardTransferStyle fareMediaCardTransferStyle = this.f38204A;
            boolean z5 = z4;
            Arrangement arrangement = Arrangement.f3739a;
            Arrangement.Vertical g2 = arrangement.g();
            Alignment.Companion companion3 = Alignment.f15444a;
            StringValue stringValue3 = stringValue2;
            FareMediaCardTransferStyle fareMediaCardTransferStyle2 = fareMediaCardTransferStyle;
            MeasurePolicy a2 = ColumnKt.a(g2, companion3.k(), composer2, 0);
            int a3 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I2 = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer2, b2);
            ComposeUiNode.Companion companion4 = ComposeUiNode.f17222h;
            String str4 = str3;
            Function0 a4 = companion4.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer2.y(a4);
            } else {
                composer.K();
            }
            Composer b3 = Updater.b(composer);
            long j3 = j2;
            Updater.g(b3, a2, companion4.c());
            Updater.g(b3, I2, companion4.e());
            Function2 b4 = companion4.b();
            if (b3.n() || !Intrinsics.d(b3.g(), Integer.valueOf(a3))) {
                b3.N(Integer.valueOf(a3));
                b3.A(Integer.valueOf(a3), b4);
            }
            Updater.g(b3, e2, companion4.d());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3815a;
            Modifier a5 = ClipKt.a(AspectRatioKt.b(companion2, FareMediaCardBaseKt.f(), false, 2, (Object) null), FareMediaCardBaseKt.g());
            MeasurePolicy g3 = BoxKt.g(companion3.o(), false);
            int a6 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I3 = composer.I();
            Modifier e3 = ComposedModifierKt.e(composer2, a5);
            Function0 a7 = companion4.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer2.y(a7);
            } else {
                composer.K();
            }
            Composer b5 = Updater.b(composer);
            Updater.g(b5, g3, companion4.c());
            Updater.g(b5, I3, companion4.e());
            Function2 b6 = companion4.b();
            if (b5.n() || !Intrinsics.d(b5.g(), Integer.valueOf(a6))) {
                b5.N(Integer.valueOf(a6));
                b5.A(Integer.valueOf(a6), b6);
            }
            Updater.g(b5, e3, companion4.d());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
            Modifier b7 = PainterModifierKt.b(SizeKt.f(companion2, 0.0f, 1, (Object) null), PainterResources_androidKt.c(i9, composer2, 0), false, (Alignment) null, ContentScale.f17026a.b(), 0.0f, (ColorFilter) null, 54, (Object) null);
            MeasurePolicy a8 = ColumnKt.a(arrangement.g(), companion3.k(), composer2, 0);
            int a9 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I4 = composer.I();
            Modifier e4 = ComposedModifierKt.e(composer2, b7);
            Function0 a10 = companion4.a();
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
            Updater.g(b8, a8, companion4.c());
            Updater.g(b8, I4, companion4.e());
            Function2 b9 = companion4.b();
            if (b8.n() || !Intrinsics.d(b8.g(), Integer.valueOf(a9))) {
                b8.N(Integer.valueOf(a9));
                b8.A(Integer.valueOf(a9), b9);
            }
            Updater.g(b8, e4, companion4.d());
            float f3 = (float) 24;
            StringValue stringValue4 = stringValue3;
            String str5 = str4;
            StringValue stringValue5 = stringValue;
            long j4 = j3;
            float f4 = f3;
            boolean z6 = z3;
            String str6 = str2;
            String str7 = str;
            boolean z7 = z5;
            ImageKt.a(PainterResources_androidKt.c(i10, composer2, 0), (String) null, SizeKt.i(PaddingKt.j(companion2, Dp.m(f3), Dp.m((float) 12)), Dp.m(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, 120);
            Modifier k2 = PaddingKt.k(ColumnScope.c(columnScopeInstance, SizeKt.h(companion2, 0.0f, 1, (Object) null), 1.0f, false, 2, (Object) null), Dp.m(f4), 0.0f, 2, (Object) null);
            MeasurePolicy a11 = ColumnKt.a(arrangement.p(Dp.m((float) 14), companion3.i()), companion3.k(), composer2, 6);
            int a12 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I5 = composer.I();
            Modifier e5 = ComposedModifierKt.e(composer2, k2);
            Function0 a13 = companion4.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer2.y(a13);
            } else {
                composer.K();
            }
            Composer b10 = Updater.b(composer);
            Updater.g(b10, a11, companion4.c());
            Updater.g(b10, I5, companion4.e());
            Function2 b11 = companion4.b();
            if (b10.n() || !Intrinsics.d(b10.g(), Integer.valueOf(a12))) {
                b10.N(Integer.valueOf(a12));
                b10.A(Integer.valueOf(a12), b11);
            }
            Updater.g(b10, e5, companion4.d());
            AbtTheme abtTheme3 = AbtTheme.f38851a;
            StringValue stringValue6 = stringValue5;
            boolean z8 = z6;
            Modifier.Companion companion5 = companion2;
            FareMediaCardTransferStyle fareMediaCardTransferStyle3 = fareMediaCardTransferStyle2;
            AbtTheme abtTheme4 = abtTheme3;
            TextKt.j(str5, TestTagKt.a(companion2, "fare_media_card_balance"), 0, (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, abtTheme3.d(composer2, 6).j(), composer, 48, 0, 131068);
            if (StringValueKt.a(stringValue4)) {
                composer2.X(-1670438977);
                composer2.X(-746619808);
                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, (DefaultConstructorMarker) null);
                builder.k(StringResources_androidKt.b(R.string.K4, composer2, 0));
                builder.k(" ");
                composer2.X(-746613239);
                int q2 = builder.q(new SpanStyle(0, 0, FontWeight.f18746A.b(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65531, (DefaultConstructorMarker) null));
                try {
                    builder.k(StringResourceKt.c(stringValue4, new Object[0], composer2, 0));
                    Unit unit = Unit.f40552a;
                    builder.p(q2);
                    composer.M();
                    AnnotatedString r2 = builder.r();
                    composer.M();
                    AbtTheme abtTheme5 = abtTheme4;
                    abtTheme = abtTheme5;
                    TextKt.k(r2, (Modifier) null, 0, (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Map) null, (Function1) null, abtTheme5.d(composer2, 6).d(), composer, 0, 0, 262142);
                    composer.M();
                    companion = companion5;
                    i4 = 16;
                    i3 = 6;
                } catch (Throwable th) {
                    builder.p(q2);
                    throw th;
                }
            } else {
                abtTheme = abtTheme4;
                composer2.X(-1669836461);
                i4 = 16;
                companion = companion5;
                i3 = 6;
                SpacerKt.a(SizeKt.i(companion, Dp.m((float) 16)), composer2, 6);
                composer.M();
            }
            composer.T();
            FareMediaCardKt.c(str7, str6, j4, composer, 0, 0);
            composer.T();
            composer2.X(2121384228);
            if (z8) {
                obj = null;
                f2 = 0.0f;
                i5 = 1;
                abtTheme2 = abtTheme;
                Modifier b12 = BackgroundKt.b(SizeKt.f(companion, 0.0f, 1, (Object) null), Color.l(abtTheme2.b(composer2, i3).x(), 0.25f, 0.0f, 0.0f, 0.0f, 14, (Object) null), (Shape) null, 2, (Object) null);
                i6 = 0;
                MeasurePolicy g4 = BoxKt.g(companion3.o(), false);
                int a14 = ComposablesKt.a(composer2, 0);
                CompositionLocalMap I6 = composer.I();
                Modifier e6 = ComposedModifierKt.e(composer2, b12);
                Function0 a15 = companion4.a();
                if (composer.v() == null) {
                    ComposablesKt.d();
                }
                composer.s();
                if (composer.n()) {
                    composer2.y(a15);
                } else {
                    composer.K();
                }
                Composer b13 = Updater.b(composer);
                Updater.g(b13, g4, companion4.c());
                Updater.g(b13, I6, companion4.e());
                Function2 b14 = companion4.b();
                if (b13.n() || !Intrinsics.d(b13.g(), Integer.valueOf(a14))) {
                    b13.N(Integer.valueOf(a14));
                    b13.A(Integer.valueOf(a14), b14);
                }
                Updater.g(b13, e6, companion4.d());
                LockedBadgeKt.b(boxScopeInstance.g(companion, companion3.e()), false, composer2, 0, 2);
                composer.T();
            } else {
                abtTheme2 = abtTheme;
                obj = null;
                f2 = 0.0f;
                i6 = 0;
                i5 = 1;
            }
            composer.M();
            composer2.X(2121400267);
            if (z7) {
                i7 = i6;
                BalanceKt.b(boxScopeInstance.g(PaddingKt.m(companion, 0.0f, Dp.m((float) 8), Dp.m(f4), 0.0f, 9, (Object) null), companion3.n()), StringResources_androidKt.b(R.string.g5, composer2, i7), composer2, i7, i7);
            } else {
                i7 = i6;
            }
            composer.M();
            composer.T();
            composer2.X(554924030);
            StringValue stringValue7 = stringValue6;
            if (stringValue7 != null) {
                AbtTextKt.c(StyledStringResourceKt.g(stringValue7, new Object[i7], composer2, i7), PaddingKt.j(SizeKt.h(companion, f2, i5, obj), Dp.m((float) i4), Dp.m((float) 4)), fareMediaCardTransferStyle3.b(), 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, abtTheme2.d(composer2, 6).d(), composer, 0, 0, 65528);
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

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
