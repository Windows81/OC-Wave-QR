package com.hansecom.abt.presentation.screens.home.more.guidedTour;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.pager.PageSize;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import com.hansecom.abt.presentation.screens.home.more.guidedTour.GuidedTour;
import com.hansecom.abt.ui.components.abtTopBar.AbtTopBarKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class GuidedTourScreenKt$ScreenImpl$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f37446A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ GuidedTour.State f37447B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PagerState f37448z;

    public GuidedTourScreenKt$ScreenImpl$1(PagerState pagerState, Function0 function0, GuidedTour.State state) {
        this.f37448z = pagerState;
        this.f37446A = function0;
        this.f37447B = state;
    }

    public final void b(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if ((i3 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(971559823, i3, -1, "com.hansecom.abt.presentation.screens.home.more.guidedTour.ScreenImpl.<anonymous> (GuidedTourScreen.kt:69)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            Modifier e2 = WindowInsetsPaddingKt.e(companion, WindowInsets_androidKt.e(WindowInsets.f4206a, composer2, 6));
            PagerState pagerState = this.f37448z;
            Function0 function0 = this.f37446A;
            GuidedTour.State state = this.f37447B;
            MeasurePolicy a2 = ColumnKt.a(Arrangement.f3739a.g(), Alignment.f15444a.k(), composer2, 0);
            int a3 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I = composer.I();
            Modifier e3 = ComposedModifierKt.e(composer2, e2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.f17222h;
            Function0 a4 = companion2.a();
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
            Updater.g(b2, a2, companion2.c());
            Updater.g(b2, I, companion2.e());
            Function2 b3 = companion2.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a3))) {
                b2.N(Integer.valueOf(a3));
                b2.A(Integer.valueOf(a3), b3);
            }
            Updater.g(b2, e3, companion2.d());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3815a;
            AbtTopBarKt.b((String) null, (Modifier) null, (Function0) null, ComposableLambdaKt.e(-554861794, true, new GuidedTourScreenKt$ScreenImpl$1$1$1(function0), composer2, 54), false, composer, 3462, 18);
            PagerState pagerState2 = pagerState;
            PagerKt.a(pagerState2, ColumnScope.c(columnScopeInstance, companion, 1.0f, false, 2, (Object) null), (PaddingValues) null, (PageSize) null, 0, 0.0f, (Alignment.Vertical) null, (TargetedFlingBehavior) null, false, false, (Function1) null, (NestedScrollConnection) null, (SnapPosition) null, (OverscrollEffect) null, ComposableLambdaKt.e(-1104579144, true, new GuidedTourScreenKt$ScreenImpl$1$1$2(state), composer2, 54), composer, 0, 24576, 16380);
            GuidedTourScreenKt.l(pagerState2, function0, composer, 0);
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
