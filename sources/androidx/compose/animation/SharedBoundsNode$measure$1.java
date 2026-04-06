package androidx.compose.animation;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SharedBoundsNode$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SharedBoundsNode f2308A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f2309B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Placeable f2310z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SharedBoundsNode$measure$1(Placeable placeable, SharedBoundsNode sharedBoundsNode, long j2) {
        super(1);
        this.f2310z = placeable;
        this.f2308A = sharedBoundsNode;
        this.f2309B = j2;
    }

    public final void b(Placeable.PlacementScope placementScope) {
        Offset offset;
        LayoutCoordinates e2 = placementScope.e();
        if (e2 != null) {
            SharedBoundsNode sharedBoundsNode = this.f2308A;
            long j2 = this.f2309B;
            long N = sharedBoundsNode.i3().N(e2, Offset.f15855b.c());
            if (sharedBoundsNode.j3().c() == null) {
                sharedBoundsNode.j3().p(RectKt.c(N, j2));
            }
            offset = Offset.d(N);
        } else {
            offset = null;
        }
        Placeable.PlacementScope.j(placementScope, this.f2310z, 0, 0, 0.0f, 4, (Object) null);
        if (offset != null) {
            SharedBoundsNode sharedBoundsNode2 = this.f2308A;
            sharedBoundsNode2.j3().m(sharedBoundsNode2.k3(), this.f2309B, offset.t());
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Placeable.PlacementScope) obj);
        return Unit.f40552a;
    }
}
