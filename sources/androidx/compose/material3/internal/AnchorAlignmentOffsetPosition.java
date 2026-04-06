package androidx.compose.material3.internal;

import androidx.compose.material3.internal.MenuPosition;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AnchorAlignmentOffsetPosition {

    /* renamed from: a  reason: collision with root package name */
    public static final AnchorAlignmentOffsetPosition f12106a = new AnchorAlignmentOffsetPosition();

    @Metadata
    public static final class Horizontal implements MenuPosition.Horizontal {

        /* renamed from: a  reason: collision with root package name */
        public final Alignment.Horizontal f12107a;

        /* renamed from: b  reason: collision with root package name */
        public final Alignment.Horizontal f12108b;

        /* renamed from: c  reason: collision with root package name */
        public final int f12109c;

        public Horizontal(Alignment.Horizontal horizontal, Alignment.Horizontal horizontal2, int i2) {
            this.f12107a = horizontal;
            this.f12108b = horizontal2;
            this.f12109c = i2;
        }

        public int a(IntRect intRect, long j2, int i2, LayoutDirection layoutDirection) {
            int a2 = this.f12108b.a(0, intRect.l(), layoutDirection);
            return intRect.g() + a2 + (-this.f12107a.a(0, i2, layoutDirection)) + (layoutDirection == LayoutDirection.Ltr ? this.f12109c : -this.f12109c);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Horizontal)) {
                return false;
            }
            Horizontal horizontal = (Horizontal) obj;
            return Intrinsics.d(this.f12107a, horizontal.f12107a) && Intrinsics.d(this.f12108b, horizontal.f12108b) && this.f12109c == horizontal.f12109c;
        }

        public int hashCode() {
            return (((this.f12107a.hashCode() * 31) + this.f12108b.hashCode()) * 31) + Integer.hashCode(this.f12109c);
        }

        public String toString() {
            return "Horizontal(menuAlignment=" + this.f12107a + ", anchorAlignment=" + this.f12108b + ", offset=" + this.f12109c + ')';
        }
    }

    @Metadata
    public static final class Vertical implements MenuPosition.Vertical {

        /* renamed from: a  reason: collision with root package name */
        public final Alignment.Vertical f12110a;

        /* renamed from: b  reason: collision with root package name */
        public final Alignment.Vertical f12111b;

        /* renamed from: c  reason: collision with root package name */
        public final int f12112c;

        public Vertical(Alignment.Vertical vertical, Alignment.Vertical vertical2, int i2) {
            this.f12110a = vertical;
            this.f12111b = vertical2;
            this.f12112c = i2;
        }

        public int a(IntRect intRect, long j2, int i2) {
            return intRect.j() + this.f12111b.a(0, intRect.f()) + (-this.f12110a.a(0, i2)) + this.f12112c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Vertical)) {
                return false;
            }
            Vertical vertical = (Vertical) obj;
            return Intrinsics.d(this.f12110a, vertical.f12110a) && Intrinsics.d(this.f12111b, vertical.f12111b) && this.f12112c == vertical.f12112c;
        }

        public int hashCode() {
            return (((this.f12110a.hashCode() * 31) + this.f12111b.hashCode()) * 31) + Integer.hashCode(this.f12112c);
        }

        public String toString() {
            return "Vertical(menuAlignment=" + this.f12110a + ", anchorAlignment=" + this.f12111b + ", offset=" + this.f12112c + ')';
        }
    }
}
