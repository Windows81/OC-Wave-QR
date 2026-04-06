package com.hansecom.abt.ui.components.paymentOptions;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.ui.theme.AbtTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PaymentMethodItem$Container$1 implements Function3<ColumnScope, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function3 f38686A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f38687B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f38688z;

    public PaymentMethodItem$Container$1(boolean z2, Function3 function3, Function2 function2) {
        this.f38688z = z2;
        this.f38686A = function3;
        this.f38687B = function2;
    }

    public static final Unit e(boolean z2, long j2, ContentDrawScope contentDrawScope) {
        Intrinsics.i(contentDrawScope, "$this$drawWithContent");
        contentDrawScope.q2();
        if (!z2) {
            DrawScope.A1(contentDrawScope, j2, 0, 0, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 126, (Object) null);
        }
        return Unit.f40552a;
    }

    public final void c(ColumnScope columnScope, Composer composer, int i2) {
        Intrinsics.i(columnScope, "$this$Card");
        if ((i2 & 17) != 16 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(215089260, i2, -1, "com.hansecom.abt.ui.components.paymentOptions.PaymentMethodItem.Container.<anonymous> (PaymentMethodItem.kt:237)");
            }
            long l2 = Color.l(AbtTheme.f38851a.b(composer, 6).z(), 0.5f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
            Modifier b2 = SizeKt.b(SizeKt.h(Modifier.f15489d, 0.0f, 1, (Object) null), 0.0f, Dp.m((float) 80), 1, (Object) null);
            composer.X(-480532528);
            boolean d2 = composer.d(this.f38688z) | composer.j(l2);
            boolean z2 = this.f38688z;
            Object g2 = composer.g();
            if (d2 || g2 == Composer.f14567a.a()) {
                g2 = new s(z2, l2);
                composer.N(g2);
            }
            composer.M();
            float f2 = (float) 12;
            float f3 = (float) 8;
            Modifier l3 = PaddingKt.l(DrawModifierKt.d(b2, (Function1) g2), Dp.m(f2), Dp.m(f3), Dp.m((float) 16), Dp.m(f3));
            Alignment.Vertical i3 = Alignment.f15444a.i();
            Arrangement.HorizontalOrVertical n2 = Arrangement.f3739a.n(Dp.m(f2));
            Function3 function3 = this.f38686A;
            Function2 function2 = this.f38687B;
            MeasurePolicy b3 = RowKt.b(n2, i3, composer, 54);
            int a2 = ComposablesKt.a(composer, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer, l3);
            ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
            Function0 a3 = companion.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer.y(a3);
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
            function3.d(RowScopeInstance.f4150a, composer, 6);
            composer.X(-380198115);
            if (function2 != null) {
                function2.m(composer, 0);
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
        c((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
