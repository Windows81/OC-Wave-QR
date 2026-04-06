package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOriginKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
public final class WideNavigationRailKt$ModalWideNavigationRailContent$5 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ RailPredictiveBackState f11757A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f11758B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ WideNavigationRailColors D;
    public final /* synthetic */ Shape E;
    public final /* synthetic */ Function2 F;
    public final /* synthetic */ WindowInsets G;
    public final /* synthetic */ Arrangement.Vertical H;
    public final /* synthetic */ Function2 I;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Animatable f11759z;

    public WideNavigationRailKt$ModalWideNavigationRailContent$5(Animatable animatable, RailPredictiveBackState railPredictiveBackState, boolean z2, boolean z3, WideNavigationRailColors wideNavigationRailColors, Shape shape, Function2 function2, WindowInsets windowInsets, Arrangement.Vertical vertical, Function2 function22) {
        this.f11759z = animatable;
        this.f11757A = railPredictiveBackState;
        this.f11758B = z2;
        this.C = z3;
        this.D = wideNavigationRailColors;
        this.E = shape;
        this.F = function2;
        this.G = windowInsets;
        this.H = vertical;
        this.I = function22;
    }

    public static final Unit e(Animatable animatable, RailPredictiveBackState railPredictiveBackState, boolean z2, GraphicsLayerScope graphicsLayerScope) {
        float floatValue = ((Number) animatable.m()).floatValue();
        float f2 = 0.0f;
        if (floatValue <= 0.0f) {
            return Unit.f40552a;
        }
        float Z = WideNavigationRailKt.g0(graphicsLayerScope, floatValue, railPredictiveBackState.a());
        graphicsLayerScope.j(Z == 0.0f ? 1.0f : WideNavigationRailKt.h0(graphicsLayerScope, floatValue) / Z);
        if (!z2) {
            f2 = 1.0f;
        }
        graphicsLayerScope.Q1(TransformOriginKt.a(f2, 0.5f));
        return Unit.f40552a;
    }

    public final void c(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1043835354, i2, -1, "androidx.compose.material3.ModalWideNavigationRailContent.<anonymous> (WideNavigationRail.kt:1044)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            boolean l2 = composer.l(this.f11759z) | composer.W(this.f11757A) | composer.d(this.f11758B);
            Animatable animatable = this.f11759z;
            RailPredictiveBackState railPredictiveBackState = this.f11757A;
            boolean z2 = this.f11758B;
            Object g2 = composer.g();
            if (l2 || g2 == Composer.f14567a.a()) {
                g2 = new z8(animatable, railPredictiveBackState, z2);
                composer.N(g2);
            }
            WideNavigationRailKt.C(GraphicsLayerModifierKt.a(companion, (Function1) g2), true, this.C, this.D, this.E, this.F, this.G, this.H, this.I, composer, 48);
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
