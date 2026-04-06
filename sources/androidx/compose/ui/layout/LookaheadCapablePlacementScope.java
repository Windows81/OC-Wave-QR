package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

@Metadata
final class LookaheadCapablePlacementScope extends Placeable.PlacementScope {

    /* renamed from: b  reason: collision with root package name */
    public final LookaheadCapablePlaceable f17098b;

    public LookaheadCapablePlacementScope(LookaheadCapablePlaceable lookaheadCapablePlaceable) {
        this.f17098b = lookaheadCapablePlaceable;
    }

    public float d(Ruler ruler, float f2) {
        return this.f17098b.c1(ruler, f2);
    }

    public LayoutCoordinates e() {
        LayoutCoordinates e1 = this.f17098b.C1() ? null : this.f17098b.e1();
        if (e1 == null) {
            this.f17098b.X1().f0().I();
        }
        return e1;
    }

    public LayoutDirection f() {
        return this.f17098b.getLayoutDirection();
    }

    public int g() {
        return this.f17098b.H0();
    }
}
