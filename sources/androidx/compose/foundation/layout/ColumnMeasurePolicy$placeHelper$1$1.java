package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ColumnMeasurePolicy$placeHelper$1$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ColumnMeasurePolicy f3812A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f3813B;
    public final /* synthetic */ int C;
    public final /* synthetic */ MeasureScope D;
    public final /* synthetic */ int[] E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Placeable[] f3814z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ColumnMeasurePolicy$placeHelper$1$1(Placeable[] placeableArr, ColumnMeasurePolicy columnMeasurePolicy, int i2, int i3, MeasureScope measureScope, int[] iArr) {
        super(1);
        this.f3814z = placeableArr;
        this.f3812A = columnMeasurePolicy;
        this.f3813B = i2;
        this.C = i3;
        this.D = measureScope;
        this.E = iArr;
    }

    public final void b(Placeable.PlacementScope placementScope) {
        Placeable[] placeableArr = this.f3814z;
        ColumnMeasurePolicy columnMeasurePolicy = this.f3812A;
        int i2 = this.f3813B;
        int i3 = this.C;
        MeasureScope measureScope = this.D;
        int[] iArr = this.E;
        int length = placeableArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            Placeable placeable = placeableArr[i4];
            Intrinsics.f(placeable);
            Placeable.PlacementScope.j(placementScope, placeable, columnMeasurePolicy.r(placeable, RowColumnImplKt.d(placeable), i2, i3, measureScope.getLayoutDirection()), iArr[i5], 0.0f, 4, (Object) null);
            i4++;
            i5++;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Placeable.PlacementScope) obj);
        return Unit.f40552a;
    }
}
