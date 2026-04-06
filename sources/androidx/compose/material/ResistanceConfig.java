package androidx.compose.material;

import kotlin.Deprecated;
import kotlin.Metadata;

@Metadata
@Deprecated
public final class ResistanceConfig {

    /* renamed from: a  reason: collision with root package name */
    public final float f8236a;

    /* renamed from: b  reason: collision with root package name */
    public final float f8237b;

    /* renamed from: c  reason: collision with root package name */
    public final float f8238c;

    public ResistanceConfig(float f2, float f3, float f4) {
        this.f8236a = f2;
        this.f8237b = f3;
        this.f8238c = f4;
    }

    public final float a(float f2) {
        float f3 = f2 < 0.0f ? this.f8237b : this.f8238c;
        if (f3 == 0.0f) {
            return 0.0f;
        }
        float f4 = this.f8236a;
        float f5 = f2 / f4;
        if (f5 < -1.0f) {
            f5 = -1.0f;
        }
        if (f5 > 1.0f) {
            f5 = 1.0f;
        }
        return (f4 / f3) * ((float) Math.sin((double) ((f5 * 3.1415927f) / ((float) 2))));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResistanceConfig)) {
            return false;
        }
        ResistanceConfig resistanceConfig = (ResistanceConfig) obj;
        return this.f8236a == resistanceConfig.f8236a && this.f8237b == resistanceConfig.f8237b && this.f8238c == resistanceConfig.f8238c;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f8236a) * 31) + Float.hashCode(this.f8237b)) * 31) + Float.hashCode(this.f8238c);
    }

    public String toString() {
        return "ResistanceConfig(basis=" + this.f8236a + ", factorAtMin=" + this.f8237b + ", factorAtMax=" + this.f8238c + ')';
    }
}
