package androidx.compose.material3;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata
public final class PinnedScrollBehavior$nestedScrollConnection$1 implements NestedScrollConnection {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PinnedScrollBehavior f10619z;

    public long c2(long j2, long j3, int i2) {
        if (!((Boolean) this.f10619z.e().invoke()).booleanValue()) {
            return Offset.f15855b.c();
        }
        TopAppBarState c2 = this.f10619z.c();
        c2.j(c2.f() + Float.intBitsToFloat((int) (j2 & 4294967295L)));
        return Offset.f15855b.c();
    }

    public Object q0(long j2, long j3, Continuation continuation) {
        if (Velocity.i(j3) > 0.0f) {
            this.f10619z.c().j(0.0f);
        }
        return super.q0(j2, j3, continuation);
    }
}
