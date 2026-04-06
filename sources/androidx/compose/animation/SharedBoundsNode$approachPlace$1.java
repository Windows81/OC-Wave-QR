package androidx.compose.animation;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SharedBoundsNode$approachPlace$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Placeable f2302A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SharedBoundsNode f2303z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SharedBoundsNode$approachPlace$1(SharedBoundsNode sharedBoundsNode, Placeable placeable) {
        super(1);
        this.f2303z = sharedBoundsNode;
        this.f2302A = placeable;
    }

    public final void b(Placeable.PlacementScope placementScope) {
        LayoutCoordinates e2 = placementScope.e();
        if (e2 != null) {
            this.f2303z.o3(e2);
        }
        Placeable.PlacementScope.j(placementScope, this.f2302A, 0, 0, 0.0f, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Placeable.PlacementScope) obj);
        return Unit.f40552a;
    }
}
