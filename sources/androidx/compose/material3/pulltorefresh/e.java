package androidx.compose.material3.pulltorefresh;

import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class e implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PullToRefreshState f12628A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f12629B;
    public final /* synthetic */ float C;
    public final /* synthetic */ float D;
    public final /* synthetic */ Shape E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Placeable f12630z;

    public /* synthetic */ e(Placeable placeable, PullToRefreshState pullToRefreshState, boolean z2, float f2, float f3, Shape shape) {
        this.f12630z = placeable;
        this.f12628A = pullToRefreshState;
        this.f12629B = z2;
        this.C = f2;
        this.D = f3;
        this.E = shape;
    }

    public final Object invoke(Object obj) {
        return PullToRefreshDefaults.k(this.f12630z, this.f12628A, this.f12629B, this.C, this.D, this.E, (Placeable.PlacementScope) obj);
    }
}
