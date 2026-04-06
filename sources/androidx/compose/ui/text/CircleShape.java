package androidx.compose.ui.text;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

@Metadata
final class CircleShape implements Shape {

    /* renamed from: a  reason: collision with root package name */
    public static final CircleShape f18266a = new CircleShape();

    public Outline a(long j2, LayoutDirection layoutDirection, Density density) {
        float h2 = Size.h(j2) / 2.0f;
        long b2 = CornerRadius.b((((long) Float.floatToRawIntBits(h2)) & 4294967295L) | (((long) Float.floatToRawIntBits(h2)) << 32));
        return new Outline.Rounded(RoundRectKt.c(SizeKt.c(j2), b2, b2, b2, b2));
    }
}
