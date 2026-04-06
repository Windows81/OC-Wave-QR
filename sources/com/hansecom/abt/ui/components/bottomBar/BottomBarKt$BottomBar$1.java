package com.hansecom.abt.ui.components.bottomBar;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.ui.theme.AbtTheme;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class BottomBarKt$BottomBar$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f37994A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f37995B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ List D;
    public final /* synthetic */ int E;
    public final /* synthetic */ Function1 F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f37996z;

    public BottomBarKt$BottomBar$1(Modifier modifier, boolean z2, boolean z3, Function0 function0, List list, int i2, Function1 function1) {
        this.f37996z = modifier;
        this.f37994A = z2;
        this.f37995B = z3;
        this.C = function0;
        this.D = list;
        this.E = i2;
        this.F = function1;
    }

    public final void b(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if ((i3 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(255709317, i3, -1, "com.hansecom.abt.ui.components.bottomBar.BottomBar.<anonymous> (BottomBar.kt:73)");
            }
            float B1 = ((Density) composer2.C(CompositionLocalsKt.g())).B1(Dp.m((float) 88));
            Modifier modifier = this.f37996z;
            boolean z2 = this.f37994A;
            boolean z3 = this.f37995B;
            Function0 function0 = this.C;
            List list = this.D;
            int i4 = this.E;
            Function1 function1 = this.F;
            Modifier.Companion companion = Modifier.f15489d;
            Alignment.Companion companion2 = Alignment.f15444a;
            MeasurePolicy g2 = BoxKt.g(companion2.o(), false);
            int a2 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer2, companion);
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
            Composer b2 = Updater.b(composer);
            Updater.g(b2, g2, companion3.c());
            Updater.g(b2, I, companion3.e());
            Function2 b3 = companion3.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a2))) {
                b2.N(Integer.valueOf(a2));
                b2.A(Integer.valueOf(a2), b3);
            }
            Updater.g(b2, e2, companion3.d());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
            AbtTheme abtTheme = AbtTheme.f38851a;
            long A2 = abtTheme.b(composer2, 6).A();
            long x2 = abtTheme.b(composer2, 6).x();
            boolean z4 = z3;
            BoxScopeInstance boxScopeInstance2 = boxScopeInstance;
            Modifier h2 = SizeKt.h(modifier, 0.0f, 1, (Object) null);
            float m2 = Dp.m((float) 8);
            float f2 = m2;
            Modifier.Companion companion4 = companion;
            Function0 function02 = function0;
            boolean z5 = z2;
            SurfaceKt.c(h2, z2 ? BottomBarShapeKt.b(B1) : RectangleShapeKt.a(), A2, x2, 0.0f, f2, (BorderStroke) null, ComposableLambdaKt.e(-822173082, true, new BottomBarKt$BottomBar$1$1$1(list, i4, function1, z2), composer2, 54), composer, 12779520, 80);
            composer2.X(-1056005571);
            if (z5) {
                BarcodeButtonKt.b(z4, function02, TestTagKt.a(OffsetKt.c(boxScopeInstance2.g(companion4, companion2.m()), 0.0f, Dp.m(Dp.m(-Dp.m((float) 76)) / ((float) 2)), 1, (Object) null), "bottom_bar_barcode"), composer, 0, 0);
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
