package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

@Metadata
public final class RectangleShapeKt$RectangleShape$1 implements Shape {
    /* renamed from: b */
    public Outline.Rectangle a(long j2, LayoutDirection layoutDirection, Density density) {
        return new Outline.Rectangle(SizeKt.c(j2));
    }

    public String toString() {
        return "RectangleShape";
    }
}
