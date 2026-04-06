package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
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
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata
public final class ModalBottomSheetKt$ModalBottomSheet$4 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f10321A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ SheetState f10322B;
    public final /* synthetic */ ModalBottomSheetProperties C;
    public final /* synthetic */ Animatable D;
    public final /* synthetic */ CoroutineScope E;
    public final /* synthetic */ Function1 F;
    public final /* synthetic */ Modifier G;
    public final /* synthetic */ float H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ Shape J;
    public final /* synthetic */ long K;
    public final /* synthetic */ long L;
    public final /* synthetic */ float M;
    public final /* synthetic */ Function2 N;
    public final /* synthetic */ Function2 O;
    public final /* synthetic */ Function3 P;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f10323z;

    public ModalBottomSheetKt$ModalBottomSheet$4(long j2, Function0 function0, SheetState sheetState, ModalBottomSheetProperties modalBottomSheetProperties, Animatable animatable, CoroutineScope coroutineScope, Function1 function1, Modifier modifier, float f2, boolean z2, Shape shape, long j3, long j4, float f3, Function2 function2, Function2 function22, Function3 function3) {
        this.f10323z = j2;
        this.f10321A = function0;
        this.f10322B = sheetState;
        this.C = modalBottomSheetProperties;
        this.D = animatable;
        this.E = coroutineScope;
        this.F = function1;
        this.G = modifier;
        this.H = f2;
        this.I = z2;
        this.J = shape;
        this.K = j3;
        this.L = j4;
        this.M = f3;
        this.N = function2;
        this.O = function22;
        this.P = function3;
    }

    /* access modifiers changed from: private */
    public static final Unit e(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.H0(semanticsPropertyReceiver, true);
        return Unit.f40552a;
    }

    public final void c(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if (composer2.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1010026864, i3, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.kt:185)");
            }
            Modifier a2 = WindowInsetsPadding_androidKt.a(SizeKt.f(Modifier.f15489d, 0.0f, 1, (Object) null));
            Object g2 = composer.g();
            if (g2 == Composer.f14567a.a()) {
                g2 = new N3();
                composer2.N(g2);
            }
            Modifier d2 = SemanticsModifierKt.d(a2, false, (Function1) g2, 1, (Object) null);
            long j2 = this.f10323z;
            Function0 function0 = this.f10321A;
            SheetState sheetState = this.f10322B;
            ModalBottomSheetProperties modalBottomSheetProperties = this.C;
            Animatable animatable = this.D;
            CoroutineScope coroutineScope = this.E;
            Function1 function1 = this.F;
            Modifier modifier = this.G;
            float f2 = this.H;
            boolean z2 = this.I;
            Shape shape = this.J;
            Function0 function02 = function0;
            long j3 = this.K;
            long j4 = this.L;
            float f3 = this.M;
            Function2 function2 = this.N;
            float f4 = f3;
            Function2 function22 = this.O;
            Function3 function3 = this.P;
            MeasurePolicy g3 = BoxKt.g(Alignment.f15444a.o(), false);
            int a3 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I2 = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer2, d2);
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
            Function3 function32 = function3;
            Updater.g(b2, g3, companion.c());
            Updater.g(b2, I2, companion.e());
            Function2 b3 = companion.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a3))) {
                b2.N(Integer.valueOf(a3));
                b2.A(Integer.valueOf(a3), b3);
            }
            Updater.g(b2, e2, companion.d());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
            ModalBottomSheetKt.H(j2, function02, sheetState.q() != SheetValue.Hidden, modalBottomSheetProperties.e(), composer, 0);
            ModalBottomSheetKt.t(boxScopeInstance, animatable, coroutineScope, function02, function1, modifier, sheetState, f2, z2, shape, j3, j4, f4, function2, function22, function32, composer, 6 | (Animatable.f2421m << 3), 0, 0);
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
