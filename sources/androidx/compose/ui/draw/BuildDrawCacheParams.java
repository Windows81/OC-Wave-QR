package androidx.compose.ui.draw;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

@Metadata
public interface BuildDrawCacheParams {
    long c();

    Density getDensity();

    LayoutDirection getLayoutDirection();
}
