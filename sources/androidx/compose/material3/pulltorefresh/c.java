package androidx.compose.material3.pulltorefresh;

import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.functions.Function3;

public final /* synthetic */ class c implements Function3 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f12622A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ float f12623B;
    public final /* synthetic */ float C;
    public final /* synthetic */ Shape D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PullToRefreshState f12624z;

    public /* synthetic */ c(PullToRefreshState pullToRefreshState, boolean z2, float f2, float f3, Shape shape) {
        this.f12624z = pullToRefreshState;
        this.f12622A = z2;
        this.f12623B = f2;
        this.C = f3;
        this.D = shape;
    }

    public final Object d(Object obj, Object obj2, Object obj3) {
        return PullToRefreshDefaults.j(this.f12624z, this.f12622A, this.f12623B, this.C, this.D, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
    }
}
