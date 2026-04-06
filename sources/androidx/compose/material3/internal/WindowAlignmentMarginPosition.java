package androidx.compose.material3.internal;

import androidx.compose.material3.internal.MenuPosition;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata
public final class WindowAlignmentMarginPosition {

    /* renamed from: a  reason: collision with root package name */
    public static final WindowAlignmentMarginPosition f12378a = new WindowAlignmentMarginPosition();

    @Metadata
    public static final class Horizontal implements MenuPosition.Horizontal {

        /* renamed from: a  reason: collision with root package name */
        public final Alignment.Horizontal f12379a;

        /* renamed from: b  reason: collision with root package name */
        public final int f12380b;

        public Horizontal(Alignment.Horizontal horizontal, int i2) {
            this.f12379a = horizontal;
            this.f12380b = i2;
        }

        public int a(IntRect intRect, long j2, int i2, LayoutDirection layoutDirection) {
            int i3 = (int) (j2 >> 32);
            if (i2 >= i3 - (this.f12380b * 2)) {
                return Alignment.f15444a.g().a(i2, i3, layoutDirection);
            }
            int a2 = this.f12379a.a(i2, i3, layoutDirection);
            int i4 = this.f12380b;
            return RangesKt.o(a2, i4, (i3 - i4) - i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Horizontal)) {
                return false;
            }
            Horizontal horizontal = (Horizontal) obj;
            return Intrinsics.d(this.f12379a, horizontal.f12379a) && this.f12380b == horizontal.f12380b;
        }

        public int hashCode() {
            return (this.f12379a.hashCode() * 31) + Integer.hashCode(this.f12380b);
        }

        public String toString() {
            return "Horizontal(alignment=" + this.f12379a + ", margin=" + this.f12380b + ')';
        }
    }

    @Metadata
    public static final class Vertical implements MenuPosition.Vertical {

        /* renamed from: a  reason: collision with root package name */
        public final Alignment.Vertical f12381a;

        /* renamed from: b  reason: collision with root package name */
        public final int f12382b;

        public Vertical(Alignment.Vertical vertical, int i2) {
            this.f12381a = vertical;
            this.f12382b = i2;
        }

        public int a(IntRect intRect, long j2, int i2) {
            int i3 = (int) (j2 & 4294967295L);
            if (i2 >= i3 - (this.f12382b * 2)) {
                return Alignment.f15444a.i().a(i2, i3);
            }
            int a2 = this.f12381a.a(i2, i3);
            int i4 = this.f12382b;
            return RangesKt.o(a2, i4, (i3 - i4) - i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Vertical)) {
                return false;
            }
            Vertical vertical = (Vertical) obj;
            return Intrinsics.d(this.f12381a, vertical.f12381a) && this.f12382b == vertical.f12382b;
        }

        public int hashCode() {
            return (this.f12381a.hashCode() * 31) + Integer.hashCode(this.f12382b);
        }

        public String toString() {
            return "Vertical(alignment=" + this.f12381a + ", margin=" + this.f12382b + ')';
        }
    }
}
