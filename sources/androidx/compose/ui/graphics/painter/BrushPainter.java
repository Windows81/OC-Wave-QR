package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class BrushPainter extends Painter {
    public final Brush F;
    public float G;
    public ColorFilter H;

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
        return (obj instanceof BrushPainter) && Intrinsics.d(this.F, ((BrushPainter) obj).F);
    }

    public int hashCode() {
        return this.F.hashCode();
    }

    public long k() {
        return this.F.b();
    }

    public void m(DrawScope drawScope) {
        DrawScope.G0(drawScope, this.F, 0, 0, this.G, (DrawStyle) null, this.H, 0, 86, (Object) null);
    }

    public String toString() {
        return "BrushPainter(brush=" + this.F + ')';
    }
}
