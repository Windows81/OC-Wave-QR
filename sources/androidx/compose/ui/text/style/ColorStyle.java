package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class ColorStyle implements TextForegroundStyle {

    /* renamed from: b  reason: collision with root package name */
    public final long f19026b;

    public /* synthetic */ ColorStyle(long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2);
    }

    public float c() {
        return Color.o(g());
    }

    public Brush d() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ColorStyle) && Color.n(this.f19026b, ((ColorStyle) obj).f19026b);
    }

    public long g() {
        return this.f19026b;
    }

    public int hashCode() {
        return Color.t(this.f19026b);
    }

    public String toString() {
        return "ColorStyle(value=" + Color.u(this.f19026b) + ')';
    }

    public ColorStyle(long j2) {
        this.f19026b = j2;
        if (!(j2 != 16)) {
            InlineClassHelperKt.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
        }
    }
}
