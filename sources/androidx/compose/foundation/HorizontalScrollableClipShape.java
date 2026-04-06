package androidx.compose.foundation;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

@Metadata
final class HorizontalScrollableClipShape implements Shape {

    /* renamed from: a  reason: collision with root package name */
    public static final HorizontalScrollableClipShape f3079a = new HorizontalScrollableClipShape();

    public Outline a(long j2, LayoutDirection layoutDirection, Density density) {
        float P1 = (float) density.P1(ClipScrollableContainerKt.b());
        return new Outline.Rectangle(new Rect(0.0f, -P1, Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) + P1));
    }
}
