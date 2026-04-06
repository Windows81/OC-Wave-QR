package androidx.compose.ui.graphics;

import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SimpleGraphicsLayerModifier$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SimpleGraphicsLayerModifier f16122A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Placeable f16123z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SimpleGraphicsLayerModifier$measure$1(Placeable placeable, SimpleGraphicsLayerModifier simpleGraphicsLayerModifier) {
        super(1);
        this.f16123z = placeable;
        this.f16122A = simpleGraphicsLayerModifier;
    }

    public final void b(Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.x(placementScope, this.f16123z, 0, 0, 0.0f, this.f16122A.e0, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Placeable.PlacementScope) obj);
        return Unit.f40552a;
    }
}
