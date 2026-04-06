package androidx.compose.ui.layout;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

@Metadata
public interface LayoutInfo {
    boolean b();

    LayoutDirection getLayoutDirection();

    boolean u();

    int v();

    LayoutCoordinates w();

    boolean x() {
        return false;
    }
}
