package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.pager.PageInfo;
import androidx.compose.foundation.pager.PagerLayoutInfo;
import androidx.compose.foundation.pager.PagerLayoutInfoKt;
import androidx.compose.foundation.pager.PagerSnapDistance;
import androidx.compose.foundation.pager.PagerState;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.RangesKt;

@Metadata
public final class PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1 implements SnapLayoutInfoProvider {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PagerState f3657a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Function3 f3658b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ PagerSnapDistance f3659c;

    public PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1(PagerState pagerState, Function3 function3, PagerSnapDistance pagerSnapDistance) {
        this.f3657a = pagerState;
        this.f3658b = function3;
        this.f3659c = pagerSnapDistance;
    }

    public float a(float f2, float f3) {
        int I = this.f3657a.I() + this.f3657a.K();
        if (I == 0) {
            return 0.0f;
        }
        int y2 = f2 < 0.0f ? this.f3657a.y() + 1 : this.f3657a.y();
        int e2 = RangesKt.e(Math.abs((RangesKt.o(this.f3659c.a(y2, RangesKt.o(((int) (f3 / ((float) I))) + y2, 0, this.f3657a.H()), f2, this.f3657a.I(), this.f3657a.K()), 0, this.f3657a.H()) - y2) * I) - I, 0);
        if (e2 == 0) {
            return (float) e2;
        }
        return Math.signum(f2) * ((float) e2);
    }

    public float b(float f2) {
        Pair e2 = e(this.f3657a.C().n(), f2);
        float floatValue = ((Number) e2.a()).floatValue();
        float floatValue2 = ((Number) e2.b()).floatValue();
        float floatValue3 = ((Number) this.f3658b.d(Float.valueOf(f2), Float.valueOf(floatValue), Float.valueOf(floatValue2))).floatValue();
        if (!(floatValue3 == floatValue || floatValue3 == floatValue2 || floatValue3 == 0.0f)) {
            InlineClassHelperKt.c("Final Snapping Offset Should Be one of " + floatValue + ", " + floatValue2 + " or 0.0");
        }
        if (d(floatValue3)) {
            return floatValue3;
        }
        return 0.0f;
    }

    public final PagerLayoutInfo c() {
        return this.f3657a.C();
    }

    public final boolean d(float f2) {
        return (f2 == Float.POSITIVE_INFINITY || f2 == Float.NEGATIVE_INFINITY) ? false : true;
    }

    public final Pair e(SnapPosition snapPosition, float f2) {
        float f3;
        float f4 = f2;
        List i2 = c().i();
        PagerState pagerState = this.f3657a;
        int size = i2.size();
        int i3 = 0;
        float f5 = Float.NEGATIVE_INFINITY;
        float f6 = Float.POSITIVE_INFINITY;
        while (true) {
            f3 = 0.0f;
            if (i3 >= size) {
                break;
            }
            PageInfo pageInfo = (PageInfo) i2.get(i3);
            float a2 = SnapPositionKt.a(PagerLayoutInfoKt.a(c()), c().f(), c().d(), c().k(), pageInfo.f(), pageInfo.getIndex(), snapPosition, pagerState.H());
            if (a2 <= 0.0f && a2 > f5) {
                f5 = a2;
            }
            if (a2 >= 0.0f && a2 < f6) {
                f6 = a2;
            }
            i3++;
        }
        if (f5 == Float.NEGATIVE_INFINITY) {
            f5 = f6;
        }
        if (f6 == Float.POSITIVE_INFINITY) {
            f6 = f5;
        }
        if (!this.f3657a.f()) {
            if (PagerSnapLayoutInfoProviderKt.e(this.f3657a, f4)) {
                f5 = 0.0f;
                f6 = 0.0f;
            } else {
                f6 = 0.0f;
            }
        }
        if (this.f3657a.d()) {
            f3 = f5;
        } else if (!PagerSnapLayoutInfoProviderKt.e(this.f3657a, f4)) {
            f6 = 0.0f;
        }
        return TuplesKt.a(Float.valueOf(f3), Float.valueOf(f6));
    }
}
