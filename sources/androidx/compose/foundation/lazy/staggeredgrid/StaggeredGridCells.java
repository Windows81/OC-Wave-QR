package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

@Metadata
public interface StaggeredGridCells {

    @Metadata
    public static final class Adaptive implements StaggeredGridCells {

        /* renamed from: a  reason: collision with root package name */
        public final float f5218a;

        public int[] a(Density density, int i2, int i3) {
            return LazyStaggeredGridCellsKt.b(i2, Math.max((i2 + i3) / (density.P1(this.f5218a) + i3), 1), i3);
        }

        public boolean equals(Object obj) {
            return (obj instanceof Adaptive) && Dp.o(this.f5218a, ((Adaptive) obj).f5218a);
        }

        public int hashCode() {
            return Dp.p(this.f5218a);
        }
    }

    @Metadata
    public static final class Fixed implements StaggeredGridCells {

        /* renamed from: a  reason: collision with root package name */
        public final int f5219a;

        public int[] a(Density density, int i2, int i3) {
            return LazyStaggeredGridCellsKt.b(i2, this.f5219a, i3);
        }

        public boolean equals(Object obj) {
            return (obj instanceof Fixed) && this.f5219a == ((Fixed) obj).f5219a;
        }

        public int hashCode() {
            return -this.f5219a;
        }
    }

    @Metadata
    public static final class FixedSize implements StaggeredGridCells {

        /* renamed from: a  reason: collision with root package name */
        public final float f5220a;

        public int[] a(Density density, int i2, int i3) {
            int P1 = density.P1(this.f5220a);
            int i4 = P1 + i3;
            int i5 = i3 + i2;
            if (i4 >= i5) {
                return new int[]{i2};
            }
            int i6 = i5 / i4;
            int[] iArr = new int[i6];
            for (int i7 = 0; i7 < i6; i7++) {
                iArr[i7] = P1;
            }
            return iArr;
        }

        public boolean equals(Object obj) {
            return (obj instanceof FixedSize) && Dp.o(this.f5220a, ((FixedSize) obj).f5220a);
        }

        public int hashCode() {
            return Dp.p(this.f5220a);
        }
    }

    int[] a(Density density, int i2, int i3);
}
