package androidx.compose.material3;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;

@Metadata
public final class SheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1 implements NestedScrollConnection {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f10998A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Orientation f10999B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SheetState f11000z;

    public SheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1(SheetState sheetState, Function1 function1, Orientation orientation) {
        this.f11000z = sheetState;
        this.f10998A = function1;
        this.f10999B = orientation;
    }

    private final float a(long j2) {
        return Float.intBitsToFloat((int) (this.f10999B == Orientation.Horizontal ? j2 >> 32 : j2 & 4294967295L));
    }

    private final long b(float f2) {
        Orientation orientation = this.f10999B;
        float f3 = orientation == Orientation.Horizontal ? f2 : 0.0f;
        if (orientation != Orientation.Vertical) {
            f2 = 0.0f;
        }
        return Offset.e((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
    }

    private final float c(long j2) {
        return this.f10999B == Orientation.Horizontal ? Velocity.h(j2) : Velocity.i(j2);
    }

    public Object H1(long j2, Continuation continuation) {
        float c2 = c(j2);
        float u2 = this.f11000z.u();
        float d2 = this.f11000z.j().p().d();
        if (c2 >= 0.0f || u2 <= d2) {
            j2 = Velocity.f19186b.a();
        } else {
            this.f10998A.invoke(Boxing.b(c2));
        }
        return Velocity.b(j2);
    }

    public long c2(long j2, long j3, int i2) {
        return NestedScrollSource.e(i2, NestedScrollSource.f16795b.b()) ? b(this.f11000z.j().o(a(j3))) : Offset.f15855b.c();
    }

    public Object q0(long j2, long j3, Continuation continuation) {
        this.f10998A.invoke(Boxing.b(c(j3)));
        return Velocity.b(j3);
    }

    public long t1(long j2, int i2) {
        float a2 = a(j2);
        return (a2 >= 0.0f || !NestedScrollSource.e(i2, NestedScrollSource.f16795b.b())) ? Offset.f15855b.c() : b(this.f11000z.j().o(a2));
    }
}
