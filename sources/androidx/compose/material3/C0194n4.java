package androidx.compose.material3;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import kotlin.jvm.functions.Function1;

/* renamed from: androidx.compose.material3.n4  reason: case insensitive filesystem */
public final /* synthetic */ class C0194n4 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f12537A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DrawerPredictiveBackState f12538z;

    public /* synthetic */ C0194n4(DrawerPredictiveBackState drawerPredictiveBackState, boolean z2) {
        this.f12538z = drawerPredictiveBackState;
        this.f12537A = z2;
    }

    public final Object invoke(Object obj) {
        return NavigationDrawerKt.H(this.f12538z, this.f12537A, (GraphicsLayerScope) obj);
    }
}
