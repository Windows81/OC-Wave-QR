package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class s8 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ModalWideNavigationRailState f12700A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ RailPredictiveBackState f12701B;
    public final /* synthetic */ boolean C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Animatable f12702z;

    public /* synthetic */ s8(Animatable animatable, ModalWideNavigationRailState modalWideNavigationRailState, RailPredictiveBackState railPredictiveBackState, boolean z2) {
        this.f12702z = animatable;
        this.f12700A = modalWideNavigationRailState;
        this.f12701B = railPredictiveBackState;
        this.C = z2;
    }

    public final Object invoke(Object obj) {
        return WideNavigationRailKt.q(this.f12702z, this.f12700A, this.f12701B, this.C, (GraphicsLayerScope) obj);
    }
}
