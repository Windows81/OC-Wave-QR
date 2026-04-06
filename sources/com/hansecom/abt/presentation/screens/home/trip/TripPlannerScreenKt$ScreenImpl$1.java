package com.hansecom.abt.presentation.screens.home.trip;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.R;
import com.hansecom.abt.presentation.screens.home.trip.TripPlanner;
import com.hansecom.abt.ui.components.emptyView.EmptyViewKt;
import com.hansecom.abt.ui.components.screenHeader.ScreenHeaderKt;
import com.hansecom.abt.ui.theme.AbtTheme;
import com.hansecom.abt.ui.theme.Dimensions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TripPlannerScreenKt$ScreenImpl$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TripPlanner.State f37501A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f37502z;

    public TripPlannerScreenKt$ScreenImpl$1(Function2 function2, TripPlanner.State state) {
        this.f37502z = function2;
        this.f37501A = state;
    }

    public static final Unit e(Function2 function2, TripPlanner.State state) {
        function2.m(state.c(), state.b());
        return Unit.f40552a;
    }

    public final void c(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if ((i3 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1384070330, i3, -1, "com.hansecom.abt.presentation.screens.home.trip.ScreenImpl.<anonymous> (TripPlannerScreen.kt:54)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            Modifier f2 = SizeKt.f(companion, 0.0f, 1, (Object) null);
            Function2 function2 = this.f37502z;
            TripPlanner.State state = this.f37501A;
            Arrangement arrangement = Arrangement.f3739a;
            Arrangement.Vertical g2 = arrangement.g();
            Alignment.Companion companion2 = Alignment.f15444a;
            MeasurePolicy a2 = ColumnKt.a(g2, companion2.k(), composer2, 0);
            int a3 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer2, f2);
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
            Updater.g(b2, e2, companion3.d());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3815a;
            AbtTheme abtTheme = AbtTheme.f38851a;
            Modifier b4 = WindowInsetsPadding_androidKt.b(BackgroundKt.b(companion, abtTheme.b(composer2, 6).x(), (Shape) null, 2, (Object) null));
            Dimensions dimensions = Dimensions.f38856a;
            Modifier k2 = PaddingKt.k(b4, dimensions.c(), 0.0f, 2, (Object) null);
            AbtTheme abtTheme2 = abtTheme;
            Modifier modifier = k2;
            TripPlanner.State state2 = state;
            Function2 function22 = function2;
            ScreenHeaderKt.b(modifier, (PaddingValues) null, abtTheme.b(composer2, 6).o(), abtTheme.b(composer2, 6).o(), StringResources_androidKt.b(R.string.ia, composer2, 0), StringResources_androidKt.b(R.string.ja, composer2, 0), true, composer, 1572864, 2);
            Modifier f3 = SizeKt.f(companion, 0.0f, 1, (Object) null);
            MeasurePolicy g3 = BoxKt.g(companion2.e(), false);
            int a5 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I2 = composer.I();
            Modifier e3 = ComposedModifierKt.e(composer2, f3);
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
            Updater.g(b5, g3, companion3.c());
            Updater.g(b5, I2, companion3.e());
            Function2 b6 = companion3.b();
            if (b5.n() || !Intrinsics.d(b5.g(), Integer.valueOf(a5))) {
                b5.N(Integer.valueOf(a5));
                b5.A(Integer.valueOf(a5), b6);
            }
            Updater.g(b5, e3, companion3.d());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
            Modifier f4 = SizeKt.f(companion, 0.0f, 1, (Object) null);
            Painter c2 = PainterResources_androidKt.c(R.drawable.f33002d, composer2, 0);
            ContentScale.Companion companion4 = ContentScale.f17026a;
            ImageKt.a(c2, (String) null, f4, (Alignment) null, companion4.a(), 0.0f, ColorFilter.f15990b.a(Color.l(abtTheme2.b(composer2, 6).z(), 0.8f, 0.0f, 0.0f, 0.0f, 14, (Object) null), BlendMode.f15926b.B()), composer, 25008, 40);
            Modifier g4 = ScrollKt.g(PaddingKt.j(SizeKt.f(companion, 0.0f, 1, (Object) null), dimensions.c(), Dp.m((float) 32)), ScrollKt.c(0, composer2, 0, 1), false, (FlingBehavior) null, false, 14, (Object) null);
            MeasurePolicy a7 = ColumnKt.a(arrangement.g(), companion2.g(), composer2, 48);
            int a8 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I3 = composer.I();
            Modifier e4 = ComposedModifierKt.e(composer2, g4);
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
            ImageKt.a(PainterResources_androidKt.c(R.drawable.g0, composer2, 0), (String) null, SizeKt.i(SizeKt.y(companion, Dp.m((float) 160)), Dp.m((float) 60)), (Alignment) null, companion4.d(), 0.0f, (ColorFilter) null, composer, 25008, 104);
            Modifier c3 = ColumnScope.c(columnScopeInstance, SizeKt.h(companion, 0.0f, 1, (Object) null), 1.0f, false, 2, (Object) null);
            Integer valueOf = Integer.valueOf(R.drawable.L);
            String b9 = StringResources_androidKt.b(R.string.ga, composer2, 0);
            String b10 = StringResources_androidKt.b(R.string.ha, composer2, 0);
            String b11 = StringResources_androidKt.b(R.string.fa, composer2, 0);
            composer2.X(348429196);
            Function2 function23 = function22;
            TripPlanner.State state3 = state2;
            boolean W = composer2.W(function23) | composer2.W(state3);
            Object g5 = composer.g();
            if (W || g5 == Composer.f14567a.a()) {
                g5 = new d(function23, state3);
                composer2.N(g5);
            }
            composer.M();
            EmptyViewKt.b(c3, valueOf, b9, b10, b11, (String) null, (Integer) null, (Function0) g5, false, composer, 0, 352);
            composer.T();
            composer.T();
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
