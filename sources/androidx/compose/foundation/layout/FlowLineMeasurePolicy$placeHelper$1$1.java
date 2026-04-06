package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class FlowLineMeasurePolicy$placeHelper$1$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f3989A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f3990B;
    public final /* synthetic */ int C;
    public final /* synthetic */ Placeable[] D;
    public final /* synthetic */ FlowLineMeasurePolicy E;
    public final /* synthetic */ int F;
    public final /* synthetic */ LayoutDirection G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int[] I;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int[] f3991z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowLineMeasurePolicy$placeHelper$1$1(int[] iArr, int i2, int i3, int i4, Placeable[] placeableArr, FlowLineMeasurePolicy flowLineMeasurePolicy, int i5, LayoutDirection layoutDirection, int i6, int[] iArr2) {
        super(1);
        this.f3991z = iArr;
        this.f3989A = i2;
        this.f3990B = i3;
        this.C = i4;
        this.D = placeableArr;
        this.E = flowLineMeasurePolicy;
        this.F = i5;
        this.G = layoutDirection;
        this.H = i6;
        this.I = iArr2;
    }

    public final void b(Placeable.PlacementScope placementScope) {
        int[] iArr = this.f3991z;
        int i2 = iArr != null ? iArr[this.f3989A] : 0;
        for (int i3 = this.f3990B; i3 < this.C; i3++) {
            Placeable placeable = this.D[i3];
            Intrinsics.f(placeable);
            int p2 = this.E.p(placeable, this.F, this.G, this.H) + i2;
            if (this.E.o()) {
                Placeable.PlacementScope.j(placementScope, placeable, this.I[i3 - this.f3990B], p2, 0.0f, 4, (Object) null);
            } else {
                Placeable.PlacementScope.j(placementScope, placeable, p2, this.I[i3 - this.f3990B], 0.0f, 4, (Object) null);
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Placeable.PlacementScope) obj);
        return Unit.f40552a;
    }
}
