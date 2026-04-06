package androidx.compose.foundation.pager;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

@Metadata
public interface PageSize {

    @Metadata
    public static final class Fill implements PageSize {

        /* renamed from: a  reason: collision with root package name */
        public static final Fill f5258a = new Fill();

        public int a(Density density, int i2, int i3) {
            return i2;
        }
    }

    @Metadata
    public static final class Fixed implements PageSize {

        /* renamed from: a  reason: collision with root package name */
        public final float f5259a;

        public int a(Density density, int i2, int i3) {
            return density.P1(this.f5259a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Fixed)) {
                return false;
            }
            return Dp.o(this.f5259a, ((Fixed) obj).f5259a);
        }

        public int hashCode() {
            return Dp.p(this.f5259a);
        }
    }

    int a(Density density, int i2, int i3);
}
