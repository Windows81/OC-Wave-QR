package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class PlaceableKt {

    /* renamed from: a  reason: collision with root package name */
    public static final Function1 f17144a = PlaceableKt$DefaultLayerBlock$1.f17146z;

    /* renamed from: b  reason: collision with root package name */
    public static final long f17145b = ConstraintsKt.b(0, 0, 0, 0, 15, (Object) null);

    public static final Placeable.PlacementScope a(LookaheadCapablePlaceable lookaheadCapablePlaceable) {
        return new LookaheadCapablePlacementScope(lookaheadCapablePlaceable);
    }

    public static final Placeable.PlacementScope b(Owner owner) {
        return new OuterPlacementScope(owner);
    }
}
