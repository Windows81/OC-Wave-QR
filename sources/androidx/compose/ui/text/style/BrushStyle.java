package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ShaderBrush;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class BrushStyle implements TextForegroundStyle {

    /* renamed from: b  reason: collision with root package name */
    public final ShaderBrush f19024b;

    /* renamed from: c  reason: collision with root package name */
    public final float f19025c;

    public BrushStyle(ShaderBrush shaderBrush, float f2) {
        this.f19024b = shaderBrush;
        this.f19025c = f2;
    }

    public float c() {
        return this.f19025c;
    }

    public Brush d() {
        return this.f19024b;
    }

    public final ShaderBrush e() {
        return this.f19024b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrushStyle)) {
            return false;
        }
        BrushStyle brushStyle = (BrushStyle) obj;
        return Intrinsics.d(this.f19024b, brushStyle.f19024b) && Float.compare(this.f19025c, brushStyle.f19025c) == 0;
    }

    public long g() {
        return Color.f15975b.f();
    }

    public int hashCode() {
        return (this.f19024b.hashCode() * 31) + Float.hashCode(this.f19025c);
    }

    public String toString() {
        return "BrushStyle(value=" + this.f19024b + ", alpha=" + this.f19025c + ')';
    }
}
