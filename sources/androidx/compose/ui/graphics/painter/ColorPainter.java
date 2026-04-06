package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import kotlin.Metadata;

@Metadata
public final class ColorPainter extends Painter {
    public final long F;
    public float G;
    public ColorFilter H;
    public final long I;

    public boolean a(float f2) {
        this.G = f2;
        return true;
    }

    public boolean b(ColorFilter colorFilter) {
        this.H = colorFilter;
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ColorPainter) && Color.n(this.F, ((ColorPainter) obj).F);
    }

    public int hashCode() {
        return Color.t(this.F);
    }

    public long k() {
        return this.I;
    }

    public void m(DrawScope drawScope) {
        DrawScope.A1(drawScope, this.F, 0, 0, this.G, (DrawStyle) null, this.H, 0, 86, (Object) null);
    }

    public String toString() {
        return "ColorPainter(color=" + Color.u(this.F) + ')';
    }
}
