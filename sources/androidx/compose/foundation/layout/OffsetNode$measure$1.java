package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class OffsetNode$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Placeable f4094A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ MeasureScope f4095B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ OffsetNode f4096z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OffsetNode$measure$1(OffsetNode offsetNode, Placeable placeable, MeasureScope measureScope) {
        super(1);
        this.f4096z = offsetNode;
        this.f4094A = placeable;
        this.f4095B = measureScope;
    }

    public final void b(Placeable.PlacementScope placementScope) {
        if (this.f4096z.Z2()) {
            Placeable.PlacementScope.n(placementScope, this.f4094A, this.f4095B.P1(this.f4096z.a3()), this.f4095B.P1(this.f4096z.b3()), 0.0f, 4, (Object) null);
            return;
        }
        Placeable.PlacementScope.j(placementScope, this.f4094A, this.f4095B.P1(this.f4096z.a3()), this.f4095B.P1(this.f4096z.b3()), 0.0f, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Placeable.PlacementScope) obj);
        return Unit.f40552a;
    }
}
