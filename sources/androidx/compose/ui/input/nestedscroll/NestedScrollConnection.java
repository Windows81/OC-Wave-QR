package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata
public interface NestedScrollConnection {

    @Metadata
    public static final class DefaultImpls {
    }

    Object H1(long j2, Continuation continuation) {
        return Velocity.b(Velocity.f19186b.a());
    }

    long c2(long j2, long j3, int i2) {
        return Offset.f15855b.c();
    }

    Object q0(long j2, long j3, Continuation continuation) {
        return Velocity.b(Velocity.f19186b.a());
    }

    long t1(long j2, int i2) {
        return Offset.f15855b.c();
    }
}
