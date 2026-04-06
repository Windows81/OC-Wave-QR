package androidx.compose.foundation;

import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.math.MathKt;

@Metadata
public interface MarqueeSpacing {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f3123a = Companion.f3124a;

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f3124a = new Companion();

        public static final int c(float f2, Density density, int i2, int i3) {
            return MathKt.d(f2 * ((float) i3));
        }

        public final MarqueeSpacing b(float f2) {
            return new c(f2);
        }
    }

    int a(Density density, int i2, int i3);
}
