package androidx.compose.ui;

import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ZIndexNode$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ZIndexNode f15551A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Placeable f15552z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ZIndexNode$measure$1(Placeable placeable, ZIndexNode zIndexNode) {
        super(1);
        this.f15552z = placeable;
        this.f15551A = zIndexNode;
    }

    public final void b(Placeable.PlacementScope placementScope) {
        placementScope.i(this.f15552z, 0, 0, this.f15551A.Z2());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Placeable.PlacementScope) obj);
        return Unit.f40552a;
    }
}
