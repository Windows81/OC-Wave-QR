package androidx.compose.material;

import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;

@Metadata
public final class RippleDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final RippleDefaults f8241a = new RippleDefaults();

    public final RippleAlpha a(long j2, boolean z2) {
        return z2 ? ((double) ColorKt.i(j2)) > 0.5d ? RippleKt.f8245d : RippleKt.f8246e : RippleKt.f8247f;
    }

    public final long b(long j2, boolean z2) {
        return (z2 || ((double) ColorKt.i(j2)) >= 0.5d) ? j2 : Color.f15975b.g();
    }
}
