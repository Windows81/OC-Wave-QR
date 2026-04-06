package androidx.compose.material3;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import kotlin.jvm.functions.Function1;

/* renamed from: androidx.compose.material3.j4  reason: case insensitive filesystem */
public final /* synthetic */ class C0158j4 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f12477A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DrawerPredictiveBackState f12478z;

    public /* synthetic */ C0158j4(DrawerPredictiveBackState drawerPredictiveBackState, boolean z2) {
        this.f12478z = drawerPredictiveBackState;
        this.f12477A = z2;
    }

    public final Object invoke(Object obj) {
        return NavigationDrawerKt.F(this.f12478z, this.f12477A, (GraphicsLayerScope) obj);
    }
}
