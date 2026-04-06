package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.ranges.RangesKt;

@Metadata
final class DefaultPagerNestedScrollConnection implements NestedScrollConnection {

    /* renamed from: A  reason: collision with root package name */
    public final Orientation f5225A;

    /* renamed from: z  reason: collision with root package name */
    public final PagerState f5226z;

    public DefaultPagerNestedScrollConnection(PagerState pagerState, Orientation orientation) {
        this.f5226z = pagerState;
        this.f5225A = orientation;
    }

    public final long a(long j2, Orientation orientation) {
        return orientation == Orientation.Vertical ? Velocity.e(j2, 0.0f, 0.0f, 2, (Object) null) : Velocity.e(j2, 0.0f, 0.0f, 1, (Object) null);
    }

    public final float b(long j2) {
        return Float.intBitsToFloat((int) (this.f5225A == Orientation.Horizontal ? j2 >> 32 : j2 & 4294967295L));
    }

    public long c2(long j2, long j3, int i2) {
        if (!NestedScrollSource.e(i2, NestedScrollSource.f16795b.a()) || b(j3) == 0.0f) {
            return Offset.f15855b.c();
        }
        throw new CancellationException("Scroll cancelled");
    }

    public Object q0(long j2, long j3, Continuation continuation) {
        return Velocity.b(a(j3, this.f5225A));
    }

    public long t1(long j2, int i2) {
        if (!NestedScrollSource.e(i2, NestedScrollSource.f16795b.b()) || ((double) Math.abs(this.f5226z.w())) <= 1.0E-6d) {
            return Offset.f15855b.c();
        }
        float w2 = this.f5226z.w() * ((float) this.f5226z.I());
        float k2 = (((float) (this.f5226z.C().k() + this.f5226z.C().l())) * (-Math.signum(this.f5226z.w()))) + w2;
        if (this.f5226z.w() > 0.0f) {
            float f2 = k2;
            k2 = w2;
            w2 = f2;
        }
        Orientation orientation = this.f5225A;
        Orientation orientation2 = Orientation.Horizontal;
        float f3 = -this.f5226z.b(-RangesKt.n(Float.intBitsToFloat((int) (orientation == orientation2 ? j2 >> 32 : j2 & 4294967295L)), w2, k2));
        float intBitsToFloat = this.f5225A == orientation2 ? f3 : Float.intBitsToFloat((int) (j2 >> 32));
        if (this.f5225A != Orientation.Vertical) {
            f3 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        }
        return Offset.f(j2, intBitsToFloat, f3);
    }
}
