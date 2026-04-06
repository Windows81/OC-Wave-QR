package androidx.compose.foundation;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class BorderStroke {

    /* renamed from: a  reason: collision with root package name */
    public final float f2989a;

    /* renamed from: b  reason: collision with root package name */
    public final Brush f2990b;

    public /* synthetic */ BorderStroke(float f2, Brush brush, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, brush);
    }

    public final Brush a() {
        return this.f2990b;
    }

    public final float b() {
        return this.f2989a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderStroke)) {
            return false;
        }
        BorderStroke borderStroke = (BorderStroke) obj;
        return Dp.o(this.f2989a, borderStroke.f2989a) && Intrinsics.d(this.f2990b, borderStroke.f2990b);
    }

    public int hashCode() {
        return (Dp.p(this.f2989a) * 31) + this.f2990b.hashCode();
    }

    public String toString() {
        return "BorderStroke(width=" + Dp.r(this.f2989a) + ", brush=" + this.f2990b + ')';
    }

    public BorderStroke(float f2, Brush brush) {
        this.f2989a = f2;
        this.f2990b = brush;
    }
}
