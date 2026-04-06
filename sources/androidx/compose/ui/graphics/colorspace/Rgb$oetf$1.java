package androidx.compose.ui.graphics.colorspace;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;

@Metadata
public final class Rgb$oetf$1 extends Lambda implements Function1<Double, Double> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Rgb f16254z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Rgb$oetf$1(Rgb rgb) {
        super(1);
        this.f16254z = rgb;
    }

    public final Double b(double d2) {
        return Double.valueOf(RangesKt.m(this.f16254z.F().a(d2), (double) this.f16254z.f16239f, (double) this.f16254z.f16240g));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).doubleValue());
    }
}
