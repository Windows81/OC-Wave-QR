package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
public final class BoxMeasurePolicy$measure$5 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ List f3794A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ MeasureScope f3795B;
    public final /* synthetic */ Ref.IntRef C;
    public final /* synthetic */ Ref.IntRef D;
    public final /* synthetic */ BoxMeasurePolicy E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Placeable[] f3796z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BoxMeasurePolicy$measure$5(Placeable[] placeableArr, List list, MeasureScope measureScope, Ref.IntRef intRef, Ref.IntRef intRef2, BoxMeasurePolicy boxMeasurePolicy) {
        super(1);
        this.f3796z = placeableArr;
        this.f3794A = list;
        this.f3795B = measureScope;
        this.C = intRef;
        this.D = intRef2;
        this.E = boxMeasurePolicy;
    }

    public final void b(Placeable.PlacementScope placementScope) {
        Placeable[] placeableArr = this.f3796z;
        List list = this.f3794A;
        MeasureScope measureScope = this.f3795B;
        Ref.IntRef intRef = this.C;
        Ref.IntRef intRef2 = this.D;
        BoxMeasurePolicy boxMeasurePolicy = this.E;
        int length = placeableArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            Placeable placeable = placeableArr[i2];
            Intrinsics.g(placeable, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
            BoxKt.h(placementScope, placeable, (Measurable) list.get(i3), measureScope.getLayoutDirection(), intRef.f40906z, intRef2.f40906z, boxMeasurePolicy.f3788a);
            i2++;
            i3++;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Placeable.PlacementScope) obj);
        return Unit.f40552a;
    }
}
