package androidx.compose.ui.graphics;

import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BlockGraphicsLayerModifier$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ BlockGraphicsLayerModifier f15956A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Placeable f15957z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlockGraphicsLayerModifier$measure$1(Placeable placeable, BlockGraphicsLayerModifier blockGraphicsLayerModifier) {
        super(1);
        this.f15957z = placeable;
        this.f15956A = blockGraphicsLayerModifier;
    }

    public final void b(Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.x(placementScope, this.f15957z, 0, 0, 0.0f, this.f15956A.Z2(), 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Placeable.PlacementScope) obj);
        return Unit.f40552a;
    }
}
