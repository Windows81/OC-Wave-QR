package androidx.compose.material;

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
    public static final ProvidableCompositionLocal f8242a = CompositionLocalKt.h((SnapshotMutationPolicy) null, RippleKt$LocalRippleConfiguration$1.f8248z, 1, (Object) null);

    /* renamed from: b  reason: collision with root package name */
    public static final RippleNodeFactory f8243b;

    /* renamed from: c  reason: collision with root package name */
    public static final RippleNodeFactory f8244c;

    /* renamed from: d  reason: collision with root package name */
    public static final RippleAlpha f8245d = new RippleAlpha(0.16f, 0.24f, 0.08f, 0.24f);

    /* renamed from: e  reason: collision with root package name */
    public static final RippleAlpha f8246e = new RippleAlpha(0.08f, 0.12f, 0.04f, 0.12f);

    /* renamed from: f  reason: collision with root package name */
    public static final RippleAlpha f8247f = new RippleAlpha(0.08f, 0.12f, 0.04f, 0.1f);

    static {
        Dp.Companion companion = Dp.f19144A;
        float c2 = companion.c();
        Color.Companion companion2 = Color.f15975b;
        f8243b = new RippleNodeFactory(true, c2, companion2.f(), (DefaultConstructorMarker) null);
        f8244c = new RippleNodeFactory(false, companion.c(), companion2.f(), (DefaultConstructorMarker) null);
    }

    public static final ProvidableCompositionLocal d() {
        return f8242a;
    }

    public static final IndicationNodeFactory e(boolean z2, float f2, long j2) {
        return (!Dp.o(f2, Dp.f19144A.c()) || !Color.n(j2, Color.f15975b.f())) ? new RippleNodeFactory(z2, f2, j2, (DefaultConstructorMarker) null) : z2 ? f8243b : f8244c;
    }

    public static /* synthetic */ IndicationNodeFactory f(boolean z2, float f2, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        if ((i2 & 2) != 0) {
            f2 = Dp.f19144A.c();
        }
        if ((i2 & 4) != 0) {
            j2 = Color.f15975b.f();
        }
        return e(z2, f2, j2);
    }
}
