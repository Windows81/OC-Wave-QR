package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public interface GridCells {

    @Metadata
    public static final class Adaptive implements GridCells {

        /* renamed from: a  reason: collision with root package name */
        public final float f4514a;

        public /* synthetic */ Adaptive(float f2, DefaultConstructorMarker defaultConstructorMarker) {
            this(f2);
        }

        public List a(Density density, int i2, int i3) {
            return LazyGridDslKt.f(i2, Math.max((i2 + i3) / (density.P1(this.f4514a) + i3), 1), i3);
        }

        public boolean equals(Object obj) {
            return (obj instanceof Adaptive) && Dp.o(this.f4514a, ((Adaptive) obj).f4514a);
        }

        public int hashCode() {
            return Dp.p(this.f4514a);
        }

        public Adaptive(float f2) {
            this.f4514a = f2;
            if (!(Dp.l(f2, Dp.m((float) 0)) > 0)) {
                InlineClassHelperKt.a("Provided min size should be larger than zero.");
            }
        }
    }

    @Metadata
    public static final class Fixed implements GridCells {

        /* renamed from: a  reason: collision with root package name */
        public final int f4515a;

        public Fixed(int i2) {
            this.f4515a = i2;
            if (!(i2 > 0)) {
                InlineClassHelperKt.a("Provided count should be larger than zero");
            }
        }

        public List a(Density density, int i2, int i3) {
            return LazyGridDslKt.f(i2, this.f4515a, i3);
        }

        public boolean equals(Object obj) {
            return (obj instanceof Fixed) && this.f4515a == ((Fixed) obj).f4515a;
        }

        public int hashCode() {
            return -this.f4515a;
        }
    }

    @Metadata
    public static final class FixedSize implements GridCells {

        /* renamed from: a  reason: collision with root package name */
        public final float f4516a;

        public List a(Density density, int i2, int i3) {
            int P1 = density.P1(this.f4516a);
            int i4 = P1 + i3;
            int i5 = i3 + i2;
            if (i4 < i5) {
                int i6 = i5 / i4;
                ArrayList arrayList = new ArrayList(i6);
                for (int i7 = 0; i7 < i6; i7++) {
                    arrayList.add(Integer.valueOf(P1));
                }
                return arrayList;
            }
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(Integer.valueOf(i2));
            return arrayList2;
        }

        public boolean equals(Object obj) {
            return (obj instanceof FixedSize) && Dp.o(this.f4516a, ((FixedSize) obj).f4516a);
        }

        public int hashCode() {
            return Dp.p(this.f4516a);
        }
    }

    List a(Density density, int i2, int i3);
}
