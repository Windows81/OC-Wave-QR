package androidx.compose.material.ripple;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Deprecated;
import kotlin.Metadata;

@Metadata
@Deprecated
public interface RippleTheme {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f9089a = Companion.f9090a;

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f9090a = new Companion();

        public final RippleAlpha a(long j2, boolean z2) {
            return z2 ? ((double) ColorKt.i(j2)) > 0.5d ? RippleThemeKt.f9092b : RippleThemeKt.f9093c : RippleThemeKt.f9094d;
        }

        public final long b(long j2, boolean z2) {
            return (z2 || ((double) ColorKt.i(j2)) >= 0.5d) ? j2 : Color.f15975b.g();
        }
    }

    long a(Composer composer, int i2);

    RippleAlpha b(Composer composer, int i2);
}
