package androidx.compose.foundation.layout;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class FlowLayoutKt$placeHelper$3 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MutableVector f3956z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowLayoutKt$placeHelper$3(MutableVector mutableVector) {
        super(1);
        this.f3956z = mutableVector;
    }

    public final void b(Placeable.PlacementScope placementScope) {
        MutableVector mutableVector = this.f3956z;
        Object[] objArr = mutableVector.f15005z;
        int p2 = mutableVector.p();
        for (int i2 = 0; i2 < p2; i2++) {
            ((MeasureResult) objArr[i2]).r();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Placeable.PlacementScope) obj);
        return Unit.f40552a;
    }
}
