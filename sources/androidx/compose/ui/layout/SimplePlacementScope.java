package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

@Metadata
final class SimplePlacementScope extends Placeable.PlacementScope {

    /* renamed from: b  reason: collision with root package name */
    public final int f17154b;

    /* renamed from: c  reason: collision with root package name */
    public final LayoutDirection f17155c;

    public SimplePlacementScope(int i2, LayoutDirection layoutDirection) {
        this.f17154b = i2;
        this.f17155c = layoutDirection;
    }

    public LayoutDirection f() {
        return this.f17155c;
    }

    public int g() {
        return this.f17154b;
    }
}
