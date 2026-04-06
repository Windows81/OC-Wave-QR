package com.hansecom.abt.ui.components.bottomSheet;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
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
import com.hansecom.abt.ui.theme.Dimensions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AbtBottomSheetKt$AbtBottomSheet$2 implements Function3<ColumnScope, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f38024A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function3 f38025B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function3 f38026z;

    public AbtBottomSheetKt$AbtBottomSheet$2(Function3 function3, Function0 function0, Function3 function32) {
        this.f38026z = function3;
        this.f38024A = function0;
        this.f38025B = function32;
    }

    public final void b(ColumnScope columnScope, Composer composer, int i2) {
        Intrinsics.i(columnScope, "$this$ModalBottomSheet");
        if ((i2 & 17) != 16 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1137724507, i2, -1, "com.hansecom.abt.ui.components.bottomSheet.AbtBottomSheet.<anonymous> (AbtBottomSheet.kt:86)");
            }
            Modifier m2 = PaddingKt.m(PaddingKt.k(Modifier.f15489d, Dimensions.f38856a.c(), 0.0f, 2, (Object) null), 0.0f, 0.0f, 0.0f, Dp.m((float) 24), 7, (Object) null);
            Function3 function3 = this.f38026z;
            Function0 function0 = this.f38024A;
            Function3 function32 = this.f38025B;
            MeasurePolicy a2 = ColumnKt.a(Arrangement.f3739a.g(), Alignment.f15444a.k(), composer, 0);
            int a3 = ComposablesKt.a(composer, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer, m2);
            ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
            Function0 a4 = companion.a();
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
            Updater.g(b2, a2, companion.c());
            Updater.g(b2, I, companion.e());
            Function2 b3 = companion.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a3))) {
                b2.N(Integer.valueOf(a3));
                b2.A(Integer.valueOf(a3), b3);
            }
            Updater.g(b2, e2, companion.d());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3815a;
            function3.d(function0, composer, 0);
            function32.d(function0, composer, 0);
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
