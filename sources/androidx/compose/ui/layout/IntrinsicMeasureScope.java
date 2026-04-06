package androidx.compose.ui.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

@Metadata
public interface IntrinsicMeasureScope extends Density {
    LayoutDirection getLayoutDirection();

    boolean w1() {
        return false;
    }
}
