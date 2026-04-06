package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class WrapContentNode$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f4296A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Placeable f4297B;
    public final /* synthetic */ int C;
    public final /* synthetic */ MeasureScope D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ WrapContentNode f4298z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WrapContentNode$measure$1(WrapContentNode wrapContentNode, int i2, Placeable placeable, int i3, MeasureScope measureScope) {
        super(1);
        this.f4298z = wrapContentNode;
        this.f4296A = i2;
        this.f4297B = placeable;
        this.C = i3;
        this.D = measureScope;
    }

    public final void b(Placeable.PlacementScope placementScope) {
        Function2 Z2 = this.f4298z.Z2();
        int L0 = this.f4296A - this.f4297B.L0();
        long r2 = ((IntOffset) Z2.m(IntSize.b(IntSize.c((((long) (this.C - this.f4297B.C0())) & 4294967295L) | (((long) L0) << 32))), this.D.getLayoutDirection())).r();
        Placeable.PlacementScope.l(placementScope, this.f4297B, r2, 0.0f, 2, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Placeable.PlacementScope) obj);
        return Unit.f40552a;
    }
}
