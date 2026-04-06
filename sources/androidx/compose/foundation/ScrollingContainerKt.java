package androidx.compose.foundation;

import androidx.compose.foundation.gestures.BringIntoViewSpec;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;

@Metadata
public final class ScrollingContainerKt {
    public static final Modifier a(Modifier modifier, ScrollableState scrollableState, Orientation orientation, boolean z2, boolean z3, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, boolean z4, OverscrollEffect overscrollEffect, BringIntoViewSpec bringIntoViewSpec) {
        Modifier modifier2 = modifier;
        return ClipScrollableContainerKt.a(modifier, orientation).o0(new ScrollingContainerElement(scrollableState, orientation, z2, z3, flingBehavior, mutableInteractionSource, bringIntoViewSpec, z4, overscrollEffect));
    }

    public static /* synthetic */ Modifier b(Modifier modifier, ScrollableState scrollableState, Orientation orientation, boolean z2, boolean z3, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, boolean z4, OverscrollEffect overscrollEffect, BringIntoViewSpec bringIntoViewSpec, int i2, Object obj) {
        return a(modifier, scrollableState, orientation, z2, z3, flingBehavior, mutableInteractionSource, z4, overscrollEffect, (i2 & 256) != 0 ? null : bringIntoViewSpec);
    }
}
