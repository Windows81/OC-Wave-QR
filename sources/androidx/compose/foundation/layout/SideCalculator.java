package androidx.compose.foundation.layout;

import android.graphics.Insets;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

@Metadata
interface SideCalculator {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f4151a = Companion.f4152a;

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f4152a = new Companion();

        /* renamed from: b  reason: collision with root package name */
        public static final SideCalculator$Companion$LeftSideCalculator$1 f4153b = new SideCalculator$Companion$LeftSideCalculator$1();

        /* renamed from: c  reason: collision with root package name */
        public static final SideCalculator$Companion$TopSideCalculator$1 f4154c = new SideCalculator$Companion$TopSideCalculator$1();

        /* renamed from: d  reason: collision with root package name */
        public static final SideCalculator$Companion$RightSideCalculator$1 f4155d = new SideCalculator$Companion$RightSideCalculator$1();

        /* renamed from: e  reason: collision with root package name */
        public static final SideCalculator$Companion$BottomSideCalculator$1 f4156e = new SideCalculator$Companion$BottomSideCalculator$1();

        public final SideCalculator a(int i2, LayoutDirection layoutDirection) {
            WindowInsetsSides.Companion companion = WindowInsetsSides.f4266b;
            if (WindowInsetsSides.n(i2, companion.h())) {
                return f4153b;
            }
            if (WindowInsetsSides.n(i2, companion.k())) {
                return f4154c;
            }
            if (WindowInsetsSides.n(i2, companion.i())) {
                return f4155d;
            }
            if (WindowInsetsSides.n(i2, companion.e())) {
                return f4156e;
            }
            if (WindowInsetsSides.n(i2, companion.j())) {
                return layoutDirection == LayoutDirection.Ltr ? f4153b : f4155d;
            }
            if (WindowInsetsSides.n(i2, companion.f())) {
                return layoutDirection == LayoutDirection.Ltr ? f4155d : f4153b;
            }
            throw new IllegalStateException("Only Left, Top, Right, Bottom, Start and End are allowed");
        }
    }

    float a(float f2, float f3) {
        return RangesKt.i(d(f2, f3), 0.0f);
    }

    int b(Insets insets);

    float c(float f2, float f3) {
        return RangesKt.d(d(f2, f3), 0.0f);
    }

    float d(float f2, float f3);

    long e(long j2);

    Insets f(Insets insets, int i2);

    long g(long j2, float f2);
}
