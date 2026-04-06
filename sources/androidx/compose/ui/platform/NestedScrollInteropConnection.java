package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;
import androidx.core.view.NestedScrollingChildHelper;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;

@Metadata
public final class NestedScrollInteropConnection implements NestedScrollConnection {

    /* renamed from: A  reason: collision with root package name */
    public final int[] f17821A;

    /* renamed from: z  reason: collision with root package name */
    public final NestedScrollingChildHelper f17822z;

    public Object H1(long j2, Continuation continuation) {
        if (!this.f17822z.b(NestedScrollInteropConnectionKt.k(Velocity.h(j2)), NestedScrollInteropConnectionKt.k(Velocity.i(j2)))) {
            j2 = Velocity.f19186b.a();
        }
        a();
        return Velocity.b(j2);
    }

    public final void a() {
        if (this.f17822z.i(0)) {
            this.f17822z.n(0);
        }
        if (this.f17822z.i(1)) {
            this.f17822z.n(1);
        }
    }

    public long c2(long j2, long j3, int i2) {
        long j4 = j3;
        if (!this.f17822z.m(NestedScrollInteropConnectionKt.g(j3), NestedScrollInteropConnectionKt.j(i2))) {
            return Offset.f15855b.c();
        }
        ArraysKt.x(this.f17821A, 0, 0, 0, 6, (Object) null);
        this.f17822z.d(NestedScrollInteropConnectionKt.f(Float.intBitsToFloat((int) (j2 >> 32))), NestedScrollInteropConnectionKt.f(Float.intBitsToFloat((int) (j2 & 4294967295L))), NestedScrollInteropConnectionKt.f(Float.intBitsToFloat((int) (j4 >> 32))), NestedScrollInteropConnectionKt.f(Float.intBitsToFloat((int) (j4 & 4294967295L))), (int[]) null, NestedScrollInteropConnectionKt.j(i2), this.f17821A);
        return NestedScrollInteropConnectionKt.i(this.f17821A, j4);
    }

    public Object q0(long j2, long j3, Continuation continuation) {
        if (!this.f17822z.a(NestedScrollInteropConnectionKt.k(Velocity.h(j3)), NestedScrollInteropConnectionKt.k(Velocity.i(j3)), true)) {
            j3 = Velocity.f19186b.a();
        }
        a();
        return Velocity.b(j3);
    }

    public long t1(long j2, int i2) {
        long j3 = j2;
        if (!this.f17822z.m(NestedScrollInteropConnectionKt.g(j2), NestedScrollInteropConnectionKt.j(i2))) {
            return Offset.f15855b.c();
        }
        ArraysKt.x(this.f17821A, 0, 0, 0, 6, (Object) null);
        this.f17822z.c(NestedScrollInteropConnectionKt.f(Float.intBitsToFloat((int) (j3 >> 32))), NestedScrollInteropConnectionKt.f(Float.intBitsToFloat((int) (4294967295L & j3))), this.f17821A, (int[]) null, NestedScrollInteropConnectionKt.j(i2));
        return NestedScrollInteropConnectionKt.i(this.f17821A, j3);
    }
}
