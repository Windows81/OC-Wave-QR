package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

@Metadata
final class OuterPlacementScope extends Placeable.PlacementScope {

    /* renamed from: b  reason: collision with root package name */
    public final Owner f17137b;

    public OuterPlacementScope(Owner owner) {
        this.f17137b = owner;
    }

    public LayoutCoordinates e() {
        return this.f17137b.getRoot().y0();
    }

    public LayoutDirection f() {
        return this.f17137b.getLayoutDirection();
    }

    public int g() {
        return this.f17137b.getRoot().G0();
    }
}
