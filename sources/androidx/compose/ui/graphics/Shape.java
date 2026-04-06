package androidx.compose.ui.graphics;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

@Metadata
public interface Shape {
    Outline a(long j2, LayoutDirection layoutDirection, Density density);
}
