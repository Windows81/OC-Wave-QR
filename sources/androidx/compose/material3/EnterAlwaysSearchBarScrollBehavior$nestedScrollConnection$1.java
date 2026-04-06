package androidx.compose.material3;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata
public final class EnterAlwaysSearchBarScrollBehavior$nestedScrollConnection$1 implements NestedScrollConnection {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ EnterAlwaysSearchBarScrollBehavior f9922z;

    public long c2(long j2, long j3, int i2) {
        if (!((Boolean) this.f9922z.d().invoke()).booleanValue()) {
            return Offset.f15855b.c();
        }
        if (this.f9922z.e()) {
            int i3 = (int) (j3 & 4294967295L);
            if (Float.intBitsToFloat(i3) > 0.0f) {
                EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior = this.f9922z;
                enterAlwaysSearchBarScrollBehavior.h(enterAlwaysSearchBarScrollBehavior.f() + Float.intBitsToFloat(i3));
                return Offset.g(j3, 0.0f, 0.0f, 2, (Object) null);
            }
        }
        if (!this.f9922z.e()) {
            EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior2 = this.f9922z;
            enterAlwaysSearchBarScrollBehavior2.h(enterAlwaysSearchBarScrollBehavior2.f() + Float.intBitsToFloat((int) (j2 & 4294967295L)));
        }
        return Offset.f15855b.c();
    }

    public Object q0(long j2, long j3, Continuation continuation) {
        return !((Boolean) this.f9922z.d().invoke()).booleanValue() ? Velocity.b(Velocity.f19186b.a()) : this.f9922z.i(Velocity.i(j3), continuation);
    }

    public long t1(long j2, int i2) {
        if (!((Boolean) this.f9922z.d().invoke()).booleanValue()) {
            return Offset.f15855b.c();
        }
        float f2 = this.f9922z.f();
        EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior = this.f9922z;
        enterAlwaysSearchBarScrollBehavior.h(enterAlwaysSearchBarScrollBehavior.f() + Float.intBitsToFloat((int) (4294967295L & j2)));
        return (this.f9922z.e() || f2 == this.f9922z.f()) ? Offset.f15855b.c() : Offset.g(j2, 0.0f, 0.0f, 2, (Object) null);
    }
}
