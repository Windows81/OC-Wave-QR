package androidx.compose.ui.unit;

import androidx.compose.ui.unit.fontscaling.FontScaleConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class DensityWithConverter implements Density {

    /* renamed from: A  reason: collision with root package name */
    public final float f19141A;

    /* renamed from: B  reason: collision with root package name */
    public final FontScaleConverter f19142B;

    /* renamed from: z  reason: collision with root package name */
    public final float f19143z;

    public DensityWithConverter(float f2, float f3, FontScaleConverter fontScaleConverter) {
        this.f19143z = f2;
        this.f19141A = f3;
        this.f19142B = fontScaleConverter;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DensityWithConverter)) {
            return false;
        }
        DensityWithConverter densityWithConverter = (DensityWithConverter) obj;
        return Float.compare(this.f19143z, densityWithConverter.f19143z) == 0 && Float.compare(this.f19141A, densityWithConverter.f19141A) == 0 && Intrinsics.d(this.f19142B, densityWithConverter.f19142B);
    }

    public float getDensity() {
        return this.f19143z;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f19143z) * 31) + Float.hashCode(this.f19141A)) * 31) + this.f19142B.hashCode();
    }

    public long r(float f2) {
        return TextUnitKt.h(this.f19142B.a(f2));
    }

    public String toString() {
        return "DensityWithConverter(density=" + this.f19143z + ", fontScale=" + this.f19141A + ", converter=" + this.f19142B + ')';
    }

    public float u1() {
        return this.f19141A;
    }

    public float v(long j2) {
        if (TextUnitType.g(TextUnit.g(j2), TextUnitType.f19181b.b())) {
            return Dp.m(this.f19142B.b(TextUnit.h(j2)));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }
}
