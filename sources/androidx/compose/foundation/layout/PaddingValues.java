package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

@Metadata
public interface PaddingValues {

    @Metadata
    public static final class Absolute implements PaddingValues {

        /* renamed from: a  reason: collision with root package name */
        public final float f4120a;

        /* renamed from: b  reason: collision with root package name */
        public final float f4121b;

        /* renamed from: c  reason: collision with root package name */
        public final float f4122c;

        /* renamed from: d  reason: collision with root package name */
        public final float f4123d;

        public float a() {
            return this.f4123d;
        }

        public float b(LayoutDirection layoutDirection) {
            return this.f4120a;
        }

        public float c(LayoutDirection layoutDirection) {
            return this.f4122c;
        }

        public float d() {
            return this.f4121b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Absolute)) {
                return false;
            }
            Absolute absolute = (Absolute) obj;
            return Dp.o(this.f4120a, absolute.f4120a) && Dp.o(this.f4121b, absolute.f4121b) && Dp.o(this.f4122c, absolute.f4122c) && Dp.o(this.f4123d, absolute.f4123d);
        }

        public int hashCode() {
            return (((((Dp.p(this.f4120a) * 31) + Dp.p(this.f4121b)) * 31) + Dp.p(this.f4122c)) * 31) + Dp.p(this.f4123d);
        }

        public String toString() {
            return "PaddingValues.Absolute(left=" + Dp.r(this.f4120a) + ", top=" + Dp.r(this.f4121b) + ", right=" + Dp.r(this.f4122c) + ", bottom=" + Dp.r(this.f4123d) + ')';
        }
    }

    float a();

    float b(LayoutDirection layoutDirection);

    float c(LayoutDirection layoutDirection);

    float d();
}
