package androidx.compose.ui.draw;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import kotlin.Metadata;

@Metadata
public final class PainterModifierKt {
    public static final Modifier a(Modifier modifier, Painter painter, boolean z2, Alignment alignment, ContentScale contentScale, float f2, ColorFilter colorFilter) {
        return modifier.o0(new PainterElement(painter, z2, alignment, contentScale, f2, colorFilter));
    }

    public static /* synthetic */ Modifier b(Modifier modifier, Painter painter, boolean z2, Alignment alignment, ContentScale contentScale, float f2, ColorFilter colorFilter, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        boolean z3 = z2;
        if ((i2 & 4) != 0) {
            alignment = Alignment.f15444a.e();
        }
        Alignment alignment2 = alignment;
        if ((i2 & 8) != 0) {
            contentScale = ContentScale.f17026a.e();
        }
        ContentScale contentScale2 = contentScale;
        if ((i2 & 16) != 0) {
            f2 = 1.0f;
        }
        float f3 = f2;
        if ((i2 & 32) != 0) {
            colorFilter = null;
        }
        return a(modifier, painter, z3, alignment2, contentScale2, f3, colorFilter);
    }
}
