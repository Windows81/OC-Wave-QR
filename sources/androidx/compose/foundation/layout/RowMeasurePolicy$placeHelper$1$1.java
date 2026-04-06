package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class RowMeasurePolicy$placeHelper$1$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ RowMeasurePolicy f4147A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f4148B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int[] D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Placeable[] f4149z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RowMeasurePolicy$placeHelper$1$1(Placeable[] placeableArr, RowMeasurePolicy rowMeasurePolicy, int i2, int i3, int[] iArr) {
        super(1);
        this.f4149z = placeableArr;
        this.f4147A = rowMeasurePolicy;
        this.f4148B = i2;
        this.C = i3;
        this.D = iArr;
    }

    public final void b(Placeable.PlacementScope placementScope) {
        Placeable[] placeableArr = this.f4149z;
        RowMeasurePolicy rowMeasurePolicy = this.f4147A;
        int i2 = this.f4148B;
        int i3 = this.C;
        int[] iArr = this.D;
        int length = placeableArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            Placeable placeable = placeableArr[i4];
            Intrinsics.f(placeable);
            Placeable.PlacementScope.j(placementScope, placeable, iArr[i5], rowMeasurePolicy.r(placeable, RowColumnImplKt.d(placeable), i2, i3), 0.0f, 4, (Object) null);
            i4++;
            i5++;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Placeable.PlacementScope) obj);
        return Unit.f40552a;
    }
}
