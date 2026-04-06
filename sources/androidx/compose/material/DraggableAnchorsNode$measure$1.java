package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;

@Metadata
public final class DraggableAnchorsNode$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ DraggableAnchorsNode f7700A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Placeable f7701B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MeasureScope f7702z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DraggableAnchorsNode$measure$1(MeasureScope measureScope, DraggableAnchorsNode draggableAnchorsNode, Placeable placeable) {
        super(1);
        this.f7702z = measureScope;
        this.f7700A = draggableAnchorsNode;
        this.f7701B = placeable;
    }

    public final void b(Placeable.PlacementScope placementScope) {
        float c2 = this.f7702z.w1() ? this.f7700A.a3().o().c(this.f7700A.a3().x()) : this.f7700A.a3().A();
        float f2 = this.f7700A.Z2() == Orientation.Horizontal ? c2 : 0.0f;
        if (this.f7700A.Z2() != Orientation.Vertical) {
            c2 = 0.0f;
        }
        Placeable.PlacementScope.j(placementScope, this.f7701B, MathKt.d(f2), MathKt.d(c2), 0.0f, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Placeable.PlacementScope) obj);
        return Unit.f40552a;
    }
}
