package androidx.compose.material3.pulltorefresh;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class f implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f12631A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ float f12632B;
    public final /* synthetic */ float C;
    public final /* synthetic */ Shape D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PullToRefreshState f12633z;

    public /* synthetic */ f(PullToRefreshState pullToRefreshState, boolean z2, float f2, float f3, Shape shape) {
        this.f12633z = pullToRefreshState;
        this.f12631A = z2;
        this.f12632B = f2;
        this.C = f3;
        this.D = shape;
    }

    public final Object invoke(Object obj) {
        return PullToRefreshDefaults.l(this.f12633z, this.f12631A, this.f12632B, this.C, this.D, (GraphicsLayerScope) obj);
    }
}
