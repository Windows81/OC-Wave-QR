package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata
public final class ModalBottomSheetKt$ModalBottomSheetContent$7 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Animatable f10326A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ SheetState f10327B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ Function3 D;
    public final /* synthetic */ Function0 E;
    public final /* synthetic */ CoroutineScope F;
    public final /* synthetic */ boolean G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f10328z;

    public ModalBottomSheetKt$ModalBottomSheetContent$7(Function2 function2, Animatable animatable, SheetState sheetState, Function2 function22, Function3 function3, Function0 function0, CoroutineScope coroutineScope, boolean z2) {
        this.f10328z = function2;
        this.f10326A = animatable;
        this.f10327B = sheetState;
        this.C = function22;
        this.D = function3;
        this.E = function0;
        this.F = coroutineScope;
        this.G = z2;
    }

    public static final Unit e(Animatable animatable, GraphicsLayerScope graphicsLayerScope) {
        float floatValue = ((Number) animatable.m()).floatValue();
        float O = ModalBottomSheetKt.R(graphicsLayerScope, floatValue);
        float P = ModalBottomSheetKt.S(graphicsLayerScope, floatValue);
        graphicsLayerScope.i(P == 0.0f ? 1.0f : O / P);
        graphicsLayerScope.Q1(ModalBottomSheetKt.f10319c);
        return Unit.f40552a;
    }

    public final void c(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if (composer2.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(728743275, i3, -1, "androidx.compose.material3.ModalBottomSheetContent.<anonymous> (ModalBottomSheet.kt:359)");
            }
            Modifier e2 = WindowInsetsPaddingKt.e(SizeKt.h(Modifier.f15489d, 0.0f, 1, (Object) null), (WindowInsets) this.f10328z.m(composer2, 0));
            boolean l2 = composer2.l(this.f10326A);
            Animatable animatable = this.f10326A;
            Object g2 = composer.g();
            if (l2 || g2 == Composer.f14567a.a()) {
                g2 = new O3(animatable);
                composer2.N(g2);
            }
            Modifier s2 = BottomSheetScaffoldKt.s(GraphicsLayerModifierKt.a(e2, (Function1) g2), this.f10327B);
            Function2 function2 = this.C;
            Function3 function3 = this.D;
            SheetState sheetState = this.f10327B;
            Function0 function0 = this.E;
            CoroutineScope coroutineScope = this.F;
            boolean z2 = this.G;
            MeasurePolicy a2 = ColumnKt.a(Arrangement.f3739a.g(), Alignment.f15444a.k(), composer2, 0);
            int a3 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I = composer.I();
            Modifier e3 = ComposedModifierKt.e(composer2, s2);
            ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
            Function0 a4 = companion.a();
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
            Updater.g(b2, a2, companion.c());
            Updater.g(b2, I, companion.e());
            Function2 b3 = companion.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a3))) {
                b2.N(Integer.valueOf(a3));
                b2.A(Integer.valueOf(a3), b3);
            }
            Updater.g(b2, e3, companion.d());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3815a;
            if (function2 != null) {
                composer2.X(1352934765);
                Strings.Companion companion2 = Strings.f12320b;
                SheetDefaultsKt.g(columnScopeInstance, ComposableLambdaKt.e(2000500644, true, new ModalBottomSheetKt$ModalBottomSheetContent$7$2$1(sheetState, function0, coroutineScope, z2, Strings_androidKt.b(Strings.a(R.string.f10655b), composer2, 0), Strings_androidKt.b(Strings.a(R.string.f10657d), composer2, 0), Strings_androidKt.b(Strings.a(R.string.f10654a), composer2, 0), function2), composer2, 54), composer2, 54);
                composer.M();
            } else {
                composer2.X(1356009965);
                composer.M();
            }
            function3.d(columnScopeInstance, composer2, 6);
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
