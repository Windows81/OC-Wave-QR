package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class u8 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f14427A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Animatable f14428B;
    public final /* synthetic */ RailPredictiveBackState C;
    public final /* synthetic */ Function2 D;
    public final /* synthetic */ Modifier E;
    public final /* synthetic */ ModalWideNavigationRailState F;
    public final /* synthetic */ WideNavigationRailColors G;
    public final /* synthetic */ Shape H;
    public final /* synthetic */ float I;
    public final /* synthetic */ Function2 J;
    public final /* synthetic */ WindowInsets K;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ Arrangement.Vertical M;
    public final /* synthetic */ Function2 N;
    public final /* synthetic */ int O;
    public final /* synthetic */ int P;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f14429z;

    public /* synthetic */ u8(boolean z2, boolean z3, Animatable animatable, RailPredictiveBackState railPredictiveBackState, Function2 function2, Modifier modifier, ModalWideNavigationRailState modalWideNavigationRailState, WideNavigationRailColors wideNavigationRailColors, Shape shape, float f2, Function2 function22, WindowInsets windowInsets, boolean z4, Arrangement.Vertical vertical, Function2 function23, int i2, int i3) {
        this.f14429z = z2;
        this.f14427A = z3;
        this.f14428B = animatable;
        this.C = railPredictiveBackState;
        this.D = function2;
        this.E = modifier;
        this.F = modalWideNavigationRailState;
        this.G = wideNavigationRailColors;
        this.H = shape;
        this.I = f2;
        this.J = function22;
        this.K = windowInsets;
        this.L = z4;
        this.M = vertical;
        this.N = function23;
        this.O = i2;
        this.P = i3;
    }

    public final Object m(Object obj, Object obj2) {
        int intValue = ((Integer) obj2).intValue();
        return WideNavigationRailKt.t(this.f14429z, this.f14427A, this.f14428B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, (Composer) obj, intValue);
    }
}
