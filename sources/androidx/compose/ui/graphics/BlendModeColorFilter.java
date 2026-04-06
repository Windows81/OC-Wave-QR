package androidx.compose.ui.graphics;

import android.graphics.ColorFilter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class BlendModeColorFilter extends ColorFilter {

    /* renamed from: c  reason: collision with root package name */
    public final long f15952c;

    /* renamed from: d  reason: collision with root package name */
    public final int f15953d;

    public /* synthetic */ BlendModeColorFilter(long j2, int i2, ColorFilter colorFilter, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, i2, colorFilter);
    }

    public final int b() {
        return this.f15953d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlendModeColorFilter)) {
            return false;
        }
        BlendModeColorFilter blendModeColorFilter = (BlendModeColorFilter) obj;
        return Color.n(this.f15952c, blendModeColorFilter.f15952c) && BlendMode.F(this.f15953d, blendModeColorFilter.f15953d);
    }

    public int hashCode() {
        return (Color.t(this.f15952c) * 31) + BlendMode.G(this.f15953d);
    }

    public String toString() {
        return "BlendModeColorFilter(color=" + Color.u(this.f15952c) + ", blendMode=" + BlendMode.H(this.f15953d) + ')';
    }

    public /* synthetic */ BlendModeColorFilter(long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, i2);
    }

    public BlendModeColorFilter(long j2, int i2, ColorFilter colorFilter) {
        super(colorFilter);
        this.f15952c = j2;
        this.f15953d = i2;
    }

    public BlendModeColorFilter(long j2, int i2) {
        this(j2, i2, AndroidColorFilter_androidKt.b(j2, i2), (DefaultConstructorMarker) null);
    }
}
