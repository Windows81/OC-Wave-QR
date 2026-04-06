package androidx.compose.material3;

import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class RippleKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ProvidableCompositionLocal f10737a = CompositionLocalKt.h((SnapshotMutationPolicy) null, new C0186m5(), 1, (Object) null);

    /* renamed from: b  reason: collision with root package name */
    public static final RippleNodeFactory f10738b;

    /* renamed from: c  reason: collision with root package name */
    public static final RippleNodeFactory f10739c;

    static {
        Dp.Companion companion = Dp.f19144A;
        float c2 = companion.c();
        Color.Companion companion2 = Color.f15975b;
        f10738b = new RippleNodeFactory(true, c2, companion2.f(), (DefaultConstructorMarker) null);
        f10739c = new RippleNodeFactory(false, companion.c(), companion2.f(), (DefaultConstructorMarker) null);
    }

    public static final RippleConfiguration b() {
        return new RippleConfiguration(0, (RippleAlpha) null, 3, (DefaultConstructorMarker) null);
    }

    public static final ProvidableCompositionLocal c() {
        return f10737a;
    }

    public static final IndicationNodeFactory d(boolean z2, float f2, long j2) {
        return (!Dp.o(f2, Dp.f19144A.c()) || !Color.n(j2, Color.f15975b.f())) ? new RippleNodeFactory(z2, f2, j2, (DefaultConstructorMarker) null) : z2 ? f10738b : f10739c;
    }

    public static /* synthetic */ IndicationNodeFactory e(boolean z2, float f2, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        if ((i2 & 2) != 0) {
            f2 = Dp.f19144A.c();
        }
        if ((i2 & 4) != 0) {
            j2 = Color.f15975b.f();
        }
        return d(z2, f2, j2);
    }
}
