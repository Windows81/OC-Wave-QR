package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class z8 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ RailPredictiveBackState f14525A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f14526B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Animatable f14527z;

    public /* synthetic */ z8(Animatable animatable, RailPredictiveBackState railPredictiveBackState, boolean z2) {
        this.f14527z = animatable;
        this.f14525A = railPredictiveBackState;
        this.f14526B = z2;
    }

    public final Object invoke(Object obj) {
        return WideNavigationRailKt$ModalWideNavigationRailContent$5.e(this.f14527z, this.f14525A, this.f14526B, (GraphicsLayerScope) obj);
    }
}
