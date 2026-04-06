package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.BringIntoViewSpec;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

@Metadata
final class PagerBringIntoViewSpec implements BringIntoViewSpec {

    /* renamed from: b  reason: collision with root package name */
    public final PagerState f5262b;

    /* renamed from: c  reason: collision with root package name */
    public final BringIntoViewSpec f5263c;

    public PagerBringIntoViewSpec(PagerState pagerState, BringIntoViewSpec bringIntoViewSpec) {
        this.f5262b = pagerState;
        this.f5263c = bringIntoViewSpec;
    }

    public float a(float f2, float f3, float f4) {
        float a2 = this.f5263c.a(f2, f3, f4);
        boolean z2 = false;
        if (f2 <= 0.0f ? f2 + f3 <= 0.0f : f2 + f3 > f4) {
            z2 = true;
        }
        if (Math.abs(a2) != 0.0f && z2) {
            return b(a2);
        }
        if (((double) Math.abs(this.f5262b.z())) < 1.0E-6d) {
            return 0.0f;
        }
        float z3 = ((float) this.f5262b.z()) * -1.0f;
        if (this.f5262b.B()) {
            z3 += (float) this.f5262b.J();
        }
        return RangesKt.n(z3, -f4, f4);
    }

    public final float b(float f2) {
        float z2 = ((float) this.f5262b.z()) * ((float) -1);
        while (f2 > 0.0f && z2 < f2) {
            z2 += (float) this.f5262b.J();
        }
        while (f2 < 0.0f && z2 > f2) {
            z2 -= (float) this.f5262b.J();
        }
        return z2;
    }
}
